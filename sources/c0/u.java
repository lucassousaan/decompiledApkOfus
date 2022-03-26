package c0;

import android.os.Handler;
import e0.a;
import java.util.concurrent.Callable;

/* JADX WARN: Classes with same name are omitted:
  
 */
/* loaded from: classes.dex */
public class u implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    public Callable f1234b;

    /* renamed from: c  reason: collision with root package name */
    public a f1235c;

    /* renamed from: d  reason: collision with root package name */
    public Handler f1236d;

    /* JADX WARN: Generic types in debug info not equals: c0.u != androidx.core.provider.RequestExecutor$ReplyRunnable<T> */
    /* JADX WARN: Generic types in debug info not equals: e0.a != androidx.core.util.Consumer<T> */
    public u(Handler handler, Callable callable, a aVar) {
        this.f1234b = callable;
        this.f1235c = aVar;
        this.f1236d = handler;
    }

    /* JADX WARN: Generic types in debug info not equals: c0.u != androidx.core.provider.RequestExecutor$ReplyRunnable<T> */
    /* JADX WARN: Generic types in debug info not equals: e0.a != androidx.core.util.Consumer<T> */
    @Override // java.lang.Runnable
    public void run() {
        Object obj;
        try {
            obj = this.f1234b.call();
        } catch (Exception e2) {
            obj = null;
        }
        this.f1236d.post(new t(this, this.f1235c, obj));
    }
}
