package d;

import android.content.DialogInterface;
import android.os.Handler;
import android.os.Message;
import java.lang.ref.WeakReference;

/* JADX WARN: Classes with same name are omitted:
  
 */
/* loaded from: classes.dex */
public final class h extends Handler {

    /* renamed from: a  reason: collision with root package name */
    public WeakReference f1627a;

    public h(DialogInterface dialog) {
        this.f1627a = new WeakReference(dialog);
    }

    @Override // android.os.Handler
    public void handleMessage(Message msg) {
        switch (msg.what) {
            case -3:
            case -2:
            case -1:
                ((DialogInterface.OnClickListener) msg.obj).onClick((DialogInterface) this.f1627a.get(), msg.what);
                return;
            case 0:
            default:
                return;
            case 1:
                ((DialogInterface) msg.obj).dismiss();
                return;
        }
    }
}
