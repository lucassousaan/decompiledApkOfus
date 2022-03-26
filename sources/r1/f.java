package r1;

import a1.a;
import android.os.Handler;
import android.os.Message;

/* JADX WARN: Classes with same name are omitted:
  
 */
/* loaded from: classes.dex */
public class f implements Handler.Callback {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ i f3421a;

    public f(i this$0) {
        this.f3421a = this$0;
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(Message message) {
        switch (message.what) {
            case 0:
                i iVar = this.f3421a;
                a.a(message.obj);
                iVar.c(null);
                return true;
            default:
                return false;
        }
    }
}
