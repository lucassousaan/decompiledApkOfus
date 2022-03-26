package x0;

import a0.a;
import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import f0.c1;
import f0.o;
import f0.x1;
import java.util.List;
import s.e;

/* JADX WARN: Classes with same name are omitted:
  
 */
/* loaded from: classes.dex */
public abstract class g extends h {

    /* renamed from: d  reason: collision with root package name */
    public final Rect f3703d = new Rect();

    /* renamed from: e  reason: collision with root package name */
    public final Rect f3704e = new Rect();

    /* renamed from: f  reason: collision with root package name */
    public int f3705f = 0;

    /* renamed from: g  reason: collision with root package name */
    public int f3706g;

    public abstract View H(List list);

    public abstract float J(View view);

    public g() {
    }

    public g(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    @Override // s.b
    public boolean m(CoordinatorLayout parent, View child, int parentWidthMeasureSpec, int widthUsed, int parentHeightMeasureSpec, int heightUsed) {
        x1 parentInsets;
        int childLpHeight = child.getLayoutParams().height;
        if (childLpHeight != -1 && childLpHeight != -2) {
            return false;
        }
        List<View> dependencies = parent.r(child);
        H(dependencies);
        View header = null;
        if (0 == 0) {
            return false;
        }
        int availableHeight = View.MeasureSpec.getSize(parentHeightMeasureSpec);
        if (availableHeight <= 0) {
            availableHeight = parent.getHeight();
        } else if (c1.x(null) && (parentInsets = parent.getLastWindowInsets()) != null) {
            availableHeight += parentInsets.i() + parentInsets.f();
        }
        int height = L(null) + availableHeight;
        int headerHeight = header.getMeasuredHeight();
        P();
        int heightMeasureSpec = View.MeasureSpec.makeMeasureSpec(height - headerHeight, childLpHeight == -1 ? 1073741824 : Integer.MIN_VALUE);
        parent.J(child, parentWidthMeasureSpec, widthUsed, heightMeasureSpec, heightUsed);
        return true;
    }

    @Override // x0.h
    public void F(CoordinatorLayout parent, View child, int layoutDirection) {
        List<View> dependencies = parent.r(child);
        H(dependencies);
        View header = null;
        if (0 != 0) {
            e lp = (e) child.getLayoutParams();
            Rect available = this.f3703d;
            available.set(parent.getPaddingLeft() + ((ViewGroup.MarginLayoutParams) lp).leftMargin, header.getBottom() + ((ViewGroup.MarginLayoutParams) lp).topMargin, (parent.getWidth() - parent.getPaddingRight()) - ((ViewGroup.MarginLayoutParams) lp).rightMargin, ((parent.getHeight() + header.getBottom()) - parent.getPaddingBottom()) - ((ViewGroup.MarginLayoutParams) lp).bottomMargin);
            x1 parentInsets = parent.getLastWindowInsets();
            if (parentInsets != null && c1.x(parent) && !c1.x(child)) {
                available.left += parentInsets.g();
                available.right -= parentInsets.h();
            }
            Rect out = this.f3704e;
            o.a(N(lp.f3429c), child.getMeasuredWidth(), child.getMeasuredHeight(), available, out, layoutDirection);
            int overlap = I(null);
            child.layout(out.left, out.top - overlap, out.right, out.bottom - overlap);
            this.f3705f = out.top - header.getBottom();
            return;
        }
        super.F(parent, child, layoutDirection);
        this.f3705f = 0;
    }

    public boolean P() {
        return false;
    }

    public final int I(View header) {
        if (this.f3706g == 0) {
            return 0;
        }
        J(header);
        int i2 = this.f3706g;
        return a.b((int) (0.0f * i2), 0, i2);
    }

    public static int N(int gravity) {
        if (gravity == 0) {
            return 8388659;
        }
        return gravity;
    }

    public int L(View v2) {
        return v2.getMeasuredHeight();
    }

    public final int M() {
        return this.f3705f;
    }

    public final void O(int overlayTop) {
        this.f3706g = overlayTop;
    }

    public final int K() {
        return this.f3706g;
    }
}
