package w;

import android.content.res.Resources;
import android.util.Log;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX WARN: Classes with same name are omitted:
  
 */
/* loaded from: classes.dex */
public abstract class i {

    /* renamed from: a  reason: collision with root package name */
    public static final Object f3645a = new Object();

    /* renamed from: b  reason: collision with root package name */
    public static Method f3646b;

    /* renamed from: c  reason: collision with root package name */
    public static boolean f3647c;

    public static void a(Resources.Theme theme) {
        synchronized (f3645a) {
            if (!f3647c) {
                try {
                    Method declaredMethod = Resources.Theme.class.getDeclaredMethod("rebase", new Class[0]);
                    f3646b = declaredMethod;
                    declaredMethod.setAccessible(true);
                } catch (NoSuchMethodException e2) {
                    Log.i("ResourcesCompat", "Failed to retrieve rebase() method", e2);
                }
                f3647c = true;
            }
            Method method = f3646b;
            if (method != null) {
                try {
                    method.invoke(theme, new Object[0]);
                } catch (IllegalAccessException | InvocationTargetException e3) {
                    Log.i("ResourcesCompat", "Failed to invoke rebase() method via reflection", e3);
                    f3646b = null;
                }
            }
        }
    }
}
