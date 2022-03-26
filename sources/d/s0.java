package d;

import android.content.res.Resources;
import android.os.Build;
import android.util.Log;
import android.util.LongSparseArray;
import java.lang.reflect.Field;

/* JADX WARN: Classes with same name are omitted:
  
 */
/* loaded from: classes.dex */
public abstract class s0 {

    /* renamed from: a  reason: collision with root package name */
    public static Field f1729a;

    /* renamed from: b  reason: collision with root package name */
    public static boolean f1730b;

    /* renamed from: c  reason: collision with root package name */
    public static Class f1731c;

    /* renamed from: d  reason: collision with root package name */
    public static boolean f1732d;

    /* renamed from: e  reason: collision with root package name */
    public static Field f1733e;

    /* renamed from: f  reason: collision with root package name */
    public static boolean f1734f;

    /* renamed from: g  reason: collision with root package name */
    public static Field f1735g;

    /* renamed from: h  reason: collision with root package name */
    public static boolean f1736h;

    public static void a(Resources resources) {
        if (Build.VERSION.SDK_INT < 28) {
            b(resources);
        }
    }

    public static void b(Resources resources) {
        if (!f1736h) {
            try {
                Field declaredField = Resources.class.getDeclaredField("mResourcesImpl");
                f1735g = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException e2) {
                Log.e("ResourcesFlusher", "Could not retrieve Resources#mResourcesImpl field", e2);
            }
            f1736h = true;
        }
        Field field = f1735g;
        if (field != null) {
            Object resourcesImpl = null;
            try {
                resourcesImpl = field.get(resources);
            } catch (IllegalAccessException e3) {
                Log.e("ResourcesFlusher", "Could not retrieve value from Resources#mResourcesImpl", e3);
            }
            if (resourcesImpl != null) {
                if (!f1730b) {
                    try {
                        Field declaredField2 = resourcesImpl.getClass().getDeclaredField("mDrawableCache");
                        f1729a = declaredField2;
                        declaredField2.setAccessible(true);
                    } catch (NoSuchFieldException e4) {
                        Log.e("ResourcesFlusher", "Could not retrieve ResourcesImpl#mDrawableCache field", e4);
                    }
                    f1730b = true;
                }
                Object drawableCache = null;
                Field field2 = f1729a;
                if (field2 != null) {
                    try {
                        drawableCache = field2.get(resourcesImpl);
                    } catch (IllegalAccessException e5) {
                        Log.e("ResourcesFlusher", "Could not retrieve value from ResourcesImpl#mDrawableCache", e5);
                    }
                }
                if (drawableCache != null) {
                    c(drawableCache);
                }
            }
        }
    }

    public static void c(Object cache) {
        if (!f1732d) {
            try {
                f1731c = Class.forName("android.content.res.ThemedResourceCache");
            } catch (ClassNotFoundException e2) {
                Log.e("ResourcesFlusher", "Could not find ThemedResourceCache class", e2);
            }
            f1732d = true;
        }
        Class cls = f1731c;
        if (cls != null) {
            if (!f1734f) {
                try {
                    Field declaredField = cls.getDeclaredField("mUnthemedEntries");
                    f1733e = declaredField;
                    declaredField.setAccessible(true);
                } catch (NoSuchFieldException ee) {
                    Log.e("ResourcesFlusher", "Could not retrieve ThemedResourceCache#mUnthemedEntries field", ee);
                }
                f1734f = true;
            }
            Field field = f1733e;
            if (field != null) {
                LongSparseArray unthemedEntries = null;
                try {
                    unthemedEntries = (LongSparseArray) field.get(cache);
                } catch (IllegalAccessException e3) {
                    Log.e("ResourcesFlusher", "Could not retrieve value from ThemedResourceCache#mUnthemedEntries", e3);
                }
                if (unthemedEntries != null) {
                    unthemedEntries.clear();
                }
            }
        }
    }
}
