package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.example.helloworld.R;
import f0.c1;
import f0.o;

/* JADX WARN: Classes with same name are omitted:
  
 */
/* loaded from: classes.dex */
public class AlertDialogLayout extends b2 {
    public AlertDialogLayout(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    @Override // androidx.appcompat.widget.b2, android.view.View
    public void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        if (!C(widthMeasureSpec, heightMeasureSpec)) {
            super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        }
    }

    public final boolean C(int widthMeasureSpec, int heightMeasureSpec) {
        int childHeightSpec;
        View topPanel = null;
        View buttonPanel = null;
        View middlePanel = null;
        int count = getChildCount();
        for (int i2 = 0; i2 < count; i2++) {
            View child = getChildAt(i2);
            if (child.getVisibility() != 8) {
                int id = child.getId();
                if (id == R.id.topPanel) {
                    topPanel = child;
                } else if (id == R.id.buttonPanel) {
                    buttonPanel = child;
                } else if ((id != R.id.contentPanel && id != R.id.customPanel) || middlePanel != null) {
                    return false;
                } else {
                    middlePanel = child;
                }
            }
        }
        int heightMode = View.MeasureSpec.getMode(heightMeasureSpec);
        int heightSize = View.MeasureSpec.getSize(heightMeasureSpec);
        int widthMode = View.MeasureSpec.getMode(widthMeasureSpec);
        int childState = 0;
        int usedHeight = getPaddingTop() + getPaddingBottom();
        if (topPanel != null) {
            topPanel.measure(widthMeasureSpec, 0);
            usedHeight += topPanel.getMeasuredHeight();
            childState = View.combineMeasuredStates(0, topPanel.getMeasuredState());
        }
        int buttonHeight = 0;
        int buttonWantsHeight = 0;
        if (buttonPanel != null) {
            buttonPanel.measure(widthMeasureSpec, 0);
            buttonHeight = B(buttonPanel);
            buttonWantsHeight = buttonPanel.getMeasuredHeight() - buttonHeight;
            usedHeight += buttonHeight;
            childState = View.combineMeasuredStates(childState, buttonPanel.getMeasuredState());
        }
        int middleHeight = 0;
        if (middlePanel != null) {
            if (heightMode == 0) {
                childHeightSpec = 0;
            } else {
                childHeightSpec = View.MeasureSpec.makeMeasureSpec(Math.max(0, heightSize - usedHeight), heightMode);
            }
            middlePanel.measure(widthMeasureSpec, childHeightSpec);
            middleHeight = middlePanel.getMeasuredHeight();
            usedHeight += middleHeight;
            childState = View.combineMeasuredStates(childState, middlePanel.getMeasuredState());
        }
        int remainingHeight = heightSize - usedHeight;
        if (buttonPanel != null) {
            int usedHeight2 = usedHeight - buttonHeight;
            int heightToGive = Math.min(remainingHeight, buttonWantsHeight);
            if (heightToGive > 0) {
                remainingHeight -= heightToGive;
                buttonHeight += heightToGive;
            }
            int childHeightSpec2 = View.MeasureSpec.makeMeasureSpec(buttonHeight, 1073741824);
            buttonPanel.measure(widthMeasureSpec, childHeightSpec2);
            usedHeight = usedHeight2 + buttonPanel.getMeasuredHeight();
            childState = View.combineMeasuredStates(childState, buttonPanel.getMeasuredState());
            remainingHeight = remainingHeight;
        }
        if (middlePanel != null && remainingHeight > 0) {
            int remainingHeight2 = remainingHeight - remainingHeight;
            int childHeightSpec3 = View.MeasureSpec.makeMeasureSpec(middleHeight + remainingHeight, heightMode);
            middlePanel.measure(widthMeasureSpec, childHeightSpec3);
            usedHeight = (usedHeight - middleHeight) + middlePanel.getMeasuredHeight();
            int childHeightSpec4 = middlePanel.getMeasuredState();
            childState = View.combineMeasuredStates(childState, childHeightSpec4);
            remainingHeight = remainingHeight2;
        }
        int maxWidth = 0;
        int remainingHeight3 = 0;
        while (remainingHeight3 < count) {
            View child2 = getChildAt(remainingHeight3);
            if (child2.getVisibility() != 8) {
                maxWidth = Math.max(maxWidth, child2.getMeasuredWidth());
            }
            remainingHeight3++;
            buttonPanel = buttonPanel;
            middlePanel = middlePanel;
        }
        int i3 = getPaddingLeft();
        int widthSizeAndState = View.resolveSizeAndState(maxWidth + i3 + getPaddingRight(), widthMeasureSpec, childState);
        int heightSizeAndState = View.resolveSizeAndState(usedHeight, heightMeasureSpec, 0);
        setMeasuredDimension(widthSizeAndState, heightSizeAndState);
        if (widthMode == 1073741824) {
            return true;
        }
        l(count, heightMeasureSpec);
        return true;
    }

    private void l(int count, int heightMeasureSpec) {
        int uniformMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824);
        for (int i2 = 0; i2 < count; i2++) {
            View child = getChildAt(i2);
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

    public static int B(View v2) {
        int minHeight = c1.B(v2);
        if (minHeight > 0) {
            return minHeight;
        }
        if (v2 instanceof ViewGroup) {
            ViewGroup vg = (ViewGroup) v2;
            if (vg.getChildCount() == 1) {
                return B(vg.getChildAt(0));
            }
        }
        return 0;
    }

    @Override // androidx.appcompat.widget.b2, android.view.ViewGroup, android.view.View
    public void onLayout(boolean changed, int left, int top, int right, int bottom) {
        int childTop;
        int i2;
        int layoutGravity;
        int childLeft;
        AlertDialogLayout alertDialogLayout = this;
        int paddingLeft = getPaddingLeft();
        int width = right - left;
        int childRight = width - getPaddingRight();
        int childSpace = (width - paddingLeft) - getPaddingRight();
        int totalLength = getMeasuredHeight();
        int count = getChildCount();
        int gravity = getGravity();
        int majorGravity = gravity & 112;
        int minorGravity = gravity & 8388615;
        switch (majorGravity) {
            case 16:
                int childTop2 = getPaddingTop();
                childTop = childTop2 + (((bottom - top) - totalLength) / 2);
                break;
            case 80:
                int childTop3 = getPaddingTop();
                childTop = ((childTop3 + bottom) - top) - totalLength;
                break;
            default:
                childTop = getPaddingTop();
                break;
        }
        Drawable dividerDrawable = getDividerDrawable();
        int dividerHeight = dividerDrawable == null ? 0 : dividerDrawable.getIntrinsicHeight();
        int i3 = 0;
        while (i3 < count) {
            View child = alertDialogLayout.getChildAt(i3);
            if (child == null || child.getVisibility() == 8) {
                i2 = i3;
            } else {
                int childWidth = child.getMeasuredWidth();
                int childHeight = child.getMeasuredHeight();
                a2 lp = (a2) child.getLayoutParams();
                int layoutGravity2 = ((LinearLayout.LayoutParams) lp).gravity;
                if (layoutGravity2 < 0) {
                    layoutGravity = minorGravity;
                } else {
                    layoutGravity = layoutGravity2;
                }
                int layoutDirection = c1.A(this);
                int absoluteGravity = o.b(layoutGravity, layoutDirection);
                switch (absoluteGravity & 7) {
                    case 1:
                        int childLeft2 = ((((childSpace - childWidth) / 2) + paddingLeft) + ((LinearLayout.LayoutParams) lp).leftMargin) - ((LinearLayout.LayoutParams) lp).rightMargin;
                        childLeft = childLeft2;
                        break;
                    case 5:
                        int childLeft3 = childRight - childWidth;
                        int layoutDirection2 = ((LinearLayout.LayoutParams) lp).rightMargin;
                        childLeft = childLeft3 - layoutDirection2;
                        break;
                    default:
                        childLeft = ((LinearLayout.LayoutParams) lp).leftMargin + paddingLeft;
                        break;
                }
                if (alertDialogLayout.t(i3)) {
                    childTop += dividerHeight;
                }
                int childTop4 = childTop + ((LinearLayout.LayoutParams) lp).topMargin;
                i2 = i3;
                A(child, childLeft, childTop4, childWidth, childHeight);
                childTop = childTop4 + childHeight + ((LinearLayout.LayoutParams) lp).bottomMargin;
            }
            i3 = i2 + 1;
            alertDialogLayout = this;
        }
    }

    private void A(View child, int left, int top, int width, int height) {
        child.layout(left, top, left + width, top + height);
    }
}
