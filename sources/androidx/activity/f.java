package androidx.activity;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX WARN: Classes with same name are omitted:
  
 */
/* loaded from: classes.dex */
public abstract class f {

    /* renamed from: a  reason: collision with root package name */
    public boolean f42a;

    /* renamed from: b  reason: collision with root package name */
    public CopyOnWriteArrayList f43b = new CopyOnWriteArrayList();

    public abstract void b();

    public f(boolean enabled) {
        this.f42a = enabled;
    }

    public final void f(boolean enabled) {
        this.f42a = enabled;
    }

    public final boolean c() {
        return this.f42a;
    }

    public final void d() {
        Iterator it = this.f43b.iterator();
        while (it.hasNext()) {
            a cancellable = (a) it.next();
            cancellable.cancel();
        }
    }

    public void a(a cancellable) {
        this.f43b.add(cancellable);
    }

    public void e(a cancellable) {
        this.f43b.remove(cancellable);
    }
}
