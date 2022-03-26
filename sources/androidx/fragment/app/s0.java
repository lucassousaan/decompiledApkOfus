package androidx.fragment.app;

import android.view.View;
import android.view.ViewGroup;

/* JADX WARN: Classes with same name are omitted:
  
 */
/* loaded from: classes.dex */
public class s0 implements View.OnAttachStateChangeListener {

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ w1 f912b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ t0 f913c;

    public s0(t0 this$0, w1 w1Var) {
        this.f913c = this$0;
        this.f912b = w1Var;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(View v2) {
        f0 fragment = this.f912b.k();
        this.f912b.m();
        t2 controller = t2.n((ViewGroup) fragment.H.getParent(), this.f913c.f922b);
        controller.j();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(View v2) {
    }
}
