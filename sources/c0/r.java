package c0;

import android.os.Process;

/* JADX WARN: Classes with same name are omitted:
  
 */
/* loaded from: classes.dex */
public class r extends Thread {

    /* renamed from: b  reason: collision with root package name */
    public final int f1229b;

    public r(Runnable target, String name, int priority) {
        super(target, name);
        this.f1229b = priority;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public void run() {
        Process.setThreadPriority(this.f1229b);
        super.run();
    }
}
