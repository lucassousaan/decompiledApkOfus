package r0;

import android.os.Trace;
import android.util.Log;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX WARN: Classes with same name are omitted:
  
 */
/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: a  reason: collision with root package name */
    public static long f3411a;

    /* renamed from: b  reason: collision with root package name */
    public static Method f3412b;

    public static boolean d() {
        try {
            if (f3412b == null) {
                return Trace.isEnabled();
            }
        } catch (NoClassDefFoundError e2) {
        } catch (NoSuchMethodError e3) {
        }
        return e();
    }

    public static void a(String label) {
        b.a(label);
    }

    public static void b() {
        b.b();
    }

    public static boolean e() {
        try {
            if (f3412b == null) {
                Field traceTagAppField = Trace.class.getField("TRACE_TAG_APP");
                f3411a = traceTagAppField.getLong(null);
                f3412b = Trace.class.getMethod("isTagEnabled", Long.TYPE);
            }
            return ((Boolean) f3412b.invoke(null, Long.valueOf(f3411a))).booleanValue();
        } catch (Exception exception) {
            c("isTagEnabled", exception);
            return false;
        }
    }

    public static void c(String methodName, Exception exception) {
        if (exception instanceof InvocationTargetException) {
            Throwable cause = exception.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            }
            throw new RuntimeException(cause);
        }
        Log.v("Trace", "Unable to call " + methodName + " via reflection", exception);
    }
}
