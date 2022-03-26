package d;

import f0.c1;
import f0.h1;

/* JADX WARN: Classes with same name are omitted:
  
 */
/* loaded from: classes.dex */
public class v implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ n0 f1745b;

    public v(n0 this$0) {
        this.f1745b = this$0;
    }

    @Override // java.lang.Runnable
    public void run() {
        n0 n0Var = this.f1745b;
        n0Var.f1701r.showAtLocation(n0Var.f1700q, 55, 0, 0);
        this.f1745b.V();
        if (this.f1745b.D0()) {
            this.f1745b.f1700q.setAlpha(0.0f);
            n0 n0Var2 = this.f1745b;
            h1 e2 = c1.e(n0Var2.f1700q);
            e2.a(1.0f);
            n0Var2.f1703t = e2;
            this.f1745b.f1703t.f(new u(this));
            return;
        }
        this.f1745b.f1700q.setAlpha(1.0f);
        this.f1745b.f1700q.setVisibility(0);
    }
}
