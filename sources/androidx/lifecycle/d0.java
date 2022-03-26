package androidx.lifecycle;

import java.io.Closeable;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/* JADX WARN: Classes with same name are omitted:
  
 */
/* loaded from: classes.dex */
public abstract class d0 {

    /* renamed from: a  reason: collision with root package name */
    public final Map f1014a = new HashMap();

    public void d() {
    }

    public final void a() {
        Map map = this.f1014a;
        if (map != null) {
            synchronized (map) {
                for (Object value : this.f1014a.values()) {
                    b(value);
                }
            }
        }
        d();
    }

    public Object c(String key) {
        Object obj;
        Map map = this.f1014a;
        if (map == null) {
            return null;
        }
        synchronized (map) {
            obj = this.f1014a.get(key);
        }
        return obj;
    }

    public static void b(Object obj) {
        if (obj instanceof Closeable) {
            try {
                ((Closeable) obj).close();
            } catch (IOException e2) {
                throw new RuntimeException(e2);
            }
        }
    }
}
