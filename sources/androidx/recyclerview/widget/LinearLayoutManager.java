package androidx.recyclerview.widget;

import android.content.Context;
import android.graphics.PointF;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;
import java.util.Objects;
import q0.b2;
import q0.e0;
import q0.e2;
import q0.f0;
import q0.g0;
import q0.h2;
import q0.i0;
import q0.j0;
import q0.k1;
import q0.l1;
import q0.m1;
import q0.n1;
import q0.o0;
import q0.t1;
import q0.x;
import q0.z1;

/* JADX WARN: Classes with same name are omitted:
  
 */
/* loaded from: classes.dex */
public class LinearLayoutManager extends m1 implements z1 {
    public int A;
    public i0 B;
    public final e0 C;
    public final f0 D;
    public int E;
    public int[] F;

    /* renamed from: r  reason: collision with root package name */
    public int f1054r;

    /* renamed from: s  reason: collision with root package name */
    public g0 f1055s;

    /* renamed from: t  reason: collision with root package name */
    public o0 f1056t;

    /* renamed from: u  reason: collision with root package name */
    public boolean f1057u;

    /* renamed from: v  reason: collision with root package name */
    public boolean f1058v;

    /* renamed from: w  reason: collision with root package name */
    public boolean f1059w;

    /* renamed from: x  reason: collision with root package name */
    public boolean f1060x;

    /* renamed from: y  reason: collision with root package name */
    public boolean f1061y;

    /* renamed from: z  reason: collision with root package name */
    public int f1062z;

    public LinearLayoutManager(int orientation, boolean reverseLayout) {
        this.f1054r = 1;
        this.f1058v = false;
        this.f1059w = false;
        this.f1060x = false;
        this.f1061y = true;
        this.f1062z = -1;
        this.A = Integer.MIN_VALUE;
        this.B = null;
        this.C = new e0();
        this.D = new f0();
        this.E = 2;
        this.F = new int[2];
        B2(orientation);
        C2(reverseLayout);
    }

    public LinearLayoutManager(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        this.f1054r = 1;
        this.f1058v = false;
        this.f1059w = false;
        this.f1060x = false;
        this.f1061y = true;
        this.f1062z = -1;
        this.A = Integer.MIN_VALUE;
        this.B = null;
        this.C = new e0();
        this.D = new f0();
        this.E = 2;
        this.F = new int[2];
        l1 properties = m1.i0(context, attrs, defStyleAttr, defStyleRes);
        B2(properties.f3105a);
        C2(properties.f3107c);
        D2(properties.f3108d);
    }

    @Override // q0.m1
    public boolean s0() {
        return true;
    }

    @Override // q0.m1
    public n1 D() {
        return new n1(-2, -2);
    }

    @Override // q0.m1
    public void I0(RecyclerView view, t1 recycler) {
        super.I0(view, recycler);
    }

    @Override // q0.m1
    public void K0(AccessibilityEvent event) {
        super.K0(event);
        if (J() > 0) {
            event.setFromIndex(Z1());
            event.setToIndex(c2());
        }
    }

    @Override // q0.m1
    public Parcelable d1() {
        if (this.B != null) {
            return new i0(this.B);
        }
        i0 state = new i0();
        if (J() > 0) {
            T1();
            boolean didLayoutFromEnd = this.f1057u ^ this.f1059w;
            state.f3074d = didLayoutFromEnd;
            if (didLayoutFromEnd) {
                View refChild = m2();
                state.f3073c = this.f1056t.i() - this.f1056t.d(refChild);
                state.f3072b = h0(refChild);
            } else {
                View refChild2 = n2();
                state.f3072b = h0(refChild2);
                state.f3073c = this.f1056t.g(refChild2) - this.f1056t.m();
            }
        } else {
            state.j();
        }
        return state;
    }

    @Override // q0.m1
    public void c1(Parcelable state) {
        if (state instanceof i0) {
            this.B = (i0) state;
            t1();
        }
    }

    @Override // q0.m1
    public boolean k() {
        return this.f1054r == 0;
    }

    @Override // q0.m1
    public boolean l() {
        return this.f1054r == 1;
    }

    public void D2(boolean stackFromEnd) {
        g(null);
        if (this.f1060x != stackFromEnd) {
            this.f1060x = stackFromEnd;
            t1();
        }
    }

    public int p2() {
        return this.f1054r;
    }

    public void B2(int orientation) {
        if (orientation == 0 || orientation == 1) {
            g(null);
            if (orientation != this.f1054r || this.f1056t == null) {
                o0 b2 = o0.b(this, orientation);
                this.f1056t = b2;
                this.C.f3010a = b2;
                this.f1054r = orientation;
                t1();
                return;
            }
            return;
        }
        throw new IllegalArgumentException("invalid orientation:" + orientation);
    }

    public final void z2() {
        if (this.f1054r == 1 || !q2()) {
            this.f1059w = this.f1058v;
        } else {
            this.f1059w = !this.f1058v;
        }
    }

    public void C2(boolean reverseLayout) {
        g(null);
        if (reverseLayout != this.f1058v) {
            this.f1058v = reverseLayout;
            t1();
        }
    }

    @Override // q0.m1
    public View C(int position) {
        int childCount = J();
        if (childCount == 0) {
            return null;
        }
        int firstChild = h0(I(0));
        int viewPosition = position - firstChild;
        if (viewPosition >= 0 && viewPosition < childCount) {
            View child = I(viewPosition);
            if (h0(child) == position) {
                return child;
            }
        }
        return super.C(position);
    }

    public int o2(b2 state) {
        if (state.d()) {
            return this.f1056t.n();
        }
        return 0;
    }

    public void M1(b2 state, int[] extraLayoutSpace) {
        int extraLayoutSpaceStart = 0;
        int extraLayoutSpaceEnd = 0;
        int extraScrollSpace = o2(state);
        if (this.f1055s.f3058f == -1) {
            extraLayoutSpaceStart = extraScrollSpace;
        } else {
            extraLayoutSpaceEnd = extraScrollSpace;
        }
        extraLayoutSpace[0] = extraLayoutSpaceStart;
        extraLayoutSpace[1] = extraLayoutSpaceEnd;
    }

    @Override // q0.m1
    public void I1(RecyclerView recyclerView, b2 state, int position) {
        j0 linearSmoothScroller = new j0(recyclerView.getContext());
        linearSmoothScroller.p(position);
        J1(linearSmoothScroller);
    }

    @Override // q0.z1
    public PointF a(int targetPosition) {
        if (J() == 0) {
            return null;
        }
        boolean z2 = false;
        int firstChildPos = h0(I(0));
        int direction = 1;
        if (targetPosition < firstChildPos) {
            z2 = true;
        }
        if (z2 != this.f1059w) {
            direction = -1;
        }
        if (this.f1054r == 0) {
            return new PointF(direction, 0.0f);
        }
        return new PointF(0.0f, direction);
    }

    @Override // q0.m1
    public void X0(t1 recycler, b2 state) {
        int endOffset;
        int startOffset;
        int i2;
        View existing;
        int upcomingOffset;
        int firstLayoutDirection = -1;
        if (!(this.B == null && this.f1062z == -1) && state.b() == 0) {
            k1(recycler);
            return;
        }
        i0 i0Var = this.B;
        if (i0Var != null && i0Var.i()) {
            this.f1062z = this.B.f3072b;
        }
        T1();
        this.f1055s.f3053a = false;
        z2();
        View focused = V();
        e0 e0Var = this.C;
        if (!e0Var.f3014e || this.f1062z != -1 || this.B != null) {
            e0Var.e();
            e0 e0Var2 = this.C;
            e0Var2.f3013d = this.f1059w ^ this.f1060x;
            G2(recycler, state, e0Var2);
            this.C.f3014e = true;
        } else if (focused != null && (this.f1056t.g(focused) >= this.f1056t.i() || this.f1056t.d(focused) <= this.f1056t.m())) {
            this.C.c(focused, h0(focused));
        }
        g0 g0Var = this.f1055s;
        g0Var.f3058f = g0Var.f3062j >= 0 ? 1 : -1;
        int[] iArr = this.F;
        iArr[0] = 0;
        iArr[1] = 0;
        M1(state, iArr);
        int extraForStart = Math.max(0, this.F[0]) + this.f1056t.m();
        int extraForEnd = Math.max(0, this.F[1]) + this.f1056t.j();
        if (!(!state.e() || (i2 = this.f1062z) == -1 || this.A == Integer.MIN_VALUE || (existing = C(i2)) == null)) {
            if (this.f1059w) {
                int current = this.f1056t.i() - this.f1056t.d(existing);
                upcomingOffset = current - this.A;
            } else {
                int current2 = this.f1056t.g(existing) - this.f1056t.m();
                upcomingOffset = this.A - current2;
            }
            if (upcomingOffset > 0) {
                extraForStart += upcomingOffset;
            } else {
                extraForEnd -= upcomingOffset;
            }
        }
        e0 e0Var3 = this.C;
        if (e0Var3.f3013d) {
            if (this.f1059w) {
                firstLayoutDirection = 1;
            }
        } else if (!this.f1059w) {
            firstLayoutDirection = 1;
        }
        t2(recycler, state, e0Var3, firstLayoutDirection);
        w(recycler);
        this.f1055s.f3064l = y2();
        g0 g0Var2 = this.f1055s;
        state.e();
        Objects.requireNonNull(g0Var2);
        this.f1055s.f3061i = 0;
        e0 e0Var4 = this.C;
        if (e0Var4.f3013d) {
            L2(e0Var4);
            g0 g0Var3 = this.f1055s;
            g0Var3.f3060h = extraForStart;
            U1(recycler, g0Var3, state, false);
            g0 g0Var4 = this.f1055s;
            startOffset = g0Var4.f3054b;
            int firstElement = g0Var4.f3056d;
            int i3 = g0Var4.f3055c;
            if (i3 > 0) {
                extraForEnd += i3;
            }
            J2(this.C);
            g0 g0Var5 = this.f1055s;
            g0Var5.f3060h = extraForEnd;
            g0Var5.f3056d += g0Var5.f3057e;
            U1(recycler, g0Var5, state, false);
            g0 g0Var6 = this.f1055s;
            endOffset = g0Var6.f3054b;
            if (g0Var6.f3055c > 0) {
                int extraForStart2 = g0Var6.f3055c;
                K2(firstElement, startOffset);
                g0 g0Var7 = this.f1055s;
                g0Var7.f3060h = extraForStart2;
                U1(recycler, g0Var7, state, false);
                startOffset = this.f1055s.f3054b;
            }
        } else {
            J2(e0Var4);
            g0 g0Var8 = this.f1055s;
            g0Var8.f3060h = extraForEnd;
            U1(recycler, g0Var8, state, false);
            g0 g0Var9 = this.f1055s;
            endOffset = g0Var9.f3054b;
            int lastElement = g0Var9.f3056d;
            int i4 = g0Var9.f3055c;
            if (i4 > 0) {
                extraForStart += i4;
            }
            L2(this.C);
            g0 g0Var10 = this.f1055s;
            g0Var10.f3060h = extraForStart;
            g0Var10.f3056d += g0Var10.f3057e;
            U1(recycler, g0Var10, state, false);
            g0 g0Var11 = this.f1055s;
            int startOffset2 = g0Var11.f3054b;
            if (g0Var11.f3055c > 0) {
                int extraForEnd2 = g0Var11.f3055c;
                I2(lastElement, endOffset);
                g0 g0Var12 = this.f1055s;
                g0Var12.f3060h = extraForEnd2;
                U1(recycler, g0Var12, state, false);
                endOffset = this.f1055s.f3054b;
                startOffset = startOffset2;
            } else {
                startOffset = startOffset2;
            }
        }
        if (J() > 0) {
            if (this.f1059w ^ this.f1060x) {
                int fixOffset = k2(endOffset, recycler, state, true);
                int startOffset3 = startOffset + fixOffset;
                int fixOffset2 = l2(startOffset3, recycler, state, false);
                startOffset = startOffset3 + fixOffset2;
                endOffset = endOffset + fixOffset + fixOffset2;
            } else {
                int fixOffset3 = l2(startOffset, recycler, state, true);
                int endOffset2 = endOffset + fixOffset3;
                int fixOffset4 = k2(endOffset2, recycler, state, false);
                startOffset = startOffset + fixOffset3 + fixOffset4;
                endOffset = endOffset2 + fixOffset4;
            }
        }
        s2(recycler, state, startOffset, endOffset);
        if (!state.e()) {
            this.f1056t.s();
        } else {
            this.C.e();
        }
        this.f1057u = this.f1060x;
    }

    @Override // q0.m1
    public void Y0(b2 state) {
        super.Y0(state);
        this.B = null;
        this.f1062z = -1;
        this.A = Integer.MIN_VALUE;
        this.C.e();
    }

    public void t2(t1 recycler, b2 state, e0 anchorInfo, int firstLayoutItemDirection) {
    }

    public final void s2(t1 recycler, b2 state, int startOffset, int endOffset) {
        boolean z2;
        if (!(!state.g() || J() == 0 || state.e())) {
            if (L1()) {
                int scrapExtraStart = 0;
                int scrapExtraEnd = 0;
                List<RecyclerView.ViewHolder> scrapList = recycler.k();
                int scrapSize = scrapList.size();
                int firstChildPos = h0(I(0));
                for (int i2 = 0; i2 < scrapSize; i2++) {
                    e2 scrap = (e2) scrapList.get(i2);
                    if (!scrap.v()) {
                        int position = scrap.m();
                        int direction = 1;
                        if (position < firstChildPos) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        if (z2 != this.f1059w) {
                            direction = -1;
                        }
                        if (direction == -1) {
                            scrapExtraStart += this.f1056t.e(scrap.f3018a);
                        } else {
                            scrapExtraEnd += this.f1056t.e(scrap.f3018a);
                        }
                    }
                }
                this.f1055s.f3063k = scrapList;
                if (scrapExtraStart > 0) {
                    View anchor = n2();
                    K2(h0(anchor), startOffset);
                    g0 g0Var = this.f1055s;
                    g0Var.f3060h = scrapExtraStart;
                    g0Var.f3055c = 0;
                    g0Var.a();
                    U1(recycler, this.f1055s, state, false);
                }
                if (scrapExtraEnd > 0) {
                    View anchor2 = m2();
                    I2(h0(anchor2), endOffset);
                    g0 g0Var2 = this.f1055s;
                    g0Var2.f3060h = scrapExtraEnd;
                    g0Var2.f3055c = 0;
                    g0Var2.a();
                    U1(recycler, this.f1055s, state, false);
                }
                this.f1055s.f3063k = null;
            }
        }
    }

    public final void G2(t1 recycler, b2 state, e0 anchorInfo) {
        if (!F2(state, anchorInfo) && !E2(recycler, state, anchorInfo)) {
            anchorInfo.a();
            anchorInfo.f3011b = this.f1060x ? state.b() - 1 : 0;
        }
    }

    public final boolean E2(t1 recycler, b2 state, e0 anchorInfo) {
        View referenceChild;
        int i2;
        boolean notVisible = false;
        if (J() == 0) {
            return false;
        }
        View focused = V();
        if (focused != null && anchorInfo.d(focused, state)) {
            anchorInfo.c(focused, h0(focused));
            return true;
        } else if (this.f1057u != this.f1060x) {
            return false;
        } else {
            if (anchorInfo.f3013d) {
                referenceChild = i2(recycler, state);
            } else {
                referenceChild = j2(recycler, state);
            }
            if (referenceChild == null) {
                return false;
            }
            anchorInfo.b(referenceChild, h0(referenceChild));
            if (!state.e() && L1()) {
                if (this.f1056t.g(referenceChild) >= this.f1056t.i() || this.f1056t.d(referenceChild) < this.f1056t.m()) {
                    notVisible = true;
                }
                if (notVisible) {
                    if (anchorInfo.f3013d) {
                        i2 = this.f1056t.i();
                    } else {
                        i2 = this.f1056t.m();
                    }
                    anchorInfo.f3012c = i2;
                }
            }
            return true;
        }
    }

    public final boolean F2(b2 state, e0 anchorInfo) {
        int i2;
        int i3;
        boolean z2 = false;
        if (state.e() || (i2 = this.f1062z) == -1) {
            return false;
        }
        if (i2 < 0 || i2 >= state.b()) {
            this.f1062z = -1;
            this.A = Integer.MIN_VALUE;
            return false;
        }
        anchorInfo.f3011b = this.f1062z;
        i0 i0Var = this.B;
        if (i0Var != null && i0Var.i()) {
            boolean z3 = this.B.f3074d;
            anchorInfo.f3013d = z3;
            if (z3) {
                anchorInfo.f3012c = this.f1056t.i() - this.B.f3073c;
            } else {
                anchorInfo.f3012c = this.f1056t.m() + this.B.f3073c;
            }
            return true;
        } else if (this.A == Integer.MIN_VALUE) {
            View child = C(this.f1062z);
            if (child != null) {
                int childSize = this.f1056t.e(child);
                if (childSize > this.f1056t.n()) {
                    anchorInfo.a();
                    return true;
                }
                int startGap = this.f1056t.g(child) - this.f1056t.m();
                if (startGap < 0) {
                    anchorInfo.f3012c = this.f1056t.m();
                    anchorInfo.f3013d = false;
                    return true;
                }
                int endGap = this.f1056t.i() - this.f1056t.d(child);
                if (endGap < 0) {
                    anchorInfo.f3012c = this.f1056t.i();
                    anchorInfo.f3013d = true;
                    return true;
                }
                if (anchorInfo.f3013d) {
                    i3 = this.f1056t.d(child) + this.f1056t.o();
                } else {
                    i3 = this.f1056t.g(child);
                }
                anchorInfo.f3012c = i3;
            } else {
                if (J() > 0) {
                    int pos = h0(I(0));
                    if ((this.f1062z < pos) == this.f1059w) {
                        z2 = true;
                    }
                    anchorInfo.f3013d = z2;
                }
                anchorInfo.a();
            }
            return true;
        } else {
            boolean z4 = this.f1059w;
            anchorInfo.f3013d = z4;
            if (z4) {
                anchorInfo.f3012c = this.f1056t.i() - this.A;
            } else {
                anchorInfo.f3012c = this.f1056t.m() + this.A;
            }
            return true;
        }
    }

    public final int k2(int endOffset, t1 recycler, b2 state, boolean canOffsetChildren) {
        int gap;
        int gap2 = this.f1056t.i() - endOffset;
        if (gap2 <= 0) {
            return 0;
        }
        int fixOffset = -A2(-gap2, recycler, state);
        int endOffset2 = endOffset + fixOffset;
        if (!canOffsetChildren || (gap = this.f1056t.i() - endOffset2) <= 0) {
            return fixOffset;
        }
        this.f1056t.r(gap);
        return gap + fixOffset;
    }

    public final int l2(int startOffset, t1 recycler, b2 state, boolean canOffsetChildren) {
        int gap;
        int gap2 = startOffset - this.f1056t.m();
        if (gap2 <= 0) {
            return 0;
        }
        int fixOffset = -A2(gap2, recycler, state);
        int startOffset2 = startOffset + fixOffset;
        if (!canOffsetChildren || (gap = startOffset2 - this.f1056t.m()) <= 0) {
            return fixOffset;
        }
        this.f1056t.r(-gap);
        return fixOffset - gap;
    }

    public final void J2(e0 anchorInfo) {
        I2(anchorInfo.f3011b, anchorInfo.f3012c);
    }

    public final void I2(int itemPosition, int offset) {
        this.f1055s.f3055c = this.f1056t.i() - offset;
        g0 g0Var = this.f1055s;
        g0Var.f3057e = this.f1059w ? -1 : 1;
        g0Var.f3056d = itemPosition;
        g0Var.f3058f = 1;
        g0Var.f3054b = offset;
        g0Var.f3059g = Integer.MIN_VALUE;
    }

    public final void L2(e0 anchorInfo) {
        K2(anchorInfo.f3011b, anchorInfo.f3012c);
    }

    public final void K2(int itemPosition, int offset) {
        this.f1055s.f3055c = offset - this.f1056t.m();
        g0 g0Var = this.f1055s;
        g0Var.f3056d = itemPosition;
        g0Var.f3057e = this.f1059w ? 1 : -1;
        g0Var.f3058f = -1;
        g0Var.f3054b = offset;
        g0Var.f3059g = Integer.MIN_VALUE;
    }

    public boolean q2() {
        return Z() == 1;
    }

    public void T1() {
        if (this.f1055s == null) {
            this.f1055s = S1();
        }
    }

    public g0 S1() {
        return new g0();
    }

    @Override // q0.m1
    public void x1(int position) {
        this.f1062z = position;
        this.A = Integer.MIN_VALUE;
        i0 i0Var = this.B;
        if (i0Var != null) {
            i0Var.j();
        }
        t1();
    }

    @Override // q0.m1
    public int w1(int dx, t1 recycler, b2 state) {
        if (this.f1054r == 1) {
            return 0;
        }
        return A2(dx, recycler, state);
    }

    @Override // q0.m1
    public int y1(int dy, t1 recycler, b2 state) {
        if (this.f1054r == 0) {
            return 0;
        }
        return A2(dy, recycler, state);
    }

    @Override // q0.m1
    public int r(b2 state) {
        return P1(state);
    }

    @Override // q0.m1
    public int u(b2 state) {
        return P1(state);
    }

    @Override // q0.m1
    public int q(b2 state) {
        return O1(state);
    }

    @Override // q0.m1
    public int t(b2 state) {
        return O1(state);
    }

    @Override // q0.m1
    public int s(b2 state) {
        return Q1(state);
    }

    @Override // q0.m1
    public int v(b2 state) {
        return Q1(state);
    }

    public final int P1(b2 state) {
        if (J() == 0) {
            return 0;
        }
        T1();
        return h2.b(state, this.f1056t, Y1(!this.f1061y, true), X1(!this.f1061y, true), this, this.f1061y, this.f1059w);
    }

    public final int O1(b2 state) {
        if (J() == 0) {
            return 0;
        }
        T1();
        return h2.a(state, this.f1056t, Y1(!this.f1061y, true), X1(!this.f1061y, true), this, this.f1061y);
    }

    public final int Q1(b2 state) {
        if (J() == 0) {
            return 0;
        }
        T1();
        return h2.c(state, this.f1056t, Y1(!this.f1061y, true), X1(!this.f1061y, true), this, this.f1061y);
    }

    public final void H2(int layoutDirection, int requiredSpace, boolean canUseExistingSpace, b2 state) {
        int scrollingOffset;
        this.f1055s.f3064l = y2();
        this.f1055s.f3058f = layoutDirection;
        int[] iArr = this.F;
        boolean layoutToEnd = false;
        iArr[0] = 0;
        int i2 = 1;
        iArr[1] = 0;
        M1(state, iArr);
        int extraForStart = Math.max(0, this.F[0]);
        int extraForEnd = Math.max(0, this.F[1]);
        if (layoutDirection == 1) {
            layoutToEnd = true;
        }
        g0 g0Var = this.f1055s;
        int i3 = layoutToEnd ? extraForEnd : extraForStart;
        g0Var.f3060h = i3;
        g0Var.f3061i = layoutToEnd ? extraForStart : extraForEnd;
        if (layoutToEnd) {
            g0Var.f3060h = i3 + this.f1056t.j();
            View child = m2();
            g0 g0Var2 = this.f1055s;
            if (this.f1059w) {
                i2 = -1;
            }
            g0Var2.f3057e = i2;
            int h02 = h0(child);
            g0 g0Var3 = this.f1055s;
            g0Var2.f3056d = h02 + g0Var3.f3057e;
            g0Var3.f3054b = this.f1056t.d(child);
            scrollingOffset = this.f1056t.d(child) - this.f1056t.i();
        } else {
            View child2 = n2();
            this.f1055s.f3060h += this.f1056t.m();
            g0 g0Var4 = this.f1055s;
            if (!this.f1059w) {
                i2 = -1;
            }
            g0Var4.f3057e = i2;
            int h03 = h0(child2);
            g0 g0Var5 = this.f1055s;
            g0Var4.f3056d = h03 + g0Var5.f3057e;
            g0Var5.f3054b = this.f1056t.g(child2);
            scrollingOffset = (-this.f1056t.g(child2)) + this.f1056t.m();
        }
        g0 g0Var6 = this.f1055s;
        g0Var6.f3055c = requiredSpace;
        if (canUseExistingSpace) {
            g0Var6.f3055c = requiredSpace - scrollingOffset;
        }
        g0Var6.f3059g = scrollingOffset;
    }

    public boolean y2() {
        return this.f1056t.k() == 0 && this.f1056t.h() == 0;
    }

    public void N1(b2 state, g0 layoutState, k1 layoutPrefetchRegistry) {
        int pos = layoutState.f3056d;
        if (pos >= 0 && pos < state.b()) {
            ((x) layoutPrefetchRegistry).a(pos, Math.max(0, layoutState.f3059g));
        }
    }

    @Override // q0.m1
    public void p(int adapterItemCount, k1 layoutPrefetchRegistry) {
        boolean fromEnd;
        int anchorPos;
        i0 i0Var = this.B;
        int direction = -1;
        if (i0Var == null || !i0Var.i()) {
            z2();
            fromEnd = this.f1059w;
            if (this.f1062z == -1) {
                anchorPos = fromEnd ? adapterItemCount - 1 : 0;
            } else {
                anchorPos = this.f1062z;
            }
        } else {
            i0 i0Var2 = this.B;
            fromEnd = i0Var2.f3074d;
            anchorPos = i0Var2.f3072b;
        }
        if (!fromEnd) {
            direction = 1;
        }
        int targetPos = anchorPos;
        for (int i2 = 0; i2 < this.E && targetPos >= 0 && targetPos < adapterItemCount; i2++) {
            ((x) layoutPrefetchRegistry).a(targetPos, 0);
            targetPos += direction;
        }
    }

    @Override // q0.m1
    public void o(int dx, int dy, b2 state, k1 layoutPrefetchRegistry) {
        int delta = this.f1054r == 0 ? dx : dy;
        if (J() != 0 && delta != 0) {
            T1();
            int layoutDirection = delta > 0 ? 1 : -1;
            int absDelta = Math.abs(delta);
            H2(layoutDirection, absDelta, true, state);
            N1(state, this.f1055s, layoutPrefetchRegistry);
        }
    }

    public int A2(int delta, t1 recycler, b2 state) {
        if (J() == 0 || delta == 0) {
            return 0;
        }
        T1();
        this.f1055s.f3053a = true;
        int layoutDirection = delta > 0 ? 1 : -1;
        int absDelta = Math.abs(delta);
        H2(layoutDirection, absDelta, true, state);
        g0 g0Var = this.f1055s;
        int consumed = g0Var.f3059g + U1(recycler, g0Var, state, false);
        if (consumed < 0) {
            return 0;
        }
        int scrolled = absDelta > consumed ? layoutDirection * consumed : delta;
        this.f1056t.r(-scrolled);
        this.f1055s.f3062j = scrolled;
        return scrolled;
    }

    @Override // q0.m1
    public void g(String message) {
        if (this.B == null) {
            super.g(message);
        }
    }

    public final void v2(t1 recycler, int startIndex, int endIndex) {
        if (startIndex != endIndex) {
            if (endIndex > startIndex) {
                for (int i2 = endIndex - 1; i2 >= startIndex; i2--) {
                    n1(i2, recycler);
                }
                return;
            }
            for (int i3 = startIndex; i3 > endIndex; i3--) {
                n1(i3, recycler);
            }
        }
    }

    public final void x2(t1 recycler, int scrollingOffset, int noRecycleSpace) {
        if (scrollingOffset >= 0) {
            int limit = scrollingOffset - noRecycleSpace;
            int childCount = J();
            if (this.f1059w) {
                for (int i2 = childCount - 1; i2 >= 0; i2--) {
                    View child = I(i2);
                    if (this.f1056t.d(child) > limit || this.f1056t.p(child) > limit) {
                        v2(recycler, childCount - 1, i2);
                        return;
                    }
                }
                return;
            }
            for (int i3 = 0; i3 < childCount; i3++) {
                View child2 = I(i3);
                if (this.f1056t.d(child2) > limit || this.f1056t.p(child2) > limit) {
                    v2(recycler, 0, i3);
                    return;
                }
            }
        }
    }

    public final void w2(t1 recycler, int scrollingOffset, int noRecycleSpace) {
        int childCount = J();
        if (scrollingOffset >= 0) {
            int limit = (this.f1056t.h() - scrollingOffset) + noRecycleSpace;
            if (this.f1059w) {
                for (int i2 = 0; i2 < childCount; i2++) {
                    View child = I(i2);
                    if (this.f1056t.g(child) < limit || this.f1056t.q(child) < limit) {
                        v2(recycler, 0, i2);
                        return;
                    }
                }
                return;
            }
            for (int i3 = childCount - 1; i3 >= 0; i3--) {
                View child2 = I(i3);
                if (this.f1056t.g(child2) < limit || this.f1056t.q(child2) < limit) {
                    v2(recycler, childCount - 1, i3);
                    return;
                }
            }
        }
    }

    public final void u2(t1 recycler, g0 layoutState) {
        if (layoutState.f3053a && !layoutState.f3064l) {
            int scrollingOffset = layoutState.f3059g;
            int noRecycleSpace = layoutState.f3061i;
            if (layoutState.f3058f == -1) {
                w2(recycler, scrollingOffset, noRecycleSpace);
            } else {
                x2(recycler, scrollingOffset, noRecycleSpace);
            }
        }
    }

    public int U1(t1 recycler, g0 layoutState, b2 state, boolean stopOnFocusable) {
        int start = layoutState.f3055c;
        int i2 = layoutState.f3059g;
        if (i2 != Integer.MIN_VALUE) {
            int i3 = layoutState.f3055c;
            if (i3 < 0) {
                layoutState.f3059g = i2 + i3;
            }
            u2(recycler, layoutState);
        }
        int remainingSpace = layoutState.f3055c + layoutState.f3060h;
        f0 layoutChunkResult = this.D;
        while (true) {
            if ((!layoutState.f3064l && remainingSpace <= 0) || !layoutState.c(state)) {
                break;
            }
            layoutChunkResult.a();
            r2(recycler, state, layoutState, layoutChunkResult);
            if (!layoutChunkResult.f3040b) {
                layoutState.f3054b += layoutChunkResult.f3039a * layoutState.f3058f;
                if (!layoutChunkResult.f3041c || layoutState.f3063k != null || !state.e()) {
                    int i4 = layoutState.f3055c;
                    int i5 = layoutChunkResult.f3039a;
                    layoutState.f3055c = i4 - i5;
                    remainingSpace -= i5;
                }
                int i6 = layoutState.f3059g;
                if (i6 != Integer.MIN_VALUE) {
                    int i7 = i6 + layoutChunkResult.f3039a;
                    layoutState.f3059g = i7;
                    int i8 = layoutState.f3055c;
                    if (i8 < 0) {
                        layoutState.f3059g = i7 + i8;
                    }
                    u2(recycler, layoutState);
                }
                if (stopOnFocusable && layoutChunkResult.f3042d) {
                    break;
                }
            } else {
                break;
            }
        }
        return start - layoutState.f3055c;
    }

    public void r2(t1 recycler, b2 state, g0 layoutState, f0 result) {
        int top;
        int left;
        int bottom;
        int right;
        int left2;
        int right2;
        View view = layoutState.d(recycler);
        if (view == null) {
            result.f3040b = true;
            return;
        }
        n1 params = (n1) view.getLayoutParams();
        if (layoutState.f3063k == null) {
            if (this.f1059w == (layoutState.f3058f == -1)) {
                d(view);
            } else {
                e(view, 0);
            }
        } else {
            if (this.f1059w == (layoutState.f3058f == -1)) {
                b(view);
            } else {
                c(view, 0);
            }
        }
        A0(view, 0, 0);
        result.f3039a = this.f1056t.e(view);
        if (this.f1054r == 1) {
            if (q2()) {
                right2 = o0() - f0();
                left2 = right2 - this.f1056t.f(view);
            } else {
                left2 = e0();
                right2 = this.f1056t.f(view) + left2;
            }
            if (layoutState.f3058f == -1) {
                int bottom2 = layoutState.f3054b;
                top = layoutState.f3054b - result.f3039a;
                right = right2;
                bottom = bottom2;
                left = left2;
            } else {
                int top2 = layoutState.f3054b;
                bottom = layoutState.f3054b + result.f3039a;
                right = right2;
                left = left2;
                top = top2;
            }
        } else {
            int top3 = g0();
            int bottom3 = this.f1056t.f(view) + top3;
            if (layoutState.f3058f == -1) {
                int right3 = layoutState.f3054b;
                left = layoutState.f3054b - result.f3039a;
                bottom = bottom3;
                right = right3;
                top = top3;
            } else {
                int left3 = layoutState.f3054b;
                right = layoutState.f3054b + result.f3039a;
                bottom = bottom3;
                left = left3;
                top = top3;
            }
        }
        z0(view, left, top, right, bottom);
        if (params.c() || params.b()) {
            result.f3041c = true;
        }
        result.f3042d = view.hasFocusable();
    }

    @Override // q0.m1
    public boolean G1() {
        return (X() == 1073741824 || p0() == 1073741824 || !q0()) ? false : true;
    }

    public int R1(int focusDirection) {
        switch (focusDirection) {
            case 1:
                return (this.f1054r != 1 && q2()) ? 1 : -1;
            case 2:
                return (this.f1054r != 1 && q2()) ? -1 : 1;
            case 17:
                return this.f1054r == 0 ? -1 : Integer.MIN_VALUE;
            case 33:
                return this.f1054r == 1 ? -1 : Integer.MIN_VALUE;
            case 66:
                return this.f1054r == 0 ? 1 : Integer.MIN_VALUE;
            case 130:
                return this.f1054r == 1 ? 1 : Integer.MIN_VALUE;
            default:
                return Integer.MIN_VALUE;
        }
    }

    public final View n2() {
        return I(this.f1059w ? J() - 1 : 0);
    }

    public final View m2() {
        return I(this.f1059w ? 0 : J() - 1);
    }

    public View Y1(boolean completelyVisible, boolean acceptPartiallyVisible) {
        if (this.f1059w) {
            return e2(J() - 1, -1, completelyVisible, acceptPartiallyVisible);
        }
        return e2(0, J(), completelyVisible, acceptPartiallyVisible);
    }

    public View X1(boolean completelyVisible, boolean acceptPartiallyVisible) {
        if (this.f1059w) {
            return e2(0, J(), completelyVisible, acceptPartiallyVisible);
        }
        return e2(J() - 1, -1, completelyVisible, acceptPartiallyVisible);
    }

    public final View i2(t1 recycler, b2 state) {
        return this.f1059w ? W1(recycler, state) : b2(recycler, state);
    }

    public final View j2(t1 recycler, b2 state) {
        return this.f1059w ? b2(recycler, state) : W1(recycler, state);
    }

    public final View W1(t1 recycler, b2 state) {
        return h2(recycler, state, 0, J(), state.b());
    }

    public final View b2(t1 recycler, b2 state) {
        return h2(recycler, state, J() - 1, -1, state.b());
    }

    public View h2(t1 recycler, b2 state, int start, int end, int itemCount) {
        T1();
        View invalidMatch = null;
        View outOfBoundsMatch = null;
        int boundsStart = this.f1056t.m();
        int boundsEnd = this.f1056t.i();
        int diff = end > start ? 1 : -1;
        for (int i2 = start; i2 != end; i2 += diff) {
            View view = I(i2);
            int position = h0(view);
            if (position >= 0 && position < itemCount) {
                if (((n1) view.getLayoutParams()).c()) {
                    if (invalidMatch == null) {
                        invalidMatch = view;
                    }
                } else if (this.f1056t.g(view) < boundsEnd && this.f1056t.d(view) >= boundsStart) {
                    return view;
                } else {
                    if (outOfBoundsMatch == null) {
                        outOfBoundsMatch = view;
                    }
                }
            }
        }
        return outOfBoundsMatch != null ? outOfBoundsMatch : invalidMatch;
    }

    public final View f2() {
        return this.f1059w ? V1() : a2();
    }

    public final View g2() {
        return this.f1059w ? a2() : V1();
    }

    public final View V1() {
        return d2(0, J());
    }

    public final View a2() {
        return d2(J() - 1, -1);
    }

    public int Z1() {
        View child = e2(0, J(), false, true);
        if (child == null) {
            return -1;
        }
        return h0(child);
    }

    public int c2() {
        View child = e2(J() - 1, -1, false, true);
        if (child == null) {
            return -1;
        }
        return h0(child);
    }

    public View e2(int fromIndex, int toIndex, boolean completelyVisible, boolean acceptPartiallyVisible) {
        int preferredBoundsFlag;
        T1();
        int acceptableBoundsFlag = 0;
        if (completelyVisible) {
            preferredBoundsFlag = 24579;
        } else {
            preferredBoundsFlag = 320;
        }
        if (acceptPartiallyVisible) {
            acceptableBoundsFlag = 320;
        }
        if (this.f1054r == 0) {
            return this.f3118e.a(fromIndex, toIndex, preferredBoundsFlag, acceptableBoundsFlag);
        }
        return this.f3119f.a(fromIndex, toIndex, preferredBoundsFlag, acceptableBoundsFlag);
    }

    public View d2(int fromIndex, int toIndex) {
        int acceptableBoundsFlag;
        int preferredBoundsFlag;
        T1();
        int next = toIndex > fromIndex ? 1 : toIndex < fromIndex ? -1 : 0;
        if (next == 0) {
            return I(fromIndex);
        }
        if (this.f1056t.g(I(fromIndex)) < this.f1056t.m()) {
            preferredBoundsFlag = 16644;
            acceptableBoundsFlag = 16388;
        } else {
            preferredBoundsFlag = 4161;
            acceptableBoundsFlag = 4097;
        }
        if (this.f1054r == 0) {
            return this.f3118e.a(fromIndex, toIndex, preferredBoundsFlag, acceptableBoundsFlag);
        }
        return this.f3119f.a(fromIndex, toIndex, preferredBoundsFlag, acceptableBoundsFlag);
    }

    @Override // q0.m1
    public View J0(View focused, int focusDirection, t1 recycler, b2 state) {
        int layoutDir;
        View nextCandidate;
        View nextFocus;
        z2();
        if (J() == 0 || (layoutDir = R1(focusDirection)) == Integer.MIN_VALUE) {
            return null;
        }
        T1();
        int maxScroll = (int) (this.f1056t.n() * 0.33333334f);
        H2(layoutDir, maxScroll, false, state);
        g0 g0Var = this.f1055s;
        g0Var.f3059g = Integer.MIN_VALUE;
        g0Var.f3053a = false;
        U1(recycler, g0Var, state, true);
        if (layoutDir == -1) {
            nextCandidate = g2();
        } else {
            nextCandidate = f2();
        }
        if (layoutDir == -1) {
            nextFocus = n2();
        } else {
            nextFocus = m2();
        }
        if (!nextFocus.hasFocusable()) {
            return nextCandidate;
        }
        if (nextCandidate == null) {
            return null;
        }
        return nextFocus;
    }

    @Override // q0.m1
    public boolean L1() {
        return this.B == null && this.f1057u == this.f1060x;
    }
}
