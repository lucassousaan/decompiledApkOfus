package q0;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;

/* JADX WARN: Classes with same name are omitted:
  
 */
/* loaded from: classes.dex */
public class k extends AnimatorListenerAdapter {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ e2 f3092a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ View f3093b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ ViewPropertyAnimator f3094c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ q f3095d;

    public k(q this$0, e2 e2Var, View view, ViewPropertyAnimator viewPropertyAnimator) {
        this.f3095d = this$0;
        this.f3092a = e2Var;
        this.f3093b = view;
        this.f3094c = viewPropertyAnimator;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        this.f3095d.B(this.f3092a);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
        this.f3093b.setAlpha(1.0f);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animator) {
        this.f3094c.setListener(null);
        this.f3095d.A(this.f3092a);
        this.f3095d.f3174o.remove(this.f3092a);
        this.f3095d.V();
    }
}
