package u;

import android.util.Log;
import java.lang.reflect.Method;

/* JADX WARN: Classes with same name are omitted:
  
 */
/* loaded from: classes.dex */
public class d implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f3562b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ Object f3563c;

    public d(Object obj, Object obj2) {
        this.f3562b = obj;
        this.f3563c = obj2;
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            Method method = f.f3573d;
            if (method != null) {
                method.invoke(this.f3562b, this.f3563c, false, "AppCompat recreation");
            } else {
                f.f3574e.invoke(this.f3562b, this.f3563c, false);
            }
        } catch (RuntimeException e2) {
            if (e2.getClass() == RuntimeException.class && e2.getMessage() != null && e2.getMessage().startsWith("Unable to stop")) {
                throw e2;
            }
        } catch (Throwable t2) {
            Log.e("ActivityRecreator", "Exception while invoking performStopActivity", t2);
        }
    }
}
