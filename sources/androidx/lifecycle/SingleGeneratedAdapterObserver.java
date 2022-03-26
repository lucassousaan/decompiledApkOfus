package androidx.lifecycle;

/* JADX WARN: Classes with same name are omitted:
  
 */
/* loaded from: classes.dex */
class SingleGeneratedAdapterObserver implements k {

    /* renamed from: a  reason: collision with root package name */
    public final f f1005a;

    public SingleGeneratedAdapterObserver(f generatedAdapter) {
        this.f1005a = generatedAdapter;
    }

    @Override // androidx.lifecycle.k
    public void g(m source, h event) {
        this.f1005a.a(source, event, false, null);
        this.f1005a.a(source, event, true, null);
    }
}
