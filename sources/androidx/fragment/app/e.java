package androidx.fragment.app;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;

/* JADX WARN: Classes with same name are omitted:
  
 */
/* loaded from: classes.dex */
public class e extends AnimatorListenerAdapter {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ ViewGroup f745a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ View f746b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ boolean f747c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ s2 f748d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ n f749e;

    public e(q this$0, ViewGroup viewGroup, View view, boolean z2, s2 s2Var, n nVar) {
        this.f745a = viewGroup;
        this.f746b = view;
        this.f747c = z2;
        this.f748d = s2Var;
        this.f749e = nVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator anim) {
        this.f745a.endViewTransition(this.f746b);
        if (this.f747c) {
            this.f748d.e().a(this.f746b);
        }
        this.f749e.a();
    }
}
