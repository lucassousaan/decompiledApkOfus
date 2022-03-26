package p;

import androidx.constraintlayout.solver.widgets.analyzer.ChainRun;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;
import o.e;
import o.f;
import o.h;
import o.i;
import o.k;

/* JADX WARN: Classes with same name are omitted:
  
 */
/* loaded from: classes.dex */
public class g {

    /* renamed from: a  reason: collision with root package name */
    public h f2715a;

    /* renamed from: d  reason: collision with root package name */
    public h f2718d;

    /* renamed from: b  reason: collision with root package name */
    public boolean f2716b = true;

    /* renamed from: c  reason: collision with root package name */
    public boolean f2717c = true;

    /* renamed from: e  reason: collision with root package name */
    public ArrayList f2719e = new ArrayList();

    /* renamed from: f  reason: collision with root package name */
    public c f2720f = null;

    /* renamed from: g  reason: collision with root package name */
    public b f2721g = new b();

    /* renamed from: h  reason: collision with root package name */
    public ArrayList f2722h = new ArrayList();

    public g(h container) {
        new ArrayList();
        this.f2715a = container;
        this.f2718d = container;
    }

    public void n(c measurer) {
        this.f2720f = measurer;
    }

    public final int e(h container, int orientation) {
        int count = this.f2722h.size();
        long wrapSize = 0;
        for (int i2 = 0; i2 < count; i2++) {
            p run = (p) this.f2722h.get(i2);
            long size = run.b(container, orientation);
            wrapSize = Math.max(wrapSize, size);
        }
        int i3 = (int) wrapSize;
        return i3;
    }

    public boolean f(boolean optimizeWrap) {
        boolean optimizeWrap2 = optimizeWrap & true;
        if (this.f2716b || this.f2717c) {
            Iterator it = this.f2715a.f2689p0.iterator();
            while (it.hasNext()) {
                o.g widget = (o.g) it.next();
                widget.i();
                widget.f2630a = false;
                widget.f2636d.r();
                widget.f2638e.q();
            }
            this.f2715a.i();
            h hVar = this.f2715a;
            hVar.f2630a = false;
            hVar.f2636d.r();
            this.f2715a.f2638e.q();
            this.f2717c = false;
        }
        b(this.f2718d);
        if (0 != 0) {
            return false;
        }
        this.f2715a.Q0(0);
        this.f2715a.R0(0);
        f originalHorizontalDimension = this.f2715a.p(0);
        f originalVerticalDimension = this.f2715a.p(1);
        if (this.f2716b) {
            c();
        }
        int x1 = this.f2715a.P();
        int y1 = this.f2715a.Q();
        this.f2715a.f2636d.f2770h.d(x1);
        this.f2715a.f2638e.f2770h.d(y1);
        m();
        f fVar = f.WRAP_CONTENT;
        if (originalHorizontalDimension == fVar || originalVerticalDimension == fVar) {
            if (optimizeWrap2) {
                Iterator it2 = this.f2719e.iterator();
                while (true) {
                    if (it2.hasNext()) {
                        if (!((u) it2.next()).m()) {
                            optimizeWrap2 = false;
                            break;
                        }
                    } else {
                        break;
                    }
                }
            }
            if (optimizeWrap2 && originalHorizontalDimension == f.WRAP_CONTENT) {
                this.f2715a.w0(f.FIXED);
                h hVar2 = this.f2715a;
                hVar2.P0(e(hVar2, 0));
                h hVar3 = this.f2715a;
                hVar3.f2636d.f2767e.d(hVar3.O());
            }
            if (optimizeWrap2 && originalVerticalDimension == f.WRAP_CONTENT) {
                this.f2715a.L0(f.FIXED);
                h hVar4 = this.f2715a;
                hVar4.s0(e(hVar4, 1));
                h hVar5 = this.f2715a;
                hVar5.f2638e.f2767e.d(hVar5.s());
            }
        }
        boolean checkRoot = false;
        h hVar6 = this.f2715a;
        f[] fVarArr = hVar6.Q;
        f fVar2 = fVarArr[0];
        f fVar3 = f.FIXED;
        if (fVar2 == fVar3 || fVarArr[0] == f.MATCH_PARENT) {
            int x2 = hVar6.O() + x1;
            this.f2715a.f2636d.f2771i.d(x2);
            this.f2715a.f2636d.f2767e.d(x2 - x1);
            m();
            h hVar7 = this.f2715a;
            f[] fVarArr2 = hVar7.Q;
            if (fVarArr2[1] == fVar3 || fVarArr2[1] == f.MATCH_PARENT) {
                int y2 = hVar7.s() + y1;
                this.f2715a.f2638e.f2771i.d(y2);
                this.f2715a.f2638e.f2767e.d(y2 - y1);
            }
            m();
            checkRoot = true;
        }
        Iterator it3 = this.f2719e.iterator();
        while (it3.hasNext()) {
            u run = (u) it3.next();
            if (run.f2764b != this.f2715a || run.f2769g) {
                run.e();
            }
        }
        boolean allResolved = true;
        Iterator it4 = this.f2719e.iterator();
        while (true) {
            if (!it4.hasNext()) {
                break;
            }
            u run2 = (u) it4.next();
            if (checkRoot || run2.f2764b != this.f2715a) {
                if (run2.f2770h.f2741j) {
                    if (run2.f2771i.f2741j || (run2 instanceof m)) {
                        if (!run2.f2767e.f2741j && !(run2 instanceof e) && !(run2 instanceof m)) {
                            allResolved = false;
                            break;
                        }
                    } else {
                        allResolved = false;
                        break;
                    }
                } else {
                    allResolved = false;
                    break;
                }
            }
        }
        this.f2715a.w0(originalHorizontalDimension);
        this.f2715a.L0(originalVerticalDimension);
        return allResolved;
    }

    public boolean g() {
        if (this.f2716b) {
            Iterator it = this.f2715a.f2689p0.iterator();
            while (it.hasNext()) {
                o.g widget = (o.g) it.next();
                widget.i();
                widget.f2630a = false;
                o oVar = widget.f2636d;
                oVar.f2767e.f2741j = false;
                oVar.f2769g = false;
                oVar.r();
                q qVar = widget.f2638e;
                qVar.f2767e.f2741j = false;
                qVar.f2769g = false;
                qVar.q();
            }
            this.f2715a.i();
            h hVar = this.f2715a;
            hVar.f2630a = false;
            o oVar2 = hVar.f2636d;
            oVar2.f2767e.f2741j = false;
            oVar2.f2769g = false;
            oVar2.r();
            q qVar2 = this.f2715a.f2638e;
            qVar2.f2767e.f2741j = false;
            qVar2.f2769g = false;
            qVar2.q();
            c();
        }
        b(this.f2718d);
        if (0 != 0) {
            return false;
        }
        this.f2715a.Q0(0);
        this.f2715a.R0(0);
        this.f2715a.f2636d.f2770h.d(0);
        this.f2715a.f2638e.f2770h.d(0);
        return true;
    }

    public boolean h(boolean optimizeWrap, int orientation) {
        f fVar;
        boolean optimizeWrap2 = optimizeWrap & true;
        f originalHorizontalDimension = this.f2715a.p(0);
        f originalVerticalDimension = this.f2715a.p(1);
        int x1 = this.f2715a.P();
        int y1 = this.f2715a.Q();
        if (optimizeWrap2 && (originalHorizontalDimension == (fVar = f.WRAP_CONTENT) || originalVerticalDimension == fVar)) {
            Iterator it = this.f2719e.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                u run = (u) it.next();
                if (run.f2768f == orientation && !run.m()) {
                    optimizeWrap2 = false;
                    break;
                }
            }
            if (orientation == 0) {
                if (optimizeWrap2 && originalHorizontalDimension == f.WRAP_CONTENT) {
                    this.f2715a.w0(f.FIXED);
                    h hVar = this.f2715a;
                    hVar.P0(e(hVar, 0));
                    h hVar2 = this.f2715a;
                    hVar2.f2636d.f2767e.d(hVar2.O());
                }
            } else if (optimizeWrap2 && originalVerticalDimension == f.WRAP_CONTENT) {
                this.f2715a.L0(f.FIXED);
                h hVar3 = this.f2715a;
                hVar3.s0(e(hVar3, 1));
                h hVar4 = this.f2715a;
                hVar4.f2638e.f2767e.d(hVar4.s());
            }
        }
        boolean checkRoot = false;
        if (orientation == 0) {
            h hVar5 = this.f2715a;
            f[] fVarArr = hVar5.Q;
            if (fVarArr[0] == f.FIXED || fVarArr[0] == f.MATCH_PARENT) {
                int x2 = hVar5.O() + x1;
                this.f2715a.f2636d.f2771i.d(x2);
                this.f2715a.f2636d.f2767e.d(x2 - x1);
                checkRoot = true;
            }
        } else {
            h hVar6 = this.f2715a;
            f[] fVarArr2 = hVar6.Q;
            if (fVarArr2[1] == f.FIXED || fVarArr2[1] == f.MATCH_PARENT) {
                int y2 = hVar6.s() + y1;
                this.f2715a.f2638e.f2771i.d(y2);
                this.f2715a.f2638e.f2767e.d(y2 - y1);
                checkRoot = true;
            }
        }
        m();
        Iterator it2 = this.f2719e.iterator();
        while (it2.hasNext()) {
            u run2 = (u) it2.next();
            if (run2.f2768f == orientation && (run2.f2764b != this.f2715a || run2.f2769g)) {
                run2.e();
            }
        }
        boolean allResolved = true;
        Iterator it3 = this.f2719e.iterator();
        while (true) {
            if (!it3.hasNext()) {
                break;
            }
            u run3 = (u) it3.next();
            if (run3.f2768f == orientation && (checkRoot || run3.f2764b != this.f2715a)) {
                if (run3.f2770h.f2741j) {
                    if (run3.f2771i.f2741j) {
                        if (!(run3 instanceof e) && !run3.f2767e.f2741j) {
                            allResolved = false;
                            break;
                        }
                    } else {
                        allResolved = false;
                        break;
                    }
                } else {
                    allResolved = false;
                    break;
                }
            }
        }
        this.f2715a.w0(originalHorizontalDimension);
        this.f2715a.L0(originalVerticalDimension);
        return allResolved;
    }

    public final void l(o.g widget, f horizontalBehavior, int horizontalDimension, f verticalBehavior, int verticalDimension) {
        b bVar = this.f2721g;
        bVar.f2700a = horizontalBehavior;
        bVar.f2701b = verticalBehavior;
        bVar.f2702c = horizontalDimension;
        bVar.f2703d = verticalDimension;
        ((q.f) this.f2720f).d(widget, bVar);
        widget.P0(this.f2721g.f2704e);
        widget.s0(this.f2721g.f2705f);
        widget.r0(this.f2721g.f2707h);
        widget.h0(this.f2721g.f2706g);
    }

    public final boolean b(h constraintWidgetContainer) {
        f horiz;
        f vert;
        f fVar;
        f fVar2;
        Iterator it = constraintWidgetContainer.f2689p0.iterator();
        while (it.hasNext()) {
            o.g widget = (o.g) it.next();
            f[] fVarArr = widget.Q;
            f horiz2 = fVarArr[0];
            f vert2 = fVarArr[1];
            if (widget.N() == 8) {
                widget.f2630a = true;
            } else {
                if (widget.f2662s < 1.0f && horiz2 == f.MATCH_CONSTRAINT) {
                    widget.f2656n = 2;
                }
                if (widget.f2665v < 1.0f && vert2 == f.MATCH_CONSTRAINT) {
                    widget.f2658o = 2;
                }
                if (widget.q() > 0.0f) {
                    f fVar3 = f.MATCH_CONSTRAINT;
                    if (horiz2 == fVar3 && (vert2 == f.WRAP_CONTENT || vert2 == f.FIXED)) {
                        widget.f2656n = 3;
                    } else if (vert2 == fVar3 && (horiz2 == f.WRAP_CONTENT || horiz2 == f.FIXED)) {
                        widget.f2658o = 3;
                    } else if (horiz2 == fVar3 && vert2 == fVar3) {
                        if (widget.f2656n == 0) {
                            widget.f2656n = 3;
                        }
                        if (widget.f2658o == 0) {
                            widget.f2658o = 3;
                        }
                    }
                }
                f fVar4 = f.MATCH_CONSTRAINT;
                if (horiz2 == fVar4 && widget.f2656n == 1 && (widget.F.f2620f == null || widget.H.f2620f == null)) {
                    horiz = f.WRAP_CONTENT;
                } else {
                    horiz = horiz2;
                }
                if (vert2 == fVar4 && widget.f2658o == 1 && (widget.G.f2620f == null || widget.I.f2620f == null)) {
                    vert = f.WRAP_CONTENT;
                } else {
                    vert = vert2;
                }
                o oVar = widget.f2636d;
                oVar.f2766d = horiz;
                int i2 = widget.f2656n;
                oVar.f2763a = i2;
                q qVar = widget.f2638e;
                qVar.f2766d = vert;
                int i3 = widget.f2658o;
                qVar.f2763a = i3;
                f fVar5 = f.MATCH_PARENT;
                if ((horiz == fVar5 || horiz == f.FIXED || horiz == f.WRAP_CONTENT) && (vert == fVar5 || vert == f.FIXED || vert == f.WRAP_CONTENT)) {
                    int width = widget.O();
                    if (horiz == fVar5) {
                        width = (constraintWidgetContainer.O() - widget.F.f2621g) - widget.H.f2621g;
                        horiz = f.FIXED;
                    }
                    int height = widget.s();
                    if (vert == fVar5) {
                        height = (constraintWidgetContainer.s() - widget.G.f2621g) - widget.I.f2621g;
                        vert = f.FIXED;
                    }
                    l(widget, horiz, width, vert, height);
                    widget.f2636d.f2767e.d(widget.O());
                    widget.f2638e.f2767e.d(widget.s());
                    widget.f2630a = true;
                } else {
                    if (horiz == fVar4 && (vert == (fVar2 = f.WRAP_CONTENT) || vert == f.FIXED)) {
                        if (i2 == 3) {
                            if (vert == fVar2) {
                                l(widget, fVar2, 0, fVar2, 0);
                            }
                            int height2 = widget.s();
                            int width2 = (int) ((height2 * widget.U) + 0.5f);
                            f fVar6 = f.FIXED;
                            l(widget, fVar6, width2, fVar6, height2);
                            widget.f2636d.f2767e.d(widget.O());
                            widget.f2638e.f2767e.d(widget.s());
                            widget.f2630a = true;
                        } else if (i2 == 1) {
                            l(widget, fVar2, 0, vert, 0);
                            widget.f2636d.f2767e.f2744m = widget.O();
                        } else if (i2 == 2) {
                            f[] fVarArr2 = constraintWidgetContainer.Q;
                            f fVar7 = fVarArr2[0];
                            f fVar8 = f.FIXED;
                            if (fVar7 == fVar8 || fVarArr2[0] == fVar5) {
                                float percent = widget.f2662s;
                                int width3 = (int) ((constraintWidgetContainer.O() * percent) + 0.5f);
                                int height3 = widget.s();
                                l(widget, fVar8, width3, vert, height3);
                                widget.f2636d.f2767e.d(widget.O());
                                widget.f2638e.f2767e.d(widget.s());
                                widget.f2630a = true;
                            }
                        } else {
                            e[] eVarArr = widget.N;
                            if (eVarArr[0].f2620f == null || eVarArr[1].f2620f == null) {
                                l(widget, fVar2, 0, vert, 0);
                                widget.f2636d.f2767e.d(widget.O());
                                widget.f2638e.f2767e.d(widget.s());
                                widget.f2630a = true;
                            }
                        }
                    }
                    if (vert == fVar4 && (horiz == (fVar = f.WRAP_CONTENT) || horiz == f.FIXED)) {
                        if (i3 == 3) {
                            if (horiz == fVar) {
                                l(widget, fVar, 0, fVar, 0);
                            }
                            int width4 = widget.O();
                            float ratio = widget.U;
                            if (widget.r() == -1) {
                                ratio = 1.0f / ratio;
                            }
                            int height4 = (int) ((width4 * ratio) + 0.5f);
                            f fVar9 = f.FIXED;
                            l(widget, fVar9, width4, fVar9, height4);
                            widget.f2636d.f2767e.d(widget.O());
                            widget.f2638e.f2767e.d(widget.s());
                            widget.f2630a = true;
                        } else if (i3 == 1) {
                            l(widget, horiz, 0, fVar, 0);
                            widget.f2638e.f2767e.f2744m = widget.s();
                        } else if (i3 == 2) {
                            f[] fVarArr3 = constraintWidgetContainer.Q;
                            f fVar10 = fVarArr3[1];
                            f fVar11 = f.FIXED;
                            if (fVar10 == fVar11 || fVarArr3[1] == fVar5) {
                                float percent2 = widget.f2665v;
                                int width5 = widget.O();
                                int height5 = (int) ((constraintWidgetContainer.s() * percent2) + 0.5f);
                                l(widget, horiz, width5, fVar11, height5);
                                widget.f2636d.f2767e.d(widget.O());
                                widget.f2638e.f2767e.d(widget.s());
                                widget.f2630a = true;
                            }
                        } else {
                            e[] eVarArr2 = widget.N;
                            if (eVarArr2[2].f2620f == null || eVarArr2[3].f2620f == null) {
                                l(widget, fVar, 0, vert, 0);
                                widget.f2636d.f2767e.d(widget.O());
                                widget.f2638e.f2767e.d(widget.s());
                                widget.f2630a = true;
                            }
                        }
                    }
                    if (horiz == fVar4 && vert == fVar4) {
                        if (i2 == 1 || i3 == 1) {
                            f fVar12 = f.WRAP_CONTENT;
                            l(widget, fVar12, 0, fVar12, 0);
                            widget.f2636d.f2767e.f2744m = widget.O();
                            widget.f2638e.f2767e.f2744m = widget.s();
                        } else if (i3 == 2 && i2 == 2) {
                            f[] fVarArr4 = constraintWidgetContainer.Q;
                            f fVar13 = fVarArr4[0];
                            f fVar14 = f.FIXED;
                            if (fVar13 == fVar14 || fVarArr4[0] == fVar14) {
                                if (fVarArr4[1] == fVar14 || fVarArr4[1] == fVar14) {
                                    float horizPercent = widget.f2662s;
                                    float vertPercent = widget.f2665v;
                                    int width6 = (int) ((constraintWidgetContainer.O() * horizPercent) + 0.5f);
                                    int height6 = (int) ((constraintWidgetContainer.s() * vertPercent) + 0.5f);
                                    l(widget, fVar14, width6, fVar14, height6);
                                    widget.f2636d.f2767e.d(widget.O());
                                    widget.f2638e.f2767e.d(widget.s());
                                    widget.f2630a = true;
                                }
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    public void m() {
        j jVar;
        Iterator it = this.f2715a.f2689p0.iterator();
        while (it.hasNext()) {
            o.g widget = (o.g) it.next();
            if (!widget.f2630a) {
                f[] fVarArr = widget.Q;
                boolean vertWrap = false;
                f horiz = fVarArr[0];
                f vert = fVarArr[1];
                int horizMatchConstraintsType = widget.f2656n;
                int vertMatchConstraintsType = widget.f2658o;
                f fVar = f.WRAP_CONTENT;
                boolean horizWrap = horiz == fVar || (horiz == f.MATCH_CONSTRAINT && horizMatchConstraintsType == 1);
                if (vert == fVar || (vert == f.MATCH_CONSTRAINT && vertMatchConstraintsType == 1)) {
                    vertWrap = true;
                }
                j jVar2 = widget.f2636d.f2767e;
                boolean horizResolved = jVar2.f2741j;
                j jVar3 = widget.f2638e.f2767e;
                boolean vertResolved = jVar3.f2741j;
                if (horizResolved && vertResolved) {
                    f fVar2 = f.FIXED;
                    l(widget, fVar2, jVar2.f2738g, fVar2, jVar3.f2738g);
                    widget.f2630a = true;
                } else if (horizResolved && vertWrap) {
                    l(widget, f.FIXED, jVar2.f2738g, fVar, jVar3.f2738g);
                    if (vert == f.MATCH_CONSTRAINT) {
                        widget.f2638e.f2767e.f2744m = widget.s();
                    } else {
                        widget.f2638e.f2767e.d(widget.s());
                        widget.f2630a = true;
                    }
                } else if (vertResolved && horizWrap) {
                    l(widget, fVar, jVar2.f2738g, f.FIXED, jVar3.f2738g);
                    if (horiz == f.MATCH_CONSTRAINT) {
                        widget.f2636d.f2767e.f2744m = widget.O();
                    } else {
                        widget.f2636d.f2767e.d(widget.O());
                        widget.f2630a = true;
                    }
                }
                if (widget.f2630a && (jVar = widget.f2638e.f2751l) != null) {
                    jVar.d(widget.k());
                }
            }
        }
    }

    public void j() {
        this.f2716b = true;
    }

    public void k() {
        this.f2717c = true;
    }

    public void c() {
        d(this.f2719e);
        this.f2722h.clear();
        p.f2747c = 0;
        i(this.f2715a.f2636d, 0, this.f2722h);
        i(this.f2715a.f2638e, 1, this.f2722h);
        this.f2716b = false;
    }

    public void d(ArrayList arrayList) {
        arrayList.clear();
        this.f2718d.f2636d.f();
        this.f2718d.f2638e.f();
        arrayList.add(this.f2718d.f2636d);
        arrayList.add(this.f2718d.f2638e);
        HashSet<ChainRun> chainRuns = null;
        Iterator it = this.f2718d.f2689p0.iterator();
        while (it.hasNext()) {
            o.g widget = (o.g) it.next();
            if (widget instanceof i) {
                arrayList.add(new m(widget));
            } else {
                if (widget.W()) {
                    if (widget.f2632b == null) {
                        e chainRun = new e(widget, 0);
                        widget.f2632b = chainRun;
                    }
                    if (chainRuns == null) {
                        chainRuns = new HashSet<>();
                    }
                    chainRuns.add(widget.f2632b);
                } else {
                    arrayList.add(widget.f2636d);
                }
                if (widget.Y()) {
                    if (widget.f2634c == null) {
                        e chainRun2 = new e(widget, 1);
                        widget.f2634c = chainRun2;
                    }
                    if (chainRuns == null) {
                        chainRuns = new HashSet<>();
                    }
                    chainRuns.add(widget.f2634c);
                } else {
                    arrayList.add(widget.f2638e);
                }
                if (widget instanceof k) {
                    arrayList.add(new n(widget));
                }
            }
        }
        if (chainRuns != null) {
            arrayList.addAll(chainRuns);
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            ((u) it2.next()).f();
        }
        Iterator it3 = arrayList.iterator();
        while (it3.hasNext()) {
            u run = (u) it3.next();
            if (run.f2764b != this.f2718d) {
                run.d();
            }
        }
    }

    public final void a(i node, int orientation, int direction, i end, ArrayList arrayList, p group) {
        p group2;
        u run = node.f2735d;
        if (run.f2765c == null) {
            h hVar = this.f2715a;
            if (run != hVar.f2636d) {
                if (run != hVar.f2638e) {
                    if (group == null) {
                        p group3 = new p(run, direction);
                        arrayList.add(group3);
                        group2 = group3;
                    } else {
                        group2 = group;
                    }
                    run.f2765c = group2;
                    group2.a(run);
                    for (f dependent : run.f2770h.f2742k) {
                        if (dependent instanceof i) {
                            a((i) dependent, orientation, 0, end, arrayList, group2);
                        }
                    }
                    for (f dependent2 : run.f2771i.f2742k) {
                        if (dependent2 instanceof i) {
                            a((i) dependent2, orientation, 1, end, arrayList, group2);
                        }
                    }
                    if (orientation == 1 && (run instanceof q)) {
                        for (f dependent3 : ((q) run).f2750k.f2742k) {
                            if (dependent3 instanceof i) {
                                a((i) dependent3, orientation, 2, end, arrayList, group2);
                            }
                        }
                    }
                    for (i target : run.f2770h.f2743l) {
                        if (target == end) {
                            Objects.requireNonNull(group2);
                        }
                        a(target, orientation, 0, end, arrayList, group2);
                    }
                    for (i target2 : run.f2771i.f2743l) {
                        if (target2 == end) {
                            Objects.requireNonNull(group2);
                        }
                        a(target2, orientation, 1, end, arrayList, group2);
                    }
                    if (orientation == 1 && (run instanceof q)) {
                        for (i target3 : ((q) run).f2750k.f2743l) {
                            a(target3, orientation, 2, end, arrayList, group2);
                        }
                    }
                }
            }
        }
    }

    public final void i(u run, int orientation, ArrayList arrayList) {
        for (f dependent : run.f2770h.f2742k) {
            if (dependent instanceof i) {
                i node = (i) dependent;
                a(node, orientation, 0, run.f2771i, arrayList, null);
            } else if (dependent instanceof u) {
                u dependentRun = (u) dependent;
                a(dependentRun.f2770h, orientation, 0, run.f2771i, arrayList, null);
            }
        }
        for (f dependent2 : run.f2771i.f2742k) {
            if (dependent2 instanceof i) {
                i node2 = (i) dependent2;
                a(node2, orientation, 1, run.f2770h, arrayList, null);
            } else if (dependent2 instanceof u) {
                u dependentRun2 = (u) dependent2;
                a(dependentRun2.f2771i, orientation, 1, run.f2770h, arrayList, null);
            }
        }
        if (orientation == 1) {
            for (f dependent3 : ((q) run).f2750k.f2742k) {
                if (dependent3 instanceof i) {
                    i node3 = (i) dependent3;
                    a(node3, orientation, 2, null, arrayList, null);
                }
            }
        }
    }
}
