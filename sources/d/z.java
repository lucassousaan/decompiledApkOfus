package d;

import android.view.Menu;
import android.view.MenuItem;
import f0.c1;
import f0.h1;
import g.b;
import g.c;

/* JADX WARN: Classes with same name are omitted:
  
 */
/* loaded from: classes.dex */
public class z implements b {

    /* renamed from: a  reason: collision with root package name */
    public b f1756a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ n0 f1757b;

    public z(n0 this$0, b wrapped) {
        this.f1757b = this$0;
        this.f1756a = wrapped;
    }

    @Override // g.b
    public boolean a(c mode, Menu menu) {
        return this.f1756a.a(mode, menu);
    }

    @Override // g.b
    public boolean d(c mode, Menu menu) {
        c1.i0(this.f1757b.f1706w);
        return this.f1756a.d(mode, menu);
    }

    @Override // g.b
    public boolean c(c mode, MenuItem item) {
        return this.f1756a.c(mode, item);
    }

    @Override // g.b
    public void b(c mode) {
        this.f1756a.b(mode);
        n0 n0Var = this.f1757b;
        if (n0Var.f1701r != null) {
            n0Var.f1690g.getDecorView().removeCallbacks(this.f1757b.f1702s);
        }
        n0 n0Var2 = this.f1757b;
        if (n0Var2.f1700q != null) {
            n0Var2.V();
            n0 n0Var3 = this.f1757b;
            h1 e2 = c1.e(n0Var3.f1700q);
            e2.a(0.0f);
            n0Var3.f1703t = e2;
            this.f1757b.f1703t.f(new y(this));
        }
        n0 n0Var4 = this.f1757b;
        p pVar = n0Var4.f1692i;
        if (pVar != null) {
            pVar.h(n0Var4.f1699p);
        }
        n0 n0Var5 = this.f1757b;
        n0Var5.f1699p = null;
        c1.i0(n0Var5.f1706w);
    }
}
