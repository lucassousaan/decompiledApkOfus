package w;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.util.TypedValue;
import e0.h;
import java.util.WeakHashMap;

/* JADX WARN: Classes with same name are omitted:
  
 */
/* loaded from: classes.dex */
public abstract class l {

    /* renamed from: a  reason: collision with root package name */
    public static final ThreadLocal f3648a = new ThreadLocal();

    /* renamed from: b  reason: collision with root package name */
    public static final WeakHashMap f3649b = new WeakHashMap(0);

    /* renamed from: c  reason: collision with root package name */
    public static final Object f3650c = new Object();

    public static Drawable b(Resources res, int id, Resources.Theme theme) {
        return res.getDrawable(id, theme);
    }

    public static Typeface c(Context context, int id) {
        if (context.isRestricted()) {
            return null;
        }
        return f(context, id, new TypedValue(), 0, null, null, false, false);
    }

    public static Typeface a(Context context, int id) {
        if (context.isRestricted()) {
            return null;
        }
        return f(context, id, new TypedValue(), 0, null, null, false, true);
    }

    public static void e(Context context, int id, h fontCallback, Handler handler) {
        h.e(fontCallback);
        if (context.isRestricted()) {
            fontCallback.a(-4, handler);
        } else {
            f(context, id, new TypedValue(), 0, fontCallback, handler, false, false);
        }
    }

    public static Typeface d(Context context, int id, TypedValue value, int style, h fontCallback) {
        if (context.isRestricted()) {
            return null;
        }
        return f(context, id, value, style, fontCallback, null, true, false);
    }

    public static Typeface f(Context context, int id, TypedValue value, int style, h fontCallback, Handler handler, boolean isRequestFromLayoutInflator, boolean isCachedOnly) {
        Resources resources = context.getResources();
        resources.getValue(id, value, true);
        Typeface typeface = g(context, resources, value, id, style, fontCallback, handler, isRequestFromLayoutInflator, isCachedOnly);
        if (typeface != null || fontCallback != null || isCachedOnly) {
            return typeface;
        }
        throw new Resources.NotFoundException("Font resource ID #0x" + Integer.toHexString(id) + " could not be retrieved.");
    }

    /* JADX WARN: Removed duplicated region for block: B:61:0x00f1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static android.graphics.Typeface g(android.content.Context r19, android.content.res.Resources r20, android.util.TypedValue r21, int r22, int r23, w.h r24, android.os.Handler r25, boolean r26, boolean r27) {
        /*
            Method dump skipped, instructions count: 297
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: w.l.g(android.content.Context, android.content.res.Resources, android.util.TypedValue, int, int, w.h, android.os.Handler, boolean, boolean):android.graphics.Typeface");
    }
}
