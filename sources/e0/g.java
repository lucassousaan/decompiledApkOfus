package e0;

/* JADX WARN: Classes with same name are omitted:
  
 */
/* loaded from: classes.dex */
public class g extends f {

    /* renamed from: c  reason: collision with root package name */
    public final Object f1808c = new Object();

    /* JADX WARN: Generic types in debug info not equals: e0.g != androidx.core.util.Pools$SynchronizedPool<T> */
    public g(int maxPoolSize) {
        super(maxPoolSize);
    }

    /* JADX WARN: Generic types in debug info not equals: e0.g != androidx.core.util.Pools$SynchronizedPool<T> */
    @Override // e0.f, e0.e
    public Object b() {
        Object b2;
        synchronized (this.f1808c) {
            b2 = super.b();
        }
        return b2;
    }

    /* JADX WARN: Generic types in debug info not equals: e0.g != androidx.core.util.Pools$SynchronizedPool<T> */
    @Override // e0.f, e0.e
    public boolean a(Object obj) {
        boolean a2;
        synchronized (this.f1808c) {
            a2 = super.a(obj);
        }
        return a2;
    }
}
