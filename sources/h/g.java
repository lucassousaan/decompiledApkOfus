package h;

import android.view.View;
import android.view.ViewTreeObserver;

/* JADX WARN: Classes with same name are omitted:
  
 */
/* loaded from: classes.dex */
public class g implements View.OnAttachStateChangeListener {

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ k f2076b;

    public g(k this$0) {
        this.f2076b = this$0;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(View v2) {
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(View v2) {
        ViewTreeObserver viewTreeObserver = this.f2076b.f2110z;
        if (viewTreeObserver != null) {
            if (!viewTreeObserver.isAlive()) {
                this.f2076b.f2110z = v2.getViewTreeObserver();
            }
            k kVar = this.f2076b;
            kVar.f2110z.removeGlobalOnLayoutListener(kVar.f2095k);
        }
        v2.removeOnAttachStateChangeListener(this);
    }
}
