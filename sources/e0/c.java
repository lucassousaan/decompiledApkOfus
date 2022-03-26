package e0;

import java.util.Objects;

/* JADX WARN: Classes with same name are omitted:
  
 */
/* loaded from: classes.dex */
public abstract class c {
    public static boolean a(Object a2, Object b2) {
        return Objects.equals(a2, b2);
    }

    public static int b(Object... values) {
        return Objects.hash(values);
    }

    public static Object c(Object obj, String message) {
        if (obj != null) {
            return obj;
        }
        throw new NullPointerException(message);
    }
}
