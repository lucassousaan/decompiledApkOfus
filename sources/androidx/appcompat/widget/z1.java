package androidx.appcompat.widget;

import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import h.i0;

/* JADX WARN: Classes with same name are omitted:
  
 */
/* loaded from: classes.dex */
public abstract class z1 implements View.OnTouchListener, View.OnAttachStateChangeListener {

    /* renamed from: b  reason: collision with root package name */
    public final float f596b;

    /* renamed from: c  reason: collision with root package name */
    public final int f597c;

    /* renamed from: d  reason: collision with root package name */
    public final int f598d;

    /* renamed from: e  reason: collision with root package name */
    public final View f599e;

    /* renamed from: f  reason: collision with root package name */
    public Runnable f600f;

    /* renamed from: g  reason: collision with root package name */
    public Runnable f601g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f602h;

    /* renamed from: i  reason: collision with root package name */
    public int f603i;

    /* renamed from: j  reason: collision with root package name */
    public final int[] f604j = new int[2];

    public abstract i0 b();

    public abstract boolean c();

    public z1(View src) {
        this.f599e = src;
        src.setLongClickable(true);
        src.addOnAttachStateChangeListener(this);
        this.f596b = ViewConfiguration.get(src.getContext()).getScaledTouchSlop();
        int tapTimeout = ViewConfiguration.getTapTimeout();
        this.f597c = tapTimeout;
        this.f598d = (tapTimeout + ViewConfiguration.getLongPressTimeout()) / 2;
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View v2, MotionEvent event) {
        boolean forwarding;
        boolean wasForwarding = this.f602h;
        if (wasForwarding) {
            forwarding = f(event) || !d();
        } else {
            forwarding = g(event) && c();
            if (forwarding) {
                long now = SystemClock.uptimeMillis();
                MotionEvent e2 = MotionEvent.obtain(now, now, 3, 0.0f, 0.0f, 0);
                this.f599e.onTouchEvent(e2);
                e2.recycle();
            }
        }
        this.f602h = forwarding;
        return forwarding || wasForwarding;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(View v2) {
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(View v2) {
        this.f602h = false;
        this.f603i = -1;
        Runnable runnable = this.f600f;
        if (runnable != null) {
            this.f599e.removeCallbacks(runnable);
        }
    }

    public boolean d() {
        i0 popup = b();
        if (popup == null || !popup.a()) {
            return true;
        }
        popup.dismiss();
        return true;
    }

    public final boolean g(MotionEvent srcEvent) {
        View src = this.f599e;
        if (!src.isEnabled()) {
            return false;
        }
        int actionMasked = srcEvent.getActionMasked();
        switch (actionMasked) {
            case 0:
                this.f603i = srcEvent.getPointerId(0);
                if (this.f600f == null) {
                    this.f600f = new x1(this);
                }
                src.postDelayed(this.f600f, this.f597c);
                if (this.f601g == null) {
                    this.f601g = new y1(this);
                }
                src.postDelayed(this.f601g, this.f598d);
                break;
            case 1:
            case 3:
                a();
                break;
            case 2:
                int activePointerIndex = srcEvent.findPointerIndex(this.f603i);
                if (activePointerIndex >= 0) {
                    float x2 = srcEvent.getX(activePointerIndex);
                    float y2 = srcEvent.getY(activePointerIndex);
                    if (!h(src, x2, y2, this.f596b)) {
                        a();
                        src.getParent().requestDisallowInterceptTouchEvent(true);
                        return true;
                    }
                }
                break;
        }
        return false;
    }

    public final void a() {
        Runnable runnable = this.f601g;
        if (runnable != null) {
            this.f599e.removeCallbacks(runnable);
        }
        Runnable runnable2 = this.f600f;
        if (runnable2 != null) {
            this.f599e.removeCallbacks(runnable2);
        }
    }

    public void e() {
        a();
        View src = this.f599e;
        if (src.isEnabled() && !src.isLongClickable() && c()) {
            src.getParent().requestDisallowInterceptTouchEvent(true);
            long now = SystemClock.uptimeMillis();
            MotionEvent e2 = MotionEvent.obtain(now, now, 3, 0.0f, 0.0f, 0);
            src.onTouchEvent(e2);
            e2.recycle();
            this.f602h = true;
        }
    }

    public final boolean f(MotionEvent srcEvent) {
        v1 dst;
        boolean keepForwarding;
        View src = this.f599e;
        i0 popup = b();
        if (popup == null || !popup.a() || (dst = (v1) popup.e()) == null || !dst.isShown()) {
            return false;
        }
        MotionEvent dstEvent = MotionEvent.obtainNoHistory(srcEvent);
        i(src, dstEvent);
        j(dst, dstEvent);
        boolean handled = dst.e(dstEvent, this.f603i);
        dstEvent.recycle();
        int action = srcEvent.getActionMasked();
        if (action == 1 || action == 3) {
            keepForwarding = false;
        } else {
            keepForwarding = true;
        }
        if (!handled || !keepForwarding) {
            return false;
        }
        return true;
    }

    public static boolean h(View view, float localX, float localY, float slop) {
        return localX >= (-slop) && localY >= (-slop) && localX < ((float) (view.getRight() - view.getLeft())) + slop && localY < ((float) (view.getBottom() - view.getTop())) + slop;
    }

    public final boolean j(View view, MotionEvent event) {
        int[] loc = this.f604j;
        view.getLocationOnScreen(loc);
        event.offsetLocation(-loc[0], -loc[1]);
        return true;
    }

    public final boolean i(View view, MotionEvent event) {
        int[] loc = this.f604j;
        view.getLocationOnScreen(loc);
        event.offsetLocation(loc[0], loc[1]);
        return true;
    }
}
