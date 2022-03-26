package f0;

import android.animation.ValueAnimator;
import android.view.View;
import d.y0;

/* JADX WARN: Classes with same name are omitted:
  
 */
/* loaded from: classes.dex */
public class g1 implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ k1 f1867a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ View f1868b;

    public g1(h1 this$0, k1 k1Var, View view) {
        this.f1867a = k1Var;
        this.f1868b = view;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public void onAnimationUpdate(ValueAnimator valueAnimator) {
        ((y0) this.f1867a).a(this.f1868b);
    }
}
