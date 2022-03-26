package f0;

import android.view.View;
import android.view.ViewTreeObserver;

/* JADX WARN: Classes with same name are omitted:
  
 */
/* loaded from: classes.dex */
public final class d0 implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {

    /* renamed from: b  reason: collision with root package name */
    public final View f1857b;

    /* renamed from: c  reason: collision with root package name */
    public ViewTreeObserver f1858c;

    /* renamed from: d  reason: collision with root package name */
    public final Runnable f1859d;

    public d0(View view, Runnable runnable) {
        this.f1857b = view;
        this.f1858c = view.getViewTreeObserver();
        this.f1859d = runnable;
    }

    public static d0 a(View view, Runnable runnable) {
        if (view == null) {
            throw new NullPointerException("view == null");
        } else if (runnable != null) {
            d0 listener = new d0(view, runnable);
            view.getViewTreeObserver().addOnPreDrawListener(listener);
            view.addOnAttachStateChangeListener(listener);
            return listener;
        } else {
            throw new NullPointerException("runnable == null");
        }
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public boolean onPreDraw() {
        b();
        this.f1859d.run();
        return true;
    }

    public void b() {
        if (this.f1858c.isAlive()) {
            this.f1858c.removeOnPreDrawListener(this);
        } else {
            this.f1857b.getViewTreeObserver().removeOnPreDrawListener(this);
        }
        this.f1857b.removeOnAttachStateChangeListener(this);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(View v2) {
        this.f1858c = v2.getViewTreeObserver();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(View v2) {
        b();
    }
}
