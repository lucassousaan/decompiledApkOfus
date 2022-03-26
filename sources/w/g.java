package w;

/* JADX WARN: Classes with same name are omitted:
  
 */
/* loaded from: classes.dex */
public class g implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ int f3643b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ h f3644c;

    public g(h this$0, int i2) {
        this.f3644c = this$0;
        this.f3643b = i2;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f3644c.d(this.f3643b);
    }
}
