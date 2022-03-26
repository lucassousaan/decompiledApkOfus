package i;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX WARN: Classes with same name are omitted:
  
 */
/* loaded from: classes.dex */
public class d implements ThreadFactory {

    /* renamed from: a  reason: collision with root package name */
    public final AtomicInteger f2222a = new AtomicInteger(0);

    public d(e this$0) {
    }

    @Override // java.util.concurrent.ThreadFactory
    public Thread newThread(Runnable r2) {
        Thread t2 = new Thread(r2);
        t2.setName(String.format("arch_disk_io_%d", Integer.valueOf(this.f2222a.getAndIncrement())));
        return t2;
    }
}
