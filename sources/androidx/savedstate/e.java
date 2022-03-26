package androidx.savedstate;

import android.os.Bundle;
import androidx.lifecycle.i;
import androidx.lifecycle.j;

/* JADX WARN: Classes with same name are omitted:
  
 */
/* loaded from: classes.dex */
public final class e {

    /* renamed from: a  reason: collision with root package name */
    public final f f1131a;

    /* renamed from: b  reason: collision with root package name */
    public final d f1132b = new d();

    public e(f owner) {
        this.f1131a = owner;
    }

    public d b() {
        return this.f1132b;
    }

    public void c(Bundle savedState) {
        j lifecycle = this.f1131a.g();
        if (lifecycle.b() == i.INITIALIZED) {
            lifecycle.a(new Recreator(this.f1131a));
            this.f1132b.b(lifecycle, savedState);
            return;
        }
        throw new IllegalStateException("Restarter must be created only during owner's initialization stage");
    }

    public void d(Bundle outBundle) {
        this.f1132b.c(outBundle);
    }

    public static e a(f owner) {
        return new e(owner);
    }
}
