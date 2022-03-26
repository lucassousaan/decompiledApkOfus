package f0;

import android.view.View;
import android.view.ViewParent;

/* JADX WARN: Classes with same name are omitted:
  
 */
/* loaded from: classes.dex */
public class w {

    /* renamed from: a  reason: collision with root package name */
    public ViewParent f1927a;

    /* renamed from: b  reason: collision with root package name */
    public ViewParent f1928b;

    /* renamed from: c  reason: collision with root package name */
    public final View f1929c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f1930d;

    /* renamed from: e  reason: collision with root package name */
    public int[] f1931e;

    public w(View view) {
        this.f1929c = view;
    }

    public void m(boolean enabled) {
        if (this.f1930d) {
            c1.A0(this.f1929c);
        }
        this.f1930d = enabled;
    }

    public boolean l() {
        return this.f1930d;
    }

    public boolean j() {
        return k(0);
    }

    public boolean k(int type) {
        return h(type) != null;
    }

    public boolean o(int axes) {
        return p(axes, 0);
    }

    public boolean p(int axes, int type) {
        if (k(type)) {
            return true;
        }
        if (!l()) {
            return false;
        }
        View child = this.f1929c;
        for (ViewParent p2 = this.f1929c.getParent(); p2 != null; p2 = p2.getParent()) {
            if (e1.f(p2, child, this.f1929c, axes, type)) {
                n(type, p2);
                e1.e(p2, child, this.f1929c, axes, type);
                return true;
            }
            if (p2 instanceof View) {
                child = (View) p2;
            }
        }
        return false;
    }

    public void q() {
        r(0);
    }

    public void r(int type) {
        ViewParent parent = h(type);
        if (parent != null) {
            e1.g(parent, this.f1929c, type);
            n(type, null);
        }
    }

    public boolean f(int dxConsumed, int dyConsumed, int dxUnconsumed, int dyUnconsumed, int[] offsetInWindow) {
        return g(dxConsumed, dyConsumed, dxUnconsumed, dyUnconsumed, offsetInWindow, 0, null);
    }

    public void e(int dxConsumed, int dyConsumed, int dxUnconsumed, int dyUnconsumed, int[] offsetInWindow, int type, int[] consumed) {
        g(dxConsumed, dyConsumed, dxUnconsumed, dyUnconsumed, offsetInWindow, type, consumed);
    }

    public final boolean g(int dxConsumed, int dyConsumed, int dxUnconsumed, int dyUnconsumed, int[] offsetInWindow, int type, int[] consumed) {
        ViewParent parent;
        int startY;
        int startX;
        int[] consumed2;
        if (!l() || (parent = h(type)) == null) {
            return false;
        }
        if (dxConsumed == 0 && dyConsumed == 0 && dxUnconsumed == 0 && dyUnconsumed == 0) {
            if (offsetInWindow != null) {
                offsetInWindow[0] = 0;
                offsetInWindow[1] = 0;
            }
            return false;
        }
        if (offsetInWindow != null) {
            this.f1929c.getLocationInWindow(offsetInWindow);
            int startX2 = offsetInWindow[0];
            int startY2 = offsetInWindow[1];
            startX = startX2;
            startY = startY2;
        } else {
            startX = 0;
            startY = 0;
        }
        if (consumed == null) {
            int[] consumed3 = i();
            consumed3[0] = 0;
            consumed3[1] = 0;
            consumed2 = consumed3;
        } else {
            consumed2 = consumed;
        }
        e1.d(parent, this.f1929c, dxConsumed, dyConsumed, dxUnconsumed, dyUnconsumed, type, consumed2);
        if (offsetInWindow != null) {
            this.f1929c.getLocationInWindow(offsetInWindow);
            offsetInWindow[0] = offsetInWindow[0] - startX;
            offsetInWindow[1] = offsetInWindow[1] - startY;
        }
        return true;
    }

    public boolean c(int dx, int dy, int[] consumed, int[] offsetInWindow) {
        return d(dx, dy, consumed, offsetInWindow, 0);
    }

    public boolean d(int dx, int dy, int[] consumed, int[] offsetInWindow, int type) {
        ViewParent parent;
        int startY;
        int startX;
        int[] consumed2;
        if (!l() || (parent = h(type)) == null) {
            return false;
        }
        if (dx == 0 && dy == 0) {
            if (offsetInWindow != null) {
                offsetInWindow[0] = 0;
                offsetInWindow[1] = 0;
            }
            return false;
        }
        if (offsetInWindow != null) {
            this.f1929c.getLocationInWindow(offsetInWindow);
            int startX2 = offsetInWindow[0];
            int startY2 = offsetInWindow[1];
            startX = startX2;
            startY = startY2;
        } else {
            startX = 0;
            startY = 0;
        }
        if (consumed == null) {
            consumed2 = i();
        } else {
            consumed2 = consumed;
        }
        consumed2[0] = 0;
        consumed2[1] = 0;
        e1.c(parent, this.f1929c, dx, dy, consumed2, type);
        if (offsetInWindow != null) {
            this.f1929c.getLocationInWindow(offsetInWindow);
            offsetInWindow[0] = offsetInWindow[0] - startX;
            offsetInWindow[1] = offsetInWindow[1] - startY;
        }
        return (consumed2[0] == 0 && consumed2[1] == 0) ? false : true;
    }

    public boolean a(float velocityX, float velocityY, boolean consumed) {
        ViewParent parent;
        if (!l() || (parent = h(0)) == null) {
            return false;
        }
        return e1.a(parent, this.f1929c, velocityX, velocityY, consumed);
    }

    public boolean b(float velocityX, float velocityY) {
        ViewParent parent;
        if (!l() || (parent = h(0)) == null) {
            return false;
        }
        return e1.b(parent, this.f1929c, velocityX, velocityY);
    }

    public final ViewParent h(int type) {
        switch (type) {
            case 0:
                return this.f1927a;
            case 1:
                return this.f1928b;
            default:
                return null;
        }
    }

    public final void n(int type, ViewParent p2) {
        switch (type) {
            case 0:
                this.f1927a = p2;
                return;
            case 1:
                this.f1928b = p2;
                return;
            default:
                return;
        }
    }

    public final int[] i() {
        if (this.f1931e == null) {
            this.f1931e = new int[2];
        }
        return this.f1931e;
    }
}
