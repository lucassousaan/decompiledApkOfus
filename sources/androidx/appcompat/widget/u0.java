package androidx.appcompat.widget;

import android.view.ViewTreeObserver;

/* JADX WARN: Classes with same name are omitted:
  
 */
/* loaded from: classes.dex */
public class u0 implements ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ e1 f543b;

    public u0(e1 this$0) {
        this.f543b = this$0;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public void onGlobalLayout() {
        if (!this.f543b.getInternalPopup().a()) {
            this.f543b.b();
        }
        ViewTreeObserver vto = this.f543b.getViewTreeObserver();
        if (vto != null) {
            vto.removeOnGlobalLayoutListener(this);
        }
    }
}
