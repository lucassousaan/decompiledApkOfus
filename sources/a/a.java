package a;

import android.content.Context;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;

/* JADX WARN: Classes with same name are omitted:
  
 */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public final Set f0a = new CopyOnWriteArraySet();

    /* renamed from: b  reason: collision with root package name */
    public volatile Context f1b;

    public void a(b listener) {
        if (this.f1b != null) {
            listener.a(this.f1b);
        }
        this.f0a.add(listener);
    }

    public void c(Context context) {
        this.f1b = context;
        for (b listener : this.f0a) {
            listener.a(context);
        }
    }

    public void b() {
        this.f1b = null;
    }
}
