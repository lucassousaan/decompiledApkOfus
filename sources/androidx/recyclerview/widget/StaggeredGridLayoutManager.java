package androidx.recyclerview.widget;

import android.content.Context;
import android.graphics.PointF;
import android.graphics.Rect;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import g0.e;
import g0.f;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.Objects;
import q0.b2;
import q0.d0;
import q0.h2;
import q0.j0;
import q0.k1;
import q0.l1;
import q0.l2;
import q0.m1;
import q0.m2;
import q0.n1;
import q0.n2;
import q0.o0;
import q0.p2;
import q0.q2;
import q0.s2;
import q0.t1;
import q0.t2;
import q0.x;
import q0.z1;

/* JADX WARN: Classes with same name are omitted:
  
 */
/* loaded from: classes.dex */
public class StaggeredGridLayoutManager extends m1 implements z1 {
    public BitSet A;
    public boolean F;
    public boolean G;
    public s2 H;
    public int I;
    public int[] N;

    /* renamed from: s  reason: collision with root package name */
    public t2[] f1115s;

    /* renamed from: t  reason: collision with root package name */
    public o0 f1116t;

    /* renamed from: u  reason: collision with root package name */
    public o0 f1117u;

    /* renamed from: v  reason: collision with root package name */
    public int f1118v;

    /* renamed from: w  reason: collision with root package name */
    public int f1119w;

    /* renamed from: r  reason: collision with root package name */
    public int f1114r = -1;

    /* renamed from: y  reason: collision with root package name */
    public boolean f1121y = false;

    /* renamed from: z  reason: collision with root package name */
    public boolean f1122z = false;
    public int B = -1;
    public int C = Integer.MIN_VALUE;
    public q2 D = new q2();
    public int E = 2;
    public final Rect J = new Rect();
    public final m2 K = new m2(this);
    public boolean L = false;
    public boolean M = true;
    public final Runnable O = new l2(this);

    /* renamed from: x  reason: collision with root package name */
    public final d0 f1120x = new d0();

    public StaggeredGridLayoutManager(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        l1 properties = m1.i0(context, attrs, defStyleAttr, defStyleRes);
        B2(properties.f3105a);
        D2(properties.f3106b);
        C2(properties.f3107c);
        V1();
    }

    @Override // q0.m1
    public boolean s0() {
        return this.E != 0;
    }

    public final void V1() {
        this.f1116t = o0.b(this, this.f1118v);
        this.f1117u = o0.b(this, 1 - this.f1118v);
    }

    public boolean P1() {
        int maxPos;
        int minPos;
        if (J() == 0 || this.E == 0 || !r0()) {
            return false;
        }
        if (this.f1122z) {
            minPos = f2();
            maxPos = e2();
        } else {
            minPos = e2();
            maxPos = f2();
        }
        if (minPos == 0) {
            View gapView = m2();
            if (gapView != null) {
                this.D.a();
                u1();
                t1();
                return true;
            }
        }
        if (!this.L) {
            return false;
        }
        int invalidGapDir = this.f1122z ? -1 : 1;
        p2 invalidFsi = this.D.d(minPos, maxPos + 1, invalidGapDir, true);
        if (invalidFsi == null) {
            this.L = false;
            this.D.c(maxPos + 1);
            return false;
        }
        p2 validFsi = this.D.d(minPos, invalidFsi.f3162b, invalidGapDir * (-1), true);
        if (validFsi == null) {
            this.D.c(invalidFsi.f3162b);
        } else {
            this.D.c(validFsi.f3162b + 1);
        }
        u1();
        t1();
        return true;
    }

    @Override // q0.m1
    public void e1(int state) {
        if (state == 0) {
            P1();
        }
    }

    @Override // q0.m1
    public void I0(RecyclerView view, t1 recycler) {
        super.I0(view, recycler);
        o1(this.O);
        for (int i2 = 0; i2 < this.f1114r; i2++) {
            this.f1115s[i2].e();
        }
        view.requestLayout();
    }

    public View m2() {
        int childLimit;
        int firstChildIndex;
        int endChildIndex = J() - 1;
        BitSet mSpansToCheck = new BitSet(this.f1114r);
        mSpansToCheck.set(0, this.f1114r, true);
        int nextChildDiff = -1;
        int preferredSpanDir = (this.f1118v != 1 || !o2()) ? -1 : 1;
        if (this.f1122z) {
            firstChildIndex = endChildIndex;
            childLimit = 0 - 1;
        } else {
            firstChildIndex = 0;
            childLimit = endChildIndex + 1;
        }
        if (firstChildIndex < childLimit) {
            nextChildDiff = 1;
        }
        for (int i2 = firstChildIndex; i2 != childLimit; i2 += nextChildDiff) {
            View child = I(i2);
            n2 lp = (n2) child.getLayoutParams();
            if (mSpansToCheck.get(lp.f3146e.f3216e)) {
                if (Q1(lp.f3146e)) {
                    return child;
                }
                mSpansToCheck.clear(lp.f3146e.f3216e);
            }
            Objects.requireNonNull(lp);
            if (i2 + nextChildDiff != childLimit) {
                View nextChild = I(i2 + nextChildDiff);
                boolean compareSpans = false;
                if (this.f1122z) {
                    int myEnd = this.f1116t.d(child);
                    int nextEnd = this.f1116t.d(nextChild);
                    if (myEnd < nextEnd) {
                        return child;
                    }
                    if (myEnd == nextEnd) {
                        compareSpans = true;
                    }
                } else {
                    int myStart = this.f1116t.g(child);
                    int nextStart = this.f1116t.g(nextChild);
                    if (myStart > nextStart) {
                        return child;
                    }
                    if (myStart == nextStart) {
                        compareSpans = true;
                    }
                }
                if (compareSpans) {
                    n2 nextLp = (n2) nextChild.getLayoutParams();
                    if ((lp.f3146e.f3216e - nextLp.f3146e.f3216e < 0) != (preferredSpanDir < 0)) {
                        return child;
                    }
                } else {
                    continue;
                }
            }
        }
        return null;
    }

    public final boolean Q1(t2 span) {
        if (this.f1122z) {
            if (span.k() < this.f1116t.i()) {
                ArrayList arrayList = span.f3212a;
                View endView = (View) arrayList.get(arrayList.size() - 1);
                n2 lp = span.n(endView);
                Objects.requireNonNull(lp);
                return true;
            }
        } else if (span.o() > this.f1116t.m()) {
            View startView = (View) span.f3212a.get(0);
            n2 lp2 = span.n(startView);
            Objects.requireNonNull(lp2);
            return true;
        }
        return false;
    }

    public void D2(int spanCount) {
        g(null);
        if (spanCount != this.f1114r) {
            n2();
            this.f1114r = spanCount;
            this.A = new BitSet(this.f1114r);
            this.f1115s = new t2[this.f1114r];
            for (int i2 = 0; i2 < this.f1114r; i2++) {
                this.f1115s[i2] = new t2(this, i2);
            }
            t1();
        }
    }

    public void B2(int orientation) {
        if (orientation == 0 || orientation == 1) {
            g(null);
            if (orientation != this.f1118v) {
                this.f1118v = orientation;
                o0 tmp = this.f1116t;
                this.f1116t = this.f1117u;
                this.f1117u = tmp;
                t1();
                return;
            }
            return;
        }
        throw new IllegalArgumentException("invalid orientation.");
    }

    public void C2(boolean reverseLayout) {
        g(null);
        s2 s2Var = this.H;
        if (!(s2Var == null || s2Var.f3199i == reverseLayout)) {
            s2Var.f3199i = reverseLayout;
        }
        this.f1121y = reverseLayout;
        t1();
    }

    @Override // q0.m1
    public void g(String message) {
        if (this.H == null) {
            super.g(message);
        }
    }

    public void n2() {
        this.D.a();
        t1();
    }

    public final void y2() {
        if (this.f1118v == 1 || !o2()) {
            this.f1122z = this.f1121y;
        } else {
            this.f1122z = !this.f1121y;
        }
    }

    public boolean o2() {
        return Z() == 1;
    }

    @Override // q0.m1
    public void C1(Rect childrenBounds, int wSpec, int hSpec) {
        int width;
        int usedHeight;
        int horizontalPadding = e0() + f0();
        int verticalPadding = g0() + d0();
        if (this.f1118v == 1) {
            int usedHeight2 = childrenBounds.height() + verticalPadding;
            width = m1.n(hSpec, usedHeight2, b0());
            usedHeight = m1.n(wSpec, (this.f1119w * this.f1114r) + horizontalPadding, c0());
        } else {
            int width2 = childrenBounds.width();
            int usedWidth = width2 + horizontalPadding;
            int width3 = m1.n(wSpec, usedWidth, c0());
            usedHeight = width3;
            width = m1.n(hSpec, (this.f1119w * this.f1114r) + verticalPadding, b0());
        }
        B1(usedHeight, width);
    }

    @Override // q0.m1
    public void X0(t1 recycler, b2 state) {
        r2(recycler, state, true);
    }

    public final void r2(t1 recycler, b2 state, boolean shouldCheckForGaps) {
        s2 s2Var;
        m2 anchorInfo = this.K;
        if (!(this.H == null && this.B == -1) && state.b() == 0) {
            k1(recycler);
            anchorInfo.c();
            return;
        }
        boolean needToCheckForGaps = true;
        boolean recalculateAnchor = (anchorInfo.f3135e && this.B == -1 && this.H == null) ? false : true;
        if (recalculateAnchor) {
            anchorInfo.c();
            if (this.H != null) {
                M1(anchorInfo);
            } else {
                y2();
                anchorInfo.f3133c = this.f1122z;
            }
            H2(state, anchorInfo);
            anchorInfo.f3135e = true;
        }
        if (this.H == null && this.B == -1 && !(anchorInfo.f3133c == this.F && o2() == this.G)) {
            this.D.a();
            anchorInfo.f3134d = true;
        }
        if (J() > 0 && ((s2Var = this.H) == null || s2Var.f3194d < 1)) {
            if (anchorInfo.f3134d) {
                for (int i2 = 0; i2 < this.f1114r; i2++) {
                    this.f1115s[i2].e();
                    int i3 = anchorInfo.f3132b;
                    if (i3 != Integer.MIN_VALUE) {
                        this.f1115s[i2].v(i3);
                    }
                }
            } else if (recalculateAnchor || this.K.f3136f == null) {
                for (int i4 = 0; i4 < this.f1114r; i4++) {
                    this.f1115s[i4].b(this.f1122z, anchorInfo.f3132b);
                }
                this.K.d(this.f1115s);
            } else {
                for (int i5 = 0; i5 < this.f1114r; i5++) {
                    t2 span = this.f1115s[i5];
                    span.e();
                    span.v(this.K.f3136f[i5]);
                }
            }
        }
        w(recycler);
        this.f1120x.f2994a = false;
        this.L = false;
        J2(this.f1117u.n());
        I2(anchorInfo.f3131a, state);
        if (anchorInfo.f3133c) {
            A2(-1);
            W1(recycler, this.f1120x, state);
            A2(1);
            d0 d0Var = this.f1120x;
            d0Var.f2996c = anchorInfo.f3131a + d0Var.f2997d;
            W1(recycler, d0Var, state);
        } else {
            A2(1);
            W1(recycler, this.f1120x, state);
            A2(-1);
            d0 d0Var2 = this.f1120x;
            d0Var2.f2996c = anchorInfo.f3131a + d0Var2.f2997d;
            W1(recycler, d0Var2, state);
        }
        x2();
        if (J() > 0) {
            if (this.f1122z) {
                c2(recycler, state, true);
                d2(recycler, state, false);
            } else {
                d2(recycler, state, true);
                c2(recycler, state, false);
            }
        }
        boolean hasGaps = false;
        if (shouldCheckForGaps && !state.e()) {
            if (this.E == 0 || J() <= 0 || (!this.L && m2() == null)) {
                needToCheckForGaps = false;
            }
            if (needToCheckForGaps) {
                o1(this.O);
                if (P1()) {
                    hasGaps = true;
                }
            }
        }
        if (state.e()) {
            this.K.c();
        }
        this.F = anchorInfo.f3133c;
        this.G = o2();
        if (hasGaps) {
            this.K.c();
            r2(recycler, state, false);
        }
    }

    @Override // q0.m1
    public void Y0(b2 state) {
        super.Y0(state);
        this.B = -1;
        this.C = Integer.MIN_VALUE;
        this.H = null;
        this.K.c();
    }

    public final void x2() {
        if (this.f1117u.k() != 1073741824) {
            float maxSize = 0.0f;
            int childCount = J();
            for (int i2 = 0; i2 < childCount; i2++) {
                View child = I(i2);
                float size = this.f1117u.e(child);
                if (size >= maxSize) {
                    n2 layoutParams = (n2) child.getLayoutParams();
                    layoutParams.f();
                    maxSize = Math.max(maxSize, size);
                }
            }
            int i3 = this.f1119w;
            int desired = Math.round(this.f1114r * maxSize);
            if (this.f1117u.k() == Integer.MIN_VALUE) {
                desired = Math.min(desired, this.f1117u.n());
            }
            J2(desired);
            if (this.f1119w != i3) {
                for (int i4 = 0; i4 < childCount; i4++) {
                    View child2 = I(i4);
                    n2 lp = (n2) child2.getLayoutParams();
                    Objects.requireNonNull(lp);
                    if (!o2() || this.f1118v != 1) {
                        int i5 = lp.f3146e.f3216e;
                        int newOffset = this.f1119w * i5;
                        int prevOffset = i5 * i3;
                        if (this.f1118v == 1) {
                            child2.offsetLeftAndRight(newOffset - prevOffset);
                        } else {
                            child2.offsetTopAndBottom(newOffset - prevOffset);
                        }
                    } else {
                        int i6 = this.f1114r;
                        int i7 = lp.f3146e.f3216e;
                        child2.offsetLeftAndRight(((-((i6 - 1) - i7)) * this.f1119w) - ((-((i6 - 1) - i7)) * i3));
                    }
                }
            }
        }
    }

    public final void M1(m2 anchorInfo) {
        s2 s2Var = this.H;
        int i2 = s2Var.f3194d;
        if (i2 > 0) {
            if (i2 == this.f1114r) {
                for (int i3 = 0; i3 < this.f1114r; i3++) {
                    this.f1115s[i3].e();
                    s2 s2Var2 = this.H;
                    int line = s2Var2.f3195e[i3];
                    if (line != Integer.MIN_VALUE) {
                        if (s2Var2.f3200j) {
                            line += this.f1116t.i();
                        } else {
                            line += this.f1116t.m();
                        }
                    }
                    this.f1115s[i3].v(line);
                }
            } else {
                s2Var.j();
                s2 s2Var3 = this.H;
                s2Var3.f3192b = s2Var3.f3193c;
            }
        }
        s2 s2Var4 = this.H;
        this.G = s2Var4.f3201k;
        C2(s2Var4.f3199i);
        y2();
        s2 s2Var5 = this.H;
        int i4 = s2Var5.f3192b;
        if (i4 != -1) {
            this.B = i4;
            anchorInfo.f3133c = s2Var5.f3200j;
        } else {
            anchorInfo.f3133c = this.f1122z;
        }
        if (s2Var5.f3196f > 1) {
            q2 q2Var = this.D;
            q2Var.f3180a = s2Var5.f3197g;
            q2Var.f3181b = s2Var5.f3198h;
        }
    }

    public void H2(b2 state, m2 anchorInfo) {
        if (!G2(state, anchorInfo)) {
            F2(state, anchorInfo);
        }
    }

    public final boolean F2(b2 state, m2 anchorInfo) {
        int i2;
        if (this.F) {
            i2 = b2(state.b());
        } else {
            i2 = X1(state.b());
        }
        anchorInfo.f3131a = i2;
        anchorInfo.f3132b = Integer.MIN_VALUE;
        return true;
    }

    public boolean G2(b2 state, m2 anchorInfo) {
        int i2;
        int i3;
        boolean z2 = false;
        if (state.e() || (i2 = this.B) == -1) {
            return false;
        }
        if (i2 < 0 || i2 >= state.b()) {
            this.B = -1;
            this.C = Integer.MIN_VALUE;
            return false;
        }
        s2 s2Var = this.H;
        if (s2Var == null || s2Var.f3192b == -1 || s2Var.f3194d < 1) {
            View child = C(this.B);
            if (child != null) {
                anchorInfo.f3131a = this.f1122z ? f2() : e2();
                if (this.C != Integer.MIN_VALUE) {
                    if (anchorInfo.f3133c) {
                        int target = this.f1116t.i() - this.C;
                        anchorInfo.f3132b = target - this.f1116t.d(child);
                    } else {
                        int target2 = this.f1116t.m() + this.C;
                        anchorInfo.f3132b = target2 - this.f1116t.g(child);
                    }
                    return true;
                }
                int childSize = this.f1116t.e(child);
                if (childSize > this.f1116t.n()) {
                    if (anchorInfo.f3133c) {
                        i3 = this.f1116t.i();
                    } else {
                        i3 = this.f1116t.m();
                    }
                    anchorInfo.f3132b = i3;
                    return true;
                }
                int startGap = this.f1116t.g(child) - this.f1116t.m();
                if (startGap < 0) {
                    anchorInfo.f3132b = -startGap;
                    return true;
                }
                int endGap = this.f1116t.i() - this.f1116t.d(child);
                if (endGap < 0) {
                    anchorInfo.f3132b = endGap;
                    return true;
                }
                anchorInfo.f3132b = Integer.MIN_VALUE;
            } else {
                int i4 = this.B;
                anchorInfo.f3131a = i4;
                int i5 = this.C;
                if (i5 == Integer.MIN_VALUE) {
                    int position = O1(i4);
                    if (position == 1) {
                        z2 = true;
                    }
                    anchorInfo.f3133c = z2;
                    anchorInfo.a();
                } else {
                    anchorInfo.b(i5);
                }
                anchorInfo.f3134d = true;
            }
        } else {
            anchorInfo.f3132b = Integer.MIN_VALUE;
            anchorInfo.f3131a = this.B;
        }
        return true;
    }

    public void J2(int totalSpace) {
        this.f1119w = totalSpace / this.f1114r;
        this.I = View.MeasureSpec.makeMeasureSpec(totalSpace, this.f1117u.k());
    }

    @Override // q0.m1
    public boolean L1() {
        return this.H == null;
    }

    @Override // q0.m1
    public int r(b2 state) {
        return S1(state);
    }

    public final int S1(b2 state) {
        if (J() == 0) {
            return 0;
        }
        return h2.b(state, this.f1116t, Z1(!this.M), Y1(!this.M), this, this.M, this.f1122z);
    }

    @Override // q0.m1
    public int u(b2 state) {
        return S1(state);
    }

    @Override // q0.m1
    public int q(b2 state) {
        return R1(state);
    }

    public final int R1(b2 state) {
        if (J() == 0) {
            return 0;
        }
        return h2.a(state, this.f1116t, Z1(!this.M), Y1(!this.M), this, this.M);
    }

    @Override // q0.m1
    public int t(b2 state) {
        return R1(state);
    }

    @Override // q0.m1
    public int s(b2 state) {
        return T1(state);
    }

    public final int T1(b2 state) {
        if (J() == 0) {
            return 0;
        }
        return h2.c(state, this.f1116t, Z1(!this.M), Y1(!this.M), this, this.M);
    }

    @Override // q0.m1
    public int v(b2 state) {
        return T1(state);
    }

    public final void q2(View child, n2 lp, boolean alreadyMeasured) {
        Objects.requireNonNull(lp);
        if (this.f1118v == 1) {
            p2(child, m1.K(this.f1119w, p0(), 0, ((ViewGroup.MarginLayoutParams) lp).width, false), m1.K(W(), X(), g0() + d0(), ((ViewGroup.MarginLayoutParams) lp).height, true), alreadyMeasured);
        } else {
            p2(child, m1.K(o0(), p0(), e0() + f0(), ((ViewGroup.MarginLayoutParams) lp).width, true), m1.K(this.f1119w, X(), 0, ((ViewGroup.MarginLayoutParams) lp).height, false), alreadyMeasured);
        }
    }

    public final void p2(View child, int widthSpec, int heightSpec, boolean alreadyMeasured) {
        boolean measure;
        j(child, this.J);
        n2 lp = (n2) child.getLayoutParams();
        int i2 = ((ViewGroup.MarginLayoutParams) lp).leftMargin;
        Rect rect = this.J;
        int widthSpec2 = L2(widthSpec, i2 + rect.left, ((ViewGroup.MarginLayoutParams) lp).rightMargin + rect.right);
        int i3 = ((ViewGroup.MarginLayoutParams) lp).topMargin;
        Rect rect2 = this.J;
        int heightSpec2 = L2(heightSpec, i3 + rect2.top, ((ViewGroup.MarginLayoutParams) lp).bottomMargin + rect2.bottom);
        if (alreadyMeasured) {
            measure = H1(child, widthSpec2, heightSpec2, lp);
        } else {
            measure = F1(child, widthSpec2, heightSpec2, lp);
        }
        if (measure) {
            child.measure(widthSpec2, heightSpec2);
        }
    }

    public final int L2(int spec, int startInset, int endInset) {
        if (startInset == 0 && endInset == 0) {
            return spec;
        }
        int mode = View.MeasureSpec.getMode(spec);
        if (mode == Integer.MIN_VALUE || mode == 1073741824) {
            return View.MeasureSpec.makeMeasureSpec(Math.max(0, (View.MeasureSpec.getSize(spec) - startInset) - endInset), mode);
        }
        return spec;
    }

    @Override // q0.m1
    public void c1(Parcelable state) {
        if (state instanceof s2) {
            this.H = (s2) state;
            t1();
        }
    }

    @Override // q0.m1
    public Parcelable d1() {
        int line;
        int[] iArr;
        if (this.H != null) {
            return new s2(this.H);
        }
        s2 state = new s2();
        state.f3199i = this.f1121y;
        state.f3200j = this.F;
        state.f3201k = this.G;
        q2 q2Var = this.D;
        if (q2Var == null || (iArr = q2Var.f3180a) == null) {
            state.f3196f = 0;
        } else {
            state.f3197g = iArr;
            state.f3196f = iArr.length;
            state.f3198h = q2Var.f3181b;
        }
        if (J() > 0) {
            state.f3192b = this.F ? f2() : e2();
            state.f3193c = a2();
            int i2 = this.f1114r;
            state.f3194d = i2;
            state.f3195e = new int[i2];
            for (int i3 = 0; i3 < this.f1114r; i3++) {
                if (this.F) {
                    line = this.f1115s[i3].l(Integer.MIN_VALUE);
                    if (line != Integer.MIN_VALUE) {
                        line -= this.f1116t.i();
                    }
                } else {
                    line = this.f1115s[i3].p(Integer.MIN_VALUE);
                    if (line != Integer.MIN_VALUE) {
                        line -= this.f1116t.m();
                    }
                }
                state.f3195e[i3] = line;
            }
        } else {
            state.f3192b = -1;
            state.f3193c = -1;
            state.f3194d = 0;
        }
        return state;
    }

    @Override // q0.m1
    public void P0(t1 recycler, b2 state, View host, f info) {
        ViewGroup.LayoutParams lp = host.getLayoutParams();
        if (!(lp instanceof n2)) {
            O0(host, info);
            return;
        }
        n2 sglp = (n2) lp;
        if (this.f1118v == 0) {
            int e2 = sglp.e();
            Objects.requireNonNull(sglp);
            info.Z(e.a(e2, 1, -1, -1, false, false));
            return;
        }
        int e3 = sglp.e();
        Objects.requireNonNull(sglp);
        info.Z(e.a(-1, -1, e3, 1, false, false));
    }

    @Override // q0.m1
    public void K0(AccessibilityEvent event) {
        super.K0(event);
        if (J() > 0) {
            View start = Z1(false);
            View end = Y1(false);
            if (start != null && end != null) {
                int startPos = h0(start);
                int endPos = h0(end);
                if (startPos < endPos) {
                    event.setFromIndex(startPos);
                    event.setToIndex(endPos);
                    return;
                }
                event.setFromIndex(endPos);
                event.setToIndex(startPos);
            }
        }
    }

    public int a2() {
        View first = this.f1122z ? Y1(true) : Z1(true);
        if (first == null) {
            return -1;
        }
        return h0(first);
    }

    @Override // q0.m1
    public int k0(t1 recycler, b2 state) {
        if (this.f1118v == 0) {
            return this.f1114r;
        }
        return super.k0(recycler, state);
    }

    @Override // q0.m1
    public int N(t1 recycler, b2 state) {
        if (this.f1118v == 1) {
            return this.f1114r;
        }
        return super.N(recycler, state);
    }

    public View Z1(boolean fullyVisible) {
        int boundsStart = this.f1116t.m();
        int boundsEnd = this.f1116t.i();
        int limit = J();
        View partiallyVisible = null;
        for (int i2 = 0; i2 < limit; i2++) {
            View child = I(i2);
            int childStart = this.f1116t.g(child);
            int childEnd = this.f1116t.d(child);
            if (childEnd > boundsStart && childStart < boundsEnd) {
                if (childStart >= boundsStart || !fullyVisible) {
                    return child;
                }
                if (partiallyVisible == null) {
                    partiallyVisible = child;
                }
            }
        }
        return partiallyVisible;
    }

    public View Y1(boolean fullyVisible) {
        int boundsStart = this.f1116t.m();
        int boundsEnd = this.f1116t.i();
        View partiallyVisible = null;
        for (int i2 = J() - 1; i2 >= 0; i2--) {
            View child = I(i2);
            int childStart = this.f1116t.g(child);
            int childEnd = this.f1116t.d(child);
            if (childEnd > boundsStart && childStart < boundsEnd) {
                if (childEnd <= boundsEnd || !fullyVisible) {
                    return child;
                }
                if (partiallyVisible == null) {
                    partiallyVisible = child;
                }
            }
        }
        return partiallyVisible;
    }

    public final void c2(t1 recycler, b2 state, boolean canOffsetChildren) {
        int gap;
        int maxEndLine = g2(Integer.MIN_VALUE);
        if (maxEndLine != Integer.MIN_VALUE && (gap = this.f1116t.i() - maxEndLine) > 0) {
            int fixOffset = -z2(-gap, recycler, state);
            int gap2 = gap - fixOffset;
            if (canOffsetChildren && gap2 > 0) {
                this.f1116t.r(gap2);
            }
        }
    }

    public final void d2(t1 recycler, b2 state, boolean canOffsetChildren) {
        int gap;
        int minStartLine = j2(Integer.MAX_VALUE);
        if (minStartLine != Integer.MAX_VALUE && (gap = minStartLine - this.f1116t.m()) > 0) {
            int fixOffset = z2(gap, recycler, state);
            int gap2 = gap - fixOffset;
            if (canOffsetChildren && gap2 > 0) {
                this.f1116t.r(-gap2);
            }
        }
    }

    public final void I2(int anchorPosition, b2 state) {
        int targetPos;
        d0 d0Var = this.f1120x;
        boolean z2 = false;
        d0Var.f2995b = 0;
        d0Var.f2996c = anchorPosition;
        int startExtra = 0;
        int endExtra = 0;
        if (x0() && (targetPos = state.c()) != -1) {
            if (this.f1122z == (targetPos < anchorPosition)) {
                endExtra = this.f1116t.n();
            } else {
                startExtra = this.f1116t.n();
            }
        }
        boolean clipToPadding = M();
        if (clipToPadding) {
            this.f1120x.f2999f = this.f1116t.m() - startExtra;
            this.f1120x.f3000g = this.f1116t.i() + endExtra;
        } else {
            this.f1120x.f3000g = this.f1116t.h() + endExtra;
            this.f1120x.f2999f = -startExtra;
        }
        d0 d0Var2 = this.f1120x;
        d0Var2.f3001h = false;
        d0Var2.f2994a = true;
        if (this.f1116t.k() == 0 && this.f1116t.h() == 0) {
            z2 = true;
        }
        d0Var2.f3002i = z2;
    }

    public final void A2(int direction) {
        d0 d0Var = this.f1120x;
        d0Var.f2998e = direction;
        int i2 = 1;
        if (this.f1122z != (direction == -1)) {
            i2 = -1;
        }
        d0Var.f2997d = i2;
    }

    @Override // q0.m1
    public void C0(int dx) {
        super.C0(dx);
        for (int i2 = 0; i2 < this.f1114r; i2++) {
            this.f1115s[i2].r(dx);
        }
    }

    @Override // q0.m1
    public void D0(int dy) {
        super.D0(dy);
        for (int i2 = 0; i2 < this.f1114r; i2++) {
            this.f1115s[i2].r(dy);
        }
    }

    @Override // q0.m1
    public void U0(RecyclerView recyclerView, int positionStart, int itemCount) {
        l2(positionStart, itemCount, 2);
    }

    @Override // q0.m1
    public void R0(RecyclerView recyclerView, int positionStart, int itemCount) {
        l2(positionStart, itemCount, 1);
    }

    @Override // q0.m1
    public void S0(RecyclerView recyclerView) {
        this.D.a();
        t1();
    }

    @Override // q0.m1
    public void T0(RecyclerView recyclerView, int from, int to, int itemCount) {
        l2(from, to, 8);
    }

    @Override // q0.m1
    public void W0(RecyclerView recyclerView, int positionStart, int itemCount, Object payload) {
        l2(positionStart, itemCount, 4);
    }

    public final void l2(int positionStart, int itemCountOrToPosition, int cmd) {
        int affectedRangeStart;
        int affectedRangeEnd;
        int minPosition = this.f1122z ? f2() : e2();
        if (cmd != 8) {
            affectedRangeStart = positionStart;
            affectedRangeEnd = positionStart + itemCountOrToPosition;
        } else if (positionStart < itemCountOrToPosition) {
            affectedRangeEnd = itemCountOrToPosition + 1;
            affectedRangeStart = positionStart;
        } else {
            affectedRangeEnd = positionStart + 1;
            affectedRangeStart = itemCountOrToPosition;
        }
        this.D.g(affectedRangeStart);
        switch (cmd) {
            case 1:
                this.D.i(positionStart, itemCountOrToPosition);
                break;
            case 2:
                this.D.j(positionStart, itemCountOrToPosition);
                break;
            case 8:
                this.D.j(positionStart, 1);
                this.D.i(itemCountOrToPosition, 1);
                break;
        }
        if (affectedRangeEnd > minPosition) {
            int maxPosition = this.f1122z ? e2() : f2();
            if (affectedRangeStart <= maxPosition) {
                t1();
            }
        }
    }

    public final int W1(t1 recycler, d0 layoutState, b2 state) {
        int targetLine;
        int defaultNewViewLine;
        int diff;
        t2 currentSpan;
        int end;
        int start;
        int otherStart;
        int otherEnd;
        t2 currentSpan2;
        int i2 = 1;
        this.A.set(0, this.f1114r, true);
        if (this.f1120x.f3002i) {
            if (layoutState.f2998e == 1) {
                targetLine = Integer.MAX_VALUE;
            } else {
                targetLine = Integer.MIN_VALUE;
            }
        } else if (layoutState.f2998e == 1) {
            targetLine = layoutState.f3000g + layoutState.f2995b;
        } else {
            targetLine = layoutState.f2999f - layoutState.f2995b;
        }
        E2(layoutState.f2998e, targetLine);
        if (this.f1122z) {
            defaultNewViewLine = this.f1116t.i();
        } else {
            defaultNewViewLine = this.f1116t.m();
        }
        boolean added = false;
        while (layoutState.a(state) && (this.f1120x.f3002i || !this.A.isEmpty())) {
            View view = layoutState.b(recycler);
            n2 lp = (n2) view.getLayoutParams();
            int position = lp.a();
            int spanIndex = this.D.f(position);
            int start2 = spanIndex == -1 ? i2 : 0;
            if (start2 != 0) {
                Objects.requireNonNull(lp);
                t2 currentSpan3 = k2(layoutState);
                this.D.m(position, currentSpan3);
                currentSpan = currentSpan3;
            } else {
                currentSpan = this.f1115s[spanIndex];
            }
            lp.f3146e = currentSpan;
            if (layoutState.f2998e == i2) {
                d(view);
            } else {
                e(view, 0);
            }
            q2(view, lp, false);
            if (layoutState.f2998e == i2) {
                Objects.requireNonNull(lp);
                start = currentSpan.l(defaultNewViewLine);
                end = this.f1116t.e(view) + start;
                if (start2 != 0) {
                    Objects.requireNonNull(lp);
                }
            } else {
                Objects.requireNonNull(lp);
                end = currentSpan.p(defaultNewViewLine);
                start = end - this.f1116t.e(view);
                if (start2 != 0) {
                    Objects.requireNonNull(lp);
                }
            }
            Objects.requireNonNull(lp);
            N1(view, lp, layoutState);
            if (!o2() || this.f1118v != i2) {
                Objects.requireNonNull(lp);
                int otherStart2 = (currentSpan.f3216e * this.f1119w) + this.f1117u.m();
                otherEnd = this.f1117u.e(view) + otherStart2;
                otherStart = otherStart2;
            } else {
                Objects.requireNonNull(lp);
                int otherEnd2 = this.f1117u.i() - (((this.f1114r - i2) - currentSpan.f3216e) * this.f1119w);
                otherStart = otherEnd2 - this.f1117u.e(view);
                otherEnd = otherEnd2;
            }
            if (this.f1118v == i2) {
                currentSpan2 = currentSpan;
                z0(view, otherStart, start, otherEnd, end);
            } else {
                currentSpan2 = currentSpan;
                z0(view, start, otherStart, end, otherEnd);
            }
            Objects.requireNonNull(lp);
            K2(currentSpan2, this.f1120x.f2998e, targetLine);
            u2(recycler, this.f1120x);
            if (this.f1120x.f3001h && view.hasFocusable()) {
                Objects.requireNonNull(lp);
                this.A.set(currentSpan2.f3216e, false);
            }
            added = true;
            i2 = 1;
        }
        if (!added) {
            u2(recycler, this.f1120x);
        }
        if (this.f1120x.f2998e == -1) {
            int minStart = j2(this.f1116t.m());
            diff = this.f1116t.m() - minStart;
        } else {
            int maxEnd = g2(this.f1116t.i());
            diff = maxEnd - this.f1116t.i();
        }
        if (diff > 0) {
            return Math.min(layoutState.f2995b, diff);
        }
        return 0;
    }

    public final void N1(View view, n2 lp, d0 layoutState) {
        if (layoutState.f2998e == 1) {
            Objects.requireNonNull(lp);
            lp.f3146e.a(view);
            return;
        }
        Objects.requireNonNull(lp);
        lp.f3146e.u(view);
    }

    public final void u2(t1 recycler, d0 layoutState) {
        int line;
        int line2;
        if (layoutState.f2994a && !layoutState.f3002i) {
            if (layoutState.f2995b == 0) {
                if (layoutState.f2998e == -1) {
                    v2(recycler, layoutState.f3000g);
                } else {
                    w2(recycler, layoutState.f2999f);
                }
            } else if (layoutState.f2998e == -1) {
                int i2 = layoutState.f2999f;
                int scrolled = i2 - h2(i2);
                if (scrolled < 0) {
                    line2 = layoutState.f3000g;
                } else {
                    int line3 = layoutState.f3000g;
                    line2 = line3 - Math.min(scrolled, layoutState.f2995b);
                }
                v2(recycler, line2);
            } else {
                int scrolled2 = i2(layoutState.f3000g) - layoutState.f3000g;
                if (scrolled2 < 0) {
                    line = layoutState.f2999f;
                } else {
                    int line4 = layoutState.f2999f;
                    line = line4 + Math.min(scrolled2, layoutState.f2995b);
                }
                w2(recycler, line);
            }
        }
    }

    public final void E2(int layoutDir, int targetLine) {
        for (int i2 = 0; i2 < this.f1114r; i2++) {
            if (!this.f1115s[i2].f3212a.isEmpty()) {
                K2(this.f1115s[i2], layoutDir, targetLine);
            }
        }
    }

    public final void K2(t2 span, int layoutDir, int targetLine) {
        int deletedSize = span.j();
        if (layoutDir == -1) {
            int line = span.o();
            if (line + deletedSize <= targetLine) {
                this.A.set(span.f3216e, false);
                return;
            }
            return;
        }
        int line2 = span.k();
        if (line2 - deletedSize >= targetLine) {
            this.A.set(span.f3216e, false);
        }
    }

    public final int h2(int def) {
        int maxStart = this.f1115s[0].p(def);
        for (int i2 = 1; i2 < this.f1114r; i2++) {
            int spanStart = this.f1115s[i2].p(def);
            if (spanStart > maxStart) {
                maxStart = spanStart;
            }
        }
        return maxStart;
    }

    public final int j2(int def) {
        int minStart = this.f1115s[0].p(def);
        for (int i2 = 1; i2 < this.f1114r; i2++) {
            int spanStart = this.f1115s[i2].p(def);
            if (spanStart < minStart) {
                minStart = spanStart;
            }
        }
        return minStart;
    }

    public final int g2(int def) {
        int maxEnd = this.f1115s[0].l(def);
        for (int i2 = 1; i2 < this.f1114r; i2++) {
            int spanEnd = this.f1115s[i2].l(def);
            if (spanEnd > maxEnd) {
                maxEnd = spanEnd;
            }
        }
        return maxEnd;
    }

    public final int i2(int def) {
        int minEnd = this.f1115s[0].l(def);
        for (int i2 = 1; i2 < this.f1114r; i2++) {
            int spanEnd = this.f1115s[i2].l(def);
            if (spanEnd < minEnd) {
                minEnd = spanEnd;
            }
        }
        return minEnd;
    }

    public final void w2(t1 recycler, int line) {
        while (J() > 0) {
            View child = I(0);
            if (this.f1116t.d(child) <= line && this.f1116t.p(child) <= line) {
                n2 lp = (n2) child.getLayoutParams();
                Objects.requireNonNull(lp);
                if (lp.f3146e.f3212a.size() != 1) {
                    lp.f3146e.t();
                    m1(child, recycler);
                } else {
                    return;
                }
            } else {
                return;
            }
        }
    }

    public final void v2(t1 recycler, int line) {
        int childCount = J();
        for (int i2 = childCount - 1; i2 >= 0; i2--) {
            View child = I(i2);
            if (this.f1116t.g(child) >= line && this.f1116t.q(child) >= line) {
                n2 lp = (n2) child.getLayoutParams();
                Objects.requireNonNull(lp);
                if (lp.f3146e.f3212a.size() != 1) {
                    lp.f3146e.s();
                    m1(child, recycler);
                } else {
                    return;
                }
            } else {
                return;
            }
        }
    }

    public final boolean s2(int layoutDir) {
        if (this.f1118v == 0) {
            return (layoutDir == -1) != this.f1122z;
        }
        return ((layoutDir == -1) == this.f1122z) == o2();
    }

    public final t2 k2(d0 layoutState) {
        int diff;
        int endIndex;
        int startIndex;
        boolean preferLastSpan = s2(layoutState.f2998e);
        if (preferLastSpan) {
            startIndex = this.f1114r - 1;
            endIndex = -1;
            diff = -1;
        } else {
            startIndex = 0;
            endIndex = this.f1114r;
            diff = 1;
        }
        if (layoutState.f2998e == 1) {
            t2 min = null;
            int minLine = Integer.MAX_VALUE;
            int defaultLine = this.f1116t.m();
            for (int i2 = startIndex; i2 != endIndex; i2 += diff) {
                t2 other = this.f1115s[i2];
                int otherLine = other.l(defaultLine);
                if (otherLine < minLine) {
                    min = other;
                    minLine = otherLine;
                }
            }
            return min;
        }
        t2 max = null;
        int maxLine = Integer.MIN_VALUE;
        int defaultLine2 = this.f1116t.i();
        for (int i3 = startIndex; i3 != endIndex; i3 += diff) {
            t2 other2 = this.f1115s[i3];
            int otherLine2 = other2.p(defaultLine2);
            if (otherLine2 > maxLine) {
                max = other2;
                maxLine = otherLine2;
            }
        }
        return max;
    }

    @Override // q0.m1
    public boolean l() {
        return this.f1118v == 1;
    }

    @Override // q0.m1
    public boolean k() {
        return this.f1118v == 0;
    }

    @Override // q0.m1
    public int w1(int dx, t1 recycler, b2 state) {
        return z2(dx, recycler, state);
    }

    @Override // q0.m1
    public int y1(int dy, t1 recycler, b2 state) {
        return z2(dy, recycler, state);
    }

    public final int O1(int position) {
        if (J() == 0) {
            return this.f1122z ? 1 : -1;
        }
        int firstChildPos = e2();
        return (position < firstChildPos) != this.f1122z ? -1 : 1;
    }

    @Override // q0.z1
    public PointF a(int targetPosition) {
        int direction = O1(targetPosition);
        PointF outVector = new PointF();
        if (direction == 0) {
            return null;
        }
        if (this.f1118v == 0) {
            outVector.x = direction;
            outVector.y = 0.0f;
        } else {
            outVector.x = 0.0f;
            outVector.y = direction;
        }
        return outVector;
    }

    @Override // q0.m1
    public void I1(RecyclerView recyclerView, b2 state, int position) {
        j0 scroller = new j0(recyclerView.getContext());
        scroller.p(position);
        J1(scroller);
    }

    @Override // q0.m1
    public void x1(int position) {
        s2 s2Var = this.H;
        if (!(s2Var == null || s2Var.f3192b == position)) {
            s2Var.i();
        }
        this.B = position;
        this.C = Integer.MIN_VALUE;
        t1();
    }

    @Override // q0.m1
    public void o(int dx, int dy, b2 state, k1 layoutPrefetchRegistry) {
        int distance;
        int delta = this.f1118v == 0 ? dx : dy;
        if (!(J() == 0 || delta == 0)) {
            t2(delta, state);
            int[] iArr = this.N;
            if (iArr == null || iArr.length < this.f1114r) {
                this.N = new int[this.f1114r];
            }
            int itemPrefetchCount = 0;
            for (int i2 = 0; i2 < this.f1114r; i2++) {
                d0 d0Var = this.f1120x;
                if (d0Var.f2997d == -1) {
                    int i3 = d0Var.f2999f;
                    distance = i3 - this.f1115s[i2].p(i3);
                } else {
                    distance = this.f1115s[i2].l(d0Var.f3000g) - this.f1120x.f3000g;
                }
                if (distance >= 0) {
                    this.N[itemPrefetchCount] = distance;
                    itemPrefetchCount++;
                }
            }
            Arrays.sort(this.N, 0, itemPrefetchCount);
            for (int i4 = 0; i4 < itemPrefetchCount && this.f1120x.a(state); i4++) {
                ((x) layoutPrefetchRegistry).a(this.f1120x.f2996c, this.N[i4]);
                d0 d0Var2 = this.f1120x;
                d0Var2.f2996c += d0Var2.f2997d;
            }
        }
    }

    public void t2(int delta, b2 state) {
        int referenceChildPosition;
        int layoutDir;
        if (delta > 0) {
            layoutDir = 1;
            referenceChildPosition = f2();
        } else {
            layoutDir = -1;
            referenceChildPosition = e2();
        }
        this.f1120x.f2994a = true;
        I2(referenceChildPosition, state);
        A2(layoutDir);
        d0 d0Var = this.f1120x;
        d0Var.f2996c = d0Var.f2997d + referenceChildPosition;
        d0Var.f2995b = Math.abs(delta);
    }

    public int z2(int dt, t1 recycler, b2 state) {
        int totalScroll;
        if (J() == 0 || dt == 0) {
            return 0;
        }
        t2(dt, state);
        int consumed = W1(recycler, this.f1120x, state);
        int available = this.f1120x.f2995b;
        if (available < consumed) {
            totalScroll = dt;
        } else if (dt < 0) {
            totalScroll = -consumed;
        } else {
            totalScroll = consumed;
        }
        this.f1116t.r(-totalScroll);
        this.F = this.f1122z;
        d0 d0Var = this.f1120x;
        d0Var.f2995b = 0;
        u2(recycler, d0Var);
        return totalScroll;
    }

    public int f2() {
        int childCount = J();
        if (childCount == 0) {
            return 0;
        }
        return h0(I(childCount - 1));
    }

    public int e2() {
        int childCount = J();
        if (childCount == 0) {
            return 0;
        }
        return h0(I(0));
    }

    public final int X1(int itemCount) {
        int limit = J();
        for (int i2 = 0; i2 < limit; i2++) {
            View view = I(i2);
            int position = h0(view);
            if (position >= 0 && position < itemCount) {
                return position;
            }
        }
        return 0;
    }

    public final int b2(int itemCount) {
        for (int i2 = J() - 1; i2 >= 0; i2--) {
            View view = I(i2);
            int position = h0(view);
            if (position >= 0 && position < itemCount) {
                return position;
            }
        }
        return 0;
    }

    @Override // q0.m1
    public n1 D() {
        if (this.f1118v == 0) {
            return new n2(-2, -1);
        }
        return new n2(-1, -2);
    }

    @Override // q0.m1
    public n1 E(Context c2, AttributeSet attrs) {
        return new n2(c2, attrs);
    }

    @Override // q0.m1
    public n1 F(ViewGroup.LayoutParams lp) {
        if (lp instanceof ViewGroup.MarginLayoutParams) {
            return new n2((ViewGroup.MarginLayoutParams) lp);
        }
        return new n2(lp);
    }

    @Override // q0.m1
    public boolean m(n1 lp) {
        return lp instanceof n2;
    }

    @Override // q0.m1
    public View J0(View focused, int direction, t1 recycler, b2 state) {
        View directChild;
        int referenceChildPosition;
        boolean z2;
        int i2;
        int i3;
        int i4;
        View view;
        if (J() == 0 || (directChild = B(focused)) == null) {
            return null;
        }
        y2();
        int layoutDir = U1(direction);
        if (layoutDir == Integer.MIN_VALUE) {
            return null;
        }
        n2 prevFocusLayoutParams = (n2) directChild.getLayoutParams();
        Objects.requireNonNull(prevFocusLayoutParams);
        t2 prevFocusSpan = prevFocusLayoutParams.f3146e;
        if (layoutDir == 1) {
            referenceChildPosition = f2();
        } else {
            referenceChildPosition = e2();
        }
        I2(referenceChildPosition, state);
        A2(layoutDir);
        d0 d0Var = this.f1120x;
        d0Var.f2996c = d0Var.f2997d + referenceChildPosition;
        d0Var.f2995b = (int) (this.f1116t.n() * 0.33333334f);
        d0 d0Var2 = this.f1120x;
        d0Var2.f3001h = true;
        boolean shouldSearchFromStart = false;
        d0Var2.f2994a = false;
        W1(recycler, d0Var2, state);
        this.F = this.f1122z;
        if (!(0 != 0 || (view = prevFocusSpan.m(referenceChildPosition, layoutDir)) == null || view == directChild)) {
            return view;
        }
        if (s2(layoutDir)) {
            for (int i5 = this.f1114r - 1; i5 >= 0; i5--) {
                View view2 = this.f1115s[i5].m(referenceChildPosition, layoutDir);
                if (!(view2 == null || view2 == directChild)) {
                    return view2;
                }
            }
        } else {
            for (int i6 = 0; i6 < this.f1114r; i6++) {
                View view3 = this.f1115s[i6].m(referenceChildPosition, layoutDir);
                if (!(view3 == null || view3 == directChild)) {
                    return view3;
                }
            }
        }
        boolean z3 = !this.f1121y;
        if (layoutDir == -1) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z3 == z2) {
            shouldSearchFromStart = true;
        }
        if (0 == 0) {
            if (shouldSearchFromStart) {
                i4 = prevFocusSpan.f();
            } else {
                i4 = prevFocusSpan.g();
            }
            View unfocusableCandidate = C(i4);
            if (!(unfocusableCandidate == null || unfocusableCandidate == directChild)) {
                return unfocusableCandidate;
            }
        }
        if (s2(layoutDir)) {
            for (int i7 = this.f1114r - 1; i7 >= 0; i7--) {
                if (i7 != prevFocusSpan.f3216e) {
                    if (shouldSearchFromStart) {
                        i3 = this.f1115s[i7].f();
                    } else {
                        i3 = this.f1115s[i7].g();
                    }
                    View unfocusableCandidate2 = C(i3);
                    if (!(unfocusableCandidate2 == null || unfocusableCandidate2 == directChild)) {
                        return unfocusableCandidate2;
                    }
                }
            }
        } else {
            for (int i8 = 0; i8 < this.f1114r; i8++) {
                if (shouldSearchFromStart) {
                    i2 = this.f1115s[i8].f();
                } else {
                    i2 = this.f1115s[i8].g();
                }
                View unfocusableCandidate3 = C(i2);
                if (!(unfocusableCandidate3 == null || unfocusableCandidate3 == directChild)) {
                    return unfocusableCandidate3;
                }
            }
        }
        return null;
    }

    public final int U1(int focusDirection) {
        switch (focusDirection) {
            case 1:
                return (this.f1118v != 1 && o2()) ? 1 : -1;
            case 2:
                return (this.f1118v != 1 && o2()) ? -1 : 1;
            case 17:
                return this.f1118v == 0 ? -1 : Integer.MIN_VALUE;
            case 33:
                return this.f1118v == 1 ? -1 : Integer.MIN_VALUE;
            case 66:
                return this.f1118v == 0 ? 1 : Integer.MIN_VALUE;
            case 130:
                return this.f1118v == 1 ? 1 : Integer.MIN_VALUE;
            default:
                return Integer.MIN_VALUE;
        }
    }
}
