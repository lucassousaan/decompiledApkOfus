package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;

/* JADX WARN: Classes with same name are omitted:
  
 */
/* loaded from: classes.dex */
public final class d0 {

    /* renamed from: b  reason: collision with root package name */
    public static final PorterDuff.Mode f281b = PorterDuff.Mode.SRC_IN;

    /* renamed from: c  reason: collision with root package name */
    public static d0 f282c;

    /* renamed from: a  reason: collision with root package name */
    public q2 f283a;

    public static synchronized void h() {
        synchronized (d0.class) {
            if (f282c == null) {
                d0 d0Var = new d0();
                f282c = d0Var;
                d0Var.f283a = q2.g();
                f282c.f283a.s(new c0());
            }
        }
    }

    public static synchronized d0 b() {
        d0 d0Var;
        synchronized (d0.class) {
            if (f282c == null) {
                h();
            }
            d0Var = f282c;
        }
        return d0Var;
    }

    public synchronized Drawable c(Context context, int resId) {
        return this.f283a.i(context, resId);
    }

    public synchronized Drawable d(Context context, int resId, boolean failIfNotKnown) {
        return this.f283a.j(context, resId, failIfNotKnown);
    }

    public synchronized void g(Context context) {
        this.f283a.r(context);
    }

    public synchronized ColorStateList f(Context context, int resId) {
        return this.f283a.l(context, resId);
    }

    public static void i(Drawable drawable, q3 tint, int[] state) {
        q2.u(drawable, tint, state);
    }

    public static synchronized PorterDuffColorFilter e(int color, PorterDuff.Mode mode) {
        PorterDuffColorFilter k2;
        synchronized (d0.class) {
            k2 = q2.k(color, mode);
        }
        return k2;
    }
}
