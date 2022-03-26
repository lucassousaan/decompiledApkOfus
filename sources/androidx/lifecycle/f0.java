package androidx.lifecycle;

/* JADX WARN: Classes with same name are omitted:
  
 */
/* loaded from: classes.dex */
public class f0 {

    /* renamed from: a  reason: collision with root package name */
    public final e0 f1016a;

    /* renamed from: b  reason: collision with root package name */
    public final g0 f1017b;

    public f0(g0 store, e0 factory) {
        this.f1016a = factory;
        this.f1017b = store;
    }

    public d0 a(Class cls) {
        String canonicalName = cls.getCanonicalName();
        if (canonicalName != null) {
            return b("androidx.lifecycle.ViewModelProvider.DefaultKey:" + canonicalName, cls);
        }
        throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
    }

    public d0 b(String key, Class cls) {
        d0 viewModel = this.f1017b.b(key);
        if (cls.isInstance(viewModel)) {
            return viewModel;
        }
        d0 viewModel2 = this.f1016a.a(cls);
        this.f1017b.d(key, viewModel2);
        return viewModel2;
    }
}
