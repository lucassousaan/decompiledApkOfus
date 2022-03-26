package androidx.lifecycle;

/* JADX WARN: Classes with same name are omitted:
  
 */
/* loaded from: classes.dex */
public class q implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ t f1039b;

    public q(t this$0) {
        this.f1039b = this$0;
    }

    @Override // java.lang.Runnable
    public void run() {
        Object newValue;
        synchronized (this.f1039b.f1045a) {
            newValue = this.f1039b.f1050f;
            this.f1039b.f1050f = t.f1044j;
        }
        this.f1039b.i(newValue);
    }
}
