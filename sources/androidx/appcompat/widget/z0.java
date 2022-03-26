package androidx.appcompat.widget;

import android.view.ViewTreeObserver;
import android.widget.PopupWindow;

/* JADX WARN: Classes with same name are omitted:
  
 */
/* loaded from: classes.dex */
public class z0 implements PopupWindow.OnDismissListener {

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ ViewTreeObserver.OnGlobalLayoutListener f594b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ a1 f595c;

    public z0(a1 this$1, ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener) {
        this.f595c = this$1;
        this.f594b = onGlobalLayoutListener;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public void onDismiss() {
        ViewTreeObserver vto = this.f595c.J.getViewTreeObserver();
        if (vto != null) {
            vto.removeGlobalOnLayoutListener(this.f594b);
        }
    }
}
