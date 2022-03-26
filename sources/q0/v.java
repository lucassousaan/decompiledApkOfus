package q0;

import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.view.MotionEvent;
import androidx.recyclerview.widget.RecyclerView;
import f0.c1;

/* JADX WARN: Classes with same name are omitted:
  
 */
/* loaded from: classes.dex */
public class v extends h1 implements p1 {
    public static final int[] D = {16842919};
    public static final int[] E = new int[0];

    /* renamed from: a  reason: collision with root package name */
    public final int f3225a;

    /* renamed from: b  reason: collision with root package name */
    public final int f3226b;

    /* renamed from: c  reason: collision with root package name */
    public final StateListDrawable f3227c;

    /* renamed from: d  reason: collision with root package name */
    public final Drawable f3228d;

    /* renamed from: e  reason: collision with root package name */
    public final int f3229e;

    /* renamed from: f  reason: collision with root package name */
    public final int f3230f;

    /* renamed from: g  reason: collision with root package name */
    public final StateListDrawable f3231g;

    /* renamed from: h  reason: collision with root package name */
    public final Drawable f3232h;

    /* renamed from: i  reason: collision with root package name */
    public final int f3233i;

    /* renamed from: j  reason: collision with root package name */
    public final int f3234j;

    /* renamed from: k  reason: collision with root package name */
    public int f3235k;

    /* renamed from: l  reason: collision with root package name */
    public int f3236l;

    /* renamed from: m  reason: collision with root package name */
    public float f3237m;

    /* renamed from: n  reason: collision with root package name */
    public int f3238n;

    /* renamed from: o  reason: collision with root package name */
    public int f3239o;

    /* renamed from: p  reason: collision with root package name */
    public float f3240p;

    /* renamed from: s  reason: collision with root package name */
    public RecyclerView f3243s;

    /* renamed from: z  reason: collision with root package name */
    public final ValueAnimator f3250z;

    /* renamed from: q  reason: collision with root package name */
    public int f3241q = 0;

    /* renamed from: r  reason: collision with root package name */
    public int f3242r = 0;

    /* renamed from: t  reason: collision with root package name */
    public boolean f3244t = false;

    /* renamed from: u  reason: collision with root package name */
    public boolean f3245u = false;

    /* renamed from: v  reason: collision with root package name */
    public int f3246v = 0;

    /* renamed from: w  reason: collision with root package name */
    public int f3247w = 0;

    /* renamed from: x  reason: collision with root package name */
    public final int[] f3248x = new int[2];

    /* renamed from: y  reason: collision with root package name */
    public final int[] f3249y = new int[2];
    public int A = 0;
    public final Runnable B = new r(this);
    public final q1 C = new s(this);

    public v(RecyclerView recyclerView, StateListDrawable verticalThumbDrawable, Drawable verticalTrackDrawable, StateListDrawable horizontalThumbDrawable, Drawable horizontalTrackDrawable, int defaultWidth, int scrollbarMinimumRange, int margin) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.f3250z = ofFloat;
        this.f3227c = verticalThumbDrawable;
        this.f3228d = verticalTrackDrawable;
        this.f3231g = horizontalThumbDrawable;
        this.f3232h = horizontalTrackDrawable;
        this.f3229e = Math.max(defaultWidth, verticalThumbDrawable.getIntrinsicWidth());
        this.f3230f = Math.max(defaultWidth, verticalTrackDrawable.getIntrinsicWidth());
        this.f3233i = Math.max(defaultWidth, horizontalThumbDrawable.getIntrinsicWidth());
        this.f3234j = Math.max(defaultWidth, horizontalTrackDrawable.getIntrinsicWidth());
        this.f3225a = scrollbarMinimumRange;
        this.f3226b = margin;
        verticalThumbDrawable.setAlpha(255);
        verticalTrackDrawable.setAlpha(255);
        ofFloat.addListener(new t(this));
        ofFloat.addUpdateListener(new u(this));
        g(recyclerView);
    }

    public void g(RecyclerView recyclerView) {
        RecyclerView recyclerView2 = this.f3243s;
        if (recyclerView2 != recyclerView) {
            if (recyclerView2 != null) {
                i();
            }
            this.f3243s = recyclerView;
            if (recyclerView != null) {
                z();
            }
        }
    }

    public final void z() {
        this.f3243s.h(this);
        this.f3243s.j(this);
        this.f3243s.k(this.C);
    }

    public final void i() {
        this.f3243s.V0(this);
        this.f3243s.W0(this);
        this.f3243s.X0(this.C);
        h();
    }

    public void v() {
        this.f3243s.invalidate();
    }

    public void y(int state) {
        if (state == 2 && this.f3246v != 2) {
            this.f3227c.setState(D);
            h();
        }
        if (state == 0) {
            v();
        } else {
            A();
        }
        if (this.f3246v == 2 && state != 2) {
            this.f3227c.setState(E);
            w(1200);
        } else if (state == 1) {
            w(1500);
        }
        this.f3246v = state;
    }

    public final boolean p() {
        return c1.A(this.f3243s) == 1;
    }

    public void A() {
        switch (this.A) {
            case 0:
                break;
            default:
                return;
            case 3:
                this.f3250z.cancel();
                break;
        }
        this.A = 1;
        ValueAnimator valueAnimator = this.f3250z;
        valueAnimator.setFloatValues(((Float) valueAnimator.getAnimatedValue()).floatValue(), 1.0f);
        this.f3250z.setDuration(500L);
        this.f3250z.setStartDelay(0L);
        this.f3250z.start();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public void n(int duration) {
        switch (this.A) {
            case 1:
                this.f3250z.cancel();
                break;
            case 2:
                break;
            default:
                return;
        }
        this.A = 3;
        ValueAnimator valueAnimator = this.f3250z;
        valueAnimator.setFloatValues(((Float) valueAnimator.getAnimatedValue()).floatValue(), 0.0f);
        this.f3250z.setDuration(duration);
        this.f3250z.start();
    }

    public final void h() {
        this.f3243s.removeCallbacks(this.B);
    }

    public final void w(int delay) {
        h();
        this.f3243s.postDelayed(this.B, delay);
    }

    @Override // q0.h1
    public void f(Canvas canvas, RecyclerView parent, b2 state) {
        if (this.f3241q != this.f3243s.getWidth() || this.f3242r != this.f3243s.getHeight()) {
            this.f3241q = this.f3243s.getWidth();
            this.f3242r = this.f3243s.getHeight();
            y(0);
        } else if (this.A != 0) {
            if (this.f3244t) {
                k(canvas);
            }
            if (this.f3245u) {
                j(canvas);
            }
        }
    }

    public final void k(Canvas canvas) {
        int viewWidth = this.f3241q;
        int i2 = this.f3229e;
        int left = viewWidth - i2;
        int i3 = this.f3236l;
        int i4 = this.f3235k;
        int top = i3 - (i4 / 2);
        this.f3227c.setBounds(0, 0, i2, i4);
        this.f3228d.setBounds(0, 0, this.f3230f, this.f3242r);
        if (p()) {
            this.f3228d.draw(canvas);
            canvas.translate(this.f3229e, top);
            canvas.scale(-1.0f, 1.0f);
            this.f3227c.draw(canvas);
            canvas.scale(1.0f, 1.0f);
            canvas.translate(-this.f3229e, -top);
            return;
        }
        canvas.translate(left, 0.0f);
        this.f3228d.draw(canvas);
        canvas.translate(0.0f, top);
        this.f3227c.draw(canvas);
        canvas.translate(-left, -top);
    }

    public final void j(Canvas canvas) {
        int viewHeight = this.f3242r;
        int i2 = this.f3233i;
        int top = viewHeight - i2;
        int i3 = this.f3239o;
        int i4 = this.f3238n;
        int left = i3 - (i4 / 2);
        this.f3231g.setBounds(0, 0, i4, i2);
        this.f3232h.setBounds(0, 0, this.f3241q, this.f3234j);
        canvas.translate(0.0f, top);
        this.f3232h.draw(canvas);
        canvas.translate(left, 0.0f);
        this.f3231g.draw(canvas);
        canvas.translate(-left, -top);
    }

    public void B(int offsetX, int offsetY) {
        int verticalContentLength = this.f3243s.computeVerticalScrollRange();
        int verticalVisibleLength = this.f3242r;
        this.f3244t = verticalContentLength - verticalVisibleLength > 0 && this.f3242r >= this.f3225a;
        int horizontalContentLength = this.f3243s.computeHorizontalScrollRange();
        int horizontalVisibleLength = this.f3241q;
        boolean z2 = horizontalContentLength - horizontalVisibleLength > 0 && this.f3241q >= this.f3225a;
        this.f3245u = z2;
        boolean z3 = this.f3244t;
        if (z3 || z2) {
            if (z3) {
                float middleScreenPos = offsetY + (verticalVisibleLength / 2.0f);
                this.f3236l = (int) ((verticalVisibleLength * middleScreenPos) / verticalContentLength);
                this.f3235k = Math.min(verticalVisibleLength, (verticalVisibleLength * verticalVisibleLength) / verticalContentLength);
            }
            if (this.f3245u) {
                float middleScreenPos2 = offsetX + (horizontalVisibleLength / 2.0f);
                this.f3239o = (int) ((horizontalVisibleLength * middleScreenPos2) / horizontalContentLength);
                this.f3238n = Math.min(horizontalVisibleLength, (horizontalVisibleLength * horizontalVisibleLength) / horizontalContentLength);
            }
            int i2 = this.f3246v;
            if (i2 == 0 || i2 == 1) {
                y(1);
            }
        } else if (this.f3246v != 0) {
            y(0);
        }
    }

    public boolean s(RecyclerView recyclerView, MotionEvent ev) {
        int i2 = this.f3246v;
        if (i2 == 1) {
            boolean insideVerticalThumb = r(ev.getX(), ev.getY());
            boolean insideHorizontalThumb = q(ev.getX(), ev.getY());
            if (ev.getAction() != 0 || (!insideVerticalThumb && !insideHorizontalThumb)) {
                return false;
            }
            if (insideHorizontalThumb) {
                this.f3247w = 1;
                this.f3240p = (int) ev.getX();
            } else if (insideVerticalThumb) {
                this.f3247w = 2;
                this.f3237m = (int) ev.getY();
            }
            y(2);
            return true;
        } else if (i2 == 2) {
            return true;
        } else {
            return false;
        }
    }

    public void u(RecyclerView recyclerView, MotionEvent me) {
        if (this.f3246v != 0) {
            if (me.getAction() == 0) {
                boolean insideVerticalThumb = r(me.getX(), me.getY());
                boolean insideHorizontalThumb = q(me.getX(), me.getY());
                if (insideVerticalThumb || insideHorizontalThumb) {
                    if (insideHorizontalThumb) {
                        this.f3247w = 1;
                        this.f3240p = (int) me.getX();
                    } else if (insideVerticalThumb) {
                        this.f3247w = 2;
                        this.f3237m = (int) me.getY();
                    }
                    y(2);
                }
            } else if (me.getAction() == 1 && this.f3246v == 2) {
                this.f3237m = 0.0f;
                this.f3240p = 0.0f;
                y(1);
                this.f3247w = 0;
            } else if (me.getAction() == 2 && this.f3246v == 2) {
                A();
                if (this.f3247w == 1) {
                    o(me.getX());
                }
                if (this.f3247w == 2) {
                    C(me.getY());
                }
            }
        }
    }

    public void t(boolean disallowIntercept) {
    }

    public final void C(float y2) {
        int[] scrollbarRange = m();
        float y3 = Math.max(scrollbarRange[0], Math.min(scrollbarRange[1], y2));
        if (Math.abs(this.f3236l - y3) >= 2.0f) {
            int scrollingBy = x(this.f3237m, y3, scrollbarRange, this.f3243s.computeVerticalScrollRange(), this.f3243s.computeVerticalScrollOffset(), this.f3242r);
            if (scrollingBy != 0) {
                this.f3243s.scrollBy(0, scrollingBy);
            }
            this.f3237m = y3;
        }
    }

    public final void o(float x2) {
        int[] scrollbarRange = l();
        float x3 = Math.max(scrollbarRange[0], Math.min(scrollbarRange[1], x2));
        if (Math.abs(this.f3239o - x3) >= 2.0f) {
            int scrollingBy = x(this.f3240p, x3, scrollbarRange, this.f3243s.computeHorizontalScrollRange(), this.f3243s.computeHorizontalScrollOffset(), this.f3241q);
            if (scrollingBy != 0) {
                this.f3243s.scrollBy(scrollingBy, 0);
            }
            this.f3240p = x3;
        }
    }

    public final int x(float oldDragPos, float newDragPos, int[] scrollbarRange, int scrollRange, int scrollOffset, int viewLength) {
        int scrollbarLength = scrollbarRange[1] - scrollbarRange[0];
        if (scrollbarLength == 0) {
            return 0;
        }
        float percentage = (newDragPos - oldDragPos) / scrollbarLength;
        int totalPossibleOffset = scrollRange - viewLength;
        int scrollingBy = (int) (totalPossibleOffset * percentage);
        int absoluteOffset = scrollOffset + scrollingBy;
        if (absoluteOffset >= totalPossibleOffset || absoluteOffset < 0) {
            return 0;
        }
        return scrollingBy;
    }

    public boolean r(float x2, float y2) {
        if (!p() ? x2 >= this.f3241q - this.f3229e : x2 <= this.f3229e / 2) {
            int i2 = this.f3236l;
            int i3 = this.f3235k;
            if (y2 >= i2 - (i3 / 2) && y2 <= i2 + (i3 / 2)) {
                return true;
            }
        }
        return false;
    }

    public boolean q(float x2, float y2) {
        if (y2 >= this.f3242r - this.f3233i) {
            int i2 = this.f3239o;
            int i3 = this.f3238n;
            if (x2 >= i2 - (i3 / 2) && x2 <= i2 + (i3 / 2)) {
                return true;
            }
        }
        return false;
    }

    public final int[] m() {
        int[] iArr = this.f3248x;
        int i2 = this.f3226b;
        iArr[0] = i2;
        iArr[1] = this.f3242r - i2;
        return iArr;
    }

    public final int[] l() {
        int[] iArr = this.f3249y;
        int i2 = this.f3226b;
        iArr[0] = i2;
        iArr[1] = this.f3241q - i2;
        return iArr;
    }
}
