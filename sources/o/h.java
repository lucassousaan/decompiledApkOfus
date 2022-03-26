package o;

import androidx.constraintlayout.solver.widgets.ConstraintWidget;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import n.f;
import n.m;
import p.b;
import p.c;
import p.d;
import p.g;

/* JADX WARN: Classes with same name are omitted:
  
 */
/* loaded from: classes.dex */
public class h extends m {

    /* renamed from: v0  reason: collision with root package name */
    public int f2675v0;

    /* renamed from: w0  reason: collision with root package name */
    public int f2676w0;

    /* renamed from: q0  reason: collision with root package name */
    public d f2670q0 = new d(this);

    /* renamed from: r0  reason: collision with root package name */
    public g f2671r0 = new g(this);

    /* renamed from: s0  reason: collision with root package name */
    public c f2672s0 = null;

    /* renamed from: t0  reason: collision with root package name */
    public boolean f2673t0 = false;

    /* renamed from: u0  reason: collision with root package name */
    public f f2674u0 = new f();

    /* renamed from: x0  reason: collision with root package name */
    public int f2677x0 = 0;

    /* renamed from: y0  reason: collision with root package name */
    public int f2678y0 = 0;

    /* renamed from: z0  reason: collision with root package name */
    public c[] f2679z0 = new c[4];
    public c[] A0 = new c[4];
    public int B0 = 257;
    public boolean C0 = false;
    public boolean D0 = false;
    public WeakReference E0 = null;
    public WeakReference F0 = null;
    public WeakReference G0 = null;
    public WeakReference H0 = null;
    public b I0 = new b();

    public void p1() {
        this.f2671r0.j();
    }

    public void q1() {
        this.f2671r0.k();
    }

    public boolean j1(boolean optimizeWrap) {
        return this.f2671r0.f(optimizeWrap);
    }

    public boolean k1(boolean optimizeWrap) {
        return this.f2671r0.g();
    }

    public boolean l1(boolean optimizeWrap, int orientation) {
        return this.f2671r0.h(optimizeWrap, orientation);
    }

    public long u1(int optimizationLevel, int widthMode, int widthSize, int heightMode, int heightSize, int lastMeasureWidth, int lastMeasureHeight, int paddingX, int paddingY) {
        this.f2675v0 = paddingX;
        this.f2676w0 = paddingY;
        this.f2670q0.d(this, optimizationLevel, widthMode, widthSize, heightMode, heightSize);
        return 0L;
    }

    public void C1() {
        this.f2670q0.e(this);
    }

    public void y1(c measurer) {
        this.f2672s0 = measurer;
        this.f2671r0.n(measurer);
    }

    public c m1() {
        return this.f2672s0;
    }

    public void z1(int value) {
        this.B0 = value;
        f.f2497r = w1(512);
    }

    public int n1() {
        return this.B0;
    }

    public boolean w1(int feature) {
        return (this.B0 & feature) == feature;
    }

    @Override // o.m, o.g
    public void e0() {
        this.f2674u0.D();
        this.f2675v0 = 0;
        this.f2676w0 = 0;
        super.e0();
    }

    public boolean t1() {
        return this.C0;
    }

    public boolean r1() {
        return this.D0;
    }

    public void i1(e top) {
        WeakReference weakReference = this.E0;
        if (weakReference == null || weakReference.get() == null || top.d() > ((e) this.E0.get()).d()) {
            this.E0 = new WeakReference(top);
        }
    }

    public void h1(e bottom) {
        WeakReference weakReference = this.G0;
        if (weakReference == null || weakReference.get() == null || bottom.d() > ((e) this.G0.get()).d()) {
            this.G0 = new WeakReference(bottom);
        }
    }

    public void d1(e right) {
        WeakReference weakReference = this.H0;
        if (weakReference == null || weakReference.get() == null || right.d() > ((e) this.H0.get()).d()) {
            this.H0 = new WeakReference(right);
        }
    }

    public final void f1(e constraintAnchor, m parentMin) {
        m variable = this.f2674u0.q(constraintAnchor);
        this.f2674u0.h(variable, parentMin, 0, 5);
    }

    public final void e1(e constraintAnchor, m parentMax) {
        m variable = this.f2674u0.q(constraintAnchor);
        this.f2674u0.h(parentMax, variable, 0, 5);
    }

    public boolean b1(f system) {
        int orientation;
        boolean optimize = w1(64);
        d(system, optimize);
        int count = this.f2689p0.size();
        boolean hasBarriers = false;
        for (int i2 = 0; i2 < count; i2++) {
            g widget = (g) this.f2689p0.get(i2);
            widget.z0(0, false);
            widget.z0(1, false);
            if (widget instanceof a) {
                hasBarriers = true;
            }
        }
        if (hasBarriers) {
            for (int i3 = 0; i3 < count; i3++) {
                g widget2 = (g) this.f2689p0.get(i3);
                if (widget2 instanceof a) {
                    ((a) widget2).f1();
                }
            }
        }
        for (int i4 = 0; i4 < count; i4++) {
            g widget3 = (g) this.f2689p0.get(i4);
            if (widget3.c()) {
                widget3.d(system, optimize);
            }
        }
        if (f.f2497r) {
            HashSet<ConstraintWidget> widgetsToAdd = new HashSet<>();
            for (int i5 = 0; i5 < count; i5++) {
                g widget4 = (g) this.f2689p0.get(i5);
                if (!widget4.c()) {
                    widgetsToAdd.add(widget4);
                }
            }
            if (v() == f.WRAP_CONTENT) {
                orientation = 0;
            } else {
                orientation = 1;
            }
            b(this, system, widgetsToAdd, orientation, false);
            Iterator<ConstraintWidget> it = widgetsToAdd.iterator();
            while (it.hasNext()) {
                g widget5 = (g) it.next();
                l.a(this, system, widget5);
                widget5.d(system, optimize);
            }
        } else {
            for (int i6 = 0; i6 < count; i6++) {
                g widget6 = (g) this.f2689p0.get(i6);
                if (widget6 instanceof h) {
                    f[] fVarArr = widget6.Q;
                    f horizontalBehaviour = fVarArr[0];
                    f verticalBehaviour = fVarArr[1];
                    f fVar = f.WRAP_CONTENT;
                    if (horizontalBehaviour == fVar) {
                        widget6.w0(f.FIXED);
                    }
                    if (verticalBehaviour == fVar) {
                        widget6.L0(f.FIXED);
                    }
                    widget6.d(system, optimize);
                    if (horizontalBehaviour == fVar) {
                        widget6.w0(horizontalBehaviour);
                    }
                    if (verticalBehaviour == fVar) {
                        widget6.L0(verticalBehaviour);
                    }
                } else {
                    l.a(this, system, widget6);
                    if (!widget6.c()) {
                        widget6.d(system, optimize);
                    }
                }
            }
        }
        int i7 = this.f2677x0;
        if (i7 > 0) {
            b.b(this, system, null, 0);
        }
        if (this.f2678y0 > 0) {
            b.b(this, system, null, 1);
        }
        return true;
    }

    public void B1(f system, boolean[] flags) {
        flags[2] = false;
        boolean optimize = w1(64);
        U0(system, optimize);
        int count = this.f2689p0.size();
        for (int i2 = 0; i2 < count; i2++) {
            g widget = (g) this.f2689p0.get(i2);
            widget.U0(system, optimize);
        }
    }

    @Override // o.g
    public void T0(boolean updateHorizontal, boolean updateVertical) {
        super.T0(updateHorizontal, updateVertical);
        int count = this.f2689p0.size();
        for (int i2 = 0; i2 < count; i2++) {
            g widget = (g) this.f2689p0.get(i2);
            widget.T0(updateHorizontal, updateVertical);
        }
    }

    public void A1(boolean isRtl) {
        this.f2673t0 = isRtl;
    }

    public boolean s1() {
        return this.f2673t0;
    }

    public static boolean v1(g widget, c measurer, b measure, int measureStrategy) {
        int measuredWidth;
        int measuredHeight;
        if (measurer == null) {
            return false;
        }
        measure.f2700a = widget.v();
        measure.f2701b = widget.L();
        measure.f2702c = widget.O();
        measure.f2703d = widget.s();
        measure.f2708i = false;
        measure.f2709j = measureStrategy;
        f fVar = measure.f2700a;
        f fVar2 = f.MATCH_CONSTRAINT;
        boolean horizontalMatchConstraints = fVar == fVar2;
        boolean verticalMatchConstraints = measure.f2701b == fVar2;
        boolean horizontalUseRatio = horizontalMatchConstraints && widget.U > 0.0f;
        boolean verticalUseRatio = verticalMatchConstraints && widget.U > 0.0f;
        if (horizontalMatchConstraints && widget.S(0) && widget.f2656n == 0 && !horizontalUseRatio) {
            horizontalMatchConstraints = false;
            measure.f2700a = f.WRAP_CONTENT;
            if (verticalMatchConstraints && widget.f2658o == 0) {
                measure.f2700a = f.FIXED;
            }
        }
        if (verticalMatchConstraints && widget.S(1) && widget.f2658o == 0 && !verticalUseRatio) {
            verticalMatchConstraints = false;
            measure.f2701b = f.WRAP_CONTENT;
            if (horizontalMatchConstraints && widget.f2656n == 0) {
                measure.f2701b = f.FIXED;
            }
        }
        if (widget.b0()) {
            horizontalMatchConstraints = false;
            measure.f2700a = f.FIXED;
        }
        if (widget.c0()) {
            verticalMatchConstraints = false;
            measure.f2701b = f.FIXED;
        }
        if (horizontalUseRatio) {
            if (widget.f2659p[0] == 4) {
                measure.f2700a = f.FIXED;
            } else if (!verticalMatchConstraints) {
                f fVar3 = measure.f2701b;
                f fVar4 = f.FIXED;
                if (fVar3 == fVar4) {
                    measuredHeight = measure.f2703d;
                } else {
                    measure.f2700a = f.WRAP_CONTENT;
                    ((q.f) measurer).d(widget, measure);
                    measuredHeight = measure.f2705f;
                }
                measure.f2700a = fVar4;
                int i2 = widget.V;
                if (i2 == 0 || i2 == -1) {
                    measure.f2702c = (int) (widget.q() * measuredHeight);
                } else {
                    measure.f2702c = (int) (widget.q() / measuredHeight);
                }
            }
        }
        if (verticalUseRatio) {
            if (widget.f2659p[1] == 4) {
                measure.f2701b = f.FIXED;
            } else if (!horizontalMatchConstraints) {
                f fVar5 = measure.f2700a;
                f fVar6 = f.FIXED;
                if (fVar5 == fVar6) {
                    measuredWidth = measure.f2702c;
                } else {
                    measure.f2701b = f.WRAP_CONTENT;
                    ((q.f) measurer).d(widget, measure);
                    measuredWidth = measure.f2704e;
                }
                measure.f2701b = fVar6;
                int i3 = widget.V;
                if (i3 == 0 || i3 == -1) {
                    measure.f2703d = (int) (measuredWidth / widget.q());
                } else {
                    measure.f2703d = (int) (measuredWidth * widget.q());
                }
            }
        }
        ((q.f) measurer).d(widget, measure);
        widget.P0(measure.f2704e);
        widget.s0(measure.f2705f);
        widget.r0(measure.f2707h);
        widget.h0(measure.f2706g);
        measure.f2709j = 0;
        return measure.f2708i;
    }

    /* JADX WARN: Removed duplicated region for block: B:128:0x02b4  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x02d0  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x02df  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x0322  */
    @Override // o.m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void X0() {
        /*
            Method dump skipped, instructions count: 834
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o.h.X0():void");
    }

    public f o1() {
        return this.f2674u0;
    }

    public final void x1() {
        this.f2677x0 = 0;
        this.f2678y0 = 0;
    }

    public void a1(g constraintWidget, int type) {
        if (type == 0) {
            c1(constraintWidget);
        } else if (type == 1) {
            g1(constraintWidget);
        }
    }

    public final void c1(g widget) {
        int i2 = this.f2677x0 + 1;
        c[] cVarArr = this.A0;
        if (i2 >= cVarArr.length) {
            this.A0 = (c[]) Arrays.copyOf(cVarArr, cVarArr.length * 2);
        }
        this.A0[this.f2677x0] = new c(widget, 0, s1());
        this.f2677x0++;
    }

    public final void g1(g widget) {
        int i2 = this.f2678y0 + 1;
        c[] cVarArr = this.f2679z0;
        if (i2 >= cVarArr.length) {
            this.f2679z0 = (c[]) Arrays.copyOf(cVarArr, cVarArr.length * 2);
        }
        this.f2679z0[this.f2678y0] = new c(widget, 1, s1());
        this.f2678y0++;
    }
}
