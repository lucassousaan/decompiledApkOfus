package androidx.fragment.app;

/* JADX WARN: Classes with same name are omitted:
  
 */
/* loaded from: classes.dex */
public class g implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ h f785b;

    public g(h this$1) {
        this.f785b = this$1;
    }

    @Override // java.lang.Runnable
    public void run() {
        h hVar = this.f785b;
        hVar.f788a.endViewTransition(hVar.f789b);
        this.f785b.f790c.a();
    }
}
