package v;

import android.content.Context;

/* JADX WARN: Classes with same name are omitted:
  
 */
/* loaded from: classes.dex */
public abstract class c {
    public static int a(Context obj, int id) {
        return obj.getColor(id);
    }

    public static <T> T b(Context obj, Class<T> serviceClass) {
        return (T) obj.getSystemService(serviceClass);
    }

    public static String c(Context obj, Class<?> serviceClass) {
        return obj.getSystemServiceName(serviceClass);
    }
}
