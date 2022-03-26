package c0;

import android.os.Handler;
import e0.a;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX WARN: Classes with same name are omitted:
  
 */
/* loaded from: classes.dex */
public abstract class v {
    /* JADX WARN: Generic types in debug info not equals: e0.a != androidx.core.util.Consumer<T> */
    public static void b(Executor executor, Callable callable, a aVar) {
        Handler calleeHandler = d.a();
        executor.execute(new u(calleeHandler, callable, aVar));
    }

    public static Object c(ExecutorService executor, Callable callable, int timeoutMillis) {
        try {
            return executor.submit(callable).get(timeoutMillis, TimeUnit.MILLISECONDS);
        } catch (InterruptedException e2) {
            throw e2;
        } catch (ExecutionException e3) {
            throw new RuntimeException(e3);
        } catch (TimeoutException e4) {
            throw new InterruptedException("timeout");
        }
    }

    public static ThreadPoolExecutor a(String threadName, int threadPriority, int keepAliveTimeInMillis) {
        ThreadFactory threadFactory = new s(threadName, threadPriority);
        ThreadPoolExecutor executor = new ThreadPoolExecutor(0, 1, keepAliveTimeInMillis, TimeUnit.MILLISECONDS, new LinkedBlockingDeque(), threadFactory);
        executor.allowCoreThreadTimeOut(true);
        return executor;
    }
}
