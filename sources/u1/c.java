package u1;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import com.google.android.material.transformation.FabTransformationBehavior;

/* JADX WARN: Classes with same name are omitted:
  
 */
/* loaded from: classes.dex */
public class c extends AnimatorListenerAdapter {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ boolean f3596a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ View f3597b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ View f3598c;

    public c(FabTransformationBehavior this$0, boolean z2, View view, View view2) {
        this.f3596a = z2;
        this.f3597b = view;
        this.f3598c = view2;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animation) {
        if (this.f3596a) {
            this.f3597b.setVisibility(0);
            this.f3598c.setAlpha(0.0f);
            this.f3598c.setVisibility(4);
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animation) {
        if (!this.f3596a) {
            this.f3597b.setVisibility(4);
            this.f3598c.setAlpha(1.0f);
            this.f3598c.setVisibility(0);
        }
    }
}
