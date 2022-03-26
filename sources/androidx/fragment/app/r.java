package androidx.fragment.app;

import android.app.Dialog;
import android.content.DialogInterface;

/* JADX WARN: Classes with same name are omitted:
  
 */
/* loaded from: classes.dex */
public class r implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ w f893b;

    public r(w this$0) {
        this.f893b = this$0;
    }

    @Override // java.lang.Runnable
    public void run() {
        DialogInterface.OnDismissListener onDismissListener;
        Dialog dialog;
        onDismissListener = this.f893b.Y;
        dialog = this.f893b.f953g0;
        onDismissListener.onDismiss(dialog);
    }
}
