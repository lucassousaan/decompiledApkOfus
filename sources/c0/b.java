package c0;

/* JADX WARN: Classes with same name are omitted:
  
 */
/* loaded from: classes.dex */
public class b implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ p f1195b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ int f1196c;

    public b(c this$0, p pVar, int i2) {
        this.f1195b = pVar;
        this.f1196c = i2;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f1195b.a(this.f1196c);
    }
}
