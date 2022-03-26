package f0;

import android.graphics.Rect;
import android.util.Log;
import android.view.WindowInsets;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import x.b;

/* JADX WARN: Classes with same name are omitted:
  
 */
/* loaded from: classes.dex */
public class n1 extends q1 {

    /* renamed from: d  reason: collision with root package name */
    public static Field f1896d;

    /* renamed from: f  reason: collision with root package name */
    public static Constructor f1898f;

    /* renamed from: b  reason: collision with root package name */
    public WindowInsets f1900b;

    /* renamed from: c  reason: collision with root package name */
    public b f1901c;

    /* renamed from: e  reason: collision with root package name */
    public static boolean f1897e = false;

    /* renamed from: g  reason: collision with root package name */
    public static boolean f1899g = false;

    public n1() {
        this.f1900b = e();
    }

    public n1(x1 insets) {
        super(insets);
        this.f1900b = insets.r();
    }

    @Override // f0.q1
    public void d(b insets) {
        WindowInsets windowInsets = this.f1900b;
        if (windowInsets != null) {
            this.f1900b = windowInsets.replaceSystemWindowInsets(insets.f3668a, insets.f3669b, insets.f3670c, insets.f3671d);
        }
    }

    @Override // f0.q1
    public void c(b insets) {
        this.f1901c = insets;
    }

    @Override // f0.q1
    public x1 b() {
        a();
        x1 windowInsetsCompat = x1.s(this.f1900b);
        windowInsetsCompat.n(null);
        windowInsetsCompat.q(this.f1901c);
        return windowInsetsCompat;
    }

    private static WindowInsets e() {
        if (!f1897e) {
            try {
                f1896d = WindowInsets.class.getDeclaredField("CONSUMED");
            } catch (ReflectiveOperationException e2) {
                Log.i("WindowInsetsCompat", "Could not retrieve WindowInsets.CONSUMED field", e2);
            }
            f1897e = true;
        }
        Field field = f1896d;
        if (field != null) {
            try {
                WindowInsets consumed = (WindowInsets) field.get(null);
                if (consumed != null) {
                    return new WindowInsets(consumed);
                }
            } catch (ReflectiveOperationException e3) {
                Log.i("WindowInsetsCompat", "Could not get value from WindowInsets.CONSUMED field", e3);
            }
        }
        if (!f1899g) {
            try {
                f1898f = WindowInsets.class.getConstructor(Rect.class);
            } catch (ReflectiveOperationException e4) {
                Log.i("WindowInsetsCompat", "Could not retrieve WindowInsets(Rect) constructor", e4);
            }
            f1899g = true;
        }
        Constructor constructor = f1898f;
        if (constructor != null) {
            try {
                return (WindowInsets) constructor.newInstance(new Rect());
            } catch (ReflectiveOperationException e5) {
                Log.i("WindowInsetsCompat", "Could not invoke WindowInsets(Rect) constructor", e5);
            }
        }
        return null;
    }
}
