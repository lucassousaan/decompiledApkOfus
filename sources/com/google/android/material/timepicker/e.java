package com.google.android.material.timepicker;

import android.animation.ValueAnimator;

/* JADX WARN: Classes with same name are omitted:
  
 */
/* loaded from: classes.dex */
public class e implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ ClockHandView f1554a;

    public e(ClockHandView this$0) {
        this.f1554a = this$0;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public void onAnimationUpdate(ValueAnimator animation) {
        float animatedValue = ((Float) animation.getAnimatedValue()).floatValue();
        this.f1554a.m(animatedValue, true);
    }
}
