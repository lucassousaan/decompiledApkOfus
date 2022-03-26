package s1;

import android.animation.ValueAnimator;
import com.google.android.material.textfield.TextInputLayout;

/* JADX WARN: Classes with same name are omitted:
  
 */
/* loaded from: classes.dex */
public class p0 implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ TextInputLayout f3519a;

    public p0(TextInputLayout this$0) {
        this.f3519a = this$0;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public void onAnimationUpdate(ValueAnimator animator) {
        this.f3519a.H0.X(((Float) animator.getAnimatedValue()).floatValue());
    }
}
