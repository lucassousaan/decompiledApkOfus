package androidx.fragment.app;

import android.app.Dialog;
import android.content.DialogInterface;

/* JADX WARN: Classes with same name are omitted:
  
 */
/* loaded from: classes.dex */
public class t implements DialogInterface.OnDismissListener {

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ w f921b;

    public t(w this$0) {
        this.f921b = this$0;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public void onDismiss(DialogInterface dialog) {
        Dialog dialog2;
        Dialog dialog3;
        dialog2 = this.f921b.f953g0;
        if (dialog2 != null) {
            w wVar = this.f921b;
            dialog3 = wVar.f953g0;
            wVar.onDismiss(dialog3);
        }
    }
}
