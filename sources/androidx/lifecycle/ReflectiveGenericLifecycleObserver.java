package androidx.lifecycle;

/* JADX WARN: Classes with same name are omitted:
  
 */
/* loaded from: classes.dex */
class ReflectiveGenericLifecycleObserver implements k {

    /* renamed from: a  reason: collision with root package name */
    public final Object f1000a;

    /* renamed from: b  reason: collision with root package name */
    public final a f1001b;

    public ReflectiveGenericLifecycleObserver(Object wrapped) {
        this.f1000a = wrapped;
        this.f1001b = c.f1011c.c(wrapped.getClass());
    }

    @Override // androidx.lifecycle.k
    public void g(m source, h event) {
        this.f1001b.a(source, event, this.f1000a);
    }
}
