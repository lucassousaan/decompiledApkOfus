package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.LinearLayout;
import c.a;
import f0.c1;
import f0.o;

/* JADX WARN: Classes with same name are omitted:
  
 */
/* loaded from: classes.dex */
public abstract class b2 extends ViewGroup {

    /* renamed from: b  reason: collision with root package name */
    public boolean f249b;

    /* renamed from: c  reason: collision with root package name */
    public int f250c;

    /* renamed from: d  reason: collision with root package name */
    public int f251d;

    /* renamed from: e  reason: collision with root package name */
    public int f252e;

    /* renamed from: f  reason: collision with root package name */
    public int f253f;

    /* renamed from: g  reason: collision with root package name */
    public int f254g;

    /* renamed from: h  reason: collision with root package name */
    public float f255h;

    /* renamed from: i  reason: collision with root package name */
    public boolean f256i;

    /* renamed from: j  reason: collision with root package name */
    public int[] f257j;

    /* renamed from: k  reason: collision with root package name */
    public int[] f258k;

    /* renamed from: l  reason: collision with root package name */
    public Drawable f259l;

    /* renamed from: m  reason: collision with root package name */
    public int f260m;

    /* renamed from: n  reason: collision with root package name */
    public int f261n;

    /* renamed from: o  reason: collision with root package name */
    public int f262o;

    /* renamed from: p  reason: collision with root package name */
    public int f263p;

    public b2(Context context, AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public b2(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        this.f249b = true;
        this.f250c = -1;
        this.f251d = 0;
        this.f253f = 8388659;
        int[] iArr = a.f1179m;
        s3 a2 = s3.v(context, attrs, iArr, defStyleAttr, 0);
        c1.j0(this, context, iArr, attrs, a2.r(), defStyleAttr, 0);
        int[] iArr2 = a.f1167a;
        int index = a2.k(1, -1);
        if (index >= 0) {
            setOrientation(index);
        }
        int index2 = a2.k(0, -1);
        if (index2 >= 0) {
            setGravity(index2);
        }
        boolean baselineAligned = a2.a(2, true);
        if (!baselineAligned) {
            setBaselineAligned(baselineAligned);
        }
        this.f255h = a2.i(4, -1.0f);
        this.f250c = a2.k(3, -1);
        this.f256i = a2.a(7, false);
        setDividerDrawable(a2.g(5));
        this.f262o = a2.k(8, 0);
        this.f263p = a2.f(6, 0);
        a2.w();
    }

    public void setShowDividers(int showDividers) {
        if (showDividers != this.f262o) {
            requestLayout();
        }
        this.f262o = showDividers;
    }

    @Override // android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return false;
    }

    public int getShowDividers() {
        return this.f262o;
    }

    public Drawable getDividerDrawable() {
        return this.f259l;
    }

    public void setDividerDrawable(Drawable divider) {
        if (divider != this.f259l) {
            this.f259l = divider;
            boolean z2 = false;
            if (divider != null) {
                this.f260m = divider.getIntrinsicWidth();
                this.f261n = divider.getIntrinsicHeight();
            } else {
                this.f260m = 0;
                this.f261n = 0;
            }
            if (divider == null) {
                z2 = true;
            }
            setWillNotDraw(z2);
            requestLayout();
        }
    }

    public void setDividerPadding(int padding) {
        this.f263p = padding;
    }

    public int getDividerPadding() {
        return this.f263p;
    }

    public int getDividerWidth() {
        return this.f260m;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        if (this.f259l != null) {
            if (this.f252e == 1) {
                h(canvas);
            } else {
                g(canvas);
            }
        }
    }

    public void h(Canvas canvas) {
        int bottom;
        int count = getVirtualChildCount();
        for (int i2 = 0; i2 < count; i2++) {
            View child = s(i2);
            if (!(child == null || child.getVisibility() == 8 || !t(i2))) {
                a2 lp = (a2) child.getLayoutParams();
                int top = (child.getTop() - ((LinearLayout.LayoutParams) lp).topMargin) - this.f261n;
                i(canvas, top);
            }
        }
        if (t(count)) {
            View child2 = s(count - 1);
            if (child2 == null) {
                bottom = (getHeight() - getPaddingBottom()) - this.f261n;
            } else {
                a2 lp2 = (a2) child2.getLayoutParams();
                int bottom2 = child2.getBottom() + ((LinearLayout.LayoutParams) lp2).bottomMargin;
                bottom = bottom2;
            }
            i(canvas, bottom);
        }
    }

    public void g(Canvas canvas) {
        int position;
        int position2;
        int count = getVirtualChildCount();
        boolean isLayoutRtl = l4.b(this);
        for (int i2 = 0; i2 < count; i2++) {
            View child = s(i2);
            if (!(child == null || child.getVisibility() == 8 || !t(i2))) {
                a2 lp = (a2) child.getLayoutParams();
                if (isLayoutRtl) {
                    position2 = child.getRight() + ((LinearLayout.LayoutParams) lp).rightMargin;
                } else {
                    int position3 = child.getLeft();
                    position2 = (position3 - ((LinearLayout.LayoutParams) lp).leftMargin) - this.f260m;
                }
                j(canvas, position2);
            }
        }
        if (t(count)) {
            View child2 = s(count - 1);
            if (child2 != null) {
                a2 lp2 = (a2) child2.getLayoutParams();
                if (isLayoutRtl) {
                    position = (child2.getLeft() - ((LinearLayout.LayoutParams) lp2).leftMargin) - this.f260m;
                } else {
                    int position4 = child2.getRight();
                    position = position4 + ((LinearLayout.LayoutParams) lp2).rightMargin;
                }
            } else if (isLayoutRtl) {
                position = getPaddingLeft();
            } else {
                int position5 = getWidth();
                position = (position5 - getPaddingRight()) - this.f260m;
            }
            j(canvas, position);
        }
    }

    public void i(Canvas canvas, int top) {
        this.f259l.setBounds(getPaddingLeft() + this.f263p, top, (getWidth() - getPaddingRight()) - this.f263p, this.f261n + top);
        this.f259l.draw(canvas);
    }

    public void j(Canvas canvas, int left) {
        this.f259l.setBounds(left, getPaddingTop() + this.f263p, this.f260m + left, (getHeight() - getPaddingBottom()) - this.f263p);
        this.f259l.draw(canvas);
    }

    public void setBaselineAligned(boolean baselineAligned) {
        this.f249b = baselineAligned;
    }

    public void setMeasureWithLargestChildEnabled(boolean enabled) {
        this.f256i = enabled;
    }

    @Override // android.view.View
    public int getBaseline() {
        int majorGravity;
        if (this.f250c < 0) {
            return super.getBaseline();
        }
        int childCount = getChildCount();
        int i2 = this.f250c;
        if (childCount > i2) {
            View child = getChildAt(i2);
            int childBaseline = child.getBaseline();
            if (childBaseline != -1) {
                int childTop = this.f251d;
                if (this.f252e == 1 && (majorGravity = this.f253f & 112) != 48) {
                    switch (majorGravity) {
                        case 16:
                            childTop += ((((getBottom() - getTop()) - getPaddingTop()) - getPaddingBottom()) - this.f254g) / 2;
                            break;
                        case 80:
                            childTop = ((getBottom() - getTop()) - getPaddingBottom()) - this.f254g;
                            break;
                    }
                }
                a2 lp = (a2) child.getLayoutParams();
                return ((LinearLayout.LayoutParams) lp).topMargin + childTop + childBaseline;
            } else if (this.f250c == 0) {
                return -1;
            } else {
                throw new RuntimeException("mBaselineAlignedChildIndex of LinearLayout points to a View that doesn't know how to get its baseline.");
            }
        } else {
            throw new RuntimeException("mBaselineAlignedChildIndex of LinearLayout set to an index that is out of bounds.");
        }
    }

    public int getBaselineAlignedChildIndex() {
        return this.f250c;
    }

    public void setBaselineAlignedChildIndex(int i2) {
        if (i2 < 0 || i2 >= getChildCount()) {
            throw new IllegalArgumentException("base aligned child index out of range (0, " + getChildCount() + ")");
        }
        this.f250c = i2;
    }

    public View s(int index) {
        return getChildAt(index);
    }

    public int getVirtualChildCount() {
        return getChildCount();
    }

    public float getWeightSum() {
        return this.f255h;
    }

    public void setWeightSum(float weightSum) {
        this.f255h = Math.max(0.0f, weightSum);
    }

    @Override // android.view.View
    public void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        if (this.f252e == 1) {
            z(widthMeasureSpec, heightMeasureSpec);
        } else {
            x(widthMeasureSpec, heightMeasureSpec);
        }
    }

    public boolean t(int childIndex) {
        if (childIndex == 0) {
            return (this.f262o & 1) != 0;
        }
        if (childIndex == getChildCount()) {
            return (this.f262o & 4) != 0;
        }
        if ((this.f262o & 2) == 0) {
            return false;
        }
        for (int i2 = childIndex - 1; i2 >= 0; i2--) {
            if (getChildAt(i2).getVisibility() != 8) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:154:0x03b2  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x03b4  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x0438  */
    /* JADX WARN: Removed duplicated region for block: B:190:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void z(int r38, int r39) {
        /*
            Method dump skipped, instructions count: 1084
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.b2.z(int, int):void");
    }

    public final void l(int count, int heightMeasureSpec) {
        int uniformMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824);
        for (int i2 = 0; i2 < count; i2++) {
            View child = s(i2);
            if (child.getVisibility() != 8) {
                a2 lp = (a2) child.getLayoutParams();
                if (((LinearLayout.LayoutParams) lp).width == -1) {
                    int oldHeight = ((LinearLayout.LayoutParams) lp).height;
                    ((LinearLayout.LayoutParams) lp).height = child.getMeasuredHeight();
                    measureChildWithMargins(child, uniformMeasureSpec, 0, heightMeasureSpec, 0);
                    ((LinearLayout.LayoutParams) lp).height = oldHeight;
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:201:0x0551  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x0586  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x063d  */
    /* JADX WARN: Removed duplicated region for block: B:230:0x0645  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void x(int r49, int r50) {
        /*
            Method dump skipped, instructions count: 1610
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.b2.x(int, int):void");
    }

    public final void k(int count, int widthMeasureSpec) {
        int uniformMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824);
        for (int i2 = 0; i2 < count; i2++) {
            View child = s(i2);
            if (child.getVisibility() != 8) {
                a2 lp = (a2) child.getLayoutParams();
                if (((LinearLayout.LayoutParams) lp).height == -1) {
                    int oldWidth = ((LinearLayout.LayoutParams) lp).width;
                    ((LinearLayout.LayoutParams) lp).width = child.getMeasuredWidth();
                    measureChildWithMargins(child, widthMeasureSpec, 0, uniformMeasureSpec, 0);
                    ((LinearLayout.LayoutParams) lp).width = oldWidth;
                }
            }
        }
    }

    public int p(View child, int index) {
        return 0;
    }

    public int y(int childIndex) {
        return 0;
    }

    public void w(View child, int childIndex, int widthMeasureSpec, int totalWidth, int heightMeasureSpec, int totalHeight) {
        measureChildWithMargins(child, widthMeasureSpec, totalWidth, heightMeasureSpec, totalHeight);
    }

    public int q(View child) {
        return 0;
    }

    public int r(View child) {
        return 0;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean changed, int l2, int t2, int r2, int b2) {
        if (this.f252e == 1) {
            v(l2, t2, r2, b2);
        } else {
            u(l2, t2, r2, b2);
        }
    }

    public void v(int left, int top, int right, int bottom) {
        int childTop;
        int paddingLeft;
        int gravity;
        int childLeft;
        int paddingLeft2 = getPaddingLeft();
        int width = right - left;
        int childRight = width - getPaddingRight();
        int childSpace = (width - paddingLeft2) - getPaddingRight();
        int count = getVirtualChildCount();
        int i2 = this.f253f;
        int majorGravity = i2 & 112;
        int minorGravity = i2 & 8388615;
        switch (majorGravity) {
            case 16:
                int childTop2 = getPaddingTop();
                childTop = childTop2 + (((bottom - top) - this.f254g) / 2);
                break;
            case 80:
                int childTop3 = getPaddingTop();
                childTop = ((childTop3 + bottom) - top) - this.f254g;
                break;
            default:
                childTop = getPaddingTop();
                break;
        }
        int i3 = 0;
        while (i3 < count) {
            View child = s(i3);
            if (child == null) {
                y(i3);
                childTop += 0;
                paddingLeft = paddingLeft2;
            } else if (child.getVisibility() != 8) {
                int childWidth = child.getMeasuredWidth();
                int childHeight = child.getMeasuredHeight();
                a2 lp = (a2) child.getLayoutParams();
                int gravity2 = ((LinearLayout.LayoutParams) lp).gravity;
                if (gravity2 < 0) {
                    gravity = minorGravity;
                } else {
                    gravity = gravity2;
                }
                int layoutDirection = c1.A(this);
                int absoluteGravity = o.b(gravity, layoutDirection);
                switch (absoluteGravity & 7) {
                    case 1:
                        int childLeft2 = childSpace - childWidth;
                        childLeft = (((childLeft2 / 2) + paddingLeft2) + ((LinearLayout.LayoutParams) lp).leftMargin) - ((LinearLayout.LayoutParams) lp).rightMargin;
                        break;
                    case 5:
                        int childLeft3 = childRight - childWidth;
                        childLeft = childLeft3 - ((LinearLayout.LayoutParams) lp).rightMargin;
                        break;
                    default:
                        childLeft = ((LinearLayout.LayoutParams) lp).leftMargin + paddingLeft2;
                        break;
                }
                if (t(i3)) {
                    childTop += this.f261n;
                }
                int childTop4 = childTop + ((LinearLayout.LayoutParams) lp).topMargin;
                q(child);
                paddingLeft = paddingLeft2;
                A(child, childLeft, childTop4 + 0, childWidth, childHeight);
                r(child);
                p(child, i3);
                i3 += 0;
                childTop = childTop4 + childHeight + ((LinearLayout.LayoutParams) lp).bottomMargin + 0;
            } else {
                paddingLeft = paddingLeft2;
            }
            i3++;
            paddingLeft2 = paddingLeft;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x010e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void u(int r34, int r35, int r36, int r37) {
        /*
            Method dump skipped, instructions count: 378
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.b2.u(int, int, int, int):void");
    }

    public final void A(View child, int left, int top, int width, int height) {
        child.layout(left, top, left + width, top + height);
    }

    public void setOrientation(int orientation) {
        if (this.f252e != orientation) {
            this.f252e = orientation;
            requestLayout();
        }
    }

    public int getOrientation() {
        return this.f252e;
    }

    public void setGravity(int gravity) {
        if (this.f253f != gravity) {
            if ((8388615 & gravity) == 0) {
                gravity |= 8388611;
            }
            if ((gravity & 112) == 0) {
                gravity |= 48;
            }
            this.f253f = gravity;
            requestLayout();
        }
    }

    public int getGravity() {
        return this.f253f;
    }

    public void setHorizontalGravity(int horizontalGravity) {
        int gravity = horizontalGravity & 8388615;
        int i2 = this.f253f;
        if ((8388615 & i2) != gravity) {
            this.f253f = ((-8388616) & i2) | gravity;
            requestLayout();
        }
    }

    public void setVerticalGravity(int verticalGravity) {
        int gravity = verticalGravity & 112;
        int i2 = this.f253f;
        if ((i2 & 112) != gravity) {
            this.f253f = (i2 & (-113)) | gravity;
            requestLayout();
        }
    }

    /* renamed from: n */
    public a2 generateLayoutParams(AttributeSet attrs) {
        return new a2(getContext(), attrs);
    }

    /* renamed from: m */
    public a2 generateDefaultLayoutParams() {
        int i2 = this.f252e;
        if (i2 == 0) {
            return new a2(-2, -2);
        }
        if (i2 == 1) {
            return new a2(-1, -2);
        }
        return null;
    }

    /* renamed from: o */
    public a2 generateLayoutParams(ViewGroup.LayoutParams p2) {
        return new a2(p2);
    }

    @Override // android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams p2) {
        return p2 instanceof a2;
    }

    @Override // android.view.View
    public void onInitializeAccessibilityEvent(AccessibilityEvent event) {
        super.onInitializeAccessibilityEvent(event);
        event.setClassName("androidx.appcompat.widget.LinearLayoutCompat");
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo info) {
        super.onInitializeAccessibilityNodeInfo(info);
        info.setClassName("androidx.appcompat.widget.LinearLayoutCompat");
    }
}
