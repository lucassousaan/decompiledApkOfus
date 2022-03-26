package o;

import n.f;
import n.m;

/* JADX WARN: Classes with same name are omitted:
  
 */
/* loaded from: classes.dex */
public class i extends g {

    /* renamed from: p0  reason: collision with root package name */
    public float f2680p0 = -1.0f;

    /* renamed from: q0  reason: collision with root package name */
    public int f2681q0 = -1;

    /* renamed from: r0  reason: collision with root package name */
    public int f2682r0 = -1;

    /* renamed from: s0  reason: collision with root package name */
    public e f2683s0 = this.G;

    /* renamed from: t0  reason: collision with root package name */
    public int f2684t0 = 0;

    /* renamed from: u0  reason: collision with root package name */
    public boolean f2685u0;

    public i() {
        this.O.clear();
        this.O.add(this.f2683s0);
        int count = this.N.length;
        for (int i2 = 0; i2 < count; i2++) {
            this.N[i2] = this.f2683s0;
        }
    }

    @Override // o.g
    public boolean e() {
        return true;
    }

    public void e1(int orientation) {
        if (this.f2684t0 != orientation) {
            this.f2684t0 = orientation;
            this.O.clear();
            if (this.f2684t0 == 1) {
                this.f2683s0 = this.F;
            } else {
                this.f2683s0 = this.G;
            }
            this.O.add(this.f2683s0);
            int count = this.N.length;
            for (int i2 = 0; i2 < count; i2++) {
                this.N[i2] = this.f2683s0;
            }
        }
    }

    public e V0() {
        return this.f2683s0;
    }

    public int W0() {
        return this.f2684t0;
    }

    @Override // o.g
    public e j(d anchorType) {
        switch (anchorType.ordinal()) {
            case 0:
            case 5:
            case 6:
            case 7:
            case 8:
                return null;
            case 1:
            case 3:
                if (this.f2684t0 == 1) {
                    return this.f2683s0;
                }
                break;
            case 2:
            case 4:
                if (this.f2684t0 == 0) {
                    return this.f2683s0;
                }
                break;
        }
        throw new AssertionError(anchorType.name());
    }

    public void d1(float value) {
        if (value > -1.0f) {
            this.f2680p0 = value;
            this.f2681q0 = -1;
            this.f2682r0 = -1;
        }
    }

    public void b1(int value) {
        if (value > -1) {
            this.f2680p0 = -1.0f;
            this.f2681q0 = value;
            this.f2682r0 = -1;
        }
    }

    public void c1(int value) {
        if (value > -1) {
            this.f2680p0 = -1.0f;
            this.f2681q0 = -1;
            this.f2682r0 = value;
        }
    }

    public float Z0() {
        return this.f2680p0;
    }

    public int X0() {
        return this.f2681q0;
    }

    public int Y0() {
        return this.f2682r0;
    }

    public void a1(int position) {
        this.f2683s0.s(position);
        this.f2685u0 = true;
    }

    @Override // o.g
    public boolean b0() {
        return this.f2685u0;
    }

    @Override // o.g
    public boolean c0() {
        return this.f2685u0;
    }

    @Override // o.g
    public void d(f system, boolean optimize) {
        h parent = (h) F();
        if (parent != null) {
            e begin = parent.j(d.LEFT);
            e end = parent.j(d.RIGHT);
            g gVar = this.R;
            boolean parentWrapContent = true;
            parentWrapContent = gVar != null && gVar.Q[0] == f.WRAP_CONTENT;
            if (this.f2684t0 == 0) {
                begin = parent.j(d.TOP);
                end = parent.j(d.BOTTOM);
                g gVar2 = this.R;
                if (gVar2 == null || gVar2.Q[1] != f.WRAP_CONTENT) {
                    parentWrapContent = false;
                }
            }
            if (this.f2685u0 && this.f2683s0.m()) {
                m guide = system.q(this.f2683s0);
                system.f(guide, this.f2683s0.d());
                if (this.f2681q0 != -1) {
                    if (parentWrapContent) {
                        system.h(system.q(end), guide, 0, 5);
                    }
                } else if (this.f2682r0 != -1 && parentWrapContent) {
                    m parentRight = system.q(end);
                    system.h(guide, system.q(begin), 0, 5);
                    system.h(parentRight, guide, 0, 5);
                }
                this.f2685u0 = false;
            } else if (this.f2681q0 != -1) {
                m guide2 = system.q(this.f2683s0);
                m parentLeft = system.q(begin);
                system.e(guide2, parentLeft, this.f2681q0, 8);
                if (parentWrapContent) {
                    system.h(system.q(end), guide2, 0, 5);
                }
            } else if (this.f2682r0 != -1) {
                m guide3 = system.q(this.f2683s0);
                m parentRight2 = system.q(end);
                system.e(guide3, parentRight2, -this.f2682r0, 8);
                if (parentWrapContent) {
                    system.h(guide3, system.q(begin), 0, 5);
                    system.h(parentRight2, guide3, 0, 5);
                }
            } else if (this.f2680p0 != -1.0f) {
                system.d(f.s(system, system.q(this.f2683s0), system.q(end), this.f2680p0));
            }
        }
    }

    @Override // o.g
    public void U0(f system, boolean optimize) {
        if (F() != null) {
            int value = system.x(this.f2683s0);
            if (this.f2684t0 == 1) {
                Q0(value);
                R0(0);
                s0(F().s());
                P0(0);
                return;
            }
            Q0(0);
            R0(value);
            P0(F().O());
            s0(0);
        }
    }
}
