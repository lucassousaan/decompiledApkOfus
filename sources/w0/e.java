package w0;

import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;

/* JADX WARN: Classes with same name are omitted:
  
 */
/* loaded from: classes.dex */
public class e {

    /* renamed from: a  reason: collision with root package name */
    public long f3659a;

    /* renamed from: b  reason: collision with root package name */
    public long f3660b;

    /* renamed from: c  reason: collision with root package name */
    public TimeInterpolator f3661c;

    /* renamed from: d  reason: collision with root package name */
    public int f3662d;

    /* renamed from: e  reason: collision with root package name */
    public int f3663e;

    public e(long delay, long duration) {
        this.f3659a = 0L;
        this.f3660b = 300L;
        this.f3661c = null;
        this.f3662d = 0;
        this.f3663e = 1;
        this.f3659a = delay;
        this.f3660b = duration;
    }

    public e(long delay, long duration, TimeInterpolator interpolator) {
        this.f3659a = 0L;
        this.f3660b = 300L;
        this.f3661c = null;
        this.f3662d = 0;
        this.f3663e = 1;
        this.f3659a = delay;
        this.f3660b = duration;
        this.f3661c = interpolator;
    }

    public void a(Animator animator) {
        animator.setStartDelay(c());
        animator.setDuration(d());
        animator.setInterpolator(e());
        if (animator instanceof ValueAnimator) {
            ((ValueAnimator) animator).setRepeatCount(g());
            ((ValueAnimator) animator).setRepeatMode(h());
        }
    }

    public long c() {
        return this.f3659a;
    }

    public long d() {
        return this.f3660b;
    }

    public TimeInterpolator e() {
        TimeInterpolator timeInterpolator = this.f3661c;
        return timeInterpolator != null ? timeInterpolator : a.f3652b;
    }

    public int g() {
        return this.f3662d;
    }

    public int h() {
        return this.f3663e;
    }

    public static e b(ValueAnimator animator) {
        e timing = new e(animator.getStartDelay(), animator.getDuration(), f(animator));
        timing.f3662d = animator.getRepeatCount();
        timing.f3663e = animator.getRepeatMode();
        return timing;
    }

    public static TimeInterpolator f(ValueAnimator animator) {
        TimeInterpolator interpolator = animator.getInterpolator();
        if ((interpolator instanceof AccelerateDecelerateInterpolator) || interpolator == null) {
            return a.f3652b;
        }
        if (interpolator instanceof AccelerateInterpolator) {
            return a.f3653c;
        }
        if (interpolator instanceof DecelerateInterpolator) {
            return a.f3654d;
        }
        return interpolator;
    }

    public boolean equals(Object o2) {
        if (this == o2) {
            return true;
        }
        if (!(o2 instanceof e)) {
            return false;
        }
        e that = (e) o2;
        if (c() == that.c() && d() == that.d() && g() == that.g() && h() == that.h()) {
            return e().getClass().equals(that.e().getClass());
        }
        return false;
    }

    public int hashCode() {
        int result = (int) (c() ^ (c() >>> 32));
        return (((((((result * 31) + ((int) (d() ^ (d() >>> 32)))) * 31) + e().getClass().hashCode()) * 31) + g()) * 31) + h();
    }

    public String toString() {
        return '\n' + getClass().getName() + '{' + Integer.toHexString(System.identityHashCode(this)) + " delay: " + c() + " duration: " + d() + " interpolator: " + e().getClass() + " repeatCount: " + g() + " repeatMode: " + h() + "}\n";
    }
}
