package com.google.android.material.transformation;

import android.animation.AnimatorSet;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import u1.b;

/* JADX WARN: Classes with same name are omitted:
  
 */
@Deprecated
/* loaded from: classes.dex */
public abstract class ExpandableTransformationBehavior extends ExpandableBehavior {

    /* renamed from: b  reason: collision with root package name */
    public AnimatorSet f1569b;

    public abstract AnimatorSet J(View view, View view2, boolean z2, boolean z3);

    public ExpandableTransformationBehavior() {
    }

    public ExpandableTransformationBehavior(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    @Override // com.google.android.material.transformation.ExpandableBehavior
    public boolean H(View dependency, View child, boolean expanded, boolean animated) {
        AnimatorSet animatorSet = this.f1569b;
        boolean currentlyAnimating = animatorSet != null;
        if (currentlyAnimating) {
            animatorSet.cancel();
        }
        AnimatorSet J = J(dependency, child, expanded, currentlyAnimating);
        this.f1569b = J;
        J.addListener(new b(this));
        this.f1569b.start();
        if (!animated) {
            this.f1569b.end();
        }
        return true;
    }
}
