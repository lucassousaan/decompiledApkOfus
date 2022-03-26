package u;

import android.app.Application;

/* JADX WARN: Classes with same name are omitted:
  
 */
/* loaded from: classes.dex */
public class c implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Application f3560b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ e f3561c;

    public c(Application application, e eVar) {
        this.f3560b = application;
        this.f3561c = eVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f3560b.unregisterActivityLifecycleCallbacks(this.f3561c);
    }
}
