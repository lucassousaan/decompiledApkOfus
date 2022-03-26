package h;

import android.view.View;
import android.view.ViewTreeObserver;

/* JADX WARN: Classes with same name are omitted:
  
 */
/* loaded from: classes.dex */
public class k0 implements View.OnAttachStateChangeListener {

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ l0 f2111b;

    public k0(l0 this$0) {
        this.f2111b = this$0;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(View v2) {
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(View v2) {
        ViewTreeObserver viewTreeObserver = this.f2111b.f2129q;
        if (viewTreeObserver != null) {
            if (!viewTreeObserver.isAlive()) {
                this.f2111b.f2129q = v2.getViewTreeObserver();
            }
            l0 l0Var = this.f2111b;
            l0Var.f2129q.removeGlobalOnLayoutListener(l0Var.f2123k);
        }
        v2.removeOnAttachStateChangeListener(this);
    }
}
