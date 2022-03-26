package r1;

import android.os.Handler;
import android.os.Looper;
import java.lang.ref.WeakReference;
import java.util.Objects;

/* JADX WARN: Classes with same name are omitted:
  
 */
/* loaded from: classes.dex */
public class i {

    /* renamed from: c  reason: collision with root package name */
    public static i f3422c;

    /* renamed from: a  reason: collision with root package name */
    public final Object f3423a = new Object();

    /* renamed from: b  reason: collision with root package name */
    public final Handler f3424b = new Handler(Looper.getMainLooper(), new f(this));

    public static i b() {
        if (f3422c == null) {
            f3422c = new i();
        }
        return f3422c;
    }

    public void e(g callback) {
        synchronized (this.f3423a) {
            d(callback);
        }
    }

    public void f(g callback) {
        synchronized (this.f3423a) {
            d(callback);
        }
    }

    public final boolean a(h record, int event) {
        Objects.requireNonNull(record);
        WeakReference weakReference = null;
        weakReference.get();
        throw null;
    }

    public final boolean d(g callback) {
        return false;
    }

    public void c(h record) {
        synchronized (this.f3423a) {
            if (record == null || record == null) {
                a(record, 2);
                throw null;
            }
        }
    }
}
