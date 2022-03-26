package q0;

import android.view.animation.Interpolator;
import android.widget.OverScroller;
import androidx.recyclerview.widget.RecyclerView;
import f0.c1;

/* JADX WARN: Classes with same name are omitted:
  
 */
/* loaded from: classes.dex */
public class d2 implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    public int f3003b;

    /* renamed from: c  reason: collision with root package name */
    public int f3004c;

    /* renamed from: d  reason: collision with root package name */
    public OverScroller f3005d;

    /* renamed from: e  reason: collision with root package name */
    public Interpolator f3006e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f3007f = false;

    /* renamed from: g  reason: collision with root package name */
    public boolean f3008g = false;

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ RecyclerView f3009h;

    public d2(RecyclerView this$0) {
        this.f3009h = this$0;
        Interpolator interpolator = RecyclerView.E0;
        this.f3006e = interpolator;
        this.f3005d = new OverScroller(this$0.getContext(), interpolator);
    }

    @Override // java.lang.Runnable
    public void run() {
        boolean z2;
        boolean awakenScrollBars;
        boolean scrollerFinishedX;
        boolean scrollerFinishedY;
        boolean doneScrolling;
        boolean smoothScrollerPending;
        RecyclerView recyclerView = this.f3009h;
        if (recyclerView.f1089m == null) {
            g();
            return;
        }
        this.f3008g = false;
        this.f3007f = true;
        recyclerView.u();
        OverScroller scroller = this.f3005d;
        if (scroller.computeScrollOffset()) {
            int x2 = scroller.getCurrX();
            int y2 = scroller.getCurrY();
            int unconsumedX = x2 - this.f3003b;
            int unconsumedY = y2 - this.f3004c;
            this.f3003b = x2;
            this.f3004c = y2;
            int consumedX = 0;
            int consumedY = 0;
            RecyclerView recyclerView2 = this.f3009h;
            int[] iArr = recyclerView2.f1104t0;
            iArr[0] = 0;
            iArr[1] = 0;
            if (recyclerView2.F(unconsumedX, unconsumedY, iArr, null, 1)) {
                int[] iArr2 = this.f3009h.f1104t0;
                unconsumedX -= iArr2[0];
                unconsumedY -= iArr2[1];
            }
            if (this.f3009h.getOverScrollMode() != 2) {
                this.f3009h.t(unconsumedX, unconsumedY);
            }
            RecyclerView recyclerView3 = this.f3009h;
            if (recyclerView3.f1087l != null) {
                int[] iArr3 = recyclerView3.f1104t0;
                iArr3[0] = 0;
                iArr3[1] = 0;
                recyclerView3.f1(unconsumedX, unconsumedY, iArr3);
                RecyclerView recyclerView4 = this.f3009h;
                int[] iArr4 = recyclerView4.f1104t0;
                consumedX = iArr4[0];
                consumedY = iArr4[1];
                unconsumedX -= consumedX;
                unconsumedY -= consumedY;
                a2 smoothScroller = recyclerView4.f1089m.f3120g;
                if (smoothScroller != null && !smoothScroller.g() && smoothScroller.h()) {
                    int adapterSize = this.f3009h.f1078g0.b();
                    if (adapterSize == 0) {
                        smoothScroller.r();
                    } else if (smoothScroller.f() >= adapterSize) {
                        smoothScroller.p(adapterSize - 1);
                        smoothScroller.j(consumedX, consumedY);
                    } else {
                        smoothScroller.j(consumedX, consumedY);
                    }
                }
            }
            if (!this.f3009h.f1093o.isEmpty()) {
                this.f3009h.invalidate();
            }
            RecyclerView recyclerView5 = this.f3009h;
            int[] iArr5 = recyclerView5.f1104t0;
            iArr5[0] = 0;
            iArr5[1] = 0;
            recyclerView5.G(consumedX, consumedY, unconsumedX, unconsumedY, null, 1, iArr5);
            RecyclerView recyclerView6 = this.f3009h;
            int[] iArr6 = recyclerView6.f1104t0;
            int unconsumedX2 = unconsumedX - iArr6[0];
            int unconsumedY2 = unconsumedY - iArr6[1];
            if (!(consumedX == 0 && consumedY == 0)) {
                recyclerView6.I(consumedX, consumedY);
            }
            awakenScrollBars = this.f3009h.awakenScrollBars();
            if (!awakenScrollBars) {
                this.f3009h.invalidate();
            }
            if (scroller.getCurrX() == scroller.getFinalX()) {
                scrollerFinishedX = true;
            } else {
                scrollerFinishedX = false;
            }
            if (scroller.getCurrY() == scroller.getFinalY()) {
                scrollerFinishedY = true;
            } else {
                scrollerFinishedY = false;
            }
            if (scroller.isFinished() || ((scrollerFinishedX || unconsumedX2 != 0) && (scrollerFinishedY || unconsumedY2 != 0))) {
                doneScrolling = true;
            } else {
                doneScrolling = false;
            }
            a2 smoothScroller2 = this.f3009h.f1089m.f3120g;
            if (smoothScroller2 == null || !smoothScroller2.g()) {
                smoothScrollerPending = false;
            } else {
                smoothScrollerPending = true;
            }
            if (smoothScrollerPending || !doneScrolling) {
                e();
                RecyclerView recyclerView7 = this.f3009h;
                z zVar = recyclerView7.f1074e0;
                if (zVar != null) {
                    zVar.f(recyclerView7, consumedX, consumedY);
                }
            } else {
                if (this.f3009h.getOverScrollMode() != 2) {
                    int vel = (int) scroller.getCurrVelocity();
                    int velX = unconsumedX2 < 0 ? -vel : unconsumedX2 > 0 ? vel : 0;
                    int velY = unconsumedY2 < 0 ? -vel : unconsumedY2 > 0 ? vel : 0;
                    this.f3009h.a(velX, velY);
                }
                int[] iArr7 = RecyclerView.f1063x0;
                this.f3009h.f1076f0.b();
            }
        }
        a2 smoothScroller3 = this.f3009h.f1089m.f3120g;
        if (smoothScroller3 == null || !smoothScroller3.g()) {
            z2 = false;
        } else {
            z2 = false;
            smoothScroller3.j(0, 0);
        }
        this.f3007f = z2;
        if (this.f3008g) {
            d();
            return;
        }
        RecyclerView recyclerView8 = this.f3009h;
        int i2 = z2 ? 1 : 0;
        int i3 = z2 ? 1 : 0;
        recyclerView8.setScrollState(i2);
        this.f3009h.s1(1);
    }

    public void e() {
        if (this.f3007f) {
            this.f3008g = true;
        } else {
            d();
        }
    }

    public final void d() {
        this.f3009h.removeCallbacks(this);
        c1.d0(this.f3009h, this);
    }

    public void c(int velocityX, int velocityY) {
        this.f3009h.setScrollState(2);
        this.f3004c = 0;
        this.f3003b = 0;
        Interpolator interpolator = this.f3006e;
        Interpolator interpolator2 = RecyclerView.E0;
        if (interpolator != interpolator2) {
            this.f3006e = interpolator2;
            this.f3005d = new OverScroller(this.f3009h.getContext(), interpolator2);
        }
        this.f3005d.fling(0, 0, velocityX, velocityY, Integer.MIN_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MAX_VALUE);
        e();
    }

    public void f(int dx, int dy, int duration, Interpolator interpolator) {
        if (duration == Integer.MIN_VALUE) {
            duration = a(dx, dy, 0, 0);
        }
        if (interpolator == null) {
            interpolator = RecyclerView.E0;
        }
        if (this.f3006e != interpolator) {
            this.f3006e = interpolator;
            this.f3005d = new OverScroller(this.f3009h.getContext(), interpolator);
        }
        this.f3004c = 0;
        this.f3003b = 0;
        this.f3009h.setScrollState(2);
        this.f3005d.startScroll(0, 0, dx, dy, duration);
        e();
    }

    public final float b(float f2) {
        return (float) Math.sin((f2 - 0.5f) * 0.47123894f);
    }

    public final int a(int dx, int dy, int vx, int vy) {
        int duration;
        int absDx = Math.abs(dx);
        int absDy = Math.abs(dy);
        boolean horizontal = absDx > absDy;
        int velocity = (int) Math.sqrt((vx * vx) + (vy * vy));
        int delta = (int) Math.sqrt((dx * dx) + (dy * dy));
        RecyclerView recyclerView = this.f3009h;
        int containerSize = horizontal ? recyclerView.getWidth() : recyclerView.getHeight();
        int halfContainerSize = containerSize / 2;
        float distanceRatio = Math.min(1.0f, (delta * 1.0f) / containerSize);
        float distance = halfContainerSize + (halfContainerSize * b(distanceRatio));
        if (velocity > 0) {
            duration = Math.round(Math.abs(distance / velocity) * 1000.0f) * 4;
        } else {
            float absDelta = horizontal ? absDx : absDy;
            duration = (int) (((absDelta / containerSize) + 1.0f) * 300.0f);
        }
        return Math.min(duration, 2000);
    }

    public void g() {
        this.f3009h.removeCallbacks(this);
        this.f3005d.abortAnimation();
    }
}
