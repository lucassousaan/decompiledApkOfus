package x;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.CancellationSignal;
import android.util.Log;
import c0.o;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.List;
import k.n;
import w.b;
import w.c;

/* JADX WARN: Classes with same name are omitted:
  
 */
/* loaded from: classes.dex */
public class f extends l {

    /* renamed from: b  reason: collision with root package name */
    public static final Class f3680b;

    /* renamed from: c  reason: collision with root package name */
    public static final Constructor f3681c;

    /* renamed from: d  reason: collision with root package name */
    public static final Method f3682d;

    /* renamed from: e  reason: collision with root package name */
    public static final Method f3683e;

    static {
        Method addFontMethod;
        Constructor<?> fontFamilyCtor;
        Method createFromFamiliesWithDefaultMethod;
        Class<?> fontFamilyClass;
        try {
            fontFamilyClass = Class.forName("android.graphics.FontFamily");
            fontFamilyCtor = fontFamilyClass.getConstructor(new Class[0]);
            Class<?> cls = Integer.TYPE;
            addFontMethod = fontFamilyClass.getMethod("addFontWeightStyle", ByteBuffer.class, cls, List.class, cls, Boolean.TYPE);
            Object familyArray = Array.newInstance(fontFamilyClass, 1);
            createFromFamiliesWithDefaultMethod = Typeface.class.getMethod("createFromFamiliesWithDefault", familyArray.getClass());
        } catch (ClassNotFoundException | NoSuchMethodException e2) {
            Log.e("TypefaceCompatApi24Impl", e2.getClass().getName(), e2);
            fontFamilyCtor = null;
            addFontMethod = null;
            fontFamilyClass = null;
            createFromFamiliesWithDefaultMethod = null;
        }
        f3681c = fontFamilyCtor;
        f3680b = fontFamilyClass;
        f3682d = addFontMethod;
        f3683e = createFromFamiliesWithDefaultMethod;
    }

    public static boolean i() {
        Method method = f3682d;
        if (method == null) {
            Log.w("TypefaceCompatApi24Impl", "Unable to collect necessary private methods.Fallback to legacy implementation.");
        }
        return method != null;
    }

    public static Object j() {
        try {
            return f3681c.newInstance(new Object[0]);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException e2) {
            return null;
        }
    }

    public static boolean g(Object family, ByteBuffer buffer, int ttcIndex, int weight, boolean style) {
        try {
            Boolean result = (Boolean) f3682d.invoke(family, buffer, Integer.valueOf(ttcIndex), null, Integer.valueOf(weight), Boolean.valueOf(style));
            return result.booleanValue();
        } catch (IllegalAccessException | InvocationTargetException e2) {
            return false;
        }
    }

    public static Typeface h(Object family) {
        try {
            Object familyArray = Array.newInstance(f3680b, 1);
            Array.set(familyArray, 0, family);
            return (Typeface) f3683e.invoke(null, familyArray);
        } catch (IllegalAccessException | InvocationTargetException e2) {
            return null;
        }
    }

    /* JADX WARN: Generic types in debug info not equals: k.n != androidx.collection.SimpleArrayMap<android.net.Uri, java.nio.ByteBuffer> */
    @Override // x.l
    public Typeface b(Context context, CancellationSignal cancellationSignal, o[] fonts, int style) {
        Object family = j();
        if (family == null) {
            return null;
        }
        n nVar = new n();
        for (o font : fonts) {
            Uri uri = font.d();
            ByteBuffer buffer = (ByteBuffer) nVar.get(uri);
            if (buffer == null) {
                buffer = m.f(context, cancellationSignal, uri);
                nVar.put(uri, buffer);
            }
            if (buffer == null || !g(family, buffer, font.c(), font.e(), font.f())) {
                return null;
            }
        }
        Typeface typeface = h(family);
        if (typeface == null) {
            return null;
        }
        return Typeface.create(typeface, style);
    }

    @Override // x.l
    public Typeface a(Context context, b entry, Resources resources, int style) {
        c[] a2;
        Object family = j();
        if (family == null) {
            return null;
        }
        for (c e2 : entry.a()) {
            ByteBuffer buffer = m.b(context, resources, e2.b());
            if (buffer == null || !g(family, buffer, e2.c(), e2.e(), e2.f())) {
                return null;
            }
        }
        return h(family);
    }
}
