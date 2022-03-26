package p;

import o.d;
import o.e;
import o.f;
import o.g;
import o.j;

/* JADX WARN: Classes with same name are omitted:
  
 */
/* loaded from: classes.dex */
public class o extends u {

    /* renamed from: k  reason: collision with root package name */
    public static int[] f2746k = new int[2];

    public o(g widget) {
        super(widget);
        this.f2770h.f2736e = h.LEFT;
        this.f2771i.f2736e = h.RIGHT;
        this.f2768f = 0;
    }

    public String toString() {
        return "HorizontalRun " + this.f2764b.o();
    }

    @Override // p.u
    public void f() {
        this.f2765c = null;
        this.f2770h.c();
        this.f2771i.c();
        this.f2767e.c();
        this.f2769g = false;
    }

    public void r() {
        this.f2769g = false;
        this.f2770h.c();
        this.f2770h.f2741j = false;
        this.f2771i.c();
        this.f2771i.f2741j = false;
        this.f2767e.f2741j = false;
    }

    @Override // p.u
    public boolean m() {
        return this.f2766d != f.MATCH_CONSTRAINT || this.f2764b.f2656n == 0;
    }

    @Override // p.u
    public void d() {
        g parent;
        g parent2;
        g gVar = this.f2764b;
        if (gVar.f2630a) {
            this.f2767e.d(gVar.O());
        }
        if (!this.f2767e.f2741j) {
            f v2 = this.f2764b.v();
            this.f2766d = v2;
            if (v2 != f.MATCH_CONSTRAINT) {
                f fVar = f.MATCH_PARENT;
                if (v2 == fVar && (((parent2 = this.f2764b.F()) != null && parent2.v() == f.FIXED) || parent2.v() == fVar)) {
                    int resolvedDimension = (parent2.O() - this.f2764b.F.e()) - this.f2764b.H.e();
                    b(this.f2770h, parent2.f2636d.f2770h, this.f2764b.F.e());
                    b(this.f2771i, parent2.f2636d.f2771i, -this.f2764b.H.e());
                    this.f2767e.d(resolvedDimension);
                    return;
                } else if (this.f2766d == f.FIXED) {
                    this.f2767e.d(this.f2764b.O());
                }
            }
        } else {
            f fVar2 = this.f2766d;
            f fVar3 = f.MATCH_PARENT;
            if (fVar2 == fVar3 && (((parent = this.f2764b.F()) != null && parent.v() == f.FIXED) || parent.v() == fVar3)) {
                b(this.f2770h, parent.f2636d.f2770h, this.f2764b.F.e());
                b(this.f2771i, parent.f2636d.f2771i, -this.f2764b.H.e());
                return;
            }
        }
        j jVar = this.f2767e;
        if (jVar.f2741j) {
            g gVar2 = this.f2764b;
            if (gVar2.f2630a) {
                e[] eVarArr = gVar2.N;
                if (eVarArr[0].f2620f == null || eVarArr[1].f2620f == null) {
                    if (eVarArr[0].f2620f != null) {
                        i target = h(eVarArr[0]);
                        if (target != null) {
                            b(this.f2770h, target, this.f2764b.N[0].e());
                            b(this.f2771i, this.f2770h, this.f2767e.f2738g);
                            return;
                        }
                        return;
                    } else if (eVarArr[1].f2620f != null) {
                        i target2 = h(eVarArr[1]);
                        if (target2 != null) {
                            b(this.f2771i, target2, -this.f2764b.N[1].e());
                            b(this.f2770h, this.f2771i, -this.f2767e.f2738g);
                            return;
                        }
                        return;
                    } else if (!(gVar2 instanceof j) && gVar2.F() != null && this.f2764b.j(d.CENTER).f2620f == null) {
                        i left = this.f2764b.F().f2636d.f2770h;
                        b(this.f2770h, left, this.f2764b.P());
                        b(this.f2771i, this.f2770h, this.f2767e.f2738g);
                        return;
                    } else {
                        return;
                    }
                } else if (gVar2.W()) {
                    this.f2770h.f2737f = this.f2764b.N[0].e();
                    this.f2771i.f2737f = -this.f2764b.N[1].e();
                    return;
                } else {
                    i startTarget = h(this.f2764b.N[0]);
                    if (startTarget != null) {
                        b(this.f2770h, startTarget, this.f2764b.N[0].e());
                    }
                    i endTarget = h(this.f2764b.N[1]);
                    if (endTarget != null) {
                        b(this.f2771i, endTarget, -this.f2764b.N[1].e());
                    }
                    this.f2770h.f2733b = true;
                    this.f2771i.f2733b = true;
                    return;
                }
            }
        }
        if (this.f2766d == f.MATCH_CONSTRAINT) {
            g gVar3 = this.f2764b;
            switch (gVar3.f2656n) {
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
                    if (gVar3.f2658o != 3) {
                        j jVar4 = gVar3.f2638e.f2767e;
                        jVar.f2743l.add(jVar4);
                        jVar4.f2742k.add(this.f2767e);
                        this.f2764b.f2638e.f2770h.f2742k.add(this.f2767e);
                        this.f2764b.f2638e.f2771i.f2742k.add(this.f2767e);
                        j jVar5 = this.f2767e;
                        jVar5.f2733b = true;
                        jVar5.f2742k.add(this.f2770h);
                        this.f2767e.f2742k.add(this.f2771i);
                        this.f2770h.f2743l.add(this.f2767e);
                        this.f2771i.f2743l.add(this.f2767e);
                        break;
                    } else {
                        this.f2770h.f2732a = this;
                        this.f2771i.f2732a = this;
                        q qVar = gVar3.f2638e;
                        qVar.f2770h.f2732a = this;
                        qVar.f2771i.f2732a = this;
                        jVar.f2732a = this;
                        if (!gVar3.Y()) {
                            if (!this.f2764b.W()) {
                                this.f2764b.f2638e.f2767e.f2743l.add(this.f2767e);
                                break;
                            } else {
                                this.f2764b.f2638e.f2767e.f2743l.add(this.f2767e);
                                this.f2767e.f2742k.add(this.f2764b.f2638e.f2767e);
                                break;
                            }
                        } else {
                            this.f2767e.f2743l.add(this.f2764b.f2638e.f2767e);
                            this.f2764b.f2638e.f2767e.f2742k.add(this.f2767e);
                            q qVar2 = this.f2764b.f2638e;
                            qVar2.f2767e.f2732a = this;
                            this.f2767e.f2743l.add(qVar2.f2770h);
                            this.f2767e.f2743l.add(this.f2764b.f2638e.f2771i);
                            this.f2764b.f2638e.f2770h.f2742k.add(this.f2767e);
                            this.f2764b.f2638e.f2771i.f2742k.add(this.f2767e);
                            break;
                        }
                    }
            }
        }
        g parent4 = this.f2764b;
        e[] eVarArr2 = parent4.N;
        if (eVarArr2[0].f2620f == null || eVarArr2[1].f2620f == null) {
            if (eVarArr2[0].f2620f != null) {
                i target3 = h(eVarArr2[0]);
                if (target3 != null) {
                    b(this.f2770h, target3, this.f2764b.N[0].e());
                    c(this.f2771i, this.f2770h, 1, this.f2767e);
                }
            } else if (eVarArr2[1].f2620f != null) {
                i target4 = h(eVarArr2[1]);
                if (target4 != null) {
                    b(this.f2771i, target4, -this.f2764b.N[1].e());
                    c(this.f2770h, this.f2771i, -1, this.f2767e);
                }
            } else if (!(parent4 instanceof j) && parent4.F() != null) {
                i left2 = this.f2764b.F().f2636d.f2770h;
                b(this.f2770h, left2, this.f2764b.P());
                c(this.f2771i, this.f2770h, 1, this.f2767e);
            }
        } else if (parent4.W()) {
            this.f2770h.f2737f = this.f2764b.N[0].e();
            this.f2771i.f2737f = -this.f2764b.N[1].e();
        } else {
            i startTarget2 = h(this.f2764b.N[0]);
            i endTarget2 = h(this.f2764b.N[1]);
            startTarget2.b(this);
            endTarget2.b(this);
            this.f2772j = t.CENTER;
        }
    }

    public final void q(int[] dimensions, int x1, int x2, int y1, int y2, float ratio, int side) {
        int dx = x2 - x1;
        int dy = y2 - y1;
        switch (side) {
            case -1:
                int candidateX1 = (int) ((dy * ratio) + 0.5f);
                int candidateY2 = (int) ((dx / ratio) + 0.5f);
                if (candidateX1 <= dx && dy <= dy) {
                    dimensions[0] = candidateX1;
                    dimensions[1] = dy;
                    return;
                } else if (dx <= dx && candidateY2 <= dy) {
                    dimensions[0] = dx;
                    dimensions[1] = candidateY2;
                    return;
                } else {
                    return;
                }
            case 0:
                int horizontalSide = (int) ((dy * ratio) + 0.5f);
                dimensions[0] = horizontalSide;
                dimensions[1] = dy;
                return;
            case 1:
                int verticalSide = (int) ((dx * ratio) + 0.5f);
                dimensions[0] = dx;
                dimensions[1] = verticalSide;
                return;
            default:
                return;
        }
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
                n(gVar.F, gVar.H, 0);
                return;
        }
        if (!this.f2767e.f2741j && this.f2766d == f.MATCH_CONSTRAINT) {
            g gVar2 = this.f2764b;
            switch (gVar2.f2656n) {
                case 2:
                    g parent = gVar2.F();
                    if (parent != null) {
                        j jVar = parent.f2636d.f2767e;
                        if (jVar.f2741j) {
                            float percent = this.f2764b.f2662s;
                            int targetDimensionValue = jVar.f2738g;
                            int size = (int) ((targetDimensionValue * percent) + 0.5f);
                            this.f2767e.d(size);
                            break;
                        }
                    }
                    break;
                case 3:
                    int i2 = gVar2.f2658o;
                    if (i2 != 0 && i2 != 3) {
                        int size2 = 0;
                        int ratioSide = gVar2.r();
                        switch (ratioSide) {
                            case -1:
                                g gVar3 = this.f2764b;
                                size2 = (int) ((gVar3.f2638e.f2767e.f2738g * gVar3.q()) + 0.5f);
                                break;
                            case 0:
                                g gVar4 = this.f2764b;
                                size2 = (int) ((gVar4.f2638e.f2767e.f2738g / gVar4.q()) + 0.5f);
                                break;
                            case 1:
                                g gVar5 = this.f2764b;
                                size2 = (int) ((gVar5.f2638e.f2767e.f2738g * gVar5.q()) + 0.5f);
                                break;
                        }
                        this.f2767e.d(size2);
                        break;
                    } else {
                        q qVar = gVar2.f2638e;
                        i secondStart = qVar.f2770h;
                        i secondEnd = qVar.f2771i;
                        boolean s12 = gVar2.F.f2620f != null;
                        boolean s2 = gVar2.G.f2620f != null;
                        boolean e12 = gVar2.H.f2620f != null;
                        boolean e2 = gVar2.I.f2620f != null;
                        int definedSide = gVar2.r();
                        if (!s12 || !s2 || !e12 || !e2) {
                            if (s12 && e12) {
                                if (this.f2770h.f2734c && this.f2771i.f2734c) {
                                    float ratio = this.f2764b.q();
                                    int x1 = ((i) this.f2770h.f2743l.get(0)).f2738g + this.f2770h.f2737f;
                                    int x2 = ((i) this.f2771i.f2743l.get(0)).f2738g - this.f2771i.f2737f;
                                    switch (definedSide) {
                                        case -1:
                                        case 0:
                                            int ldx = g(x2 - x1, 0);
                                            int dy = (int) ((ldx * ratio) + 0.5f);
                                            int ldy = g(dy, 1);
                                            if (dy != ldy) {
                                                ldx = (int) ((ldy / ratio) + 0.5f);
                                            }
                                            this.f2767e.d(ldx);
                                            this.f2764b.f2638e.f2767e.d(ldy);
                                            break;
                                        case 1:
                                            int ldx2 = g(x2 - x1, 0);
                                            int dy2 = (int) ((ldx2 / ratio) + 0.5f);
                                            int ldy2 = g(dy2, 1);
                                            if (dy2 != ldy2) {
                                                ldx2 = (int) ((ldy2 * ratio) + 0.5f);
                                            }
                                            this.f2767e.d(ldx2);
                                            this.f2764b.f2638e.f2767e.d(ldy2);
                                            break;
                                    }
                                } else {
                                    return;
                                }
                            } else if (s2 && e2) {
                                if (secondStart.f2734c && secondEnd.f2734c) {
                                    float ratio2 = this.f2764b.q();
                                    int y1 = ((i) secondStart.f2743l.get(0)).f2738g + secondStart.f2737f;
                                    int y2 = ((i) secondEnd.f2743l.get(0)).f2738g - secondEnd.f2737f;
                                    switch (definedSide) {
                                        case -1:
                                        case 1:
                                            int dy3 = y2 - y1;
                                            int ldy3 = g(dy3, 1);
                                            int dx = (int) ((ldy3 / ratio2) + 0.5f);
                                            int ldx3 = g(dx, 0);
                                            if (dx != ldx3) {
                                                ldy3 = (int) ((ldx3 * ratio2) + 0.5f);
                                            }
                                            this.f2767e.d(ldx3);
                                            this.f2764b.f2638e.f2767e.d(ldy3);
                                            break;
                                        case 0:
                                            int dy4 = y2 - y1;
                                            int ldy4 = g(dy4, 1);
                                            int dx2 = (int) ((ldy4 * ratio2) + 0.5f);
                                            int ldx4 = g(dx2, 0);
                                            if (dx2 != ldx4) {
                                                ldy4 = (int) ((ldx4 / ratio2) + 0.5f);
                                            }
                                            this.f2767e.d(ldx4);
                                            this.f2764b.f2638e.f2767e.d(ldy4);
                                            break;
                                    }
                                } else {
                                    return;
                                }
                            }
                        } else {
                            float ratio3 = this.f2764b.q();
                            if (!secondStart.f2741j || !secondEnd.f2741j) {
                                i iVar = this.f2770h;
                                if (iVar.f2741j) {
                                    i iVar2 = this.f2771i;
                                    if (iVar2.f2741j) {
                                        if (secondStart.f2734c && secondEnd.f2734c) {
                                            int[] iArr = f2746k;
                                            q(iArr, iVar.f2738g + iVar.f2737f, iVar2.f2738g - iVar2.f2737f, ((i) secondStart.f2743l.get(0)).f2738g + secondStart.f2737f, ((i) secondEnd.f2743l.get(0)).f2738g - secondEnd.f2737f, ratio3, definedSide);
                                            this.f2767e.d(iArr[0]);
                                            this.f2764b.f2638e.f2767e.d(iArr[1]);
                                        } else {
                                            return;
                                        }
                                    }
                                }
                                i iVar3 = this.f2770h;
                                if (iVar3.f2734c && this.f2771i.f2734c && secondStart.f2734c && secondEnd.f2734c) {
                                    int[] iArr2 = f2746k;
                                    q(iArr2, ((i) iVar3.f2743l.get(0)).f2738g + this.f2770h.f2737f, ((i) this.f2771i.f2743l.get(0)).f2738g - this.f2771i.f2737f, ((i) secondStart.f2743l.get(0)).f2738g + secondStart.f2737f, ((i) secondEnd.f2743l.get(0)).f2738g - secondEnd.f2737f, ratio3, definedSide);
                                    this.f2767e.d(iArr2[0]);
                                    this.f2764b.f2638e.f2767e.d(iArr2[1]);
                                    break;
                                } else {
                                    return;
                                }
                            } else {
                                i iVar4 = this.f2770h;
                                if (iVar4.f2734c && this.f2771i.f2734c) {
                                    int[] iArr3 = f2746k;
                                    q(iArr3, ((i) iVar4.f2743l.get(0)).f2738g + this.f2770h.f2737f, ((i) this.f2771i.f2743l.get(0)).f2738g - this.f2771i.f2737f, secondStart.f2738g + secondStart.f2737f, secondEnd.f2738g - secondEnd.f2737f, ratio3, definedSide);
                                    this.f2767e.d(iArr3[0]);
                                    this.f2764b.f2638e.f2767e.d(iArr3[1]);
                                    return;
                                }
                                return;
                            }
                        }
                    }
                    break;
            }
        }
        i iVar5 = this.f2770h;
        if (iVar5.f2734c) {
            i iVar6 = this.f2771i;
            if (iVar6.f2734c) {
                if (!iVar5.f2741j || !iVar6.f2741j || !this.f2767e.f2741j) {
                    if (!this.f2767e.f2741j && this.f2766d == f.MATCH_CONSTRAINT) {
                        g gVar6 = this.f2764b;
                        if (gVar6.f2656n == 0 && !gVar6.W()) {
                            i startTarget = (i) this.f2770h.f2743l.get(0);
                            int i3 = startTarget.f2738g;
                            i iVar7 = this.f2770h;
                            int startPos = i3 + iVar7.f2737f;
                            int endPos = ((i) this.f2771i.f2743l.get(0)).f2738g + this.f2771i.f2737f;
                            int distance = endPos - startPos;
                            iVar7.d(startPos);
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
                        int value = Math.min(availableSpace, this.f2767e.f2744m);
                        g gVar7 = this.f2764b;
                        int max = gVar7.f2661r;
                        int min = gVar7.f2660q;
                        int value2 = Math.max(min, value);
                        if (max > 0) {
                            value2 = Math.min(max, value2);
                        }
                        this.f2767e.d(value2);
                    }
                    i startTarget4 = this.f2767e;
                    if (startTarget4.f2741j) {
                        i startTarget5 = (i) this.f2770h.f2743l.get(0);
                        i endTarget = (i) this.f2771i.f2743l.get(0);
                        int startPos3 = startTarget5.f2738g + this.f2770h.f2737f;
                        int endPos3 = endTarget.f2738g + this.f2771i.f2737f;
                        float bias = this.f2764b.t();
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
    public void e() {
        i iVar = this.f2770h;
        if (iVar.f2741j) {
            this.f2764b.Q0(iVar.f2738g);
        }
    }
}
