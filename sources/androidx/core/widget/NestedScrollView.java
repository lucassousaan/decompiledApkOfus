package androidx.core.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.FocusFinder;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.animation.AnimationUtils;
import android.widget.EdgeEffect;
import android.widget.FrameLayout;
import android.widget.OverScroller;
import com.example.helloworld.R;
import d.e;
import f0.c1;
import f0.v;
import f0.w;
import f0.y;
import f0.z;
import i0.g;
import i0.k;
import i0.l;
import i0.n;
import java.util.List;

/* JADX WARN: Classes with same name are omitted:
  
 */
/* loaded from: classes.dex */
public class NestedScrollView extends FrameLayout implements y, v {
    public static final k B = new k();
    public static final int[] C = {16843130};
    public l A;

    /* renamed from: b  reason: collision with root package name */
    public long f670b;

    /* renamed from: c  reason: collision with root package name */
    public final Rect f671c;

    /* renamed from: d  reason: collision with root package name */
    public OverScroller f672d;

    /* renamed from: e  reason: collision with root package name */
    public EdgeEffect f673e;

    /* renamed from: f  reason: collision with root package name */
    public EdgeEffect f674f;

    /* renamed from: g  reason: collision with root package name */
    public int f675g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f676h;

    /* renamed from: i  reason: collision with root package name */
    public boolean f677i;

    /* renamed from: j  reason: collision with root package name */
    public View f678j;

    /* renamed from: k  reason: collision with root package name */
    public boolean f679k;

    /* renamed from: l  reason: collision with root package name */
    public VelocityTracker f680l;

    /* renamed from: m  reason: collision with root package name */
    public boolean f681m;

    /* renamed from: n  reason: collision with root package name */
    public boolean f682n;

    /* renamed from: o  reason: collision with root package name */
    public int f683o;

    /* renamed from: p  reason: collision with root package name */
    public int f684p;

    /* renamed from: q  reason: collision with root package name */
    public int f685q;

    /* renamed from: r  reason: collision with root package name */
    public int f686r;

    /* renamed from: s  reason: collision with root package name */
    public final int[] f687s;

    /* renamed from: t  reason: collision with root package name */
    public final int[] f688t;

    /* renamed from: u  reason: collision with root package name */
    public int f689u;

    /* renamed from: v  reason: collision with root package name */
    public int f690v;

    /* renamed from: w  reason: collision with root package name */
    public n f691w;

    /* renamed from: x  reason: collision with root package name */
    public final z f692x;

    /* renamed from: y  reason: collision with root package name */
    public final w f693y;

    /* renamed from: z  reason: collision with root package name */
    public float f694z;

    public NestedScrollView(Context context, AttributeSet attrs) {
        this(context, attrs, R.attr.nestedScrollViewStyle);
    }

    public NestedScrollView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        this.f671c = new Rect();
        this.f676h = true;
        this.f677i = false;
        this.f678j = null;
        this.f679k = false;
        this.f682n = true;
        this.f686r = -1;
        this.f687s = new int[2];
        this.f688t = new int[2];
        this.f673e = g.a(context, attrs);
        this.f674f = g.a(context, attrs);
        x();
        TypedArray a2 = context.obtainStyledAttributes(attrs, C, defStyleAttr, 0);
        setFillViewport(a2.getBoolean(0, false));
        a2.recycle();
        this.f692x = new z();
        this.f693y = new w(this);
        setNestedScrollingEnabled(true);
        c1.l0(this, B);
    }

    public void m(int dxConsumed, int dyConsumed, int dxUnconsumed, int dyUnconsumed, int[] offsetInWindow, int type, int[] consumed) {
        this.f693y.e(dxConsumed, dyConsumed, dxUnconsumed, dyUnconsumed, offsetInWindow, type, consumed);
    }

    public boolean Q(int axes, int type) {
        return this.f693y.p(axes, type);
    }

    public void S(int type) {
        this.f693y.r(type);
    }

    public boolean u(int type) {
        return this.f693y.k(type);
    }

    public boolean l(int dx, int dy, int[] consumed, int[] offsetInWindow, int type) {
        return this.f693y.d(dx, dy, consumed, offsetInWindow, type);
    }

    @Override // android.view.View
    public void setNestedScrollingEnabled(boolean enabled) {
        this.f693y.m(enabled);
    }

    @Override // android.view.View
    public boolean isNestedScrollingEnabled() {
        return this.f693y.l();
    }

    @Override // android.view.View
    public boolean startNestedScroll(int axes) {
        return Q(axes, 0);
    }

    @Override // android.view.View
    public void stopNestedScroll() {
        S(0);
    }

    @Override // android.view.View
    public boolean hasNestedScrollingParent() {
        return u(0);
    }

    @Override // android.view.View
    public boolean dispatchNestedScroll(int dxConsumed, int dyConsumed, int dxUnconsumed, int dyUnconsumed, int[] offsetInWindow) {
        return this.f693y.f(dxConsumed, dyConsumed, dxUnconsumed, dyUnconsumed, offsetInWindow);
    }

    @Override // android.view.View
    public boolean dispatchNestedPreScroll(int dx, int dy, int[] consumed, int[] offsetInWindow) {
        return l(dx, dy, consumed, offsetInWindow, 0);
    }

    @Override // android.view.View
    public boolean dispatchNestedFling(float velocityX, float velocityY, boolean consumed) {
        return this.f693y.a(velocityX, velocityY, consumed);
    }

    @Override // android.view.View
    public boolean dispatchNestedPreFling(float velocityX, float velocityY) {
        return this.f693y.b(velocityX, velocityY);
    }

    @Override // f0.y
    public void b(View target, int dxConsumed, int dyConsumed, int dxUnconsumed, int dyUnconsumed, int type, int[] consumed) {
        C(dyUnconsumed, type, consumed);
    }

    public final void C(int dyUnconsumed, int type, int[] consumed) {
        int oldScrollY = getScrollY();
        scrollBy(0, dyUnconsumed);
        int myConsumed = getScrollY() - oldScrollY;
        if (consumed != null) {
            consumed[1] = consumed[1] + myConsumed;
        }
        int myUnconsumed = dyUnconsumed - myConsumed;
        this.f693y.e(0, myConsumed, 0, myUnconsumed, null, type, consumed);
    }

    @Override // f0.x
    public boolean f(View child, View target, int axes, int type) {
        return (axes & 2) != 0;
    }

    @Override // f0.x
    public void a(View child, View target, int axes, int type) {
        this.f692x.b(axes, type);
        Q(2, type);
    }

    @Override // f0.x
    public void d(View target, int type) {
        this.f692x.d(type);
        S(type);
    }

    @Override // f0.x
    public void c(View target, int dxConsumed, int dyConsumed, int dxUnconsumed, int dyUnconsumed, int type) {
        C(dyUnconsumed, type, null);
    }

    @Override // f0.x
    public void e(View target, int dx, int dy, int[] consumed, int type) {
        l(dx, dy, consumed, null, type);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onStartNestedScroll(View child, View target, int axes) {
        return f(child, target, axes, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onNestedScrollAccepted(View child, View target, int axes) {
        a(child, target, axes, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onStopNestedScroll(View target) {
        d(target, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onNestedScroll(View target, int dxConsumed, int dyConsumed, int dxUnconsumed, int dyUnconsumed) {
        C(dyUnconsumed, 0, null);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onNestedPreScroll(View target, int dx, int dy, int[] consumed) {
        e(target, dx, dy, consumed, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onNestedFling(View target, float velocityX, float velocityY, boolean consumed) {
        if (consumed) {
            return false;
        }
        dispatchNestedFling(0.0f, velocityY, true);
        s((int) velocityY);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onNestedPreFling(View target, float velocityX, float velocityY) {
        return dispatchNestedPreFling(velocityX, velocityY);
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        return this.f692x.a();
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return true;
    }

    @Override // android.view.View
    public float getTopFadingEdgeStrength() {
        if (getChildCount() == 0) {
            return 0.0f;
        }
        int length = getVerticalFadingEdgeLength();
        int scrollY = getScrollY();
        if (scrollY < length) {
            return scrollY / length;
        }
        return 1.0f;
    }

    @Override // android.view.View
    public float getBottomFadingEdgeStrength() {
        if (getChildCount() == 0) {
            return 0.0f;
        }
        View child = getChildAt(0);
        FrameLayout.LayoutParams lp = (FrameLayout.LayoutParams) child.getLayoutParams();
        int length = getVerticalFadingEdgeLength();
        int bottomEdge = getHeight() - getPaddingBottom();
        int span = ((child.getBottom() + lp.bottomMargin) - getScrollY()) - bottomEdge;
        if (span < length) {
            return span / length;
        }
        return 1.0f;
    }

    public int getMaxScrollAmount() {
        return (int) (getHeight() * 0.5f);
    }

    public final void x() {
        this.f672d = new OverScroller(getContext());
        setFocusable(true);
        setDescendantFocusability(262144);
        setWillNotDraw(false);
        ViewConfiguration configuration = ViewConfiguration.get(getContext());
        this.f683o = configuration.getScaledTouchSlop();
        this.f684p = configuration.getScaledMinimumFlingVelocity();
        this.f685q = configuration.getScaledMaximumFlingVelocity();
    }

    @Override // android.view.ViewGroup
    public void addView(View child) {
        if (getChildCount() <= 0) {
            super.addView(child);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }

    @Override // android.view.ViewGroup
    public void addView(View child, int index) {
        if (getChildCount() <= 0) {
            super.addView(child, index);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public void addView(View child, ViewGroup.LayoutParams params) {
        if (getChildCount() <= 0) {
            super.addView(child, params);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }

    @Override // android.view.ViewGroup
    public void addView(View child, int index, ViewGroup.LayoutParams params) {
        if (getChildCount() <= 0) {
            super.addView(child, index, params);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }

    public void setOnScrollChangeListener(l l2) {
        this.A = l2;
    }

    public final boolean i() {
        if (getChildCount() <= 0) {
            return false;
        }
        View child = getChildAt(0);
        FrameLayout.LayoutParams lp = (FrameLayout.LayoutParams) child.getLayoutParams();
        int childSize = child.getHeight() + lp.topMargin + lp.bottomMargin;
        int parentSpace = (getHeight() - getPaddingTop()) - getPaddingBottom();
        return childSize > parentSpace;
    }

    public void setFillViewport(boolean fillViewport) {
        if (fillViewport != this.f681m) {
            this.f681m = fillViewport;
            requestLayout();
        }
    }

    public void setSmoothScrollingEnabled(boolean smoothScrollingEnabled) {
        this.f682n = smoothScrollingEnabled;
    }

    @Override // android.view.View
    public void onScrollChanged(int l2, int t2, int oldl, int oldt) {
        super.onScrollChanged(l2, t2, oldl, oldt);
        l lVar = this.A;
        if (lVar != null) {
            ((e) lVar).a(this, l2, t2, oldl, oldt);
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        if (this.f681m) {
            int heightMode = View.MeasureSpec.getMode(heightMeasureSpec);
            if (heightMode != 0 && getChildCount() > 0) {
                View child = getChildAt(0);
                FrameLayout.LayoutParams lp = (FrameLayout.LayoutParams) child.getLayoutParams();
                int childSize = child.getMeasuredHeight();
                int parentSpace = (((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom()) - lp.topMargin) - lp.bottomMargin;
                if (childSize < parentSpace) {
                    int childWidthMeasureSpec = FrameLayout.getChildMeasureSpec(widthMeasureSpec, getPaddingLeft() + getPaddingRight() + lp.leftMargin + lp.rightMargin, lp.width);
                    int childHeightMeasureSpec = View.MeasureSpec.makeMeasureSpec(parentSpace, 1073741824);
                    child.measure(childWidthMeasureSpec, childHeightMeasureSpec);
                }
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchKeyEvent(KeyEvent event) {
        return super.dispatchKeyEvent(event) || q(event);
    }

    public boolean q(KeyEvent event) {
        this.f671c.setEmpty();
        int i2 = 130;
        if (!i()) {
            if (!isFocused() || event.getKeyCode() == 4) {
                return false;
            }
            View currentFocused = findFocus();
            if (currentFocused == this) {
                currentFocused = null;
            }
            View nextFocused = FocusFinder.getInstance().findNextFocus(this, currentFocused, 130);
            return (nextFocused == null || nextFocused == this || !nextFocused.requestFocus(130)) ? false : true;
        } else if (event.getAction() != 0) {
            return false;
        } else {
            switch (event.getKeyCode()) {
                case 19:
                    if (!event.isAltPressed()) {
                        boolean handled = h(33);
                        return handled;
                    }
                    boolean handled2 = t(33);
                    return handled2;
                case 20:
                    if (!event.isAltPressed()) {
                        boolean handled3 = h(130);
                        return handled3;
                    }
                    boolean handled4 = t(130);
                    return handled4;
                case 62:
                    if (event.isShiftPressed()) {
                        i2 = 33;
                    }
                    F(i2);
                    return false;
                default:
                    return false;
            }
        }
    }

    public final boolean v(int x2, int y2) {
        if (getChildCount() <= 0) {
            return false;
        }
        int scrollY = getScrollY();
        View child = getChildAt(0);
        return y2 >= child.getTop() - scrollY && y2 < child.getBottom() - scrollY && x2 >= child.getLeft() && x2 < child.getRight();
    }

    public final void w() {
        VelocityTracker velocityTracker = this.f680l;
        if (velocityTracker == null) {
            this.f680l = VelocityTracker.obtain();
        } else {
            velocityTracker.clear();
        }
    }

    public final void y() {
        if (this.f680l == null) {
            this.f680l = VelocityTracker.obtain();
        }
    }

    public final void G() {
        VelocityTracker velocityTracker = this.f680l;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.f680l = null;
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestDisallowInterceptTouchEvent(boolean disallowIntercept) {
        if (disallowIntercept) {
            G();
        }
        super.requestDisallowInterceptTouchEvent(disallowIntercept);
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent ev) {
        int action = ev.getAction();
        boolean z2 = true;
        if (action == 2 && this.f679k) {
            return true;
        }
        switch (action & 255) {
            case 0:
                int y2 = (int) ev.getY();
                if (v((int) ev.getX(), y2)) {
                    this.f675g = y2;
                    this.f686r = ev.getPointerId(0);
                    w();
                    this.f680l.addMovement(ev);
                    this.f672d.computeScrollOffset();
                    if (!R(ev) && this.f672d.isFinished()) {
                        z2 = false;
                    }
                    this.f679k = z2;
                    Q(2, 0);
                    break;
                } else {
                    if (!R(ev) && this.f672d.isFinished()) {
                        z2 = false;
                    }
                    this.f679k = z2;
                    G();
                    break;
                }
                break;
            case 1:
            case 3:
                this.f679k = false;
                this.f686r = -1;
                G();
                if (this.f672d.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange())) {
                    c1.c0(this);
                }
                S(0);
                break;
            case 2:
                int activePointerId = this.f686r;
                if (activePointerId != -1) {
                    int pointerIndex = ev.findPointerIndex(activePointerId);
                    if (pointerIndex != -1) {
                        int y3 = (int) ev.getY(pointerIndex);
                        int yDiff = Math.abs(y3 - this.f675g);
                        if (yDiff > this.f683o && (2 & getNestedScrollAxes()) == 0) {
                            this.f679k = true;
                            this.f675g = y3;
                            y();
                            this.f680l.addMovement(ev);
                            this.f689u = 0;
                            ViewParent parent = getParent();
                            if (parent != null) {
                                parent.requestDisallowInterceptTouchEvent(true);
                                break;
                            }
                        }
                    } else {
                        Log.e("NestedScrollView", "Invalid pointerId=" + activePointerId + " in onInterceptTouchEvent");
                        break;
                    }
                }
                break;
            case 6:
                D(ev);
                break;
        }
        return this.f679k;
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent ev) {
        ViewParent parent;
        int deltaY;
        int deltaY2;
        y();
        int actionMasked = ev.getActionMasked();
        if (actionMasked == 0) {
            this.f689u = 0;
        }
        MotionEvent vtev = MotionEvent.obtain(ev);
        vtev.offsetLocation(0.0f, this.f689u);
        switch (actionMasked) {
            case 0:
                if (getChildCount() != 0) {
                    if (this.f679k && (parent = getParent()) != null) {
                        parent.requestDisallowInterceptTouchEvent(true);
                    }
                    if (!this.f672d.isFinished()) {
                        g();
                    }
                    this.f675g = (int) ev.getY();
                    this.f686r = ev.getPointerId(0);
                    Q(2, 0);
                    break;
                } else {
                    return false;
                }
            case 1:
                VelocityTracker velocityTracker = this.f680l;
                velocityTracker.computeCurrentVelocity(1000, this.f685q);
                int initialVelocity = (int) velocityTracker.getYVelocity(this.f686r);
                if (Math.abs(initialVelocity) >= this.f684p) {
                    if (!o(initialVelocity) && !dispatchNestedPreFling(0.0f, -initialVelocity)) {
                        dispatchNestedFling(0.0f, -initialVelocity, true);
                        s(-initialVelocity);
                    }
                } else if (this.f672d.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange())) {
                    c1.c0(this);
                }
                this.f686r = -1;
                p();
                break;
            case 2:
                int activePointerIndex = ev.findPointerIndex(this.f686r);
                if (activePointerIndex != -1) {
                    int y2 = (int) ev.getY(activePointerIndex);
                    int deltaY3 = this.f675g - y2;
                    int deltaY4 = deltaY3 - H(deltaY3, ev.getX(activePointerIndex));
                    if (this.f679k || Math.abs(deltaY4) <= this.f683o) {
                        deltaY = deltaY4;
                    } else {
                        ViewParent parent2 = getParent();
                        if (parent2 != null) {
                            parent2.requestDisallowInterceptTouchEvent(true);
                        }
                        this.f679k = true;
                        if (deltaY4 > 0) {
                            deltaY = deltaY4 - this.f683o;
                        } else {
                            deltaY = deltaY4 + this.f683o;
                        }
                    }
                    if (this.f679k) {
                        if (l(0, deltaY, this.f688t, this.f687s, 0)) {
                            int deltaY5 = deltaY - this.f688t[1];
                            this.f689u += this.f687s[1];
                            deltaY2 = deltaY5;
                        } else {
                            deltaY2 = deltaY;
                        }
                        this.f675g = y2 - this.f687s[1];
                        int oldY = getScrollY();
                        int range = getScrollRange();
                        int overscrollMode = getOverScrollMode();
                        boolean canOverscroll = overscrollMode == 0 || (overscrollMode == 1 && range > 0);
                        boolean clearVelocityTracker = E(0, deltaY2, 0, getScrollY(), 0, range, 0, 0) && !u(0);
                        int scrolledDeltaY = getScrollY() - oldY;
                        int unconsumedY = deltaY2 - scrolledDeltaY;
                        int[] iArr = this.f688t;
                        iArr[1] = 0;
                        m(0, scrolledDeltaY, 0, unconsumedY, this.f687s, 0, iArr);
                        int i2 = this.f675g;
                        int[] iArr2 = this.f687s;
                        this.f675g = i2 - iArr2[1];
                        this.f689u += iArr2[1];
                        if (canOverscroll) {
                            int deltaY6 = deltaY2 - this.f688t[1];
                            int pulledToY = oldY + deltaY6;
                            if (pulledToY < 0) {
                                g.d(this.f673e, (-deltaY6) / getHeight(), ev.getX(activePointerIndex) / getWidth());
                                if (!this.f674f.isFinished()) {
                                    this.f674f.onRelease();
                                }
                            } else if (pulledToY > range) {
                                g.d(this.f674f, deltaY6 / getHeight(), 1.0f - (ev.getX(activePointerIndex) / getWidth()));
                                if (!this.f673e.isFinished()) {
                                    this.f673e.onRelease();
                                }
                            }
                            if (!this.f673e.isFinished() || !this.f674f.isFinished()) {
                                c1.c0(this);
                                clearVelocityTracker = false;
                            }
                        }
                        if (clearVelocityTracker) {
                            this.f680l.clear();
                            break;
                        }
                    } else {
                        break;
                    }
                } else {
                    Log.e("NestedScrollView", "Invalid pointerId=" + this.f686r + " in onTouchEvent");
                    break;
                }
                break;
            case 3:
                if (this.f679k && getChildCount() > 0 && this.f672d.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange())) {
                    c1.c0(this);
                }
                this.f686r = -1;
                p();
                break;
            case 5:
                int index = ev.getActionIndex();
                this.f675g = (int) ev.getY(index);
                this.f686r = ev.getPointerId(index);
                break;
            case 6:
                D(ev);
                this.f675g = (int) ev.getY(ev.findPointerIndex(this.f686r));
                break;
        }
        VelocityTracker velocityTracker2 = this.f680l;
        if (velocityTracker2 != null) {
            velocityTracker2.addMovement(vtev);
        }
        vtev.recycle();
        return true;
    }

    public final boolean o(int velocityY) {
        if (g.b(this.f673e) != 0.0f) {
            this.f673e.onAbsorb(velocityY);
            return true;
        } else if (g.b(this.f674f) == 0.0f) {
            return false;
        } else {
            this.f674f.onAbsorb(-velocityY);
            return true;
        }
    }

    public final boolean R(MotionEvent e2) {
        boolean stopped = false;
        if (g.b(this.f673e) != 0.0f) {
            g.d(this.f673e, 0.0f, e2.getY() / getHeight());
            stopped = true;
        }
        if (g.b(this.f674f) == 0.0f) {
            return stopped;
        }
        g.d(this.f674f, 0.0f, 1.0f - (e2.getY() / getHeight()));
        return true;
    }

    public final void D(MotionEvent ev) {
        int pointerIndex = ev.getActionIndex();
        int pointerId = ev.getPointerId(pointerIndex);
        if (pointerId == this.f686r) {
            int newPointerIndex = pointerIndex == 0 ? 1 : 0;
            this.f675g = (int) ev.getY(newPointerIndex);
            this.f686r = ev.getPointerId(newPointerIndex);
            VelocityTracker velocityTracker = this.f680l;
            if (velocityTracker != null) {
                velocityTracker.clear();
            }
        }
    }

    @Override // android.view.View
    public boolean onGenericMotionEvent(MotionEvent event) {
        if ((event.getSource() & 2) == 0) {
            return false;
        }
        switch (event.getAction()) {
            case 8:
                if (this.f679k) {
                    return false;
                }
                float vscroll = event.getAxisValue(9);
                if (vscroll == 0.0f) {
                    return false;
                }
                int delta = (int) (getVerticalScrollFactorCompat() * vscroll);
                int range = getScrollRange();
                int oldScrollY = getScrollY();
                int newScrollY = oldScrollY - delta;
                if (newScrollY < 0) {
                    newScrollY = 0;
                } else if (newScrollY > range) {
                    newScrollY = range;
                }
                if (newScrollY == oldScrollY) {
                    return false;
                }
                super.scrollTo(getScrollX(), newScrollY);
                return true;
            default:
                return false;
        }
    }

    private float getVerticalScrollFactorCompat() {
        if (this.f694z == 0.0f) {
            TypedValue outValue = new TypedValue();
            Context context = getContext();
            if (context.getTheme().resolveAttribute(16842829, outValue, true)) {
                this.f694z = outValue.getDimension(context.getResources().getDisplayMetrics());
            } else {
                throw new IllegalStateException("Expected theme to define listPreferredItemHeight.");
            }
        }
        return this.f694z;
    }

    @Override // android.view.View
    public void onOverScrolled(int scrollX, int scrollY, boolean clampedX, boolean clampedY) {
        super.scrollTo(scrollX, scrollY);
    }

    public boolean E(int deltaX, int deltaY, int scrollX, int scrollY, int scrollRangeX, int scrollRangeY, int maxOverScrollX, int maxOverScrollY) {
        int maxOverScrollX2;
        int maxOverScrollY2;
        boolean clampedX;
        boolean clampedY;
        int overScrollMode = getOverScrollMode();
        boolean canScrollHorizontal = computeHorizontalScrollRange() > computeHorizontalScrollExtent();
        boolean canScrollVertical = computeVerticalScrollRange() > computeVerticalScrollExtent();
        boolean overScrollHorizontal = overScrollMode == 0 || (overScrollMode == 1 && canScrollHorizontal);
        boolean overScrollVertical = overScrollMode == 0 || (overScrollMode == 1 && canScrollVertical);
        int newScrollX = scrollX + deltaX;
        if (!overScrollHorizontal) {
            maxOverScrollX2 = 0;
        } else {
            maxOverScrollX2 = maxOverScrollX;
        }
        int newScrollY = scrollY + deltaY;
        if (!overScrollVertical) {
            maxOverScrollY2 = 0;
        } else {
            maxOverScrollY2 = maxOverScrollY;
        }
        int left = -maxOverScrollX2;
        int right = maxOverScrollX2 + scrollRangeX;
        int top = -maxOverScrollY2;
        int bottom = maxOverScrollY2 + scrollRangeY;
        if (newScrollX > right) {
            newScrollX = right;
            clampedX = true;
        } else if (newScrollX < left) {
            newScrollX = left;
            clampedX = true;
        } else {
            clampedX = false;
        }
        if (newScrollY > bottom) {
            newScrollY = bottom;
            clampedY = true;
        } else if (newScrollY < top) {
            newScrollY = top;
            clampedY = true;
        } else {
            clampedY = false;
        }
        if (clampedY && !u(1)) {
            this.f672d.springBack(newScrollX, newScrollY, 0, 0, 0, getScrollRange());
        }
        onOverScrolled(newScrollX, newScrollY, clampedX, clampedY);
        return clampedX || clampedY;
    }

    public int getScrollRange() {
        if (getChildCount() <= 0) {
            return 0;
        }
        View child = getChildAt(0);
        FrameLayout.LayoutParams lp = (FrameLayout.LayoutParams) child.getLayoutParams();
        int childSize = child.getHeight() + lp.topMargin + lp.bottomMargin;
        int parentSpace = (getHeight() - getPaddingTop()) - getPaddingBottom();
        int scrollRange = Math.max(0, childSize - parentSpace);
        return scrollRange;
    }

    public final View r(boolean topFocus, int top, int bottom) {
        List<View> focusables = getFocusables(2);
        View focusCandidate = null;
        boolean foundFullyContainedFocusable = false;
        int count = focusables.size();
        for (int i2 = 0; i2 < count; i2++) {
            View view = focusables.get(i2);
            int viewTop = view.getTop();
            int viewBottom = view.getBottom();
            if (top < viewBottom && viewTop < bottom) {
                boolean viewIsCloserToBoundary = false;
                boolean viewIsFullyContained = top < viewTop && viewBottom < bottom;
                if (focusCandidate == null) {
                    focusCandidate = view;
                    foundFullyContainedFocusable = viewIsFullyContained;
                } else {
                    if ((topFocus && viewTop < focusCandidate.getTop()) || (!topFocus && viewBottom > focusCandidate.getBottom())) {
                        viewIsCloserToBoundary = true;
                    }
                    if (foundFullyContainedFocusable) {
                        if (viewIsFullyContained && viewIsCloserToBoundary) {
                            focusCandidate = view;
                        }
                    } else if (viewIsFullyContained) {
                        focusCandidate = view;
                        foundFullyContainedFocusable = true;
                    } else if (viewIsCloserToBoundary) {
                        focusCandidate = view;
                    }
                }
            }
        }
        return focusCandidate;
    }

    public boolean F(int direction) {
        boolean down = direction == 130;
        int height = getHeight();
        if (down) {
            this.f671c.top = getScrollY() + height;
            int count = getChildCount();
            if (count > 0) {
                View view = getChildAt(count - 1);
                FrameLayout.LayoutParams lp = (FrameLayout.LayoutParams) view.getLayoutParams();
                int bottom = view.getBottom() + lp.bottomMargin + getPaddingBottom();
                Rect rect = this.f671c;
                if (rect.top + height > bottom) {
                    rect.top = bottom - height;
                }
            }
        } else {
            this.f671c.top = getScrollY() - height;
            Rect rect2 = this.f671c;
            if (rect2.top < 0) {
                rect2.top = 0;
            }
        }
        Rect rect3 = this.f671c;
        int i2 = rect3.top;
        int i3 = i2 + height;
        rect3.bottom = i3;
        return J(direction, i2, i3);
    }

    public boolean t(int direction) {
        int count;
        boolean down = direction == 130;
        int height = getHeight();
        Rect rect = this.f671c;
        rect.top = 0;
        rect.bottom = height;
        if (down && (count = getChildCount()) > 0) {
            View view = getChildAt(count - 1);
            FrameLayout.LayoutParams lp = (FrameLayout.LayoutParams) view.getLayoutParams();
            this.f671c.bottom = view.getBottom() + lp.bottomMargin + getPaddingBottom();
            Rect rect2 = this.f671c;
            rect2.top = rect2.bottom - height;
        }
        Rect rect3 = this.f671c;
        return J(direction, rect3.top, rect3.bottom);
    }

    public final boolean J(int direction, int top, int bottom) {
        boolean handled = true;
        int height = getHeight();
        int containerTop = getScrollY();
        int containerBottom = containerTop + height;
        boolean up = direction == 33;
        View newFocused = r(up, top, bottom);
        if (newFocused == null) {
            newFocused = this;
        }
        if (top < containerTop || bottom > containerBottom) {
            int delta = up ? top - containerTop : bottom - containerBottom;
            n(delta);
        } else {
            handled = false;
        }
        if (newFocused != findFocus()) {
            newFocused.requestFocus(direction);
        }
        return handled;
    }

    public boolean h(int direction) {
        View currentFocused = findFocus();
        if (currentFocused == this) {
            currentFocused = null;
        }
        View nextFocused = FocusFinder.getInstance().findNextFocus(this, currentFocused, direction);
        int maxJump = getMaxScrollAmount();
        if (nextFocused == null || !B(nextFocused, maxJump, getHeight())) {
            int scrollDelta = maxJump;
            if (direction == 33 && getScrollY() < scrollDelta) {
                scrollDelta = getScrollY();
            } else if (direction == 130 && getChildCount() > 0) {
                View child = getChildAt(0);
                FrameLayout.LayoutParams lp = (FrameLayout.LayoutParams) child.getLayoutParams();
                int daBottom = child.getBottom() + lp.bottomMargin;
                int screenBottom = (getScrollY() + getHeight()) - getPaddingBottom();
                scrollDelta = Math.min(daBottom - screenBottom, maxJump);
            }
            if (scrollDelta == 0) {
                return false;
            }
            n(direction == 130 ? scrollDelta : -scrollDelta);
        } else {
            nextFocused.getDrawingRect(this.f671c);
            offsetDescendantRectToMyCoords(nextFocused, this.f671c);
            n(k(this.f671c));
            nextFocused.requestFocus(direction);
        }
        if (currentFocused == null || !currentFocused.isFocused() || !z(currentFocused)) {
            return true;
        }
        int descendantFocusability = getDescendantFocusability();
        setDescendantFocusability(131072);
        requestFocus();
        setDescendantFocusability(descendantFocusability);
        return true;
    }

    public final boolean z(View descendant) {
        return !B(descendant, 0, getHeight());
    }

    public final boolean B(View descendant, int delta, int height) {
        descendant.getDrawingRect(this.f671c);
        offsetDescendantRectToMyCoords(descendant, this.f671c);
        return this.f671c.bottom + delta >= getScrollY() && this.f671c.top - delta <= getScrollY() + height;
    }

    public final void n(int delta) {
        if (delta == 0) {
            return;
        }
        if (this.f682n) {
            M(0, delta);
        } else {
            scrollBy(0, delta);
        }
    }

    public final void M(int dx, int dy) {
        N(dx, dy, 250, false);
    }

    public final void N(int dx, int dy, int scrollDurationMs, boolean withNestedScrolling) {
        if (getChildCount() != 0) {
            long duration = AnimationUtils.currentAnimationTimeMillis() - this.f670b;
            if (duration > 250) {
                View child = getChildAt(0);
                FrameLayout.LayoutParams lp = (FrameLayout.LayoutParams) child.getLayoutParams();
                int childSize = child.getHeight() + lp.topMargin + lp.bottomMargin;
                int parentSpace = (getHeight() - getPaddingTop()) - getPaddingBottom();
                int scrollY = getScrollY();
                int maxY = Math.max(0, childSize - parentSpace);
                this.f672d.startScroll(getScrollX(), scrollY, 0, Math.max(0, Math.min(scrollY + dy, maxY)) - scrollY, scrollDurationMs);
                I(withNestedScrolling);
            } else {
                if (!this.f672d.isFinished()) {
                    g();
                }
                scrollBy(dx, dy);
            }
            this.f670b = AnimationUtils.currentAnimationTimeMillis();
        }
    }

    public void P(int x2, int y2, boolean withNestedScrolling) {
        O(x2, y2, 250, withNestedScrolling);
    }

    public void O(int x2, int y2, int scrollDurationMs, boolean withNestedScrolling) {
        N(x2 - getScrollX(), y2 - getScrollY(), scrollDurationMs, withNestedScrolling);
    }

    @Override // android.view.View
    public int computeVerticalScrollRange() {
        int count = getChildCount();
        int parentSpace = (getHeight() - getPaddingBottom()) - getPaddingTop();
        if (count == 0) {
            return parentSpace;
        }
        View child = getChildAt(0);
        FrameLayout.LayoutParams lp = (FrameLayout.LayoutParams) child.getLayoutParams();
        int scrollRange = child.getBottom() + lp.bottomMargin;
        int scrollY = getScrollY();
        int overscrollBottom = Math.max(0, scrollRange - parentSpace);
        if (scrollY < 0) {
            return scrollRange - scrollY;
        }
        if (scrollY > overscrollBottom) {
            return scrollRange + (scrollY - overscrollBottom);
        }
        return scrollRange;
    }

    @Override // android.view.View
    public int computeVerticalScrollOffset() {
        return Math.max(0, super.computeVerticalScrollOffset());
    }

    @Override // android.view.View
    public int computeVerticalScrollExtent() {
        return super.computeVerticalScrollExtent();
    }

    @Override // android.view.View
    public int computeHorizontalScrollRange() {
        return super.computeHorizontalScrollRange();
    }

    @Override // android.view.View
    public int computeHorizontalScrollOffset() {
        return super.computeHorizontalScrollOffset();
    }

    @Override // android.view.View
    public int computeHorizontalScrollExtent() {
        return super.computeHorizontalScrollExtent();
    }

    @Override // android.view.ViewGroup
    public void measureChild(View child, int parentWidthMeasureSpec, int parentHeightMeasureSpec) {
        ViewGroup.LayoutParams lp = child.getLayoutParams();
        int childWidthMeasureSpec = FrameLayout.getChildMeasureSpec(parentWidthMeasureSpec, getPaddingLeft() + getPaddingRight(), lp.width);
        int childHeightMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        child.measure(childWidthMeasureSpec, childHeightMeasureSpec);
    }

    @Override // android.view.ViewGroup
    public void measureChildWithMargins(View child, int parentWidthMeasureSpec, int widthUsed, int parentHeightMeasureSpec, int heightUsed) {
        ViewGroup.MarginLayoutParams lp = (ViewGroup.MarginLayoutParams) child.getLayoutParams();
        int childWidthMeasureSpec = FrameLayout.getChildMeasureSpec(parentWidthMeasureSpec, getPaddingLeft() + getPaddingRight() + lp.leftMargin + lp.rightMargin + widthUsed, lp.width);
        int childHeightMeasureSpec = View.MeasureSpec.makeMeasureSpec(lp.topMargin + lp.bottomMargin, 0);
        child.measure(childWidthMeasureSpec, childHeightMeasureSpec);
    }

    @Override // android.view.View
    public void computeScroll() {
        if (!this.f672d.isFinished()) {
            this.f672d.computeScrollOffset();
            int y2 = this.f672d.getCurrY();
            int unconsumed = y2 - this.f690v;
            this.f690v = y2;
            int[] iArr = this.f688t;
            boolean canOverscroll = false;
            iArr[1] = 0;
            l(0, unconsumed, iArr, null, 1);
            int unconsumed2 = unconsumed - this.f688t[1];
            int range = getScrollRange();
            if (unconsumed2 != 0) {
                int oldScrollY = getScrollY();
                E(0, unconsumed2, getScrollX(), oldScrollY, 0, range, 0, 0);
                int scrolledByMe = getScrollY() - oldScrollY;
                int unconsumed3 = unconsumed2 - scrolledByMe;
                int[] iArr2 = this.f688t;
                iArr2[1] = 0;
                m(0, scrolledByMe, 0, unconsumed3, this.f687s, 1, iArr2);
                unconsumed2 = unconsumed3 - this.f688t[1];
            }
            if (unconsumed2 != 0) {
                int mode = getOverScrollMode();
                if (mode == 0 || (mode == 1 && range > 0)) {
                    canOverscroll = true;
                }
                if (canOverscroll) {
                    if (unconsumed2 < 0) {
                        if (this.f673e.isFinished()) {
                            this.f673e.onAbsorb((int) this.f672d.getCurrVelocity());
                        }
                    } else if (this.f674f.isFinished()) {
                        this.f674f.onAbsorb((int) this.f672d.getCurrVelocity());
                    }
                }
                g();
            }
            if (!this.f672d.isFinished()) {
                c1.c0(this);
            } else {
                S(1);
            }
        }
    }

    public final int H(int deltaY, float x2) {
        float consumed = 0.0f;
        float displacement = x2 / getWidth();
        float pullDistance = deltaY / getHeight();
        if (g.b(this.f673e) != 0.0f) {
            consumed = -g.d(this.f673e, -pullDistance, displacement);
            if (g.b(this.f673e) == 0.0f) {
                this.f673e.onRelease();
            }
        } else if (g.b(this.f674f) != 0.0f) {
            consumed = g.d(this.f674f, pullDistance, 1.0f - displacement);
            if (g.b(this.f674f) == 0.0f) {
                this.f674f.onRelease();
            }
        }
        int pixelsConsumed = Math.round(getHeight() * consumed);
        if (pixelsConsumed != 0) {
            invalidate();
        }
        return pixelsConsumed;
    }

    public final void I(boolean participateInNestedScrolling) {
        if (participateInNestedScrolling) {
            Q(2, 1);
        } else {
            S(1);
        }
        this.f690v = getScrollY();
        c1.c0(this);
    }

    public final void g() {
        this.f672d.abortAnimation();
        S(1);
    }

    public final void K(View child) {
        child.getDrawingRect(this.f671c);
        offsetDescendantRectToMyCoords(child, this.f671c);
        int scrollDelta = k(this.f671c);
        if (scrollDelta != 0) {
            scrollBy(0, scrollDelta);
        }
    }

    public final boolean L(Rect rect, boolean immediate) {
        int delta = k(rect);
        boolean scroll = delta != 0;
        if (scroll) {
            if (immediate) {
                scrollBy(0, delta);
            } else {
                M(0, delta);
            }
        }
        return scroll;
    }

    public int k(Rect rect) {
        if (getChildCount() == 0) {
            return 0;
        }
        int height = getHeight();
        int screenTop = getScrollY();
        int screenBottom = screenTop + height;
        int fadingEdge = getVerticalFadingEdgeLength();
        if (rect.top > 0) {
            screenTop += fadingEdge;
        }
        View child = getChildAt(0);
        FrameLayout.LayoutParams lp = (FrameLayout.LayoutParams) child.getLayoutParams();
        if (rect.bottom < child.getHeight() + lp.topMargin + lp.bottomMargin) {
            screenBottom -= fadingEdge;
        }
        int i2 = rect.bottom;
        if (i2 > screenBottom && rect.top > screenTop) {
            int scrollYDelta = rect.height() > height ? 0 + (rect.top - screenTop) : 0 + (rect.bottom - screenBottom);
            int bottom = child.getBottom() + lp.bottomMargin;
            int distanceToBottom = bottom - screenBottom;
            return Math.min(scrollYDelta, distanceToBottom);
        } else if (rect.top >= screenTop || i2 >= screenBottom) {
            return 0;
        } else {
            int scrollYDelta2 = rect.height() > height ? 0 - (screenBottom - rect.bottom) : 0 - (screenTop - rect.top);
            return Math.max(scrollYDelta2, -getScrollY());
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestChildFocus(View child, View focused) {
        if (!this.f676h) {
            K(focused);
        } else {
            this.f678j = focused;
        }
        super.requestChildFocus(child, focused);
    }

    @Override // android.view.ViewGroup
    public boolean onRequestFocusInDescendants(int direction, Rect previouslyFocusedRect) {
        View nextFocus;
        if (direction == 2) {
            direction = 130;
        } else if (direction == 1) {
            direction = 33;
        }
        if (previouslyFocusedRect == null) {
            nextFocus = FocusFinder.getInstance().findNextFocus(this, null, direction);
        } else {
            nextFocus = FocusFinder.getInstance().findNextFocusFromRect(this, previouslyFocusedRect, direction);
        }
        if (nextFocus != null && !z(nextFocus)) {
            return nextFocus.requestFocus(direction, previouslyFocusedRect);
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean requestChildRectangleOnScreen(View child, Rect rectangle, boolean immediate) {
        rectangle.offset(child.getLeft() - child.getScrollX(), child.getTop() - child.getScrollY());
        return L(rectangle, immediate);
    }

    @Override // android.view.View, android.view.ViewParent
    public void requestLayout() {
        this.f676h = true;
        super.requestLayout();
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean changed, int l2, int t2, int r2, int b2) {
        super.onLayout(changed, l2, t2, r2, b2);
        this.f676h = false;
        View view = this.f678j;
        if (view != null && A(view, this)) {
            K(this.f678j);
        }
        this.f678j = null;
        if (!this.f677i) {
            if (this.f691w != null) {
                scrollTo(getScrollX(), this.f691w.f2257b);
                this.f691w = null;
            }
            int childSize = 0;
            if (getChildCount() > 0) {
                View child = getChildAt(0);
                FrameLayout.LayoutParams lp = (FrameLayout.LayoutParams) child.getLayoutParams();
                childSize = child.getMeasuredHeight() + lp.topMargin + lp.bottomMargin;
            }
            int parentSpace = ((b2 - t2) - getPaddingTop()) - getPaddingBottom();
            int currentScrollY = getScrollY();
            int newScrollY = j(currentScrollY, parentSpace, childSize);
            if (newScrollY != currentScrollY) {
                scrollTo(getScrollX(), newScrollY);
            }
        }
        int parentSpace2 = getScrollX();
        scrollTo(parentSpace2, getScrollY());
        this.f677i = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f677i = false;
    }

    @Override // android.view.View
    public void onSizeChanged(int w2, int h2, int oldw, int oldh) {
        super.onSizeChanged(w2, h2, oldw, oldh);
        View currentFocused = findFocus();
        if (currentFocused != null && this != currentFocused && B(currentFocused, 0, oldh)) {
            currentFocused.getDrawingRect(this.f671c);
            offsetDescendantRectToMyCoords(currentFocused, this.f671c);
            int scrollDelta = k(this.f671c);
            n(scrollDelta);
        }
    }

    public static boolean A(View child, View parent) {
        if (child == parent) {
            return true;
        }
        ViewParent theParent = child.getParent();
        return (theParent instanceof ViewGroup) && A((View) theParent, parent);
    }

    public void s(int velocityY) {
        if (getChildCount() > 0) {
            this.f672d.fling(getScrollX(), getScrollY(), 0, velocityY, 0, 0, Integer.MIN_VALUE, Integer.MAX_VALUE, 0, 0);
            I(true);
        }
    }

    public final void p() {
        this.f679k = false;
        G();
        S(0);
        this.f673e.onRelease();
        this.f674f.onRelease();
    }

    @Override // android.view.View
    public void scrollTo(int x2, int y2) {
        if (getChildCount() > 0) {
            View child = getChildAt(0);
            FrameLayout.LayoutParams lp = (FrameLayout.LayoutParams) child.getLayoutParams();
            int parentSpaceHorizontal = (getWidth() - getPaddingLeft()) - getPaddingRight();
            int childSizeHorizontal = child.getWidth() + lp.leftMargin + lp.rightMargin;
            int parentSpaceVertical = (getHeight() - getPaddingTop()) - getPaddingBottom();
            int childSizeVertical = child.getHeight() + lp.topMargin + lp.bottomMargin;
            int x3 = j(x2, parentSpaceHorizontal, childSizeHorizontal);
            int y3 = j(y2, parentSpaceVertical, childSizeVertical);
            if (x3 != getScrollX() || y3 != getScrollY()) {
                super.scrollTo(x3, y3);
            }
        }
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        super.draw(canvas);
        int scrollY = getScrollY();
        if (!this.f673e.isFinished()) {
            int restoreCount = canvas.save();
            int width = getWidth();
            int height = getHeight();
            int xTranslation = 0;
            int yTranslation = Math.min(0, scrollY);
            if (getClipToPadding()) {
                width -= getPaddingLeft() + getPaddingRight();
                xTranslation = 0 + getPaddingLeft();
            }
            if (getClipToPadding()) {
                height -= getPaddingTop() + getPaddingBottom();
                yTranslation += getPaddingTop();
            }
            canvas.translate(xTranslation, yTranslation);
            this.f673e.setSize(width, height);
            if (this.f673e.draw(canvas)) {
                c1.c0(this);
            }
            canvas.restoreToCount(restoreCount);
        }
        if (!this.f674f.isFinished()) {
            int restoreCount2 = canvas.save();
            int width2 = getWidth();
            int height2 = getHeight();
            int xTranslation2 = 0;
            int yTranslation2 = Math.max(getScrollRange(), scrollY) + height2;
            if (getClipToPadding()) {
                width2 -= getPaddingLeft() + getPaddingRight();
                xTranslation2 = 0 + getPaddingLeft();
            }
            if (getClipToPadding()) {
                height2 -= getPaddingTop() + getPaddingBottom();
                yTranslation2 -= getPaddingBottom();
            }
            canvas.translate(xTranslation2 - width2, yTranslation2);
            canvas.rotate(180.0f, width2, 0.0f);
            this.f674f.setSize(width2, height2);
            if (this.f674f.draw(canvas)) {
                c1.c0(this);
            }
            canvas.restoreToCount(restoreCount2);
        }
    }

    public static int j(int n2, int my, int child) {
        if (my >= child || n2 < 0) {
            return 0;
        }
        if (my + n2 > child) {
            return child - my;
        }
        return n2;
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable state) {
        if (!(state instanceof n)) {
            super.onRestoreInstanceState(state);
            return;
        }
        n ss = (n) state;
        super.onRestoreInstanceState(ss.getSuperState());
        this.f691w = ss;
        requestLayout();
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        Parcelable superState = super.onSaveInstanceState();
        n ss = new n(superState);
        ss.f2257b = getScrollY();
        return ss;
    }
}
