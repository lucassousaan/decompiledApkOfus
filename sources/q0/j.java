package q0;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;

/* JADX WARN: Classes with same name are omitted:
  
 */
/* loaded from: classes.dex */
public class j extends AnimatorListenerAdapter {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ e2 f3077a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ ViewPropertyAnimator f3078b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ View f3079c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ q f3080d;

    public j(q this$0, e2 e2Var, ViewPropertyAnimator viewPropertyAnimator, View view) {
        this.f3080d = this$0;
        this.f3077a = e2Var;
        this.f3078b = viewPropertyAnimator;
        this.f3079c = view;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        this.f3080d.H(this.f3077a);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animator) {
        this.f3078b.setListener(null);
        this.f3079c.setAlpha(1.0f);
        this.f3080d.G(this.f3077a);
        this.f3080d.f3176q.remove(this.f3077a);
        this.f3080d.V();
    }
}
