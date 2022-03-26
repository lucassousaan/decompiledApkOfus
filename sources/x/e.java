package x;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.CancellationSignal;
import android.os.ParcelFileDescriptor;
import android.system.ErrnoException;
import android.system.Os;
import android.system.OsConstants;
import android.util.Log;
import c0.o;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import w.b;
import w.c;

/* JADX WARN: Classes with same name are omitted:
  
 */
/* loaded from: classes.dex */
public class e extends l {

    /* renamed from: b  reason: collision with root package name */
    public static Class f3675b;

    /* renamed from: c  reason: collision with root package name */
    public static Constructor f3676c;

    /* renamed from: d  reason: collision with root package name */
    public static Method f3677d;

    /* renamed from: e  reason: collision with root package name */
    public static Method f3678e;

    /* renamed from: f  reason: collision with root package name */
    public static boolean f3679f = false;

    public static void j() {
        Method addFontMethod;
        Constructor<?> fontFamilyCtor;
        Class<?> fontFamilyClass;
        Method createFromFamiliesWithDefaultMethod;
        if (!f3679f) {
            f3679f = true;
            try {
                fontFamilyClass = Class.forName("android.graphics.FontFamily");
                fontFamilyCtor = fontFamilyClass.getConstructor(new Class[0]);
                addFontMethod = fontFamilyClass.getMethod("addFontWeightStyle", String.class, Integer.TYPE, Boolean.TYPE);
                Object familyArray = Array.newInstance(fontFamilyClass, 1);
                createFromFamiliesWithDefaultMethod = Typeface.class.getMethod("createFromFamiliesWithDefault", familyArray.getClass());
            } catch (ClassNotFoundException | NoSuchMethodException e2) {
                Log.e("TypefaceCompatApi21Impl", e2.getClass().getName(), e2);
                fontFamilyClass = null;
                fontFamilyCtor = null;
                addFontMethod = null;
                createFromFamiliesWithDefaultMethod = null;
            }
            f3676c = fontFamilyCtor;
            f3675b = fontFamilyClass;
            f3677d = addFontMethod;
            f3678e = createFromFamiliesWithDefaultMethod;
        }
    }

    public final File i(ParcelFileDescriptor fd) {
        try {
            String path = Os.readlink("/proc/self/fd/" + fd.getFd());
            if (OsConstants.S_ISREG(Os.stat(path).st_mode)) {
                return new File(path);
            }
            return null;
        } catch (ErrnoException e2) {
            return null;
        }
    }

    public static Object k() {
        j();
        try {
            return f3676c.newInstance(new Object[0]);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException e2) {
            throw new RuntimeException(e2);
        }
    }

    public static Typeface h(Object family) {
        j();
        try {
            Object familyArray = Array.newInstance(f3675b, 1);
            Array.set(familyArray, 0, family);
            return (Typeface) f3678e.invoke(null, familyArray);
        } catch (IllegalAccessException | InvocationTargetException e2) {
            throw new RuntimeException(e2);
        }
    }

    public static boolean g(Object family, String name, int weight, boolean style) {
        j();
        try {
            Boolean result = (Boolean) f3677d.invoke(family, name, Integer.valueOf(weight), Boolean.valueOf(style));
            return result.booleanValue();
        } catch (IllegalAccessException | InvocationTargetException e2) {
            throw new RuntimeException(e2);
        }
    }

    @Override // x.l
    public Typeface b(Context context, CancellationSignal cancellationSignal, o[] fonts, int style) {
        if (fonts.length < 1) {
            return null;
        }
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
            File file = i(pfd);
            if (file != null && file.canRead()) {
                Typeface createFromFile = Typeface.createFromFile(file);
                pfd.close();
                return createFromFile;
            }
            FileInputStream fis = new FileInputStream(pfd.getFileDescriptor());
            Typeface c2 = c(context, fis);
            fis.close();
            pfd.close();
            return c2;
        } catch (IOException e2) {
            return null;
        }
    }

    @Override // x.l
    public Typeface a(Context context, b entry, Resources resources, int style) {
        c[] a2;
        Object family = k();
        for (c e2 : entry.a()) {
            File tmpFile = m.e(context);
            if (tmpFile == null) {
                return null;
            }
            try {
                if (!m.c(tmpFile, resources, e2.b())) {
                    return null;
                }
                if (!g(family, tmpFile.getPath(), e2.e(), e2.f())) {
                    return null;
                }
                tmpFile.delete();
            } catch (RuntimeException e3) {
                return null;
            } finally {
                tmpFile.delete();
            }
        }
        return h(family);
    }
}
