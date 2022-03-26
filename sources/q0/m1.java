package q0;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import androidx.recyclerview.widget.RecyclerView;
import f0.c1;
import g0.d;
import g0.e;
import g0.f;
import p0.a;

/* JADX WARN: Classes with same name are omitted:
  
 */
/* loaded from: classes.dex */
public abstract class m1 {

    /* renamed from: a  reason: collision with root package name */
    public f f3114a;

    /* renamed from: b  reason: collision with root package name */
    public RecyclerView f3115b;

    /* renamed from: c  reason: collision with root package name */
    public final v2 f3116c;

    /* renamed from: d  reason: collision with root package name */
    public final v2 f3117d;

    /* renamed from: e  reason: collision with root package name */
    public w2 f3118e;

    /* renamed from: f  reason: collision with root package name */
    public w2 f3119f;

    /* renamed from: g  reason: collision with root package name */
    public a2 f3120g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f3121h = false;

    /* renamed from: i  reason: collision with root package name */
    public boolean f3122i = false;

    /* renamed from: j  reason: collision with root package name */
    public boolean f3123j = true;

    /* renamed from: k  reason: collision with root package name */
    public boolean f3124k = true;

    /* renamed from: l  reason: collision with root package name */
    public int f3125l;

    /* renamed from: m  reason: collision with root package name */
    public boolean f3126m;

    /* renamed from: n  reason: collision with root package name */
    public int f3127n;

    /* renamed from: o  reason: collision with root package name */
    public int f3128o;

    /* renamed from: p  reason: collision with root package name */
    public int f3129p;

    /* renamed from: q  reason: collision with root package name */
    public int f3130q;

    public abstract n1 D();

    public abstract void I1(RecyclerView recyclerView, b2 b2Var, int i2);

    public abstract View J0(View view, int i2, t1 t1Var, b2 b2Var);

    public abstract boolean L1();

    public abstract void X0(t1 t1Var, b2 b2Var);

    public abstract void c1(Parcelable parcelable);

    public abstract Parcelable d1();

    public abstract boolean k();

    public abstract boolean l();

    public abstract void o(int i2, int i3, b2 b2Var, k1 k1Var);

    public abstract int q(b2 b2Var);

    public abstract int r(b2 b2Var);

    public abstract int s(b2 b2Var);

    public abstract boolean s0();

    public abstract int t(b2 b2Var);

    public abstract int u(b2 b2Var);

    public abstract int v(b2 b2Var);

    public abstract int w1(int i2, t1 t1Var, b2 b2Var);

    public abstract void x1(int i2);

    public abstract int y1(int i2, t1 t1Var, b2 b2Var);

    public m1() {
        i1 i1Var = new i1(this);
        this.f3116c = i1Var;
        j1 j1Var = new j1(this);
        this.f3117d = j1Var;
        this.f3118e = new w2(i1Var);
        this.f3119f = new w2(j1Var);
    }

    public void E1(RecyclerView recyclerView) {
        if (recyclerView == null) {
            this.f3115b = null;
            this.f3114a = null;
            this.f3129p = 0;
            this.f3130q = 0;
        } else {
            this.f3115b = recyclerView;
            this.f3114a = recyclerView.f1075f;
            this.f3129p = recyclerView.getWidth();
            this.f3130q = recyclerView.getHeight();
        }
        this.f3127n = 1073741824;
        this.f3128o = 1073741824;
    }

    public void A1(int wSpec, int hSpec) {
        this.f3129p = View.MeasureSpec.getSize(wSpec);
        int mode = View.MeasureSpec.getMode(wSpec);
        this.f3127n = mode;
        if (mode == 0) {
            int[] iArr = RecyclerView.f1063x0;
        }
        this.f3130q = View.MeasureSpec.getSize(hSpec);
        int mode2 = View.MeasureSpec.getMode(hSpec);
        this.f3128o = mode2;
        if (mode2 == 0) {
            int[] iArr2 = RecyclerView.f1063x0;
        }
    }

    public void D1(int widthSpec, int heightSpec) {
        int count = J();
        if (count == 0) {
            this.f3115b.w(widthSpec, heightSpec);
            return;
        }
        int minX = Integer.MAX_VALUE;
        int minY = Integer.MAX_VALUE;
        int maxX = Integer.MIN_VALUE;
        int maxY = Integer.MIN_VALUE;
        for (int i2 = 0; i2 < count; i2++) {
            View child = I(i2);
            Rect bounds = this.f3115b.f1081i;
            P(child, bounds);
            if (bounds.left < minX) {
                minX = bounds.left;
            }
            if (bounds.right > maxX) {
                maxX = bounds.right;
            }
            if (bounds.top < minY) {
                minY = bounds.top;
            }
            if (bounds.bottom > maxY) {
                maxY = bounds.bottom;
            }
        }
        this.f3115b.f1081i.set(minX, minY, maxX, maxY);
        C1(this.f3115b.f1081i, widthSpec, heightSpec);
    }

    public void C1(Rect childrenBounds, int wSpec, int hSpec) {
        int usedWidth = childrenBounds.width() + e0() + f0();
        int usedHeight = childrenBounds.height() + g0() + d0();
        int width = n(wSpec, usedWidth, c0());
        int height = n(hSpec, usedHeight, b0());
        B1(width, height);
    }

    public void t1() {
        RecyclerView recyclerView = this.f3115b;
        if (recyclerView != null) {
            recyclerView.requestLayout();
        }
    }

    public static int n(int spec, int desired, int min) {
        int mode = View.MeasureSpec.getMode(spec);
        int size = View.MeasureSpec.getSize(spec);
        switch (mode) {
            case Integer.MIN_VALUE:
                return Math.min(size, Math.max(desired, min));
            case 1073741824:
                return size;
            default:
                return Math.max(desired, min);
        }
    }

    public void g(String message) {
        RecyclerView recyclerView = this.f3115b;
        if (recyclerView != null) {
            recyclerView.o(message);
        }
    }

    public final boolean u0() {
        return this.f3124k;
    }

    public void p(int adapterItemCount, k1 layoutPrefetchRegistry) {
    }

    public void z(RecyclerView view) {
        this.f3122i = true;
        G0();
    }

    public void A(RecyclerView view, t1 recycler) {
        this.f3122i = false;
        I0(view, recycler);
    }

    public boolean r0() {
        return this.f3122i;
    }

    public boolean o1(Runnable action) {
        RecyclerView recyclerView = this.f3115b;
        if (recyclerView != null) {
            return recyclerView.removeCallbacks(action);
        }
        return false;
    }

    public void G0() {
    }

    public void H0() {
    }

    public void I0(RecyclerView view, t1 recycler) {
        H0();
    }

    public boolean M() {
        RecyclerView recyclerView = this.f3115b;
        return recyclerView != null && recyclerView.f1079h;
    }

    public void Y0(b2 state) {
    }

    public boolean m(n1 lp) {
        return lp != null;
    }

    public n1 F(ViewGroup.LayoutParams lp) {
        if (lp instanceof n1) {
            return new n1((n1) lp);
        }
        if (lp instanceof ViewGroup.MarginLayoutParams) {
            return new n1((ViewGroup.MarginLayoutParams) lp);
        }
        return new n1(lp);
    }

    public n1 E(Context c2, AttributeSet attrs) {
        return new n1(c2, attrs);
    }

    public void J1(a2 smoothScroller) {
        a2 a2Var = this.f3120g;
        if (!(a2Var == null || smoothScroller == a2Var || !a2Var.h())) {
            this.f3120g.r();
        }
        this.f3120g = smoothScroller;
        smoothScroller.q(this.f3115b, this);
    }

    public boolean x0() {
        a2 a2Var = this.f3120g;
        return a2Var != null && a2Var.h();
    }

    public int Z() {
        return c1.A(this.f3115b);
    }

    public void b(View child) {
        c(child, -1);
    }

    public void c(View child, int index) {
        f(child, index, true);
    }

    public void d(View child) {
        e(child, -1);
    }

    public void e(View child, int index) {
        f(child, index, false);
    }

    public final void f(View child, int index, boolean disappearing) {
        e2 holder = RecyclerView.f0(child);
        if (disappearing || holder.v()) {
            this.f3115b.f1077g.b(holder);
        } else {
            this.f3115b.f1077g.p(holder);
        }
        n1 lp = (n1) child.getLayoutParams();
        if (holder.L() || holder.w()) {
            if (holder.w()) {
                holder.K();
            } else {
                holder.e();
            }
            this.f3114a.c(child, index, child.getLayoutParams(), false);
        } else if (child.getParent() == this.f3115b) {
            int currentIndex = this.f3114a.m(child);
            if (index == -1) {
                index = this.f3114a.g();
            }
            if (currentIndex == -1) {
                throw new IllegalStateException("Added View has RecyclerView as parent but view is not a real child. Unfiltered index:" + this.f3115b.indexOfChild(child) + this.f3115b.P());
            } else if (currentIndex != index) {
                this.f3115b.f1089m.B0(currentIndex, index);
            }
        } else {
            this.f3114a.a(child, index, false);
            lp.f3144c = true;
            a2 a2Var = this.f3120g;
            if (a2Var != null && a2Var.h()) {
                this.f3120g.k(child);
            }
        }
        if (lp.f3145d) {
            holder.f3018a.invalidate();
            lp.f3145d = false;
        }
    }

    public void p1(View child) {
        this.f3114a.p(child);
    }

    public void q1(int index) {
        View child = I(index);
        if (child != null) {
            this.f3114a.q(index);
        }
    }

    public int G() {
        return -1;
    }

    public int h0(View view) {
        return ((n1) view.getLayoutParams()).a();
    }

    public View B(View view) {
        View found;
        RecyclerView recyclerView = this.f3115b;
        if (recyclerView == null || (found = recyclerView.R(view)) == null || this.f3114a.n(found)) {
            return null;
        }
        return found;
    }

    public View C(int position) {
        int childCount = J();
        for (int i2 = 0; i2 < childCount; i2++) {
            View child = I(i2);
            e2 vh = RecyclerView.f0(child);
            if (vh != null && vh.m() == position && !vh.J() && (this.f3115b.f1078g0.e() || !vh.v())) {
                return child;
            }
        }
        return null;
    }

    public void x(int index) {
        I(index);
        y(index);
    }

    public final void y(int index) {
        this.f3114a.d(index);
    }

    public void i(View child, int index, n1 lp) {
        e2 vh = RecyclerView.f0(child);
        if (vh.v()) {
            this.f3115b.f1077g.b(vh);
        } else {
            this.f3115b.f1077g.p(vh);
        }
        this.f3114a.c(child, index, lp, vh.v());
    }

    public void h(View child, int index) {
        i(child, index, (n1) child.getLayoutParams());
    }

    public void B0(int fromIndex, int toIndex) {
        View view = I(fromIndex);
        if (view != null) {
            x(fromIndex);
            h(view, toIndex);
            return;
        }
        throw new IllegalArgumentException("Cannot move a child from non-existing index:" + fromIndex + this.f3115b.toString());
    }

    public void m1(View child, t1 recycler) {
        p1(child);
        recycler.z(child);
    }

    public void n1(int index, t1 recycler) {
        View view = I(index);
        q1(index);
        recycler.z(view);
    }

    public int J() {
        f fVar = this.f3114a;
        if (fVar != null) {
            return fVar.g();
        }
        return 0;
    }

    public View I(int index) {
        f fVar = this.f3114a;
        if (fVar != null) {
            return fVar.f(index);
        }
        return null;
    }

    public int p0() {
        return this.f3127n;
    }

    public int X() {
        return this.f3128o;
    }

    public int o0() {
        return this.f3129p;
    }

    public int W() {
        return this.f3130q;
    }

    public int e0() {
        RecyclerView recyclerView = this.f3115b;
        if (recyclerView != null) {
            return recyclerView.getPaddingLeft();
        }
        return 0;
    }

    public int g0() {
        RecyclerView recyclerView = this.f3115b;
        if (recyclerView != null) {
            return recyclerView.getPaddingTop();
        }
        return 0;
    }

    public int f0() {
        RecyclerView recyclerView = this.f3115b;
        if (recyclerView != null) {
            return recyclerView.getPaddingRight();
        }
        return 0;
    }

    public int d0() {
        RecyclerView recyclerView = this.f3115b;
        if (recyclerView != null) {
            return recyclerView.getPaddingBottom();
        }
        return 0;
    }

    public View V() {
        View focused;
        RecyclerView recyclerView = this.f3115b;
        if (recyclerView == null || (focused = recyclerView.getFocusedChild()) == null || this.f3114a.n(focused)) {
            return null;
        }
        return focused;
    }

    public int Y() {
        RecyclerView recyclerView = this.f3115b;
        x0 a2 = recyclerView != null ? recyclerView.getAdapter() : null;
        if (a2 != null) {
            return a2.c();
        }
        return 0;
    }

    public void C0(int dx) {
        RecyclerView recyclerView = this.f3115b;
        if (recyclerView != null) {
            recyclerView.y0(dx);
        }
    }

    public void D0(int dy) {
        RecyclerView recyclerView = this.f3115b;
        if (recyclerView != null) {
            recyclerView.z0(dy);
        }
    }

    public void w(t1 recycler) {
        int childCount = J();
        for (int i2 = childCount - 1; i2 >= 0; i2--) {
            View v2 = I(i2);
            v1(recycler, i2, v2);
        }
    }

    public final void v1(t1 recycler, int index, View view) {
        e2 viewHolder = RecyclerView.f0(view);
        if (!viewHolder.J()) {
            if (!viewHolder.t() || viewHolder.v() || this.f3115b.f1087l.g()) {
                x(index);
                recycler.B(view);
                this.f3115b.f1077g.k(viewHolder);
                return;
            }
            q1(index);
            recycler.A(viewHolder);
        }
    }

    public void l1(t1 recycler) {
        int scrapCount = recycler.j();
        for (int i2 = scrapCount - 1; i2 >= 0; i2--) {
            View scrap = recycler.n(i2);
            e2 vh = RecyclerView.f0(scrap);
            if (!vh.J()) {
                vh.G(false);
                if (vh.x()) {
                    this.f3115b.removeDetachedView(scrap, false);
                }
                f1 f1Var = this.f3115b.L;
                if (f1Var != null) {
                    f1Var.j(vh);
                }
                vh.G(true);
                recycler.w(scrap);
            }
        }
        recycler.e();
        if (scrapCount > 0) {
            this.f3115b.invalidate();
        }
    }

    public boolean H1(View child, int widthSpec, int heightSpec, n1 lp) {
        return !this.f3123j || !w0(child.getMeasuredWidth(), widthSpec, ((ViewGroup.MarginLayoutParams) lp).width) || !w0(child.getMeasuredHeight(), heightSpec, ((ViewGroup.MarginLayoutParams) lp).height);
    }

    public boolean F1(View child, int widthSpec, int heightSpec, n1 lp) {
        return child.isLayoutRequested() || !this.f3123j || !w0(child.getWidth(), widthSpec, ((ViewGroup.MarginLayoutParams) lp).width) || !w0(child.getHeight(), heightSpec, ((ViewGroup.MarginLayoutParams) lp).height);
    }

    public static boolean w0(int childSize, int spec, int dimension) {
        int specMode = View.MeasureSpec.getMode(spec);
        int specSize = View.MeasureSpec.getSize(spec);
        if (dimension > 0 && childSize != dimension) {
            return false;
        }
        switch (specMode) {
            case Integer.MIN_VALUE:
                if (specSize >= childSize) {
                    return true;
                }
                return false;
            case 0:
                return true;
            case 1073741824:
                if (specSize == childSize) {
                    return true;
                }
                return false;
            default:
                return false;
        }
    }

    public void A0(View child, int widthUsed, int heightUsed) {
        n1 lp = (n1) child.getLayoutParams();
        Rect insets = this.f3115b.j0(child);
        int widthUsed2 = widthUsed + insets.left + insets.right;
        int heightUsed2 = heightUsed + insets.top + insets.bottom;
        int widthSpec = K(o0(), p0(), e0() + f0() + ((ViewGroup.MarginLayoutParams) lp).leftMargin + ((ViewGroup.MarginLayoutParams) lp).rightMargin + widthUsed2, ((ViewGroup.MarginLayoutParams) lp).width, k());
        int heightSpec = K(W(), X(), g0() + d0() + ((ViewGroup.MarginLayoutParams) lp).topMargin + ((ViewGroup.MarginLayoutParams) lp).bottomMargin + heightUsed2, ((ViewGroup.MarginLayoutParams) lp).height, l());
        if (F1(child, widthSpec, heightSpec, lp)) {
            child.measure(widthSpec, heightSpec);
        }
    }

    public static int K(int parentSize, int parentMode, int padding, int childDimension, boolean canScroll) {
        int size = Math.max(0, parentSize - padding);
        int resultSize = 0;
        int resultMode = 0;
        if (canScroll) {
            if (childDimension >= 0) {
                resultSize = childDimension;
                resultMode = 1073741824;
            } else if (childDimension == -1) {
                switch (parentMode) {
                    case Integer.MIN_VALUE:
                    case 1073741824:
                        resultSize = size;
                        resultMode = parentMode;
                        break;
                    case 0:
                        resultSize = 0;
                        resultMode = 0;
                        break;
                }
            } else if (childDimension == -2) {
                resultSize = 0;
                resultMode = 0;
            }
        } else if (childDimension >= 0) {
            resultSize = childDimension;
            resultMode = 1073741824;
        } else if (childDimension == -1) {
            resultSize = size;
            resultMode = parentMode;
        } else if (childDimension == -2) {
            resultSize = size;
            resultMode = (parentMode == Integer.MIN_VALUE || parentMode == 1073741824) ? Integer.MIN_VALUE : 0;
        }
        return View.MeasureSpec.makeMeasureSpec(resultSize, resultMode);
    }

    public int S(View child) {
        Rect insets = ((n1) child.getLayoutParams()).f3143b;
        return child.getMeasuredWidth() + insets.left + insets.right;
    }

    public int R(View child) {
        Rect insets = ((n1) child.getLayoutParams()).f3143b;
        return child.getMeasuredHeight() + insets.top + insets.bottom;
    }

    public void z0(View child, int left, int top, int right, int bottom) {
        n1 lp = (n1) child.getLayoutParams();
        Rect insets = lp.f3143b;
        child.layout(insets.left + left + ((ViewGroup.MarginLayoutParams) lp).leftMargin, insets.top + top + ((ViewGroup.MarginLayoutParams) lp).topMargin, (right - insets.right) - ((ViewGroup.MarginLayoutParams) lp).rightMargin, (bottom - insets.bottom) - ((ViewGroup.MarginLayoutParams) lp).bottomMargin);
    }

    public void n0(View child, boolean includeDecorInsets, Rect out) {
        Matrix childMatrix;
        if (includeDecorInsets) {
            Rect insets = ((n1) child.getLayoutParams()).f3143b;
            out.set(-insets.left, -insets.top, child.getWidth() + insets.right, child.getHeight() + insets.bottom);
        } else {
            out.set(0, 0, child.getWidth(), child.getHeight());
        }
        if (!(this.f3115b == null || (childMatrix = child.getMatrix()) == null || childMatrix.isIdentity())) {
            RectF tempRectF = this.f3115b.f1085k;
            tempRectF.set(out);
            childMatrix.mapRect(tempRectF);
            out.set((int) Math.floor(tempRectF.left), (int) Math.floor(tempRectF.top), (int) Math.ceil(tempRectF.right), (int) Math.ceil(tempRectF.bottom));
        }
        out.offset(child.getLeft(), child.getTop());
    }

    public void P(View view, Rect outBounds) {
        RecyclerView.g0(view, outBounds);
    }

    public int Q(View child) {
        return child.getLeft() - a0(child);
    }

    public int U(View child) {
        return child.getTop() - m0(child);
    }

    public int T(View child) {
        return child.getRight() + j0(child);
    }

    public int O(View child) {
        return child.getBottom() + H(child);
    }

    public void j(View child, Rect outRect) {
        RecyclerView recyclerView = this.f3115b;
        if (recyclerView == null) {
            outRect.set(0, 0, 0, 0);
            return;
        }
        Rect insets = recyclerView.j0(child);
        outRect.set(insets);
    }

    public int m0(View child) {
        return ((n1) child.getLayoutParams()).f3143b.top;
    }

    public int H(View child) {
        return ((n1) child.getLayoutParams()).f3143b.bottom;
    }

    public int a0(View child) {
        return ((n1) child.getLayoutParams()).f3143b.left;
    }

    public int j0(View child) {
        return ((n1) child.getLayoutParams()).f3143b.right;
    }

    public View Q0() {
        return null;
    }

    public final int[] L(View child, Rect rect) {
        int dx;
        int[] out = new int[2];
        int parentLeft = e0();
        int parentTop = g0();
        int parentRight = o0() - f0();
        int parentBottom = W() - d0();
        int childLeft = (child.getLeft() + rect.left) - child.getScrollX();
        int childTop = (child.getTop() + rect.top) - child.getScrollY();
        int childRight = rect.width() + childLeft;
        int childBottom = rect.height() + childTop;
        int offScreenLeft = Math.min(0, childLeft - parentLeft);
        int offScreenTop = Math.min(0, childTop - parentTop);
        int offScreenRight = Math.max(0, childRight - parentRight);
        int offScreenBottom = Math.max(0, childBottom - parentBottom);
        if (Z() == 1) {
            dx = offScreenRight != 0 ? offScreenRight : Math.max(offScreenLeft, childRight - parentRight);
        } else {
            dx = offScreenLeft != 0 ? offScreenLeft : Math.min(childLeft - parentLeft, offScreenRight);
        }
        int dy = offScreenTop != 0 ? offScreenTop : Math.min(childTop - parentTop, offScreenBottom);
        out[0] = dx;
        out[1] = dy;
        return out;
    }

    public boolean r1(RecyclerView parent, View child, Rect rect, boolean immediate) {
        return s1(parent, child, rect, immediate, false);
    }

    public boolean s1(RecyclerView parent, View child, Rect rect, boolean immediate, boolean focusedChildVisible) {
        int[] scrollAmount = L(child, rect);
        int dx = scrollAmount[0];
        int dy = scrollAmount[1];
        if ((focusedChildVisible && !t0(parent, dx, dy)) || (dx == 0 && dy == 0)) {
            return false;
        }
        if (immediate) {
            parent.scrollBy(dx, dy);
        } else {
            parent.k1(dx, dy);
        }
        return true;
    }

    public boolean y0(View child, boolean completelyVisible) {
        boolean isViewFullyVisible = this.f3118e.b(child, 24579) && this.f3119f.b(child, 24579);
        if (completelyVisible) {
            return isViewFullyVisible;
        }
        return !isViewFullyVisible;
    }

    public final boolean t0(RecyclerView parent, int dx, int dy) {
        View focusedChild = parent.getFocusedChild();
        if (focusedChild == null) {
            return false;
        }
        int parentLeft = e0();
        int parentTop = g0();
        int parentRight = o0() - f0();
        int parentBottom = W() - d0();
        Rect bounds = this.f3115b.f1081i;
        P(focusedChild, bounds);
        if (bounds.left - dx >= parentRight || bounds.right - dx <= parentLeft || bounds.top - dy >= parentBottom || bounds.bottom - dy <= parentTop) {
            return false;
        }
        return true;
    }

    public boolean a1(RecyclerView parent) {
        return x0() || parent.t0();
    }

    public boolean b1(RecyclerView parent, View child, View focused) {
        return a1(parent);
    }

    public void E0() {
    }

    public boolean F0() {
        return false;
    }

    public void S0(RecyclerView recyclerView) {
    }

    public void R0(RecyclerView recyclerView, int positionStart, int itemCount) {
    }

    public void U0(RecyclerView recyclerView, int positionStart, int itemCount) {
    }

    public void V0() {
    }

    public void W0(RecyclerView recyclerView, int positionStart, int itemCount, Object payload) {
        V0();
    }

    public void T0(RecyclerView recyclerView, int from, int to, int itemCount) {
    }

    public void Z0(int widthSpec, int heightSpec) {
        this.f3115b.w(widthSpec, heightSpec);
    }

    public void B1(int widthSize, int heightSize) {
        RecyclerView.f(this.f3115b, widthSize, heightSize);
    }

    public int c0() {
        return c1.C(this.f3115b);
    }

    public int b0() {
        return c1.B(this.f3115b);
    }

    public void K1() {
        a2 a2Var = this.f3120g;
        if (a2Var != null) {
            a2Var.r();
        }
    }

    public void f1(a2 smoothScroller) {
        if (this.f3120g == smoothScroller) {
            this.f3120g = null;
        }
    }

    public void e1(int state) {
    }

    public void k1(t1 recycler) {
        for (int i2 = J() - 1; i2 >= 0; i2--) {
            View view = I(i2);
            if (!RecyclerView.f0(view).J()) {
                n1(i2, recycler);
            }
        }
    }

    public void M0(f info) {
        RecyclerView recyclerView = this.f3115b;
        N0(recyclerView.f1069c, recyclerView.f1078g0, info);
    }

    public void N0(t1 recycler, b2 state, f info) {
        if (this.f3115b.canScrollVertically(-1) || this.f3115b.canScrollHorizontally(-1)) {
            info.a(8192);
            info.n0(true);
        }
        if (this.f3115b.canScrollVertically(1) || this.f3115b.canScrollHorizontally(1)) {
            info.a(4096);
            info.n0(true);
        }
        int k02 = k0(recycler, state);
        int N = N(recycler, state);
        v0();
        l0();
        d collectionInfo = d.a(k02, N, false, 0);
        info.Y(collectionInfo);
    }

    public void K0(AccessibilityEvent event) {
        RecyclerView recyclerView = this.f3115b;
        t1 t1Var = recyclerView.f1069c;
        b2 b2Var = recyclerView.f1078g0;
        L0(event);
    }

    public void L0(AccessibilityEvent event) {
        RecyclerView recyclerView = this.f3115b;
        if (recyclerView != null && event != null) {
            boolean z2 = true;
            if (!recyclerView.canScrollVertically(1) && !this.f3115b.canScrollVertically(-1) && !this.f3115b.canScrollHorizontally(-1) && !this.f3115b.canScrollHorizontally(1)) {
                z2 = false;
            }
            event.setScrollable(z2);
            x0 x0Var = this.f3115b.f1087l;
            if (x0Var != null) {
                event.setItemCount(x0Var.c());
            }
        }
    }

    public void O0(View host, f info) {
        e2 vh = RecyclerView.f0(host);
        if (vh != null && !vh.v() && !this.f3114a.n(vh.f3018a)) {
            RecyclerView recyclerView = this.f3115b;
            P0(recyclerView.f1069c, recyclerView.f1078g0, host, info);
        }
    }

    public void P0(t1 recycler, b2 state, View host, f info) {
        int columnIndexGuess = 0;
        int rowIndexGuess = l() ? h0(host) : 0;
        if (k()) {
            columnIndexGuess = h0(host);
        }
        e itemInfo = e.a(rowIndexGuess, 1, columnIndexGuess, 1, false, false);
        info.Z(itemInfo);
    }

    public void u1() {
        this.f3121h = true;
    }

    public int l0() {
        return 0;
    }

    public int k0(t1 recycler, b2 state) {
        RecyclerView recyclerView = this.f3115b;
        if (recyclerView == null || recyclerView.f1087l == null || !l()) {
            return 1;
        }
        return this.f3115b.f1087l.c();
    }

    public int N(t1 recycler, b2 state) {
        RecyclerView recyclerView = this.f3115b;
        if (recyclerView == null || recyclerView.f1087l == null || !k()) {
            return 1;
        }
        return this.f3115b.f1087l.c();
    }

    public boolean v0() {
        return false;
    }

    public boolean h1(int action, Bundle args) {
        RecyclerView recyclerView = this.f3115b;
        t1 t1Var = recyclerView.f1069c;
        b2 b2Var = recyclerView.f1078g0;
        return g1(action);
    }

    public boolean g1(int action) {
        RecyclerView recyclerView = this.f3115b;
        if (recyclerView == null) {
            return false;
        }
        int vScroll = 0;
        int hScroll = 0;
        switch (action) {
            case 4096:
                if (recyclerView.canScrollVertically(1)) {
                    vScroll = (W() - g0()) - d0();
                }
                if (this.f3115b.canScrollHorizontally(1)) {
                    hScroll = (o0() - e0()) - f0();
                    break;
                }
                break;
            case 8192:
                if (recyclerView.canScrollVertically(-1)) {
                    vScroll = -((W() - g0()) - d0());
                }
                if (this.f3115b.canScrollHorizontally(-1)) {
                    hScroll = -((o0() - e0()) - f0());
                    break;
                }
                break;
        }
        if (vScroll == 0 && hScroll == 0) {
            return false;
        }
        this.f3115b.n1(hScroll, vScroll, null, Integer.MIN_VALUE, true);
        return true;
    }

    public boolean j1(View view, int action, Bundle args) {
        RecyclerView recyclerView = this.f3115b;
        t1 t1Var = recyclerView.f1069c;
        b2 b2Var = recyclerView.f1078g0;
        i1();
        return false;
    }

    public boolean i1() {
        return false;
    }

    public static l1 i0(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        l1 properties = new l1();
        TypedArray a2 = context.obtainStyledAttributes(attrs, a.f2773a, defStyleAttr, defStyleRes);
        int[] iArr = a.f2773a;
        properties.f3105a = a2.getInt(0, 1);
        properties.f3106b = a2.getInt(10, 1);
        properties.f3107c = a2.getBoolean(9, false);
        properties.f3108d = a2.getBoolean(11, false);
        a2.recycle();
        return properties;
    }

    public void z1(RecyclerView recyclerView) {
        A1(View.MeasureSpec.makeMeasureSpec(recyclerView.getWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(recyclerView.getHeight(), 1073741824));
    }

    public boolean G1() {
        return false;
    }

    public boolean q0() {
        int childCount = J();
        for (int i2 = 0; i2 < childCount; i2++) {
            View child = I(i2);
            ViewGroup.LayoutParams lp = child.getLayoutParams();
            if (lp.width < 0 && lp.height < 0) {
                return true;
            }
        }
        return false;
    }
}
