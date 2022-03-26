package androidx.lifecycle;

/* JADX WARN: Classes with same name are omitted:
  
 */
/* loaded from: classes.dex */
public class n {

    /* renamed from: a  reason: collision with root package name */
    public i f1027a;

    /* renamed from: b  reason: collision with root package name */
    public k f1028b;

    public n(l observer, i initialState) {
        this.f1028b = p.f(observer);
        this.f1027a = initialState;
    }

    public void a(m owner, h event) {
        i newState = event.b();
        this.f1027a = o.k(this.f1027a, newState);
        this.f1028b.g(owner, event);
        this.f1027a = newState;
    }
}
