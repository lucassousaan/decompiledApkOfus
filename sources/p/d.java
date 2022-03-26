package p;

import java.util.ArrayList;
import java.util.Objects;
import o.a;
import o.f;
import o.g;
import o.h;
import o.i;
import o.j;
import o.l;

/* JADX WARN: Classes with same name are omitted:
  
 */
/* loaded from: classes.dex */
public class d {

    /* renamed from: a  reason: collision with root package name */
    public final ArrayList f2710a = new ArrayList();

    /* renamed from: b  reason: collision with root package name */
    public b f2711b = new b();

    /* renamed from: c  reason: collision with root package name */
    public h f2712c;

    public void e(h layout) {
        this.f2710a.clear();
        int childCount = layout.f2689p0.size();
        for (int i2 = 0; i2 < childCount; i2++) {
            g widget = (g) layout.f2689p0.get(i2);
            f v2 = widget.v();
            f fVar = f.MATCH_CONSTRAINT;
            if (v2 == fVar || widget.L() == fVar) {
                this.f2710a.add(widget);
            }
        }
        layout.p1();
    }

    public d(h constraintWidgetContainer) {
        this.f2712c = constraintWidgetContainer;
    }

    public final void b(h layout) {
        boolean skip;
        o oVar;
        q qVar;
        int childCount = layout.f2689p0.size();
        boolean optimize = layout.w1(64);
        c measurer = layout.m1();
        for (int i2 = 0; i2 < childCount; i2++) {
            g child = (g) layout.f2689p0.get(i2);
            if (!(child instanceof i) && !(child instanceof a) && !child.Z() && (!optimize || (oVar = child.f2636d) == null || (qVar = child.f2638e) == null || !oVar.f2767e.f2741j || !qVar.f2767e.f2741j)) {
                f widthBehavior = child.p(0);
                f heightBehavior = child.p(1);
                f fVar = f.MATCH_CONSTRAINT;
                if (widthBehavior != fVar || child.f2656n == 1 || heightBehavior != fVar || child.f2658o == 1) {
                    skip = false;
                } else {
                    skip = true;
                }
                if (!skip && layout.w1(1)) {
                    if (widthBehavior == fVar && child.f2656n == 0 && heightBehavior != fVar && !child.W()) {
                        skip = true;
                    }
                    if (heightBehavior == fVar && child.f2658o == 0 && widthBehavior != fVar && !child.W()) {
                        skip = true;
                    }
                    if ((widthBehavior == fVar || heightBehavior == fVar) && child.U > 0.0f) {
                        skip = true;
                    }
                }
                if (!skip) {
                    a(measurer, child, 0);
                    Objects.requireNonNull(layout);
                }
            }
        }
        ((q.f) measurer).b();
    }

    public final void c(h layout, int w2, int h2) {
        int minWidth = layout.D();
        int minHeight = layout.C();
        layout.F0(0);
        layout.E0(0);
        layout.P0(w2);
        layout.s0(h2);
        layout.F0(minWidth);
        layout.E0(minHeight);
        this.f2712c.X0();
    }

    public long d(h layout, int optimizationLevel, int widthMode, int widthSize, int heightMode, int heightSize) {
        boolean optimize;
        boolean allSolved;
        int widthSize2;
        int heightSize2;
        int optimizations;
        long layoutTime;
        int minWidth;
        int minHeight;
        boolean containerWrapWidth;
        int maxIterations;
        boolean optimize2;
        int optimizations2;
        int measureStrategy;
        int heightSize3;
        boolean allSolved2;
        boolean optimize3;
        h hVar = layout;
        int lastMeasureWidth = 0;
        int lastMeasureHeight = 0;
        int paddingX = 0;
        c measurer = layout.m1();
        long layoutTime2 = 0;
        int minWidth2 = hVar.f2689p0.size();
        int startingWidth = layout.O();
        int startingHeight = layout.s();
        boolean optimizeWrap = l.b(optimizationLevel, 128);
        boolean optimize4 = optimizeWrap || l.b(optimizationLevel, 64);
        if (optimize4) {
            int i2 = 0;
            while (i2 < minWidth2) {
                g child = (g) hVar.f2689p0.get(i2);
                f v2 = child.v();
                f fVar = f.MATCH_CONSTRAINT;
                boolean matchWidth = v2 == fVar;
                boolean matchHeight = child.L() == fVar;
                boolean ratio = matchWidth && matchHeight && child.q() > 0.0f;
                if (!child.W() || !ratio) {
                    if (child.Y() && ratio) {
                        optimize = false;
                        break;
                    } else if (child.W() || child.Y()) {
                        optimize = false;
                        break;
                    } else {
                        i2++;
                        optimize4 = optimize4;
                        lastMeasureWidth = lastMeasureWidth;
                        lastMeasureHeight = lastMeasureHeight;
                        paddingX = paddingX;
                    }
                } else {
                    optimize = false;
                    break;
                }
            }
            optimize3 = optimize4;
        } else {
            optimize3 = optimize4;
        }
        optimize = optimize3;
        if (optimize) {
        }
        boolean optimize5 = optimize & ((widthMode == 1073741824 && heightMode == 1073741824) || optimizeWrap);
        int computations = 0;
        if (optimize5) {
            widthSize2 = Math.min(layout.B(), widthSize);
            int heightSize4 = Math.min(layout.A(), heightSize);
            if (widthMode == 1073741824 && layout.O() != widthSize2) {
                hVar.P0(widthSize2);
                layout.p1();
            }
            if (heightMode == 1073741824 && layout.s() != heightSize4) {
                hVar.s0(heightSize4);
                layout.p1();
            }
            if (widthMode == 1073741824 && heightMode == 1073741824) {
                allSolved2 = hVar.j1(optimizeWrap);
                computations = 2;
                heightSize3 = heightSize4;
            } else {
                allSolved2 = hVar.k1(optimizeWrap);
                heightSize3 = heightSize4;
                if (widthMode == 1073741824) {
                    allSolved2 &= hVar.l1(optimizeWrap, 0);
                    computations = 0 + 1;
                }
                if (heightMode == 1073741824) {
                    allSolved2 &= hVar.l1(optimizeWrap, 1);
                    computations++;
                }
            }
            if (allSolved2) {
                hVar.T0(widthMode == 1073741824, heightMode == 1073741824);
            }
            heightSize2 = heightSize3;
            allSolved = allSolved2;
        } else {
            widthSize2 = widthSize;
            allSolved = false;
            heightSize2 = heightSize;
        }
        if (allSolved && computations == 2) {
            return 0L;
        }
        int optimizations3 = layout.n1();
        if (minWidth2 > 0) {
            b(layout);
        }
        e(layout);
        int sizeDependentWidgetsCount = this.f2710a.size();
        if (minWidth2 > 0) {
            c(hVar, startingWidth, startingHeight);
        }
        if (sizeDependentWidgetsCount > 0) {
            boolean needSolverPass = false;
            f v3 = layout.v();
            f fVar2 = f.WRAP_CONTENT;
            boolean containerWrapWidth2 = v3 == fVar2;
            boolean containerWrapHeight = layout.L() == fVar2;
            int minWidth3 = Math.max(layout.O(), this.f2712c.D());
            int minHeight2 = Math.max(layout.s(), this.f2712c.C());
            int i3 = 0;
            while (i3 < sizeDependentWidgetsCount) {
                g gVar = (g) this.f2710a.get(i3);
                i3++;
                minHeight2 = minHeight2;
            }
            int minHeight3 = minHeight2;
            int maxIterations2 = 2;
            int j2 = 0;
            while (true) {
                if (j2 >= maxIterations2) {
                    optimizations = optimizations3;
                    layoutTime = layoutTime2;
                    minWidth = minWidth3;
                    minHeight = minHeight3;
                    break;
                }
                layoutTime = layoutTime2;
                minWidth = minWidth3;
                int i4 = 0;
                minHeight = minHeight3;
                while (i4 < sizeDependentWidgetsCount) {
                    g widget = (g) this.f2710a.get(i4);
                    if (widget instanceof j) {
                        optimizations2 = optimizations3;
                    } else if (widget instanceof i) {
                        optimizations2 = optimizations3;
                    } else {
                        optimizations2 = optimizations3;
                        if (widget.N() != 8 && (!optimize5 || !widget.f2636d.f2767e.f2741j || !widget.f2638e.f2767e.f2741j)) {
                            int preWidth = widget.O();
                            int preHeight = widget.s();
                            optimize2 = optimize5;
                            int preBaselineDistance = widget.k();
                            if (j2 == maxIterations2 - 1) {
                                measureStrategy = 2;
                            } else {
                                measureStrategy = 1;
                            }
                            boolean hasMeasure = a(measurer, widget, measureStrategy);
                            needSolverPass |= hasMeasure;
                            Objects.requireNonNull(layout);
                            int measuredWidth = widget.O();
                            maxIterations = maxIterations2;
                            int measuredHeight = widget.s();
                            if (measuredWidth != preWidth) {
                                widget.P0(measuredWidth);
                                if (!containerWrapWidth2) {
                                    containerWrapWidth = containerWrapWidth2;
                                } else if (widget.H() > minWidth) {
                                    containerWrapWidth = containerWrapWidth2;
                                    int w2 = widget.H() + widget.j(o.d.RIGHT).e();
                                    minWidth = Math.max(minWidth, w2);
                                } else {
                                    containerWrapWidth = containerWrapWidth2;
                                }
                                needSolverPass = true;
                            } else {
                                containerWrapWidth = containerWrapWidth2;
                            }
                            if (measuredHeight != preHeight) {
                                widget.s0(measuredHeight);
                                if (containerWrapHeight && widget.m() > minHeight) {
                                    int h2 = widget.m() + widget.j(o.d.BOTTOM).e();
                                    minHeight = Math.max(minHeight, h2);
                                }
                                needSolverPass = true;
                            }
                            if (widget.R() && preBaselineDistance != widget.k()) {
                                needSolverPass = true;
                            }
                            i4++;
                            sizeDependentWidgetsCount = sizeDependentWidgetsCount;
                            optimizations3 = optimizations2;
                            optimize5 = optimize2;
                            maxIterations2 = maxIterations;
                            containerWrapWidth2 = containerWrapWidth;
                        }
                    }
                    containerWrapWidth = containerWrapWidth2;
                    optimize2 = optimize5;
                    maxIterations = maxIterations2;
                    i4++;
                    sizeDependentWidgetsCount = sizeDependentWidgetsCount;
                    optimizations3 = optimizations2;
                    optimize5 = optimize2;
                    maxIterations2 = maxIterations;
                    containerWrapWidth2 = containerWrapWidth;
                }
                optimizations = optimizations3;
                if (!needSolverPass) {
                    hVar = layout;
                    break;
                }
                hVar = layout;
                c(hVar, startingWidth, startingHeight);
                needSolverPass = false;
                j2++;
                minWidth3 = minWidth;
                minHeight3 = minHeight;
                optimizeWrap = optimizeWrap;
                minWidth2 = minWidth2;
                layoutTime2 = layoutTime;
                sizeDependentWidgetsCount = sizeDependentWidgetsCount;
                optimizations3 = optimizations;
                optimize5 = optimize5;
                maxIterations2 = maxIterations2;
                containerWrapWidth2 = containerWrapWidth2;
            }
            if (needSolverPass) {
                c(hVar, startingWidth, startingHeight);
                boolean needSolverPass2 = false;
                if (layout.O() < minWidth) {
                    hVar.P0(minWidth);
                    needSolverPass2 = true;
                }
                if (layout.s() < minHeight) {
                    hVar.s0(minHeight);
                    needSolverPass2 = true;
                }
                if (needSolverPass2) {
                    c(hVar, startingWidth, startingHeight);
                }
            }
        } else {
            optimizations = optimizations3;
            layoutTime = 0;
        }
        hVar.z1(optimizations);
        return layoutTime;
    }

    public final boolean a(c measurer, g widget, int measureStrategy) {
        this.f2711b.f2700a = widget.v();
        this.f2711b.f2701b = widget.L();
        this.f2711b.f2702c = widget.O();
        this.f2711b.f2703d = widget.s();
        b bVar = this.f2711b;
        bVar.f2708i = false;
        bVar.f2709j = measureStrategy;
        f fVar = bVar.f2700a;
        f fVar2 = f.MATCH_CONSTRAINT;
        boolean horizontalMatchConstraints = fVar == fVar2;
        boolean verticalMatchConstraints = bVar.f2701b == fVar2;
        boolean horizontalUseRatio = horizontalMatchConstraints && widget.U > 0.0f;
        boolean verticalUseRatio = verticalMatchConstraints && widget.U > 0.0f;
        if (horizontalUseRatio && widget.f2659p[0] == 4) {
            bVar.f2700a = f.FIXED;
        }
        if (verticalUseRatio && widget.f2659p[1] == 4) {
            bVar.f2701b = f.FIXED;
        }
        ((q.f) measurer).d(widget, bVar);
        widget.P0(this.f2711b.f2704e);
        widget.s0(this.f2711b.f2705f);
        widget.r0(this.f2711b.f2707h);
        widget.h0(this.f2711b.f2706g);
        b bVar2 = this.f2711b;
        bVar2.f2709j = 0;
        return bVar2.f2708i;
    }
}
