package androidx.activity;

import androidx.lifecycle.i;
import androidx.lifecycle.j;
import androidx.lifecycle.m;
import java.util.ArrayDeque;
import java.util.Iterator;

/* JADX WARN: Classes with same name are omitted:
  
 */
/* loaded from: classes.dex */
public final class h {

    /* renamed from: a  reason: collision with root package name */
    public final Runnable f46a;

    /* renamed from: b  reason: collision with root package name */
    public final ArrayDeque f47b = new ArrayDeque();

    public h(Runnable fallbackOnBackPressed) {
        this.f46a = fallbackOnBackPressed;
    }

    public a b(f onBackPressedCallback) {
        this.f47b.add(onBackPressedCallback);
        g cancellable = new g(this, onBackPressedCallback);
        onBackPressedCallback.a(cancellable);
        return cancellable;
    }

    public void a(m owner, f onBackPressedCallback) {
        j lifecycle = owner.g();
        if (lifecycle.b() != i.DESTROYED) {
            onBackPressedCallback.a(new OnBackPressedDispatcher$LifecycleOnBackPressedCancellable(this, lifecycle, onBackPressedCallback));
        }
    }

    public void c() {
        Iterator<OnBackPressedCallback> iterator = this.f47b.descendingIterator();
        while (iterator.hasNext()) {
            f callback = (f) iterator.next();
            if (callback.c()) {
                callback.b();
                return;
            }
        }
        Runnable runnable = this.f46a;
        if (runnable != null) {
            runnable.run();
        }
    }
}
