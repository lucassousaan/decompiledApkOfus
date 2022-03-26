package p;

import o.d;
import o.e;
import o.f;
import o.g;
import o.j;

/* JADX WARN: Classes with same name are omitted:
  
 */
/* loaded from: classes.dex */
public class q extends u {

    /* renamed from: k  reason: collision with root package name */
    public i f2750k;

    /* renamed from: l  reason: collision with root package name */
    public j f2751l = null;

    public q(g widget) {
        super(widget);
        i iVar = new i(this);
        this.f2750k = iVar;
        this.f2770h.f2736e = h.TOP;
        this.f2771i.f2736e = h.BOTTOM;
        iVar.f2736e = h.BASELINE;
        this.f2768f = 1;
    }

    public String toString() {
        return "VerticalRun " + this.f2764b.o();
    }

    @Override // p.u
    public void f() {
        this.f2765c = null;
        this.f2770h.c();
        this.f2771i.c();
        this.f2750k.c();
        this.f2767e.c();
        this.f2769g = false;
    }

    public void q() {
        this.f2769g = false;
        this.f2770h.c();
        this.f2770h.f2741j = false;
        this.f2771i.c();
        this.f2771i.f2741j = false;
        this.f2750k.c();
        this.f2750k.f2741j = false;
        this.f2767e.f2741j = false;
    }

    @Override // p.u
    public boolean m() {
        return this.f2766d != f.MATCH_CONSTRAINT || this.f2764b.f2658o == 0;
    }

    @Override // p.u, p.f
    public void a(f dependency) {
        switch (this.f2772j.ordinal()) {
            case 1:
                p();
                break;
            case 2:
                o();
                break;
            case 3:
                g gVar = this.f2764b;
                n(gVar.G, gVar.I, 1);
                return;
        }
        j jVar = this.f2767e;
        if (jVar.f2734c && !jVar.f2741j && this.f2766d == f.MATCH_CONSTRAINT) {
            g gVar2 = this.f2764b;
            switch (gVar2.f2658o) {
                case 2:
                    g parent = gVar2.F();
                    if (parent != null) {
                        j jVar2 = parent.f2638e.f2767e;
                        if (jVar2.f2741j) {
                            float percent = this.f2764b.f2665v;
                            int targetDimensionValue = jVar2.f2738g;
                            int size = (int) ((targetDimensionValue * percent) + 0.5f);
                            this.f2767e.d(size);
                            break;
                        }
                    }
                    break;
                case 3:
                    if (gVar2.f2636d.f2767e.f2741j) {
                        int size2 = 0;
                        int ratioSide = gVar2.r();
                        switch (ratioSide) {
                            case -1:
                                g gVar3 = this.f2764b;
                                size2 = (int) ((gVar3.f2636d.f2767e.f2738g / gVar3.q()) + 0.5f);
                                break;
                            case 0:
                                g gVar4 = this.f2764b;
                                size2 = (int) ((gVar4.f2636d.f2767e.f2738g * gVar4.q()) + 0.5f);
                                break;
                            case 1:
                                g gVar5 = this.f2764b;
                                size2 = (int) ((gVar5.f2636d.f2767e.f2738g / gVar5.q()) + 0.5f);
                                break;
                        }
                        this.f2767e.d(size2);
                        break;
                    }
                    break;
            }
        }
        i iVar = this.f2770h;
        if (iVar.f2734c) {
            i iVar2 = this.f2771i;
            if (iVar2.f2734c) {
                if (!iVar.f2741j || !iVar2.f2741j || !this.f2767e.f2741j) {
                    if (!this.f2767e.f2741j && this.f2766d == f.MATCH_CONSTRAINT) {
                        g gVar6 = this.f2764b;
                        if (gVar6.f2656n == 0 && !gVar6.Y()) {
                            i startTarget = (i) this.f2770h.f2743l.get(0);
                            int i2 = startTarget.f2738g;
                            i iVar3 = this.f2770h;
                            int startPos = i2 + iVar3.f2737f;
                            int endPos = ((i) this.f2771i.f2743l.get(0)).f2738g + this.f2771i.f2737f;
                            int distance = endPos - startPos;
                            iVar3.d(startPos);
                            this.f2771i.d(endPos);
                            this.f2767e.d(distance);
                            return;
                        }
                    }
                    i startTarget2 = this.f2767e;
                    if (!startTarget2.f2741j && this.f2766d == f.MATCH_CONSTRAINT && this.f2763a == 1 && this.f2770h.f2743l.size() > 0 && this.f2771i.f2743l.size() > 0) {
                        i startTarget3 = (i) this.f2770h.f2743l.get(0);
                        int startPos2 = startTarget3.f2738g + this.f2770h.f2737f;
                        int endPos2 = ((i) this.f2771i.f2743l.get(0)).f2738g + this.f2771i.f2737f;
                        int availableSpace = endPos2 - startPos2;
                        j jVar3 = this.f2767e;
                        int i3 = jVar3.f2744m;
                        if (availableSpace < i3) {
                            jVar3.d(availableSpace);
                        } else {
                            jVar3.d(i3);
                        }
                    }
                    i startTarget4 = this.f2767e;
                    if (startTarget4.f2741j && this.f2770h.f2743l.size() > 0 && this.f2771i.f2743l.size() > 0) {
                        i startTarget5 = (i) this.f2770h.f2743l.get(0);
                        i endTarget = (i) this.f2771i.f2743l.get(0);
                        int startPos3 = startTarget5.f2738g + this.f2770h.f2737f;
                        int endPos3 = endTarget.f2738g + this.f2771i.f2737f;
                        float bias = this.f2764b.J();
                        if (startTarget5 == endTarget) {
                            startPos3 = startTarget5.f2738g;
                            endPos3 = endTarget.f2738g;
                            bias = 0.5f;
                        }
                        int distance2 = (endPos3 - startPos3) - this.f2767e.f2738g;
                        this.f2770h.d((int) (startPos3 + 0.5f + (distance2 * bias)));
                        this.f2771i.d(this.f2770h.f2738g + this.f2767e.f2738g);
                    }
                }
            }
        }
    }

    @Override // p.u
    public void d() {
        g parent;
        g parent2;
        g gVar = this.f2764b;
        if (gVar.f2630a) {
            this.f2767e.d(gVar.s());
        }
        if (!this.f2767e.f2741j) {
            this.f2766d = this.f2764b.L();
            if (this.f2764b.R()) {
                this.f2751l = new a(this);
            }
            f fVar = this.f2766d;
            if (fVar != f.MATCH_CONSTRAINT) {
                if (fVar == f.MATCH_PARENT && (parent2 = this.f2764b.F()) != null && parent2.L() == f.FIXED) {
                    int resolvedDimension = (parent2.s() - this.f2764b.G.e()) - this.f2764b.I.e();
                    b(this.f2770h, parent2.f2638e.f2770h, this.f2764b.G.e());
                    b(this.f2771i, parent2.f2638e.f2771i, -this.f2764b.I.e());
                    this.f2767e.d(resolvedDimension);
                    return;
                } else if (this.f2766d == f.FIXED) {
                    this.f2767e.d(this.f2764b.s());
                }
            }
        } else if (this.f2766d == f.MATCH_PARENT && (parent = this.f2764b.F()) != null && parent.L() == f.FIXED) {
            b(this.f2770h, parent.f2638e.f2770h, this.f2764b.G.e());
            b(this.f2771i, parent.f2638e.f2771i, -this.f2764b.I.e());
            return;
        }
        j jVar = this.f2767e;
        boolean z2 = jVar.f2741j;
        if (z2) {
            g gVar2 = this.f2764b;
            if (gVar2.f2630a) {
                e[] eVarArr = gVar2.N;
                if (eVarArr[2].f2620f != null && eVarArr[3].f2620f != null) {
                    if (gVar2.Y()) {
                        this.f2770h.f2737f = this.f2764b.N[2].e();
                        this.f2771i.f2737f = -this.f2764b.N[3].e();
                    } else {
                        i startTarget = h(this.f2764b.N[2]);
                        if (startTarget != null) {
                            b(this.f2770h, startTarget, this.f2764b.N[2].e());
                        }
                        i endTarget = h(this.f2764b.N[3]);
                        if (endTarget != null) {
                            b(this.f2771i, endTarget, -this.f2764b.N[3].e());
                        }
                        this.f2770h.f2733b = true;
                        this.f2771i.f2733b = true;
                    }
                    if (this.f2764b.R()) {
                        b(this.f2750k, this.f2770h, this.f2764b.k());
                        return;
                    }
                    return;
                } else if (eVarArr[2].f2620f != null) {
                    i target = h(eVarArr[2]);
                    if (target != null) {
                        b(this.f2770h, target, this.f2764b.N[2].e());
                        b(this.f2771i, this.f2770h, this.f2767e.f2738g);
                        if (this.f2764b.R()) {
                            b(this.f2750k, this.f2770h, this.f2764b.k());
                            return;
                        }
                        return;
                    }
                    return;
                } else if (eVarArr[3].f2620f != null) {
                    i target2 = h(eVarArr[3]);
                    if (target2 != null) {
                        b(this.f2771i, target2, -this.f2764b.N[3].e());
                        b(this.f2770h, this.f2771i, -this.f2767e.f2738g);
                    }
                    if (this.f2764b.R()) {
                        b(this.f2750k, this.f2770h, this.f2764b.k());
                        return;
                    }
                    return;
                } else if (eVarArr[4].f2620f != null) {
                    i target3 = h(eVarArr[4]);
                    if (target3 != null) {
                        b(this.f2750k, target3, 0);
                        b(this.f2770h, this.f2750k, -this.f2764b.k());
                        b(this.f2771i, this.f2770h, this.f2767e.f2738g);
                        return;
                    }
                    return;
                } else if (!(gVar2 instanceof j) && gVar2.F() != null && this.f2764b.j(d.CENTER).f2620f == null) {
                    i top = this.f2764b.F().f2638e.f2770h;
                    b(this.f2770h, top, this.f2764b.Q());
                    b(this.f2771i, this.f2770h, this.f2767e.f2738g);
                    if (this.f2764b.R()) {
                        b(this.f2750k, this.f2770h, this.f2764b.k());
                        return;
                    }
                    return;
                } else {
                    return;
                }
            }
        }
        if (!z2 && this.f2766d == f.MATCH_CONSTRAINT) {
            g gVar3 = this.f2764b;
            switch (gVar3.f2658o) {
                case 2:
                    g parent3 = gVar3.F();
                    if (parent3 != null) {
                        j jVar2 = parent3.f2638e.f2767e;
                        this.f2767e.f2743l.add(jVar2);
                        jVar2.f2742k.add(this.f2767e);
                        j jVar3 = this.f2767e;
                        jVar3.f2733b = true;
                        jVar3.f2742k.add(this.f2770h);
                        this.f2767e.f2742k.add(this.f2771i);
                        break;
                    }
                    break;
                case 3:
                    if (!gVar3.Y()) {
                        g gVar4 = this.f2764b;
                        if (gVar4.f2656n != 3) {
                            j jVar4 = gVar4.f2636d.f2767e;
                            this.f2767e.f2743l.add(jVar4);
                            jVar4.f2742k.add(this.f2767e);
                            j jVar5 = this.f2767e;
                            jVar5.f2733b = true;
                            jVar5.f2742k.add(this.f2770h);
                            this.f2767e.f2742k.add(this.f2771i);
                            break;
                        }
                    }
                    break;
            }
        } else {
            jVar.b(this);
        }
        g gVar5 = this.f2764b;
        e[] eVarArr2 = gVar5.N;
        if (eVarArr2[2].f2620f != null && eVarArr2[3].f2620f != null) {
            if (gVar5.Y()) {
                this.f2770h.f2737f = this.f2764b.N[2].e();
                this.f2771i.f2737f = -this.f2764b.N[3].e();
            } else {
                i startTarget2 = h(this.f2764b.N[2]);
                i endTarget2 = h(this.f2764b.N[3]);
                startTarget2.b(this);
                endTarget2.b(this);
                this.f2772j = t.CENTER;
            }
            if (this.f2764b.R()) {
                c(this.f2750k, this.f2770h, 1, this.f2751l);
            }
        } else if (eVarArr2[2].f2620f != null) {
            i target4 = h(eVarArr2[2]);
            if (target4 != null) {
                b(this.f2770h, target4, this.f2764b.N[2].e());
                c(this.f2771i, this.f2770h, 1, this.f2767e);
                if (this.f2764b.R()) {
                    c(this.f2750k, this.f2770h, 1, this.f2751l);
                }
                f fVar2 = this.f2766d;
                f fVar3 = f.MATCH_CONSTRAINT;
                if (fVar2 == fVar3 && this.f2764b.q() > 0.0f) {
                    o oVar = this.f2764b.f2636d;
                    if (oVar.f2766d == fVar3) {
                        oVar.f2767e.f2742k.add(this.f2767e);
                        this.f2767e.f2743l.add(this.f2764b.f2636d.f2767e);
                        this.f2767e.f2732a = this;
                    }
                }
            }
        } else if (eVarArr2[3].f2620f != null) {
            i target5 = h(eVarArr2[3]);
            if (target5 != null) {
                b(this.f2771i, target5, -this.f2764b.N[3].e());
                c(this.f2770h, this.f2771i, -1, this.f2767e);
                if (this.f2764b.R()) {
                    c(this.f2750k, this.f2770h, 1, this.f2751l);
                }
            }
        } else if (eVarArr2[4].f2620f != null) {
            i target6 = h(eVarArr2[4]);
            if (target6 != null) {
                b(this.f2750k, target6, 0);
                c(this.f2770h, this.f2750k, -1, this.f2751l);
                c(this.f2771i, this.f2770h, 1, this.f2767e);
            }
        } else if (!(gVar5 instanceof j) && gVar5.F() != null) {
            i top2 = this.f2764b.F().f2638e.f2770h;
            b(this.f2770h, top2, this.f2764b.Q());
            c(this.f2771i, this.f2770h, 1, this.f2767e);
            if (this.f2764b.R()) {
                c(this.f2750k, this.f2770h, 1, this.f2751l);
            }
            f fVar4 = this.f2766d;
            f fVar5 = f.MATCH_CONSTRAINT;
            if (fVar4 == fVar5 && this.f2764b.q() > 0.0f) {
                o oVar2 = this.f2764b.f2636d;
                if (oVar2.f2766d == fVar5) {
                    oVar2.f2767e.f2742k.add(this.f2767e);
                    this.f2767e.f2743l.add(this.f2764b.f2636d.f2767e);
                    this.f2767e.f2732a = this;
                }
            }
        }
        i top3 = this.f2767e;
        if (top3.f2743l.size() == 0) {
            this.f2767e.f2734c = true;
        }
    }

    @Override // p.u
    public void e() {
        i iVar = this.f2770h;
        if (iVar.f2741j) {
            this.f2764b.R0(iVar.f2738g);
        }
    }
}
