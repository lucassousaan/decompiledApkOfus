package c0;

import android.content.Context;
import android.graphics.Typeface;
import android.os.Handler;

/* JADX WARN: Classes with same name are omitted:
  
 */
/* loaded from: classes.dex */
public abstract class q {
    public static Typeface a(Context context, g request, int style, boolean isBlockingFetch, int timeout, Handler handler, p callback) {
        c callbackWrapper = new c(callback, handler);
        if (isBlockingFetch) {
            return m.e(context, request, callbackWrapper, style, timeout);
        }
        return m.d(context, request, style, null, callbackWrapper);
    }
}
