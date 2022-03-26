package q0;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* JADX WARN: Classes with same name are omitted:
  
 */
/* loaded from: classes.dex */
public class t extends AnimatorListenerAdapter {

    /* renamed from: a  reason: collision with root package name */
    public boolean f3202a = false;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ v f3203b;

    public t(v vVar) {
        this.f3203b = vVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animation) {
        if (this.f3202a) {
            this.f3202a = false;
        } else if (((Float) this.f3203b.f3250z.getAnimatedValue()).floatValue() == 0.0f) {
            v vVar = this.f3203b;
            vVar.A = 0;
            vVar.y(0);
        } else {
            v vVar2 = this.f3203b;
            vVar2.A = 2;
            vVar2.v();
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animation) {
        this.f3202a = true;
    }
}
