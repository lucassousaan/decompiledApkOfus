package q0;

import java.util.ArrayList;
import java.util.List;

/* JADX WARN: Classes with same name are omitted:
  
 */
/* loaded from: classes.dex */
public abstract class f1 {

    /* renamed from: a  reason: collision with root package name */
    public d1 f3043a = null;

    /* renamed from: b  reason: collision with root package name */
    public ArrayList f3044b = new ArrayList();

    /* renamed from: c  reason: collision with root package name */
    public long f3045c = 120;

    /* renamed from: d  reason: collision with root package name */
    public long f3046d = 120;

    /* renamed from: e  reason: collision with root package name */
    public long f3047e = 250;

    /* renamed from: f  reason: collision with root package name */
    public long f3048f = 250;

    public abstract boolean a(e2 e2Var, e1 e1Var, e1 e1Var2);

    public abstract boolean b(e2 e2Var, e2 e2Var2, e1 e1Var, e1 e1Var2);

    public abstract boolean c(e2 e2Var, e1 e1Var, e1 e1Var2);

    public abstract boolean d(e2 e2Var, e1 e1Var, e1 e1Var2);

    public abstract boolean f(e2 e2Var);

    public abstract void j(e2 e2Var);

    public abstract void k();

    public abstract boolean p();

    public abstract void u();

    public long n() {
        return this.f3047e;
    }

    public long l() {
        return this.f3045c;
    }

    public long o() {
        return this.f3046d;
    }

    public long m() {
        return this.f3048f;
    }

    public void v(d1 listener) {
        this.f3043a = listener;
    }

    public e1 t(e2 viewHolder) {
        e1 q2 = q();
        q2.a(viewHolder);
        return q2;
    }

    public e1 s(e2 viewHolder) {
        e1 q2 = q();
        q2.a(viewHolder);
        return q2;
    }

    public static int e(e2 viewHolder) {
        int flags = viewHolder.f3027j & 14;
        if (viewHolder.t()) {
            return 4;
        }
        if ((flags & 4) != 0) {
            return flags;
        }
        int oldPos = viewHolder.n();
        int pos = viewHolder.j();
        if (oldPos == -1 || pos == -1 || oldPos == pos) {
            return flags;
        }
        return flags | 2048;
    }

    public final void h(e2 viewHolder) {
        r();
        d1 d1Var = this.f3043a;
        if (d1Var != null) {
            ((g1) d1Var).a(viewHolder);
        }
    }

    public void r() {
    }

    public boolean g(e2 viewHolder, List list) {
        return f(viewHolder);
    }

    public final void i() {
        int count = this.f3044b.size();
        for (int i2 = 0; i2 < count; i2++) {
            ((c1) this.f3044b.get(i2)).a();
        }
        this.f3044b.clear();
    }

    public e1 q() {
        return new e1();
    }
}
