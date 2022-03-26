package q0;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;

/* JADX WARN: Classes with same name are omitted:
  
 */
/* loaded from: classes.dex */
public class n extends AnimatorListenerAdapter {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ o f3138a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ ViewPropertyAnimator f3139b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ View f3140c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ q f3141d;

    public n(q this$0, o oVar, ViewPropertyAnimator viewPropertyAnimator, View view) {
        this.f3141d = this$0;
        this.f3138a = oVar;
        this.f3139b = viewPropertyAnimator;
        this.f3140c = view;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        this.f3141d.D(this.f3138a.f3148b, false);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animator) {
        this.f3139b.setListener(null);
        this.f3140c.setAlpha(1.0f);
        this.f3140c.setTranslationX(0.0f);
        this.f3140c.setTranslationY(0.0f);
        this.f3141d.C(this.f3138a.f3148b, false);
        this.f3141d.f3177r.remove(this.f3138a.f3148b);
        this.f3141d.V();
    }
}
