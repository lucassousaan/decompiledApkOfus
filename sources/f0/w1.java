package f0;

import android.view.View;
import e0.c;
import x.b;

/* JADX WARN: Classes with same name are omitted:
  
 */
/* loaded from: classes.dex */
public class w1 {

    /* renamed from: b  reason: collision with root package name */
    public static final x1 f1932b = new m1().a().a().b().c();

    /* renamed from: a  reason: collision with root package name */
    public final x1 f1933a;

    public w1(x1 host) {
        this.f1933a = host;
    }

    public boolean l() {
        return false;
    }

    public boolean k() {
        return false;
    }

    public x1 c() {
        return this.f1933a;
    }

    public x1 b() {
        return this.f1933a;
    }

    public n f() {
        return null;
    }

    public x1 a() {
        return this.f1933a;
    }

    public b i() {
        return b.f3667e;
    }

    public b h() {
        return b.f3667e;
    }

    public b g() {
        return i();
    }

    public x1 j(int left, int top, int right, int bottom) {
        return f1932b;
    }

    public boolean equals(Object o2) {
        if (this == o2) {
            return true;
        }
        if (!(o2 instanceof w1)) {
            return false;
        }
        w1 impl = (w1) o2;
        return l() == impl.l() && k() == impl.k() && c.a(i(), impl.i()) && c.a(h(), impl.h()) && c.a(f(), impl.f());
    }

    public int hashCode() {
        return c.b(Boolean.valueOf(l()), Boolean.valueOf(k()), i(), h(), f());
    }

    public void o(x1 rootWindowInsets) {
    }

    public void n(b visibleInsets) {
    }

    public void d(View rootView) {
    }

    public void e(x1 other) {
    }

    public void m(b[] insetsTypeMask) {
    }

    public void p(b stableInsets) {
    }
}
