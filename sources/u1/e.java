package u1;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import com.google.android.material.transformation.FabTransformationScrimBehavior;

/* JADX WARN: Classes with same name are omitted:
  
 */
/* loaded from: classes.dex */
public class e extends AnimatorListenerAdapter {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ boolean f3601a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ View f3602b;

    public e(FabTransformationScrimBehavior this$0, boolean z2, View view) {
        this.f3601a = z2;
        this.f3602b = view;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animation) {
        if (this.f3601a) {
            this.f3602b.setVisibility(0);
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animation) {
        if (!this.f3601a) {
            this.f3602b.setVisibility(4);
        }
    }
}
