package d;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.MenuInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.app.AppCompatDelegate;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import k.d;

/* JADX WARN: Classes with same name are omitted:
  
 */
/* loaded from: classes.dex */
public abstract class q {

    /* renamed from: b  reason: collision with root package name */
    public static int f1715b = -100;

    /* renamed from: c  reason: collision with root package name */
    public static final d f1716c = new d();

    /* renamed from: d  reason: collision with root package name */
    public static final Object f1717d = new Object();

    public abstract void A(int i2);

    public abstract void B(View view);

    public abstract void C(View view, ViewGroup.LayoutParams layoutParams);

    public abstract void D(int i2);

    public abstract void E(CharSequence charSequence);

    public abstract void d(View view, ViewGroup.LayoutParams layoutParams);

    public abstract View i(int i2);

    public abstract int k();

    public abstract MenuInflater l();

    public abstract c m();

    public abstract void n();

    public abstract void o();

    public abstract void p(Configuration configuration);

    public abstract void q(Bundle bundle);

    public abstract void r();

    public abstract void s(Bundle bundle);

    public abstract void t();

    public abstract void u(Bundle bundle);

    public abstract void v();

    public abstract void w();

    public abstract boolean z(int i2);

    public static q g(Activity activity, p callback) {
        return new n0(activity, callback);
    }

    public static q h(Dialog dialog, p callback) {
        return new n0(dialog, callback);
    }

    public void e(Context context) {
    }

    public Context f(Context context) {
        e(context);
        return context;
    }

    public static int j() {
        return -100;
    }

    public static void c(q delegate) {
        synchronized (f1717d) {
            y(delegate);
            f1716c.add(new WeakReference(delegate));
        }
    }

    public static void x(q delegate) {
        synchronized (f1717d) {
            y(delegate);
        }
    }

    public static void y(q toRemove) {
        synchronized (f1717d) {
            Iterator<WeakReference<AppCompatDelegate>> i2 = f1716c.iterator();
            while (i2.hasNext()) {
                q delegate = (q) i2.next().get();
                if (delegate == toRemove || delegate == null) {
                    i2.remove();
                }
            }
        }
    }
}
