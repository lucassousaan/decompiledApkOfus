package i0;

import android.content.res.Resources;
import android.os.SystemClock;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.Interpolator;
import f0.c1;

/* JADX WARN: Classes with same name are omitted:
  
 */
/* loaded from: classes.dex */
public abstract class c implements View.OnTouchListener {

    /* renamed from: r  reason: collision with root package name */
    public static final int f2238r = ViewConfiguration.getTapTimeout();

    /* renamed from: d  reason: collision with root package name */
    public final View f2241d;

    /* renamed from: e  reason: collision with root package name */
    public Runnable f2242e;

    /* renamed from: h  reason: collision with root package name */
    public int f2245h;

    /* renamed from: i  reason: collision with root package name */
    public int f2246i;

    /* renamed from: m  reason: collision with root package name */
    public boolean f2250m;

    /* renamed from: n  reason: collision with root package name */
    public boolean f2251n;

    /* renamed from: o  reason: collision with root package name */
    public boolean f2252o;

    /* renamed from: p  reason: collision with root package name */
    public boolean f2253p;

    /* renamed from: q  reason: collision with root package name */
    public boolean f2254q;

    /* renamed from: b  reason: collision with root package name */
    public final a f2239b = new a();

    /* renamed from: c  reason: collision with root package name */
    public final Interpolator f2240c = new AccelerateInterpolator();

    /* renamed from: f  reason: collision with root package name */
    public float[] f2243f = {0.0f, 0.0f};

    /* renamed from: g  reason: collision with root package name */
    public float[] f2244g = {Float.MAX_VALUE, Float.MAX_VALUE};

    /* renamed from: j  reason: collision with root package name */
    public float[] f2247j = {0.0f, 0.0f};

    /* renamed from: k  reason: collision with root package name */
    public float[] f2248k = {0.0f, 0.0f};

    /* renamed from: l  reason: collision with root package name */
    public float[] f2249l = {Float.MAX_VALUE, Float.MAX_VALUE};

    public abstract boolean a(int i2);

    public abstract boolean b(int i2);

    public abstract void j(int i2, int i3);

    public c(View target) {
        this.f2241d = target;
        DisplayMetrics metrics = Resources.getSystem().getDisplayMetrics();
        float f2 = metrics.density;
        int maxVelocity = (int) ((1575.0f * f2) + 0.5f);
        int minVelocity = (int) ((f2 * 315.0f) + 0.5f);
        o(maxVelocity, maxVelocity);
        p(minVelocity, minVelocity);
        l(1);
        n(Float.MAX_VALUE, Float.MAX_VALUE);
        s(0.2f, 0.2f);
        t(1.0f, 1.0f);
        k(f2238r);
        r(500);
        q(500);
    }

    public c m(boolean enabled) {
        if (this.f2254q && !enabled) {
            i();
        }
        this.f2254q = enabled;
        return this;
    }

    public c o(float horizontalMax, float verticalMax) {
        float[] fArr = this.f2249l;
        fArr[0] = horizontalMax / 1000.0f;
        fArr[1] = verticalMax / 1000.0f;
        return this;
    }

    public c p(float horizontalMin, float verticalMin) {
        float[] fArr = this.f2248k;
        fArr[0] = horizontalMin / 1000.0f;
        fArr[1] = verticalMin / 1000.0f;
        return this;
    }

    public c t(float horizontal, float vertical) {
        float[] fArr = this.f2247j;
        fArr[0] = horizontal / 1000.0f;
        fArr[1] = vertical / 1000.0f;
        return this;
    }

    public c l(int type) {
        this.f2245h = type;
        return this;
    }

    public c s(float horizontal, float vertical) {
        float[] fArr = this.f2243f;
        fArr[0] = horizontal;
        fArr[1] = vertical;
        return this;
    }

    public c n(float horizontalMax, float verticalMax) {
        float[] fArr = this.f2244g;
        fArr[0] = horizontalMax;
        fArr[1] = verticalMax;
        return this;
    }

    public c k(int delayMillis) {
        this.f2246i = delayMillis;
        return this;
    }

    public c r(int durationMillis) {
        this.f2239b.k(durationMillis);
        return this;
    }

    public c q(int durationMillis) {
        this.f2239b.j(durationMillis);
        return this;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View v2, MotionEvent event) {
        if (!this.f2254q) {
            return false;
        }
        int action = event.getActionMasked();
        switch (action) {
            case 0:
                this.f2252o = true;
                this.f2250m = false;
                float xTargetVelocity = d(0, event.getX(), v2.getWidth(), this.f2241d.getWidth());
                float yTargetVelocity = d(1, event.getY(), v2.getHeight(), this.f2241d.getHeight());
                this.f2239b.l(xTargetVelocity, yTargetVelocity);
                if (!this.f2253p && u()) {
                    v();
                    break;
                }
                break;
            case 1:
            case 3:
                i();
                break;
            case 2:
                float xTargetVelocity2 = d(0, event.getX(), v2.getWidth(), this.f2241d.getWidth());
                float yTargetVelocity2 = d(1, event.getY(), v2.getHeight(), this.f2241d.getHeight());
                this.f2239b.l(xTargetVelocity2, yTargetVelocity2);
                if (!this.f2253p) {
                    v();
                    break;
                }
                break;
        }
        return false;
    }

    public boolean u() {
        a scroller = this.f2239b;
        int verticalDirection = scroller.f();
        int horizontalDirection = scroller.d();
        if (verticalDirection != 0 && b(verticalDirection)) {
            return true;
        }
        if (horizontalDirection != 0) {
            a(horizontalDirection);
        }
        return false;
    }

    public final void v() {
        int i2;
        if (this.f2242e == null) {
            this.f2242e = new b(this);
        }
        this.f2253p = true;
        this.f2251n = true;
        if (this.f2250m || (i2 = this.f2246i) <= 0) {
            this.f2242e.run();
        } else {
            c1.e0(this.f2241d, this.f2242e, i2);
        }
        this.f2250m = true;
    }

    public final void i() {
        if (this.f2251n) {
            this.f2253p = false;
        } else {
            this.f2239b.i();
        }
    }

    public final float d(int direction, float coordinate, float srcSize, float dstSize) {
        float relativeEdge = this.f2243f[direction];
        float maximumEdge = this.f2244g[direction];
        float value = h(relativeEdge, srcSize, maximumEdge, coordinate);
        if (value == 0.0f) {
            return 0.0f;
        }
        float relativeVelocity = this.f2247j[direction];
        float minimumVelocity = this.f2248k[direction];
        float maximumVelocity = this.f2249l[direction];
        float targetVelocity = relativeVelocity * dstSize;
        if (value > 0.0f) {
            return e(value * targetVelocity, minimumVelocity, maximumVelocity);
        }
        return -e((-value) * targetVelocity, minimumVelocity, maximumVelocity);
    }

    public final float h(float relativeValue, float size, float maxValue, float current) {
        float interpolated;
        float edgeSize = e(relativeValue * size, 0.0f, maxValue);
        float valueLeading = g(current, edgeSize);
        float valueTrailing = g(size - current, edgeSize);
        float value = valueTrailing - valueLeading;
        if (value < 0.0f) {
            interpolated = -this.f2240c.getInterpolation(-value);
        } else if (value <= 0.0f) {
            return 0.0f;
        } else {
            interpolated = this.f2240c.getInterpolation(value);
        }
        return e(interpolated, -1.0f, 1.0f);
    }

    public final float g(float current, float leading) {
        if (leading == 0.0f) {
            return 0.0f;
        }
        int i2 = this.f2245h;
        switch (i2) {
            case 0:
            case 1:
                if (current < leading) {
                    if (current >= 0.0f) {
                        return 1.0f - (current / leading);
                    }
                    if (this.f2253p && i2 == 1) {
                        return 1.0f;
                    }
                }
                break;
            case 2:
                if (current < 0.0f) {
                    return current / (-leading);
                }
                break;
        }
        return 0.0f;
    }

    public static int f(int value, int min, int max) {
        if (value > max) {
            return max;
        }
        if (value < min) {
            return min;
        }
        return value;
    }

    public static float e(float value, float min, float max) {
        if (value > max) {
            return max;
        }
        if (value < min) {
            return min;
        }
        return value;
    }

    public void c() {
        long eventTime = SystemClock.uptimeMillis();
        MotionEvent cancel = MotionEvent.obtain(eventTime, eventTime, 3, 0.0f, 0.0f, 0);
        this.f2241d.onTouchEvent(cancel);
        cancel.recycle();
    }
}
