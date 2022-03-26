package q0;

import android.content.Context;
import android.graphics.PointF;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;

/* JADX WARN: Classes with same name are omitted:
  
 */
/* loaded from: classes.dex */
public class j0 extends a2 {

    /* renamed from: k  reason: collision with root package name */
    public PointF f3083k;

    /* renamed from: l  reason: collision with root package name */
    public final DisplayMetrics f3084l;

    /* renamed from: n  reason: collision with root package name */
    public float f3086n;

    /* renamed from: i  reason: collision with root package name */
    public final LinearInterpolator f3081i = new LinearInterpolator();

    /* renamed from: j  reason: collision with root package name */
    public final DecelerateInterpolator f3082j = new DecelerateInterpolator();

    /* renamed from: m  reason: collision with root package name */
    public boolean f3085m = false;

    /* renamed from: o  reason: collision with root package name */
    public int f3087o = 0;

    /* renamed from: p  reason: collision with root package name */
    public int f3088p = 0;

    public j0(Context context) {
        this.f3084l = context.getResources().getDisplayMetrics();
    }

    @Override // q0.a2
    public void m() {
    }

    @Override // q0.a2
    public void o(View targetView, b2 state, y1 action) {
        int dx = t(targetView, z());
        int dy = u(targetView, B());
        int distance = (int) Math.sqrt((dx * dx) + (dy * dy));
        int time = w(distance);
        if (time > 0) {
            action.d(-dx, -dy, time, this.f3082j);
        }
    }

    @Override // q0.a2
    public void l(int dx, int dy, b2 state, y1 action) {
        if (c() == 0) {
            r();
            return;
        }
        this.f3087o = y(this.f3087o, dx);
        int y2 = y(this.f3088p, dy);
        this.f3088p = y2;
        if (this.f3087o == 0 && y2 == 0) {
            C(action);
        }
    }

    @Override // q0.a2
    public void n() {
        this.f3088p = 0;
        this.f3087o = 0;
        this.f3083k = null;
    }

    public float v(DisplayMetrics displayMetrics) {
        return 25.0f / displayMetrics.densityDpi;
    }

    public final float A() {
        if (!this.f3085m) {
            this.f3086n = v(this.f3084l);
            this.f3085m = true;
        }
        return this.f3086n;
    }

    public int w(int dx) {
        return (int) Math.ceil(x(dx) / 0.3356d);
    }

    public int x(int dx) {
        return (int) Math.ceil(Math.abs(dx) * A());
    }

    public int z() {
        PointF pointF = this.f3083k;
        if (pointF != null) {
            float f2 = pointF.x;
            if (f2 != 0.0f) {
                return f2 > 0.0f ? 1 : -1;
            }
        }
        return 0;
    }

    public int B() {
        PointF pointF = this.f3083k;
        if (pointF != null) {
            float f2 = pointF.y;
            if (f2 != 0.0f) {
                return f2 > 0.0f ? 1 : -1;
            }
        }
        return 0;
    }

    public void C(y1 action) {
        PointF scrollVector = a(f());
        if (scrollVector == null || (scrollVector.x == 0.0f && scrollVector.y == 0.0f)) {
            int target = f();
            action.b(target);
            r();
            return;
        }
        i(scrollVector);
        this.f3083k = scrollVector;
        this.f3087o = (int) (scrollVector.x * 10000.0f);
        this.f3088p = (int) (scrollVector.y * 10000.0f);
        int time = x(10000);
        action.d((int) (this.f3087o * 1.2f), (int) (this.f3088p * 1.2f), (int) (time * 1.2f), this.f3081i);
    }

    public final int y(int tmpDt, int dt) {
        int tmpDt2 = tmpDt - dt;
        if (tmpDt * tmpDt2 <= 0) {
            return 0;
        }
        return tmpDt2;
    }

    public int s(int viewStart, int viewEnd, int boxStart, int boxEnd, int snapPreference) {
        switch (snapPreference) {
            case -1:
                return boxStart - viewStart;
            case 0:
                int dtStart = boxStart - viewStart;
                if (dtStart > 0) {
                    return dtStart;
                }
                int dtEnd = boxEnd - viewEnd;
                if (dtEnd < 0) {
                    return dtEnd;
                }
                return 0;
            case 1:
                return boxEnd - viewEnd;
            default:
                throw new IllegalArgumentException("snap preference should be one of the constants defined in SmoothScroller, starting with SNAP_");
        }
    }

    public int u(View view, int snapPreference) {
        m1 layoutManager = e();
        if (layoutManager == null || !layoutManager.l()) {
            return 0;
        }
        n1 params = (n1) view.getLayoutParams();
        int top = layoutManager.U(view) - ((ViewGroup.MarginLayoutParams) params).topMargin;
        int bottom = layoutManager.O(view) + ((ViewGroup.MarginLayoutParams) params).bottomMargin;
        int start = layoutManager.g0();
        int end = layoutManager.W() - layoutManager.d0();
        return s(top, bottom, start, end, snapPreference);
    }

    public int t(View view, int snapPreference) {
        m1 layoutManager = e();
        if (layoutManager == null || !layoutManager.k()) {
            return 0;
        }
        n1 params = (n1) view.getLayoutParams();
        int left = layoutManager.Q(view) - ((ViewGroup.MarginLayoutParams) params).leftMargin;
        int right = layoutManager.T(view) + ((ViewGroup.MarginLayoutParams) params).rightMargin;
        int start = layoutManager.e0();
        int end = layoutManager.o0() - layoutManager.f0();
        return s(left, right, start, end, snapPreference);
    }
}
