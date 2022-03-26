package q0;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;

/* JADX WARN: Classes with same name are omitted:
  
 */
/* loaded from: classes.dex */
public class l extends AnimatorListenerAdapter {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ e2 f3098a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ int f3099b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ View f3100c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ int f3101d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ ViewPropertyAnimator f3102e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ q f3103f;

    public l(q this$0, e2 e2Var, int i2, View view, int i3, ViewPropertyAnimator viewPropertyAnimator) {
        this.f3103f = this$0;
        this.f3098a = e2Var;
        this.f3099b = i2;
        this.f3100c = view;
        this.f3101d = i3;
        this.f3102e = viewPropertyAnimator;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        this.f3103f.F(this.f3098a);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
        if (this.f3099b != 0) {
            this.f3100c.setTranslationX(0.0f);
        }
        if (this.f3101d != 0) {
            this.f3100c.setTranslationY(0.0f);
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animator) {
        this.f3102e.setListener(null);
        this.f3103f.E(this.f3098a);
        this.f3103f.f3175p.remove(this.f3098a);
        this.f3103f.V();
    }
}
