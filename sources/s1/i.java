package s1;

import android.animation.ValueAnimator;

/* JADX WARN: Classes with same name are omitted:
  
 */
/* loaded from: classes.dex */
public class i implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ k f3496a;

    public i(k this$0) {
        this.f3496a = this$0;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public void onAnimationUpdate(ValueAnimator animation) {
        float alpha = ((Float) animation.getAnimatedValue()).floatValue();
        this.f3496a.f3455c.setAlpha(alpha);
    }
}
