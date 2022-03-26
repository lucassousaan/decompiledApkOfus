package i;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* JADX WARN: Classes with same name are omitted:
  
 */
/* loaded from: classes.dex */
public class e extends f {

    /* renamed from: a  reason: collision with root package name */
    public final Object f2223a = new Object();

    /* renamed from: b  reason: collision with root package name */
    public final ExecutorService f2224b = Executors.newFixedThreadPool(4, new d(this));

    /* renamed from: c  reason: collision with root package name */
    public volatile Handler f2225c;

    @Override // i.f
    public void a(Runnable runnable) {
        this.f2224b.execute(runnable);
    }

    @Override // i.f
    public void c(Runnable runnable) {
        if (this.f2225c == null) {
            synchronized (this.f2223a) {
                if (this.f2225c == null) {
                    this.f2225c = d(Looper.getMainLooper());
                }
            }
        }
        this.f2225c.post(runnable);
    }

    @Override // i.f
    public boolean b() {
        return Looper.getMainLooper().getThread() == Thread.currentThread();
    }

    public static Handler d(Looper looper) {
        if (Build.VERSION.SDK_INT >= 28) {
            return Handler.createAsync(looper);
        }
        try {
            return (Handler) Handler.class.getDeclaredConstructor(Looper.class, Handler.Callback.class, Boolean.TYPE).newInstance(looper, null, true);
        } catch (IllegalAccessException e2) {
            return new Handler(looper);
        } catch (InstantiationException e3) {
            return new Handler(looper);
        } catch (NoSuchMethodException e4) {
            return new Handler(looper);
        } catch (InvocationTargetException e5) {
            return new Handler(looper);
        }
    }
}
