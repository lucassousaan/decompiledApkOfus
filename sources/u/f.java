package u;

import android.app.Activity;
import android.app.Application;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.util.Log;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.List;

/* JADX WARN: Classes with same name are omitted:
  
 */
/* loaded from: classes.dex */
public abstract class f {

    /* renamed from: a  reason: collision with root package name */
    public static final Class f3570a;

    /* renamed from: d  reason: collision with root package name */
    public static final Method f3573d;

    /* renamed from: e  reason: collision with root package name */
    public static final Method f3574e;

    /* renamed from: f  reason: collision with root package name */
    public static final Method f3575f;

    /* renamed from: g  reason: collision with root package name */
    public static final Handler f3576g = new Handler(Looper.getMainLooper());

    /* renamed from: b  reason: collision with root package name */
    public static final Field f3571b = b();

    /* renamed from: c  reason: collision with root package name */
    public static final Field f3572c = f();

    static {
        Class a2 = a();
        f3570a = a2;
        f3573d = d(a2);
        f3574e = c(a2);
        f3575f = e(a2);
    }

    public static boolean i(Activity activity) {
        Object activityThread;
        if (Build.VERSION.SDK_INT >= 28) {
            activity.recreate();
            return true;
        } else if (g() && f3575f == null) {
            return false;
        } else {
            if (f3574e == null && f3573d == null) {
                return false;
            }
            try {
                Object token = f3572c.get(activity);
                if (token == null || (activityThread = f3571b.get(activity)) == null) {
                    return false;
                }
                Application application = activity.getApplication();
                e callbacks = new e(activity);
                application.registerActivityLifecycleCallbacks(callbacks);
                Handler handler = f3576g;
                handler.post(new b(callbacks, token));
                if (g()) {
                    f3575f.invoke(activityThread, token, null, null, 0, false, null, null, false, false);
                } else {
                    activity.recreate();
                }
                handler.post(new c(application, callbacks));
                return true;
            } catch (Throwable th) {
                return false;
            }
        }
    }

    public static boolean h(Object currentlyRecreatingToken, int currentlyRecreatingHashCode, Activity activity) {
        try {
            Object token = f3572c.get(activity);
            if (token == currentlyRecreatingToken && activity.hashCode() == currentlyRecreatingHashCode) {
                Object activityThread = f3571b.get(activity);
                f3576g.postAtFrontOfQueue(new d(activityThread, token));
                return true;
            }
            return false;
        } catch (Throwable t2) {
            Log.e("ActivityRecreator", "Exception while fetching field values", t2);
            return false;
        }
    }

    public static Method d(Class cls) {
        if (cls == null) {
            return null;
        }
        try {
            Method performStop = cls.getDeclaredMethod("performStopActivity", IBinder.class, Boolean.TYPE, String.class);
            performStop.setAccessible(true);
            return performStop;
        } catch (Throwable th) {
            return null;
        }
    }

    public static Method c(Class cls) {
        if (cls == null) {
            return null;
        }
        try {
            Method performStop = cls.getDeclaredMethod("performStopActivity", IBinder.class, Boolean.TYPE);
            performStop.setAccessible(true);
            return performStop;
        } catch (Throwable th) {
            return null;
        }
    }

    public static boolean g() {
        int i2 = Build.VERSION.SDK_INT;
        return i2 == 26 || i2 == 27;
    }

    public static Method e(Class cls) {
        if (!g() || cls == null) {
            return null;
        }
        try {
            Class<?> cls2 = Boolean.TYPE;
            Method relaunch = cls.getDeclaredMethod("requestRelaunchActivity", IBinder.class, List.class, List.class, Integer.TYPE, cls2, Configuration.class, Configuration.class, cls2, cls2);
            relaunch.setAccessible(true);
            return relaunch;
        } catch (Throwable th) {
            return null;
        }
    }

    public static Field b() {
        try {
            Field mainThreadField = Activity.class.getDeclaredField("mMainThread");
            mainThreadField.setAccessible(true);
            return mainThreadField;
        } catch (Throwable th) {
            return null;
        }
    }

    public static Field f() {
        try {
            Field tokenField = Activity.class.getDeclaredField("mToken");
            tokenField.setAccessible(true);
            return tokenField;
        } catch (Throwable th) {
            return null;
        }
    }

    public static Class a() {
        try {
            return Class.forName("android.app.ActivityThread");
        } catch (Throwable th) {
            return null;
        }
    }
}
