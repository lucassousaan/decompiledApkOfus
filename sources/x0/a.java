package x0;

import android.animation.ValueAnimator;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.appbar.AppBarLayout$BaseBehavior;

/* JADX WARN: Classes with same name are omitted:
  
 */
/* loaded from: classes.dex */
public class a implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ CoordinatorLayout f3692a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ AppBarLayout$BaseBehavior f3693b;

    public a(AppBarLayout$BaseBehavior this$0, CoordinatorLayout coordinatorLayout) {
        this.f3693b = this$0;
        this.f3692a = coordinatorLayout;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public void onAnimationUpdate(ValueAnimator animator) {
        this.f3693b.N(this.f3692a, null, ((Integer) animator.getAnimatedValue()).intValue());
    }
}
