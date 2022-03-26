package f0;

import android.animation.ValueAnimator;
import android.view.View;
import android.view.animation.Interpolator;
import java.lang.ref.WeakReference;

/* JADX WARN: Classes with same name are omitted:
  
 */
/* loaded from: classes.dex */
public final class h1 {

    /* renamed from: a  reason: collision with root package name */
    public WeakReference f1869a;

    /* renamed from: b  reason: collision with root package name */
    public Runnable f1870b = null;

    /* renamed from: c  reason: collision with root package name */
    public Runnable f1871c = null;

    /* renamed from: d  reason: collision with root package name */
    public int f1872d = -1;

    public h1(View view) {
        this.f1869a = new WeakReference(view);
    }

    public h1 d(long value) {
        View view = (View) this.f1869a.get();
        if (view != null) {
            view.animate().setDuration(value);
        }
        return this;
    }

    public h1 a(float value) {
        View view = (View) this.f1869a.get();
        if (view != null) {
            view.animate().alpha(value);
        }
        return this;
    }

    public h1 k(float value) {
        View view = (View) this.f1869a.get();
        if (view != null) {
            view.animate().translationY(value);
        }
        return this;
    }

    public long c() {
        View view = (View) this.f1869a.get();
        if (view != null) {
            return view.animate().getDuration();
        }
        return 0L;
    }

    public h1 e(Interpolator value) {
        View view = (View) this.f1869a.get();
        if (view != null) {
            view.animate().setInterpolator(value);
        }
        return this;
    }

    public h1 h(long value) {
        View view = (View) this.f1869a.get();
        if (view != null) {
            view.animate().setStartDelay(value);
        }
        return this;
    }

    public void b() {
        View view = (View) this.f1869a.get();
        if (view != null) {
            view.animate().cancel();
        }
    }

    public void j() {
        View view = (View) this.f1869a.get();
        if (view != null) {
            view.animate().start();
        }
    }

    public h1 f(i1 listener) {
        View view = (View) this.f1869a.get();
        if (view != null) {
            g(view, listener);
        }
        return this;
    }

    public final void g(View view, i1 listener) {
        if (listener != null) {
            view.animate().setListener(new f1(this, listener, view));
        } else {
            view.animate().setListener(null);
        }
    }

    public h1 i(k1 listener) {
        View view = (View) this.f1869a.get();
        if (view != null) {
            ValueAnimator.AnimatorUpdateListener wrapped = null;
            if (listener != null) {
                wrapped = new g1(this, listener, view);
            }
            view.animate().setUpdateListener(wrapped);
        }
        return this;
    }
}
