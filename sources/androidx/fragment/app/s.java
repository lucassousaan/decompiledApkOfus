package androidx.fragment.app;

import android.app.Dialog;
import android.content.DialogInterface;

/* JADX WARN: Classes with same name are omitted:
  
 */
/* loaded from: classes.dex */
public class s implements DialogInterface.OnCancelListener {

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ w f911b;

    public s(w this$0) {
        this.f911b = this$0;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public void onCancel(DialogInterface dialog) {
        Dialog dialog2;
        Dialog dialog3;
        dialog2 = this.f911b.f953g0;
        if (dialog2 != null) {
            w wVar = this.f911b;
            dialog3 = wVar.f953g0;
            wVar.onCancel(dialog3);
        }
    }
}
