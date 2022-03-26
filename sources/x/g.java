package x;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.fonts.FontVariationAxis;
import android.net.Uri;
import android.os.CancellationSignal;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import c0.o;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.Map;
import w.b;
import w.c;

/* JADX WARN: Classes with same name are omitted:
  
 */
/* loaded from: classes.dex */
public class g extends e {

    /* renamed from: g  reason: collision with root package name */
    public final Class f3684g;

    /* renamed from: h  reason: collision with root package name */
    public final Constructor f3685h;

    /* renamed from: i  reason: collision with root package name */
    public final Method f3686i;

    /* renamed from: j  reason: collision with root package name */
    public final Method f3687j;

    /* renamed from: k  reason: collision with root package name */
    public final Method f3688k;

    /* renamed from: l  reason: collision with root package name */
    public final Method f3689l;

    /* renamed from: m  reason: collision with root package name */
    public final Method f3690m;

    public g() {
        Method abortCreation;
        Method freeze;
        Method addFontFromBuffer;
        Method addFontFromAssetManager;
        Method addFontFromAssetManager2;
        Constructor<?> fontFamilyCtor;
        Class<?> fontFamily;
        try {
            fontFamily = u();
            fontFamilyCtor = v(fontFamily);
            addFontFromAssetManager2 = r(fontFamily);
            addFontFromAssetManager = s(fontFamily);
            addFontFromBuffer = w(fontFamily);
            freeze = q(fontFamily);
            abortCreation = t(fontFamily);
        } catch (ClassNotFoundException | NoSuchMethodException e2) {
            Log.e("TypefaceCompatApi26Impl", "Unable to collect necessary methods for class " + e2.getClass().getName(), e2);
            fontFamily = null;
            fontFamilyCtor = null;
            addFontFromAssetManager2 = null;
            addFontFromAssetManager = null;
            addFontFromBuffer = null;
            freeze = null;
            abortCreation = null;
        }
        this.f3684g = fontFamily;
        this.f3685h = fontFamilyCtor;
        this.f3686i = addFontFromAssetManager2;
        this.f3687j = addFontFromAssetManager;
        this.f3688k = addFontFromBuffer;
        this.f3689l = freeze;
        this.f3690m = abortCreation;
    }

    public final boolean p() {
        if (this.f3686i == null) {
            Log.w("TypefaceCompatApi26Impl", "Unable to collect necessary private methods. Fallback to legacy implementation.");
        }
        return this.f3686i != null;
    }

    private Object k() {
        try {
            return this.f3685h.newInstance(new Object[0]);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException e2) {
            return null;
        }
    }

    public final boolean m(Context context, Object family, String fileName, int ttcIndex, int weight, int style, FontVariationAxis[] axes) {
        try {
            return ((Boolean) this.f3686i.invoke(family, context.getAssets(), fileName, 0, false, Integer.valueOf(ttcIndex), Integer.valueOf(weight), Integer.valueOf(style), axes)).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException e2) {
            return false;
        }
    }

    public final boolean n(Object family, ByteBuffer buffer, int ttcIndex, int weight, int style) {
        try {
            return ((Boolean) this.f3687j.invoke(family, buffer, Integer.valueOf(ttcIndex), null, Integer.valueOf(weight), Integer.valueOf(style))).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException e2) {
            return false;
        }
    }

    public Typeface h(Object family) {
        try {
            Object familyArray = Array.newInstance(this.f3684g, 1);
            Array.set(familyArray, 0, family);
            return (Typeface) this.f3690m.invoke(null, familyArray, -1, -1);
        } catch (IllegalAccessException | InvocationTargetException e2) {
            return null;
        }
    }

    public final boolean o(Object family) {
        try {
            return ((Boolean) this.f3688k.invoke(family, new Object[0])).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException e2) {
            return false;
        }
    }

    public final void l(Object family) {
        try {
            this.f3689l.invoke(family, new Object[0]);
        } catch (IllegalAccessException e2) {
        } catch (InvocationTargetException e3) {
        }
    }

    @Override // x.e, x.l
    public Typeface a(Context context, b entry, Resources resources, int style) {
        c[] a2;
        if (!p()) {
            return super.a(context, entry, resources, style);
        }
        Object fontFamily = k();
        if (fontFamily == null) {
            return null;
        }
        for (c fontFile : entry.a()) {
            if (!m(context, fontFamily, fontFile.a(), fontFile.c(), fontFile.e(), fontFile.f() ? 1 : 0, FontVariationAxis.fromFontVariationSettings(fontFile.d()))) {
                l(fontFamily);
                return null;
            }
        }
        if (!o(fontFamily)) {
            return null;
        }
        return h(fontFamily);
    }

    @Override // x.e, x.l
    public Typeface b(Context context, CancellationSignal cancellationSignal, o[] fonts, int style) {
        Typeface typeface;
        int i2;
        if (fonts.length < 1) {
            return null;
        }
        if (!p()) {
            o bestFont = f(fonts, style);
            ContentResolver resolver = context.getContentResolver();
            try {
                ParcelFileDescriptor pfd = resolver.openFileDescriptor(bestFont.d(), "r", cancellationSignal);
                if (pfd == null) {
                    if (pfd != null) {
                        pfd.close();
                    }
                    return null;
                }
                Typeface build = new Typeface.Builder(pfd.getFileDescriptor()).setWeight(bestFont.e()).setItalic(bestFont.f()).build();
                pfd.close();
                return build;
            } catch (IOException e2) {
                return null;
            }
        } else {
            Map<Uri, ByteBuffer> uriBuffer = m.h(context, fonts, cancellationSignal);
            Object fontFamily = k();
            if (fontFamily == null) {
                return null;
            }
            int length = fonts.length;
            int i3 = 0;
            boolean atLeastOneFont = false;
            while (i3 < length) {
                o font = fonts[i3];
                ByteBuffer fontBuffer = uriBuffer.get(font.d());
                if (fontBuffer == null) {
                    i2 = i3;
                } else {
                    i2 = i3;
                    boolean success = n(fontFamily, fontBuffer, font.c(), font.e(), font.f() ? 1 : 0);
                    if (!success) {
                        l(fontFamily);
                        return null;
                    }
                    atLeastOneFont = true;
                }
                i3 = i2 + 1;
                atLeastOneFont = atLeastOneFont;
            }
            if (!atLeastOneFont) {
                l(fontFamily);
                return null;
            } else if (o(fontFamily) && (typeface = h(fontFamily)) != null) {
                return Typeface.create(typeface, style);
            } else {
                return null;
            }
        }
    }

    @Override // x.l
    public Typeface d(Context context, Resources resources, int id, String path, int style) {
        if (!p()) {
            return super.d(context, resources, id, path, style);
        }
        Object fontFamily = k();
        if (fontFamily == null) {
            return null;
        }
        if (!m(context, fontFamily, path, 0, -1, -1, null)) {
            l(fontFamily);
            return null;
        } else if (!o(fontFamily)) {
            return null;
        } else {
            return h(fontFamily);
        }
    }

    public Class u() {
        return Class.forName("android.graphics.FontFamily");
    }

    public Constructor v(Class cls) {
        return cls.getConstructor(new Class[0]);
    }

    public Method r(Class cls) {
        Class<?> cls2 = Integer.TYPE;
        return cls.getMethod("addFontFromAssetManager", AssetManager.class, String.class, cls2, Boolean.TYPE, cls2, cls2, cls2, FontVariationAxis[].class);
    }

    public Method s(Class cls) {
        Class<?> cls2 = Integer.TYPE;
        return cls.getMethod("addFontFromBuffer", ByteBuffer.class, cls2, FontVariationAxis[].class, cls2, cls2);
    }

    public Method w(Class cls) {
        return cls.getMethod("freeze", new Class[0]);
    }

    public Method q(Class cls) {
        return cls.getMethod("abortCreation", new Class[0]);
    }

    public Method t(Class cls) {
        Object familyArray = Array.newInstance(cls, 1);
        Class cls2 = Integer.TYPE;
        Method m2 = Typeface.class.getDeclaredMethod("createFromFamiliesWithDefault", familyArray.getClass(), cls2, cls2);
        m2.setAccessible(true);
        return m2;
    }
}
