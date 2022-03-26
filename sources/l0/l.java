package l0;

import android.content.Context;
import android.util.Log;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.animation.Interpolator;
import android.widget.OverScroller;
import f0.c1;
import java.util.Arrays;

/* JADX WARN: Classes with same name are omitted:
  
 */
/* loaded from: classes.dex */
public class l {

    /* renamed from: v  reason: collision with root package name */
    public static final Interpolator f2375v = new i();

    /* renamed from: a  reason: collision with root package name */
    public int f2376a;

    /* renamed from: b  reason: collision with root package name */
    public int f2377b;

    /* renamed from: d  reason: collision with root package name */
    public float[] f2379d;

    /* renamed from: e  reason: collision with root package name */
    public float[] f2380e;

    /* renamed from: f  reason: collision with root package name */
    public float[] f2381f;

    /* renamed from: g  reason: collision with root package name */
    public float[] f2382g;

    /* renamed from: h  reason: collision with root package name */
    public int[] f2383h;

    /* renamed from: i  reason: collision with root package name */
    public int[] f2384i;

    /* renamed from: j  reason: collision with root package name */
    public int[] f2385j;

    /* renamed from: k  reason: collision with root package name */
    public int f2386k;

    /* renamed from: l  reason: collision with root package name */
    public VelocityTracker f2387l;

    /* renamed from: m  reason: collision with root package name */
    public float f2388m;

    /* renamed from: n  reason: collision with root package name */
    public float f2389n;

    /* renamed from: o  reason: collision with root package name */
    public int f2390o;

    /* renamed from: p  reason: collision with root package name */
    public OverScroller f2391p;

    /* renamed from: q  reason: collision with root package name */
    public final k f2392q;

    /* renamed from: r  reason: collision with root package name */
    public View f2393r;

    /* renamed from: s  reason: collision with root package name */
    public boolean f2394s;

    /* renamed from: t  reason: collision with root package name */
    public final ViewGroup f2395t;

    /* renamed from: c  reason: collision with root package name */
    public int f2378c = -1;

    /* renamed from: u  reason: collision with root package name */
    public final Runnable f2396u = new j(this);

    public static l l(ViewGroup forParent, k cb) {
        return new l(forParent.getContext(), forParent, cb);
    }

    public l(Context context, ViewGroup forParent, k cb) {
        if (forParent == null) {
            throw new IllegalArgumentException("Parent view may not be null");
        } else if (cb != null) {
            this.f2395t = forParent;
            this.f2392q = cb;
            ViewConfiguration vc = ViewConfiguration.get(context);
            float density = context.getResources().getDisplayMetrics().density;
            this.f2390o = (int) ((20.0f * density) + 0.5f);
            this.f2377b = vc.getScaledTouchSlop();
            this.f2388m = vc.getScaledMaximumFlingVelocity();
            this.f2389n = vc.getScaledMinimumFlingVelocity();
            this.f2391p = new OverScroller(context, f2375v);
        } else {
            throw new IllegalArgumentException("Callback may not be null");
        }
    }

    public void b(View childView, int activePointerId) {
        if (childView.getParent() == this.f2395t) {
            this.f2393r = childView;
            this.f2378c = activePointerId;
            this.f2392q.i(childView, activePointerId);
            D(1);
            return;
        }
        throw new IllegalArgumentException("captureChildView: parameter must be a descendant of the ViewDragHelper's tracked parent view (" + this.f2395t + ")");
    }

    public int t() {
        return this.f2377b;
    }

    public void a() {
        this.f2378c = -1;
        g();
        VelocityTracker velocityTracker = this.f2387l;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.f2387l = null;
        }
    }

    public boolean G(View child, int finalLeft, int finalTop) {
        this.f2393r = child;
        this.f2378c = -1;
        boolean continueSliding = r(finalLeft, finalTop, 0, 0);
        if (!continueSliding && this.f2376a == 0 && this.f2393r != null) {
            this.f2393r = null;
        }
        return continueSliding;
    }

    public boolean E(int finalLeft, int finalTop) {
        if (this.f2394s) {
            return r(finalLeft, finalTop, (int) this.f2387l.getXVelocity(this.f2378c), (int) this.f2387l.getYVelocity(this.f2378c));
        }
        throw new IllegalStateException("Cannot settleCapturedViewAt outside of a call to Callback#onViewReleased");
    }

    public final boolean r(int finalLeft, int finalTop, int xvel, int yvel) {
        int startLeft = this.f2393r.getLeft();
        int startTop = this.f2393r.getTop();
        int dx = finalLeft - startLeft;
        int dy = finalTop - startTop;
        if (dx == 0 && dy == 0) {
            this.f2391p.abortAnimation();
            D(0);
            return false;
        }
        int duration = j(this.f2393r, dx, dy, xvel, yvel);
        this.f2391p.startScroll(startLeft, startTop, dx, dy, duration);
        D(2);
        return true;
    }

    public final int j(View child, int dx, int dy, int xvel, int yvel) {
        float f2;
        float f3;
        float f4;
        float f5;
        int xvel2 = f(xvel, (int) this.f2389n, (int) this.f2388m);
        int yvel2 = f(yvel, (int) this.f2389n, (int) this.f2388m);
        int absDx = Math.abs(dx);
        int absDy = Math.abs(dy);
        int absXVel = Math.abs(xvel2);
        int absYVel = Math.abs(yvel2);
        int addedVel = absXVel + absYVel;
        int addedDistance = absDx + absDy;
        if (xvel2 != 0) {
            f3 = absXVel;
            f2 = addedVel;
        } else {
            f3 = absDx;
            f2 = addedDistance;
        }
        float xweight = f3 / f2;
        if (yvel2 != 0) {
            f5 = absYVel;
            f4 = addedVel;
        } else {
            f5 = absDy;
            f4 = addedDistance;
        }
        float yweight = f5 / f4;
        int xduration = i(dx, xvel2, this.f2392q.d(child));
        int yduration = i(dy, yvel2, this.f2392q.e(child));
        return (int) ((xduration * xweight) + (yduration * yweight));
    }

    public final int i(int delta, int velocity, int motionRange) {
        int duration;
        if (delta == 0) {
            return 0;
        }
        int width = this.f2395t.getWidth();
        int halfWidth = width / 2;
        float distanceRatio = Math.min(1.0f, Math.abs(delta) / width);
        float distance = halfWidth + (halfWidth * n(distanceRatio));
        int velocity2 = Math.abs(velocity);
        if (velocity2 > 0) {
            duration = Math.round(Math.abs(distance / velocity2) * 1000.0f) * 4;
        } else {
            float range = Math.abs(delta) / motionRange;
            duration = (int) ((1.0f + range) * 256.0f);
        }
        return Math.min(duration, 600);
    }

    public final int f(int value, int absMin, int absMax) {
        int absValue = Math.abs(value);
        if (absValue < absMin) {
            return 0;
        }
        if (absValue > absMax) {
            return value > 0 ? absMax : -absMax;
        }
        return value;
    }

    public final float e(float value, float absMin, float absMax) {
        float absValue = Math.abs(value);
        if (absValue < absMin) {
            return 0.0f;
        }
        if (absValue > absMax) {
            return value > 0.0f ? absMax : -absMax;
        }
        return value;
    }

    public final float n(float f2) {
        return (float) Math.sin((f2 - 0.5f) * 0.47123894f);
    }

    public boolean k(boolean deferCallbacks) {
        if (this.f2376a == 2) {
            boolean keepGoing = this.f2391p.computeScrollOffset();
            int x2 = this.f2391p.getCurrX();
            int y2 = this.f2391p.getCurrY();
            int dx = x2 - this.f2393r.getLeft();
            int dy = y2 - this.f2393r.getTop();
            if (dx != 0) {
                c1.V(this.f2393r, dx);
            }
            if (dy != 0) {
                c1.W(this.f2393r, dy);
            }
            if (!(dx == 0 && dy == 0)) {
                this.f2392q.k(this.f2393r, x2, y2, dx, dy);
            }
            if (keepGoing && x2 == this.f2391p.getFinalX() && y2 == this.f2391p.getFinalY()) {
                this.f2391p.abortAnimation();
                keepGoing = false;
            }
            if (!keepGoing) {
                if (deferCallbacks) {
                    this.f2395t.post(this.f2396u);
                } else {
                    D(0);
                }
            }
        }
        return this.f2376a == 2;
    }

    public final void m(float xvel, float yvel) {
        this.f2394s = true;
        this.f2392q.l(this.f2393r, xvel, yvel);
        this.f2394s = false;
        if (this.f2376a == 1) {
            D(0);
        }
    }

    public final void g() {
        float[] fArr = this.f2379d;
        if (fArr != null) {
            Arrays.fill(fArr, 0.0f);
            Arrays.fill(this.f2380e, 0.0f);
            Arrays.fill(this.f2381f, 0.0f);
            Arrays.fill(this.f2382g, 0.0f);
            Arrays.fill(this.f2383h, 0);
            Arrays.fill(this.f2384i, 0);
            Arrays.fill(this.f2385j, 0);
            this.f2386k = 0;
        }
    }

    public final void h(int pointerId) {
        if (this.f2379d != null && v(pointerId)) {
            this.f2379d[pointerId] = 0.0f;
            this.f2380e[pointerId] = 0.0f;
            this.f2381f[pointerId] = 0.0f;
            this.f2382g[pointerId] = 0.0f;
            this.f2383h[pointerId] = 0;
            this.f2384i[pointerId] = 0;
            this.f2385j[pointerId] = 0;
            this.f2386k &= ~(1 << pointerId);
        }
    }

    public final void p(int pointerId) {
        float[] fArr = this.f2379d;
        if (fArr == null || fArr.length <= pointerId) {
            float[] imx = new float[pointerId + 1];
            float[] imy = new float[pointerId + 1];
            float[] lmx = new float[pointerId + 1];
            float[] lmy = new float[pointerId + 1];
            int[] iit = new int[pointerId + 1];
            int[] edip = new int[pointerId + 1];
            int[] edl = new int[pointerId + 1];
            if (fArr != null) {
                System.arraycopy(fArr, 0, imx, 0, fArr.length);
                float[] fArr2 = this.f2380e;
                System.arraycopy(fArr2, 0, imy, 0, fArr2.length);
                float[] fArr3 = this.f2381f;
                System.arraycopy(fArr3, 0, lmx, 0, fArr3.length);
                float[] fArr4 = this.f2382g;
                System.arraycopy(fArr4, 0, lmy, 0, fArr4.length);
                int[] iArr = this.f2383h;
                System.arraycopy(iArr, 0, iit, 0, iArr.length);
                int[] iArr2 = this.f2384i;
                System.arraycopy(iArr2, 0, edip, 0, iArr2.length);
                int[] iArr3 = this.f2385j;
                System.arraycopy(iArr3, 0, edl, 0, iArr3.length);
            }
            this.f2379d = imx;
            this.f2380e = imy;
            this.f2381f = lmx;
            this.f2382g = lmy;
            this.f2383h = iit;
            this.f2384i = edip;
            this.f2385j = edl;
        }
    }

    public final void B(float x2, float y2, int pointerId) {
        p(pointerId);
        float[] fArr = this.f2379d;
        this.f2381f[pointerId] = x2;
        fArr[pointerId] = x2;
        float[] fArr2 = this.f2380e;
        this.f2382g[pointerId] = y2;
        fArr2[pointerId] = y2;
        this.f2383h[pointerId] = s((int) x2, (int) y2);
        this.f2386k |= 1 << pointerId;
    }

    public final void C(MotionEvent ev) {
        int pointerCount = ev.getPointerCount();
        for (int i2 = 0; i2 < pointerCount; i2++) {
            int pointerId = ev.getPointerId(i2);
            if (w(pointerId)) {
                float x2 = ev.getX(i2);
                float y2 = ev.getY(i2);
                this.f2381f[pointerId] = x2;
                this.f2382g[pointerId] = y2;
            }
        }
    }

    public boolean v(int pointerId) {
        return (this.f2386k & (1 << pointerId)) != 0;
    }

    public void D(int state) {
        this.f2395t.removeCallbacks(this.f2396u);
        if (this.f2376a != state) {
            this.f2376a = state;
            this.f2392q.j(state);
            if (this.f2376a == 0) {
                this.f2393r = null;
            }
        }
    }

    public boolean H(View toCapture, int pointerId) {
        if (toCapture == this.f2393r && this.f2378c == pointerId) {
            return true;
        }
        if (toCapture == null || !this.f2392q.m(toCapture, pointerId)) {
            return false;
        }
        this.f2378c = pointerId;
        b(toCapture, pointerId);
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:43:0x00fa, code lost:
        if (r2 != r15) goto L_0x0109;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean F(android.view.MotionEvent r22) {
        /*
            Method dump skipped, instructions count: 394
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: l0.l.F(android.view.MotionEvent):boolean");
    }

    public void y(MotionEvent ev) {
        int action = ev.getActionMasked();
        int actionIndex = ev.getActionIndex();
        if (action == 0) {
            a();
        }
        if (this.f2387l == null) {
            this.f2387l = VelocityTracker.obtain();
        }
        this.f2387l.addMovement(ev);
        switch (action) {
            case 0:
                float x2 = ev.getX();
                float y2 = ev.getY();
                int pointerId = ev.getPointerId(0);
                View toCapture = q((int) x2, (int) y2);
                B(x2, y2, pointerId);
                H(toCapture, pointerId);
                int edgesTouched = this.f2383h[pointerId];
                if ((edgesTouched & 0) != 0) {
                    this.f2392q.h();
                    return;
                }
                return;
            case 1:
                if (this.f2376a == 1) {
                    z();
                }
                a();
                return;
            case 2:
                if (this.f2376a != 1) {
                    int pointerCount = ev.getPointerCount();
                    for (int i2 = 0; i2 < pointerCount; i2++) {
                        int pointerId2 = ev.getPointerId(i2);
                        if (w(pointerId2)) {
                            float x3 = ev.getX(i2);
                            float y3 = ev.getY(i2);
                            float dx = x3 - this.f2379d[pointerId2];
                            float dy = y3 - this.f2380e[pointerId2];
                            A(dx, dy, pointerId2);
                            if (this.f2376a != 1) {
                                View toCapture2 = q((int) x3, (int) y3);
                                if (d(toCapture2, dx, dy) && H(toCapture2, pointerId2)) {
                                }
                            }
                            C(ev);
                            return;
                        }
                    }
                    C(ev);
                    return;
                } else if (w(this.f2378c)) {
                    int index = ev.findPointerIndex(this.f2378c);
                    float x4 = ev.getX(index);
                    float y4 = ev.getY(index);
                    float[] fArr = this.f2381f;
                    int i3 = this.f2378c;
                    int idx = (int) (x4 - fArr[i3]);
                    int idy = (int) (y4 - this.f2382g[i3]);
                    o(this.f2393r.getLeft() + idx, this.f2393r.getTop() + idy, idx, idy);
                    C(ev);
                    return;
                } else {
                    return;
                }
            case 3:
                if (this.f2376a == 1) {
                    m(0.0f, 0.0f);
                }
                a();
                return;
            case 4:
            default:
                return;
            case 5:
                int pointerId3 = ev.getPointerId(actionIndex);
                float x5 = ev.getX(actionIndex);
                float y5 = ev.getY(actionIndex);
                B(x5, y5, pointerId3);
                if (this.f2376a == 0) {
                    View toCapture3 = q((int) x5, (int) y5);
                    H(toCapture3, pointerId3);
                    int edgesTouched2 = this.f2383h[pointerId3];
                    if ((edgesTouched2 & 0) != 0) {
                        this.f2392q.h();
                        return;
                    }
                    return;
                } else if (u((int) x5, (int) y5)) {
                    H(this.f2393r, pointerId3);
                    return;
                } else {
                    return;
                }
            case 6:
                int pointerId4 = ev.getPointerId(actionIndex);
                if (this.f2376a == 1 && pointerId4 == this.f2378c) {
                    int newActivePointer = -1;
                    int pointerCount2 = ev.getPointerCount();
                    int i4 = 0;
                    while (true) {
                        if (i4 < pointerCount2) {
                            int id = ev.getPointerId(i4);
                            if (id != this.f2378c) {
                                View q2 = q((int) ev.getX(i4), (int) ev.getY(i4));
                                View view = this.f2393r;
                                if (q2 == view && H(view, id)) {
                                    newActivePointer = this.f2378c;
                                }
                            }
                            i4++;
                        }
                    }
                    if (newActivePointer == -1) {
                        z();
                    }
                }
                h(pointerId4);
                return;
        }
    }

    public final void A(float dx, float dy, int pointerId) {
        int dragsStarted = 0;
        if (c(dx, dy, pointerId, 1)) {
            dragsStarted = 0 | 1;
        }
        if (c(dy, dx, pointerId, 4)) {
            dragsStarted |= 4;
        }
        if (c(dx, dy, pointerId, 2)) {
            dragsStarted |= 2;
        }
        if (c(dy, dx, pointerId, 8)) {
            dragsStarted |= 8;
        }
        if (dragsStarted != 0) {
            int[] iArr = this.f2384i;
            iArr[pointerId] = iArr[pointerId] | dragsStarted;
            this.f2392q.f();
        }
    }

    public final boolean c(float delta, float odelta, int pointerId, int edge) {
        float absDelta = Math.abs(delta);
        float absODelta = Math.abs(odelta);
        if (!((this.f2383h[pointerId] & edge) != edge || (0 & edge) == 0 || (this.f2385j[pointerId] & edge) == edge || (this.f2384i[pointerId] & edge) == edge)) {
            int i2 = this.f2377b;
            if (absDelta > i2 || absODelta > i2) {
                if (absDelta < 0.5f * absODelta) {
                    this.f2392q.g();
                }
                return (this.f2384i[pointerId] & edge) == 0 && absDelta > ((float) this.f2377b);
            }
        }
        return false;
    }

    public final boolean d(View child, float dx, float dy) {
        if (child == null) {
            return false;
        }
        boolean checkHorizontal = this.f2392q.d(child) > 0;
        boolean checkVertical = this.f2392q.e(child) > 0;
        if (!checkHorizontal || !checkVertical) {
            return checkHorizontal ? Math.abs(dx) > ((float) this.f2377b) : checkVertical && Math.abs(dy) > ((float) this.f2377b);
        }
        float f2 = (dx * dx) + (dy * dy);
        int i2 = this.f2377b;
        return f2 > ((float) (i2 * i2));
    }

    public final void z() {
        this.f2387l.computeCurrentVelocity(1000, this.f2388m);
        float xvel = e(this.f2387l.getXVelocity(this.f2378c), this.f2389n, this.f2388m);
        float yvel = e(this.f2387l.getYVelocity(this.f2378c), this.f2389n, this.f2388m);
        m(xvel, yvel);
    }

    public final void o(int left, int top, int dx, int dy) {
        int clampedX = left;
        int clampedY = top;
        int oldLeft = this.f2393r.getLeft();
        int oldTop = this.f2393r.getTop();
        if (dx != 0) {
            clampedX = this.f2392q.a(this.f2393r, left, dx);
            c1.V(this.f2393r, clampedX - oldLeft);
        }
        if (dy != 0) {
            clampedY = this.f2392q.b(this.f2393r, top, dy);
            c1.W(this.f2393r, clampedY - oldTop);
        }
        if (dx != 0 || dy != 0) {
            int clampedDx = clampedX - oldLeft;
            int clampedDy = clampedY - oldTop;
            this.f2392q.k(this.f2393r, clampedX, clampedY, clampedDx, clampedDy);
        }
    }

    public boolean u(int x2, int y2) {
        return x(this.f2393r, x2, y2);
    }

    public boolean x(View view, int x2, int y2) {
        return view != null && x2 >= view.getLeft() && x2 < view.getRight() && y2 >= view.getTop() && y2 < view.getBottom();
    }

    public View q(int x2, int y2) {
        int childCount = this.f2395t.getChildCount();
        for (int i2 = childCount - 1; i2 >= 0; i2--) {
            ViewGroup viewGroup = this.f2395t;
            this.f2392q.c(i2);
            View child = viewGroup.getChildAt(i2);
            if (x2 >= child.getLeft() && x2 < child.getRight() && y2 >= child.getTop() && y2 < child.getBottom()) {
                return child;
            }
        }
        return null;
    }

    public final int s(int x2, int y2) {
        int result = 0;
        if (x2 < this.f2395t.getLeft() + this.f2390o) {
            result = 0 | 1;
        }
        if (y2 < this.f2395t.getTop() + this.f2390o) {
            result |= 4;
        }
        if (x2 > this.f2395t.getRight() - this.f2390o) {
            result |= 2;
        }
        return y2 > this.f2395t.getBottom() - this.f2390o ? result | 8 : result;
    }

    public final boolean w(int pointerId) {
        if (v(pointerId)) {
            return true;
        }
        Log.e("ViewDragHelper", "Ignoring pointerId=" + pointerId + " because ACTION_DOWN was not received for this pointer before ACTION_MOVE. It likely happened because  ViewDragHelper did not receive all the events in the event stream.");
        return false;
    }
}
