package o;

import androidx.constraintlayout.solver.widgets.ConstraintAnchor;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import n.d;
import n.f;
import p.e;
import p.i;
import p.o;
import p.q;
import p.u;

/* JADX WARN: Classes with same name are omitted:
  
 */
/* loaded from: classes.dex */
public class g {

    /* renamed from: o0  reason: collision with root package name */
    public static float f2629o0 = 0.5f;
    public boolean B;
    public e M;
    public e[] N;
    public f[] Q;
    public int Z;

    /* renamed from: a0  reason: collision with root package name */
    public int f2631a0;

    /* renamed from: b  reason: collision with root package name */
    public e f2632b;

    /* renamed from: c  reason: collision with root package name */
    public e f2634c;

    /* renamed from: d0  reason: collision with root package name */
    public Object f2637d0;

    /* renamed from: a  reason: collision with root package name */
    public boolean f2630a = false;

    /* renamed from: d  reason: collision with root package name */
    public o f2636d = null;

    /* renamed from: e  reason: collision with root package name */
    public q f2638e = null;

    /* renamed from: f  reason: collision with root package name */
    public boolean[] f2640f = {true, true};

    /* renamed from: g  reason: collision with root package name */
    public boolean f2642g = true;

    /* renamed from: h  reason: collision with root package name */
    public boolean f2644h = false;

    /* renamed from: i  reason: collision with root package name */
    public boolean f2646i = true;

    /* renamed from: j  reason: collision with root package name */
    public boolean f2648j = false;

    /* renamed from: k  reason: collision with root package name */
    public boolean f2650k = false;

    /* renamed from: l  reason: collision with root package name */
    public int f2652l = -1;

    /* renamed from: m  reason: collision with root package name */
    public int f2654m = -1;

    /* renamed from: n  reason: collision with root package name */
    public int f2656n = 0;

    /* renamed from: o  reason: collision with root package name */
    public int f2658o = 0;

    /* renamed from: p  reason: collision with root package name */
    public int[] f2659p = new int[2];

    /* renamed from: q  reason: collision with root package name */
    public int f2660q = 0;

    /* renamed from: r  reason: collision with root package name */
    public int f2661r = 0;

    /* renamed from: s  reason: collision with root package name */
    public float f2662s = 1.0f;

    /* renamed from: t  reason: collision with root package name */
    public int f2663t = 0;

    /* renamed from: u  reason: collision with root package name */
    public int f2664u = 0;

    /* renamed from: v  reason: collision with root package name */
    public float f2665v = 1.0f;

    /* renamed from: w  reason: collision with root package name */
    public int f2666w = -1;

    /* renamed from: x  reason: collision with root package name */
    public float f2667x = 1.0f;

    /* renamed from: y  reason: collision with root package name */
    public int[] f2668y = {Integer.MAX_VALUE, Integer.MAX_VALUE};

    /* renamed from: z  reason: collision with root package name */
    public float f2669z = 0.0f;
    public boolean A = false;
    public boolean C = false;
    public int D = 0;
    public int E = 0;
    public e F = new e(this, d.LEFT);
    public e G = new e(this, d.TOP);
    public e H = new e(this, d.RIGHT);
    public e I = new e(this, d.BOTTOM);
    public e J = new e(this, d.BASELINE);
    public e K = new e(this, d.CENTER_X);
    public e L = new e(this, d.CENTER_Y);
    public ArrayList O = new ArrayList();
    public boolean[] P = new boolean[2];
    public g R = null;
    public int S = 0;
    public int T = 0;
    public float U = 0.0f;
    public int V = -1;
    public int W = 0;
    public int X = 0;
    public int Y = 0;

    /* renamed from: b0  reason: collision with root package name */
    public float f2633b0 = 0.5f;

    /* renamed from: c0  reason: collision with root package name */
    public float f2635c0 = 0.5f;

    /* renamed from: e0  reason: collision with root package name */
    public int f2639e0 = 0;

    /* renamed from: f0  reason: collision with root package name */
    public String f2641f0 = null;

    /* renamed from: g0  reason: collision with root package name */
    public String f2643g0 = null;

    /* renamed from: h0  reason: collision with root package name */
    public int f2645h0 = 0;

    /* renamed from: i0  reason: collision with root package name */
    public int f2647i0 = 0;

    /* renamed from: j0  reason: collision with root package name */
    public float[] f2649j0 = {-1.0f, -1.0f};

    /* renamed from: k0  reason: collision with root package name */
    public g[] f2651k0 = {null, null};

    /* renamed from: l0  reason: collision with root package name */
    public g[] f2653l0 = {null, null};

    /* renamed from: m0  reason: collision with root package name */
    public int f2655m0 = -1;

    /* renamed from: n0  reason: collision with root package name */
    public int f2657n0 = -1;

    public u I(int orientation) {
        if (orientation == 0) {
            return this.f2636d;
        }
        if (orientation == 1) {
            return this.f2638e;
        }
        return null;
    }

    public void n0(int x1) {
        this.F.s(x1);
        this.W = x1;
    }

    public void o0(int y1) {
        this.G.s(y1);
        this.X = y1;
    }

    public void m0(int x1, int x2) {
        this.F.s(x1);
        this.H.s(x2);
        this.W = x1;
        this.S = x2 - x1;
        this.f2648j = true;
    }

    public void p0(int y1, int y2) {
        this.G.s(y1);
        this.I.s(y2);
        this.X = y1;
        this.T = y2 - y1;
        if (this.A) {
            this.J.s(this.Y + y1);
        }
        this.f2650k = true;
    }

    public void l0(int baselineValue) {
        if (this.A) {
            int y1 = baselineValue - this.Y;
            int y2 = this.T + y1;
            this.X = y1;
            this.G.s(y1);
            this.I.s(y2);
            this.J.s(baselineValue);
            this.f2650k = true;
        }
    }

    public boolean b0() {
        return this.f2648j || (this.F.m() && this.H.m());
    }

    public boolean c0() {
        return this.f2650k || (this.G.m() && this.I.m());
    }

    public void f0() {
        this.f2648j = false;
        this.f2650k = false;
        int mAnchorsSize = this.O.size();
        for (int i2 = 0; i2 < mAnchorsSize; i2++) {
            e anchor = (e) this.O.get(i2);
            anchor.q();
        }
    }

    public boolean T() {
        int mAnchorsSize = this.O.size();
        for (int i2 = 0; i2 < mAnchorsSize; i2++) {
            e anchor = (e) this.O.get(i2);
            if (anchor.l()) {
                return true;
            }
        }
        return false;
    }

    public boolean S(int orientation) {
        if (orientation == 0) {
            int horizontalTargets = (this.F.f2620f != null ? 1 : 0) + (this.H.f2620f != null ? 1 : 0);
            return horizontalTargets < 2;
        }
        int verticalTargets = (this.G.f2620f != null ? 1 : 0) + (this.I.f2620f != null ? 1 : 0) + (this.J.f2620f != null ? 1 : 0);
        return verticalTargets < 2;
    }

    public boolean Z() {
        return this.C;
    }

    public int A() {
        return this.f2668y[1];
    }

    public int B() {
        return this.f2668y[0];
    }

    public void C0(int maxWidth) {
        this.f2668y[0] = maxWidth;
    }

    public void B0(int maxHeight) {
        this.f2668y[1] = maxHeight;
    }

    public void r0(boolean hasBaseline) {
        this.A = hasBaseline;
    }

    public boolean X() {
        return this.B;
    }

    public void z0(int orientation, boolean value) {
        this.P[orientation] = value;
    }

    public void D0(boolean measureRequested) {
        this.f2642g = measureRequested;
    }

    public boolean a0() {
        return this.f2642g && this.f2639e0 != 8;
    }

    public int x() {
        return this.D;
    }

    public int y() {
        return this.E;
    }

    public void A0(int horizontal, int vertical) {
        this.D = horizontal;
        this.E = vertical;
        D0(false);
    }

    public void e0() {
        this.F.p();
        this.G.p();
        this.H.p();
        this.I.p();
        this.J.p();
        this.K.p();
        this.L.p();
        this.M.p();
        this.R = null;
        this.f2669z = 0.0f;
        this.S = 0;
        this.T = 0;
        this.U = 0.0f;
        this.V = -1;
        this.W = 0;
        this.X = 0;
        this.Y = 0;
        this.Z = 0;
        this.f2631a0 = 0;
        this.f2633b0 = 0.5f;
        this.f2635c0 = 0.5f;
        f[] fVarArr = this.Q;
        f fVar = f.FIXED;
        fVarArr[0] = fVar;
        fVarArr[1] = fVar;
        this.f2637d0 = null;
        this.f2639e0 = 0;
        this.f2643g0 = null;
        this.f2645h0 = 0;
        this.f2647i0 = 0;
        float[] fArr = this.f2649j0;
        fArr[0] = -1.0f;
        fArr[1] = -1.0f;
        this.f2652l = -1;
        this.f2654m = -1;
        int[] iArr = this.f2668y;
        iArr[0] = Integer.MAX_VALUE;
        iArr[1] = Integer.MAX_VALUE;
        this.f2656n = 0;
        this.f2658o = 0;
        this.f2662s = 1.0f;
        this.f2665v = 1.0f;
        this.f2661r = Integer.MAX_VALUE;
        this.f2664u = Integer.MAX_VALUE;
        this.f2660q = 0;
        this.f2663t = 0;
        this.f2666w = -1;
        this.f2667x = 1.0f;
        boolean[] zArr = this.f2640f;
        zArr[0] = true;
        zArr[1] = true;
        this.C = false;
        boolean[] zArr2 = this.P;
        zArr2[0] = false;
        zArr2[1] = false;
        this.f2642g = true;
    }

    public boolean d0() {
        f[] fVarArr = this.Q;
        f fVar = fVarArr[0];
        f fVar2 = f.MATCH_CONSTRAINT;
        return fVar == fVar2 && fVarArr[1] == fVar2;
    }

    public g() {
        e eVar = new e(this, d.CENTER);
        this.M = eVar;
        this.N = new e[]{this.F, this.H, this.G, this.I, this.J, eVar};
        f fVar = f.FIXED;
        this.Q = new f[]{fVar, fVar};
        a();
    }

    public void i() {
        if (this.f2636d == null) {
            this.f2636d = new o(this);
        }
        if (this.f2638e == null) {
            this.f2638e = new q(this);
        }
    }

    public void g0(d cache) {
        this.F.r();
        this.G.r();
        this.H.r();
        this.I.r();
        this.J.r();
        this.M.r();
        this.K.r();
        this.L.r();
    }

    public final void a() {
        this.O.add(this.F);
        this.O.add(this.G);
        this.O.add(this.H);
        this.O.add(this.I);
        this.O.add(this.K);
        this.O.add(this.L);
        this.O.add(this.M);
        this.O.add(this.J);
    }

    public g F() {
        return this.R;
    }

    public void H0(g widget) {
        this.R = widget;
    }

    public void g(g target, float angle, int radius) {
        d dVar = d.CENTER;
        U(dVar, target, dVar, radius, 0);
        this.f2669z = angle;
    }

    public void O0(int visibility) {
        this.f2639e0 = visibility;
    }

    public int N() {
        return this.f2639e0;
    }

    public String o() {
        return this.f2641f0;
    }

    public void j0(String name) {
        this.f2641f0 = name;
    }

    public void h(f system) {
        system.q(this.F);
        system.q(this.G);
        system.q(this.H);
        system.q(this.I);
        if (this.Y > 0) {
            system.q(this.J);
        }
    }

    public String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        String str2 = "";
        if (this.f2643g0 != null) {
            str = "type: " + this.f2643g0 + " ";
        } else {
            str = str2;
        }
        sb.append(str);
        if (this.f2641f0 != null) {
            str2 = "id: " + this.f2641f0 + " ";
        }
        sb.append(str2);
        sb.append("(");
        sb.append(this.W);
        sb.append(", ");
        sb.append(this.X);
        sb.append(") - (");
        sb.append(this.S);
        sb.append(" x ");
        sb.append(this.T);
        sb.append(")");
        return sb.toString();
    }

    public int P() {
        g gVar = this.R;
        if (gVar == null || !(gVar instanceof h)) {
            return this.W;
        }
        return ((h) gVar).f2675v0 + this.W;
    }

    public int Q() {
        g gVar = this.R;
        if (gVar == null || !(gVar instanceof h)) {
            return this.X;
        }
        return ((h) gVar).f2676w0 + this.X;
    }

    public int O() {
        if (this.f2639e0 == 8) {
            return 0;
        }
        return this.S;
    }

    public int s() {
        if (this.f2639e0 == 8) {
            return 0;
        }
        return this.T;
    }

    public int z(int orientation) {
        if (orientation == 0) {
            return O();
        }
        if (orientation == 1) {
            return s();
        }
        return 0;
    }

    public int D() {
        return this.Z;
    }

    public int C() {
        return this.f2631a0;
    }

    public int H() {
        return P() + this.S;
    }

    public int m() {
        return Q() + this.T;
    }

    public int w() {
        int margin = 0;
        e eVar = this.F;
        if (eVar != null) {
            margin = 0 + eVar.f2621g;
        }
        e eVar2 = this.H;
        if (eVar2 != null) {
            return margin + eVar2.f2621g;
        }
        return margin;
    }

    public int M() {
        int margin = 0;
        if (this.F != null) {
            margin = 0 + this.G.f2621g;
        }
        if (this.H != null) {
            return margin + this.I.f2621g;
        }
        return margin;
    }

    public float t() {
        return this.f2633b0;
    }

    public float J() {
        return this.f2635c0;
    }

    public float l(int orientation) {
        if (orientation == 0) {
            return this.f2633b0;
        }
        if (orientation == 1) {
            return this.f2635c0;
        }
        return -1.0f;
    }

    public boolean R() {
        return this.A;
    }

    public int k() {
        return this.Y;
    }

    public Object n() {
        return this.f2637d0;
    }

    public void Q0(int x2) {
        this.W = x2;
    }

    public void R0(int y2) {
        this.X = y2;
    }

    public void G0(int x2, int y2) {
        this.W = x2;
        this.X = y2;
    }

    public void P0(int w2) {
        this.S = w2;
        int i2 = this.Z;
        if (w2 < i2) {
            this.S = i2;
        }
    }

    public void s0(int h2) {
        this.T = h2;
        int i2 = this.f2631a0;
        if (h2 < i2) {
            this.T = i2;
        }
    }

    public void x0(int horizontalMatchStyle, int min, int max, float percent) {
        this.f2656n = horizontalMatchStyle;
        this.f2660q = min;
        this.f2661r = max == Integer.MAX_VALUE ? 0 : max;
        this.f2662s = percent;
        if (percent > 0.0f && percent < 1.0f && horizontalMatchStyle == 0) {
            this.f2656n = 2;
        }
    }

    public void M0(int verticalMatchStyle, int min, int max, float percent) {
        this.f2658o = verticalMatchStyle;
        this.f2663t = min;
        this.f2664u = max == Integer.MAX_VALUE ? 0 : max;
        this.f2665v = percent;
        if (percent > 0.0f && percent < 1.0f && verticalMatchStyle == 0) {
            this.f2658o = 2;
        }
    }

    public void k0(String ratio) {
        int commaIndex;
        if (ratio == null || ratio.length() == 0) {
            this.U = 0.0f;
            return;
        }
        int dimensionRatioSide = -1;
        float dimensionRatio = 0.0f;
        int len = ratio.length();
        int commaIndex2 = ratio.indexOf(44);
        if (commaIndex2 <= 0 || commaIndex2 >= len - 1) {
            commaIndex = 0;
        } else {
            String dimension = ratio.substring(0, commaIndex2);
            if (dimension.equalsIgnoreCase("W")) {
                dimensionRatioSide = 0;
            } else if (dimension.equalsIgnoreCase("H")) {
                dimensionRatioSide = 1;
            }
            commaIndex = commaIndex2 + 1;
        }
        int colonIndex = ratio.indexOf(58);
        if (colonIndex < 0 || colonIndex >= len - 1) {
            String r2 = ratio.substring(commaIndex);
            if (r2.length() > 0) {
                try {
                    dimensionRatio = Float.parseFloat(r2);
                } catch (NumberFormatException e2) {
                }
            }
        } else {
            String nominator = ratio.substring(commaIndex, colonIndex);
            String denominator = ratio.substring(colonIndex + 1);
            if (nominator.length() > 0 && denominator.length() > 0) {
                try {
                    float nominatorValue = Float.parseFloat(nominator);
                    float denominatorValue = Float.parseFloat(denominator);
                    if (nominatorValue > 0.0f && denominatorValue > 0.0f) {
                        dimensionRatio = dimensionRatioSide == 1 ? Math.abs(denominatorValue / nominatorValue) : Math.abs(nominatorValue / denominatorValue);
                    }
                } catch (NumberFormatException e3) {
                }
            }
        }
        if (dimensionRatio > 0.0f) {
            this.U = dimensionRatio;
            this.V = dimensionRatioSide;
        }
    }

    public float q() {
        return this.U;
    }

    public int r() {
        return this.V;
    }

    public void t0(float horizontalBiasPercent) {
        this.f2633b0 = horizontalBiasPercent;
    }

    public void I0(float verticalBiasPercent) {
        this.f2635c0 = verticalBiasPercent;
    }

    public void F0(int w2) {
        if (w2 < 0) {
            this.Z = 0;
        } else {
            this.Z = w2;
        }
    }

    public void E0(int h2) {
        if (h2 < 0) {
            this.f2631a0 = 0;
        } else {
            this.f2631a0 = h2;
        }
    }

    public void q0(int left, int top, int right, int bottom) {
        int w2 = right - left;
        int h2 = bottom - top;
        this.W = left;
        this.X = top;
        if (this.f2639e0 == 8) {
            this.S = 0;
            this.T = 0;
            return;
        }
        f[] fVarArr = this.Q;
        f fVar = fVarArr[0];
        f fVar2 = f.FIXED;
        if (fVar == fVar2 && w2 < this.S) {
            w2 = this.S;
        }
        if (fVarArr[1] == fVar2 && h2 < this.T) {
            h2 = this.T;
        }
        this.S = w2;
        this.T = h2;
        int i2 = this.f2631a0;
        if (h2 < i2) {
            this.T = i2;
        }
        int i3 = this.Z;
        if (w2 < i3) {
            this.S = i3;
        }
    }

    public void v0(int left, int right) {
        this.W = left;
        int i2 = right - left;
        this.S = i2;
        int i3 = this.Z;
        if (i2 < i3) {
            this.S = i3;
        }
    }

    public void K0(int top, int bottom) {
        this.X = top;
        int i2 = bottom - top;
        this.T = i2;
        int i3 = this.f2631a0;
        if (i2 < i3) {
            this.T = i3;
        }
    }

    public void h0(int baseline) {
        this.Y = baseline;
        this.A = baseline > 0;
    }

    public void i0(Object companion) {
        this.f2637d0 = companion;
    }

    public void y0(float horizontalWeight) {
        this.f2649j0[0] = horizontalWeight;
    }

    public void N0(float verticalWeight) {
        this.f2649j0[1] = verticalWeight;
    }

    public void u0(int horizontalChainStyle) {
        this.f2645h0 = horizontalChainStyle;
    }

    public int u() {
        return this.f2645h0;
    }

    public void J0(int verticalChainStyle) {
        this.f2647i0 = verticalChainStyle;
    }

    public int K() {
        return this.f2647i0;
    }

    public boolean e() {
        return this.f2639e0 != 8;
    }

    public void U(d startType, g target, d endType, int margin, int goneMargin) {
        e startAnchor = j(startType);
        e endAnchor = target.j(endType);
        startAnchor.a(endAnchor, margin, goneMargin, true);
    }

    public e j(d anchorType) {
        switch (anchorType.ordinal()) {
            case 0:
                return null;
            case 1:
                return this.F;
            case 2:
                return this.G;
            case 3:
                return this.H;
            case 4:
                return this.I;
            case 5:
                return this.J;
            case 6:
                return this.M;
            case 7:
                return this.K;
            case 8:
                return this.L;
            default:
                throw new AssertionError(anchorType.name());
        }
    }

    public f v() {
        return this.Q[0];
    }

    public f L() {
        return this.Q[1];
    }

    public f p(int orientation) {
        if (orientation == 0) {
            return v();
        }
        if (orientation == 1) {
            return L();
        }
        return null;
    }

    public void w0(f behaviour) {
        this.Q[0] = behaviour;
    }

    public void L0(f behaviour) {
        this.Q[1] = behaviour;
    }

    public boolean W() {
        e eVar = this.F;
        e eVar2 = eVar.f2620f;
        if (eVar2 != null && eVar2.f2620f == eVar) {
            return true;
        }
        e eVar3 = this.H;
        e eVar4 = eVar3.f2620f;
        if (eVar4 == null || eVar4.f2620f != eVar3) {
            return false;
        }
        return true;
    }

    public g G(int orientation) {
        e eVar;
        e eVar2;
        if (orientation == 0) {
            e eVar3 = this.F;
            e eVar4 = eVar3.f2620f;
            if (eVar4 == null || eVar4.f2620f != eVar3) {
                return null;
            }
            return eVar4.f2618d;
        } else if (orientation == 1 && (eVar2 = (eVar = this.G).f2620f) != null && eVar2.f2620f == eVar) {
            return eVar2.f2618d;
        } else {
            return null;
        }
    }

    public g E(int orientation) {
        e eVar;
        e eVar2;
        if (orientation == 0) {
            e eVar3 = this.H;
            e eVar4 = eVar3.f2620f;
            if (eVar4 == null || eVar4.f2620f != eVar3) {
                return null;
            }
            return eVar4.f2618d;
        } else if (orientation == 1 && (eVar2 = (eVar = this.I).f2620f) != null && eVar2.f2620f == eVar) {
            return eVar2.f2618d;
        } else {
            return null;
        }
    }

    public boolean Y() {
        e eVar = this.G;
        e eVar2 = eVar.f2620f;
        if (eVar2 != null && eVar2.f2620f == eVar) {
            return true;
        }
        e eVar3 = this.I;
        e eVar4 = eVar3.f2620f;
        if (eVar4 == null || eVar4.f2620f != eVar3) {
            return false;
        }
        return true;
    }

    public final boolean V(int orientation) {
        int offset = orientation * 2;
        e[] eVarArr = this.N;
        return (eVarArr[offset].f2620f == null || eVarArr[offset].f2620f.f2620f == eVarArr[offset] || eVarArr[offset + 1].f2620f == null || eVarArr[offset + 1].f2620f.f2620f != eVarArr[offset + 1]) ? false : true;
    }

    /* JADX WARN: Removed duplicated region for block: B:190:0x02e1  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x02e5  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x02f0  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x02f4  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x03ab  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x03b2  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x03bb  */
    /* JADX WARN: Removed duplicated region for block: B:228:0x03c2  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x03e8  */
    /* JADX WARN: Removed duplicated region for block: B:232:0x03eb  */
    /* JADX WARN: Removed duplicated region for block: B:237:0x0457  */
    /* JADX WARN: Removed duplicated region for block: B:255:0x04b2  */
    /* JADX WARN: Removed duplicated region for block: B:259:0x04c5  */
    /* JADX WARN: Removed duplicated region for block: B:260:0x04c8  */
    /* JADX WARN: Removed duplicated region for block: B:262:0x04cb  */
    /* JADX WARN: Removed duplicated region for block: B:298:0x0568  */
    /* JADX WARN: Removed duplicated region for block: B:299:0x056b  */
    /* JADX WARN: Removed duplicated region for block: B:303:0x05ab  */
    /* JADX WARN: Removed duplicated region for block: B:309:0x05d7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void d(n.f r76, boolean r77) {
        /*
            Method dump skipped, instructions count: 1531
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o.g.d(n.f, boolean):void");
    }

    public boolean c() {
        return this instanceof i;
    }

    public void S0(boolean horizontalDimensionFixed, boolean verticalDimensionFixed) {
        if (this.f2666w == -1) {
            if (horizontalDimensionFixed && !verticalDimensionFixed) {
                this.f2666w = 0;
            } else if (!horizontalDimensionFixed && verticalDimensionFixed) {
                this.f2666w = 1;
                if (this.V == -1) {
                    this.f2667x = 1.0f / this.f2667x;
                }
            }
        }
        if (this.f2666w == 0 && (!this.G.n() || !this.I.n())) {
            this.f2666w = 1;
        } else if (this.f2666w == 1 && (!this.F.n() || !this.H.n())) {
            this.f2666w = 0;
        }
        if (this.f2666w == -1 && (!this.G.n() || !this.I.n() || !this.F.n() || !this.H.n())) {
            if (this.G.n() && this.I.n()) {
                this.f2666w = 0;
            } else if (this.F.n() && this.H.n()) {
                this.f2667x = 1.0f / this.f2667x;
                this.f2666w = 1;
            }
        }
        if (this.f2666w == -1) {
            int i2 = this.f2660q;
            if (i2 > 0 && this.f2663t == 0) {
                this.f2666w = 0;
            } else if (i2 == 0 && this.f2663t > 0) {
                this.f2667x = 1.0f / this.f2667x;
                this.f2666w = 1;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:226:0x0514, code lost:
        if ((r5 instanceof o.a) != false) goto L_0x0519;
     */
    /* JADX WARN: Removed duplicated region for block: B:203:0x049c  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x04e5  */
    /* JADX WARN: Removed duplicated region for block: B:220:0x0504  */
    /* JADX WARN: Removed duplicated region for block: B:232:0x0535  */
    /* JADX WARN: Removed duplicated region for block: B:242:0x0557  */
    /* JADX WARN: Removed duplicated region for block: B:273:0x05ad  */
    /* JADX WARN: Removed duplicated region for block: B:275:0x05b3  */
    /* JADX WARN: Removed duplicated region for block: B:298:0x05fa A[ADDED_TO_REGION] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void f(n.f r42, boolean r43, boolean r44, boolean r45, boolean r46, n.m r47, n.m r48, o.f r49, boolean r50, o.e r51, o.e r52, int r53, int r54, int r55, int r56, float r57, boolean r58, boolean r59, boolean r60, boolean r61, boolean r62, int r63, int r64, int r65, int r66, float r67, boolean r68) {
        /*
            Method dump skipped, instructions count: 1644
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o.g.f(n.f, boolean, boolean, boolean, boolean, n.m, n.m, o.f, boolean, o.e, o.e, int, int, int, int, float, boolean, boolean, boolean, boolean, boolean, int, int, int, int, float, boolean):void");
    }

    public void U0(f system, boolean optimize) {
        q qVar;
        o oVar;
        int left = system.x(this.F);
        int top = system.x(this.G);
        int right = system.x(this.H);
        int bottom = system.x(this.I);
        if (optimize && (oVar = this.f2636d) != null) {
            i iVar = oVar.f2770h;
            if (iVar.f2741j) {
                i iVar2 = oVar.f2771i;
                if (iVar2.f2741j) {
                    left = iVar.f2738g;
                    right = iVar2.f2738g;
                }
            }
        }
        if (optimize && (qVar = this.f2638e) != null) {
            i iVar3 = qVar.f2770h;
            if (iVar3.f2741j) {
                i iVar4 = qVar.f2771i;
                if (iVar4.f2741j) {
                    top = iVar3.f2738g;
                    bottom = iVar4.f2738g;
                }
            }
        }
        int w2 = right - left;
        int h2 = bottom - top;
        if (w2 < 0 || h2 < 0 || left == Integer.MIN_VALUE || left == Integer.MAX_VALUE || top == Integer.MIN_VALUE || top == Integer.MAX_VALUE || right == Integer.MIN_VALUE || right == Integer.MAX_VALUE || bottom == Integer.MIN_VALUE || bottom == Integer.MAX_VALUE) {
            left = 0;
            top = 0;
            right = 0;
            bottom = 0;
        }
        q0(left, top, right, bottom);
    }

    public void T0(boolean updateHorizontal, boolean updateVertical) {
        boolean updateHorizontal2 = updateHorizontal & this.f2636d.k();
        boolean updateVertical2 = updateVertical & this.f2638e.k();
        o oVar = this.f2636d;
        int left = oVar.f2770h.f2738g;
        q qVar = this.f2638e;
        int top = qVar.f2770h.f2738g;
        int right = oVar.f2771i.f2738g;
        int bottom = qVar.f2771i.f2738g;
        int h2 = bottom - top;
        if (right - left < 0 || h2 < 0 || left == Integer.MIN_VALUE || left == Integer.MAX_VALUE || top == Integer.MIN_VALUE || top == Integer.MAX_VALUE || right == Integer.MIN_VALUE || right == Integer.MAX_VALUE || bottom == Integer.MIN_VALUE || bottom == Integer.MAX_VALUE) {
            left = 0;
            top = 0;
            right = 0;
            bottom = 0;
        }
        int w2 = right - left;
        int h3 = bottom - top;
        if (updateHorizontal2) {
            this.W = left;
        }
        if (updateVertical2) {
            this.X = top;
        }
        if (this.f2639e0 == 8) {
            this.S = 0;
            this.T = 0;
            return;
        }
        if (updateHorizontal2) {
            if (this.Q[0] == f.FIXED && w2 < this.S) {
                w2 = this.S;
            }
            this.S = w2;
            int i2 = this.Z;
            if (w2 < i2) {
                this.S = i2;
            }
        }
        if (updateVertical2) {
            if (this.Q[1] == f.FIXED && h3 < this.T) {
                h3 = this.T;
            }
            this.T = h3;
            int i3 = this.f2631a0;
            if (h3 < i3) {
                this.T = i3;
            }
        }
    }

    public void b(h container, f system, HashSet hashSet, int orientation, boolean addSelf) {
        if (addSelf) {
            if (hashSet.contains(this)) {
                l.a(container, system, this);
                hashSet.remove(this);
                d(system, container.w1(64));
            } else {
                return;
            }
        }
        if (orientation == 0) {
            HashSet<ConstraintAnchor> dependents = this.F.c();
            if (dependents != null) {
                Iterator<ConstraintAnchor> it = dependents.iterator();
                while (it.hasNext()) {
                    e anchor = (e) it.next();
                    anchor.f2618d.b(container, system, hashSet, orientation, true);
                }
            }
            HashSet<ConstraintAnchor> dependents2 = this.H.c();
            if (dependents2 != null) {
                Iterator<ConstraintAnchor> it2 = dependents2.iterator();
                while (it2.hasNext()) {
                    e anchor2 = (e) it2.next();
                    anchor2.f2618d.b(container, system, hashSet, orientation, true);
                }
                return;
            }
            return;
        }
        HashSet<ConstraintAnchor> dependents3 = this.G.c();
        if (dependents3 != null) {
            Iterator<ConstraintAnchor> it3 = dependents3.iterator();
            while (it3.hasNext()) {
                e anchor3 = (e) it3.next();
                anchor3.f2618d.b(container, system, hashSet, orientation, true);
            }
        }
        HashSet<ConstraintAnchor> dependents4 = this.I.c();
        if (dependents4 != null) {
            Iterator<ConstraintAnchor> it4 = dependents4.iterator();
            while (it4.hasNext()) {
                e anchor4 = (e) it4.next();
                anchor4.f2618d.b(container, system, hashSet, orientation, true);
            }
        }
        HashSet<ConstraintAnchor> dependents5 = this.J.c();
        if (dependents5 != null) {
            Iterator<ConstraintAnchor> it5 = dependents5.iterator();
            while (it5.hasNext()) {
                e anchor5 = (e) it5.next();
                anchor5.f2618d.b(container, system, hashSet, orientation, true);
            }
        }
    }
}
