package com.google.android.material.appbar;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import f0.c1;
import java.util.List;
import s.b;
import v0.a;
import x0.e;
import x0.g;

/* JADX WARN: Classes with same name are omitted:
  
 */
/* loaded from: classes.dex */
public class AppBarLayout$ScrollingViewBehavior extends g {
    @Override // x0.g
    public /* bridge */ /* synthetic */ View H(List list) {
        Q(list);
        return null;
    }

    public AppBarLayout$ScrollingViewBehavior() {
    }

    public AppBarLayout$ScrollingViewBehavior(Context context, AttributeSet attrs) {
        super(context, attrs);
        TypedArray a2 = context.obtainStyledAttributes(attrs, a.f3625v);
        int[] iArr = a.f3604a;
        O(a2.getDimensionPixelSize(0, 0));
        a2.recycle();
    }

    @Override // s.b
    public boolean e(CoordinatorLayout parent, View child, View dependency) {
        return false;
    }

    @Override // s.b
    public boolean h(CoordinatorLayout parent, View child, View dependency) {
        R(child, dependency);
        S(child, dependency);
        return false;
    }

    @Override // s.b
    public void i(CoordinatorLayout parent, View child, View dependency) {
    }

    @Override // s.b
    public boolean w(CoordinatorLayout parent, View child, Rect rectangle, boolean immediate) {
        Q(parent.r(child));
        e header = null;
        if (0 != 0) {
            rectangle.offset(child.getLeft(), child.getTop());
            Rect parentRect = this.f3703d;
            parentRect.set(0, 0, parent.getWidth(), parent.getHeight());
            if (!parentRect.contains(rectangle)) {
                header.k(false, !immediate);
                return true;
            }
        }
        return false;
    }

    public final void R(View child, View dependency) {
        int i2;
        b behavior = ((s.e) dependency.getLayoutParams()).f();
        if (behavior instanceof AppBarLayout$BaseBehavior) {
            AppBarLayout$BaseBehavior ablBehavior = (AppBarLayout$BaseBehavior) behavior;
            int bottom = dependency.getBottom() - child.getTop();
            i2 = ablBehavior.f1237j;
            c1.W(child, ((bottom + i2) + M()) - I(dependency));
        }
    }

    @Override // x0.g
    public float J(View header) {
        return 0.0f;
    }

    public void Q(List list) {
        int z2 = list.size();
        for (int i2 = 0; i2 < z2; i2++) {
            View view = (View) list.get(i2);
        }
    }

    @Override // x0.g
    public int L(View v2) {
        return super.L(v2);
    }

    public final void S(View child, View dependency) {
    }
}
