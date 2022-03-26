package androidx.fragment.app;

import android.app.Activity;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.lifecycle.h0;
import androidx.lifecycle.i;
import com.example.helloworld.R;
import f0.c1;

/* JADX WARN: Classes with same name are omitted:
  
 */
/* loaded from: classes.dex */
public class w1 {

    /* renamed from: a  reason: collision with root package name */
    public final v0 f959a;

    /* renamed from: b  reason: collision with root package name */
    public final x1 f960b;

    /* renamed from: c  reason: collision with root package name */
    public final f0 f961c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f962d = false;

    /* renamed from: e  reason: collision with root package name */
    public int f963e = -1;

    public w1(v0 dispatcher, x1 fragmentStore, f0 fragment) {
        this.f959a = dispatcher;
        this.f960b = fragmentStore;
        this.f961c = fragment;
    }

    public w1(v0 dispatcher, x1 fragmentStore, ClassLoader classLoader, q0 fragmentFactory, u1 fs) {
        this.f959a = dispatcher;
        this.f960b = fragmentStore;
        f0 a2 = fragmentFactory.a(classLoader, fs.f929b);
        this.f961c = a2;
        Bundle bundle = fs.f938k;
        if (bundle != null) {
            bundle.setClassLoader(classLoader);
        }
        a2.h1(fs.f938k);
        a2.f764g = fs.f930c;
        a2.f772o = fs.f931d;
        a2.f774q = true;
        a2.f781x = fs.f932e;
        a2.f782y = fs.f933f;
        a2.f783z = fs.f934g;
        a2.C = fs.f935h;
        a2.f771n = fs.f936i;
        a2.B = fs.f937j;
        a2.A = fs.f939l;
        a2.O = i.values()[fs.f940m];
        Bundle bundle2 = fs.f941n;
        if (bundle2 != null) {
            a2.f760c = bundle2;
        } else {
            a2.f760c = new Bundle();
        }
        if (m1.v0(2)) {
            Log.v("FragmentManager", "Instantiated fragment " + a2);
        }
    }

    public w1(v0 dispatcher, x1 fragmentStore, f0 retainedFragment, u1 fs) {
        this.f959a = dispatcher;
        this.f960b = fragmentStore;
        this.f961c = retainedFragment;
        retainedFragment.f761d = null;
        retainedFragment.f762e = null;
        retainedFragment.f776s = 0;
        retainedFragment.f773p = false;
        retainedFragment.f770m = false;
        f0 f0Var = retainedFragment.f766i;
        retainedFragment.f767j = f0Var != null ? f0Var.f764g : null;
        retainedFragment.f766i = null;
        Bundle bundle = fs.f941n;
        if (bundle != null) {
            retainedFragment.f760c = bundle;
        } else {
            retainedFragment.f760c = new Bundle();
        }
    }

    public f0 k() {
        return this.f961c;
    }

    public void t(int state) {
        this.f963e = state;
    }

    public int d() {
        f0 f0Var = this.f961c;
        if (f0Var.f777t == null) {
            return f0Var.f759b;
        }
        int maxState = this.f963e;
        switch (f0Var.O.ordinal()) {
            case 1:
                maxState = Math.min(maxState, 0);
                break;
            case 2:
                maxState = Math.min(maxState, 1);
                break;
            case 3:
                maxState = Math.min(maxState, 5);
                break;
            case 4:
                break;
            default:
                maxState = Math.min(maxState, -1);
                break;
        }
        f0 f0Var2 = this.f961c;
        if (f0Var2.f772o) {
            if (f0Var2.f773p) {
                maxState = Math.max(this.f963e, 2);
                View view = this.f961c.H;
                if (view != null && view.getParent() == null) {
                    maxState = Math.min(maxState, 2);
                }
            } else {
                maxState = this.f963e < 4 ? Math.min(maxState, f0Var2.f759b) : Math.min(maxState, 1);
            }
        }
        if (!this.f961c.f770m) {
            maxState = Math.min(maxState, 1);
        }
        q2 awaitingEffect = null;
        f0 f0Var3 = this.f961c;
        ViewGroup viewGroup = f0Var3.G;
        if (viewGroup != null) {
            t2 controller = t2.n(viewGroup, f0Var3.B());
            awaitingEffect = controller.l(this);
        }
        if (awaitingEffect == q2.ADDING) {
            maxState = Math.min(maxState, 6);
        } else if (awaitingEffect == q2.REMOVING) {
            maxState = Math.max(maxState, 3);
        } else {
            f0 f0Var4 = this.f961c;
            if (f0Var4.f771n) {
                if (f0Var4.U()) {
                    maxState = Math.min(maxState, 1);
                } else {
                    maxState = Math.min(maxState, -1);
                }
            }
        }
        f0 f0Var5 = this.f961c;
        if (f0Var5.I && f0Var5.f759b < 5) {
            maxState = Math.min(maxState, 4);
        }
        if (m1.v0(2)) {
            Log.v("FragmentManager", "computeExpectedState() of " + maxState + " for " + this.f961c);
        }
        return maxState;
    }

    public void m() {
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        ViewGroup viewGroup3;
        if (!this.f962d) {
            try {
                this.f962d = true;
                while (true) {
                    int newState = d();
                    f0 f0Var = this.f961c;
                    int i2 = f0Var.f759b;
                    if (newState != i2) {
                        if (newState <= i2) {
                            int nextStep = i2 - 1;
                            switch (nextStep) {
                                case -1:
                                    i();
                                    break;
                                case 0:
                                    g();
                                    break;
                                case 1:
                                    h();
                                    this.f961c.f759b = 1;
                                    break;
                                case 2:
                                    f0Var.f773p = false;
                                    f0Var.f759b = 2;
                                    break;
                                case 3:
                                    if (m1.v0(3)) {
                                        Log.d("FragmentManager", "movefrom ACTIVITY_CREATED: " + this.f961c);
                                    }
                                    f0 f0Var2 = this.f961c;
                                    if (f0Var2.H != null && f0Var2.f761d == null) {
                                        s();
                                    }
                                    f0 f0Var3 = this.f961c;
                                    if (!(f0Var3.H == null || (viewGroup3 = f0Var3.G) == null)) {
                                        t2.n(viewGroup3, f0Var3.B()).d(this);
                                    }
                                    this.f961c.f759b = 3;
                                    break;
                                case 4:
                                    v();
                                    break;
                                case 5:
                                    f0Var.f759b = 5;
                                    break;
                                case 6:
                                    n();
                                    break;
                            }
                        } else {
                            int nextStep2 = i2 + 1;
                            switch (nextStep2) {
                                case 0:
                                    c();
                                    break;
                                case 1:
                                    e();
                                    break;
                                case 2:
                                    j();
                                    f();
                                    break;
                                case 3:
                                    a();
                                    break;
                                case 4:
                                    if (!(f0Var.H == null || (viewGroup2 = f0Var.G) == null)) {
                                        t2 controller = t2.n(viewGroup2, f0Var.B());
                                        int visibility = this.f961c.H.getVisibility();
                                        r2 finalState = r2.b(visibility);
                                        controller.b(finalState, this);
                                    }
                                    this.f961c.f759b = 4;
                                    break;
                                case 5:
                                    u();
                                    break;
                                case 6:
                                    f0Var.f759b = 6;
                                    break;
                                case 7:
                                    p();
                                    break;
                            }
                        }
                    } else {
                        if (f0Var.L) {
                            if (!(f0Var.H == null || (viewGroup = f0Var.G) == null)) {
                                t2 controller2 = t2.n(viewGroup, f0Var.B());
                                if (this.f961c.A) {
                                    controller2.c(this);
                                } else {
                                    controller2.e(this);
                                }
                            }
                            f0 f0Var4 = this.f961c;
                            m1 m1Var = f0Var4.f777t;
                            if (m1Var != null) {
                                m1Var.t0(f0Var4);
                            }
                            f0 f0Var5 = this.f961c;
                            f0Var5.L = false;
                            f0Var5.o0(f0Var5.A);
                        }
                        return;
                    }
                }
            } finally {
                this.f962d = false;
            }
        } else if (m1.v0(2)) {
            Log.v("FragmentManager", "Ignoring re-entrant call to moveToExpectedState() for " + k());
        }
    }

    public void j() {
        f0 f0Var = this.f961c;
        if (f0Var.f772o && f0Var.f773p && !f0Var.f775r) {
            if (m1.v0(3)) {
                Log.d("FragmentManager", "moveto CREATE_VIEW: " + this.f961c);
            }
            f0 f0Var2 = this.f961c;
            f0Var2.I0(f0Var2.M0(f0Var2.f760c), null, this.f961c.f760c);
            View view = this.f961c.H;
            if (view != null) {
                view.setSaveFromParentEnabled(false);
                f0 f0Var3 = this.f961c;
                f0Var3.H.setTag(R.id.fragment_container_view_tag, f0Var3);
                f0 f0Var4 = this.f961c;
                if (f0Var4.A) {
                    f0Var4.H.setVisibility(8);
                }
                this.f961c.Z0();
                v0 v0Var = this.f959a;
                f0 f0Var5 = this.f961c;
                v0Var.m(f0Var5, f0Var5.H, f0Var5.f760c, false);
                this.f961c.f759b = 2;
            }
        }
    }

    public void o(ClassLoader classLoader) {
        Bundle bundle = this.f961c.f760c;
        if (bundle != null) {
            bundle.setClassLoader(classLoader);
            f0 f0Var = this.f961c;
            f0Var.f761d = f0Var.f760c.getSparseParcelableArray("android:view_state");
            f0 f0Var2 = this.f961c;
            f0Var2.f762e = f0Var2.f760c.getBundle("android:view_registry_state");
            f0 f0Var3 = this.f961c;
            f0Var3.f767j = f0Var3.f760c.getString("android:target_state");
            f0 f0Var4 = this.f961c;
            if (f0Var4.f767j != null) {
                f0Var4.f768k = f0Var4.f760c.getInt("android:target_req_state", 0);
            }
            f0 f0Var5 = this.f961c;
            Boolean bool = f0Var5.f763f;
            if (bool != null) {
                f0Var5.J = bool.booleanValue();
                this.f961c.f763f = null;
            } else {
                f0Var5.J = f0Var5.f760c.getBoolean("android:user_visible_hint", true);
            }
            f0 f0Var6 = this.f961c;
            if (!f0Var6.J) {
                f0Var6.I = true;
            }
        }
    }

    public void c() {
        w1 targetFragmentStateManager;
        if (m1.v0(3)) {
            Log.d("FragmentManager", "moveto ATTACHED: " + this.f961c);
        }
        f0 f0Var = this.f961c;
        f0 f0Var2 = f0Var.f766i;
        if (f0Var2 != null) {
            targetFragmentStateManager = this.f960b.m(f0Var2.f764g);
            if (targetFragmentStateManager != null) {
                f0 f0Var3 = this.f961c;
                f0Var3.f767j = f0Var3.f766i.f764g;
                f0Var3.f766i = null;
            } else {
                throw new IllegalStateException("Fragment " + this.f961c + " declared target fragment " + this.f961c.f766i + " that does not belong to this FragmentManager!");
            }
        } else {
            String str = f0Var.f767j;
            if (str != null) {
                targetFragmentStateManager = this.f960b.m(str);
                if (targetFragmentStateManager == null) {
                    throw new IllegalStateException("Fragment " + this.f961c + " declared target fragment " + this.f961c.f767j + " that does not belong to this FragmentManager!");
                }
            } else {
                targetFragmentStateManager = null;
            }
        }
        if (targetFragmentStateManager != null) {
            targetFragmentStateManager.m();
        }
        f0 f0Var4 = this.f961c;
        f0Var4.f778u = f0Var4.f777t.j0();
        f0 f0Var5 = this.f961c;
        f0Var5.f780w = f0Var5.f777t.m0();
        this.f959a.g(this.f961c, false);
        this.f961c.D0();
        this.f959a.b(this.f961c, false);
    }

    public void e() {
        if (m1.v0(3)) {
            Log.d("FragmentManager", "moveto CREATED: " + this.f961c);
        }
        f0 f0Var = this.f961c;
        if (!f0Var.N) {
            this.f959a.h(f0Var, f0Var.f760c, false);
            f0 f0Var2 = this.f961c;
            f0Var2.G0(f0Var2.f760c);
            v0 v0Var = this.f959a;
            f0 f0Var3 = this.f961c;
            v0Var.c(f0Var3, f0Var3.f760c, false);
            return;
        }
        f0Var.d1(f0Var.f760c);
        this.f961c.f759b = 1;
    }

    public void f() {
        String resName;
        if (!this.f961c.f772o) {
            if (m1.v0(3)) {
                Log.d("FragmentManager", "moveto CREATE_VIEW: " + this.f961c);
            }
            f0 f0Var = this.f961c;
            LayoutInflater layoutInflater = f0Var.M0(f0Var.f760c);
            ViewGroup container = null;
            f0 f0Var2 = this.f961c;
            if (f0Var2.G != null) {
                container = f0Var2.G;
            } else {
                int i2 = f0Var2.f782y;
                if (i2 != 0) {
                    if (i2 != -1) {
                        n0 fragmentContainer = f0Var2.f777t.f0();
                        container = (ViewGroup) fragmentContainer.h(this.f961c.f782y);
                        if (container == null) {
                            f0 f0Var3 = this.f961c;
                            if (!f0Var3.f774q) {
                                try {
                                    resName = f0Var3.H().getResourceName(this.f961c.f782y);
                                } catch (Resources.NotFoundException e2) {
                                    resName = "unknown";
                                }
                                throw new IllegalArgumentException("No view found for id 0x" + Integer.toHexString(this.f961c.f782y) + " (" + resName + ") for fragment " + this.f961c);
                            }
                        }
                    } else {
                        throw new IllegalArgumentException("Cannot create fragment " + this.f961c + " for a container view with no id");
                    }
                }
            }
            f0 f0Var4 = this.f961c;
            f0Var4.G = container;
            f0Var4.I0(layoutInflater, container, f0Var4.f760c);
            View view = this.f961c.H;
            if (view != null) {
                view.setSaveFromParentEnabled(false);
                f0 f0Var5 = this.f961c;
                f0Var5.H.setTag(R.id.fragment_container_view_tag, f0Var5);
                if (container != null) {
                    b();
                }
                f0 f0Var6 = this.f961c;
                if (f0Var6.A) {
                    f0Var6.H.setVisibility(8);
                }
                if (c1.O(this.f961c.H)) {
                    c1.i0(this.f961c.H);
                } else {
                    View fragmentView = this.f961c.H;
                    fragmentView.addOnAttachStateChangeListener(new v1(this, fragmentView));
                }
                this.f961c.Z0();
                v0 v0Var = this.f959a;
                f0 f0Var7 = this.f961c;
                v0Var.m(f0Var7, f0Var7.H, f0Var7.f760c, false);
                int postOnViewCreatedVisibility = this.f961c.H.getVisibility();
                float postOnViewCreatedAlpha = this.f961c.H.getAlpha();
                this.f961c.l1(postOnViewCreatedAlpha);
                f0 f0Var8 = this.f961c;
                if (f0Var8.G != null && postOnViewCreatedVisibility == 0) {
                    View focusedView = f0Var8.H.findFocus();
                    if (focusedView != null) {
                        this.f961c.i1(focusedView);
                        if (m1.v0(2)) {
                            Log.v("FragmentManager", "requestFocus: Saved focused view " + focusedView + " for Fragment " + this.f961c);
                        }
                    }
                    this.f961c.H.setAlpha(0.0f);
                }
            }
            this.f961c.f759b = 2;
        }
    }

    public void a() {
        if (m1.v0(3)) {
            Log.d("FragmentManager", "moveto ACTIVITY_CREATED: " + this.f961c);
        }
        f0 f0Var = this.f961c;
        f0Var.C0(f0Var.f760c);
        v0 v0Var = this.f959a;
        f0 f0Var2 = this.f961c;
        v0Var.a(f0Var2, f0Var2.f760c, false);
    }

    public void u() {
        if (m1.v0(3)) {
            Log.d("FragmentManager", "moveto STARTED: " + this.f961c);
        }
        this.f961c.X0();
        this.f959a.k(this.f961c, false);
    }

    public void p() {
        if (m1.v0(3)) {
            Log.d("FragmentManager", "moveto RESUMED: " + this.f961c);
        }
        View focusedView = this.f961c.w();
        if (focusedView != null && l(focusedView)) {
            boolean success = focusedView.requestFocus();
            if (m1.v0(2)) {
                StringBuilder sb = new StringBuilder();
                sb.append("requestFocus: Restoring focused view ");
                sb.append(focusedView);
                sb.append(" ");
                sb.append(success ? "succeeded" : "failed");
                sb.append(" on Fragment ");
                sb.append(this.f961c);
                sb.append(" resulting in focused view ");
                sb.append(this.f961c.H.findFocus());
                Log.v("FragmentManager", sb.toString());
            }
        }
        this.f961c.i1(null);
        this.f961c.V0();
        this.f959a.i(this.f961c, false);
        f0 f0Var = this.f961c;
        f0Var.f760c = null;
        f0Var.f761d = null;
        f0Var.f762e = null;
    }

    public final boolean l(View view) {
        if (view == this.f961c.H) {
            return true;
        }
        for (ViewParent parent = view.getParent(); parent != null; parent = parent.getParent()) {
            if (parent == this.f961c.H) {
                return true;
            }
        }
        return false;
    }

    public void n() {
        if (m1.v0(3)) {
            Log.d("FragmentManager", "movefrom RESUMED: " + this.f961c);
        }
        this.f961c.R0();
        this.f959a.f(this.f961c, false);
    }

    public void v() {
        if (m1.v0(3)) {
            Log.d("FragmentManager", "movefrom STARTED: " + this.f961c);
        }
        this.f961c.Y0();
        this.f959a.l(this.f961c, false);
    }

    public u1 r() {
        u1 fs = new u1(this.f961c);
        f0 f0Var = this.f961c;
        if (f0Var.f759b <= -1 || fs.f941n != null) {
            fs.f941n = f0Var.f760c;
        } else {
            Bundle q2 = q();
            fs.f941n = q2;
            if (this.f961c.f767j != null) {
                if (q2 == null) {
                    fs.f941n = new Bundle();
                }
                fs.f941n.putString("android:target_state", this.f961c.f767j);
                int i2 = this.f961c.f768k;
                if (i2 != 0) {
                    fs.f941n.putInt("android:target_req_state", i2);
                }
            }
        }
        return fs;
    }

    public final Bundle q() {
        Bundle result = new Bundle();
        this.f961c.W0(result);
        this.f959a.j(this.f961c, result, false);
        if (result.isEmpty()) {
            result = null;
        }
        if (this.f961c.H != null) {
            s();
        }
        if (this.f961c.f761d != null) {
            if (result == null) {
                result = new Bundle();
            }
            result.putSparseParcelableArray("android:view_state", this.f961c.f761d);
        }
        if (this.f961c.f762e != null) {
            if (result == null) {
                result = new Bundle();
            }
            result.putBundle("android:view_registry_state", this.f961c.f762e);
        }
        if (!this.f961c.J) {
            if (result == null) {
                result = new Bundle();
            }
            result.putBoolean("android:user_visible_hint", this.f961c.J);
        }
        return result;
    }

    public void s() {
        if (this.f961c.H != null) {
            SparseArray<Parcelable> mStateArray = new SparseArray<>();
            this.f961c.H.saveHierarchyState(mStateArray);
            if (mStateArray.size() > 0) {
                this.f961c.f761d = mStateArray;
            }
            Bundle outBundle = new Bundle();
            this.f961c.Q.i(outBundle);
            if (!outBundle.isEmpty()) {
                this.f961c.f762e = outBundle;
            }
        }
    }

    public void h() {
        View view;
        if (m1.v0(3)) {
            Log.d("FragmentManager", "movefrom CREATE_VIEW: " + this.f961c);
        }
        f0 f0Var = this.f961c;
        ViewGroup viewGroup = f0Var.G;
        if (!(viewGroup == null || (view = f0Var.H) == null)) {
            viewGroup.removeView(view);
        }
        this.f961c.K0();
        this.f959a.n(this.f961c, false);
        f0 f0Var2 = this.f961c;
        f0Var2.G = null;
        f0Var2.H = null;
        f0Var2.Q = null;
        f0Var2.R.i(null);
        this.f961c.f773p = false;
    }

    /* JADX WARN: Generic types in debug info not equals: androidx.fragment.app.r0 != androidx.fragment.app.FragmentHostCallback<?> */
    public void g() {
        f0 target;
        boolean shouldClear;
        if (m1.v0(3)) {
            Log.d("FragmentManager", "movefrom CREATED: " + this.f961c);
        }
        f0 f0Var = this.f961c;
        boolean beingRemoved = f0Var.f771n && !f0Var.U();
        boolean shouldDestroy = beingRemoved || this.f960b.o().o(this.f961c);
        if (shouldDestroy) {
            r0 r0Var = this.f961c.f778u;
            if (r0Var instanceof h0) {
                shouldClear = this.f960b.o().l();
            } else if (r0Var.k() instanceof Activity) {
                Activity activity = (Activity) r0Var.k();
                shouldClear = true ^ activity.isChangingConfigurations();
            } else {
                shouldClear = true;
            }
            if (beingRemoved || shouldClear) {
                this.f960b.o().f(this.f961c);
            }
            this.f961c.J0();
            this.f959a.d(this.f961c, false);
            for (w1 fragmentStateManager : this.f960b.k()) {
                if (fragmentStateManager != null) {
                    f0 fragment = fragmentStateManager.k();
                    if (this.f961c.f764g.equals(fragment.f767j)) {
                        fragment.f766i = this.f961c;
                        fragment.f767j = null;
                    }
                }
            }
            f0 f0Var2 = this.f961c;
            String str = f0Var2.f767j;
            if (str != null) {
                f0Var2.f766i = this.f960b.f(str);
            }
            this.f960b.q(this);
            return;
        }
        String str2 = this.f961c.f767j;
        if (!(str2 == null || (target = this.f960b.f(str2)) == null || !target.C)) {
            this.f961c.f766i = target;
        }
        this.f961c.f759b = 0;
    }

    public void i() {
        if (m1.v0(3)) {
            Log.d("FragmentManager", "movefrom ATTACHED: " + this.f961c);
        }
        this.f961c.L0();
        boolean beingRemoved = false;
        this.f959a.e(this.f961c, false);
        f0 f0Var = this.f961c;
        f0Var.f759b = -1;
        f0Var.f778u = null;
        f0Var.f780w = null;
        f0Var.f777t = null;
        if (f0Var.f771n && !f0Var.U()) {
            beingRemoved = true;
        }
        if (beingRemoved || this.f960b.o().o(this.f961c)) {
            if (m1.v0(3)) {
                Log.d("FragmentManager", "initState called for fragment: " + this.f961c);
            }
            this.f961c.S();
        }
    }

    public void b() {
        int index = this.f960b.j(this.f961c);
        f0 f0Var = this.f961c;
        f0Var.G.addView(f0Var.H, index);
    }
}
