package n;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Objects;
import o.d;
import o.e;
import o.g;

/* JADX WARN: Classes with same name are omitted:
  
 */
/* loaded from: classes.dex */
public class f {

    /* renamed from: r  reason: collision with root package name */
    public static boolean f2497r = false;

    /* renamed from: s  reason: collision with root package name */
    public static boolean f2498s = true;

    /* renamed from: t  reason: collision with root package name */
    public static boolean f2499t = true;

    /* renamed from: u  reason: collision with root package name */
    public static boolean f2500u = true;

    /* renamed from: v  reason: collision with root package name */
    public static boolean f2501v = false;

    /* renamed from: w  reason: collision with root package name */
    public static int f2502w = 1000;

    /* renamed from: x  reason: collision with root package name */
    public static long f2503x = 0;

    /* renamed from: y  reason: collision with root package name */
    public static long f2504y = 0;

    /* renamed from: d  reason: collision with root package name */
    public e f2508d;

    /* renamed from: g  reason: collision with root package name */
    public c[] f2511g;

    /* renamed from: n  reason: collision with root package name */
    public final d f2518n;

    /* renamed from: q  reason: collision with root package name */
    public e f2521q;

    /* renamed from: a  reason: collision with root package name */
    public boolean f2505a = false;

    /* renamed from: b  reason: collision with root package name */
    public int f2506b = 0;

    /* renamed from: c  reason: collision with root package name */
    public HashMap f2507c = null;

    /* renamed from: e  reason: collision with root package name */
    public int f2509e = 32;

    /* renamed from: f  reason: collision with root package name */
    public int f2510f = 32;

    /* renamed from: h  reason: collision with root package name */
    public boolean f2512h = false;

    /* renamed from: i  reason: collision with root package name */
    public boolean f2513i = false;

    /* renamed from: j  reason: collision with root package name */
    public boolean[] f2514j = new boolean[32];

    /* renamed from: k  reason: collision with root package name */
    public int f2515k = 1;

    /* renamed from: l  reason: collision with root package name */
    public int f2516l = 0;

    /* renamed from: m  reason: collision with root package name */
    public int f2517m = 32;

    /* renamed from: o  reason: collision with root package name */
    public m[] f2519o = new m[f2502w];

    /* renamed from: p  reason: collision with root package name */
    public int f2520p = 0;

    public f() {
        this.f2511g = null;
        this.f2511g = new c[32];
        C();
        d dVar = new d();
        this.f2518n = dVar;
        this.f2508d = new k(dVar);
        this.f2521q = new c(dVar);
    }

    public static void w() {
    }

    public final void y() {
        int i2 = this.f2509e * 2;
        this.f2509e = i2;
        this.f2511g = (c[]) Arrays.copyOf(this.f2511g, i2);
        d dVar = this.f2518n;
        dVar.f2496d = (m[]) Arrays.copyOf(dVar.f2496d, this.f2509e);
        int i3 = this.f2509e;
        this.f2514j = new boolean[i3];
        this.f2510f = i3;
        this.f2517m = i3;
    }

    public final void C() {
        for (int i2 = 0; i2 < this.f2516l; i2++) {
            c row = this.f2511g[i2];
            if (row != null) {
                ((h) this.f2518n.f2494b).b(row);
            }
            this.f2511g[i2] = null;
        }
    }

    public void D() {
        d dVar;
        int i2 = 0;
        while (true) {
            dVar = this.f2518n;
            m[] mVarArr = dVar.f2496d;
            if (i2 >= mVarArr.length) {
                break;
            }
            m variable = mVarArr[i2];
            if (variable != null) {
                variable.d();
            }
            i2++;
        }
        ((h) dVar.f2495c).c(this.f2519o, this.f2520p);
        this.f2520p = 0;
        Arrays.fill(this.f2518n.f2496d, (Object) null);
        this.f2506b = 0;
        this.f2508d.clear();
        this.f2515k = 1;
        for (int i3 = 0; i3 < this.f2516l; i3++) {
            c[] cVarArr = this.f2511g;
            if (cVarArr[i3] != null) {
                Objects.requireNonNull(cVarArr[i3]);
            }
        }
        C();
        this.f2516l = 0;
        this.f2521q = new c(this.f2518n);
    }

    public m q(Object anchor) {
        if (anchor == null) {
            return null;
        }
        if (this.f2515k + 1 >= this.f2510f) {
            y();
        }
        m variable = null;
        if (anchor instanceof e) {
            variable = ((e) anchor).h();
            if (variable == null) {
                ((e) anchor).r();
                variable = ((e) anchor).h();
            }
            int i2 = variable.f2540c;
            if (i2 == -1 || i2 > this.f2506b || this.f2518n.f2496d[i2] == null) {
                if (i2 != -1) {
                    variable.d();
                }
                int i3 = this.f2506b + 1;
                this.f2506b = i3;
                this.f2515k++;
                variable.f2540c = i3;
                variable.f2547j = l.UNRESTRICTED;
                this.f2518n.f2496d[i3] = variable;
            }
        }
        return variable;
    }

    public c r() {
        c row = (c) ((h) this.f2518n.f2494b).a();
        if (row == null) {
            row = new c(this.f2518n);
            f2503x++;
        } else {
            row.z();
        }
        m.b();
        return row;
    }

    public m t() {
        if (this.f2515k + 1 >= this.f2510f) {
            y();
        }
        m variable = a(l.SLACK, null);
        int i2 = this.f2506b + 1;
        this.f2506b = i2;
        this.f2515k++;
        variable.f2540c = i2;
        this.f2518n.f2496d[i2] = variable;
        return variable;
    }

    public m p() {
        if (this.f2515k + 1 >= this.f2510f) {
            y();
        }
        m variable = a(l.SLACK, null);
        int i2 = this.f2506b + 1;
        this.f2506b = i2;
        this.f2515k++;
        variable.f2540c = i2;
        this.f2518n.f2496d[i2] = variable;
        return variable;
    }

    public void m(c row, int sign, int strength) {
        m error = o(strength, null);
        row.d(error, sign);
    }

    public m o(int strength, String prefix) {
        if (this.f2515k + 1 >= this.f2510f) {
            y();
        }
        m variable = a(l.ERROR, prefix);
        int i2 = this.f2506b + 1;
        this.f2506b = i2;
        this.f2515k++;
        variable.f2540c = i2;
        variable.f2542e = strength;
        this.f2518n.f2496d[i2] = variable;
        this.f2508d.b(variable);
        return variable;
    }

    public final m a(l type, String prefix) {
        m variable = (m) ((h) this.f2518n.f2495c).a();
        if (variable == null) {
            variable = new m(type);
            variable.f(type);
        } else {
            variable.d();
            variable.f(type);
        }
        int i2 = this.f2520p;
        int i3 = f2502w;
        if (i2 >= i3) {
            int i4 = i3 * 2;
            f2502w = i4;
            this.f2519o = (m[]) Arrays.copyOf(this.f2519o, i4);
        }
        m[] mVarArr = this.f2519o;
        int i5 = this.f2520p;
        this.f2520p = i5 + 1;
        mVarArr[i5] = variable;
        return variable;
    }

    public int x(Object object) {
        e anchor = (e) object;
        m variable = anchor.h();
        if (variable != null) {
            return (int) (variable.f2543f + 0.5f);
        }
        return 0;
    }

    public void z() {
        if (this.f2508d.isEmpty()) {
            n();
        } else if (this.f2512h || this.f2513i) {
            boolean fullySolved = true;
            int i2 = 0;
            while (true) {
                if (i2 >= this.f2516l) {
                    break;
                }
                c r2 = this.f2511g[i2];
                if (!r2.f2492e) {
                    fullySolved = false;
                    break;
                }
                i2++;
            }
            if (!fullySolved) {
                A(this.f2508d);
            } else {
                n();
            }
        } else {
            A(this.f2508d);
        }
    }

    public void A(e goal) {
        u();
        B(goal);
        n();
    }

    public void d(c row) {
        m pivotCandidate;
        if (row != null) {
            if (this.f2516l + 1 >= this.f2517m || this.f2515k + 1 >= this.f2510f) {
                y();
            }
            boolean added = false;
            if (!row.f2492e) {
                row.D(this);
                if (!row.isEmpty()) {
                    row.q();
                    if (row.e(this)) {
                        m extra = p();
                        row.f2488a = extra;
                        int numRows = this.f2516l;
                        l(row);
                        if (this.f2516l == numRows + 1) {
                            added = true;
                            ((c) this.f2521q).u(row);
                            B(this.f2521q);
                            if (extra.f2541d == -1) {
                                if (row.f2488a == extra && (pivotCandidate = row.w(extra)) != null) {
                                    row.y(pivotCandidate);
                                }
                                if (!row.f2492e) {
                                    row.f2488a.g(this, row);
                                }
                                ((h) this.f2518n.f2494b).b(row);
                                this.f2516l--;
                            }
                        }
                    }
                    if (!row.s()) {
                        return;
                    }
                } else {
                    return;
                }
            }
            if (!added) {
                l(row);
            }
        }
    }

    public final void l(c row) {
        int i2;
        if (row.f2492e) {
            row.f2488a.e(this, row.f2489b);
        } else {
            c[] cVarArr = this.f2511g;
            int i3 = this.f2516l;
            cVarArr[i3] = row;
            m mVar = row.f2488a;
            mVar.f2541d = i3;
            this.f2516l = i3 + 1;
            mVar.g(this, row);
        }
        if (this.f2505a) {
            int i4 = 0;
            while (i4 < this.f2516l) {
                if (this.f2511g[i4] == null) {
                    System.out.println("WTF");
                }
                c[] cVarArr2 = this.f2511g;
                if (cVarArr2[i4] != null && cVarArr2[i4].f2492e) {
                    c removedRow = cVarArr2[i4];
                    removedRow.f2488a.e(this, removedRow.f2489b);
                    ((h) this.f2518n.f2494b).b(removedRow);
                    this.f2511g[i4] = null;
                    int lastRow = i4 + 1;
                    int j2 = i4 + 1;
                    while (true) {
                        i2 = this.f2516l;
                        if (j2 >= i2) {
                            break;
                        }
                        c[] cVarArr3 = this.f2511g;
                        cVarArr3[j2 - 1] = cVarArr3[j2];
                        if (cVarArr3[j2 - 1].f2488a.f2541d == j2) {
                            cVarArr3[j2 - 1].f2488a.f2541d = j2 - 1;
                        }
                        lastRow = j2;
                        j2++;
                    }
                    if (lastRow < i2) {
                        this.f2511g[lastRow] = null;
                    }
                    this.f2516l = i2 - 1;
                    i4--;
                }
                i4++;
            }
            this.f2505a = false;
        }
    }

    public final int B(e goal) {
        boolean done = false;
        int tries = 0;
        for (int i2 = 0; i2 < this.f2515k; i2++) {
            this.f2514j[i2] = false;
        }
        while (!done) {
            tries++;
            if (tries >= this.f2515k * 2) {
                return tries;
            }
            if (((c) goal).r() != null) {
                this.f2514j[((c) goal).r().f2540c] = true;
            }
            m pivotCandidate = goal.a(this, this.f2514j);
            if (pivotCandidate != null) {
                boolean[] zArr = this.f2514j;
                int i3 = pivotCandidate.f2540c;
                if (zArr[i3]) {
                    return tries;
                }
                zArr[i3] = true;
            }
            if (pivotCandidate != null) {
                float min = Float.MAX_VALUE;
                int pivotRowIndex = -1;
                for (int i4 = 0; i4 < this.f2516l; i4++) {
                    c current = this.f2511g[i4];
                    m variable = current.f2488a;
                    if (variable.f2547j != l.UNRESTRICTED && !current.f2492e && current.t(pivotCandidate)) {
                        float a_j = current.f2491d.c(pivotCandidate);
                        if (a_j < 0.0f) {
                            float value = (-current.f2489b) / a_j;
                            if (value < min) {
                                min = value;
                                pivotRowIndex = i4;
                            }
                        }
                    }
                }
                if (pivotRowIndex > -1) {
                    c pivotEquation = this.f2511g[pivotRowIndex];
                    pivotEquation.f2488a.f2541d = -1;
                    pivotEquation.y(pivotCandidate);
                    m mVar = pivotEquation.f2488a;
                    mVar.f2541d = pivotRowIndex;
                    mVar.g(this, pivotEquation);
                }
            } else {
                done = true;
            }
        }
        return tries;
    }

    public final int u() {
        float f2;
        boolean infeasibleSystem;
        e goal;
        e goal2 = null;
        int tries = 0;
        boolean infeasibleSystem2 = false;
        int i2 = 0;
        while (true) {
            f2 = 0.0f;
            if (i2 >= this.f2516l) {
                break;
            }
            c[] cVarArr = this.f2511g;
            m variable = cVarArr[i2].f2488a;
            if (variable.f2547j != l.UNRESTRICTED && cVarArr[i2].f2489b < 0.0f) {
                infeasibleSystem2 = true;
                break;
            }
            i2++;
        }
        if (infeasibleSystem2) {
            boolean done = false;
            tries = 0;
            while (!done) {
                tries++;
                float min = Float.MAX_VALUE;
                int strength = 0;
                int pivotRowIndex = -1;
                int pivotColumnIndex = -1;
                int i3 = 0;
                while (i3 < this.f2516l) {
                    c current = this.f2511g[i3];
                    m variable2 = current.f2488a;
                    if (variable2.f2547j != l.UNRESTRICTED && !current.f2492e && current.f2489b < f2) {
                        int size = current.f2491d.k();
                        int j2 = 0;
                        while (j2 < size) {
                            m candidate = current.f2491d.b(j2);
                            float a_j = current.f2491d.c(candidate);
                            if (a_j <= 0.0f) {
                                goal = goal2;
                                infeasibleSystem = infeasibleSystem2;
                            } else {
                                goal = goal2;
                                int k2 = 0;
                                while (true) {
                                    infeasibleSystem = infeasibleSystem2;
                                    if (k2 < 9) {
                                        float value = candidate.f2545h[k2] / a_j;
                                        if ((value < min && k2 == strength) || k2 > strength) {
                                            min = value;
                                            pivotRowIndex = i3;
                                            pivotColumnIndex = candidate.f2540c;
                                            strength = k2;
                                        }
                                        k2++;
                                        infeasibleSystem2 = infeasibleSystem;
                                    }
                                }
                            }
                            j2++;
                            f2 = 0.0f;
                            goal2 = goal;
                            infeasibleSystem2 = infeasibleSystem;
                        }
                    }
                    i3++;
                    goal2 = goal2;
                    infeasibleSystem2 = infeasibleSystem2;
                }
                if (pivotRowIndex != -1) {
                    c pivotEquation = this.f2511g[pivotRowIndex];
                    pivotEquation.f2488a.f2541d = -1;
                    pivotEquation.y(this.f2518n.f2496d[pivotColumnIndex]);
                    m mVar = pivotEquation.f2488a;
                    mVar.f2541d = pivotRowIndex;
                    mVar.g(this, pivotEquation);
                } else {
                    done = true;
                }
                if (tries > this.f2515k / 2) {
                    done = true;
                }
                f2 = f2;
                goal2 = goal2;
                infeasibleSystem2 = infeasibleSystem2;
            }
        }
        return tries;
    }

    public final void n() {
        for (int i2 = 0; i2 < this.f2516l; i2++) {
            c row = this.f2511g[i2];
            row.f2488a.f2543f = row.f2489b;
        }
    }

    public d v() {
        return this.f2518n;
    }

    public void h(m a2, m b2, int margin, int strength) {
        c row = r();
        m slack = t();
        slack.f2542e = 0;
        row.n(a2, b2, slack, margin);
        if (strength != 8) {
            float slackValue = row.f2491d.c(slack);
            m(row, (int) ((-1.0f) * slackValue), strength);
        }
        d(row);
    }

    public void g(m a2, m b2, int margin) {
        c row = r();
        m slack = t();
        slack.f2542e = 0;
        row.n(a2, b2, slack, margin);
        d(row);
    }

    public void j(m a2, m b2, int margin, int strength) {
        c row = r();
        m slack = t();
        slack.f2542e = 0;
        row.o(a2, b2, slack, margin);
        if (strength != 8) {
            float slackValue = row.f2491d.c(slack);
            m(row, (int) ((-1.0f) * slackValue), strength);
        }
        d(row);
    }

    public void i(m a2, m b2, int margin) {
        c row = r();
        m slack = t();
        slack.f2542e = 0;
        row.o(a2, b2, slack, margin);
        d(row);
    }

    public void c(m a2, m b2, int m12, float bias, m c2, m d2, int m2, int strength) {
        c row = r();
        row.g(a2, b2, m12, bias, c2, d2, m2);
        if (strength != 8) {
            row.c(this, strength);
        }
        d(row);
    }

    public void k(m a2, m b2, m c2, m d2, float ratio, int strength) {
        c row = r();
        row.j(a2, b2, c2, d2, ratio);
        if (strength != 8) {
            row.c(this, strength);
        }
        d(row);
    }

    public c e(m a2, m b2, int margin, int strength) {
        if (strength == 8 && b2.f2544g && a2.f2541d == -1) {
            a2.e(this, b2.f2543f + margin);
            return null;
        }
        c row = r();
        row.m(a2, b2, margin);
        if (strength != 8) {
            row.c(this, strength);
        }
        d(row);
        return row;
    }

    public void f(m a2, int value) {
        int i2 = a2.f2541d;
        if (i2 == -1) {
            a2.e(this, value);
            for (int i3 = 0; i3 < this.f2506b + 1; i3++) {
                m variable = this.f2518n.f2496d[i3];
                if (variable != null) {
                    Objects.requireNonNull(variable);
                }
            }
            return;
        }
        int idx = a2.f2541d;
        if (i2 != -1) {
            c row = this.f2511g[idx];
            if (row.f2492e) {
                row.f2489b = value;
            } else if (row.f2491d.k() == 0) {
                row.f2492e = true;
                row.f2489b = value;
            } else {
                c newRow = r();
                newRow.l(a2, value);
                d(newRow);
            }
        } else {
            c row2 = r();
            row2.h(a2, value);
            d(row2);
        }
    }

    public static c s(f linearSystem, m variableA, m variableC, float percent) {
        c row = linearSystem.r();
        row.i(variableA, variableC, percent);
        return row;
    }

    public void b(g widget, g target, float angle, int radius) {
        d dVar = d.LEFT;
        m Al = q(widget.j(dVar));
        d dVar2 = d.TOP;
        m At = q(widget.j(dVar2));
        d dVar3 = d.RIGHT;
        m Ar = q(widget.j(dVar3));
        d dVar4 = d.BOTTOM;
        m Ab = q(widget.j(dVar4));
        m Bl = q(target.j(dVar));
        m Bt = q(target.j(dVar2));
        m Br = q(target.j(dVar3));
        m Bb = q(target.j(dVar4));
        c row = r();
        float angleComponent = (float) (Math.sin(angle) * radius);
        row.p(At, Ab, Bt, Bb, angleComponent);
        d(row);
        c row2 = r();
        float angleComponent2 = (float) (Math.cos(angle) * radius);
        row2.p(Al, Ar, Bl, Br, angleComponent2);
        d(row2);
    }
}
