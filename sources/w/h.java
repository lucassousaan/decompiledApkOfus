package w;

import android.graphics.Typeface;
import android.os.Handler;
import android.os.Looper;

/* JADX WARN: Classes with same name are omitted:
  
 */
/* loaded from: classes.dex */
public abstract class h {
    public abstract void d(int i2);

    public abstract void e(Typeface typeface);

    public final void b(Typeface typeface, Handler handler) {
        c(handler).post(new f(this, typeface));
    }

    public final void a(int reason, Handler handler) {
        c(handler).post(new g(this, reason));
    }

    public static Handler c(Handler handler) {
        return handler == null ? new Handler(Looper.getMainLooper()) : handler;
    }
}
