package androidx.fragment.app;

import android.animation.Animator;
import android.view.animation.Animation;

/* JADX WARN: Classes with same name are omitted:
  
 */
/* loaded from: classes.dex */
public class k0 {

    /* renamed from: a  reason: collision with root package name */
    public final Animation f815a;

    /* renamed from: b  reason: collision with root package name */
    public final Animator f816b;

    public k0(Animation animation) {
        this.f815a = animation;
        this.f816b = null;
        if (animation == null) {
            throw new IllegalStateException("Animation cannot be null");
        }
    }

    public k0(Animator animator) {
        this.f815a = null;
        this.f816b = animator;
        if (animator == null) {
            throw new IllegalStateException("Animator cannot be null");
        }
    }
}
