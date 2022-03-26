package androidx.recyclerview.widget;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import g0.e;
import g0.f;
import java.util.Arrays;
import q0.a0;
import q0.b0;
import q0.b2;
import q0.c0;
import q0.e0;
import q0.f0;
import q0.g0;
import q0.k1;
import q0.l1;
import q0.m1;
import q0.n1;
import q0.t1;
import q0.x;

/* JADX WARN: Classes with same name are omitted:
  
 */
/* loaded from: classes.dex */
public class GridLayoutManager extends LinearLayoutManager {
    public int[] I;
    public View[] J;
    public boolean G = false;
    public int H = -1;
    public final SparseIntArray K = new SparseIntArray();
    public final SparseIntArray L = new SparseIntArray();
    public c0 M = new a0();
    public final Rect N = new Rect();

    public GridLayoutManager(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
        l1 properties = m1.i0(context, attrs, defStyleAttr, defStyleRes);
        a3(properties.f3106b);
    }

    public GridLayoutManager(Context context, int spanCount, int orientation, boolean reverseLayout) {
        super(orientation, reverseLayout);
        a3(spanCount);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public void D2(boolean stackFromEnd) {
        if (!stackFromEnd) {
            super.D2(false);
            return;
        }
        throw new UnsupportedOperationException("GridLayoutManager does not support stack from end. Consider using reverse layout");
    }

    @Override // q0.m1
    public int k0(t1 recycler, b2 state) {
        if (this.f1054r == 0) {
            return this.H;
        }
        if (state.b() < 1) {
            return 0;
        }
        return U2(recycler, state, state.b() - 1) + 1;
    }

    @Override // q0.m1
    public int N(t1 recycler, b2 state) {
        if (this.f1054r == 1) {
            return this.H;
        }
        if (state.b() < 1) {
            return 0;
        }
        return U2(recycler, state, state.b() - 1) + 1;
    }

    @Override // q0.m1
    public void P0(t1 recycler, b2 state, View host, f info) {
        ViewGroup.LayoutParams lp = host.getLayoutParams();
        if (!(lp instanceof b0)) {
            O0(host, info);
            return;
        }
        b0 glp = (b0) lp;
        int spanGroupIndex = U2(recycler, state, glp.a());
        if (this.f1054r == 0) {
            info.Z(e.a(glp.e(), glp.f(), spanGroupIndex, 1, false, false));
        } else {
            info.Z(e.a(spanGroupIndex, 1, glp.e(), glp.f(), false, false));
        }
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, q0.m1
    public void X0(t1 recycler, b2 state) {
        if (state.e()) {
            N2();
        }
        super.X0(recycler, state);
        Q2();
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, q0.m1
    public void Y0(b2 state) {
        super.Y0(state);
        this.G = false;
    }

    public final void Q2() {
        this.K.clear();
        this.L.clear();
    }

    public final void N2() {
        int childCount = J();
        for (int i2 = 0; i2 < childCount; i2++) {
            b0 lp = (b0) I(i2).getLayoutParams();
            int viewPosition = lp.a();
            this.K.put(viewPosition, lp.f());
            this.L.put(viewPosition, lp.e());
        }
    }

    @Override // q0.m1
    public void R0(RecyclerView recyclerView, int positionStart, int itemCount) {
        this.M.g();
        this.M.f();
    }

    @Override // q0.m1
    public void S0(RecyclerView recyclerView) {
        this.M.g();
        this.M.f();
    }

    @Override // q0.m1
    public void U0(RecyclerView recyclerView, int positionStart, int itemCount) {
        this.M.g();
        this.M.f();
    }

    @Override // q0.m1
    public void W0(RecyclerView recyclerView, int positionStart, int itemCount, Object payload) {
        this.M.g();
        this.M.f();
    }

    @Override // q0.m1
    public void T0(RecyclerView recyclerView, int from, int to, int itemCount) {
        this.M.g();
        this.M.f();
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, q0.m1
    public n1 D() {
        if (this.f1054r == 0) {
            return new b0(-2, -1);
        }
        return new b0(-1, -2);
    }

    @Override // q0.m1
    public n1 E(Context c2, AttributeSet attrs) {
        return new b0(c2, attrs);
    }

    @Override // q0.m1
    public n1 F(ViewGroup.LayoutParams lp) {
        if (lp instanceof ViewGroup.MarginLayoutParams) {
            return new b0((ViewGroup.MarginLayoutParams) lp);
        }
        return new b0(lp);
    }

    @Override // q0.m1
    public boolean m(n1 lp) {
        return lp instanceof b0;
    }

    public final void b3() {
        int totalSpace;
        if (p2() == 1) {
            totalSpace = (o0() - f0()) - e0();
        } else {
            int totalSpace2 = W();
            totalSpace = (totalSpace2 - d0()) - g0();
        }
        O2(totalSpace);
    }

    @Override // q0.m1
    public void C1(Rect childrenBounds, int wSpec, int hSpec) {
        int width;
        int usedHeight;
        if (this.I == null) {
            super.C1(childrenBounds, wSpec, hSpec);
        }
        int horizontalPadding = e0() + f0();
        int verticalPadding = g0() + d0();
        if (this.f1054r == 1) {
            int usedHeight2 = childrenBounds.height() + verticalPadding;
            width = m1.n(hSpec, usedHeight2, b0());
            int[] iArr = this.I;
            usedHeight = m1.n(wSpec, iArr[iArr.length - 1] + horizontalPadding, c0());
        } else {
            int width2 = childrenBounds.width();
            int usedWidth = width2 + horizontalPadding;
            int width3 = m1.n(wSpec, usedWidth, c0());
            int[] iArr2 = this.I;
            usedHeight = width3;
            width = m1.n(hSpec, iArr2[iArr2.length - 1] + verticalPadding, b0());
        }
        B1(usedHeight, width);
    }

    public final void O2(int totalSpace) {
        this.I = P2(this.I, this.H, totalSpace);
    }

    public static int[] P2(int[] cachedBorders, int spanCount, int totalSpace) {
        if (!(cachedBorders != null && cachedBorders.length == spanCount + 1 && cachedBorders[cachedBorders.length - 1] == totalSpace)) {
            cachedBorders = new int[spanCount + 1];
        }
        cachedBorders[0] = 0;
        int sizePerSpan = totalSpace / spanCount;
        int sizePerSpanRemainder = totalSpace % spanCount;
        int consumedPixels = 0;
        int additionalSize = 0;
        for (int i2 = 1; i2 <= spanCount; i2++) {
            int itemSize = sizePerSpan;
            additionalSize += sizePerSpanRemainder;
            if (additionalSize > 0 && spanCount - additionalSize < sizePerSpanRemainder) {
                itemSize++;
                additionalSize -= spanCount;
            }
            consumedPixels += itemSize;
            cachedBorders[i2] = consumedPixels;
        }
        return cachedBorders;
    }

    public int T2(int startSpan, int spanSize) {
        if (this.f1054r != 1 || !q2()) {
            int[] iArr = this.I;
            return iArr[startSpan + spanSize] - iArr[startSpan];
        }
        int[] iArr2 = this.I;
        int i2 = this.H;
        return iArr2[i2 - startSpan] - iArr2[(i2 - startSpan) - spanSize];
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public void t2(t1 recycler, b2 state, e0 anchorInfo, int itemDirection) {
        super.t2(recycler, state, anchorInfo, itemDirection);
        b3();
        if (state.b() > 0 && !state.e()) {
            R2(recycler, state, anchorInfo, itemDirection);
        }
        S2();
    }

    public final void S2() {
        View[] viewArr = this.J;
        if (viewArr == null || viewArr.length != this.H) {
            this.J = new View[this.H];
        }
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, q0.m1
    public int w1(int dx, t1 recycler, b2 state) {
        b3();
        S2();
        return super.w1(dx, recycler, state);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, q0.m1
    public int y1(int dy, t1 recycler, b2 state) {
        b3();
        S2();
        return super.y1(dy, recycler, state);
    }

    public final void R2(t1 recycler, b2 state, e0 anchorInfo, int itemDirection) {
        boolean layingOutInPrimaryDirection = itemDirection == 1;
        int span = V2(recycler, state, anchorInfo.f3011b);
        if (layingOutInPrimaryDirection) {
            while (span > 0) {
                int i2 = anchorInfo.f3011b;
                if (i2 > 0) {
                    int i3 = i2 - 1;
                    anchorInfo.f3011b = i3;
                    span = V2(recycler, state, i3);
                } else {
                    return;
                }
            }
            return;
        }
        int indexLimit = state.b() - 1;
        int pos = anchorInfo.f3011b;
        int bestSpan = span;
        while (pos < indexLimit) {
            int next = V2(recycler, state, pos + 1);
            if (next <= bestSpan) {
                break;
            }
            pos++;
            bestSpan = next;
        }
        anchorInfo.f3011b = pos;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
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
                int span = V2(recycler, state, position);
                if (span != 0) {
                    continue;
                } else if (((n1) view.getLayoutParams()).c()) {
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

    public final int U2(t1 recycler, b2 state, int viewPosition) {
        if (!state.e()) {
            return this.M.a(viewPosition, this.H);
        }
        int adapterPosition = recycler.f(viewPosition);
        if (adapterPosition != -1) {
            return this.M.a(adapterPosition, this.H);
        }
        Log.w("GridLayoutManager", "Cannot find span size for pre layout position. " + viewPosition);
        return 0;
    }

    public final int V2(t1 recycler, b2 state, int pos) {
        if (!state.e()) {
            return this.M.b(pos, this.H);
        }
        int cached = this.L.get(pos, -1);
        if (cached != -1) {
            return cached;
        }
        int adapterPosition = recycler.f(pos);
        if (adapterPosition != -1) {
            return this.M.b(adapterPosition, this.H);
        }
        Log.w("GridLayoutManager", "Cannot find span size for pre layout position. It is not cached, not in the adapter. Pos:" + pos);
        return 0;
    }

    public final int W2(t1 recycler, b2 state, int pos) {
        if (!state.e()) {
            this.M.e(pos);
            return 1;
        }
        int cached = this.K.get(pos, -1);
        if (cached != -1) {
            return cached;
        }
        int adapterPosition = recycler.f(pos);
        if (adapterPosition == -1) {
            Log.w("GridLayoutManager", "Cannot find span size for pre layout position. It is not cached, not in the adapter. Pos:" + pos);
            return 1;
        }
        this.M.e(adapterPosition);
        return 1;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public void N1(b2 state, g0 layoutState, k1 layoutPrefetchRegistry) {
        int remainingSpan = this.H;
        for (int count = 0; count < this.H && layoutState.c(state) && remainingSpan > 0; count++) {
            int pos = layoutState.f3056d;
            ((x) layoutPrefetchRegistry).a(pos, Math.max(0, layoutState.f3059g));
            this.M.e(pos);
            remainingSpan--;
            layoutState.f3056d += layoutState.f3057e;
        }
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public void r2(t1 recycler, b2 state, g0 layoutState, f0 result) {
        int consumedSpanCount;
        int itemSpanIndex;
        int maxSize;
        int bottom;
        int right;
        int left;
        int top;
        int otherDirSpecMode;
        float maxSizeInOther;
        boolean flexibleInOtherDir;
        int hSpec;
        int wSpec;
        boolean z2;
        View view;
        int otherDirSpecMode2 = this.f1056t.l();
        boolean flexibleInOtherDir2 = otherDirSpecMode2 != 1073741824;
        int currentOtherDirSize = J() > 0 ? this.I[this.H] : 0;
        if (flexibleInOtherDir2) {
            b3();
        }
        boolean layingOutInPrimaryDirection = layoutState.f3057e == 1;
        int remainingSpan = this.H;
        if (!layingOutInPrimaryDirection) {
            int itemSpanIndex2 = V2(recycler, state, layoutState.f3056d);
            int itemSpanSize = W2(recycler, state, layoutState.f3056d);
            remainingSpan = itemSpanIndex2 + itemSpanSize;
            itemSpanIndex = 0;
            consumedSpanCount = 0;
        } else {
            itemSpanIndex = 0;
            consumedSpanCount = 0;
        }
        while (itemSpanIndex < this.H && layoutState.c(state) && remainingSpan > 0) {
            int pos = layoutState.f3056d;
            int spanSize = W2(recycler, state, pos);
            if (spanSize <= this.H) {
                remainingSpan -= spanSize;
                if (remainingSpan < 0 || (view = layoutState.d(recycler)) == null) {
                    break;
                }
                consumedSpanCount += spanSize;
                this.J[itemSpanIndex] = view;
                itemSpanIndex++;
            } else {
                throw new IllegalArgumentException("Item at position " + pos + " requires " + spanSize + " spans but GridLayoutManager has only " + this.H + " spans.");
            }
        }
        if (itemSpanIndex == 0) {
            result.f3040b = true;
            return;
        }
        int maxSize2 = 0;
        M2(recycler, state, itemSpanIndex, layingOutInPrimaryDirection);
        int i2 = 0;
        float maxSizeInOther2 = 0.0f;
        while (i2 < itemSpanIndex) {
            View view2 = this.J[i2];
            if (layoutState.f3063k != null) {
                z2 = false;
                if (layingOutInPrimaryDirection) {
                    b(view2);
                } else {
                    c(view2, 0);
                }
            } else if (layingOutInPrimaryDirection) {
                d(view2);
                z2 = false;
            } else {
                z2 = false;
                e(view2, 0);
            }
            j(view2, this.N);
            Y2(view2, otherDirSpecMode2, z2);
            int size = this.f1056t.e(view2);
            if (size > maxSize2) {
                maxSize2 = size;
            }
            float otherSize = (this.f1056t.f(view2) * 1.0f) / ((b0) view2.getLayoutParams()).f2966f;
            if (otherSize > maxSizeInOther2) {
                maxSizeInOther2 = otherSize;
            }
            i2++;
            maxSize2 = maxSize2;
        }
        if (flexibleInOtherDir2) {
            X2(maxSizeInOther2, currentOtherDirSize);
            int maxSize3 = 0;
            for (int i3 = 0; i3 < itemSpanIndex; i3++) {
                View view3 = this.J[i3];
                Y2(view3, 1073741824, true);
                int size2 = this.f1056t.e(view3);
                if (size2 > maxSize3) {
                    maxSize3 = size2;
                }
            }
            maxSize = maxSize3;
        } else {
            maxSize = maxSize2;
        }
        int i4 = 0;
        while (i4 < itemSpanIndex) {
            View view4 = this.J[i4];
            if (this.f1056t.e(view4) != maxSize) {
                b0 lp = (b0) view4.getLayoutParams();
                Rect decorInsets = lp.f3143b;
                maxSizeInOther = maxSizeInOther2;
                int verticalInsets = decorInsets.top + decorInsets.bottom + ((ViewGroup.MarginLayoutParams) lp).topMargin + ((ViewGroup.MarginLayoutParams) lp).bottomMargin;
                int horizontalInsets = decorInsets.left + decorInsets.right + ((ViewGroup.MarginLayoutParams) lp).leftMargin + ((ViewGroup.MarginLayoutParams) lp).rightMargin;
                int totalSpaceInOther = T2(lp.f2965e, lp.f2966f);
                otherDirSpecMode = otherDirSpecMode2;
                if (this.f1054r == 1) {
                    flexibleInOtherDir = flexibleInOtherDir2;
                    wSpec = m1.K(totalSpaceInOther, 1073741824, horizontalInsets, ((ViewGroup.MarginLayoutParams) lp).width, false);
                    hSpec = View.MeasureSpec.makeMeasureSpec(maxSize - verticalInsets, 1073741824);
                } else {
                    flexibleInOtherDir = flexibleInOtherDir2;
                    wSpec = View.MeasureSpec.makeMeasureSpec(maxSize - horizontalInsets, 1073741824);
                    hSpec = m1.K(totalSpaceInOther, 1073741824, verticalInsets, ((ViewGroup.MarginLayoutParams) lp).height, false);
                }
                Z2(view4, wSpec, hSpec, true);
            } else {
                maxSizeInOther = maxSizeInOther2;
                otherDirSpecMode = otherDirSpecMode2;
                flexibleInOtherDir = flexibleInOtherDir2;
            }
            i4++;
            flexibleInOtherDir2 = flexibleInOtherDir;
            maxSizeInOther2 = maxSizeInOther;
            otherDirSpecMode2 = otherDirSpecMode;
        }
        result.f3039a = maxSize;
        int left2 = 0;
        int right2 = 0;
        int top2 = 0;
        int bottom2 = 0;
        if (this.f1054r == 1) {
            if (layoutState.f3058f == -1) {
                bottom2 = layoutState.f3054b;
                top2 = bottom2 - maxSize;
            } else {
                top2 = layoutState.f3054b;
                bottom2 = top2 + maxSize;
            }
        } else if (layoutState.f3058f == -1) {
            right2 = layoutState.f3054b;
            left2 = right2 - maxSize;
        } else {
            left2 = layoutState.f3054b;
            right2 = left2 + maxSize;
        }
        int i5 = 0;
        while (i5 < itemSpanIndex) {
            View view5 = this.J[i5];
            b0 params = (b0) view5.getLayoutParams();
            if (this.f1054r != 1) {
                left = left2;
                right = right2;
                int top3 = g0() + this.I[params.f2965e];
                bottom = this.f1056t.f(view5) + top3;
                top = top3;
            } else if (q2()) {
                int right3 = e0() + this.I[this.H - params.f2965e];
                left = right3 - this.f1056t.f(view5);
                top = top2;
                bottom = bottom2;
                right = right3;
            } else {
                int left3 = e0() + this.I[params.f2965e];
                right = this.f1056t.f(view5) + left3;
                left = left3;
                top = top2;
                bottom = bottom2;
            }
            z0(view5, left, top, right, bottom);
            if (params.c() || params.b()) {
                result.f3041c = true;
            }
            result.f3042d |= view5.hasFocusable();
            i5++;
            top2 = top;
            left2 = left;
            right2 = right;
            bottom2 = bottom;
            itemSpanIndex = itemSpanIndex;
        }
        Arrays.fill(this.J, (Object) null);
    }

    public final void Y2(View view, int otherDirParentSpecMode, boolean alreadyMeasured) {
        int hSpec;
        int wSpec;
        b0 lp = (b0) view.getLayoutParams();
        Rect decorInsets = lp.f3143b;
        int verticalInsets = decorInsets.top + decorInsets.bottom + ((ViewGroup.MarginLayoutParams) lp).topMargin + ((ViewGroup.MarginLayoutParams) lp).bottomMargin;
        int horizontalInsets = decorInsets.left + decorInsets.right + ((ViewGroup.MarginLayoutParams) lp).leftMargin + ((ViewGroup.MarginLayoutParams) lp).rightMargin;
        int availableSpaceInOther = T2(lp.f2965e, lp.f2966f);
        if (this.f1054r == 1) {
            wSpec = m1.K(availableSpaceInOther, otherDirParentSpecMode, horizontalInsets, ((ViewGroup.MarginLayoutParams) lp).width, false);
            hSpec = m1.K(this.f1056t.n(), X(), verticalInsets, ((ViewGroup.MarginLayoutParams) lp).height, true);
        } else {
            int wSpec2 = ((ViewGroup.MarginLayoutParams) lp).height;
            hSpec = m1.K(availableSpaceInOther, otherDirParentSpecMode, verticalInsets, wSpec2, false);
            wSpec = m1.K(this.f1056t.n(), p0(), horizontalInsets, ((ViewGroup.MarginLayoutParams) lp).width, true);
        }
        Z2(view, wSpec, hSpec, alreadyMeasured);
    }

    public final void X2(float maxSizeInOther, int currentOtherDirSize) {
        int contentSize = Math.round(this.H * maxSizeInOther);
        O2(Math.max(contentSize, currentOtherDirSize));
    }

    public final void Z2(View child, int widthSpec, int heightSpec, boolean alreadyMeasured) {
        boolean measure;
        n1 lp = (n1) child.getLayoutParams();
        if (alreadyMeasured) {
            measure = H1(child, widthSpec, heightSpec, lp);
        } else {
            measure = F1(child, widthSpec, heightSpec, lp);
        }
        if (measure) {
            child.measure(widthSpec, heightSpec);
        }
    }

    public final void M2(t1 recycler, b2 state, int count, boolean layingOutInPrimaryDirection) {
        int diff;
        int end;
        int start;
        if (layingOutInPrimaryDirection) {
            start = 0;
            end = count;
            diff = 1;
        } else {
            start = count - 1;
            end = -1;
            diff = -1;
        }
        int span = 0;
        for (int i2 = start; i2 != end; i2 += diff) {
            View view = this.J[i2];
            b0 params = (b0) view.getLayoutParams();
            int W2 = W2(recycler, state, h0(view));
            params.f2966f = W2;
            params.f2965e = span;
            span += W2;
        }
    }

    public void a3(int spanCount) {
        if (spanCount != this.H) {
            this.G = true;
            if (spanCount >= 1) {
                this.H = spanCount;
                this.M.g();
                t1();
                return;
            }
            throw new IllegalArgumentException("Span count should be at least 1. Provided " + spanCount);
        }
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, q0.m1
    public View J0(View focused, int focusDirection, t1 recycler, b2 state) {
        int limit;
        int inc;
        int start;
        int focusableSpanGroupIndex;
        View prevFocusedChild;
        int focusableWeakCandidateSpanIndex;
        int overlap;
        GridLayoutManager gridLayoutManager = this;
        t1 t1Var = recycler;
        b2 b2Var = state;
        View prevFocusedChild2 = B(focused);
        if (prevFocusedChild2 == null) {
            return null;
        }
        b0 lp = (b0) prevFocusedChild2.getLayoutParams();
        int prevSpanStart = lp.f2965e;
        int prevSpanEnd = lp.f2965e + lp.f2966f;
        View view = super.J0(focused, focusDirection, recycler, state);
        if (view == null) {
            return null;
        }
        int layoutDir = gridLayoutManager.R1(focusDirection);
        boolean ascend = (layoutDir == 1) != gridLayoutManager.f1059w;
        if (ascend) {
            start = J() - 1;
            inc = -1;
            limit = -1;
        } else {
            start = 0;
            inc = 1;
            limit = J();
        }
        boolean preferLastSpan = gridLayoutManager.f1054r == 1 && q2();
        View focusableWeakCandidate = null;
        View unfocusableWeakCandidate = null;
        int focusableSpanGroupIndex2 = gridLayoutManager.U2(t1Var, b2Var, start);
        int unfocusableWeakCandidateSpanIndex = -1;
        int focusableWeakCandidateOverlap = 0;
        int unfocusableWeakCandidateSpanIndex2 = -1;
        int unfocusableWeakCandidateOverlap = 0;
        int i2 = start;
        while (i2 != limit) {
            int spanGroupIndex = gridLayoutManager.U2(t1Var, b2Var, i2);
            View candidate = gridLayoutManager.I(i2);
            if (candidate == prevFocusedChild2) {
                break;
            }
            if (!candidate.hasFocusable() || spanGroupIndex == focusableSpanGroupIndex2) {
                b0 candidateLp = (b0) candidate.getLayoutParams();
                prevFocusedChild = prevFocusedChild2;
                int candidateStart = candidateLp.f2965e;
                focusableSpanGroupIndex = focusableSpanGroupIndex2;
                int focusableSpanGroupIndex3 = candidateLp.f2965e;
                int spanGroupIndex2 = candidateLp.f2966f;
                int candidateEnd = focusableSpanGroupIndex3 + spanGroupIndex2;
                if (candidate.hasFocusable() && candidateStart == prevSpanStart && candidateEnd == prevSpanEnd) {
                    return candidate;
                }
                if ((!candidate.hasFocusable() || focusableWeakCandidate != null) && (candidate.hasFocusable() || unfocusableWeakCandidate != null)) {
                    int maxStart = Math.max(candidateStart, prevSpanStart);
                    int minEnd = Math.min(candidateEnd, prevSpanEnd);
                    int overlap2 = minEnd - maxStart;
                    if (!candidate.hasFocusable()) {
                        focusableWeakCandidateSpanIndex = unfocusableWeakCandidateSpanIndex;
                        if (focusableWeakCandidate == null) {
                            boolean z2 = false;
                            if (gridLayoutManager.y0(candidate, false)) {
                                if (overlap2 > unfocusableWeakCandidateOverlap) {
                                    overlap = 1;
                                } else if (overlap2 == unfocusableWeakCandidateOverlap) {
                                    if (candidateStart > unfocusableWeakCandidateSpanIndex2) {
                                        z2 = true;
                                    }
                                    if (preferLastSpan == z2) {
                                        overlap = 1;
                                    }
                                }
                            }
                        }
                        overlap = 0;
                    } else if (overlap2 > focusableWeakCandidateOverlap) {
                        focusableWeakCandidateSpanIndex = unfocusableWeakCandidateSpanIndex;
                        overlap = 1;
                    } else {
                        if (overlap2 == focusableWeakCandidateOverlap) {
                            focusableWeakCandidateSpanIndex = unfocusableWeakCandidateSpanIndex;
                            boolean focusableWeakCandidateSpanIndex2 = candidateStart > unfocusableWeakCandidateSpanIndex;
                            if (preferLastSpan == focusableWeakCandidateSpanIndex2) {
                                overlap = 1;
                            }
                        } else {
                            focusableWeakCandidateSpanIndex = unfocusableWeakCandidateSpanIndex;
                        }
                        overlap = 0;
                    }
                } else {
                    overlap = 1;
                    focusableWeakCandidateSpanIndex = unfocusableWeakCandidateSpanIndex;
                }
                if (overlap != 0) {
                    if (candidate.hasFocusable()) {
                        int focusableWeakCandidateSpanIndex3 = candidateLp.f2965e;
                        focusableWeakCandidateOverlap = Math.min(candidateEnd, prevSpanEnd) - Math.max(candidateStart, prevSpanStart);
                        focusableWeakCandidate = candidate;
                        unfocusableWeakCandidateSpanIndex = focusableWeakCandidateSpanIndex3;
                    } else {
                        int unfocusableWeakCandidateSpanIndex3 = candidateLp.f2965e;
                        int unfocusableWeakCandidateSpanIndex4 = Math.min(candidateEnd, prevSpanEnd);
                        unfocusableWeakCandidateOverlap = unfocusableWeakCandidateSpanIndex4 - Math.max(candidateStart, prevSpanStart);
                        unfocusableWeakCandidate = candidate;
                        unfocusableWeakCandidateSpanIndex2 = unfocusableWeakCandidateSpanIndex3;
                        unfocusableWeakCandidateSpanIndex = focusableWeakCandidateSpanIndex;
                    }
                    i2 += inc;
                    gridLayoutManager = this;
                    t1Var = recycler;
                    b2Var = state;
                    start = start;
                    prevFocusedChild2 = prevFocusedChild;
                    focusableSpanGroupIndex2 = focusableSpanGroupIndex;
                }
            } else if (focusableWeakCandidate != null) {
                break;
            } else {
                prevFocusedChild = prevFocusedChild2;
                focusableWeakCandidateSpanIndex = unfocusableWeakCandidateSpanIndex;
                focusableSpanGroupIndex = focusableSpanGroupIndex2;
            }
            unfocusableWeakCandidateSpanIndex = focusableWeakCandidateSpanIndex;
            i2 += inc;
            gridLayoutManager = this;
            t1Var = recycler;
            b2Var = state;
            start = start;
            prevFocusedChild2 = prevFocusedChild;
            focusableSpanGroupIndex2 = focusableSpanGroupIndex;
        }
        return focusableWeakCandidate != null ? focusableWeakCandidate : unfocusableWeakCandidate;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, q0.m1
    public boolean L1() {
        return this.B == null && !this.G;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, q0.m1
    public int s(b2 state) {
        return super.s(state);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, q0.m1
    public int v(b2 state) {
        return super.v(state);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, q0.m1
    public int r(b2 state) {
        return super.r(state);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, q0.m1
    public int u(b2 state) {
        return super.u(state);
    }
}
