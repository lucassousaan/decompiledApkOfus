package androidx.fragment.app;

import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;

/* JADX WARN: Classes with same name are omitted:
  
 */
/* loaded from: classes.dex */
public class h implements Animation.AnimationListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ ViewGroup f788a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ View f789b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ n f790c;

    public h(q this$0, ViewGroup viewGroup, View view, n nVar) {
        this.f788a = viewGroup;
        this.f789b = view;
        this.f790c = nVar;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public void onAnimationStart(Animation animation) {
    }

    @Override // android.view.animation.Animation.AnimationListener
    public void onAnimationEnd(Animation animation) {
        this.f788a.post(new g(this));
    }

    @Override // android.view.animation.Animation.AnimationListener
    public void onAnimationRepeat(Animation animation) {
    }
}
