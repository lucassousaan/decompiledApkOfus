package d;

import android.content.BroadcastReceiver;
import android.content.IntentFilter;

/* JADX WARN: Classes with same name are omitted:
  
 */
/* loaded from: classes.dex */
public abstract class h0 {

    /* renamed from: a  reason: collision with root package name */
    public BroadcastReceiver f1628a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ n0 f1629b;

    public abstract IntentFilter b();

    public abstract int c();

    public abstract void d();

    public h0(n0 this$0) {
        this.f1629b = this$0;
    }

    public void e() {
        a();
        IntentFilter filter = b();
        if (filter != null && filter.countActions() != 0) {
            if (this.f1628a == null) {
                this.f1628a = new g0(this);
            }
            this.f1629b.f1689f.registerReceiver(this.f1628a, filter);
        }
    }

    public void a() {
        BroadcastReceiver broadcastReceiver = this.f1628a;
        if (broadcastReceiver != null) {
            try {
                this.f1629b.f1689f.unregisterReceiver(broadcastReceiver);
            } catch (IllegalArgumentException e2) {
            }
            this.f1628a = null;
        }
    }
}
