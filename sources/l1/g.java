package l1;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import com.example.helloworld.R;
import f0.c1;
import f0.s;
import v0.a;

/* JADX WARN: Classes with same name are omitted:
  
 */
/* loaded from: classes.dex */
public abstract class g extends ViewGroup {

    /* renamed from: b  reason: collision with root package name */
    public int f2430b;

    /* renamed from: c  reason: collision with root package name */
    public int f2431c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f2432d = false;

    /* renamed from: e  reason: collision with root package name */
    public int f2433e;

    public g(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        d(context, attrs);
    }

    public final void d(Context context, AttributeSet attrs) {
        TypedArray array = context.getTheme().obtainStyledAttributes(attrs, a.f3611h, 0, 0);
        int[] iArr = a.f3604a;
        this.f2430b = array.getDimensionPixelSize(1, 0);
        this.f2431c = array.getDimensionPixelSize(0, 0);
        array.recycle();
    }

    public int getLineSpacing() {
        return this.f2430b;
    }

    public void setLineSpacing(int lineSpacing) {
        this.f2430b = lineSpacing;
    }

    public int getItemSpacing() {
        return this.f2431c;
    }

    public void setItemSpacing(int itemSpacing) {
        this.f2431c = itemSpacing;
    }

    public boolean c() {
        return this.f2432d;
    }

    public void setSingleLine(boolean singleLine) {
        this.f2432d = singleLine;
    }

    @Override // android.view.View
    public void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        int maxWidth;
        int width = View.MeasureSpec.getSize(widthMeasureSpec);
        int widthMode = View.MeasureSpec.getMode(widthMeasureSpec);
        int height = View.MeasureSpec.getSize(heightMeasureSpec);
        int heightMode = View.MeasureSpec.getMode(heightMeasureSpec);
        int maxWidth2 = (widthMode == Integer.MIN_VALUE || widthMode == 1073741824) ? width : Integer.MAX_VALUE;
        int childLeft = getPaddingLeft();
        int childTop = getPaddingTop();
        int childBottom = childTop;
        int maxChildRight = 0;
        int maxRight = maxWidth2 - getPaddingRight();
        int i2 = 0;
        while (i2 < getChildCount()) {
            View child = getChildAt(i2);
            if (child.getVisibility() == 8) {
                maxWidth = maxWidth2;
            } else {
                measureChild(child, widthMeasureSpec, heightMeasureSpec);
                maxWidth = maxWidth2;
                ViewGroup.LayoutParams lp = child.getLayoutParams();
                int leftMargin = 0;
                int rightMargin = 0;
                if (lp instanceof ViewGroup.MarginLayoutParams) {
                    ViewGroup.MarginLayoutParams marginLp = (ViewGroup.MarginLayoutParams) lp;
                    leftMargin = 0 + marginLp.leftMargin;
                    rightMargin = 0 + marginLp.rightMargin;
                }
                if (childLeft + leftMargin + child.getMeasuredWidth() <= maxRight || c()) {
                    childTop = childTop;
                } else {
                    childLeft = getPaddingLeft();
                    childTop = this.f2430b + childBottom;
                }
                int childRight = childLeft + leftMargin + child.getMeasuredWidth();
                int childBottom2 = child.getMeasuredHeight() + childTop;
                if (childRight > maxChildRight) {
                    maxChildRight = childRight;
                }
                int childBottom3 = this.f2431c;
                childLeft += leftMargin + rightMargin + child.getMeasuredWidth() + childBottom3;
                if (i2 == getChildCount() - 1) {
                    maxChildRight += rightMargin;
                    childBottom = childBottom2;
                } else {
                    childBottom = childBottom2;
                }
            }
            i2++;
            maxWidth2 = maxWidth;
        }
        int maxChildRight2 = maxChildRight + getPaddingRight();
        int childBottom4 = childBottom + getPaddingBottom();
        int finalWidth = a(width, widthMode, maxChildRight2);
        int finalHeight = a(height, heightMode, childBottom4);
        setMeasuredDimension(finalWidth, finalHeight);
    }

    public static int a(int size, int mode, int childrenEdge) {
        switch (mode) {
            case Integer.MIN_VALUE:
                return Math.min(childrenEdge, size);
            case 1073741824:
                return size;
            default:
                return childrenEdge;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean sizeChanged, int left, int top, int right, int bottom) {
        boolean isRtl = false;
        if (getChildCount() == 0) {
            this.f2433e = 0;
            return;
        }
        int i2 = 1;
        this.f2433e = 1;
        if (c1.A(this) == 1) {
            isRtl = true;
        }
        int paddingStart = isRtl ? getPaddingRight() : getPaddingLeft();
        int paddingEnd = isRtl ? getPaddingLeft() : getPaddingRight();
        int childStart = paddingStart;
        int childTop = getPaddingTop();
        int childBottom = childTop;
        int maxChildEnd = (right - left) - paddingEnd;
        int i3 = 0;
        while (i3 < getChildCount()) {
            View child = getChildAt(i3);
            if (child.getVisibility() == 8) {
                child.setTag(R.id.row_index_key, -1);
            } else {
                ViewGroup.LayoutParams lp = child.getLayoutParams();
                int startMargin = 0;
                int endMargin = 0;
                if (lp instanceof ViewGroup.MarginLayoutParams) {
                    ViewGroup.MarginLayoutParams marginLp = (ViewGroup.MarginLayoutParams) lp;
                    startMargin = s.b(marginLp);
                    endMargin = s.a(marginLp);
                }
                int childEnd = childStart + startMargin + child.getMeasuredWidth();
                if (!this.f2432d && childEnd > maxChildEnd) {
                    childStart = paddingStart;
                    childTop = childBottom + this.f2430b;
                    this.f2433e += i2;
                }
                child.setTag(R.id.row_index_key, Integer.valueOf(this.f2433e - i2));
                int childEnd2 = childStart + startMargin + child.getMeasuredWidth();
                int childBottom2 = child.getMeasuredHeight() + childTop;
                if (isRtl) {
                    child.layout(maxChildEnd - childEnd2, childTop, (maxChildEnd - childStart) - startMargin, childBottom2);
                } else {
                    child.layout(childStart + startMargin, childTop, childEnd2, childBottom2);
                }
                childStart += startMargin + endMargin + child.getMeasuredWidth() + this.f2431c;
                childBottom = childBottom2;
            }
            i3++;
            i2 = 1;
        }
    }

    public int getRowCount() {
        return this.f2433e;
    }

    public int b(View child) {
        Object index = child.getTag(R.id.row_index_key);
        if (!(index instanceof Integer)) {
            return -1;
        }
        return ((Integer) index).intValue();
    }
}
