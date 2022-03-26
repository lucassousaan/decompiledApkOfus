package com.google.android.material.behavior;

import android.animation.TimeInterpolator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import s.b;
import w0.a;

/* JADX WARN: Classes with same name are omitted:
  
 */
/* loaded from: classes.dex */
public class HideBottomViewOnScrollBehavior<V extends View> extends b {

    /* renamed from: a  reason: collision with root package name */
    public int f1244a = 0;

    /* renamed from: b  reason: collision with root package name */
    public int f1245b = 2;

    /* renamed from: c  reason: collision with root package name */
    public int f1246c = 0;

    /* renamed from: d  reason: collision with root package name */
    public ViewPropertyAnimator f1247d;

    public HideBottomViewOnScrollBehavior() {
    }

    public HideBottomViewOnScrollBehavior(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    @Override // s.b
    public boolean l(CoordinatorLayout parent, View view, int layoutDirection) {
        ViewGroup.MarginLayoutParams paramsCompat = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        this.f1244a = view.getMeasuredHeight() + paramsCompat.bottomMargin;
        super.l(parent, view, layoutDirection);
        return false;
    }

    @Override // s.b
    public boolean A(CoordinatorLayout coordinatorLayout, View view, View directTargetChild, View target, int nestedScrollAxes, int type) {
        return nestedScrollAxes == 2;
    }

    @Override // s.b
    public void t(CoordinatorLayout coordinatorLayout, View view, View target, int dxConsumed, int dyConsumed, int dxUnconsumed, int dyUnconsumed, int type, int[] consumed) {
        if (dyConsumed > 0) {
            G(view);
        } else if (dyConsumed < 0) {
            H(view);
        }
    }

    public void H(View view) {
        if (this.f1245b != 2) {
            ViewPropertyAnimator viewPropertyAnimator = this.f1247d;
            if (viewPropertyAnimator != null) {
                viewPropertyAnimator.cancel();
                view.clearAnimation();
            }
            this.f1245b = 2;
            F(view, 0, 225L, a.f3654d);
        }
    }

    public void G(View view) {
        if (this.f1245b != 1) {
            ViewPropertyAnimator viewPropertyAnimator = this.f1247d;
            if (viewPropertyAnimator != null) {
                viewPropertyAnimator.cancel();
                view.clearAnimation();
            }
            this.f1245b = 1;
            F(view, this.f1244a + 0, 175L, a.f3653c);
        }
    }

    public final void F(View view, int targetY, long duration, TimeInterpolator interpolator) {
        this.f1247d = view.animate().translationY(targetY).setInterpolator(interpolator).setDuration(duration).setListener(new y0.a(this));
    }
}
