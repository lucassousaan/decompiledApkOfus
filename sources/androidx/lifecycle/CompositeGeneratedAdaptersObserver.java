package androidx.lifecycle;

/* JADX WARN: Classes with same name are omitted:
  
 */
/* loaded from: classes.dex */
class CompositeGeneratedAdaptersObserver implements k {

    /* renamed from: a  reason: collision with root package name */
    public final f[] f997a;

    public CompositeGeneratedAdaptersObserver(f[] generatedAdapters) {
        this.f997a = generatedAdapters;
    }

    @Override // androidx.lifecycle.k
    public void g(m source, h event) {
        f[] fVarArr;
        f[] fVarArr2;
        u logger = new u();
        for (f mGenerated : this.f997a) {
            mGenerated.a(source, event, false, logger);
        }
        for (f mGenerated2 : this.f997a) {
            mGenerated2.a(source, event, true, logger);
        }
    }
}
