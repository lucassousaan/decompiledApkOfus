package androidx.activity;

/* JADX WARN: Classes with same name are omitted:
  
 */
/* loaded from: classes.dex */
public class g implements a {

    /* renamed from: a  reason: collision with root package name */
    public final f f44a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ h f45b;

    public g(h hVar, f onBackPressedCallback) {
        this.f45b = hVar;
        this.f44a = onBackPressedCallback;
    }

    @Override // androidx.activity.a
    public void cancel() {
        this.f45b.f47b.remove(this.f44a);
        this.f44a.e(this);
    }
}
