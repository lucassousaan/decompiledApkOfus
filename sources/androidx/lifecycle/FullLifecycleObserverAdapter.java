package androidx.lifecycle;

/* JADX WARN: Classes with same name are omitted:
  
 */
/* loaded from: classes.dex */
class FullLifecycleObserverAdapter implements k {

    /* renamed from: a  reason: collision with root package name */
    public final d f998a;

    /* renamed from: b  reason: collision with root package name */
    public final k f999b;

    public FullLifecycleObserverAdapter(d fullLifecycleObserver, k lifecycleEventObserver) {
        this.f998a = fullLifecycleObserver;
        this.f999b = lifecycleEventObserver;
    }

    @Override // androidx.lifecycle.k
    public void g(m source, h event) {
        switch (e.f1015a[event.ordinal()]) {
            case 1:
                this.f998a.e(source);
                break;
            case 2:
                this.f998a.f(source);
                break;
            case 3:
                this.f998a.a(source);
                break;
            case 4:
                this.f998a.b(source);
                break;
            case 5:
                this.f998a.d(source);
                break;
            case 6:
                this.f998a.c(source);
                break;
            case 7:
                throw new IllegalArgumentException("ON_ANY must not been send by anybody");
        }
        k kVar = this.f999b;
        if (kVar != null) {
            kVar.g(source, event);
        }
    }
}
