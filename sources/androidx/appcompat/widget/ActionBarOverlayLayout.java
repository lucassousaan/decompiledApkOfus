package androidx.appcompat.widget;

import android.animation.AnimatorListenerAdapter;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.Window;
import android.view.WindowInsets;
import android.widget.OverScroller;
import com.example.helloworld.R;
import d.a1;
import f0.c1;
import f0.m1;
import f0.x;
import f0.x1;
import f0.y;
import f0.z;
import h.d0;
import x.b;

/* JADX WARN: Classes with same name are omitted:
  
 */
@SuppressLint({"UnknownNullness"})
/* loaded from: classes.dex */
public class ActionBarOverlayLayout extends ViewGroup implements q1, x, y {
    public static final int[] G = {R.attr.actionBarSize, 16842841};
    public OverScroller A;
    public ViewPropertyAnimator B;

    /* renamed from: b  reason: collision with root package name */
    public int f116b;

    /* renamed from: d  reason: collision with root package name */
    public ContentFrameLayout f118d;

    /* renamed from: e  reason: collision with root package name */
    public ActionBarContainer f119e;

    /* renamed from: f  reason: collision with root package name */
    public r1 f120f;

    /* renamed from: g  reason: collision with root package name */
    public Drawable f121g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f122h;

    /* renamed from: i  reason: collision with root package name */
    public boolean f123i;

    /* renamed from: j  reason: collision with root package name */
    public boolean f124j;

    /* renamed from: k  reason: collision with root package name */
    public boolean f125k;

    /* renamed from: l  reason: collision with root package name */
    public boolean f126l;

    /* renamed from: m  reason: collision with root package name */
    public int f127m;

    /* renamed from: n  reason: collision with root package name */
    public int f128n;

    /* renamed from: v  reason: collision with root package name */
    public x1 f136v;

    /* renamed from: w  reason: collision with root package name */
    public x1 f137w;

    /* renamed from: x  reason: collision with root package name */
    public x1 f138x;

    /* renamed from: y  reason: collision with root package name */
    public x1 f139y;

    /* renamed from: z  reason: collision with root package name */
    public h f140z;

    /* renamed from: c  reason: collision with root package name */
    public int f117c = 0;

    /* renamed from: o  reason: collision with root package name */
    public final Rect f129o = new Rect();

    /* renamed from: p  reason: collision with root package name */
    public final Rect f130p = new Rect();

    /* renamed from: q  reason: collision with root package name */
    public final Rect f131q = new Rect();

    /* renamed from: r  reason: collision with root package name */
    public final Rect f132r = new Rect();

    /* renamed from: s  reason: collision with root package name */
    public final Rect f133s = new Rect();

    /* renamed from: t  reason: collision with root package name */
    public final Rect f134t = new Rect();

    /* renamed from: u  reason: collision with root package name */
    public final Rect f135u = new Rect();
    public final AnimatorListenerAdapter C = new e(this);
    public final Runnable D = new f(this);
    public final Runnable E = new g(this);
    public final z F = new z();

    public ActionBarOverlayLayout(Context context, AttributeSet attrs) {
        super(context, attrs);
        x1 x1Var = x1.f1934b;
        this.f136v = x1Var;
        this.f137w = x1Var;
        this.f138x = x1Var;
        this.f139y = x1Var;
        p(context);
    }

    public final void p(Context context) {
        boolean z2;
        TypedArray ta = getContext().getTheme().obtainStyledAttributes(G);
        boolean z3 = false;
        this.f116b = ta.getDimensionPixelSize(0, 0);
        Drawable drawable = ta.getDrawable(1);
        this.f121g = drawable;
        if (drawable == null) {
            z2 = true;
        } else {
            z2 = false;
        }
        setWillNotDraw(z2);
        ta.recycle();
        if (context.getApplicationInfo().targetSdkVersion < 19) {
            z3 = true;
        }
        this.f122h = z3;
        this.A = new OverScroller(context);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        n();
    }

    public void setActionBarVisibilityCallback(h cb) {
        this.f140z = cb;
        if (getWindowToken() != null) {
            ((a1) this.f140z).C(this.f117c);
            if (this.f128n != 0) {
                int newVis = this.f128n;
                onWindowSystemUiVisibilityChanged(newVis);
                c1.i0(this);
            }
        }
    }

    public void setOverlayMode(boolean overlayMode) {
        this.f123i = overlayMode;
        this.f122h = overlayMode && getContext().getApplicationInfo().targetSdkVersion < 19;
    }

    public boolean r() {
        return this.f123i;
    }

    public void setHasNonEmbeddedTabs(boolean hasNonEmbeddedTabs) {
        this.f124j = hasNonEmbeddedTabs;
    }

    public void setShowingForActionMode(boolean showing) {
    }

    @Override // android.view.View
    public void onConfigurationChanged(Configuration newConfig) {
        super.onConfigurationChanged(newConfig);
        p(getContext());
        c1.i0(this);
    }

    @Override // android.view.View
    public void onWindowSystemUiVisibilityChanged(int visible) {
        super.onWindowSystemUiVisibilityChanged(visible);
        w();
        int diff = this.f128n ^ visible;
        this.f128n = visible;
        boolean z2 = true;
        boolean barVisible = (visible & 4) == 0;
        boolean stable = (visible & 256) != 0;
        h hVar = this.f140z;
        if (hVar != null) {
            if (stable) {
                z2 = false;
            }
            ((a1) hVar).u(z2);
            if (barVisible || !stable) {
                ((a1) this.f140z).L();
            } else {
                ((a1) this.f140z).y();
            }
        }
        if ((diff & 256) != 0 && this.f140z != null) {
            c1.i0(this);
        }
    }

    @Override // android.view.View
    public void onWindowVisibilityChanged(int visibility) {
        super.onWindowVisibilityChanged(visibility);
        this.f117c = visibility;
        h hVar = this.f140z;
        if (hVar != null) {
            ((a1) hVar).C(visibility);
        }
    }

    public final boolean h(View view, Rect insets, boolean left, boolean top, boolean bottom, boolean right) {
        boolean changed = false;
        i lp = (i) view.getLayoutParams();
        if (left) {
            int i2 = ((ViewGroup.MarginLayoutParams) lp).leftMargin;
            int i3 = insets.left;
            if (i2 != i3) {
                changed = true;
                ((ViewGroup.MarginLayoutParams) lp).leftMargin = i3;
            }
        }
        if (top) {
            int i4 = ((ViewGroup.MarginLayoutParams) lp).topMargin;
            int i5 = insets.top;
            if (i4 != i5) {
                changed = true;
                ((ViewGroup.MarginLayoutParams) lp).topMargin = i5;
            }
        }
        if (right) {
            int i6 = ((ViewGroup.MarginLayoutParams) lp).rightMargin;
            int i7 = insets.right;
            if (i6 != i7) {
                changed = true;
                ((ViewGroup.MarginLayoutParams) lp).rightMargin = i7;
            }
        }
        if (!bottom) {
            return changed;
        }
        int i8 = ((ViewGroup.MarginLayoutParams) lp).bottomMargin;
        int i9 = insets.bottom;
        if (i8 == i9) {
            return changed;
        }
        ((ViewGroup.MarginLayoutParams) lp).bottomMargin = i9;
        return true;
    }

    @Override // android.view.View
    public boolean fitSystemWindows(Rect insets) {
        return super.fitSystemWindows(insets);
    }

    @Override // android.view.View
    public WindowInsets onApplyWindowInsets(WindowInsets in) {
        w();
        x1 insets = x1.t(in, this);
        Rect systemInsets = new Rect(insets.g(), insets.i(), insets.h(), insets.f());
        boolean changed = h(this.f119e, systemInsets, true, true, false, true);
        c1.f(this, insets, this.f129o);
        Rect rect = this.f129o;
        x1 j2 = insets.j(rect.left, rect.top, rect.right, rect.bottom);
        this.f136v = j2;
        if (!this.f137w.equals(j2)) {
            changed = true;
            this.f137w = this.f136v;
        }
        if (!this.f130p.equals(this.f129o)) {
            changed = true;
            this.f130p.set(this.f129o);
        }
        if (changed) {
            requestLayout();
        }
        return insets.a().c().b().r();
    }

    /* renamed from: k */
    public i generateDefaultLayoutParams() {
        return new i(-1, -1);
    }

    /* renamed from: l */
    public i generateLayoutParams(AttributeSet attrs) {
        return new i(getContext(), attrs);
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams p2) {
        return new i(p2);
    }

    @Override // android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams p2) {
        return p2 instanceof i;
    }

    @Override // android.view.View
    public void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        w();
        int topInset = 0;
        measureChildWithMargins(this.f119e, widthMeasureSpec, 0, heightMeasureSpec, 0);
        i lp = (i) this.f119e.getLayoutParams();
        int maxWidth = Math.max(0, this.f119e.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) lp).leftMargin + ((ViewGroup.MarginLayoutParams) lp).rightMargin);
        int maxHeight = Math.max(0, this.f119e.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) lp).topMargin + ((ViewGroup.MarginLayoutParams) lp).bottomMargin);
        int childState = View.combineMeasuredStates(0, this.f119e.getMeasuredState());
        int vis = c1.J(this);
        boolean stable = (vis & 256) != 0;
        if (stable) {
            topInset = this.f116b;
            if (this.f124j) {
                View tabs = this.f119e.getTabContainer();
                if (tabs != null) {
                    topInset += this.f116b;
                }
            }
        } else if (this.f119e.getVisibility() != 8) {
            topInset = this.f119e.getMeasuredHeight();
        }
        this.f131q.set(this.f129o);
        x1 x1Var = this.f136v;
        this.f138x = x1Var;
        if (this.f123i || stable) {
            b sysWindow = b.a(x1Var.g(), this.f138x.i() + topInset, this.f138x.h(), this.f138x.f() + 0);
            m1 m1Var = new m1(this.f138x);
            m1Var.c(sysWindow);
            this.f138x = m1Var.a();
        } else {
            Rect rect = this.f131q;
            rect.top += topInset;
            rect.bottom += 0;
            this.f138x = x1Var.j(0, topInset, 0, 0);
        }
        h(this.f118d, this.f131q, true, true, true, true);
        if (!this.f139y.equals(this.f138x)) {
            x1 x1Var2 = this.f138x;
            this.f139y = x1Var2;
            c1.g(this.f118d, x1Var2);
        }
        measureChildWithMargins(this.f118d, widthMeasureSpec, 0, heightMeasureSpec, 0);
        i lp2 = (i) this.f118d.getLayoutParams();
        int maxWidth2 = Math.max(maxWidth, this.f118d.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) lp2).leftMargin + ((ViewGroup.MarginLayoutParams) lp2).rightMargin);
        int maxHeight2 = Math.max(maxHeight, this.f118d.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) lp2).topMargin + ((ViewGroup.MarginLayoutParams) lp2).bottomMargin);
        int childState2 = View.combineMeasuredStates(childState, this.f118d.getMeasuredState());
        setMeasuredDimension(View.resolveSizeAndState(Math.max(maxWidth2 + getPaddingLeft() + getPaddingRight(), getSuggestedMinimumWidth()), widthMeasureSpec, childState2), View.resolveSizeAndState(Math.max(maxHeight2 + getPaddingTop() + getPaddingBottom(), getSuggestedMinimumHeight()), heightMeasureSpec, childState2 << 16));
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean changed, int left, int top, int right, int bottom) {
        int count = getChildCount();
        int parentLeft = getPaddingLeft();
        int parentTop = getPaddingTop();
        for (int i2 = 0; i2 < count; i2++) {
            View child = getChildAt(i2);
            if (child.getVisibility() != 8) {
                i lp = (i) child.getLayoutParams();
                int width = child.getMeasuredWidth();
                int height = child.getMeasuredHeight();
                int childLeft = ((ViewGroup.MarginLayoutParams) lp).leftMargin + parentLeft;
                int childTop = ((ViewGroup.MarginLayoutParams) lp).topMargin + parentTop;
                child.layout(childLeft, childTop, childLeft + width, childTop + height);
            }
        }
    }

    @Override // android.view.View
    public void draw(Canvas c2) {
        int top;
        super.draw(c2);
        if (this.f121g != null && !this.f122h) {
            if (this.f119e.getVisibility() == 0) {
                top = (int) (this.f119e.getBottom() + this.f119e.getTranslationY() + 0.5f);
            } else {
                top = 0;
            }
            this.f121g.setBounds(0, top, getWidth(), this.f121g.getIntrinsicHeight() + top);
            this.f121g.draw(c2);
        }
    }

    @Override // android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return false;
    }

    @Override // f0.y
    public void b(View target, int dxConsumed, int dyConsumed, int dxUnconsumed, int dyUnconsumed, int type, int[] consumed) {
        c(target, dxConsumed, dyConsumed, dxUnconsumed, dyUnconsumed, type);
    }

    @Override // f0.x
    public boolean f(View child, View target, int axes, int type) {
        return type == 0 && onStartNestedScroll(child, target, axes);
    }

    @Override // f0.x
    public void a(View child, View target, int axes, int type) {
        if (type == 0) {
            onNestedScrollAccepted(child, target, axes);
        }
    }

    @Override // f0.x
    public void d(View target, int type) {
        if (type == 0) {
            onStopNestedScroll(target);
        }
    }

    @Override // f0.x
    public void c(View target, int dxConsumed, int dyConsumed, int dxUnconsumed, int dyUnconsumed, int type) {
        if (type == 0) {
            onNestedScroll(target, dxConsumed, dyConsumed, dxUnconsumed, dyUnconsumed);
        }
    }

    @Override // f0.x
    public void e(View target, int dx, int dy, int[] consumed, int type) {
        if (type == 0) {
            onNestedPreScroll(target, dx, dy, consumed);
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onStartNestedScroll(View child, View target, int axes) {
        if ((axes & 2) == 0 || this.f119e.getVisibility() != 0) {
            return false;
        }
        return this.f125k;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onNestedScrollAccepted(View child, View target, int axes) {
        this.F.c(child, target, axes);
        this.f127m = getActionBarHideOffset();
        n();
        h hVar = this.f140z;
        if (hVar != null) {
            ((a1) hVar).A();
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onNestedScroll(View target, int dxConsumed, int dyConsumed, int dxUnconsumed, int dyUnconsumed) {
        int i2 = this.f127m + dyConsumed;
        this.f127m = i2;
        setActionBarHideOffset(i2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onStopNestedScroll(View target) {
        if (this.f125k && !this.f126l) {
            if (this.f127m <= this.f119e.getHeight()) {
                v();
            } else {
                u();
            }
        }
        h hVar = this.f140z;
        if (hVar != null) {
            ((a1) hVar).B();
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onNestedFling(View target, float velocityX, float velocityY, boolean consumed) {
        if (!this.f125k || !consumed) {
            return false;
        }
        if (A(velocityY)) {
            g();
        } else {
            x();
        }
        this.f126l = true;
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onNestedPreScroll(View target, int dx, int dy, int[] consumed) {
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onNestedPreFling(View target, float velocityX, float velocityY) {
        return false;
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        return this.F.a();
    }

    public void w() {
        if (this.f118d == null) {
            this.f118d = (ContentFrameLayout) findViewById(R.id.action_bar_activity_content);
            this.f119e = (ActionBarContainer) findViewById(R.id.action_bar_container);
            this.f120f = m(findViewById(R.id.action_bar));
        }
    }

    public final r1 m(View view) {
        if (view instanceof r1) {
            return (r1) view;
        }
        if (view instanceof Toolbar) {
            return ((Toolbar) view).getWrapper();
        }
        throw new IllegalStateException("Can't make a decor toolbar out of " + view.getClass().getSimpleName());
    }

    public void setHideOnContentScrollEnabled(boolean hideOnContentScroll) {
        if (hideOnContentScroll != this.f125k) {
            this.f125k = hideOnContentScroll;
            if (!hideOnContentScroll) {
                n();
                setActionBarHideOffset(0);
            }
        }
    }

    public int getActionBarHideOffset() {
        ActionBarContainer actionBarContainer = this.f119e;
        if (actionBarContainer != null) {
            return -((int) actionBarContainer.getTranslationY());
        }
        return 0;
    }

    public void setActionBarHideOffset(int offset) {
        n();
        int topHeight = this.f119e.getHeight();
        this.f119e.setTranslationY(-Math.max(0, Math.min(offset, topHeight)));
    }

    public void n() {
        removeCallbacks(this.D);
        removeCallbacks(this.E);
        ViewPropertyAnimator viewPropertyAnimator = this.B;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
        }
    }

    public final void v() {
        n();
        postDelayed(this.D, 600L);
    }

    public final void u() {
        n();
        postDelayed(this.E, 600L);
    }

    public final void x() {
        n();
        this.D.run();
    }

    public final void g() {
        n();
        this.E.run();
    }

    public final boolean A(float velocityY) {
        this.A.fling(0, 0, 0, (int) velocityY, 0, 0, Integer.MIN_VALUE, Integer.MAX_VALUE);
        int finalY = this.A.getFinalY();
        return finalY > this.f119e.getHeight();
    }

    @Override // androidx.appcompat.widget.q1
    public void setWindowCallback(Window.Callback cb) {
        w();
        ((d4) this.f120f).I(cb);
    }

    @Override // androidx.appcompat.widget.q1
    public void setWindowTitle(CharSequence title) {
        w();
        ((d4) this.f120f).J(title);
    }

    public CharSequence getTitle() {
        w();
        return ((d4) this.f120f).h();
    }

    public void q(int windowFeature) {
        w();
        switch (windowFeature) {
            case 2:
                ((d4) this.f120f).m();
                return;
            case 5:
                ((d4) this.f120f).l();
                return;
            case 109:
                setOverlayMode(true);
                return;
            default:
                return;
        }
    }

    public void setUiOptions(int uiOptions) {
    }

    public void setIcon(int resId) {
        w();
        ((d4) this.f120f).v(resId);
    }

    public void setIcon(Drawable d2) {
        w();
        ((d4) this.f120f).w(d2);
    }

    public void setLogo(int resId) {
        w();
        ((d4) this.f120f).x(resId);
    }

    public boolean i() {
        w();
        return ((d4) this.f120f).a();
    }

    public boolean t() {
        w();
        return ((d4) this.f120f).o();
    }

    public boolean s() {
        w();
        return ((d4) this.f120f).n();
    }

    public boolean B() {
        w();
        return ((d4) this.f120f).L();
    }

    public boolean o() {
        w();
        return ((d4) this.f120f).k();
    }

    public void z() {
        w();
        ((d4) this.f120f).A();
    }

    public void y(Menu menu, d0 cb) {
        w();
        ((d4) this.f120f).z(menu, cb);
    }

    public void j() {
        w();
        ((d4) this.f120f).d();
    }
}
