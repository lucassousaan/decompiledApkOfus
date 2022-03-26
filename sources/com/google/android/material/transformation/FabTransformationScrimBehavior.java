package com.google.android.material.transformation;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import java.util.ArrayList;
import java.util.List;
import w0.b;
import w0.e;

/* JADX WARN: Classes with same name are omitted:
  
 */
@Deprecated
/* loaded from: classes.dex */
public class FabTransformationScrimBehavior extends ExpandableTransformationBehavior {

    /* renamed from: c  reason: collision with root package name */
    public final e f1576c = new e(75, 150);

    /* renamed from: d  reason: collision with root package name */
    public final e f1577d = new e(0, 150);

    public FabTransformationScrimBehavior() {
    }

    public FabTransformationScrimBehavior(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    @Override // s.b
    public boolean e(CoordinatorLayout parent, View child, View dependency) {
        return false;
    }

    @Override // s.b
    public boolean D(CoordinatorLayout parent, View child, MotionEvent ev) {
        super.D(parent, child, ev);
        return false;
    }

    @Override // com.google.android.material.transformation.ExpandableTransformationBehavior
    public AnimatorSet J(View dependency, View child, boolean expanded, boolean isAnimating) {
        List<Animator> animations = new ArrayList<>();
        new ArrayList();
        K(child, expanded, isAnimating, animations);
        AnimatorSet set = new AnimatorSet();
        b.a(set, animations);
        set.addListener(new u1.e(this, expanded, child));
        return set;
    }

    public final void K(View child, boolean expanded, boolean currentlyAnimating, List list) {
        ObjectAnimator objectAnimator;
        e timing = expanded ? this.f1576c : this.f1577d;
        if (expanded) {
            if (!currentlyAnimating) {
                child.setAlpha(0.0f);
            }
            objectAnimator = ObjectAnimator.ofFloat(child, View.ALPHA, 1.0f);
        } else {
            objectAnimator = ObjectAnimator.ofFloat(child, View.ALPHA, 0.0f);
        }
        timing.a(objectAnimator);
        list.add(objectAnimator);
    }
}
