package u;

/* JADX WARN: Classes with same name are omitted:
  
 */
/* loaded from: classes.dex */
public class b implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ e f3558b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ Object f3559c;

    public b(e eVar, Object obj) {
        this.f3558b = eVar;
        this.f3559c = obj;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f3558b.f3564a = this.f3559c;
    }
}
