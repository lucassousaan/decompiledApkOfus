package q0;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;

/* JADX WARN: Classes with same name are omitted:
  
 */
/* loaded from: classes.dex */
public class m extends AnimatorListenerAdapter {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ o f3110a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ ViewPropertyAnimator f3111b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ View f3112c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ q f3113d;

    public m(q this$0, o oVar, ViewPropertyAnimator viewPropertyAnimator, View view) {
        this.f3113d = this$0;
        this.f3110a = oVar;
        this.f3111b = viewPropertyAnimator;
        this.f3112c = view;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        this.f3113d.D(this.f3110a.f3147a, true);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animator) {
        this.f3111b.setListener(null);
        this.f3112c.setAlpha(1.0f);
        this.f3112c.setTranslationX(0.0f);
        this.f3112c.setTranslationY(0.0f);
        this.f3113d.C(this.f3110a.f3147a, true);
        this.f3113d.f3177r.remove(this.f3110a.f3147a);
        this.f3113d.V();
    }
}
