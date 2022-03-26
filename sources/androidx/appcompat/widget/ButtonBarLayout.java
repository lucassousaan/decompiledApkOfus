package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import c.a;
import com.example.helloworld.R;
import f0.c1;

/* JADX WARN: Classes with same name are omitted:
  
 */
/* loaded from: classes.dex */
public class ButtonBarLayout extends LinearLayout {

    /* renamed from: b  reason: collision with root package name */
    public boolean f152b;

    /* renamed from: c  reason: collision with root package name */
    public int f153c = -1;

    /* renamed from: d  reason: collision with root package name */
    public int f154d = 0;

    public ButtonBarLayout(Context context, AttributeSet attrs) {
        super(context, attrs);
        int[] iArr = a.f1177k;
        TypedArray ta = context.obtainStyledAttributes(attrs, iArr);
        c1.j0(this, context, iArr, attrs, ta, 0, 0);
        int[] iArr2 = a.f1167a;
        this.f152b = ta.getBoolean(0, true);
        ta.recycle();
    }

    public void setAllowStacking(boolean allowStacking) {
        if (this.f152b != allowStacking) {
            this.f152b = allowStacking;
            if (!allowStacking && getOrientation() == 1) {
                setStacked(false);
            }
            requestLayout();
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    public void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        int initialWidthMeasureSpec;
        int widthSize = View.MeasureSpec.getSize(widthMeasureSpec);
        if (this.f152b) {
            if (widthSize > this.f153c && b()) {
                setStacked(false);
            }
            this.f153c = widthSize;
        }
        boolean needsRemeasure = false;
        if (b() || View.MeasureSpec.getMode(widthMeasureSpec) != 1073741824) {
            initialWidthMeasureSpec = widthMeasureSpec;
        } else {
            initialWidthMeasureSpec = View.MeasureSpec.makeMeasureSpec(widthSize, Integer.MIN_VALUE);
            needsRemeasure = true;
        }
        super.onMeasure(initialWidthMeasureSpec, heightMeasureSpec);
        if (this.f152b && !b()) {
            int measuredWidth = getMeasuredWidthAndState();
            int measuredWidthState = (-16777216) & measuredWidth;
            boolean stack = measuredWidthState == 16777216;
            if (stack) {
                setStacked(true);
                needsRemeasure = true;
            }
        }
        if (needsRemeasure) {
            super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        }
        int minHeight = 0;
        int firstVisible = a(0);
        if (firstVisible >= 0) {
            View firstButton = getChildAt(firstVisible);
            LinearLayout.LayoutParams firstParams = (LinearLayout.LayoutParams) firstButton.getLayoutParams();
            minHeight = 0 + getPaddingTop() + firstButton.getMeasuredHeight() + firstParams.topMargin + firstParams.bottomMargin;
            if (b()) {
                int secondVisible = a(firstVisible + 1);
                if (secondVisible >= 0) {
                    minHeight += getChildAt(secondVisible).getPaddingTop() + ((int) (getResources().getDisplayMetrics().density * 16.0f));
                }
            } else {
                minHeight += getPaddingBottom();
            }
        }
        if (c1.B(this) != minHeight) {
            setMinimumHeight(minHeight);
        }
    }

    public final int a(int index) {
        int count = getChildCount();
        for (int i2 = index; i2 < count; i2++) {
            if (getChildAt(i2).getVisibility() == 0) {
                return i2;
            }
        }
        return -1;
    }

    @Override // android.view.View
    public int getMinimumHeight() {
        return Math.max(0, super.getMinimumHeight());
    }

    private void setStacked(boolean stacked) {
        setOrientation(stacked ? 1 : 0);
        setGravity(stacked ? 8388613 : 80);
        View spacer = findViewById(R.id.spacer);
        if (spacer != null) {
            spacer.setVisibility(stacked ? 8 : 4);
        }
        int childCount = getChildCount();
        for (int i2 = childCount - 2; i2 >= 0; i2--) {
            bringChildToFront(getChildAt(i2));
        }
    }

    public final boolean b() {
        return getOrientation() == 1;
    }
}
