package com.google.android.material.bottomsheet;

import a1.c;
import a1.f;
import a1.g;
import a1.h;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.os.Build;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.example.helloworld.R;
import f0.c1;
import g0.t;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import l0.k;
import l0.l;
import l1.w;
import n1.d;
import q1.j;
import q1.q;
import s.b;
import s.e;
import v0.a;

/* JADX WARN: Classes with same name are omitted:
  
 */
/* loaded from: classes.dex */
public class BottomSheetBehavior<V extends View> extends b {
    public static final int Y = 2131755601;
    public float A;
    public int B;
    public float C;
    public boolean D;
    public boolean E;
    public boolean F;
    public int G;
    public l H;
    public boolean I;
    public int J;
    public boolean K;
    public int L;
    public int M;
    public int N;
    public WeakReference O;
    public WeakReference P;
    public final ArrayList Q;
    public VelocityTracker R;
    public int S;
    public int T;
    public boolean U;
    public Map V;
    public int W;
    public final k X;

    /* renamed from: a  reason: collision with root package name */
    public int f1260a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f1261b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f1262c;

    /* renamed from: d  reason: collision with root package name */
    public float f1263d;

    /* renamed from: e  reason: collision with root package name */
    public int f1264e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f1265f;

    /* renamed from: g  reason: collision with root package name */
    public int f1266g;

    /* renamed from: h  reason: collision with root package name */
    public int f1267h;

    /* renamed from: i  reason: collision with root package name */
    public boolean f1268i;

    /* renamed from: j  reason: collision with root package name */
    public j f1269j;

    /* renamed from: k  reason: collision with root package name */
    public int f1270k;

    /* renamed from: l  reason: collision with root package name */
    public int f1271l;

    /* renamed from: m  reason: collision with root package name */
    public boolean f1272m;

    /* renamed from: n  reason: collision with root package name */
    public boolean f1273n;

    /* renamed from: o  reason: collision with root package name */
    public boolean f1274o;

    /* renamed from: p  reason: collision with root package name */
    public boolean f1275p;

    /* renamed from: q  reason: collision with root package name */
    public boolean f1276q;

    /* renamed from: r  reason: collision with root package name */
    public int f1277r;

    /* renamed from: s  reason: collision with root package name */
    public int f1278s;

    /* renamed from: t  reason: collision with root package name */
    public q f1279t;

    /* renamed from: u  reason: collision with root package name */
    public boolean f1280u;

    /* renamed from: v  reason: collision with root package name */
    public a1.k f1281v;

    /* renamed from: w  reason: collision with root package name */
    public ValueAnimator f1282w;

    /* renamed from: x  reason: collision with root package name */
    public int f1283x;

    /* renamed from: y  reason: collision with root package name */
    public int f1284y;

    /* renamed from: z  reason: collision with root package name */
    public int f1285z;

    public BottomSheetBehavior() {
        this.f1260a = 0;
        this.f1261b = true;
        this.f1262c = false;
        this.f1270k = -1;
        this.f1281v = null;
        this.A = 0.5f;
        this.C = -1.0f;
        this.F = true;
        this.G = 4;
        this.Q = new ArrayList();
        this.W = -1;
        this.X = new f(this);
    }

    public BottomSheetBehavior(Context context, AttributeSet attrs) {
        super(context, attrs);
        int i2;
        this.f1260a = 0;
        this.f1261b = true;
        this.f1262c = false;
        this.f1270k = -1;
        this.f1281v = null;
        this.A = 0.5f;
        this.C = -1.0f;
        this.F = true;
        this.G = 4;
        this.Q = new ArrayList();
        this.W = -1;
        this.X = new f(this);
        this.f1267h = context.getResources().getDimensionPixelSize(R.dimen.mtrl_min_touch_target_size);
        TypedArray a2 = context.obtainStyledAttributes(attrs, a.f3604a);
        int[] iArr = a.f3604a;
        this.f1268i = a2.hasValue(16);
        boolean hasBackgroundTint = a2.hasValue(2);
        if (hasBackgroundTint) {
            ColorStateList bottomSheetColor = d.a(context, a2, 2);
            X(context, attrs, hasBackgroundTint, bottomSheetColor);
        } else {
            W(context, attrs, hasBackgroundTint);
        }
        Y();
        this.C = a2.getDimension(1, -1.0f);
        if (a2.hasValue(0)) {
            n0(a2.getDimensionPixelSize(0, -1));
        }
        TypedValue value = a2.peekValue(8);
        if (value == null || (i2 = value.data) != -1) {
            o0(a2.getDimensionPixelSize(8, -1));
        } else {
            o0(i2);
        }
        m0(a2.getBoolean(7, false));
        k0(a2.getBoolean(11, false));
        j0(a2.getBoolean(5, true));
        r0(a2.getBoolean(10, false));
        h0(a2.getBoolean(3, true));
        q0(a2.getInt(9, 0));
        l0(a2.getFloat(6, 0.5f));
        TypedValue value2 = a2.peekValue(4);
        if (value2 == null || value2.type != 16) {
            i0(a2.getDimensionPixelOffset(4, 0));
        } else {
            i0(value2.data);
        }
        this.f1273n = a2.getBoolean(12, false);
        this.f1274o = a2.getBoolean(13, false);
        this.f1275p = a2.getBoolean(14, false);
        this.f1276q = a2.getBoolean(15, true);
        a2.recycle();
        ViewConfiguration configuration = ViewConfiguration.get(context);
        this.f1263d = configuration.getScaledMaximumFlingVelocity();
    }

    @Override // s.b
    public Parcelable y(CoordinatorLayout parent, View view) {
        return new a1.j(super.y(parent, view), this);
    }

    @Override // s.b
    public void x(CoordinatorLayout parent, View view, Parcelable state) {
        a1.j ss = (a1.j) state;
        super.x(parent, view, ss.i());
        g0(ss);
        int i2 = ss.f13d;
        if (i2 == 1 || i2 == 2) {
            this.G = 4;
        } else {
            this.G = i2;
        }
    }

    @Override // s.b
    public void g(e layoutParams) {
        super.g(layoutParams);
        this.O = null;
        this.H = null;
    }

    @Override // s.b
    public void j() {
        super.j();
        this.O = null;
        this.H = null;
    }

    @Override // s.b
    public boolean l(CoordinatorLayout parent, View view, int layoutDirection) {
        j jVar;
        if (c1.x(parent) && !c1.x(view)) {
            view.setFitsSystemWindows(true);
        }
        if (this.O == null) {
            this.f1266g = parent.getResources().getDimensionPixelSize(R.dimen.design_bottom_sheet_peek_height_min);
            u0(view);
            this.O = new WeakReference(view);
            if (this.f1268i && (jVar = this.f1269j) != null) {
                c1.o0(view, jVar);
            }
            j jVar2 = this.f1269j;
            if (jVar2 != null) {
                float f2 = this.C;
                if (f2 == -1.0f) {
                    f2 = c1.v(view);
                }
                jVar2.S(f2);
                boolean z2 = this.G == 3;
                this.f1280u = z2;
                this.f1269j.U(z2 ? 0.0f : 1.0f);
            }
            z0();
            if (c1.y(view) == 0) {
                c1.s0(view, 1);
            }
            int width = view.getMeasuredWidth();
            int i2 = this.f1270k;
            if (width > i2 && i2 != -1) {
                ViewGroup.LayoutParams lp = view.getLayoutParams();
                lp.width = this.f1270k;
                view.post(new a1.b(this, view, lp));
            }
        }
        if (this.H == null) {
            this.H = l.l(parent, this.X);
        }
        int savedTop = view.getTop();
        parent.I(view, layoutDirection);
        this.M = parent.getWidth();
        this.N = parent.getHeight();
        int height = view.getHeight();
        this.L = height;
        int i3 = this.N;
        int i4 = i3 - height;
        int i5 = this.f1278s;
        if (i4 < i5) {
            if (this.f1276q) {
                this.L = i3;
            } else {
                this.L = i3 - i5;
            }
        }
        this.f1284y = Math.max(0, i3 - this.L);
        T();
        S();
        int i6 = this.G;
        if (i6 == 3) {
            c1.W(view, b0());
        } else if (i6 == 6) {
            c1.W(view, this.f1285z);
        } else if (this.D && i6 == 5) {
            c1.W(view, this.N);
        } else if (i6 == 4) {
            c1.W(view, this.B);
        } else if (i6 == 1 || i6 == 2) {
            c1.W(view, savedTop - view.getTop());
        }
        this.P = new WeakReference(a0(view));
        return true;
    }

    @Override // s.b
    public boolean k(CoordinatorLayout parent, View view, MotionEvent event) {
        l lVar;
        if (!view.isShown() || !this.F) {
            this.I = true;
            return false;
        }
        int action = event.getActionMasked();
        if (action == 0) {
            f0();
        }
        if (this.R == null) {
            this.R = VelocityTracker.obtain();
        }
        this.R.addMovement(event);
        View scroll = null;
        switch (action) {
            case 0:
                int initialX = (int) event.getX();
                this.T = (int) event.getY();
                if (this.G != 2) {
                    WeakReference weakReference = this.P;
                    View scroll2 = weakReference != null ? (View) weakReference.get() : null;
                    if (scroll2 != null && parent.B(scroll2, initialX, this.T)) {
                        this.S = event.getPointerId(event.getActionIndex());
                        this.U = true;
                    }
                }
                this.I = this.S == -1 && !parent.B(view, initialX, this.T);
                break;
            case 1:
            case 3:
                this.U = false;
                this.S = -1;
                if (this.I) {
                    this.I = false;
                    return false;
                }
                break;
        }
        if (!this.I && (lVar = this.H) != null && lVar.F(event)) {
            return true;
        }
        WeakReference weakReference2 = this.P;
        if (weakReference2 != null) {
            scroll = (View) weakReference2.get();
        }
        return action == 2 && scroll != null && !this.I && this.G != 1 && !parent.B(scroll, (int) event.getX(), (int) event.getY()) && this.H != null && Math.abs(((float) this.T) - event.getY()) > ((float) this.H.t());
    }

    @Override // s.b
    public boolean D(CoordinatorLayout parent, View view, MotionEvent event) {
        if (!view.isShown()) {
            return false;
        }
        int action = event.getActionMasked();
        if (this.G == 1 && action == 0) {
            return true;
        }
        l lVar = this.H;
        if (lVar != null) {
            lVar.y(event);
        }
        if (action == 0) {
            f0();
        }
        if (this.R == null) {
            this.R = VelocityTracker.obtain();
        }
        this.R.addMovement(event);
        if (this.H != null && action == 2 && !this.I && Math.abs(this.T - event.getY()) > this.H.t()) {
            this.H.b(view, event.getPointerId(event.getActionIndex()));
        }
        return !this.I;
    }

    @Override // s.b
    public boolean A(CoordinatorLayout coordinatorLayout, View view, View directTargetChild, View target, int axes, int type) {
        this.J = 0;
        this.K = false;
        return (axes & 2) != 0;
    }

    @Override // s.b
    public void q(CoordinatorLayout coordinatorLayout, View view, View target, int dx, int dy, int[] consumed, int type) {
        if (type != 1) {
            WeakReference weakReference = this.P;
            View scrollingChild = weakReference != null ? (View) weakReference.get() : null;
            if (target == scrollingChild) {
                int currentTop = view.getTop();
                int newTop = currentTop - dy;
                if (dy > 0) {
                    if (newTop < b0()) {
                        consumed[1] = currentTop - b0();
                        c1.W(view, -consumed[1]);
                        t0(3);
                    } else if (this.F) {
                        consumed[1] = dy;
                        c1.W(view, -dy);
                        t0(1);
                    } else {
                        return;
                    }
                } else if (dy < 0 && !target.canScrollVertically(-1)) {
                    int i2 = this.B;
                    if (newTop > i2 && !this.D) {
                        consumed[1] = currentTop - i2;
                        c1.W(view, -consumed[1]);
                        t0(4);
                    } else if (this.F) {
                        consumed[1] = dy;
                        c1.W(view, -dy);
                        t0(1);
                    } else {
                        return;
                    }
                }
                Z(view.getTop());
                this.J = dy;
                this.K = true;
            }
        }
    }

    @Override // s.b
    public void C(CoordinatorLayout coordinatorLayout, View view, View target, int type) {
        int top;
        int currentTop;
        if (view.getTop() == b0()) {
            t0(3);
            return;
        }
        WeakReference weakReference = this.P;
        if (weakReference != null && target == weakReference.get() && this.K) {
            if (this.J > 0) {
                if (this.f1261b) {
                    currentTop = this.f1284y;
                    top = 3;
                } else {
                    int currentTop2 = view.getTop();
                    if (currentTop2 > this.f1285z) {
                        int top2 = this.f1285z;
                        currentTop = top2;
                        top = 6;
                    } else {
                        int top3 = b0();
                        currentTop = top3;
                        top = 3;
                    }
                }
            } else if (!this.D || !x0(view, c0())) {
                int top4 = this.J;
                if (top4 == 0) {
                    int currentTop3 = view.getTop();
                    if (!this.f1261b) {
                        int top5 = this.f1285z;
                        if (currentTop3 < top5) {
                            if (currentTop3 < Math.abs(currentTop3 - this.B)) {
                                int top6 = b0();
                                currentTop = top6;
                                top = 3;
                            } else {
                                int top7 = this.f1285z;
                                currentTop = top7;
                                top = 6;
                            }
                        } else if (Math.abs(currentTop3 - top5) < Math.abs(currentTop3 - this.B)) {
                            int top8 = this.f1285z;
                            currentTop = top8;
                            top = 6;
                        } else {
                            int top9 = this.B;
                            currentTop = top9;
                            top = 4;
                        }
                    } else if (Math.abs(currentTop3 - this.f1284y) < Math.abs(currentTop3 - this.B)) {
                        int top10 = this.f1284y;
                        currentTop = top10;
                        top = 3;
                    } else {
                        int top11 = this.B;
                        currentTop = top11;
                        top = 4;
                    }
                } else if (this.f1261b) {
                    currentTop = this.B;
                    top = 4;
                } else {
                    int currentTop4 = view.getTop();
                    if (Math.abs(currentTop4 - this.f1285z) < Math.abs(currentTop4 - this.B)) {
                        int top12 = this.f1285z;
                        currentTop = top12;
                        top = 6;
                    } else {
                        int top13 = this.B;
                        currentTop = top13;
                        top = 4;
                    }
                }
            } else {
                currentTop = this.N;
                top = 5;
            }
            y0(view, top, currentTop, false);
            this.K = false;
        }
    }

    @Override // s.b
    public void t(CoordinatorLayout coordinatorLayout, View view, View target, int dxConsumed, int dyConsumed, int dxUnconsumed, int dyUnconsumed, int type, int[] consumed) {
    }

    @Override // s.b
    public boolean o(CoordinatorLayout coordinatorLayout, View view, View target, float velocityX, float velocityY) {
        WeakReference weakReference = this.P;
        if (weakReference == null || target != weakReference.get()) {
            return false;
        }
        if (this.G != 3) {
            return true;
        }
        super.o(coordinatorLayout, view, target, velocityX, velocityY);
        return false;
    }

    public void j0(boolean fitToContents) {
        if (this.f1261b != fitToContents) {
            this.f1261b = fitToContents;
            if (this.O != null) {
                S();
            }
            t0((!this.f1261b || this.G != 6) ? this.G : 3);
            z0();
        }
    }

    public void n0(int maxWidth) {
        this.f1270k = maxWidth;
    }

    public void o0(int peekHeight) {
        p0(peekHeight, false);
    }

    public final void p0(int peekHeight, boolean animate) {
        boolean layout = false;
        if (peekHeight == -1) {
            if (!this.f1265f) {
                this.f1265f = true;
                layout = true;
            }
        } else if (this.f1265f || this.f1264e != peekHeight) {
            this.f1265f = false;
            this.f1264e = Math.max(0, peekHeight);
            layout = true;
        }
        if (layout) {
            C0(animate);
        }
    }

    public final void C0(boolean animate) {
        View view;
        if (this.O != null) {
            S();
            if (this.G == 4 && (view = (View) this.O.get()) != null) {
                if (animate) {
                    w0(this.G);
                } else {
                    view.requestLayout();
                }
            }
        }
    }

    public void l0(float ratio) {
        if (ratio <= 0.0f || ratio >= 1.0f) {
            throw new IllegalArgumentException("ratio must be a float value between 0 and 1");
        }
        this.A = ratio;
        if (this.O != null) {
            T();
        }
    }

    public void i0(int offset) {
        if (offset >= 0) {
            this.f1283x = offset;
            return;
        }
        throw new IllegalArgumentException("offset must be greater than or equal to 0");
    }

    public int b0() {
        if (this.f1261b) {
            return this.f1284y;
        }
        return Math.max(this.f1283x, this.f1276q ? 0 : this.f1278s);
    }

    public void m0(boolean hideable) {
        if (this.D != hideable) {
            this.D = hideable;
            if (!hideable && this.G == 5) {
                s0(4);
            }
            z0();
        }
    }

    public void r0(boolean skipCollapsed) {
        this.E = skipCollapsed;
    }

    public void h0(boolean draggable) {
        this.F = draggable;
    }

    public void q0(int flags) {
        this.f1260a = flags;
    }

    public void s0(int state) {
        if (state != this.G) {
            if (this.O != null) {
                w0(state);
            } else if (state == 4 || state == 3 || state == 6 || (this.D && state == 5)) {
                this.G = state;
            }
        }
    }

    public void k0(boolean gestureInsetBottomIgnored) {
        this.f1272m = gestureInsetBottomIgnored;
    }

    public boolean d0() {
        return this.f1272m;
    }

    public final void w0(int state) {
        View view = (View) this.O.get();
        if (view != null) {
            ViewParent parent = view.getParent();
            if (parent == null || !parent.isLayoutRequested() || !c1.O(view)) {
                v0(view, state);
            } else {
                view.post(new c(this, view, state));
            }
        }
    }

    public void t0(int state) {
        View bottomSheet;
        if (this.G != state) {
            this.G = state;
            WeakReference weakReference = this.O;
            if (weakReference != null && (bottomSheet = (View) weakReference.get()) != null) {
                if (state == 3) {
                    B0(true);
                } else if (state == 6 || state == 5 || state == 4) {
                    B0(false);
                }
                A0(state);
                if (0 >= this.Q.size()) {
                    z0();
                    return;
                }
                a1.a.a(this.Q.get(0));
                h hVar = null;
                hVar.b(bottomSheet, state);
                throw null;
            }
        }
    }

    public final void A0(int state) {
        ValueAnimator valueAnimator;
        if (state != 2) {
            boolean expand = state == 3;
            if (this.f1280u != expand) {
                this.f1280u = expand;
                if (this.f1269j != null && (valueAnimator = this.f1282w) != null) {
                    if (valueAnimator.isRunning()) {
                        this.f1282w.reverse();
                        return;
                    }
                    float to = expand ? 0.0f : 1.0f;
                    float from = 1.0f - to;
                    this.f1282w.setFloatValues(from, to);
                    this.f1282w.start();
                }
            }
        }
    }

    public final int U() {
        int i2;
        if (this.f1265f) {
            int desiredHeight = Math.max(this.f1266g, this.N - ((this.M * 9) / 16));
            return Math.min(desiredHeight, this.L) + this.f1277r;
        } else if (this.f1272m || this.f1273n || (i2 = this.f1271l) <= 0) {
            return this.f1264e + this.f1277r;
        } else {
            return Math.max(this.f1264e, i2 + this.f1267h);
        }
    }

    public final void S() {
        int peek = U();
        if (this.f1261b) {
            this.B = Math.max(this.N - peek, this.f1284y);
        } else {
            this.B = this.N - peek;
        }
    }

    public final void T() {
        this.f1285z = (int) (this.N * (1.0f - this.A));
    }

    public final void f0() {
        this.S = -1;
        VelocityTracker velocityTracker = this.R;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.R = null;
        }
    }

    public final void g0(a1.j ss) {
        int i2 = this.f1260a;
        if (i2 != 0) {
            if (i2 == -1 || (i2 & 1) == 1) {
                this.f1264e = ss.f14e;
            }
            if (i2 == -1 || (i2 & 2) == 2) {
                this.f1261b = ss.f15f;
            }
            if (i2 == -1 || (i2 & 4) == 4) {
                this.D = ss.f16g;
            }
            if (i2 == -1 || (i2 & 8) == 8) {
                this.E = ss.f17h;
            }
        }
    }

    public boolean x0(View child, float yvel) {
        if (this.E) {
            return true;
        }
        if (child.getTop() < this.B) {
            return false;
        }
        int peek = U();
        float newTop = child.getTop() + (0.1f * yvel);
        return Math.abs(newTop - ((float) this.B)) / ((float) peek) > 0.5f;
    }

    public View a0(View view) {
        if (c1.Q(view)) {
            return view;
        }
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        ViewGroup group = (ViewGroup) view;
        int count = group.getChildCount();
        for (int i2 = 0; i2 < count; i2++) {
            View scrollingChild = a0(group.getChildAt(i2));
            if (scrollingChild != null) {
                return scrollingChild;
            }
        }
        return null;
    }

    public final void W(Context context, AttributeSet attrs, boolean hasBackgroundTint) {
        X(context, attrs, hasBackgroundTint, null);
    }

    public final void X(Context context, AttributeSet attrs, boolean hasBackgroundTint, ColorStateList bottomSheetColor) {
        if (this.f1268i) {
            this.f1279t = q.e(context, attrs, R.attr.bottomSheetStyle, 2131755601).m();
            j jVar = new j(this.f1279t);
            this.f1269j = jVar;
            jVar.J(context);
            if (!hasBackgroundTint || bottomSheetColor == null) {
                TypedValue defaultColor = new TypedValue();
                context.getTheme().resolveAttribute(16842801, defaultColor, true);
                this.f1269j.setTint(defaultColor.data);
                return;
            }
            this.f1269j.T(bottomSheetColor);
        }
    }

    public final void Y() {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.f1282w = ofFloat;
        ofFloat.setDuration(500L);
        this.f1282w.addUpdateListener(new a1.d(this));
    }

    public final void u0(View child) {
        boolean shouldHandleGestureInsets = Build.VERSION.SDK_INT >= 29 && !d0() && !this.f1265f;
        if (this.f1273n || this.f1274o || this.f1275p || shouldHandleGestureInsets) {
            w.a(child, new a1.e(this, shouldHandleGestureInsets));
        }
    }

    public final float c0() {
        VelocityTracker velocityTracker = this.R;
        if (velocityTracker == null) {
            return 0.0f;
        }
        velocityTracker.computeCurrentVelocity(1000, this.f1263d);
        return this.R.getYVelocity(this.S);
    }

    public void v0(View child, int state) {
        int top;
        if (state == 4) {
            top = this.B;
        } else if (state == 6) {
            top = this.f1285z;
            if (this.f1261b && top <= this.f1284y) {
                state = 3;
                top = this.f1284y;
            }
        } else if (state == 3) {
            top = b0();
        } else if (!this.D || state != 5) {
            throw new IllegalArgumentException("Illegal state argument: " + state);
        } else {
            top = this.N;
        }
        y0(child, state, top, false);
    }

    public void y0(View child, int state, int top, boolean settleFromViewDragHelper) {
        l lVar = this.H;
        boolean startedSettling = lVar != null && (!settleFromViewDragHelper ? lVar.G(child, child.getLeft(), top) : lVar.E(child.getLeft(), top));
        if (startedSettling) {
            t0(2);
            A0(state);
            if (this.f1281v == null) {
                this.f1281v = new a1.k(this, child, state);
            }
            if (!a1.k.a(this.f1281v)) {
                a1.k kVar = this.f1281v;
                kVar.f20d = state;
                c1.d0(child, kVar);
                a1.k.b(this.f1281v, true);
                return;
            }
            this.f1281v.f20d = state;
            return;
        }
        t0(state);
    }

    public void Z(int top) {
        float f2;
        View bottomSheet = (View) this.O.get();
        if (bottomSheet != null && !this.Q.isEmpty()) {
            int i2 = this.B;
            if (top > i2 || i2 == b0()) {
                int i3 = this.B;
                f2 = (i3 - top) / (this.N - i3);
            } else {
                int i4 = this.B;
                f2 = (i4 - top) / (i4 - b0());
            }
            if (0 < this.Q.size()) {
                a1.a.a(this.Q.get(0));
                h hVar = null;
                hVar.a(bottomSheet, f2);
                throw null;
            }
        }
    }

    public final void B0(boolean expanded) {
        Map map;
        WeakReference weakReference = this.O;
        if (weakReference != null) {
            ViewParent viewParent = ((View) weakReference.get()).getParent();
            if (viewParent instanceof CoordinatorLayout) {
                CoordinatorLayout parent = (CoordinatorLayout) viewParent;
                int childCount = parent.getChildCount();
                if (expanded) {
                    if (this.V == null) {
                        this.V = new HashMap(childCount);
                    } else {
                        return;
                    }
                }
                for (int i2 = 0; i2 < childCount; i2++) {
                    View child = parent.getChildAt(i2);
                    if (child != this.O.get()) {
                        if (expanded) {
                            this.V.put(child, Integer.valueOf(child.getImportantForAccessibility()));
                            if (this.f1262c) {
                                c1.s0(child, 4);
                            }
                        } else if (this.f1262c && (map = this.V) != null && map.containsKey(child)) {
                            c1.s0(child, ((Integer) this.V.get(child)).intValue());
                        }
                    }
                }
                if (!expanded) {
                    this.V = null;
                } else if (this.f1262c) {
                    ((View) this.O.get()).sendAccessibilityEvent(8);
                }
            }
        }
    }

    public final void z0() {
        View view;
        WeakReference weakReference = this.O;
        if (weakReference != null && (view = (View) weakReference.get()) != null) {
            c1.f0(view, 524288);
            c1.f0(view, 262144);
            c1.f0(view, 1048576);
            int i2 = this.W;
            if (i2 != -1) {
                c1.f0(view, i2);
            }
            int nextState = 6;
            if (!this.f1261b && this.G != 6) {
                this.W = R(view, R.string.bottomsheet_action_expand_halfway, 6);
            }
            if (this.D && this.G != 5) {
                e0(view, g0.c.f2012j, 5);
            }
            switch (this.G) {
                case 3:
                    if (this.f1261b) {
                        nextState = 4;
                    }
                    e0(view, g0.c.f2011i, nextState);
                    return;
                case 4:
                    if (this.f1261b) {
                        nextState = 3;
                    }
                    e0(view, g0.c.f2010h, nextState);
                    return;
                case 5:
                default:
                    return;
                case 6:
                    e0(view, g0.c.f2011i, 4);
                    e0(view, g0.c.f2010h, 3);
                    return;
            }
        }
    }

    public final void e0(View view, g0.c action, int state) {
        c1.h0(view, action, null, V(state));
    }

    public final int R(View view, int stringResId, int state) {
        return c1.c(view, view.getResources().getString(stringResId), V(state));
    }

    public final t V(int state) {
        return new g(this, state);
    }
}
