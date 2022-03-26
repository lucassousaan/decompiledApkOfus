package h;

import android.widget.PopupWindow;

/* JADX WARN: Classes with same name are omitted:
  
 */
/* loaded from: classes.dex */
public class b0 implements PopupWindow.OnDismissListener {

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ c0 f2052b;

    public b0(c0 this$0) {
        this.f2052b = this$0;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public void onDismiss() {
        this.f2052b.e();
    }
}
