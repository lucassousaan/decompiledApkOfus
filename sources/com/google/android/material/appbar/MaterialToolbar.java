package com.google.android.material.appbar;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Pair;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import com.example.helloworld.R;
import f0.c1;
import l1.q;
import l1.r;
import q1.j;
import q1.k;
import t1.a;

/* JADX WARN: Classes with same name are omitted:
  
 */
/* loaded from: classes.dex */
public class MaterialToolbar extends Toolbar {
    public static final int R = 2131755724;
    public Integer O;
    public boolean P;
    public boolean Q;

    public MaterialToolbar(Context context, AttributeSet attrs) {
        this(context, attrs, R.attr.toolbarStyle);
    }

    public MaterialToolbar(Context context, AttributeSet attrs, int defStyleAttr) {
        super(a.c(context, attrs, defStyleAttr, 2131755724), attrs, defStyleAttr);
        Context context2 = getContext();
        TypedArray a2 = q.h(context2, attrs, v0.a.f3623t, defStyleAttr, 2131755724, new int[0]);
        int[] iArr = v0.a.f3604a;
        if (a2.hasValue(0)) {
            setNavigationIconTint(a2.getColor(0, -1));
        }
        this.P = a2.getBoolean(2, false);
        this.Q = a2.getBoolean(1, false);
        a2.recycle();
        P(context2);
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.ViewGroup, android.view.View
    public void onLayout(boolean changed, int left, int top, int right, int bottom) {
        super.onLayout(changed, left, top, right, bottom);
        R();
    }

    public final void R() {
        if (this.P || this.Q) {
            TextView titleTextView = r.c(this);
            TextView subtitleTextView = r.a(this);
            if (titleTextView != null || subtitleTextView != null) {
                Pair<Integer, Integer> titleBoundLimits = O(titleTextView, subtitleTextView);
                if (this.P && titleTextView != null) {
                    Q(titleTextView, titleBoundLimits);
                }
                if (this.Q && subtitleTextView != null) {
                    Q(subtitleTextView, titleBoundLimits);
                }
            }
        }
    }

    public final Pair O(TextView titleTextView, TextView subtitleTextView) {
        int width = getMeasuredWidth();
        int midpoint = width / 2;
        int leftLimit = getPaddingLeft();
        int rightLimit = width - getPaddingRight();
        for (int i2 = 0; i2 < getChildCount(); i2++) {
            View child = getChildAt(i2);
            if (!(child.getVisibility() == 8 || child == titleTextView || child == subtitleTextView)) {
                if (child.getRight() < midpoint && child.getRight() > leftLimit) {
                    leftLimit = child.getRight();
                }
                if (child.getLeft() > midpoint && child.getLeft() < rightLimit) {
                    rightLimit = child.getLeft();
                }
            }
        }
        return new Pair(Integer.valueOf(leftLimit), Integer.valueOf(rightLimit));
    }

    public final void Q(View titleView, Pair pair) {
        int width = getMeasuredWidth();
        int titleWidth = titleView.getMeasuredWidth();
        int titleLeft = (width / 2) - (titleWidth / 2);
        int titleRight = titleLeft + titleWidth;
        int leftOverlap = Math.max(((Integer) pair.first).intValue() - titleLeft, 0);
        int rightOverlap = Math.max(titleRight - ((Integer) pair.second).intValue(), 0);
        int overlap = Math.max(leftOverlap, rightOverlap);
        if (overlap > 0) {
            titleLeft += overlap;
            titleRight -= overlap;
            titleView.measure(View.MeasureSpec.makeMeasureSpec(titleRight - titleLeft, 1073741824), titleView.getMeasuredHeightAndState());
        }
        titleView.layout(titleLeft, titleView.getTop(), titleRight, titleView.getBottom());
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        k.e(this);
    }

    @Override // android.view.View
    public void setElevation(float elevation) {
        super.setElevation(elevation);
        k.d(this, elevation);
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void setNavigationIcon(Drawable drawable) {
        super.setNavigationIcon(S(drawable));
    }

    public void setNavigationIconTint(int navigationIconTint) {
        this.O = Integer.valueOf(navigationIconTint);
        Drawable navigationIcon = getNavigationIcon();
        if (navigationIcon != null) {
            setNavigationIcon(navigationIcon);
        }
    }

    public void setTitleCentered(boolean titleCentered) {
        if (this.P != titleCentered) {
            this.P = titleCentered;
            requestLayout();
        }
    }

    public void setSubtitleCentered(boolean subtitleCentered) {
        if (this.Q != subtitleCentered) {
            this.Q = subtitleCentered;
            requestLayout();
        }
    }

    public final void P(Context context) {
        Drawable background = getBackground();
        if (background == null || (background instanceof ColorDrawable)) {
            j materialShapeDrawable = new j();
            int backgroundColor = background != null ? ((ColorDrawable) background).getColor() : 0;
            materialShapeDrawable.T(ColorStateList.valueOf(backgroundColor));
            materialShapeDrawable.J(context);
            materialShapeDrawable.S(c1.v(this));
            c1.o0(this, materialShapeDrawable);
        }
    }

    public final Drawable S(Drawable navigationIcon) {
        if (navigationIcon == null || this.O == null) {
            return navigationIcon;
        }
        Drawable wrappedNavigationIcon = y.a.l(navigationIcon);
        y.a.h(wrappedNavigationIcon, this.O.intValue());
        return wrappedNavigationIcon;
    }
}
