package q0;

import androidx.recyclerview.widget.RecyclerView;

/* JADX WARN: Classes with same name are omitted:
  
 */
/* loaded from: classes.dex */
public class s0 implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ RecyclerView f3189b;

    public s0(RecyclerView this$0) {
        this.f3189b = this$0;
    }

    @Override // java.lang.Runnable
    public void run() {
        f1 f1Var = this.f3189b.L;
        if (f1Var != null) {
            f1Var.u();
        }
        this.f3189b.f1090m0 = false;
    }
}
