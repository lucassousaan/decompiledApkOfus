package s1;

import android.animation.ValueAnimator;

/* JADX WARN: Classes with same name are omitted:
  
 */
/* loaded from: classes.dex */
public class o implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ z f3516a;

    public o(z this$0) {
        this.f3516a = this$0;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public void onAnimationUpdate(ValueAnimator animation) {
        float alpha = ((Float) animation.getAnimatedValue()).floatValue();
        this.f3516a.f3455c.setAlpha(alpha);
    }
}
