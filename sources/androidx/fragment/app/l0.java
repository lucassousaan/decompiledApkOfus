package androidx.fragment.app;

import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.Transformation;
import f0.d0;

/* JADX WARN: Classes with same name are omitted:
  
 */
/* loaded from: classes.dex */
public class l0 extends AnimationSet implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    public final ViewGroup f825b;

    /* renamed from: c  reason: collision with root package name */
    public final View f826c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f827d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f828e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f829f = true;

    public l0(Animation animation, ViewGroup parent, View child) {
        super(false);
        this.f825b = parent;
        this.f826c = child;
        addAnimation(animation);
        parent.post(this);
    }

    @Override // android.view.animation.AnimationSet, android.view.animation.Animation
    public boolean getTransformation(long currentTime, Transformation t2) {
        this.f829f = true;
        if (this.f827d) {
            return true ^ this.f828e;
        }
        boolean more = super.getTransformation(currentTime, t2);
        if (!more) {
            this.f827d = true;
            d0.a(this.f825b, this);
        }
        return true;
    }

    @Override // android.view.animation.Animation
    public boolean getTransformation(long currentTime, Transformation outTransformation, float scale) {
        this.f829f = true;
        if (this.f827d) {
            return true ^ this.f828e;
        }
        boolean more = super.getTransformation(currentTime, outTransformation, scale);
        if (!more) {
            this.f827d = true;
            d0.a(this.f825b, this);
        }
        return true;
    }

    @Override // java.lang.Runnable
    public void run() {
        if (this.f827d || !this.f829f) {
            this.f825b.endViewTransition(this.f826c);
            this.f828e = true;
            return;
        }
        this.f829f = false;
        this.f825b.post(this);
    }
}
