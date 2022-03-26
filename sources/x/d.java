package x;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.Build;
import android.os.CancellationSignal;
import android.os.Handler;
import c0.o;
import c0.q;
import k.g;
import w.a;
import w.b;
import w.h;

/* JADX WARN: Classes with same name are omitted:
  
 */
/* loaded from: classes.dex */
public abstract class d {

    /* renamed from: a  reason: collision with root package name */
    public static final l f3673a;

    /* renamed from: b  reason: collision with root package name */
    public static final g f3674b;

    static {
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 29) {
            f3673a = new i();
        } else if (i2 >= 28) {
            f3673a = new h();
        } else if (i2 >= 26) {
            f3673a = new g();
        } else if (f.i()) {
            f3673a = new f();
        } else {
            f3673a = new e();
        }
        f3674b = new g(16);
    }

    public static Typeface f(Resources resources, int id, int style) {
        return (Typeface) f3674b.c(e(resources, id, style));
    }

    public static String e(Resources resources, int id, int style) {
        return resources.getResourcePackageName(id) + "-" + id + "-" + style;
    }

    public static Typeface g(String familyName) {
        if (familyName == null || familyName.isEmpty()) {
            return null;
        }
        Typeface typeface = Typeface.create(familyName, 0);
        Typeface defaultTypeface = Typeface.create(Typeface.DEFAULT, 0);
        if (typeface == null || typeface.equals(defaultTypeface)) {
            return null;
        }
        return typeface;
    }

    public static Typeface c(Context context, a entry, Resources resources, int id, int style, h fontCallback, Handler handler, boolean isRequestFromLayoutInflator) {
        Typeface typeface;
        boolean isBlocking;
        if (entry instanceof w.d) {
            w.d providerEntry = (w.d) entry;
            Typeface fontFamilyTypeface = g(providerEntry.c());
            if (fontFamilyTypeface != null) {
                if (fontCallback != null) {
                    fontCallback.b(fontFamilyTypeface, handler);
                }
                return fontFamilyTypeface;
            }
            if (isRequestFromLayoutInflator) {
                isBlocking = providerEntry.a() == 0;
            } else {
                isBlocking = fontCallback == null;
            }
            int timeout = isRequestFromLayoutInflator ? providerEntry.d() : -1;
            Handler newHandler = h.c(handler);
            c newCallback = new c(fontCallback);
            typeface = q.a(context, providerEntry.b(), style, isBlocking, timeout, newHandler, newCallback);
        } else {
            typeface = f3673a.a(context, (b) entry, resources, style);
            if (fontCallback != null) {
                if (typeface != null) {
                    fontCallback.b(typeface, handler);
                } else {
                    fontCallback.a(-3, handler);
                }
            }
        }
        if (typeface != null) {
            f3674b.d(e(resources, id, style), typeface);
        }
        return typeface;
    }

    public static Typeface d(Context context, Resources resources, int id, String path, int style) {
        Typeface typeface = f3673a.d(context, resources, id, path, style);
        if (typeface != null) {
            String resourceUid = e(resources, id, style);
            f3674b.d(resourceUid, typeface);
        }
        return typeface;
    }

    public static Typeface b(Context context, CancellationSignal cancellationSignal, o[] fonts, int style) {
        return f3673a.b(context, cancellationSignal, fonts, style);
    }

    public static Typeface a(Context context, Typeface family, int style) {
        if (context != null) {
            return Typeface.create(family, style);
        }
        throw new IllegalArgumentException("Context cannot be null");
    }
}
