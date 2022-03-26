package f0;

import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import e0.c;
import e0.h;
import x.b;

/* JADX WARN: Classes with same name are omitted:
  
 */
/* loaded from: classes.dex */
public class x1 {

    /* renamed from: b  reason: collision with root package name */
    public static final x1 f1934b;

    /* renamed from: a  reason: collision with root package name */
    public final w1 f1935a;

    static {
        if (Build.VERSION.SDK_INT >= 30) {
            f1934b = v1.f1926q;
        } else {
            f1934b = w1.f1932b;
        }
    }

    public x1(WindowInsets insets) {
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 30) {
            this.f1935a = new v1(this, insets);
        } else if (i2 >= 29) {
            this.f1935a = new u1(this, insets);
        } else if (i2 >= 28) {
            this.f1935a = new t1(this, insets);
        } else {
            this.f1935a = new s1(this, insets);
        }
    }

    public x1(x1 src) {
        if (src != null) {
            w1 srcImpl = src.f1935a;
            int i2 = Build.VERSION.SDK_INT;
            if (i2 >= 30 && (srcImpl instanceof v1)) {
                this.f1935a = new v1(this, (v1) srcImpl);
            } else if (i2 >= 29 && (srcImpl instanceof u1)) {
                this.f1935a = new u1(this, (u1) srcImpl);
            } else if (i2 >= 28 && (srcImpl instanceof t1)) {
                this.f1935a = new t1(this, (t1) srcImpl);
            } else if (srcImpl instanceof s1) {
                this.f1935a = new s1(this, (s1) srcImpl);
            } else if (srcImpl instanceof r1) {
                this.f1935a = new r1(this, (r1) srcImpl);
            } else {
                this.f1935a = new w1(this);
            }
            srcImpl.e(this);
            return;
        }
        this.f1935a = new w1(this);
    }

    public static x1 s(WindowInsets insets) {
        return t(insets, null);
    }

    public static x1 t(WindowInsets insets, View view) {
        h.e(insets);
        x1 wic = new x1(insets);
        if (view != null && c1.O(view)) {
            wic.p(c1.G(view));
            wic.d(view.getRootView());
        }
        return wic;
    }

    public int g() {
        return this.f1935a.i().f3668a;
    }

    public int i() {
        return this.f1935a.i().f3669b;
    }

    public int h() {
        return this.f1935a.i().f3670c;
    }

    public int f() {
        return this.f1935a.i().f3671d;
    }

    public boolean l() {
        return this.f1935a.k();
    }

    public x1 c() {
        return this.f1935a.c();
    }

    public x1 m(int left, int top, int right, int bottom) {
        m1 m1Var = new m1(this);
        m1Var.c(b.a(left, top, right, bottom));
        return m1Var.a();
    }

    public x1 b() {
        return this.f1935a.b();
    }

    public x1 a() {
        return this.f1935a.a();
    }

    public b e() {
        return this.f1935a.g();
    }

    public x1 j(int left, int top, int right, int bottom) {
        return this.f1935a.j(left, top, right, bottom);
    }

    public boolean equals(Object o2) {
        if (this == o2) {
            return true;
        }
        if (!(o2 instanceof x1)) {
            return false;
        }
        x1 other = (x1) o2;
        return c.a(this.f1935a, other.f1935a);
    }

    public int hashCode() {
        w1 w1Var = this.f1935a;
        if (w1Var == null) {
            return 0;
        }
        return w1Var.hashCode();
    }

    public WindowInsets r() {
        w1 w1Var = this.f1935a;
        if (w1Var instanceof r1) {
            return ((r1) w1Var).f1916c;
        }
        return null;
    }

    public static b k(b insets, int left, int top, int right, int bottom) {
        int newLeft = Math.max(0, insets.f3668a - left);
        int newTop = Math.max(0, insets.f3669b - top);
        int newRight = Math.max(0, insets.f3670c - right);
        int newBottom = Math.max(0, insets.f3671d - bottom);
        if (newLeft == left && newTop == top && newRight == right && newBottom == bottom) {
            return insets;
        }
        return b.a(newLeft, newTop, newRight, newBottom);
    }

    public void n(b[] insetsTypeMask) {
        this.f1935a.m(insetsTypeMask);
    }

    public void q(b stableInsets) {
        this.f1935a.p(stableInsets);
    }

    public void p(x1 rootWindowInsets) {
        this.f1935a.o(rootWindowInsets);
    }

    public void o(b visibleInsets) {
        this.f1935a.n(visibleInsets);
    }

    public void d(View rootView) {
        this.f1935a.d(rootView);
    }
}
