package androidx.recyclerview.widget;

import android.animation.LayoutTransition;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Build;
import android.os.Parcelable;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.Display;
import android.view.FocusFinder;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.animation.Interpolator;
import android.widget.EdgeEffect;
import android.widget.OverScroller;
import b0.d;
import com.example.helloworld.R;
import e0.h;
import f0.c1;
import f0.v;
import f0.w;
import g0.b;
import i0.g;
import java.lang.ref.WeakReference;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import p0.a;
import q0.a1;
import q0.b1;
import q0.b2;
import q0.c;
import q0.c2;
import q0.d1;
import q0.d2;
import q0.e1;
import q0.e2;
import q0.f;
import q0.f1;
import q0.g1;
import q0.g2;
import q0.h1;
import q0.m1;
import q0.n1;
import q0.o1;
import q0.p1;
import q0.q;
import q0.q1;
import q0.r0;
import q0.s0;
import q0.s1;
import q0.t0;
import q0.t1;
import q0.u0;
import q0.u1;
import q0.v0;
import q0.v1;
import q0.w0;
import q0.x;
import q0.x0;
import q0.x1;
import q0.y2;
import q0.z;
import q0.z2;

/* loaded from: classes.dex */
public class RecyclerView extends ViewGroup implements v {
    public static final Class[] D0;
    public boolean A;
    public final AccessibilityManager B;
    public boolean C;
    public boolean D;
    public int E;
    public int F;
    public b1 G;
    public EdgeEffect H;
    public EdgeEffect I;
    public EdgeEffect J;
    public EdgeEffect K;
    public f1 L;
    public int M;
    public int N;
    public VelocityTracker O;
    public int P;
    public int Q;
    public int R;
    public int S;
    public int T;
    public o1 U;
    public final int V;
    public final int W;

    /* renamed from: a0 */
    public float f1066a0;

    /* renamed from: b */
    public final v1 f1067b;

    /* renamed from: b0 */
    public float f1068b0;

    /* renamed from: c */
    public final t1 f1069c;

    /* renamed from: c0 */
    public boolean f1070c0;

    /* renamed from: d */
    public x1 f1071d;

    /* renamed from: d0 */
    public final d2 f1072d0;

    /* renamed from: e */
    public c f1073e;

    /* renamed from: e0 */
    public z f1074e0;

    /* renamed from: f */
    public f f1075f;

    /* renamed from: f0 */
    public x f1076f0;

    /* renamed from: g */
    public final z2 f1077g;

    /* renamed from: g0 */
    public final b2 f1078g0;

    /* renamed from: h */
    public boolean f1079h;

    /* renamed from: h0 */
    public q1 f1080h0;

    /* renamed from: i */
    public final Rect f1081i;

    /* renamed from: i0 */
    public List f1082i0;

    /* renamed from: j */
    public final Rect f1083j;

    /* renamed from: j0 */
    public boolean f1084j0;

    /* renamed from: k */
    public final RectF f1085k;

    /* renamed from: k0 */
    public boolean f1086k0;

    /* renamed from: l */
    public x0 f1087l;

    /* renamed from: l0 */
    public d1 f1088l0;

    /* renamed from: m */
    public m1 f1089m;

    /* renamed from: m0 */
    public boolean f1090m0;

    /* renamed from: n */
    public u1 f1091n;

    /* renamed from: n0 */
    public g2 f1092n0;

    /* renamed from: o */
    public final ArrayList f1093o;

    /* renamed from: o0 */
    public a1 f1094o0;

    /* renamed from: p */
    public final ArrayList f1095p;

    /* renamed from: p0 */
    public final int[] f1096p0;

    /* renamed from: q */
    public p1 f1097q;

    /* renamed from: q0 */
    public w f1098q0;

    /* renamed from: r */
    public boolean f1099r;

    /* renamed from: r0 */
    public final int[] f1100r0;

    /* renamed from: s */
    public boolean f1101s;

    /* renamed from: s0 */
    public final int[] f1102s0;

    /* renamed from: t */
    public boolean f1103t;

    /* renamed from: t0 */
    public final int[] f1104t0;

    /* renamed from: u */
    public boolean f1105u;

    /* renamed from: u0 */
    public final List f1106u0;

    /* renamed from: v */
    public int f1107v;

    /* renamed from: v0 */
    public Runnable f1108v0;

    /* renamed from: w */
    public boolean f1109w;

    /* renamed from: w0 */
    public final y2 f1110w0;

    /* renamed from: x */
    public boolean f1111x;

    /* renamed from: y */
    public boolean f1112y;

    /* renamed from: z */
    public int f1113z;

    /* renamed from: x0 */
    public static final int[] f1063x0 = {16843830};

    /* renamed from: y0 */
    public static final boolean f1064y0 = false;

    /* renamed from: z0 */
    public static final boolean f1065z0 = true;
    public static final boolean A0 = true;
    public static final boolean B0 = false;
    public static final boolean C0 = false;
    public static final Interpolator E0 = new t0();

    static {
        Class cls = Integer.TYPE;
        D0 = new Class[]{Context.class, AttributeSet.class, cls, cls};
    }

    public RecyclerView(Context context, AttributeSet attrs) {
        this(context, attrs, R.attr.recyclerViewStyle);
    }

    public RecyclerView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        boolean z2;
        int i2;
        TypedArray a2;
        this.f1067b = new v1(this);
        this.f1069c = new t1(this);
        this.f1077g = new z2();
        new r0(this);
        this.f1081i = new Rect();
        this.f1083j = new Rect();
        this.f1085k = new RectF();
        this.f1093o = new ArrayList();
        this.f1095p = new ArrayList();
        this.f1107v = 0;
        this.C = false;
        this.D = false;
        this.E = 0;
        this.F = 0;
        this.G = new b1();
        this.L = new q();
        this.M = 0;
        this.N = -1;
        this.f1066a0 = Float.MIN_VALUE;
        this.f1068b0 = Float.MIN_VALUE;
        this.f1070c0 = true;
        this.f1072d0 = new d2(this);
        this.f1076f0 = new x();
        this.f1078g0 = new b2();
        this.f1084j0 = false;
        this.f1086k0 = false;
        this.f1088l0 = new g1(this);
        this.f1090m0 = false;
        this.f1096p0 = new int[2];
        this.f1100r0 = new int[2];
        this.f1102s0 = new int[2];
        this.f1104t0 = new int[2];
        this.f1106u0 = new ArrayList();
        this.f1108v0 = new s0(this);
        this.f1110w0 = new u0(this);
        setScrollContainer(true);
        setFocusableInTouchMode(true);
        ViewConfiguration vc = ViewConfiguration.get(context);
        this.T = vc.getScaledTouchSlop();
        this.f1066a0 = f0.d1.b(vc, context);
        this.f1068b0 = f0.d1.d(vc, context);
        this.V = vc.getScaledMinimumFlingVelocity();
        this.W = vc.getScaledMaximumFlingVelocity();
        if (getOverScrollMode() == 2) {
            z2 = true;
        } else {
            z2 = false;
        }
        setWillNotDraw(z2);
        this.L.v(this.f1088l0);
        n0();
        p0();
        o0();
        if (c1.y(this) == 0) {
            c1.s0(this, 1);
        }
        this.B = (AccessibilityManager) getContext().getSystemService("accessibility");
        setAccessibilityDelegateCompat(new g2(this));
        int[] iArr = a.f2773a;
        TypedArray a3 = context.obtainStyledAttributes(attrs, iArr, defStyleAttr, 0);
        int i3 = Build.VERSION.SDK_INT;
        if (i3 >= 29) {
            i2 = i3;
            a2 = a3;
            saveAttributeDataForStyleable(context, iArr, attrs, a3, defStyleAttr, 0);
        } else {
            i2 = i3;
            a2 = a3;
        }
        int[] iArr2 = a.f2773a;
        String layoutManagerName = a2.getString(8);
        int descendantFocusability = a2.getInt(2, -1);
        if (descendantFocusability == -1) {
            setDescendantFocusability(262144);
        }
        this.f1079h = a2.getBoolean(1, true);
        boolean z3 = a2.getBoolean(3, false);
        this.f1103t = z3;
        if (z3) {
            StateListDrawable verticalThumbDrawable = (StateListDrawable) a2.getDrawable(6);
            Drawable verticalTrackDrawable = a2.getDrawable(7);
            StateListDrawable horizontalThumbDrawable = (StateListDrawable) a2.getDrawable(4);
            Drawable horizontalTrackDrawable = a2.getDrawable(5);
            q0(verticalThumbDrawable, verticalTrackDrawable, horizontalThumbDrawable, horizontalTrackDrawable);
        }
        a2.recycle();
        v(context, layoutManagerName, attrs, defStyleAttr, 0);
        int[] iArr3 = f1063x0;
        TypedArray a4 = context.obtainStyledAttributes(attrs, iArr3, defStyleAttr, 0);
        if (i2 >= 29) {
            saveAttributeDataForStyleable(context, iArr3, attrs, a4, defStyleAttr, 0);
        }
        boolean nestedScrollingEnabled = a4.getBoolean(0, true);
        a4.recycle();
        setNestedScrollingEnabled(nestedScrollingEnabled);
    }

    public String P() {
        return " " + super.toString() + ", adapter:" + this.f1087l + ", layout:" + this.f1089m + ", context:" + getContext();
    }

    public final void o0() {
        if (c1.z(this) == 0) {
            c1.t0(this, 8);
        }
    }

    public g2 getCompatAccessibilityDelegate() {
        return this.f1092n0;
    }

    public void setAccessibilityDelegateCompat(g2 accessibilityDelegate) {
        this.f1092n0 = accessibilityDelegate;
        c1.l0(this, accessibilityDelegate);
    }

    @Override // android.view.ViewGroup, android.view.View
    public CharSequence getAccessibilityClassName() {
        return "androidx.recyclerview.widget.RecyclerView";
    }

    public final void v(Context context, String className, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        ClassLoader classLoader;
        Constructor constructor;
        if (className != null) {
            String className2 = className.trim();
            if (!className2.isEmpty()) {
                String className3 = i0(context, className2);
                try {
                    if (isInEditMode()) {
                        classLoader = getClass().getClassLoader();
                    } else {
                        classLoader = context.getClassLoader();
                    }
                    Class<? extends U> asSubclass = Class.forName(className3, false, classLoader).asSubclass(m1.class);
                    Object[] constructorArgs = null;
                    try {
                        constructor = asSubclass.getConstructor(D0);
                        constructorArgs = new Object[]{context, attrs, Integer.valueOf(defStyleAttr), Integer.valueOf(defStyleRes)};
                    } catch (NoSuchMethodException e2) {
                        try {
                            constructor = asSubclass.getConstructor(new Class[0]);
                        } catch (NoSuchMethodException e12) {
                            e12.initCause(e2);
                            throw new IllegalStateException(attrs.getPositionDescription() + ": Error creating LayoutManager " + className3, e12);
                        }
                    }
                    constructor.setAccessible(true);
                    setLayoutManager((m1) constructor.newInstance(constructorArgs));
                } catch (ClassCastException e3) {
                    throw new IllegalStateException(attrs.getPositionDescription() + ": Class is not a LayoutManager " + className3, e3);
                } catch (ClassNotFoundException e4) {
                    throw new IllegalStateException(attrs.getPositionDescription() + ": Unable to find LayoutManager " + className3, e4);
                } catch (IllegalAccessException e5) {
                    throw new IllegalStateException(attrs.getPositionDescription() + ": Cannot access non-public constructor " + className3, e5);
                } catch (InstantiationException e6) {
                    throw new IllegalStateException(attrs.getPositionDescription() + ": Could not instantiate the LayoutManager: " + className3, e6);
                } catch (InvocationTargetException e7) {
                    throw new IllegalStateException(attrs.getPositionDescription() + ": Could not instantiate the LayoutManager: " + className3, e7);
                }
            }
        }
    }

    public final String i0(Context context, String className) {
        if (className.charAt(0) == '.') {
            return context.getPackageName() + className;
        } else if (className.contains(".")) {
            return className;
        } else {
            return RecyclerView.class.getPackage().getName() + '.' + className;
        }
    }

    public final void p0() {
        this.f1075f = new f(new v0(this));
    }

    public void n0() {
        this.f1073e = new c(new w0(this));
    }

    public void setHasFixedSize(boolean hasFixedSize) {
        this.f1101s = hasFixedSize;
    }

    @Override // android.view.ViewGroup
    public void setClipToPadding(boolean clipToPadding) {
        if (clipToPadding != this.f1079h) {
            r0();
        }
        this.f1079h = clipToPadding;
        super.setClipToPadding(clipToPadding);
        if (this.f1105u) {
            requestLayout();
        }
    }

    @Override // android.view.ViewGroup
    public boolean getClipToPadding() {
        return this.f1079h;
    }

    public void setScrollingTouchSlop(int slopConstant) {
        ViewConfiguration vc = ViewConfiguration.get(getContext());
        switch (slopConstant) {
            case 0:
                break;
            case 1:
                this.T = vc.getScaledPagingTouchSlop();
                return;
            default:
                Log.w("RecyclerView", "setScrollingTouchSlop(): bad argument constant " + slopConstant + "; using default value");
                break;
        }
        this.T = vc.getScaledTouchSlop();
    }

    public void setAdapter(x0 adapter) {
        setLayoutFrozen(false);
        h1(adapter, false, true);
        O0(false);
        requestLayout();
    }

    public void T0() {
        f1 f1Var = this.L;
        if (f1Var != null) {
            f1Var.k();
        }
        m1 m1Var = this.f1089m;
        if (m1Var != null) {
            m1Var.k1(this.f1069c);
            this.f1089m.l1(this.f1069c);
        }
        this.f1069c.c();
    }

    public final void h1(x0 adapter, boolean compatibleWithPrevious, boolean removeAndRecycleViews) {
        x0 x0Var = this.f1087l;
        if (x0Var != null) {
            x0Var.t(this.f1067b);
            this.f1087l.m();
        }
        if (!compatibleWithPrevious || removeAndRecycleViews) {
            T0();
        }
        this.f1073e.u();
        x0 oldAdapter = this.f1087l;
        this.f1087l = adapter;
        if (adapter != null) {
            adapter.r(this.f1067b);
            adapter.i();
        }
        m1 m1Var = this.f1089m;
        if (m1Var != null) {
            m1Var.E0();
        }
        this.f1069c.v(oldAdapter, this.f1087l, compatibleWithPrevious);
        this.f1078g0.f2972f = true;
    }

    public x0 getAdapter() {
        return this.f1087l;
    }

    public void setRecyclerListener(u1 listener) {
        this.f1091n = listener;
    }

    @Override // android.view.View
    public int getBaseline() {
        m1 m1Var = this.f1089m;
        if (m1Var == null) {
            return super.getBaseline();
        }
        m1Var.G();
        return -1;
    }

    public void setLayoutManager(m1 layout) {
        if (layout != this.f1089m) {
            t1();
            if (this.f1089m != null) {
                f1 f1Var = this.L;
                if (f1Var != null) {
                    f1Var.k();
                }
                this.f1089m.k1(this.f1069c);
                this.f1089m.l1(this.f1069c);
                this.f1069c.c();
                if (this.f1099r) {
                    this.f1089m.A(this, this.f1069c);
                }
                this.f1089m.E1(null);
                this.f1089m = null;
            } else {
                this.f1069c.c();
            }
            this.f1075f.o();
            this.f1089m = layout;
            if (layout != null) {
                if (layout.f3115b == null) {
                    layout.E1(this);
                    if (this.f1099r) {
                        this.f1089m.z(this);
                    }
                } else {
                    throw new IllegalArgumentException("LayoutManager " + layout + " is already attached to a RecyclerView:" + layout.f3115b.P());
                }
            }
            this.f1069c.I();
            requestLayout();
        }
    }

    public void setOnFlingListener(o1 onFlingListener) {
        this.U = onFlingListener;
    }

    public o1 getOnFlingListener() {
        return this.U;
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        x1 state = new x1(super.onSaveInstanceState());
        x1 x1Var = this.f1071d;
        if (x1Var != null) {
            state.j(x1Var);
        } else {
            m1 m1Var = this.f1089m;
            if (m1Var != null) {
                state.f3262d = m1Var.d1();
            } else {
                state.f3262d = null;
            }
        }
        return state;
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable state) {
        Parcelable parcelable;
        if (!(state instanceof x1)) {
            super.onRestoreInstanceState(state);
            return;
        }
        x1 x1Var = (x1) state;
        this.f1071d = x1Var;
        super.onRestoreInstanceState(x1Var.i());
        m1 m1Var = this.f1089m;
        if (m1Var != null && (parcelable = this.f1071d.f3262d) != null) {
            m1Var.c1(parcelable);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchSaveInstanceState(SparseArray sparseArray) {
        dispatchFreezeSelfOnly(sparseArray);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchRestoreInstanceState(SparseArray sparseArray) {
        dispatchThawSelfOnly(sparseArray);
    }

    public final void g(e2 viewHolder) {
        View view = viewHolder.f3018a;
        boolean alreadyParented = view.getParent() == this;
        this.f1069c.H(e0(view));
        if (viewHolder.x()) {
            this.f1075f.c(view, -1, view.getLayoutParams(), true);
        } else if (!alreadyParented) {
            this.f1075f.b(view, true);
        } else {
            this.f1075f.k(view);
        }
    }

    public boolean U0(View view) {
        p1();
        boolean removed = this.f1075f.r(view);
        if (removed) {
            e2 viewHolder = f0(view);
            this.f1069c.H(viewHolder);
            this.f1069c.A(viewHolder);
        }
        r1(!removed);
        return removed;
    }

    public m1 getLayoutManager() {
        return this.f1089m;
    }

    public s1 getRecycledViewPool() {
        return this.f1069c.i();
    }

    public void setRecycledViewPool(s1 pool) {
        this.f1069c.C(pool);
    }

    public void setViewCacheExtension(c2 extension) {
        this.f1069c.D(extension);
    }

    public void setItemViewCacheSize(int size) {
        this.f1069c.E(size);
    }

    public int getScrollState() {
        return this.M;
    }

    public void setScrollState(int state) {
        if (state != this.M) {
            this.M = state;
            if (state != 2) {
                u1();
            }
            H(state);
        }
    }

    public void i(h1 decor, int index) {
        m1 m1Var = this.f1089m;
        if (m1Var != null) {
            m1Var.g("Cannot add item decoration during a scroll  or layout");
        }
        if (this.f1093o.isEmpty()) {
            setWillNotDraw(false);
        }
        if (index < 0) {
            this.f1093o.add(decor);
        } else {
            this.f1093o.add(index, decor);
        }
        w0();
        requestLayout();
    }

    public void h(h1 decor) {
        i(decor, -1);
    }

    public int getItemDecorationCount() {
        return this.f1093o.size();
    }

    public void V0(h1 decor) {
        m1 m1Var = this.f1089m;
        if (m1Var != null) {
            m1Var.g("Cannot remove item decoration during a scroll  or layout");
        }
        this.f1093o.remove(decor);
        if (this.f1093o.isEmpty()) {
            setWillNotDraw(getOverScrollMode() == 2);
        }
        w0();
        requestLayout();
    }

    public void setChildDrawingOrderCallback(a1 childDrawingOrderCallback) {
        if (childDrawingOrderCallback != this.f1094o0) {
            this.f1094o0 = childDrawingOrderCallback;
            setChildrenDrawingOrderEnabled(childDrawingOrderCallback != null);
        }
    }

    @Deprecated
    public void setOnScrollListener(q1 listener) {
        this.f1080h0 = listener;
    }

    public void k(q1 listener) {
        if (this.f1082i0 == null) {
            this.f1082i0 = new ArrayList();
        }
        this.f1082i0.add(listener);
    }

    public void X0(q1 listener) {
        List list = this.f1082i0;
        if (list != null) {
            list.remove(listener);
        }
    }

    public void g1(int position) {
        if (!this.f1111x) {
            t1();
            m1 m1Var = this.f1089m;
            if (m1Var == null) {
                Log.e("RecyclerView", "Cannot scroll to position a LayoutManager set. Call setLayoutManager with a non-null argument.");
                return;
            }
            m1Var.x1(position);
            awakenScrollBars();
        }
    }

    public void v0(int position) {
        if (this.f1089m != null) {
            setScrollState(2);
            this.f1089m.x1(position);
            awakenScrollBars();
        }
    }

    public void o1(int position) {
        if (!this.f1111x) {
            m1 m1Var = this.f1089m;
            if (m1Var == null) {
                Log.e("RecyclerView", "Cannot smooth scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            } else {
                m1Var.I1(this, this.f1078g0, position);
            }
        }
    }

    @Override // android.view.View
    public void scrollTo(int x2, int y2) {
        Log.w("RecyclerView", "RecyclerView does not support scrolling to an absolute position. Use scrollToPosition instead");
    }

    @Override // android.view.View
    public void scrollBy(int x2, int y2) {
        m1 m1Var = this.f1089m;
        if (m1Var == null) {
            Log.e("RecyclerView", "Cannot scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
        } else if (!this.f1111x) {
            boolean canScrollHorizontal = m1Var.k();
            boolean canScrollVertical = this.f1089m.l();
            if (canScrollHorizontal || canScrollVertical) {
                int i2 = 0;
                int i3 = canScrollHorizontal ? x2 : 0;
                if (canScrollVertical) {
                    i2 = y2;
                }
                e1(i3, i2, null);
            }
        }
    }

    public void f1(int dx, int dy, int[] consumed) {
        p1();
        F0();
        d.a("RV Scroll");
        Q(this.f1078g0);
        int consumedX = 0;
        int consumedY = 0;
        if (dx != 0) {
            consumedX = this.f1089m.w1(dx, this.f1069c, this.f1078g0);
        }
        if (dy != 0) {
            consumedY = this.f1089m.y1(dy, this.f1069c, this.f1078g0);
        }
        d.b();
        Y0();
        G0();
        r1(false);
        if (consumed != null) {
            consumed[0] = consumedX;
            consumed[1] = consumedY;
        }
    }

    public void u() {
        if (!this.f1105u || this.C) {
            d.a("RV FullInvalidate");
            B();
            d.b();
        } else if (this.f1073e.n()) {
            if (this.f1073e.m(4) && !this.f1073e.m(11)) {
                d.a("RV PartialInvalidate");
                p1();
                F0();
                this.f1073e.r();
                if (!this.f1109w) {
                    if (m0()) {
                        B();
                    } else {
                        this.f1073e.g();
                    }
                }
                r1(true);
                G0();
                d.b();
            } else if (this.f1073e.n()) {
                d.a("RV FullInvalidate");
                B();
                d.b();
            }
        }
    }

    public final boolean m0() {
        int childCount = this.f1075f.g();
        for (int i2 = 0; i2 < childCount; i2++) {
            e2 holder = f0(this.f1075f.f(i2));
            if (!(holder == null || holder.J() || !holder.y())) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x00b8, code lost:
        if (r3 != 0) goto L_0x00bd;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean e1(int r22, int r23, android.view.MotionEvent r24) {
        /*
            Method dump skipped, instructions count: 210
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.e1(int, int, android.view.MotionEvent):boolean");
    }

    @Override // android.view.View
    public int computeHorizontalScrollOffset() {
        m1 m1Var = this.f1089m;
        if (m1Var != null && m1Var.k()) {
            return this.f1089m.r(this.f1078g0);
        }
        return 0;
    }

    @Override // android.view.View
    public int computeHorizontalScrollExtent() {
        m1 m1Var = this.f1089m;
        if (m1Var != null && m1Var.k()) {
            return this.f1089m.q(this.f1078g0);
        }
        return 0;
    }

    @Override // android.view.View
    public int computeHorizontalScrollRange() {
        m1 m1Var = this.f1089m;
        if (m1Var != null && m1Var.k()) {
            return this.f1089m.s(this.f1078g0);
        }
        return 0;
    }

    @Override // android.view.View
    public int computeVerticalScrollOffset() {
        m1 m1Var = this.f1089m;
        if (m1Var != null && m1Var.l()) {
            return this.f1089m.u(this.f1078g0);
        }
        return 0;
    }

    @Override // android.view.View
    public int computeVerticalScrollExtent() {
        m1 m1Var = this.f1089m;
        if (m1Var != null && m1Var.l()) {
            return this.f1089m.t(this.f1078g0);
        }
        return 0;
    }

    @Override // android.view.View
    public int computeVerticalScrollRange() {
        m1 m1Var = this.f1089m;
        if (m1Var != null && m1Var.l()) {
            return this.f1089m.v(this.f1078g0);
        }
        return 0;
    }

    public void p1() {
        int i2 = this.f1107v + 1;
        this.f1107v = i2;
        if (i2 == 1 && !this.f1111x) {
            this.f1109w = false;
        }
    }

    public void r1(boolean performLayoutChildren) {
        if (this.f1107v < 1) {
            this.f1107v = 1;
        }
        if (!performLayoutChildren && !this.f1111x) {
            this.f1109w = false;
        }
        if (this.f1107v == 1) {
            if (performLayoutChildren && this.f1109w && !this.f1111x && this.f1089m != null && this.f1087l != null) {
                B();
            }
            if (!this.f1111x) {
                this.f1109w = false;
            }
        }
        this.f1107v--;
    }

    @Override // android.view.ViewGroup
    public final void suppressLayout(boolean suppress) {
        if (suppress != this.f1111x) {
            o("Do not suppressLayout in layout or scroll");
            if (!suppress) {
                this.f1111x = false;
                if (!(!this.f1109w || this.f1089m == null || this.f1087l == null)) {
                    requestLayout();
                }
                this.f1109w = false;
                return;
            }
            long now = SystemClock.uptimeMillis();
            MotionEvent cancelEvent = MotionEvent.obtain(now, now, 3, 0.0f, 0.0f, 0);
            onTouchEvent(cancelEvent);
            this.f1111x = true;
            this.f1112y = true;
            t1();
        }
    }

    @Override // android.view.ViewGroup
    public final boolean isLayoutSuppressed() {
        return this.f1111x;
    }

    @Deprecated
    public void setLayoutFrozen(boolean frozen) {
        suppressLayout(frozen);
    }

    @Override // android.view.ViewGroup
    @Deprecated
    public void setLayoutTransition(LayoutTransition transition) {
        if (transition == null) {
            super.setLayoutTransition(null);
            return;
        }
        throw new IllegalArgumentException("Providing a LayoutTransition into RecyclerView is not supported. Please use setItemAnimator() instead for animating changes to the items in this RecyclerView");
    }

    public void k1(int dx, int dy) {
        l1(dx, dy, null);
    }

    public void l1(int dx, int dy, Interpolator interpolator) {
        m1(dx, dy, interpolator, Integer.MIN_VALUE);
    }

    public void m1(int dx, int dy, Interpolator interpolator, int duration) {
        n1(dx, dy, interpolator, duration, false);
    }

    public void n1(int dx, int dy, Interpolator interpolator, int duration, boolean withNestedScrolling) {
        m1 m1Var = this.f1089m;
        if (m1Var == null) {
            Log.e("RecyclerView", "Cannot smooth scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
        } else if (!this.f1111x) {
            if (!m1Var.k()) {
                dx = 0;
            }
            if (!this.f1089m.l()) {
                dy = 0;
            }
            if (dx != 0 || dy != 0) {
                boolean durationSuggestsAnimation = duration == Integer.MIN_VALUE || duration > 0;
                if (durationSuggestsAnimation) {
                    if (withNestedScrolling) {
                        int nestedScrollAxis = 0;
                        if (dx != 0) {
                            nestedScrollAxis = 0 | 1;
                        }
                        if (dy != 0) {
                            nestedScrollAxis |= 2;
                        }
                        q1(nestedScrollAxis, 1);
                    }
                    this.f1072d0.f(dx, dy, duration, interpolator);
                    return;
                }
                scrollBy(dx, dy);
            }
        }
    }

    public boolean a0(int velocityX, int velocityY) {
        m1 m1Var = this.f1089m;
        if (m1Var == null) {
            Log.e("RecyclerView", "Cannot fling without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            return false;
        } else if (this.f1111x) {
            return false;
        } else {
            boolean canScrollHorizontal = m1Var.k();
            boolean canScrollVertical = this.f1089m.l();
            if (!canScrollHorizontal || Math.abs(velocityX) < this.V) {
                velocityX = 0;
            }
            if (!canScrollVertical || Math.abs(velocityY) < this.V) {
                velocityY = 0;
            }
            if (!(velocityX == 0 && velocityY == 0) && !dispatchNestedPreFling(velocityX, velocityY)) {
                boolean canScroll = canScrollHorizontal || canScrollVertical;
                dispatchNestedFling(velocityX, velocityY, canScroll);
                o1 o1Var = this.U;
                if (o1Var != null && o1Var.a(velocityX, velocityY)) {
                    return true;
                }
                if (canScroll) {
                    int nestedScrollAxis = 0;
                    if (canScrollHorizontal) {
                        nestedScrollAxis = 0 | 1;
                    }
                    if (canScrollVertical) {
                        nestedScrollAxis |= 2;
                    }
                    q1(nestedScrollAxis, 1);
                    int i2 = this.W;
                    int velocityX2 = Math.max(-i2, Math.min(velocityX, i2));
                    int i3 = this.W;
                    this.f1072d0.c(velocityX2, Math.max(-i3, Math.min(velocityY, i3)));
                    return true;
                }
            }
            return false;
        }
    }

    public void t1() {
        setScrollState(0);
        u1();
    }

    public final void u1() {
        this.f1072d0.g();
        m1 m1Var = this.f1089m;
        if (m1Var != null) {
            m1Var.K1();
        }
    }

    public int getMinFlingVelocity() {
        return this.V;
    }

    public int getMaxFlingVelocity() {
        return this.W;
    }

    public final void P0(float x2, float overscrollX, float y2, float overscrollY) {
        boolean invalidate = false;
        if (overscrollX < 0.0f) {
            M();
            g.c(this.H, (-overscrollX) / getWidth(), 1.0f - (y2 / getHeight()));
            invalidate = true;
        } else if (overscrollX > 0.0f) {
            N();
            g.c(this.J, overscrollX / getWidth(), y2 / getHeight());
            invalidate = true;
        }
        if (overscrollY < 0.0f) {
            O();
            g.c(this.I, (-overscrollY) / getHeight(), x2 / getWidth());
            invalidate = true;
        } else if (overscrollY > 0.0f) {
            L();
            g.c(this.K, overscrollY / getHeight(), 1.0f - (x2 / getWidth()));
            invalidate = true;
        }
        if (invalidate || overscrollX != 0.0f || overscrollY != 0.0f) {
            c1.c0(this);
        }
    }

    public final void S0() {
        boolean needsInvalidate = false;
        EdgeEffect edgeEffect = this.H;
        if (edgeEffect != null) {
            edgeEffect.onRelease();
            needsInvalidate = this.H.isFinished();
        }
        EdgeEffect edgeEffect2 = this.I;
        if (edgeEffect2 != null) {
            edgeEffect2.onRelease();
            needsInvalidate |= this.I.isFinished();
        }
        EdgeEffect edgeEffect3 = this.J;
        if (edgeEffect3 != null) {
            edgeEffect3.onRelease();
            needsInvalidate |= this.J.isFinished();
        }
        EdgeEffect edgeEffect4 = this.K;
        if (edgeEffect4 != null) {
            edgeEffect4.onRelease();
            needsInvalidate |= this.K.isFinished();
        }
        if (needsInvalidate) {
            c1.c0(this);
        }
    }

    public void t(int dx, int dy) {
        boolean needsInvalidate = false;
        EdgeEffect edgeEffect = this.H;
        if (edgeEffect != null && !edgeEffect.isFinished() && dx > 0) {
            this.H.onRelease();
            needsInvalidate = this.H.isFinished();
        }
        EdgeEffect edgeEffect2 = this.J;
        if (edgeEffect2 != null && !edgeEffect2.isFinished() && dx < 0) {
            this.J.onRelease();
            needsInvalidate |= this.J.isFinished();
        }
        EdgeEffect edgeEffect3 = this.I;
        if (edgeEffect3 != null && !edgeEffect3.isFinished() && dy > 0) {
            this.I.onRelease();
            needsInvalidate |= this.I.isFinished();
        }
        EdgeEffect edgeEffect4 = this.K;
        if (edgeEffect4 != null && !edgeEffect4.isFinished() && dy < 0) {
            this.K.onRelease();
            needsInvalidate |= this.K.isFinished();
        }
        if (needsInvalidate) {
            c1.c0(this);
        }
    }

    public void a(int velocityX, int velocityY) {
        if (velocityX < 0) {
            M();
            if (this.H.isFinished()) {
                this.H.onAbsorb(-velocityX);
            }
        } else if (velocityX > 0) {
            N();
            if (this.J.isFinished()) {
                this.J.onAbsorb(velocityX);
            }
        }
        if (velocityY < 0) {
            O();
            if (this.I.isFinished()) {
                this.I.onAbsorb(-velocityY);
            }
        } else if (velocityY > 0) {
            L();
            if (this.K.isFinished()) {
                this.K.onAbsorb(velocityY);
            }
        }
        if (velocityX != 0 || velocityY != 0) {
            c1.c0(this);
        }
    }

    public void M() {
        if (this.H == null) {
            EdgeEffect a2 = this.G.a(this);
            this.H = a2;
            if (this.f1079h) {
                a2.setSize((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight());
            } else {
                a2.setSize(getMeasuredHeight(), getMeasuredWidth());
            }
        }
    }

    public void N() {
        if (this.J == null) {
            EdgeEffect a2 = this.G.a(this);
            this.J = a2;
            if (this.f1079h) {
                a2.setSize((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight());
            } else {
                a2.setSize(getMeasuredHeight(), getMeasuredWidth());
            }
        }
    }

    public void O() {
        if (this.I == null) {
            EdgeEffect a2 = this.G.a(this);
            this.I = a2;
            if (this.f1079h) {
                a2.setSize((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom());
            } else {
                a2.setSize(getMeasuredWidth(), getMeasuredHeight());
            }
        }
    }

    public void L() {
        if (this.K == null) {
            EdgeEffect a2 = this.G.a(this);
            this.K = a2;
            if (this.f1079h) {
                a2.setSize((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom());
            } else {
                a2.setSize(getMeasuredWidth(), getMeasuredHeight());
            }
        }
    }

    public void r0() {
        this.K = null;
        this.I = null;
        this.J = null;
        this.H = null;
    }

    public void setEdgeEffectFactory(b1 edgeEffectFactory) {
        h.e(edgeEffectFactory);
        this.G = edgeEffectFactory;
        r0();
    }

    public b1 getEdgeEffectFactory() {
        return this.G;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public View focusSearch(View focused, int direction) {
        View result;
        this.f1089m.Q0();
        if (0 != 0) {
            return null;
        }
        boolean needsFocusFailureLayout = true;
        boolean canRunFocusFailure = this.f1087l != null && this.f1089m != null && !t0() && !this.f1111x;
        FocusFinder ff = FocusFinder.getInstance();
        if (!canRunFocusFailure || !(direction == 2 || direction == 1)) {
            result = ff.findNextFocus(this, focused, direction);
            if (result == null && canRunFocusFailure) {
                u();
                View focusedItemView = R(focused);
                if (focusedItemView == null) {
                    return null;
                }
                p1();
                result = this.f1089m.J0(focused, direction, this.f1069c, this.f1078g0);
                r1(false);
            }
        } else {
            needsFocusFailureLayout = false;
            if (this.f1089m.l()) {
                int absDir = direction == 2 ? 130 : 33;
                View found = ff.findNextFocus(this, focused, absDir);
                needsFocusFailureLayout = found == null;
            }
            if (!needsFocusFailureLayout && this.f1089m.k()) {
                boolean rtl = this.f1089m.Z() == 1;
                int absDir2 = (direction == 2) ^ rtl ? 66 : 17;
                View found2 = ff.findNextFocus(this, focused, absDir2);
                if (found2 != null) {
                    needsFocusFailureLayout = false;
                }
            }
            if (needsFocusFailureLayout) {
                u();
                View focusedItemView2 = R(focused);
                if (focusedItemView2 == null) {
                    return null;
                }
                p1();
                this.f1089m.J0(focused, direction, this.f1069c, this.f1078g0);
                r1(false);
            }
            result = ff.findNextFocus(this, focused, direction);
        }
        if (result == null || result.hasFocusable()) {
            return u0(focused, result, direction) ? result : super.focusSearch(focused, direction);
        }
        if (getFocusedChild() == null) {
            return super.focusSearch(focused, direction);
        }
        Z0(result, null);
        return focused;
    }

    public final boolean u0(View focused, View next, int direction) {
        if (next == null || next == this || R(next) == null) {
            return false;
        }
        if (focused == null || R(focused) == null) {
            return true;
        }
        this.f1081i.set(0, 0, focused.getWidth(), focused.getHeight());
        this.f1083j.set(0, 0, next.getWidth(), next.getHeight());
        offsetDescendantRectToMyCoords(focused, this.f1081i);
        offsetDescendantRectToMyCoords(next, this.f1083j);
        int rtl = this.f1089m.Z() == 1 ? -1 : 1;
        int rightness = 0;
        Rect rect = this.f1081i;
        int i2 = rect.left;
        Rect rect2 = this.f1083j;
        int i3 = rect2.left;
        if ((i2 < i3 || rect.right <= i3) && rect.right < rect2.right) {
            rightness = 1;
        } else {
            int i4 = rect.right;
            int i5 = rect2.right;
            if ((i4 > i5 || i2 >= i5) && i2 > i3) {
                rightness = -1;
            }
        }
        int downness = 0;
        int i6 = rect.top;
        int i7 = rect2.top;
        if ((i6 < i7 || rect.bottom <= i7) && rect.bottom < rect2.bottom) {
            downness = 1;
        } else {
            int i8 = rect.bottom;
            int i9 = rect2.bottom;
            if ((i8 > i9 || i6 >= i9) && i6 > i7) {
                downness = -1;
            }
        }
        switch (direction) {
            case 1:
                if (downness < 0 || (downness == 0 && rightness * rtl <= 0)) {
                    return true;
                }
                return false;
            case 2:
                if (downness > 0 || (downness == 0 && rightness * rtl >= 0)) {
                    return true;
                }
                return false;
            case 17:
                if (rightness < 0) {
                    return true;
                }
                return false;
            case 33:
                if (downness < 0) {
                    return true;
                }
                return false;
            case 66:
                if (rightness > 0) {
                    return true;
                }
                return false;
            case 130:
                if (downness > 0) {
                    return true;
                }
                return false;
            default:
                throw new IllegalArgumentException("Invalid direction: " + direction + P());
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestChildFocus(View child, View focused) {
        if (!this.f1089m.b1(this, child, focused) && focused != null) {
            Z0(child, focused);
        }
        super.requestChildFocus(child, focused);
    }

    public final void Z0(View child, View focused) {
        View rectView = focused != null ? focused : child;
        this.f1081i.set(0, 0, rectView.getWidth(), rectView.getHeight());
        ViewGroup.LayoutParams focusedLayoutParams = rectView.getLayoutParams();
        if (focusedLayoutParams instanceof n1) {
            n1 lp = (n1) focusedLayoutParams;
            if (!lp.f3144c) {
                Rect insets = lp.f3143b;
                Rect rect = this.f1081i;
                rect.left -= insets.left;
                rect.right += insets.right;
                rect.top -= insets.top;
                rect.bottom += insets.bottom;
            }
        }
        if (focused != null) {
            offsetDescendantRectToMyCoords(focused, this.f1081i);
            offsetRectIntoDescendantCoords(child, this.f1081i);
        }
        m1 m1Var = this.f1089m;
        Rect rect2 = this.f1081i;
        boolean z2 = true;
        boolean z3 = !this.f1105u;
        if (focused != null) {
            z2 = false;
        }
        m1Var.s1(this, child, rect2, z3, z2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean requestChildRectangleOnScreen(View child, Rect rect, boolean immediate) {
        return this.f1089m.r1(this, child, rect, immediate);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void addFocusables(ArrayList arrayList, int direction, int focusableMode) {
        m1 m1Var = this.f1089m;
        if (m1Var != null) {
            m1Var.F0();
        }
        super.addFocusables(arrayList, direction, focusableMode);
    }

    @Override // android.view.ViewGroup
    public boolean onRequestFocusInDescendants(int direction, Rect previouslyFocusedRect) {
        if (t0()) {
            return false;
        }
        return super.onRequestFocusInDescendants(direction, previouslyFocusedRect);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.E = 0;
        boolean z2 = true;
        this.f1099r = true;
        if (!this.f1105u || isLayoutRequested()) {
            z2 = false;
        }
        this.f1105u = z2;
        m1 m1Var = this.f1089m;
        if (m1Var != null) {
            m1Var.z(this);
        }
        this.f1090m0 = false;
        ThreadLocal threadLocal = z.f3279f;
        z zVar = (z) threadLocal.get();
        this.f1074e0 = zVar;
        if (zVar == null) {
            this.f1074e0 = new z();
            Display display = c1.u(this);
            float refreshRate = 60.0f;
            if (!isInEditMode() && display != null) {
                float displayRefreshRate = display.getRefreshRate();
                if (displayRefreshRate >= 30.0f) {
                    refreshRate = displayRefreshRate;
                }
            }
            z zVar2 = this.f1074e0;
            zVar2.f3283d = 1.0E9f / refreshRate;
            threadLocal.set(zVar2);
        }
        this.f1074e0.a(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        f1 f1Var = this.L;
        if (f1Var != null) {
            f1Var.k();
        }
        t1();
        this.f1099r = false;
        m1 m1Var = this.f1089m;
        if (m1Var != null) {
            m1Var.A(this, this.f1069c);
        }
        this.f1106u0.clear();
        removeCallbacks(this.f1108v0);
        this.f1077g.j();
        z zVar = this.f1074e0;
        if (zVar != null) {
            zVar.j(this);
            this.f1074e0 = null;
        }
    }

    @Override // android.view.View
    public boolean isAttachedToWindow() {
        return this.f1099r;
    }

    public void o(String message) {
        if (t0()) {
            if (message == null) {
                throw new IllegalStateException("Cannot call this method while RecyclerView is computing a layout or scrolling" + P());
            }
            throw new IllegalStateException(message);
        } else if (this.F > 0) {
            Log.w("RecyclerView", "Cannot call this method in a scroll callback. Scroll callbacks mightbe run during a measure & layout pass where you cannot change theRecyclerView data. Any method call that might change the structureof the RecyclerView or the adapter contents should be postponed tothe next frame.", new IllegalStateException("" + P()));
        }
    }

    public void j(p1 listener) {
        this.f1095p.add(listener);
    }

    public void W0(p1 listener) {
        this.f1095p.remove(listener);
        if (this.f1097q == listener) {
            this.f1097q = null;
        }
    }

    public final boolean K(MotionEvent e2) {
        p1 p1Var = this.f1097q;
        if (p1Var != null) {
            ((q0.v) p1Var).u(this, e2);
            int action = e2.getAction();
            if (action == 3 || action == 1) {
                this.f1097q = null;
            }
            return true;
        } else if (e2.getAction() == 0) {
            return false;
        } else {
            return T(e2);
        }
    }

    public final boolean T(MotionEvent e2) {
        int action = e2.getAction();
        int listenerCount = this.f1095p.size();
        for (int i2 = 0; i2 < listenerCount; i2++) {
            p1 listener = (p1) this.f1095p.get(i2);
            if (((q0.v) listener).s(this, e2) && action != 3) {
                this.f1097q = listener;
                return true;
            }
        }
        return false;
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent e2) {
        if (this.f1111x) {
            return false;
        }
        this.f1097q = null;
        if (T(e2)) {
            q();
            return true;
        }
        m1 m1Var = this.f1089m;
        if (m1Var == null) {
            return false;
        }
        boolean canScrollHorizontally = m1Var.k();
        boolean canScrollVertically = this.f1089m.l();
        if (this.O == null) {
            this.O = VelocityTracker.obtain();
        }
        this.O.addMovement(e2);
        int action = e2.getActionMasked();
        int actionIndex = e2.getActionIndex();
        switch (action) {
            case 0:
                if (this.f1112y) {
                    this.f1112y = false;
                }
                this.N = e2.getPointerId(0);
                int x2 = (int) (e2.getX() + 0.5f);
                this.R = x2;
                this.P = x2;
                int y2 = (int) (e2.getY() + 0.5f);
                this.S = y2;
                this.Q = y2;
                if (this.M == 2) {
                    getParent().requestDisallowInterceptTouchEvent(true);
                    setScrollState(1);
                    s1(1);
                }
                int[] iArr = this.f1102s0;
                iArr[1] = 0;
                iArr[0] = 0;
                int nestedScrollAxis = 0;
                if (canScrollHorizontally) {
                    nestedScrollAxis = 0 | 1;
                }
                if (canScrollVertically) {
                    nestedScrollAxis |= 2;
                }
                q1(nestedScrollAxis, 0);
                break;
            case 1:
                this.O.clear();
                s1(0);
                break;
            case 2:
                int index = e2.findPointerIndex(this.N);
                if (index >= 0) {
                    int x3 = (int) (e2.getX(index) + 0.5f);
                    int y3 = (int) (e2.getY(index) + 0.5f);
                    if (this.M != 1) {
                        int dx = x3 - this.P;
                        int dy = y3 - this.Q;
                        boolean startScroll = false;
                        if (canScrollHorizontally && Math.abs(dx) > this.T) {
                            this.R = x3;
                            startScroll = true;
                        }
                        if (canScrollVertically && Math.abs(dy) > this.T) {
                            this.S = y3;
                            startScroll = true;
                        }
                        if (startScroll) {
                            setScrollState(1);
                            break;
                        }
                    }
                } else {
                    Log.e("RecyclerView", "Error processing scroll; pointer index for id " + this.N + " not found. Did any MotionEvents get skipped?");
                    return false;
                }
                break;
            case 3:
                q();
                break;
            case 5:
                this.N = e2.getPointerId(actionIndex);
                int x4 = (int) (e2.getX(actionIndex) + 0.5f);
                this.R = x4;
                this.P = x4;
                int y4 = (int) (e2.getY(actionIndex) + 0.5f);
                this.S = y4;
                this.Q = y4;
                break;
            case 6:
                I0(e2);
                break;
        }
        int nestedScrollAxis2 = this.M;
        return nestedScrollAxis2 == 1;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestDisallowInterceptTouchEvent(boolean disallowIntercept) {
        int listenerCount = this.f1095p.size();
        for (int i2 = 0; i2 < listenerCount; i2++) {
            p1 listener = (p1) this.f1095p.get(i2);
            ((q0.v) listener).t(disallowIntercept);
        }
        super.requestDisallowInterceptTouchEvent(disallowIntercept);
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent e2) {
        float xvel;
        float yvel;
        int dy;
        int dx;
        int dy2;
        char c2;
        int dx2;
        int i2 = 0;
        if (this.f1111x || this.f1112y) {
            return false;
        }
        int i3 = 1;
        if (K(e2)) {
            q();
            return true;
        }
        m1 m1Var = this.f1089m;
        if (m1Var == null) {
            return false;
        }
        boolean canScrollHorizontally = m1Var.k();
        boolean canScrollVertically = this.f1089m.l();
        if (this.O == null) {
            this.O = VelocityTracker.obtain();
        }
        boolean eventAddedToVelocityTracker = false;
        int action = e2.getActionMasked();
        int actionIndex = e2.getActionIndex();
        if (action == 0) {
            int[] iArr = this.f1102s0;
            iArr[1] = 0;
            iArr[0] = 0;
        }
        MotionEvent vtev = MotionEvent.obtain(e2);
        int[] iArr2 = this.f1102s0;
        vtev.offsetLocation(iArr2[0], iArr2[1]);
        switch (action) {
            case 0:
                this.N = e2.getPointerId(0);
                int x2 = (int) (e2.getX() + 0.5f);
                this.R = x2;
                this.P = x2;
                int y2 = (int) (e2.getY() + 0.5f);
                this.S = y2;
                this.Q = y2;
                int nestedScrollAxis = 0;
                if (canScrollHorizontally) {
                    nestedScrollAxis = 0 | 1;
                }
                if (canScrollVertically) {
                    nestedScrollAxis |= 2;
                }
                q1(nestedScrollAxis, 0);
                break;
            case 1:
                this.O.addMovement(vtev);
                eventAddedToVelocityTracker = true;
                this.O.computeCurrentVelocity(1000, this.W);
                if (canScrollHorizontally) {
                    xvel = -this.O.getXVelocity(this.N);
                } else {
                    xvel = 0.0f;
                }
                if (canScrollVertically) {
                    yvel = -this.O.getYVelocity(this.N);
                } else {
                    yvel = 0.0f;
                }
                if ((xvel == 0.0f && yvel == 0.0f) || !a0((int) xvel, (int) yvel)) {
                    setScrollState(0);
                }
                b1();
                break;
            case 2:
                int index = e2.findPointerIndex(this.N);
                if (index >= 0) {
                    int x3 = (int) (e2.getX(index) + 0.5f);
                    int y3 = (int) (e2.getY(index) + 0.5f);
                    int dx3 = this.R - x3;
                    int dy3 = this.S - y3;
                    if (this.M != 1) {
                        boolean startScroll = false;
                        if (canScrollHorizontally) {
                            if (dx3 > 0) {
                                dx3 = Math.max(0, dx3 - this.T);
                            } else {
                                dx3 = Math.min(0, this.T + dx3);
                            }
                            if (dx3 != 0) {
                                startScroll = true;
                            }
                        }
                        if (canScrollVertically) {
                            if (dy3 > 0) {
                                dy3 = Math.max(0, dy3 - this.T);
                            } else {
                                dy3 = Math.min(0, this.T + dy3);
                            }
                            if (dy3 != 0) {
                                startScroll = true;
                            }
                        }
                        if (startScroll) {
                            i3 = 1;
                            setScrollState(1);
                        } else {
                            i3 = 1;
                        }
                        dx = dx3;
                        dy = dy3;
                    } else {
                        dx = dx3;
                        dy = dy3;
                    }
                    if (this.M != i3) {
                        break;
                    } else {
                        int[] iArr3 = this.f1104t0;
                        iArr3[0] = 0;
                        iArr3[i3] = 0;
                        if (F(canScrollHorizontally ? dx : 0, canScrollVertically ? dy : 0, iArr3, this.f1100r0, 0)) {
                            int[] iArr4 = this.f1104t0;
                            int dx4 = dx - iArr4[0];
                            c2 = 1;
                            int dy4 = dy - iArr4[1];
                            int[] iArr5 = this.f1102s0;
                            int i4 = iArr5[0];
                            int[] iArr6 = this.f1100r0;
                            iArr5[0] = i4 + iArr6[0];
                            iArr5[1] = iArr5[1] + iArr6[1];
                            getParent().requestDisallowInterceptTouchEvent(true);
                            dx2 = dx4;
                            dy2 = dy4;
                        } else {
                            c2 = 1;
                            dx2 = dx;
                            dy2 = dy;
                        }
                        int[] iArr7 = this.f1100r0;
                        this.R = x3 - iArr7[0];
                        this.S = y3 - iArr7[c2];
                        int i5 = canScrollHorizontally ? dx2 : 0;
                        if (canScrollVertically) {
                            i2 = dy2;
                        }
                        if (e1(i5, i2, e2)) {
                            getParent().requestDisallowInterceptTouchEvent(true);
                        }
                        z zVar = this.f1074e0;
                        if (!(zVar == null || (dx2 == 0 && dy2 == 0))) {
                            zVar.f(this, dx2, dy2);
                            break;
                        }
                    }
                } else {
                    Log.e("RecyclerView", "Error processing scroll; pointer index for id " + this.N + " not found. Did any MotionEvents get skipped?");
                    return false;
                }
                break;
            case 3:
                q();
                break;
            case 5:
                this.N = e2.getPointerId(actionIndex);
                int x4 = (int) (e2.getX(actionIndex) + 0.5f);
                this.R = x4;
                this.P = x4;
                int y4 = (int) (e2.getY(actionIndex) + 0.5f);
                this.S = y4;
                this.Q = y4;
                break;
            case 6:
                I0(e2);
                break;
        }
        if (!eventAddedToVelocityTracker) {
            this.O.addMovement(vtev);
        }
        vtev.recycle();
        return true;
    }

    public final void b1() {
        VelocityTracker velocityTracker = this.O;
        if (velocityTracker != null) {
            velocityTracker.clear();
        }
        s1(0);
        S0();
    }

    public final void q() {
        b1();
        setScrollState(0);
    }

    public final void I0(MotionEvent e2) {
        int actionIndex = e2.getActionIndex();
        if (e2.getPointerId(actionIndex) == this.N) {
            int newIndex = actionIndex == 0 ? 1 : 0;
            this.N = e2.getPointerId(newIndex);
            int x2 = (int) (e2.getX(newIndex) + 0.5f);
            this.R = x2;
            this.P = x2;
            int y2 = (int) (e2.getY(newIndex) + 0.5f);
            this.S = y2;
            this.Q = y2;
        }
    }

    @Override // android.view.View
    public boolean onGenericMotionEvent(MotionEvent event) {
        float hScroll;
        float vScroll;
        if (this.f1089m != null && !this.f1111x && event.getAction() == 8) {
            if ((event.getSource() & 2) != 0) {
                if (this.f1089m.l()) {
                    vScroll = -event.getAxisValue(9);
                } else {
                    vScroll = 0.0f;
                }
                if (this.f1089m.k()) {
                    hScroll = event.getAxisValue(10);
                } else {
                    hScroll = 0.0f;
                }
            } else if ((event.getSource() & 4194304) != 0) {
                float axisScroll = event.getAxisValue(26);
                if (this.f1089m.l()) {
                    vScroll = -axisScroll;
                    hScroll = 0.0f;
                } else if (this.f1089m.k()) {
                    vScroll = 0.0f;
                    hScroll = axisScroll;
                } else {
                    vScroll = 0.0f;
                    hScroll = 0.0f;
                }
            } else {
                vScroll = 0.0f;
                hScroll = 0.0f;
            }
            if (!(vScroll == 0.0f && hScroll == 0.0f)) {
                e1((int) (this.f1066a0 * hScroll), (int) (this.f1068b0 * vScroll), event);
            }
        }
        return false;
    }

    @Override // android.view.View
    public void onMeasure(int widthSpec, int heightSpec) {
        m1 m1Var = this.f1089m;
        if (m1Var == null) {
            w(widthSpec, heightSpec);
            return;
        }
        boolean measureSpecModeIsExactly = false;
        if (m1Var.s0()) {
            int widthMode = View.MeasureSpec.getMode(widthSpec);
            int heightMode = View.MeasureSpec.getMode(heightSpec);
            this.f1089m.Z0(widthSpec, heightSpec);
            if (widthMode == 1073741824 && heightMode == 1073741824) {
                measureSpecModeIsExactly = true;
            }
            if (!measureSpecModeIsExactly && this.f1087l != null) {
                if (this.f1078g0.f2970d == 1) {
                    C();
                }
                this.f1089m.A1(widthSpec, heightSpec);
                this.f1078g0.f2975i = true;
                D();
                this.f1089m.D1(widthSpec, heightSpec);
                if (this.f1089m.G1()) {
                    this.f1089m.A1(View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824));
                    this.f1078g0.f2975i = true;
                    D();
                    this.f1089m.D1(widthSpec, heightSpec);
                }
            }
        } else if (this.f1101s) {
            this.f1089m.Z0(widthSpec, heightSpec);
        } else {
            if (this.A) {
                p1();
                F0();
                N0();
                G0();
                b2 b2Var = this.f1078g0;
                if (b2Var.f2977k) {
                    b2Var.f2973g = true;
                } else {
                    this.f1073e.h();
                    this.f1078g0.f2973g = false;
                }
                this.A = false;
                r1(false);
            } else if (this.f1078g0.f2977k) {
                setMeasuredDimension(getMeasuredWidth(), getMeasuredHeight());
                return;
            }
            x0 x0Var = this.f1087l;
            if (x0Var != null) {
                this.f1078g0.f2971e = x0Var.c();
            } else {
                this.f1078g0.f2971e = 0;
            }
            p1();
            this.f1089m.Z0(widthSpec, heightSpec);
            r1(false);
            this.f1078g0.f2973g = false;
        }
    }

    public void w(int widthSpec, int heightSpec) {
        int width = m1.n(widthSpec, getPaddingLeft() + getPaddingRight(), c1.C(this));
        int height = m1.n(heightSpec, getPaddingTop() + getPaddingBottom(), c1.B(this));
        setMeasuredDimension(width, height);
    }

    @Override // android.view.View
    public void onSizeChanged(int w2, int h2, int oldw, int oldh) {
        super.onSizeChanged(w2, h2, oldw, oldh);
        if (w2 != oldw || h2 != oldh) {
            r0();
        }
    }

    public void setItemAnimator(f1 animator) {
        f1 f1Var = this.L;
        if (f1Var != null) {
            f1Var.k();
            this.L.v(null);
        }
        this.L = animator;
        if (animator != null) {
            animator.v(this.f1088l0);
        }
    }

    public void F0() {
        this.E++;
    }

    public void G0() {
        H0(true);
    }

    public void H0(boolean enableChangeEvents) {
        int i2 = this.E - 1;
        this.E = i2;
        if (i2 < 1) {
            this.E = 0;
            if (enableChangeEvents) {
                A();
                J();
            }
        }
    }

    public boolean s0() {
        AccessibilityManager accessibilityManager = this.B;
        return accessibilityManager != null && accessibilityManager.isEnabled();
    }

    public final void A() {
        int flags = this.f1113z;
        this.f1113z = 0;
        if (flags != 0 && s0()) {
            AccessibilityEvent event = AccessibilityEvent.obtain();
            event.setEventType(2048);
            b.b(event, flags);
            sendAccessibilityEventUnchecked(event);
        }
    }

    public boolean t0() {
        return this.E > 0;
    }

    public boolean j1(AccessibilityEvent event) {
        if (!t0()) {
            return false;
        }
        int type = 0;
        if (event != null) {
            type = b.a(event);
        }
        if (type == 0) {
            type = 0;
        }
        this.f1113z |= type;
        return true;
    }

    @Override // android.view.View, android.view.accessibility.AccessibilityEventSource
    public void sendAccessibilityEventUnchecked(AccessibilityEvent event) {
        if (!j1(event)) {
            super.sendAccessibilityEventUnchecked(event);
        }
    }

    @Override // android.view.View
    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent event) {
        onPopulateAccessibilityEvent(event);
        return true;
    }

    public f1 getItemAnimator() {
        return this.L;
    }

    public void L0() {
        if (!this.f1090m0 && this.f1099r) {
            c1.d0(this, this.f1108v0);
            this.f1090m0 = true;
        }
    }

    public final boolean M0() {
        return this.L != null && this.f1089m.L1();
    }

    public final void N0() {
        boolean z2;
        if (this.C) {
            this.f1073e.u();
            if (this.D) {
                this.f1089m.S0(this);
            }
        }
        if (M0()) {
            this.f1073e.r();
        } else {
            this.f1073e.h();
        }
        boolean z3 = false;
        boolean animationTypeSupported = this.f1084j0 || this.f1086k0;
        this.f1078g0.f2976j = this.f1105u && this.L != null && ((z2 = this.C) || animationTypeSupported || this.f1089m.f3121h) && (!z2 || this.f1087l.g());
        b2 b2Var = this.f1078g0;
        if (b2Var.f2976j && animationTypeSupported && !this.C && M0()) {
            z3 = true;
        }
        b2Var.f2977k = z3;
    }

    public void B() {
        if (this.f1087l == null) {
            Log.e("RecyclerView", "No adapter attached; skipping layout");
        } else if (this.f1089m == null) {
            Log.e("RecyclerView", "No layout manager attached; skipping layout");
        } else {
            b2 b2Var = this.f1078g0;
            b2Var.f2975i = false;
            if (b2Var.f2970d == 1) {
                C();
                this.f1089m.z1(this);
                D();
            } else if (!this.f1073e.o() && this.f1089m.o0() == getWidth() && this.f1089m.W() == getHeight()) {
                this.f1089m.z1(this);
            } else {
                this.f1089m.z1(this);
                D();
            }
            E();
        }
    }

    public final void c1() {
        int i2;
        View child = null;
        if (this.f1070c0 && hasFocus() && this.f1087l != null) {
            child = getFocusedChild();
        }
        e2 focusedVh = child == null ? null : S(child);
        if (focusedVh == null) {
            a1();
            return;
        }
        this.f1078g0.f2979m = this.f1087l.g() ? focusedVh.k() : -1L;
        b2 b2Var = this.f1078g0;
        if (this.C) {
            i2 = -1;
        } else {
            i2 = focusedVh.v() ? focusedVh.f3021d : focusedVh.j();
        }
        b2Var.f2978l = i2;
        this.f1078g0.f2980n = h0(focusedVh.f3018a);
    }

    public final void a1() {
        b2 b2Var = this.f1078g0;
        b2Var.f2979m = -1L;
        b2Var.f2978l = -1;
        b2Var.f2980n = -1;
    }

    public final View W() {
        e2 nextFocus;
        b2 b2Var = this.f1078g0;
        int startFocusSearchIndex = b2Var.f2978l;
        if (startFocusSearchIndex == -1) {
            startFocusSearchIndex = 0;
        }
        int itemCount = b2Var.b();
        for (int i2 = startFocusSearchIndex; i2 < itemCount; i2++) {
            e2 nextFocus2 = X(i2);
            if (nextFocus2 == null) {
                break;
            } else if (nextFocus2.f3018a.hasFocusable()) {
                return nextFocus2.f3018a;
            }
        }
        int limit = Math.min(itemCount, startFocusSearchIndex);
        for (int i3 = limit - 1; i3 >= 0 && (nextFocus = X(i3)) != null; i3--) {
            if (nextFocus.f3018a.hasFocusable()) {
                return nextFocus.f3018a;
            }
        }
        return null;
    }

    public final void R0() {
        View child;
        if (this.f1070c0 && this.f1087l != null && hasFocus() && getDescendantFocusability() != 393216) {
            if (getDescendantFocusability() != 131072 || !isFocused()) {
                if (!isFocused()) {
                    View focusedChild = getFocusedChild();
                    if (!this.f1075f.n(focusedChild)) {
                        return;
                    }
                }
                e2 focusTarget = null;
                if (this.f1078g0.f2979m != -1 && this.f1087l.g()) {
                    focusTarget = Y(this.f1078g0.f2979m);
                }
                View viewToFocus = null;
                if (focusTarget != null && !this.f1075f.n(focusTarget.f3018a) && focusTarget.f3018a.hasFocusable()) {
                    viewToFocus = focusTarget.f3018a;
                } else if (this.f1075f.g() > 0) {
                    viewToFocus = W();
                }
                if (viewToFocus != null) {
                    int i2 = this.f1078g0.f2980n;
                    if (!(i2 == -1 || (child = viewToFocus.findViewById(i2)) == null || !child.isFocusable())) {
                        viewToFocus = child;
                    }
                    viewToFocus.requestFocus();
                }
            }
        }
    }

    public final int h0(View view) {
        int lastKnownId = view.getId();
        while (!view.isFocused() && (view instanceof ViewGroup) && view.hasFocus()) {
            view = ((ViewGroup) view).getFocusedChild();
            int id = view.getId();
            if (id != -1) {
                lastKnownId = view.getId();
            }
        }
        return lastKnownId;
    }

    public final void Q(b2 state) {
        if (getScrollState() == 2) {
            OverScroller scroller = this.f1072d0.f3005d;
            scroller.getFinalX();
            scroller.getCurrX();
            Objects.requireNonNull(state);
            scroller.getFinalY();
            scroller.getCurrY();
            Objects.requireNonNull(state);
            return;
        }
        Objects.requireNonNull(state);
        Objects.requireNonNull(state);
    }

    public final void C() {
        boolean z2 = true;
        this.f1078g0.a(1);
        Q(this.f1078g0);
        this.f1078g0.f2975i = false;
        p1();
        this.f1077g.f();
        F0();
        N0();
        c1();
        b2 b2Var = this.f1078g0;
        if (!b2Var.f2976j || !this.f1086k0) {
            z2 = false;
        }
        b2Var.f2974h = z2;
        this.f1086k0 = false;
        this.f1084j0 = false;
        b2Var.f2973g = b2Var.f2977k;
        b2Var.f2971e = this.f1087l.c();
        U(this.f1096p0);
        if (this.f1078g0.f2976j) {
            int count = this.f1075f.g();
            for (int i2 = 0; i2 < count; i2++) {
                e2 holder = f0(this.f1075f.f(i2));
                if (!holder.J() && (!holder.t() || this.f1087l.g())) {
                    f1 f1Var = this.L;
                    f1.e(holder);
                    holder.o();
                    this.f1077g.e(holder, f1Var.t(holder));
                    if (this.f1078g0.f2974h && holder.y() && !holder.v() && !holder.J() && !holder.t()) {
                        long key = c0(holder);
                        this.f1077g.c(key, holder);
                    }
                }
            }
        }
        if (this.f1078g0.f2977k) {
            d1();
            b2 b2Var2 = this.f1078g0;
            boolean didStructureChange = b2Var2.f2972f;
            b2Var2.f2972f = false;
            this.f1089m.X0(this.f1069c, b2Var2);
            this.f1078g0.f2972f = didStructureChange;
            for (int i3 = 0; i3 < this.f1075f.g(); i3++) {
                View child = this.f1075f.f(i3);
                e2 viewHolder = f0(child);
                if (!viewHolder.J() && !this.f1077g.i(viewHolder)) {
                    int flags = f1.e(viewHolder);
                    boolean wasHidden = viewHolder.p(8192);
                    if (!wasHidden) {
                        int i4 = flags | 4096;
                    }
                    f1 f1Var2 = this.L;
                    viewHolder.o();
                    e1 animationInfo = f1Var2.t(viewHolder);
                    if (wasHidden) {
                        Q0(viewHolder, animationInfo);
                    } else {
                        this.f1077g.a(viewHolder, animationInfo);
                    }
                }
            }
            s();
        } else {
            s();
        }
        G0();
        r1(false);
        this.f1078g0.f2970d = 2;
    }

    public final void D() {
        p1();
        F0();
        this.f1078g0.a(6);
        this.f1073e.h();
        this.f1078g0.f2971e = this.f1087l.c();
        b2 b2Var = this.f1078g0;
        b2Var.f2969c = 0;
        b2Var.f2973g = false;
        this.f1089m.X0(this.f1069c, b2Var);
        b2 b2Var2 = this.f1078g0;
        b2Var2.f2972f = false;
        this.f1071d = null;
        b2Var2.f2976j = b2Var2.f2976j && this.L != null;
        b2Var2.f2970d = 4;
        G0();
        r1(false);
    }

    public final void E() {
        this.f1078g0.a(4);
        p1();
        F0();
        b2 b2Var = this.f1078g0;
        b2Var.f2970d = 1;
        if (b2Var.f2976j) {
            for (int i2 = this.f1075f.g() - 1; i2 >= 0; i2--) {
                e2 holder = f0(this.f1075f.f(i2));
                if (!holder.J()) {
                    long key = c0(holder);
                    e1 animationInfo = this.L.s(holder);
                    e2 oldChangeViewHolder = this.f1077g.g(key);
                    if (oldChangeViewHolder == null || oldChangeViewHolder.J()) {
                        this.f1077g.d(holder, animationInfo);
                    } else {
                        boolean oldDisappearing = this.f1077g.h(oldChangeViewHolder);
                        boolean newDisappearing = this.f1077g.h(holder);
                        if (!oldDisappearing || oldChangeViewHolder != holder) {
                            e1 preInfo = this.f1077g.n(oldChangeViewHolder);
                            this.f1077g.d(holder, animationInfo);
                            e1 postInfo = this.f1077g.m(holder);
                            if (preInfo == null) {
                                k0(key, holder, oldChangeViewHolder);
                            } else {
                                m(oldChangeViewHolder, holder, preInfo, postInfo, oldDisappearing, newDisappearing);
                            }
                        } else {
                            this.f1077g.d(holder, animationInfo);
                        }
                    }
                }
            }
            this.f1077g.o(this.f1110w0);
        }
        this.f1089m.l1(this.f1069c);
        b2 b2Var2 = this.f1078g0;
        b2Var2.f2968b = b2Var2.f2971e;
        this.C = false;
        this.D = false;
        b2Var2.f2976j = false;
        b2Var2.f2977k = false;
        this.f1089m.f3121h = false;
        ArrayList arrayList = this.f1069c.f3205b;
        if (arrayList != null) {
            arrayList.clear();
        }
        m1 m1Var = this.f1089m;
        if (m1Var.f3126m) {
            m1Var.f3125l = 0;
            m1Var.f3126m = false;
            this.f1069c.I();
        }
        this.f1089m.Y0(this.f1078g0);
        G0();
        r1(false);
        this.f1077g.f();
        int[] iArr = this.f1096p0;
        if (x(iArr[0], iArr[1])) {
            I(0, 0);
        }
        R0();
        a1();
    }

    public final void k0(long key, e2 holder, e2 oldChangeViewHolder) {
        int childCount = this.f1075f.g();
        for (int i2 = 0; i2 < childCount; i2++) {
            View view = this.f1075f.f(i2);
            e2 other = f0(view);
            if (other != holder) {
                long otherKey = c0(other);
                if (otherKey == key) {
                    x0 x0Var = this.f1087l;
                    if (x0Var == null || !x0Var.g()) {
                        throw new IllegalStateException("Two different ViewHolders have the same change ID. This might happen due to inconsistent Adapter update events or if the LayoutManager lays out the same View multiple times.\n ViewHolder 1:" + other + " \n View Holder 2:" + holder + P());
                    }
                    throw new IllegalStateException("Two different ViewHolders have the same stable ID. Stable IDs in your adapter MUST BE unique and SHOULD NOT change.\n ViewHolder 1:" + other + " \n View Holder 2:" + holder + P());
                }
            }
        }
        Log.e("RecyclerView", "Problem while matching changed view holders with the newones. The pre-layout information for the change holder " + oldChangeViewHolder + " cannot be found but it is necessary for " + holder + P());
    }

    public void Q0(e2 viewHolder, e1 animationInfo) {
        viewHolder.F(0, 8192);
        if (this.f1078g0.f2974h && viewHolder.y() && !viewHolder.v() && !viewHolder.J()) {
            long key = c0(viewHolder);
            this.f1077g.c(key, viewHolder);
        }
        this.f1077g.e(viewHolder, animationInfo);
    }

    public final void U(int[] into) {
        int count = this.f1075f.g();
        if (count == 0) {
            into[0] = -1;
            into[1] = -1;
            return;
        }
        int minPositionPreLayout = Integer.MAX_VALUE;
        int maxPositionPreLayout = Integer.MIN_VALUE;
        for (int i2 = 0; i2 < count; i2++) {
            e2 holder = f0(this.f1075f.f(i2));
            if (!holder.J()) {
                int pos = holder.m();
                if (pos < minPositionPreLayout) {
                    minPositionPreLayout = pos;
                }
                if (pos > maxPositionPreLayout) {
                    maxPositionPreLayout = pos;
                }
            }
        }
        into[0] = minPositionPreLayout;
        into[1] = maxPositionPreLayout;
    }

    public final boolean x(int minPositionPreLayout, int maxPositionPreLayout) {
        U(this.f1096p0);
        int[] iArr = this.f1096p0;
        return (iArr[0] == minPositionPreLayout && iArr[1] == maxPositionPreLayout) ? false : true;
    }

    @Override // android.view.ViewGroup
    public void removeDetachedView(View child, boolean animate) {
        e2 vh = f0(child);
        if (vh != null) {
            if (vh.x()) {
                vh.f();
            } else if (!vh.J()) {
                throw new IllegalArgumentException("Called removeDetachedView with a view which is not flagged as tmp detached." + vh + P());
            }
        }
        child.clearAnimation();
        z(child);
        super.removeDetachedView(child, animate);
    }

    public long c0(e2 holder) {
        return this.f1087l.g() ? holder.k() : holder.f3020c;
    }

    public void l(e2 itemHolder, e1 preLayoutInfo, e1 postLayoutInfo) {
        itemHolder.G(false);
        if (this.L.a(itemHolder, preLayoutInfo, postLayoutInfo)) {
            L0();
        }
    }

    public void n(e2 holder, e1 preLayoutInfo, e1 postLayoutInfo) {
        g(holder);
        holder.G(false);
        if (this.L.c(holder, preLayoutInfo, postLayoutInfo)) {
            L0();
        }
    }

    public final void m(e2 oldHolder, e2 newHolder, e1 preInfo, e1 postInfo, boolean oldHolderDisappearing, boolean newHolderDisappearing) {
        oldHolder.G(false);
        if (oldHolderDisappearing) {
            g(oldHolder);
        }
        if (oldHolder != newHolder) {
            if (newHolderDisappearing) {
                g(newHolder);
            }
            oldHolder.f3025h = newHolder;
            g(oldHolder);
            this.f1069c.H(oldHolder);
            newHolder.G(false);
            newHolder.f3026i = oldHolder;
        }
        if (this.L.b(oldHolder, newHolder, preInfo, postInfo)) {
            L0();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean changed, int l2, int t2, int r2, int b2) {
        d.a("RV OnLayout");
        B();
        d.b();
        this.f1105u = true;
    }

    @Override // android.view.View, android.view.ViewParent
    public void requestLayout() {
        if (this.f1107v != 0 || this.f1111x) {
            this.f1109w = true;
        } else {
            super.requestLayout();
        }
    }

    public void w0() {
        int childCount = this.f1075f.j();
        for (int i2 = 0; i2 < childCount; i2++) {
            View child = this.f1075f.i(i2);
            ((n1) child.getLayoutParams()).f3144c = true;
        }
        this.f1069c.q();
    }

    @Override // android.view.View
    public void draw(Canvas c2) {
        super.draw(c2);
        int count = this.f1093o.size();
        for (int i2 = 0; i2 < count; i2++) {
            ((h1) this.f1093o.get(i2)).f(c2, this, this.f1078g0);
        }
        boolean needsInvalidate = false;
        EdgeEffect edgeEffect = this.H;
        boolean z2 = true;
        if (edgeEffect != null && !edgeEffect.isFinished()) {
            int restore = c2.save();
            int padding = this.f1079h ? getPaddingBottom() : 0;
            c2.rotate(270.0f);
            c2.translate((-getHeight()) + padding, 0.0f);
            EdgeEffect edgeEffect2 = this.H;
            needsInvalidate = edgeEffect2 != null && edgeEffect2.draw(c2);
            c2.restoreToCount(restore);
        }
        EdgeEffect edgeEffect3 = this.I;
        if (edgeEffect3 != null && !edgeEffect3.isFinished()) {
            int restore2 = c2.save();
            if (this.f1079h) {
                c2.translate(getPaddingLeft(), getPaddingTop());
            }
            EdgeEffect edgeEffect4 = this.I;
            needsInvalidate |= edgeEffect4 != null && edgeEffect4.draw(c2);
            c2.restoreToCount(restore2);
        }
        EdgeEffect edgeEffect5 = this.J;
        if (edgeEffect5 != null && !edgeEffect5.isFinished()) {
            int restore3 = c2.save();
            int width = getWidth();
            int padding2 = this.f1079h ? getPaddingTop() : 0;
            c2.rotate(90.0f);
            c2.translate(-padding2, -width);
            EdgeEffect edgeEffect6 = this.J;
            needsInvalidate |= edgeEffect6 != null && edgeEffect6.draw(c2);
            c2.restoreToCount(restore3);
        }
        EdgeEffect edgeEffect7 = this.K;
        if (edgeEffect7 != null && !edgeEffect7.isFinished()) {
            int restore4 = c2.save();
            c2.rotate(180.0f);
            if (this.f1079h) {
                c2.translate((-getWidth()) + getPaddingRight(), (-getHeight()) + getPaddingBottom());
            } else {
                c2.translate(-getWidth(), -getHeight());
            }
            EdgeEffect edgeEffect8 = this.K;
            if (edgeEffect8 == null || !edgeEffect8.draw(c2)) {
                z2 = false;
            }
            needsInvalidate |= z2;
            c2.restoreToCount(restore4);
        }
        if (!needsInvalidate && this.L != null && this.f1093o.size() > 0 && this.L.p()) {
            needsInvalidate = true;
        }
        if (needsInvalidate) {
            c1.c0(this);
        }
    }

    @Override // android.view.View
    public void onDraw(Canvas c2) {
        super.onDraw(c2);
        int count = this.f1093o.size();
        for (int i2 = 0; i2 < count; i2++) {
            ((h1) this.f1093o.get(i2)).d(c2, this, this.f1078g0);
        }
    }

    @Override // android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams p2) {
        return (p2 instanceof n1) && this.f1089m.m((n1) p2);
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateDefaultLayoutParams() {
        m1 m1Var = this.f1089m;
        if (m1Var != null) {
            return m1Var.D();
        }
        throw new IllegalStateException("RecyclerView has no LayoutManager" + P());
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attrs) {
        m1 m1Var = this.f1089m;
        if (m1Var != null) {
            return m1Var.E(getContext(), attrs);
        }
        throw new IllegalStateException("RecyclerView has no LayoutManager" + P());
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams p2) {
        m1 m1Var = this.f1089m;
        if (m1Var != null) {
            return m1Var.F(p2);
        }
        throw new IllegalStateException("RecyclerView has no LayoutManager" + P());
    }

    public void d1() {
        int childCount = this.f1075f.j();
        for (int i2 = 0; i2 < childCount; i2++) {
            e2 holder = f0(this.f1075f.i(i2));
            if (!holder.J()) {
                holder.E();
            }
        }
    }

    public void s() {
        int childCount = this.f1075f.j();
        for (int i2 = 0; i2 < childCount; i2++) {
            e2 holder = f0(this.f1075f.i(i2));
            if (!holder.J()) {
                holder.c();
            }
        }
        this.f1069c.d();
    }

    public void B0(int from, int to) {
        int inBetweenOffset;
        int end;
        int start;
        int i2;
        int childCount = this.f1075f.j();
        if (from < to) {
            start = from;
            end = to;
            inBetweenOffset = -1;
        } else {
            start = to;
            end = from;
            inBetweenOffset = 1;
        }
        for (int i3 = 0; i3 < childCount; i3++) {
            e2 holder = f0(this.f1075f.i(i3));
            if (holder != null && (i2 = holder.f3020c) >= start && i2 <= end) {
                if (i2 == from) {
                    holder.A(to - from, false);
                } else {
                    holder.A(inBetweenOffset, false);
                }
                this.f1078g0.f2972f = true;
            }
        }
        this.f1069c.t(from, to);
        requestLayout();
    }

    public void A0(int positionStart, int itemCount) {
        int childCount = this.f1075f.j();
        for (int i2 = 0; i2 < childCount; i2++) {
            e2 holder = f0(this.f1075f.i(i2));
            if (holder != null && !holder.J() && holder.f3020c >= positionStart) {
                holder.A(itemCount, false);
                this.f1078g0.f2972f = true;
            }
        }
        this.f1069c.s(positionStart, itemCount);
        requestLayout();
    }

    public void C0(int positionStart, int itemCount, boolean applyToPreLayout) {
        int positionEnd = positionStart + itemCount;
        int childCount = this.f1075f.j();
        for (int i2 = 0; i2 < childCount; i2++) {
            e2 holder = f0(this.f1075f.i(i2));
            if (holder != null && !holder.J()) {
                int i3 = holder.f3020c;
                if (i3 >= positionEnd) {
                    holder.A(-itemCount, applyToPreLayout);
                    this.f1078g0.f2972f = true;
                } else if (i3 >= positionStart) {
                    holder.i(positionStart - 1, -itemCount, applyToPreLayout);
                    this.f1078g0.f2972f = true;
                }
            }
        }
        this.f1069c.u(positionStart, itemCount, applyToPreLayout);
        requestLayout();
    }

    public void v1(int positionStart, int itemCount, Object payload) {
        int i2;
        int childCount = this.f1075f.j();
        int positionEnd = positionStart + itemCount;
        for (int i3 = 0; i3 < childCount; i3++) {
            View child = this.f1075f.i(i3);
            e2 holder = f0(child);
            if (holder != null && !holder.J() && (i2 = holder.f3020c) >= positionStart && i2 < positionEnd) {
                holder.b(2);
                holder.a(payload);
                ((n1) child.getLayoutParams()).f3144c = true;
            }
        }
        this.f1069c.K(positionStart, itemCount);
    }

    public boolean p(e2 viewHolder) {
        f1 f1Var = this.L;
        return f1Var == null || f1Var.g(viewHolder, viewHolder.o());
    }

    public void O0(boolean dispatchItemsChanged) {
        this.D |= dispatchItemsChanged;
        this.C = true;
        x0();
    }

    public void x0() {
        int childCount = this.f1075f.j();
        for (int i2 = 0; i2 < childCount; i2++) {
            e2 holder = f0(this.f1075f.i(i2));
            if (holder != null && !holder.J()) {
                holder.b(6);
            }
        }
        w0();
        this.f1069c.r();
    }

    public boolean getPreserveFocusAfterLayout() {
        return this.f1070c0;
    }

    public void setPreserveFocusAfterLayout(boolean preserveFocusAfterLayout) {
        this.f1070c0 = preserveFocusAfterLayout;
    }

    public e2 e0(View child) {
        ViewParent parent = child.getParent();
        if (parent == null || parent == this) {
            return f0(child);
        }
        throw new IllegalArgumentException("View " + child + " is not a direct child of " + this);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:?, code lost:
        return r3;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public android.view.View R(android.view.View r3) {
        /*
            r2 = this;
            android.view.ViewParent r0 = r3.getParent()
        L_0x0004:
            if (r0 == 0) goto L_0x0014
            if (r0 == r2) goto L_0x0014
            boolean r1 = r0 instanceof android.view.View
            if (r1 == 0) goto L_0x0014
            r3 = r0
            android.view.View r3 = (android.view.View) r3
            android.view.ViewParent r0 = r3.getParent()
            goto L_0x0004
        L_0x0014:
            if (r0 != r2) goto L_0x0018
            r1 = r3
            goto L_0x0019
        L_0x0018:
            r1 = 0
        L_0x0019:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.R(android.view.View):android.view.View");
    }

    public e2 S(View view) {
        View itemView = R(view);
        if (itemView == null) {
            return null;
        }
        return e0(itemView);
    }

    public static e2 f0(View child) {
        if (child == null) {
            return null;
        }
        return ((n1) child.getLayoutParams()).f3142a;
    }

    public int d0(View child) {
        e2 holder = f0(child);
        if (holder != null) {
            return holder.m();
        }
        return -1;
    }

    public e2 X(int position) {
        if (this.C) {
            return null;
        }
        int childCount = this.f1075f.j();
        e2 hidden = null;
        for (int i2 = 0; i2 < childCount; i2++) {
            e2 holder = f0(this.f1075f.i(i2));
            if (holder != null && !holder.v() && b0(holder) == position) {
                if (!this.f1075f.n(holder.f3018a)) {
                    return holder;
                }
                hidden = holder;
            }
        }
        return hidden;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0036 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public q0.e2 Z(int r7, boolean r8) {
        /*
            r6 = this;
            q0.f r0 = r6.f1075f
            int r0 = r0.j()
            r1 = 0
            r2 = 0
        L_0x0008:
            if (r2 >= r0) goto L_0x003a
            q0.f r3 = r6.f1075f
            android.view.View r3 = r3.i(r2)
            q0.e2 r3 = f0(r3)
            if (r3 == 0) goto L_0x0037
            boolean r4 = r3.v()
            if (r4 != 0) goto L_0x0037
            if (r8 == 0) goto L_0x0023
            int r4 = r3.f3020c
            if (r4 == r7) goto L_0x002a
            goto L_0x0037
        L_0x0023:
            int r4 = r3.m()
            if (r4 == r7) goto L_0x002a
            goto L_0x0037
        L_0x002a:
            q0.f r4 = r6.f1075f
            android.view.View r5 = r3.f3018a
            boolean r4 = r4.n(r5)
            if (r4 == 0) goto L_0x0036
            r1 = r3
            goto L_0x0037
        L_0x0036:
            return r3
        L_0x0037:
            int r2 = r2 + 1
            goto L_0x0008
        L_0x003a:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.Z(int, boolean):q0.e2");
    }

    public e2 Y(long id) {
        x0 x0Var = this.f1087l;
        if (x0Var == null || !x0Var.g()) {
            return null;
        }
        int childCount = this.f1075f.j();
        e2 hidden = null;
        for (int i2 = 0; i2 < childCount; i2++) {
            e2 holder = f0(this.f1075f.i(i2));
            if (holder != null && !holder.v() && holder.k() == id) {
                if (!this.f1075f.n(holder.f3018a)) {
                    return holder;
                }
                hidden = holder;
            }
        }
        return hidden;
    }

    @Override // android.view.ViewGroup
    public boolean drawChild(Canvas canvas, View child, long drawingTime) {
        return super.drawChild(canvas, child, drawingTime);
    }

    public void z0(int dy) {
        int childCount = this.f1075f.g();
        for (int i2 = 0; i2 < childCount; i2++) {
            this.f1075f.f(i2).offsetTopAndBottom(dy);
        }
    }

    public void D0(View child) {
    }

    public void E0(View child) {
    }

    public void y0(int dx) {
        int childCount = this.f1075f.g();
        for (int i2 = 0; i2 < childCount; i2++) {
            this.f1075f.f(i2).offsetLeftAndRight(dx);
        }
    }

    public static void g0(View view, Rect outBounds) {
        n1 lp = (n1) view.getLayoutParams();
        Rect insets = lp.f3143b;
        outBounds.set((view.getLeft() - insets.left) - ((ViewGroup.MarginLayoutParams) lp).leftMargin, (view.getTop() - insets.top) - ((ViewGroup.MarginLayoutParams) lp).topMargin, view.getRight() + insets.right + ((ViewGroup.MarginLayoutParams) lp).rightMargin, view.getBottom() + insets.bottom + ((ViewGroup.MarginLayoutParams) lp).bottomMargin);
    }

    public Rect j0(View child) {
        n1 lp = (n1) child.getLayoutParams();
        if (!lp.f3144c) {
            return lp.f3143b;
        }
        if (this.f1078g0.e() && (lp.b() || lp.d())) {
            return lp.f3143b;
        }
        Rect insets = lp.f3143b;
        insets.set(0, 0, 0, 0);
        int decorCount = this.f1093o.size();
        for (int i2 = 0; i2 < decorCount; i2++) {
            this.f1081i.set(0, 0, 0, 0);
            ((h1) this.f1093o.get(i2)).b(this.f1081i, child, this);
            int i3 = insets.left;
            Rect rect = this.f1081i;
            insets.left = i3 + rect.left;
            insets.top += rect.top;
            insets.right += rect.right;
            insets.bottom += rect.bottom;
        }
        lp.f3144c = false;
        return insets;
    }

    public void K0(int dx, int dy) {
    }

    public void I(int hresult, int vresult) {
        this.F++;
        int scrollX = getScrollX();
        int scrollY = getScrollY();
        onScrollChanged(scrollX, scrollY, scrollX - hresult, scrollY - vresult);
        K0(hresult, vresult);
        q1 q1Var = this.f1080h0;
        if (q1Var != null) {
            q1Var.b(this, hresult, vresult);
        }
        List list = this.f1082i0;
        if (list != null) {
            for (int i2 = list.size() - 1; i2 >= 0; i2--) {
                ((q1) this.f1082i0.get(i2)).b(this, hresult, vresult);
            }
        }
        int i3 = this.F;
        this.F = i3 - 1;
    }

    public void J0(int state) {
    }

    public void H(int state) {
        m1 m1Var = this.f1089m;
        if (m1Var != null) {
            m1Var.e1(state);
        }
        J0(state);
        q1 q1Var = this.f1080h0;
        if (q1Var != null) {
            q1Var.a(this, state);
        }
        List list = this.f1082i0;
        if (list != null) {
            for (int i2 = list.size() - 1; i2 >= 0; i2--) {
                ((q1) this.f1082i0.get(i2)).a(this, state);
            }
        }
    }

    public boolean l0() {
        return !this.f1105u || this.C || this.f1073e.n();
    }

    public void Y0() {
        e2 e2Var;
        int count = this.f1075f.g();
        for (int i2 = 0; i2 < count; i2++) {
            View view = this.f1075f.f(i2);
            e2 holder = e0(view);
            if (!(holder == null || (e2Var = holder.f3026i) == null)) {
                View shadowingView = e2Var.f3018a;
                int left = view.getLeft();
                int top = view.getTop();
                if (left != shadowingView.getLeft() || top != shadowingView.getTop()) {
                    shadowingView.layout(left, top, shadowingView.getWidth() + left, shadowingView.getHeight() + top);
                }
            }
        }
    }

    public static RecyclerView V(View view) {
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        if (view instanceof RecyclerView) {
            return (RecyclerView) view;
        }
        ViewGroup parent = (ViewGroup) view;
        int count = parent.getChildCount();
        for (int i2 = 0; i2 < count; i2++) {
            View child = parent.getChildAt(i2);
            RecyclerView descendant = V(child);
            if (descendant != null) {
                return descendant;
            }
        }
        return null;
    }

    public static void r(e2 holder) {
        WeakReference weakReference = holder.f3019b;
        if (weakReference != null) {
            View item = (View) weakReference.get();
            while (item != null) {
                if (item != holder.f3018a) {
                    ViewParent parent = item.getParent();
                    if (parent instanceof View) {
                        item = (View) parent;
                    } else {
                        item = null;
                    }
                } else {
                    return;
                }
            }
            holder.f3019b = null;
        }
    }

    public long getNanoTime() {
        return System.nanoTime();
    }

    public void z(View child) {
        e2 viewHolder = f0(child);
        E0(child);
        x0 x0Var = this.f1087l;
        if (x0Var != null && viewHolder != null) {
            x0Var.p();
        }
    }

    public void y(View child) {
        e2 viewHolder = f0(child);
        D0(child);
        x0 x0Var = this.f1087l;
        if (x0Var != null && viewHolder != null) {
            x0Var.o();
        }
    }

    public boolean i1(e2 viewHolder, int importantForAccessibility) {
        if (t0()) {
            viewHolder.f3034q = importantForAccessibility;
            this.f1106u0.add(viewHolder);
            return false;
        }
        c1.s0(viewHolder.f3018a, importantForAccessibility);
        return true;
    }

    public void J() {
        int state;
        for (int i2 = this.f1106u0.size() - 1; i2 >= 0; i2--) {
            e2 viewHolder = (e2) this.f1106u0.get(i2);
            if (viewHolder.f3018a.getParent() == this && !viewHolder.J() && (state = viewHolder.f3034q) != -1) {
                c1.s0(viewHolder.f3018a, state);
                viewHolder.f3034q = -1;
            }
        }
        this.f1106u0.clear();
    }

    public int b0(e2 viewHolder) {
        if (viewHolder.p(524) || !viewHolder.s()) {
            return -1;
        }
        return this.f1073e.c(viewHolder.f3020c);
    }

    public void q0(StateListDrawable verticalThumbDrawable, Drawable verticalTrackDrawable, StateListDrawable horizontalThumbDrawable, Drawable horizontalTrackDrawable) {
        if (verticalThumbDrawable == null || verticalTrackDrawable == null || horizontalThumbDrawable == null || horizontalTrackDrawable == null) {
            throw new IllegalArgumentException("Trying to set fast scroller without both required drawables." + P());
        }
        Resources resources = getContext().getResources();
        new q0.v(this, verticalThumbDrawable, verticalTrackDrawable, horizontalThumbDrawable, horizontalTrackDrawable, resources.getDimensionPixelSize(R.dimen.fastscroll_default_thickness), resources.getDimensionPixelSize(R.dimen.fastscroll_minimum_range), resources.getDimensionPixelOffset(R.dimen.fastscroll_margin));
    }

    @Override // android.view.View
    public void setNestedScrollingEnabled(boolean enabled) {
        getScrollingChildHelper().m(enabled);
    }

    @Override // android.view.View
    public boolean isNestedScrollingEnabled() {
        return getScrollingChildHelper().l();
    }

    @Override // android.view.View
    public boolean startNestedScroll(int axes) {
        return getScrollingChildHelper().o(axes);
    }

    public boolean q1(int axes, int type) {
        return getScrollingChildHelper().p(axes, type);
    }

    @Override // android.view.View
    public void stopNestedScroll() {
        getScrollingChildHelper().q();
    }

    public void s1(int type) {
        getScrollingChildHelper().r(type);
    }

    @Override // android.view.View
    public boolean hasNestedScrollingParent() {
        return getScrollingChildHelper().j();
    }

    @Override // android.view.View
    public boolean dispatchNestedScroll(int dxConsumed, int dyConsumed, int dxUnconsumed, int dyUnconsumed, int[] offsetInWindow) {
        return getScrollingChildHelper().f(dxConsumed, dyConsumed, dxUnconsumed, dyUnconsumed, offsetInWindow);
    }

    public final void G(int dxConsumed, int dyConsumed, int dxUnconsumed, int dyUnconsumed, int[] offsetInWindow, int type, int[] consumed) {
        getScrollingChildHelper().e(dxConsumed, dyConsumed, dxUnconsumed, dyUnconsumed, offsetInWindow, type, consumed);
    }

    @Override // android.view.View
    public boolean dispatchNestedPreScroll(int dx, int dy, int[] consumed, int[] offsetInWindow) {
        return getScrollingChildHelper().c(dx, dy, consumed, offsetInWindow);
    }

    public boolean F(int dx, int dy, int[] consumed, int[] offsetInWindow, int type) {
        return getScrollingChildHelper().d(dx, dy, consumed, offsetInWindow, type);
    }

    @Override // android.view.View
    public boolean dispatchNestedFling(float velocityX, float velocityY, boolean consumed) {
        return getScrollingChildHelper().a(velocityX, velocityY, consumed);
    }

    @Override // android.view.View
    public boolean dispatchNestedPreFling(float velocityX, float velocityY) {
        return getScrollingChildHelper().b(velocityX, velocityY);
    }

    @Override // android.view.ViewGroup
    public int getChildDrawingOrder(int childCount, int i2) {
        a1 a1Var = this.f1094o0;
        if (a1Var == null) {
            return super.getChildDrawingOrder(childCount, i2);
        }
        return a1Var.a(childCount, i2);
    }

    private w getScrollingChildHelper() {
        if (this.f1098q0 == null) {
            this.f1098q0 = new w(this);
        }
        return this.f1098q0;
    }
}
