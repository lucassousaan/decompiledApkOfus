package o;

import n.f;
import n.m;

/* JADX WARN: Classes with same name are omitted:
  
 */
/* loaded from: classes.dex */
public class a extends k {

    /* renamed from: r0  reason: collision with root package name */
    public int f2581r0 = 0;

    /* renamed from: s0  reason: collision with root package name */
    public boolean f2582s0 = true;

    /* renamed from: t0  reason: collision with root package name */
    public int f2583t0 = 0;

    /* renamed from: u0  reason: collision with root package name */
    public boolean f2584u0 = false;

    @Override // o.g
    public boolean e() {
        return true;
    }

    public int c1() {
        return this.f2581r0;
    }

    public void h1(int barrierType) {
        this.f2581r0 = barrierType;
    }

    public void g1(boolean allowsGoneWidget) {
        this.f2582s0 = allowsGoneWidget;
    }

    public boolean b1() {
        return this.f2582s0;
    }

    @Override // o.g
    public boolean b0() {
        return this.f2584u0;
    }

    @Override // o.g
    public boolean c0() {
        return this.f2584u0;
    }

    @Override // o.g
    public String toString() {
        String debug = "[Barrier] " + o() + " {";
        for (int i2 = 0; i2 < this.f2687q0; i2++) {
            g widget = this.f2686p0[i2];
            if (i2 > 0) {
                debug = debug + ", ";
            }
            debug = debug + widget.o();
        }
        return debug + "}";
    }

    public void f1() {
        for (int i2 = 0; i2 < this.f2687q0; i2++) {
            g widget = this.f2686p0[i2];
            int i3 = this.f2581r0;
            if (i3 == 0 || i3 == 1) {
                widget.z0(0, true);
            } else if (i3 == 2 || i3 == 3) {
                widget.z0(1, true);
            }
        }
    }

    @Override // o.g
    public void d(f system, boolean optimize) {
        Object[] objArr;
        int i2;
        e[] eVarArr = this.N;
        eVarArr[0] = this.F;
        eVarArr[2] = this.G;
        eVarArr[1] = this.H;
        eVarArr[3] = this.I;
        int i3 = 0;
        while (true) {
            objArr = this.N;
            if (i3 >= objArr.length) {
                break;
            }
            objArr[i3].f2623i = system.q(objArr[i3]);
            i3++;
        }
        int i4 = this.f2581r0;
        if (i4 >= 0 && i4 < 4) {
            e position = objArr[i4];
            if (!this.f2584u0) {
                a1();
            }
            if (this.f2584u0) {
                this.f2584u0 = false;
                int i5 = this.f2581r0;
                if (i5 == 0 || i5 == 1) {
                    system.f(this.F.f2623i, this.W);
                    system.f(this.H.f2623i, this.W);
                } else if (i5 == 2 || i5 == 3) {
                    system.f(this.G.f2623i, this.X);
                    system.f(this.I.f2623i, this.X);
                }
            } else {
                boolean hasMatchConstraintWidgets = false;
                int i6 = 0;
                while (true) {
                    if (i6 >= this.f2687q0) {
                        break;
                    }
                    g widget = this.f2686p0[i6];
                    if (this.f2582s0 || widget.e()) {
                        int i7 = this.f2581r0;
                        if ((i7 == 0 || i7 == 1) && widget.v() == f.MATCH_CONSTRAINT && widget.F.f2620f != null && widget.H.f2620f != null) {
                            hasMatchConstraintWidgets = true;
                            break;
                        }
                        int i8 = this.f2581r0;
                        if ((i8 == 2 || i8 == 3) && widget.L() == f.MATCH_CONSTRAINT && widget.G.f2620f != null && widget.I.f2620f != null) {
                            hasMatchConstraintWidgets = true;
                            break;
                        }
                    }
                    i6++;
                }
                boolean mHasHorizontalCenteredDependents = this.F.k() || this.H.k();
                boolean mHasVerticalCenteredDependents = this.G.k() || this.I.k();
                boolean applyEqualityOnReferences = !hasMatchConstraintWidgets && (((i2 = this.f2581r0) == 0 && mHasHorizontalCenteredDependents) || ((i2 == 2 && mHasVerticalCenteredDependents) || ((i2 == 1 && mHasHorizontalCenteredDependents) || (i2 == 3 && mHasVerticalCenteredDependents))));
                int equalityOnReferencesStrength = 5;
                if (!applyEqualityOnReferences) {
                    equalityOnReferencesStrength = 4;
                }
                for (int i9 = 0; i9 < this.f2687q0; i9++) {
                    g widget2 = this.f2686p0[i9];
                    if (this.f2582s0 || widget2.e()) {
                        m target = system.q(widget2.N[this.f2581r0]);
                        e[] eVarArr2 = widget2.N;
                        int i10 = this.f2581r0;
                        eVarArr2[i10].f2623i = target;
                        int margin = 0;
                        if (eVarArr2[i10].f2620f != null && eVarArr2[i10].f2620f.f2618d == this) {
                            margin = 0 + eVarArr2[i10].f2621g;
                        }
                        if (i10 == 0 || i10 == 2) {
                            system.i(position.f2623i, target, this.f2583t0 - margin);
                        } else {
                            system.g(position.f2623i, target, this.f2583t0 + margin);
                        }
                        system.e(position.f2623i, target, this.f2583t0 + margin, equalityOnReferencesStrength);
                    }
                }
                int i11 = this.f2581r0;
                if (i11 == 0) {
                    system.e(this.H.f2623i, this.F.f2623i, 0, 8);
                    system.e(this.F.f2623i, this.R.H.f2623i, 0, 4);
                    system.e(this.F.f2623i, this.R.F.f2623i, 0, 0);
                } else if (i11 == 1) {
                    system.e(this.F.f2623i, this.H.f2623i, 0, 8);
                    system.e(this.F.f2623i, this.R.F.f2623i, 0, 4);
                    system.e(this.F.f2623i, this.R.H.f2623i, 0, 0);
                } else if (i11 == 2) {
                    system.e(this.I.f2623i, this.G.f2623i, 0, 8);
                    system.e(this.G.f2623i, this.R.I.f2623i, 0, 4);
                    system.e(this.G.f2623i, this.R.G.f2623i, 0, 0);
                } else if (i11 == 3) {
                    system.e(this.G.f2623i, this.I.f2623i, 0, 8);
                    system.e(this.G.f2623i, this.R.G.f2623i, 0, 4);
                    system.e(this.G.f2623i, this.R.I.f2623i, 0, 0);
                }
            }
        }
    }

    public void i1(int margin) {
        this.f2583t0 = margin;
    }

    public int d1() {
        return this.f2583t0;
    }

    public int e1() {
        switch (this.f2581r0) {
            case 0:
            case 1:
                return 0;
            case 2:
            case 3:
                return 1;
            default:
                return -1;
        }
    }

    public boolean a1() {
        int i2;
        boolean hasAllWidgetsResolved = true;
        int i3 = 0;
        while (true) {
            i2 = this.f2687q0;
            if (i3 >= i2) {
                break;
            }
            g widget = this.f2686p0[i3];
            if (this.f2582s0 || widget.e()) {
                int i4 = this.f2581r0;
                if ((i4 == 0 || i4 == 1) && !widget.b0()) {
                    hasAllWidgetsResolved = false;
                } else {
                    int i5 = this.f2581r0;
                    if ((i5 == 2 || i5 == 3) && !widget.c0()) {
                        hasAllWidgetsResolved = false;
                    }
                }
            }
            i3++;
        }
        if (!hasAllWidgetsResolved || i2 <= 0) {
            return false;
        }
        int barrierPosition = 0;
        boolean initialized = false;
        for (int i6 = 0; i6 < this.f2687q0; i6++) {
            g widget2 = this.f2686p0[i6];
            if (this.f2582s0 || widget2.e()) {
                if (!initialized) {
                    int i7 = this.f2581r0;
                    if (i7 == 0) {
                        barrierPosition = widget2.j(d.LEFT).d();
                    } else if (i7 == 1) {
                        barrierPosition = widget2.j(d.RIGHT).d();
                    } else if (i7 == 2) {
                        barrierPosition = widget2.j(d.TOP).d();
                    } else if (i7 == 3) {
                        barrierPosition = widget2.j(d.BOTTOM).d();
                    }
                    initialized = true;
                }
                int i8 = this.f2581r0;
                if (i8 == 0) {
                    barrierPosition = Math.min(barrierPosition, widget2.j(d.LEFT).d());
                } else if (i8 == 1) {
                    barrierPosition = Math.max(barrierPosition, widget2.j(d.RIGHT).d());
                } else if (i8 == 2) {
                    barrierPosition = Math.min(barrierPosition, widget2.j(d.TOP).d());
                } else if (i8 == 3) {
                    barrierPosition = Math.max(barrierPosition, widget2.j(d.BOTTOM).d());
                }
            }
        }
        int barrierPosition2 = barrierPosition + this.f2583t0;
        int i9 = this.f2581r0;
        if (i9 == 0 || i9 == 1) {
            m0(barrierPosition2, barrierPosition2);
        } else {
            p0(barrierPosition2, barrierPosition2);
        }
        this.f2584u0 = true;
        return true;
    }
}
