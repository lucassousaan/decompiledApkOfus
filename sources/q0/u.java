package q0;

import android.animation.ValueAnimator;

/* JADX WARN: Classes with same name are omitted:
  
 */
/* loaded from: classes.dex */
public class u implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ v f3218a;

    public u(v vVar) {
        this.f3218a = vVar;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public void onAnimationUpdate(ValueAnimator valueAnimator) {
        int alpha = (int) (((Float) valueAnimator.getAnimatedValue()).floatValue() * 255.0f);
        this.f3218a.f3227c.setAlpha(alpha);
        this.f3218a.f3228d.setAlpha(alpha);
        this.f3218a.v();
    }
}
