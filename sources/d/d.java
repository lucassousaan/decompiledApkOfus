package d;

import android.os.Message;
import android.view.View;

/* JADX WARN: Classes with same name are omitted:
  
 */
/* loaded from: classes.dex */
public class d implements View.OnClickListener {

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ j f1606b;

    public d(j this$0) {
        this.f1606b = this$0;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View v2) {
        Message m2;
        Message message;
        Message message2;
        Message message3;
        j jVar = this.f1606b;
        if (v2 == jVar.f1646o && (message3 = jVar.f1648q) != null) {
            m2 = Message.obtain(message3);
        } else if (v2 == jVar.f1650s && (message2 = jVar.f1652u) != null) {
            m2 = Message.obtain(message2);
        } else if (v2 != jVar.f1654w || (message = jVar.f1656y) == null) {
            m2 = null;
        } else {
            m2 = Message.obtain(message);
        }
        if (m2 != null) {
            m2.sendToTarget();
        }
        j jVar2 = this.f1606b;
        jVar2.R.obtainMessage(1, jVar2.f1633b).sendToTarget();
    }
}
