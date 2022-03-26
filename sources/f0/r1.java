package f0;

import android.annotation.SuppressLint;
import android.graphics.Rect;
import android.os.Build;
import android.util.Log;
import android.view.View;
import android.view.WindowInsets;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Objects;
import x.b;

/* JADX WARN: Classes with same name are omitted:
  
 */
/* loaded from: classes.dex */
public class r1 extends w1 {

    /* renamed from: h  reason: collision with root package name */
    public static boolean f1911h = false;

    /* renamed from: i  reason: collision with root package name */
    public static Method f1912i;

    /* renamed from: j  reason: collision with root package name */
    public static Class f1913j;

    /* renamed from: k  reason: collision with root package name */
    public static Field f1914k;

    /* renamed from: l  reason: collision with root package name */
    public static Field f1915l;

    /* renamed from: c  reason: collision with root package name */
    public final WindowInsets f1916c;

    /* renamed from: d  reason: collision with root package name */
    public b[] f1917d;

    /* renamed from: e  reason: collision with root package name */
    public b f1918e;

    /* renamed from: f  reason: collision with root package name */
    public x1 f1919f;

    /* renamed from: g  reason: collision with root package name */
    public b f1920g;

    public r1(x1 host, WindowInsets insets) {
        super(host);
        this.f1918e = null;
        this.f1916c = insets;
    }

    public r1(x1 host, r1 other) {
        this(host, new WindowInsets(other.f1916c));
    }

    @Override // f0.w1
    public boolean l() {
        return this.f1916c.isRound();
    }

    @Override // f0.w1
    public final b i() {
        if (this.f1918e == null) {
            this.f1918e = b.a(this.f1916c.getSystemWindowInsetLeft(), this.f1916c.getSystemWindowInsetTop(), this.f1916c.getSystemWindowInsetRight(), this.f1916c.getSystemWindowInsetBottom());
        }
        return this.f1918e;
    }

    @Override // f0.w1
    public x1 j(int left, int top, int right, int bottom) {
        m1 b2 = new m1(x1.s(this.f1916c));
        b2.c(x1.k(i(), left, top, right, bottom));
        b2.b(x1.k(h(), left, top, right, bottom));
        return b2.a();
    }

    @Override // f0.w1
    public void e(x1 other) {
        other.p(this.f1919f);
        other.o(this.f1920g);
    }

    @Override // f0.w1
    public void o(x1 rootWindowInsets) {
        this.f1919f = rootWindowInsets;
    }

    @Override // f0.w1
    public void n(b visibleInsets) {
        this.f1920g = visibleInsets;
    }

    @Override // f0.w1
    public void d(View rootView) {
        b visibleInsets = q(rootView);
        if (visibleInsets == null) {
            visibleInsets = b.f3667e;
        }
        n(visibleInsets);
    }

    private b q(View rootView) {
        if (Build.VERSION.SDK_INT < 30) {
            if (!f1911h) {
                r();
            }
            Method method = f1912i;
            if (method == null || f1913j == null || f1914k == null) {
                return null;
            }
            try {
                Object viewRootImpl = method.invoke(rootView, new Object[0]);
                if (viewRootImpl == null) {
                    Log.w("WindowInsetsCompat", "Failed to get visible insets. getViewRootImpl() returned null from the provided view. This means that the view is either not attached or the method has been overridden", new NullPointerException());
                    return null;
                }
                Object mAttachInfo = f1915l.get(viewRootImpl);
                Rect visibleRect = (Rect) f1914k.get(mAttachInfo);
                if (visibleRect != null) {
                    return b.b(visibleRect);
                }
                return null;
            } catch (ReflectiveOperationException e2) {
                Log.e("WindowInsetsCompat", "Failed to get visible insets. (Reflection error). " + e2.getMessage(), e2);
                return null;
            }
        } else {
            throw new UnsupportedOperationException("getVisibleInsets() should not be called on API >= 30. Use WindowInsets.isVisible() instead.");
        }
    }

    @Override // f0.w1
    public void m(b[] insetsTypeMask) {
        this.f1917d = insetsTypeMask;
    }

    @SuppressLint({"PrivateApi"})
    private static void r() {
        try {
            f1912i = View.class.getDeclaredMethod("getViewRootImpl", new Class[0]);
            Class<?> cls = Class.forName("android.view.View$AttachInfo");
            f1913j = cls;
            f1914k = cls.getDeclaredField("mVisibleInsets");
            Class<?> viewRootImplClass = Class.forName("android.view.ViewRootImpl");
            f1915l = viewRootImplClass.getDeclaredField("mAttachInfo");
            f1914k.setAccessible(true);
            f1915l.setAccessible(true);
        } catch (ReflectiveOperationException e2) {
            Log.e("WindowInsetsCompat", "Failed to get visible insets. (Reflection error). " + e2.getMessage(), e2);
        }
        f1911h = true;
    }

    @Override // f0.w1
    public boolean equals(Object o2) {
        if (!super.equals(o2)) {
            return false;
        }
        r1 impl20 = (r1) o2;
        return Objects.equals(this.f1920g, impl20.f1920g);
    }
}
