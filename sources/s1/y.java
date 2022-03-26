package s1;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import com.google.android.material.internal.CheckableImageButton;

/* JADX WARN: Classes with same name are omitted:
  
 */
/* loaded from: classes.dex */
public class y extends AnimatorListenerAdapter {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ z f3536a;

    public y(z this$0) {
        this.f3536a = this$0;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animation) {
        boolean z2;
        ValueAnimator valueAnimator;
        z zVar = this.f3536a;
        CheckableImageButton checkableImageButton = zVar.f3455c;
        z2 = zVar.f3544j;
        checkableImageButton.setChecked(z2);
        valueAnimator = this.f3536a.f3550p;
        valueAnimator.start();
    }
}
