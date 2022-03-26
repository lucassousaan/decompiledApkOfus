package s1;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* JADX WARN: Classes with same name are omitted:
  
 */
/* loaded from: classes.dex */
public class h extends AnimatorListenerAdapter {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ k f3494a;

    public h(k this$0) {
        this.f3494a = this$0;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animation) {
        this.f3494a.f3453a.setEndIconVisible(false);
    }
}
