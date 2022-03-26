package s1;

import android.animation.ValueAnimator;

/* JADX WARN: Classes with same name are omitted:
  
 */
/* loaded from: classes.dex */
public class j implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ k f3499a;

    public j(k this$0) {
        this.f3499a = this$0;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public void onAnimationUpdate(ValueAnimator animation) {
        float scale = ((Float) animation.getAnimatedValue()).floatValue();
        this.f3499a.f3455c.setScaleX(scale);
        this.f3499a.f3455c.setScaleY(scale);
    }
}
