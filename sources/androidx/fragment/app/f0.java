package androidx.fragment.app;

import android.animation.Animator;
import android.app.Activity;
import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Looper;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import androidx.lifecycle.g0;
import androidx.lifecycle.h;
import androidx.lifecycle.h0;
import androidx.lifecycle.i;
import androidx.lifecycle.i0;
import androidx.lifecycle.j;
import androidx.lifecycle.j0;
import androidx.lifecycle.k;
import androidx.lifecycle.m;
import androidx.lifecycle.o;
import androidx.lifecycle.t;
import androidx.lifecycle.v;
import androidx.savedstate.d;
import androidx.savedstate.e;
import androidx.savedstate.f;
import androidx.savedstate.g;
import f0.r;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Objects;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicInteger;
import o0.a;

/* JADX WARN: Classes with same name are omitted:
  
 */
/* loaded from: classes.dex */
public abstract class f0 implements ComponentCallbacks, View.OnCreateContextMenuListener, m, h0, f {
    public static final Object U = new Object();
    public boolean A;
    public boolean B;
    public boolean C;
    public boolean D;
    public boolean F;
    public ViewGroup G;
    public View H;
    public boolean I;
    public b0 K;
    public boolean L;
    public LayoutInflater M;
    public boolean N;
    public o P;
    public k2 Q;
    public e S;

    /* renamed from: c  reason: collision with root package name */
    public Bundle f760c;

    /* renamed from: d  reason: collision with root package name */
    public SparseArray f761d;

    /* renamed from: e  reason: collision with root package name */
    public Bundle f762e;

    /* renamed from: f  reason: collision with root package name */
    public Boolean f763f;

    /* renamed from: h  reason: collision with root package name */
    public Bundle f765h;

    /* renamed from: i  reason: collision with root package name */
    public f0 f766i;

    /* renamed from: k  reason: collision with root package name */
    public int f768k;

    /* renamed from: m  reason: collision with root package name */
    public boolean f770m;

    /* renamed from: n  reason: collision with root package name */
    public boolean f771n;

    /* renamed from: o  reason: collision with root package name */
    public boolean f772o;

    /* renamed from: p  reason: collision with root package name */
    public boolean f773p;

    /* renamed from: q  reason: collision with root package name */
    public boolean f774q;

    /* renamed from: r  reason: collision with root package name */
    public boolean f775r;

    /* renamed from: s  reason: collision with root package name */
    public int f776s;

    /* renamed from: t  reason: collision with root package name */
    public m1 f777t;

    /* renamed from: u  reason: collision with root package name */
    public r0 f778u;

    /* renamed from: w  reason: collision with root package name */
    public f0 f780w;

    /* renamed from: x  reason: collision with root package name */
    public int f781x;

    /* renamed from: y  reason: collision with root package name */
    public int f782y;

    /* renamed from: z  reason: collision with root package name */
    public String f783z;

    /* renamed from: b  reason: collision with root package name */
    public int f759b = -1;

    /* renamed from: g  reason: collision with root package name */
    public String f764g = UUID.randomUUID().toString();

    /* renamed from: j  reason: collision with root package name */
    public String f767j = null;

    /* renamed from: l  reason: collision with root package name */
    public Boolean f769l = null;

    /* renamed from: v  reason: collision with root package name */
    public m1 f779v = new n1();
    public boolean E = true;
    public boolean J = true;
    public i O = i.RESUMED;
    public v R = new v();
    public final ArrayList T = new ArrayList();

    @Override // androidx.lifecycle.m
    public j g() {
        return this.P;
    }

    public t Q() {
        return this.R;
    }

    @Override // androidx.lifecycle.h0
    public g0 d() {
        if (this.f777t == null) {
            throw new IllegalStateException("Can't access ViewModels from detached fragment");
        } else if (z() != i.INITIALIZED.ordinal()) {
            return this.f777t.q0(this);
        } else {
            throw new IllegalStateException("Calling getViewModelStore() before a Fragment reaches onCreate() when using setMaxLifecycle(INITIALIZED) is not supported");
        }
    }

    public final int z() {
        i iVar = this.O;
        if (iVar == i.INITIALIZED || this.f780w == null) {
            return iVar.ordinal();
        }
        return Math.min(iVar.ordinal(), this.f780w.z());
    }

    @Override // androidx.savedstate.f
    public final d b() {
        return this.S.b();
    }

    public f0() {
        new x(this);
        new AtomicInteger();
        R();
    }

    public final void R() {
        this.P = new o(this);
        this.S = e.a(this);
    }

    public static f0 T(Context context, String fname, Bundle args) {
        try {
            Class<? extends Fragment> clazz = q0.d(context.getClassLoader(), fname);
            f0 f2 = (f0) clazz.getConstructor(new Class[0]).newInstance(new Object[0]);
            if (args != null) {
                args.setClassLoader(f2.getClass().getClassLoader());
                f2.h1(args);
            }
            return f2;
        } catch (IllegalAccessException e2) {
            throw new c0("Unable to instantiate fragment " + fname + ": make sure class name exists, is public, and has an empty constructor that is public", e2);
        } catch (InstantiationException e3) {
            throw new c0("Unable to instantiate fragment " + fname + ": make sure class name exists, is public, and has an empty constructor that is public", e3);
        } catch (NoSuchMethodException e4) {
            throw new c0("Unable to instantiate fragment " + fname + ": could not find Fragment constructor", e4);
        } catch (InvocationTargetException e5) {
            throw new c0("Unable to instantiate fragment " + fname + ": calling Fragment constructor caused an exception", e5);
        }
    }

    public final void f1(Bundle savedInstanceState) {
        SparseArray<Parcelable> sparseArray = this.f761d;
        if (sparseArray != null) {
            this.H.restoreHierarchyState(sparseArray);
            this.f761d = null;
        }
        if (this.H != null) {
            this.Q.h(this.f762e);
            this.f762e = null;
        }
        this.F = false;
        B0(savedInstanceState);
        if (!this.F) {
            throw new v2("Fragment " + this + " did not call through to super.onViewStateRestored()");
        } else if (this.H != null) {
            this.Q.c(h.ON_CREATE);
        }
    }

    public final boolean U() {
        return this.f776s > 0;
    }

    public final boolean equals(Object o2) {
        return super.equals(o2);
    }

    public final int hashCode() {
        return super.hashCode();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(128);
        Class<?> cls = getClass();
        sb.append(cls.getSimpleName());
        sb.append("{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("}");
        sb.append(" (");
        sb.append(this.f764g);
        if (this.f781x != 0) {
            sb.append(" id=0x");
            sb.append(Integer.toHexString(this.f781x));
        }
        if (this.f783z != null) {
            sb.append(" tag=");
            sb.append(this.f783z);
        }
        sb.append(")");
        return sb.toString();
    }

    public void h1(Bundle args) {
        if (this.f777t == null || !X()) {
            this.f765h = args;
            return;
        }
        throw new IllegalStateException("Fragment already added and state has been saved");
    }

    public final Bundle n() {
        return this.f765h;
    }

    public final boolean X() {
        m1 m1Var = this.f777t;
        if (m1Var == null) {
            return false;
        }
        return m1Var.A0();
    }

    public final f0 O() {
        String str;
        f0 f0Var = this.f766i;
        if (f0Var != null) {
            return f0Var;
        }
        m1 m1Var = this.f777t;
        if (m1Var == null || (str = this.f767j) == null) {
            return null;
        }
        return m1Var.X(str);
    }

    public Context p() {
        r0 r0Var = this.f778u;
        if (r0Var == null) {
            return null;
        }
        return r0Var.k();
    }

    public final Context b1() {
        Context context = p();
        if (context != null) {
            return context;
        }
        throw new IllegalStateException("Fragment " + this + " not attached to a context.");
    }

    public final j0 j() {
        r0 r0Var = this.f778u;
        if (r0Var == null) {
            return null;
        }
        return (j0) r0Var.j();
    }

    public final j0 a1() {
        j0 activity = j();
        if (activity != null) {
            return activity;
        }
        throw new IllegalStateException("Fragment " + this + " not attached to an activity.");
    }

    public final Object x() {
        r0 r0Var = this.f778u;
        if (r0Var == null) {
            return null;
        }
        return r0Var.m();
    }

    public final Resources H() {
        return b1().getResources();
    }

    public final String N(int resId) {
        return H().getString(resId);
    }

    public final m1 B() {
        m1 fragmentManager = this.f777t;
        if (fragmentManager != null) {
            return fragmentManager;
        }
        throw new IllegalStateException("Fragment " + this + " not associated with a fragment manager.");
    }

    public final m1 o() {
        if (this.f778u != null) {
            return this.f779v;
        }
        throw new IllegalStateException("Fragment " + this + " has not been attached yet.");
    }

    public final boolean V() {
        m1 m1Var;
        return this.E && ((m1Var = this.f777t) == null || m1Var.x0(this.f780w));
    }

    public void o0(boolean hidden) {
    }

    public void a0(int requestCode, int resultCode, Intent data) {
        if (m1.v0(2)) {
            Log.v("FragmentManager", "Fragment " + this + " received the following in onActivityResult(): requestCode: " + requestCode + " resultCode: " + resultCode + " data: " + data);
        }
    }

    public void v0(int requestCode, String[] permissions, int[] grantResults) {
    }

    public LayoutInflater n0(Bundle savedInstanceState) {
        return y(savedInstanceState);
    }

    public LayoutInflater M0(Bundle savedInstanceState) {
        LayoutInflater n02 = n0(savedInstanceState);
        this.M = n02;
        return n02;
    }

    public LayoutInflater y(Bundle savedFragmentState) {
        r0 r0Var = this.f778u;
        if (r0Var != null) {
            LayoutInflater result = r0Var.n();
            r.a(result, this.f779v.k0());
            return result;
        }
        throw new IllegalStateException("onGetLayoutInflater() cannot be executed until the Fragment is attached to the FragmentManager.");
    }

    public void q0(Context context, AttributeSet attrs, Bundle savedInstanceState) {
        this.F = true;
        r0 r0Var = this.f778u;
        Activity hostActivity = r0Var == null ? null : r0Var.j();
        if (hostActivity != null) {
            this.F = false;
            p0(hostActivity, attrs, savedInstanceState);
        }
    }

    public void p0(Activity activity, AttributeSet attrs, Bundle savedInstanceState) {
        this.F = true;
    }

    public void d0(f0 childFragment) {
    }

    public void c0(Context context) {
        this.F = true;
        r0 r0Var = this.f778u;
        Activity hostActivity = r0Var == null ? null : r0Var.j();
        if (hostActivity != null) {
            this.F = false;
            b0(hostActivity);
        }
    }

    public void b0(Activity activity) {
        this.F = true;
    }

    public Animation g0(int transit, boolean enter, int nextAnim) {
        return null;
    }

    public Animator h0(int transit, boolean enter, int nextAnim) {
        return null;
    }

    public void f0(Bundle savedInstanceState) {
        this.F = true;
        d1(savedInstanceState);
        if (!this.f779v.z0(1)) {
            this.f779v.u();
        }
    }

    public void d1(Bundle savedInstanceState) {
        Parcelable p2;
        if (savedInstanceState != null && (p2 = savedInstanceState.getParcelable("android:support:fragments")) != null) {
            this.f779v.M0(p2);
            this.f779v.u();
        }
    }

    public View i0(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return null;
    }

    public void A0(View view, Bundle savedInstanceState) {
    }

    public View P() {
        return this.H;
    }

    public final View c1() {
        View view = P();
        if (view != null) {
            return view;
        }
        throw new IllegalStateException("Fragment " + this + " did not return a View from onCreateView() or this was called before onCreateView().");
    }

    public void Z(Bundle savedInstanceState) {
        this.F = true;
    }

    public void B0(Bundle savedInstanceState) {
        this.F = true;
    }

    public void y0() {
        this.F = true;
    }

    public void w0() {
        this.F = true;
    }

    public void x0(Bundle outState) {
    }

    public void r0(boolean isInMultiWindowMode) {
    }

    public void t0(boolean isInPictureInPictureMode) {
    }

    @Override // android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration newConfig) {
        this.F = true;
    }

    public void u0(boolean isPrimaryNavigationFragment) {
    }

    public void s0() {
        this.F = true;
    }

    public void z0() {
        this.F = true;
    }

    @Override // android.content.ComponentCallbacks
    public void onLowMemory() {
        this.F = true;
    }

    public void l0() {
        this.F = true;
    }

    public void j0() {
        this.F = true;
    }

    public void S() {
        R();
        this.f764g = UUID.randomUUID().toString();
        this.f770m = false;
        this.f771n = false;
        this.f772o = false;
        this.f773p = false;
        this.f774q = false;
        this.f776s = 0;
        this.f777t = null;
        this.f779v = new n1();
        this.f778u = null;
        this.f781x = 0;
        this.f782y = 0;
        this.f783z = null;
        this.A = false;
        this.B = false;
    }

    public void m0() {
        this.F = true;
    }

    public void k0() {
    }

    @Override // android.view.View.OnCreateContextMenuListener
    public void onCreateContextMenu(ContextMenu menu, View v2, ContextMenu.ContextMenuInfo menuInfo) {
        a1().onCreateContextMenu(menu, v2, menuInfo);
    }

    public boolean e0(MenuItem item) {
        return false;
    }

    public Object r() {
        b0 b0Var = this.K;
        if (b0Var == null) {
            return null;
        }
        Objects.requireNonNull(b0Var);
        return null;
    }

    public Object I() {
        b0 b0Var = this.K;
        if (b0Var == null) {
            return null;
        }
        Object obj = b0Var.f711k;
        if (obj != U) {
            return obj;
        }
        r();
        return null;
    }

    public Object u() {
        b0 b0Var = this.K;
        if (b0Var == null) {
            return null;
        }
        Objects.requireNonNull(b0Var);
        return null;
    }

    public Object G() {
        b0 b0Var = this.K;
        if (b0Var == null) {
            return null;
        }
        Object obj = b0Var.f713m;
        if (obj != U) {
            return obj;
        }
        u();
        return null;
    }

    public Object J() {
        b0 b0Var = this.K;
        if (b0Var == null) {
            return null;
        }
        Objects.requireNonNull(b0Var);
        return null;
    }

    public Object K() {
        b0 b0Var = this.K;
        if (b0Var == null) {
            return null;
        }
        Object obj = b0Var.f715o;
        if (obj != U) {
            return obj;
        }
        J();
        return null;
    }

    public boolean k() {
        b0 b0Var = this.K;
        if (b0Var == null) {
            return true;
        }
        Objects.requireNonNull(b0Var);
        return true;
    }

    public boolean l() {
        b0 b0Var = this.K;
        if (b0Var == null) {
            return true;
        }
        Objects.requireNonNull(b0Var);
        return true;
    }

    public void n1() {
        if (this.K != null && h().f718r) {
            if (this.f778u == null) {
                h().f718r = false;
            } else if (Looper.myLooper() != this.f778u.l().getLooper()) {
                this.f778u.l().postAtFrontOfQueue(new y(this));
            } else {
                c(true);
            }
        }
    }

    public void c(boolean calledDirectly) {
        e0 listener;
        ViewGroup viewGroup;
        m1 m1Var;
        b0 b0Var = this.K;
        if (b0Var == null) {
            listener = null;
        } else {
            b0Var.f718r = false;
            e0 listener2 = b0Var.f719s;
            b0Var.f719s = null;
            listener = listener2;
        }
        if (listener != null) {
            ((l1) listener).d();
        } else if (this.H != null && (viewGroup = this.G) != null && (m1Var = this.f777t) != null) {
            t2 controller = t2.n(viewGroup, m1Var);
            controller.p();
            if (calledDirectly) {
                this.f778u.l().post(new z(this, controller));
            } else {
                controller.g();
            }
        }
    }

    public void f(String prefix, FileDescriptor fd, PrintWriter writer, String[] args) {
        writer.print(prefix);
        writer.print("mFragmentId=#");
        writer.print(Integer.toHexString(this.f781x));
        writer.print(" mContainerId=#");
        writer.print(Integer.toHexString(this.f782y));
        writer.print(" mTag=");
        writer.println(this.f783z);
        writer.print(prefix);
        writer.print("mState=");
        writer.print(this.f759b);
        writer.print(" mWho=");
        writer.print(this.f764g);
        writer.print(" mBackStackNesting=");
        writer.println(this.f776s);
        writer.print(prefix);
        writer.print("mAdded=");
        writer.print(this.f770m);
        writer.print(" mRemoving=");
        writer.print(this.f771n);
        writer.print(" mFromLayout=");
        writer.print(this.f772o);
        writer.print(" mInLayout=");
        writer.println(this.f773p);
        writer.print(prefix);
        writer.print("mHidden=");
        writer.print(this.A);
        writer.print(" mDetached=");
        writer.print(this.B);
        writer.print(" mMenuVisible=");
        writer.print(this.E);
        writer.print(" mHasMenu=");
        writer.println(false);
        writer.print(prefix);
        writer.print("mRetainInstance=");
        writer.print(this.C);
        writer.print(" mUserVisibleHint=");
        writer.println(this.J);
        if (this.f777t != null) {
            writer.print(prefix);
            writer.print("mFragmentManager=");
            writer.println(this.f777t);
        }
        if (this.f778u != null) {
            writer.print(prefix);
            writer.print("mHost=");
            writer.println(this.f778u);
        }
        if (this.f780w != null) {
            writer.print(prefix);
            writer.print("mParentFragment=");
            writer.println(this.f780w);
        }
        if (this.f765h != null) {
            writer.print(prefix);
            writer.print("mArguments=");
            writer.println(this.f765h);
        }
        if (this.f760c != null) {
            writer.print(prefix);
            writer.print("mSavedFragmentState=");
            writer.println(this.f760c);
        }
        if (this.f761d != null) {
            writer.print(prefix);
            writer.print("mSavedViewState=");
            writer.println(this.f761d);
        }
        if (this.f762e != null) {
            writer.print(prefix);
            writer.print("mSavedViewRegistryState=");
            writer.println(this.f762e);
        }
        f0 target = O();
        if (target != null) {
            writer.print(prefix);
            writer.print("mTarget=");
            writer.print(target);
            writer.print(" mTargetRequestCode=");
            writer.println(this.f768k);
        }
        writer.print(prefix);
        writer.print("mPopDirection=");
        writer.println(C());
        if (q() != 0) {
            writer.print(prefix);
            writer.print("getEnterAnim=");
            writer.println(q());
        }
        if (t() != 0) {
            writer.print(prefix);
            writer.print("getExitAnim=");
            writer.println(t());
        }
        if (D() != 0) {
            writer.print(prefix);
            writer.print("getPopEnterAnim=");
            writer.println(D());
        }
        if (E() != 0) {
            writer.print(prefix);
            writer.print("getPopExitAnim=");
            writer.println(E());
        }
        if (this.G != null) {
            writer.print(prefix);
            writer.print("mContainer=");
            writer.println(this.G);
        }
        if (this.H != null) {
            writer.print(prefix);
            writer.print("mView=");
            writer.println(this.H);
        }
        if (m() != null) {
            writer.print(prefix);
            writer.print("mAnimatingAway=");
            writer.println(m());
        }
        if (p() != null) {
            a.b(this).a(prefix, fd, writer, args);
        }
        writer.print(prefix);
        writer.println("Child " + this.f779v + ":");
        m1 m1Var = this.f779v;
        m1Var.O(prefix + "  ", fd, writer, args);
    }

    public f0 i(String who) {
        if (who.equals(this.f764g)) {
            return this;
        }
        return this.f779v.a0(who);
    }

    public n0 e() {
        return new a0(this);
    }

    public void D0() {
        Iterator it = this.T.iterator();
        while (it.hasNext()) {
            d0 listener = (d0) it.next();
            listener.a();
        }
        this.T.clear();
        this.f779v.g(this.f778u, e(), this);
        this.f759b = 0;
        this.F = false;
        c0(this.f778u.k());
        if (this.F) {
            this.f777t.A(this);
            this.f779v.r();
            return;
        }
        throw new v2("Fragment " + this + " did not call through to super.onAttach()");
    }

    public void G0(Bundle savedInstanceState) {
        this.f779v.C0();
        this.f759b = 1;
        this.F = false;
        this.P.a(new k() { // from class: androidx.fragment.app.Fragment$5
            @Override // androidx.lifecycle.k
            public void g(m source, h event) {
                View view;
                if (event == h.ON_STOP && (view = f0.this.H) != null) {
                    view.cancelPendingInputEvents();
                }
            }
        });
        this.S.c(savedInstanceState);
        f0(savedInstanceState);
        this.N = true;
        if (this.F) {
            this.P.h(h.ON_CREATE);
            return;
        }
        throw new v2("Fragment " + this + " did not call through to super.onCreate()");
    }

    public void I0(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        this.f779v.C0();
        this.f775r = true;
        this.Q = new k2(this, d());
        View i02 = i0(inflater, container, savedInstanceState);
        this.H = i02;
        if (i02 != null) {
            this.Q.e();
            i0.a(this.H, this.Q);
            j0.a(this.H, this.Q);
            g.a(this.H, this.Q);
            this.R.i(this.Q);
        } else if (!this.Q.f()) {
            this.Q = null;
        } else {
            throw new IllegalStateException("Called getViewLifecycleOwner() but onCreateView() returned null");
        }
    }

    public void Z0() {
        A0(this.H, this.f760c);
        this.f779v.M();
    }

    public void C0(Bundle savedInstanceState) {
        this.f779v.C0();
        this.f759b = 3;
        this.F = false;
        Z(savedInstanceState);
        if (this.F) {
            e1();
            this.f779v.q();
            return;
        }
        throw new v2("Fragment " + this + " did not call through to super.onActivityCreated()");
    }

    public final void e1() {
        if (m1.v0(3)) {
            Log.d("FragmentManager", "moveto RESTORE_VIEW_STATE: " + this);
        }
        if (this.H != null) {
            f1(this.f760c);
        }
        this.f760c = null;
    }

    public void X0() {
        this.f779v.C0();
        this.f779v.S(true);
        this.f759b = 5;
        this.F = false;
        y0();
        if (this.F) {
            o oVar = this.P;
            h hVar = h.ON_START;
            oVar.h(hVar);
            if (this.H != null) {
                this.Q.c(hVar);
            }
            this.f779v.J();
            return;
        }
        throw new v2("Fragment " + this + " did not call through to super.onStart()");
    }

    public void V0() {
        this.f779v.C0();
        this.f779v.S(true);
        this.f759b = 7;
        this.F = false;
        w0();
        if (this.F) {
            o oVar = this.P;
            h hVar = h.ON_RESUME;
            oVar.h(hVar);
            if (this.H != null) {
                this.Q.c(hVar);
            }
            this.f779v.I();
            return;
        }
        throw new v2("Fragment " + this + " did not call through to super.onResume()");
    }

    public void Y() {
        this.f779v.C0();
    }

    public void U0() {
        boolean isPrimaryNavigationFragment = this.f777t.y0(this);
        Boolean bool = this.f769l;
        if (bool == null || bool.booleanValue() != isPrimaryNavigationFragment) {
            this.f769l = Boolean.valueOf(isPrimaryNavigationFragment);
            u0(isPrimaryNavigationFragment);
            this.f779v.H();
        }
    }

    public void O0(boolean isInMultiWindowMode) {
        r0(isInMultiWindowMode);
        this.f779v.z(isInMultiWindowMode);
    }

    public void S0(boolean isInPictureInPictureMode) {
        t0(isInPictureInPictureMode);
        this.f779v.F(isInPictureInPictureMode);
    }

    public void E0(Configuration newConfig) {
        onConfigurationChanged(newConfig);
        this.f779v.s(newConfig);
    }

    public void N0() {
        onLowMemory();
        this.f779v.y();
    }

    public boolean H0(Menu menu, MenuInflater inflater) {
        if (this.A) {
            return false;
        }
        boolean show = false | this.f779v.v(menu, inflater);
        return show;
    }

    public boolean T0(Menu menu) {
        if (this.A) {
            return false;
        }
        boolean show = false | this.f779v.G(menu);
        return show;
    }

    public boolean P0(MenuItem item) {
        if (!this.A) {
            return this.f779v.B(item);
        }
        return false;
    }

    public boolean F0(MenuItem item) {
        if (this.A) {
            return false;
        }
        e0(item);
        return this.f779v.t(item);
    }

    public void Q0(Menu menu) {
        if (!this.A) {
            this.f779v.C(menu);
        }
    }

    public void W0(Bundle outState) {
        x0(outState);
        this.S.d(outState);
        Parcelable p2 = this.f779v.O0();
        if (p2 != null) {
            outState.putParcelable("android:support:fragments", p2);
        }
    }

    public void R0() {
        this.f779v.E();
        if (this.H != null) {
            this.Q.c(h.ON_PAUSE);
        }
        this.P.h(h.ON_PAUSE);
        this.f759b = 6;
        this.F = false;
        s0();
        if (!this.F) {
            throw new v2("Fragment " + this + " did not call through to super.onPause()");
        }
    }

    public void Y0() {
        this.f779v.L();
        if (this.H != null) {
            this.Q.c(h.ON_STOP);
        }
        this.P.h(h.ON_STOP);
        this.f759b = 4;
        this.F = false;
        z0();
        if (!this.F) {
            throw new v2("Fragment " + this + " did not call through to super.onStop()");
        }
    }

    public void K0() {
        this.f779v.x();
        if (this.H != null && this.Q.g().b().a(i.CREATED)) {
            this.Q.c(h.ON_DESTROY);
        }
        this.f759b = 1;
        this.F = false;
        l0();
        if (this.F) {
            a.b(this).c();
            this.f775r = false;
            return;
        }
        throw new v2("Fragment " + this + " did not call through to super.onDestroyView()");
    }

    public void J0() {
        this.f779v.w();
        this.P.h(h.ON_DESTROY);
        this.f759b = 0;
        this.F = false;
        this.N = false;
        j0();
        if (!this.F) {
            throw new v2("Fragment " + this + " did not call through to super.onDestroy()");
        }
    }

    public void L0() {
        this.f759b = -1;
        this.F = false;
        m0();
        this.M = null;
        if (!this.F) {
            throw new v2("Fragment " + this + " did not call through to super.onDetach()");
        } else if (!this.f779v.u0()) {
            this.f779v.w();
            this.f779v = new n1();
        }
    }

    public final b0 h() {
        if (this.K == null) {
            this.K = new b0();
        }
        return this.K;
    }

    public void g1(int enter, int exit, int popEnter, int popExit) {
        if (this.K != null || enter != 0 || exit != 0 || popEnter != 0 || popExit != 0) {
            h().f703c = enter;
            h().f704d = exit;
            h().f705e = popEnter;
            h().f706f = popExit;
        }
    }

    public int q() {
        b0 b0Var = this.K;
        if (b0Var == null) {
            return 0;
        }
        return b0Var.f703c;
    }

    public int t() {
        b0 b0Var = this.K;
        if (b0Var == null) {
            return 0;
        }
        return b0Var.f704d;
    }

    public int D() {
        b0 b0Var = this.K;
        if (b0Var == null) {
            return 0;
        }
        return b0Var.f705e;
    }

    public int E() {
        b0 b0Var = this.K;
        if (b0Var == null) {
            return 0;
        }
        return b0Var.f706f;
    }

    public boolean C() {
        b0 b0Var = this.K;
        if (b0Var == null) {
            return false;
        }
        return b0Var.f702b;
    }

    public void k1(boolean isPop) {
        if (this.K != null) {
            h().f702b = isPop;
        }
    }

    public int A() {
        b0 b0Var = this.K;
        if (b0Var == null) {
            return 0;
        }
        return b0Var.f707g;
    }

    public void j1(int nextTransition) {
        if (this.K != null || nextTransition != 0) {
            h();
            this.K.f707g = nextTransition;
        }
    }

    public ArrayList L() {
        ArrayList arrayList;
        b0 b0Var = this.K;
        if (b0Var == null || (arrayList = b0Var.f708h) == null) {
            return new ArrayList();
        }
        return arrayList;
    }

    public ArrayList M() {
        ArrayList arrayList;
        b0 b0Var = this.K;
        if (b0Var == null || (arrayList = b0Var.f709i) == null) {
            return new ArrayList();
        }
        return arrayList;
    }

    public void m1(ArrayList arrayList, ArrayList arrayList2) {
        h();
        b0 b0Var = this.K;
        b0Var.f708h = arrayList;
        b0Var.f709i = arrayList2;
    }

    public void s() {
        b0 b0Var = this.K;
        if (b0Var != null) {
            Objects.requireNonNull(b0Var);
        }
    }

    public void v() {
        b0 b0Var = this.K;
        if (b0Var != null) {
            Objects.requireNonNull(b0Var);
        }
    }

    public View m() {
        b0 b0Var = this.K;
        if (b0Var == null) {
            return null;
        }
        return b0Var.f701a;
    }

    public void l1(float alpha) {
        h().f716p = alpha;
    }

    public float F() {
        b0 b0Var = this.K;
        if (b0Var == null) {
            return 1.0f;
        }
        return b0Var.f716p;
    }

    public void i1(View view) {
        h().f717q = view;
    }

    public View w() {
        b0 b0Var = this.K;
        if (b0Var == null) {
            return null;
        }
        return b0Var.f717q;
    }

    public boolean W() {
        b0 b0Var = this.K;
        if (b0Var == null) {
            return false;
        }
        return b0Var.f718r;
    }
}
