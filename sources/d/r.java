package d;

/* JADX WARN: Classes with same name are omitted:
  
 */
/* loaded from: classes.dex */
public class r implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ n0 f1722b;

    public r(n0 this$0) {
        this.f1722b = this$0;
    }

    @Override // java.lang.Runnable
    public void run() {
        n0 n0Var = this.f1722b;
        if ((n0Var.V & 1) != 0) {
            n0Var.U(0);
        }
        n0 n0Var2 = this.f1722b;
        if ((n0Var2.V & 4096) != 0) {
            n0Var2.U(108);
        }
        n0 n0Var3 = this.f1722b;
        n0Var3.U = false;
        n0Var3.V = 0;
    }
}
