package androidx.appcompat.widget;

import android.view.ViewTreeObserver;

/* JADX WARN: Classes with same name are omitted:
  
 */
/* loaded from: classes.dex */
public class y0 implements ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ a1 f588b;

    public y0(a1 this$1) {
        this.f588b = this$1;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public void onGlobalLayout() {
        a1 a1Var = this.f588b;
        if (!a1Var.U(a1Var.J)) {
            this.f588b.dismiss();
            return;
        }
        this.f588b.S();
        this.f588b.i();
    }
}
