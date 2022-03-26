package c0;

import java.util.concurrent.ThreadFactory;

/* JADX WARN: Classes with same name are omitted:
  
 */
/* loaded from: classes.dex */
public class s implements ThreadFactory {

    /* renamed from: a  reason: collision with root package name */
    public String f1230a;

    /* renamed from: b  reason: collision with root package name */
    public int f1231b;

    public s(String threadName, int priority) {
        this.f1230a = threadName;
        this.f1231b = priority;
    }

    @Override // java.util.concurrent.ThreadFactory
    public Thread newThread(Runnable runnable) {
        return new r(runnable, this.f1230a, this.f1231b);
    }
}
