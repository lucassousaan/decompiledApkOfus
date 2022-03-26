package i0;

import android.view.animation.AnimationUtils;

/* JADX WARN: Classes with same name are omitted:
  
 */
/* loaded from: classes.dex */
public class a {

    /* renamed from: a  reason: collision with root package name */
    public int f2226a;

    /* renamed from: b  reason: collision with root package name */
    public int f2227b;

    /* renamed from: c  reason: collision with root package name */
    public float f2228c;

    /* renamed from: d  reason: collision with root package name */
    public float f2229d;

    /* renamed from: j  reason: collision with root package name */
    public float f2235j;

    /* renamed from: k  reason: collision with root package name */
    public int f2236k;

    /* renamed from: e  reason: collision with root package name */
    public long f2230e = Long.MIN_VALUE;

    /* renamed from: i  reason: collision with root package name */
    public long f2234i = -1;

    /* renamed from: f  reason: collision with root package name */
    public long f2231f = 0;

    /* renamed from: g  reason: collision with root package name */
    public int f2232g = 0;

    /* renamed from: h  reason: collision with root package name */
    public int f2233h = 0;

    public void k(int durationMillis) {
        this.f2226a = durationMillis;
    }

    public void j(int durationMillis) {
        this.f2227b = durationMillis;
    }

    public void m() {
        long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
        this.f2230e = currentAnimationTimeMillis;
        this.f2234i = -1L;
        this.f2231f = currentAnimationTimeMillis;
        this.f2235j = 0.5f;
        this.f2232g = 0;
        this.f2233h = 0;
    }

    public void i() {
        long currentTime = AnimationUtils.currentAnimationTimeMillis();
        this.f2236k = c.f((int) (currentTime - this.f2230e), 0, this.f2227b);
        this.f2235j = e(currentTime);
        this.f2234i = currentTime;
    }

    public boolean h() {
        return this.f2234i > 0 && AnimationUtils.currentAnimationTimeMillis() > this.f2234i + ((long) this.f2236k);
    }

    public final float e(long currentTime) {
        long elapsedSinceEnd = this.f2230e;
        if (currentTime < elapsedSinceEnd) {
            return 0.0f;
        }
        long j2 = this.f2234i;
        if (j2 < 0 || currentTime < j2) {
            long elapsedSinceStart = currentTime - elapsedSinceEnd;
            return c.e(((float) elapsedSinceStart) / this.f2226a, 0.0f, 1.0f) * 0.5f;
        }
        long elapsedSinceEnd2 = currentTime - j2;
        float f2 = this.f2235j;
        return (1.0f - f2) + (f2 * c.e(((float) elapsedSinceEnd2) / this.f2236k, 0.0f, 1.0f));
    }

    public final float g(float value) {
        return ((-4.0f) * value * value) + (4.0f * value);
    }

    public void a() {
        if (this.f2231f != 0) {
            long currentTime = AnimationUtils.currentAnimationTimeMillis();
            float value = e(currentTime);
            float scale = g(value);
            long elapsedSinceDelta = currentTime - this.f2231f;
            this.f2231f = currentTime;
            this.f2232g = (int) (((float) elapsedSinceDelta) * scale * this.f2228c);
            this.f2233h = (int) (((float) elapsedSinceDelta) * scale * this.f2229d);
            return;
        }
        throw new RuntimeException("Cannot compute scroll delta before calling start()");
    }

    public void l(float x2, float y2) {
        this.f2228c = x2;
        this.f2229d = y2;
    }

    public int d() {
        float f2 = this.f2228c;
        return (int) (f2 / Math.abs(f2));
    }

    public int f() {
        float f2 = this.f2229d;
        return (int) (f2 / Math.abs(f2));
    }

    public int b() {
        return this.f2232g;
    }

    public int c() {
        return this.f2233h;
    }
}
