package androidx.appcompat.widget;

import android.view.View;
import android.view.Window;
import h.a;

/* JADX WARN: Classes with same name are omitted:
  
 */
/* loaded from: classes.dex */
public class b4 implements View.OnClickListener {

    /* renamed from: b  reason: collision with root package name */
    public final a f265b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ d4 f266c;

    public b4(d4 this$0) {
        this.f266c = this$0;
        this.f265b = new a(this$0.f286a.getContext(), 0, 16908332, 0, this$0.f294i);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View v2) {
        d4 d4Var = this.f266c;
        Window.Callback callback = d4Var.f297l;
        if (callback != null && d4Var.f298m) {
            callback.onMenuItemSelected(0, this.f265b);
        }
    }
}
