package androidx.fragment.app;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import java.util.Iterator;
import java.util.Objects;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX WARN: Classes with same name are omitted:
  
 */
/* loaded from: classes.dex */
public class v0 {

    /* renamed from: a  reason: collision with root package name */
    public final CopyOnWriteArrayList f944a = new CopyOnWriteArrayList();

    /* renamed from: b  reason: collision with root package name */
    public final m1 f945b;

    public v0(m1 fragmentManager) {
        this.f945b = fragmentManager;
    }

    public void g(f0 f2, boolean onlyRecursive) {
        Context k2 = this.f945b.j0().k();
        f0 parent = this.f945b.m0();
        if (parent != null) {
            m1 parentManager = parent.B();
            parentManager.l0().g(f2, true);
        }
        Iterator it = this.f944a.iterator();
        while (it.hasNext()) {
            u0 holder = (u0) it.next();
            if (onlyRecursive) {
                Objects.requireNonNull(holder);
            } else {
                Objects.requireNonNull(holder);
                g1 g1Var = null;
                g1Var.g(this.f945b, f2, k2);
                throw null;
            }
        }
    }

    public void b(f0 f2, boolean onlyRecursive) {
        Context k2 = this.f945b.j0().k();
        f0 parent = this.f945b.m0();
        if (parent != null) {
            m1 parentManager = parent.B();
            parentManager.l0().b(f2, true);
        }
        Iterator it = this.f944a.iterator();
        while (it.hasNext()) {
            u0 holder = (u0) it.next();
            if (onlyRecursive) {
                Objects.requireNonNull(holder);
            } else {
                Objects.requireNonNull(holder);
                g1 g1Var = null;
                g1Var.b(this.f945b, f2, k2);
                throw null;
            }
        }
    }

    public void h(f0 f2, Bundle savedInstanceState, boolean onlyRecursive) {
        f0 parent = this.f945b.m0();
        if (parent != null) {
            m1 parentManager = parent.B();
            parentManager.l0().h(f2, savedInstanceState, true);
        }
        Iterator it = this.f944a.iterator();
        while (it.hasNext()) {
            u0 holder = (u0) it.next();
            if (onlyRecursive) {
                Objects.requireNonNull(holder);
            } else {
                Objects.requireNonNull(holder);
                g1 g1Var = null;
                g1Var.h(this.f945b, f2, savedInstanceState);
                throw null;
            }
        }
    }

    public void c(f0 f2, Bundle savedInstanceState, boolean onlyRecursive) {
        f0 parent = this.f945b.m0();
        if (parent != null) {
            m1 parentManager = parent.B();
            parentManager.l0().c(f2, savedInstanceState, true);
        }
        Iterator it = this.f944a.iterator();
        while (it.hasNext()) {
            u0 holder = (u0) it.next();
            if (onlyRecursive) {
                Objects.requireNonNull(holder);
            } else {
                Objects.requireNonNull(holder);
                g1 g1Var = null;
                g1Var.c(this.f945b, f2, savedInstanceState);
                throw null;
            }
        }
    }

    public void a(f0 f2, Bundle savedInstanceState, boolean onlyRecursive) {
        f0 parent = this.f945b.m0();
        if (parent != null) {
            m1 parentManager = parent.B();
            parentManager.l0().a(f2, savedInstanceState, true);
        }
        Iterator it = this.f944a.iterator();
        while (it.hasNext()) {
            u0 holder = (u0) it.next();
            if (onlyRecursive) {
                Objects.requireNonNull(holder);
            } else {
                Objects.requireNonNull(holder);
                g1 g1Var = null;
                g1Var.a(this.f945b, f2, savedInstanceState);
                throw null;
            }
        }
    }

    public void m(f0 f2, View v2, Bundle savedInstanceState, boolean onlyRecursive) {
        f0 parent = this.f945b.m0();
        if (parent != null) {
            m1 parentManager = parent.B();
            parentManager.l0().m(f2, v2, savedInstanceState, true);
        }
        Iterator it = this.f944a.iterator();
        while (it.hasNext()) {
            u0 holder = (u0) it.next();
            if (onlyRecursive) {
                Objects.requireNonNull(holder);
            } else {
                Objects.requireNonNull(holder);
                g1 g1Var = null;
                g1Var.m(this.f945b, f2, v2, savedInstanceState);
                throw null;
            }
        }
    }

    public void k(f0 f2, boolean onlyRecursive) {
        f0 parent = this.f945b.m0();
        if (parent != null) {
            m1 parentManager = parent.B();
            parentManager.l0().k(f2, true);
        }
        Iterator it = this.f944a.iterator();
        while (it.hasNext()) {
            u0 holder = (u0) it.next();
            if (onlyRecursive) {
                Objects.requireNonNull(holder);
            } else {
                Objects.requireNonNull(holder);
                g1 g1Var = null;
                g1Var.k(this.f945b, f2);
                throw null;
            }
        }
    }

    public void i(f0 f2, boolean onlyRecursive) {
        f0 parent = this.f945b.m0();
        if (parent != null) {
            m1 parentManager = parent.B();
            parentManager.l0().i(f2, true);
        }
        Iterator it = this.f944a.iterator();
        while (it.hasNext()) {
            u0 holder = (u0) it.next();
            if (onlyRecursive) {
                Objects.requireNonNull(holder);
            } else {
                Objects.requireNonNull(holder);
                g1 g1Var = null;
                g1Var.i(this.f945b, f2);
                throw null;
            }
        }
    }

    public void f(f0 f2, boolean onlyRecursive) {
        f0 parent = this.f945b.m0();
        if (parent != null) {
            m1 parentManager = parent.B();
            parentManager.l0().f(f2, true);
        }
        Iterator it = this.f944a.iterator();
        while (it.hasNext()) {
            u0 holder = (u0) it.next();
            if (onlyRecursive) {
                Objects.requireNonNull(holder);
            } else {
                Objects.requireNonNull(holder);
                g1 g1Var = null;
                g1Var.f(this.f945b, f2);
                throw null;
            }
        }
    }

    public void l(f0 f2, boolean onlyRecursive) {
        f0 parent = this.f945b.m0();
        if (parent != null) {
            m1 parentManager = parent.B();
            parentManager.l0().l(f2, true);
        }
        Iterator it = this.f944a.iterator();
        while (it.hasNext()) {
            u0 holder = (u0) it.next();
            if (onlyRecursive) {
                Objects.requireNonNull(holder);
            } else {
                Objects.requireNonNull(holder);
                g1 g1Var = null;
                g1Var.l(this.f945b, f2);
                throw null;
            }
        }
    }

    public void j(f0 f2, Bundle outState, boolean onlyRecursive) {
        f0 parent = this.f945b.m0();
        if (parent != null) {
            m1 parentManager = parent.B();
            parentManager.l0().j(f2, outState, true);
        }
        Iterator it = this.f944a.iterator();
        while (it.hasNext()) {
            u0 holder = (u0) it.next();
            if (onlyRecursive) {
                Objects.requireNonNull(holder);
            } else {
                Objects.requireNonNull(holder);
                g1 g1Var = null;
                g1Var.j(this.f945b, f2, outState);
                throw null;
            }
        }
    }

    public void n(f0 f2, boolean onlyRecursive) {
        f0 parent = this.f945b.m0();
        if (parent != null) {
            m1 parentManager = parent.B();
            parentManager.l0().n(f2, true);
        }
        Iterator it = this.f944a.iterator();
        while (it.hasNext()) {
            u0 holder = (u0) it.next();
            if (onlyRecursive) {
                Objects.requireNonNull(holder);
            } else {
                Objects.requireNonNull(holder);
                g1 g1Var = null;
                g1Var.n(this.f945b, f2);
                throw null;
            }
        }
    }

    public void d(f0 f2, boolean onlyRecursive) {
        f0 parent = this.f945b.m0();
        if (parent != null) {
            m1 parentManager = parent.B();
            parentManager.l0().d(f2, true);
        }
        Iterator it = this.f944a.iterator();
        while (it.hasNext()) {
            u0 holder = (u0) it.next();
            if (onlyRecursive) {
                Objects.requireNonNull(holder);
            } else {
                Objects.requireNonNull(holder);
                g1 g1Var = null;
                g1Var.d(this.f945b, f2);
                throw null;
            }
        }
    }

    public void e(f0 f2, boolean onlyRecursive) {
        f0 parent = this.f945b.m0();
        if (parent != null) {
            m1 parentManager = parent.B();
            parentManager.l0().e(f2, true);
        }
        Iterator it = this.f944a.iterator();
        while (it.hasNext()) {
            u0 holder = (u0) it.next();
            if (onlyRecursive) {
                Objects.requireNonNull(holder);
            } else {
                Objects.requireNonNull(holder);
                g1 g1Var = null;
                g1Var.e(this.f945b, f2);
                throw null;
            }
        }
    }
}
