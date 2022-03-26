package p;

import androidx.constraintlayout.solver.widgets.ConstraintWidget;
import java.util.ArrayList;
import o.a;
import o.f;
import o.g;
import o.h;
import o.i;

/* JADX WARN: Classes with same name are omitted:
  
 */
/* loaded from: classes.dex */
public abstract class k {

    /* renamed from: a  reason: collision with root package name */
    public static b f2745a = new b();

    public static void h(h layout, c measurer) {
        int i2;
        f horizontal = layout.v();
        f vertical = layout.L();
        layout.f0();
        ArrayList<ConstraintWidget> children = layout.W0();
        int count = children.size();
        for (int i3 = 0; i3 < count; i3++) {
            ((g) children.get(i3)).f0();
        }
        boolean isRtl = layout.s1();
        if (horizontal == f.FIXED) {
            layout.m0(0, layout.O());
        } else {
            layout.n0(0);
        }
        boolean hasGuideline = false;
        boolean hasBarrier = false;
        int i4 = 0;
        while (true) {
            i2 = -1;
            if (i4 >= count) {
                break;
            }
            g child = (g) children.get(i4);
            if (child instanceof i) {
                i guideline = (i) child;
                if (guideline.W0() == 1) {
                    if (guideline.X0() != -1) {
                        guideline.a1(guideline.X0());
                    } else if (guideline.Y0() != -1 && layout.b0()) {
                        guideline.a1(layout.O() - guideline.Y0());
                    } else if (layout.b0()) {
                        int position = (int) ((guideline.Z0() * layout.O()) + 0.5f);
                        guideline.a1(position);
                    }
                    hasGuideline = true;
                }
            } else if ((child instanceof a) && ((a) child).e1() == 0) {
                hasBarrier = true;
            }
            i4++;
        }
        if (hasGuideline) {
            for (int i5 = 0; i5 < count; i5++) {
                g child2 = (g) children.get(i5);
                if (child2 instanceof i) {
                    i guideline2 = (i) child2;
                    if (guideline2.W0() == 1) {
                        b(guideline2, measurer, isRtl);
                    }
                }
            }
        }
        b(layout, measurer, isRtl);
        if (hasBarrier) {
            for (int i6 = 0; i6 < count; i6++) {
                g child3 = (g) children.get(i6);
                if (child3 instanceof a) {
                    a barrier = (a) child3;
                    if (barrier.e1() == 0) {
                        c(barrier, measurer, 0, isRtl);
                    }
                }
            }
        }
        if (vertical == f.FIXED) {
            layout.p0(0, layout.s());
        } else {
            layout.o0(0);
        }
        boolean hasGuideline2 = false;
        boolean hasBarrier2 = false;
        int i7 = 0;
        while (i7 < count) {
            g child4 = (g) children.get(i7);
            if (child4 instanceof i) {
                i guideline3 = (i) child4;
                if (guideline3.W0() == 0) {
                    if (guideline3.X0() != i2) {
                        guideline3.a1(guideline3.X0());
                    } else if (guideline3.Y0() != i2 && layout.c0()) {
                        guideline3.a1(layout.s() - guideline3.Y0());
                    } else if (layout.c0()) {
                        int position2 = (int) ((guideline3.Z0() * layout.s()) + 0.5f);
                        guideline3.a1(position2);
                    }
                    hasGuideline2 = true;
                }
            } else if ((child4 instanceof a) && ((a) child4).e1() == 1) {
                hasBarrier2 = true;
            }
            i7++;
            i2 = -1;
        }
        if (hasGuideline2) {
            for (int i8 = 0; i8 < count; i8++) {
                g child5 = (g) children.get(i8);
                if (child5 instanceof i) {
                    i guideline4 = (i) child5;
                    if (guideline4.W0() == 0) {
                        i(guideline4, measurer);
                    }
                }
            }
        }
        i(layout, measurer);
        if (hasBarrier2) {
            for (int i9 = 0; i9 < count; i9++) {
                g child6 = (g) children.get(i9);
                if (child6 instanceof a) {
                    a barrier2 = (a) child6;
                    if (barrier2.e1() == 1) {
                        c(barrier2, measurer, 1, isRtl);
                    }
                }
            }
        }
        for (int i10 = 0; i10 < count; i10++) {
            g child7 = (g) children.get(i10);
            if (child7.a0() && a(child7)) {
                h.v1(child7, measurer, f2745a, 0);
                b(child7, measurer, isRtl);
                i(child7, measurer);
            }
        }
    }

    public static void c(a barrier, c measurer, int orientation, boolean isRtl) {
        if (!barrier.a1()) {
            return;
        }
        if (orientation == 0) {
            b(barrier, measurer, isRtl);
        } else {
            i(barrier, measurer);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:123:0x01c4, code lost:
        if (r9.q() != 0.0f) goto L_0x0238;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void b(o.g r19, p.c r20, boolean r21) {
        /*
            Method dump skipped, instructions count: 573
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p.k.b(o.g, p.c, boolean):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:120:0x01b4, code lost:
        if (r8.q() != 0.0f) goto L_0x021e;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void i(o.g r18, p.c r19) {
        /*
            Method dump skipped, instructions count: 642
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p.k.i(o.g, p.c):void");
    }

    public static void d(c measurer, g widget, boolean isRtl) {
        float bias = widget.t();
        int start = widget.F.f2620f.d();
        int end = widget.H.f2620f.d();
        int s12 = widget.F.e() + start;
        int s2 = end - widget.H.e();
        if (start == end) {
            bias = 0.5f;
            s12 = start;
            s2 = end;
        }
        int width = widget.O();
        int distance = (s2 - s12) - width;
        if (s12 > s2) {
            distance = (s12 - s2) - width;
        }
        int d12 = (int) ((distance * bias) + 0.5f);
        int x1 = s12 + d12;
        int x2 = x1 + width;
        if (s12 > s2) {
            x1 = s12 + d12;
            x2 = x1 - width;
        }
        widget.m0(x1, x2);
        b(widget, measurer, isRtl);
    }

    public static void f(c measurer, g widget) {
        float bias = widget.J();
        int start = widget.G.f2620f.d();
        int end = widget.I.f2620f.d();
        int s12 = widget.G.e() + start;
        int s2 = end - widget.I.e();
        if (start == end) {
            bias = 0.5f;
            s12 = start;
            s2 = end;
        }
        int height = widget.s();
        int distance = (s2 - s12) - height;
        if (s12 > s2) {
            distance = (s12 - s2) - height;
        }
        int d12 = (int) ((distance * bias) + 0.5f);
        int y1 = s12 + d12;
        int y2 = y1 + height;
        if (s12 > s2) {
            y1 = s12 - d12;
            y2 = y1 - height;
        }
        widget.p0(y1, y2);
        i(widget, measurer);
    }

    public static void e(g layout, c measurer, g widget, boolean isRtl) {
        int parentWidth;
        float bias = widget.t();
        int s12 = widget.F.f2620f.d() + widget.F.e();
        int s2 = widget.H.f2620f.d() - widget.H.e();
        if (s2 >= s12) {
            int width = widget.O();
            if (widget.N() != 8) {
                int i2 = widget.f2656n;
                if (i2 == 2) {
                    if (layout instanceof h) {
                        parentWidth = layout.O();
                    } else {
                        parentWidth = layout.F().O();
                    }
                    width = (int) (widget.t() * 0.5f * parentWidth);
                } else if (i2 == 0) {
                    width = s2 - s12;
                }
                width = Math.max(widget.f2660q, width);
                int i3 = widget.f2661r;
                if (i3 > 0) {
                    width = Math.min(i3, width);
                }
            }
            int distance = (s2 - s12) - width;
            int d12 = (int) ((distance * bias) + 0.5f);
            int x1 = s12 + d12;
            int x2 = x1 + width;
            widget.m0(x1, x2);
            b(widget, measurer, isRtl);
        }
    }

    public static void g(g layout, c measurer, g widget) {
        int parentHeight;
        float bias = widget.J();
        int s12 = widget.G.f2620f.d() + widget.G.e();
        int s2 = widget.I.f2620f.d() - widget.I.e();
        if (s2 >= s12) {
            int height = widget.s();
            if (widget.N() != 8) {
                int i2 = widget.f2658o;
                if (i2 == 2) {
                    if (layout instanceof h) {
                        parentHeight = layout.s();
                    } else {
                        parentHeight = layout.F().s();
                    }
                    height = (int) (bias * 0.5f * parentHeight);
                } else if (i2 == 0) {
                    height = s2 - s12;
                }
                height = Math.max(widget.f2663t, height);
                int i3 = widget.f2664u;
                if (i3 > 0) {
                    height = Math.min(i3, height);
                }
            }
            int distance = (s2 - s12) - height;
            int d12 = (int) ((distance * bias) + 0.5f);
            int y1 = s12 + d12;
            int y2 = y1 + height;
            widget.p0(y1, y2);
            i(widget, measurer);
        }
    }

    public static boolean a(g layout) {
        f horizontalBehaviour = layout.v();
        f verticalBehaviour = layout.L();
        h parent = layout.F() != null ? (h) layout.F() : null;
        if (parent == null || parent.v() != f.FIXED) {
        }
        if (parent == null || parent.L() != f.FIXED) {
        }
        f fVar = f.FIXED;
        boolean isHorizontalFixed = horizontalBehaviour == fVar || horizontalBehaviour == f.WRAP_CONTENT || (horizontalBehaviour == f.MATCH_CONSTRAINT && layout.f2656n == 0 && layout.U == 0.0f && layout.S(0)) || layout.b0();
        boolean isVerticalFixed = verticalBehaviour == fVar || verticalBehaviour == f.WRAP_CONTENT || (verticalBehaviour == f.MATCH_CONSTRAINT && layout.f2658o == 0 && layout.U == 0.0f && layout.S(1)) || layout.c0();
        if (layout.U <= 0.0f || (!isHorizontalFixed && !isVerticalFixed)) {
            return isHorizontalFixed && isVerticalFixed;
        }
        return true;
    }
}
