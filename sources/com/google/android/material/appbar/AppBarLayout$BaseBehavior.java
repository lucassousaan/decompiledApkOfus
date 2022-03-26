package com.google.android.material.appbar;

import a1.a;
import android.animation.ValueAnimator;
import android.content.Context;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Interpolator;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.ScrollView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import f0.c1;
import f0.v;
import g0.c;
import java.lang.ref.WeakReference;
import java.util.List;
import s.b;
import x0.d;
import x0.e;
import x0.f;

/* JADX WARN: Classes with same name are omitted:
  
 */
/* loaded from: classes.dex */
public class AppBarLayout$BaseBehavior<T extends e> extends f {

    /* renamed from: j  reason: collision with root package name */
    public int f1237j;

    /* renamed from: k  reason: collision with root package name */
    public int f1238k;

    /* renamed from: l  reason: collision with root package name */
    public ValueAnimator f1239l;

    /* renamed from: m  reason: collision with root package name */
    public int f1240m = -1;

    /* renamed from: n  reason: collision with root package name */
    public boolean f1241n;

    /* renamed from: o  reason: collision with root package name */
    public float f1242o;

    /* renamed from: p  reason: collision with root package name */
    public WeakReference f1243p;

    @Override // s.b
    public /* bridge */ /* synthetic */ boolean A(CoordinatorLayout coordinatorLayout, View view, View view2, View view3, int i2, int i3) {
        a.a(view);
        return h0(coordinatorLayout, null, view2, i2, i3);
    }

    @Override // s.b
    public /* bridge */ /* synthetic */ void C(CoordinatorLayout coordinatorLayout, View view, View view2, int i2) {
        a.a(view);
        i0(coordinatorLayout, null, view2, i2);
    }

    @Override // x0.f
    public /* bridge */ /* synthetic */ boolean H(View view) {
        a.a(view);
        return S(null);
    }

    @Override // x0.f
    public /* bridge */ /* synthetic */ int J(View view) {
        a.a(view);
        Y(null);
        throw null;
    }

    @Override // x0.f
    public /* bridge */ /* synthetic */ int K(View view) {
        a.a(view);
        Z(null);
        throw null;
    }

    @Override // x0.f
    public /* bridge */ /* synthetic */ int O(CoordinatorLayout coordinatorLayout, View view, int i2, int i3, int i4) {
        a.a(view);
        return j0(coordinatorLayout, null, i2, i3, i4);
    }

    @Override // x0.h, s.b
    public /* bridge */ /* synthetic */ boolean l(CoordinatorLayout coordinatorLayout, View view, int i2) {
        a.a(view);
        b0(coordinatorLayout, null, i2);
        throw null;
    }

    @Override // s.b
    public /* bridge */ /* synthetic */ boolean m(CoordinatorLayout coordinatorLayout, View view, int i2, int i3, int i4, int i5) {
        a.a(view);
        c0(coordinatorLayout, null, i2, i3, i4, i5);
        throw null;
    }

    @Override // s.b
    public /* bridge */ /* synthetic */ void q(CoordinatorLayout coordinatorLayout, View view, View view2, int i2, int i3, int[] iArr, int i4) {
        a.a(view);
        d0(coordinatorLayout, null, view2, i3, iArr);
        throw null;
    }

    @Override // s.b
    public /* bridge */ /* synthetic */ void t(CoordinatorLayout coordinatorLayout, View view, View view2, int i2, int i3, int i4, int i5, int i6, int[] iArr) {
        a.a(view);
        e0(coordinatorLayout, null, i5, iArr);
    }

    @Override // s.b
    public /* bridge */ /* synthetic */ void x(CoordinatorLayout coordinatorLayout, View view, Parcelable parcelable) {
        a.a(view);
        f0(coordinatorLayout, null, parcelable);
    }

    @Override // s.b
    public /* bridge */ /* synthetic */ Parcelable y(CoordinatorLayout coordinatorLayout, View view) {
        a.a(view);
        return g0(coordinatorLayout, null);
    }

    public AppBarLayout$BaseBehavior() {
    }

    public AppBarLayout$BaseBehavior(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public boolean h0(CoordinatorLayout parent, e eVar, View directTargetChild, int nestedScrollAxes, int type) {
        ValueAnimator valueAnimator;
        boolean started = (nestedScrollAxes & 2) != 0 && (eVar.h() || T(parent, eVar, directTargetChild));
        if (started && (valueAnimator = this.f1239l) != null) {
            valueAnimator.cancel();
        }
        this.f1243p = null;
        this.f1238k = type;
        return started;
    }

    public final boolean T(CoordinatorLayout parent, e eVar, View directTargetChild) {
        return eVar.g() && parent.getHeight() - directTargetChild.getHeight() <= eVar.getHeight();
    }

    public void d0(CoordinatorLayout coordinatorLayout, e eVar, View target, int dy, int[] consumed) {
        if (dy != 0) {
            if (dy >= 0) {
                int min = -eVar.e();
                if (min != 0) {
                    consumed[1] = M(coordinatorLayout, eVar, dy, min, 0);
                }
            } else {
                eVar.d();
                throw null;
            }
        }
        if (eVar.h()) {
            eVar.l(eVar.m(target));
        }
    }

    public void e0(CoordinatorLayout coordinatorLayout, e eVar, int dyUnconsumed, int[] consumed) {
        if (dyUnconsumed < 0) {
            consumed[1] = M(coordinatorLayout, eVar, dyUnconsumed, -eVar.a(), 0);
        }
        if (dyUnconsumed == 0) {
            m0(coordinatorLayout, eVar);
        }
    }

    public void i0(CoordinatorLayout coordinatorLayout, e eVar, View target, int type) {
        if (this.f1238k == 0 || type == 1) {
            l0(coordinatorLayout, eVar);
            if (eVar.h()) {
                eVar.l(eVar.m(target));
            }
        }
        this.f1243p = new WeakReference(target);
    }

    public final void Q(CoordinatorLayout coordinatorLayout, e eVar, int offset, float velocity) {
        int duration;
        int distance = Math.abs(L() - offset);
        float velocity2 = Math.abs(velocity);
        if (velocity2 > 0.0f) {
            duration = Math.round((distance / velocity2) * 1000.0f) * 3;
        } else {
            float distanceRatio = distance / eVar.getHeight();
            duration = (int) ((1.0f + distanceRatio) * 150.0f);
        }
        R(coordinatorLayout, eVar, offset, duration);
    }

    public final void R(CoordinatorLayout coordinatorLayout, e eVar, int offset, int duration) {
        int currentOffset = L();
        if (currentOffset == offset) {
            ValueAnimator valueAnimator = this.f1239l;
            if (valueAnimator != null && valueAnimator.isRunning()) {
                this.f1239l.cancel();
                return;
            }
            return;
        }
        ValueAnimator valueAnimator2 = this.f1239l;
        if (valueAnimator2 == null) {
            ValueAnimator valueAnimator3 = new ValueAnimator();
            this.f1239l = valueAnimator3;
            valueAnimator3.setInterpolator(w0.a.f3655e);
            this.f1239l.addUpdateListener(new x0.a(this, coordinatorLayout));
        } else {
            valueAnimator2.cancel();
        }
        this.f1239l.setDuration(Math.min(duration, 600));
        this.f1239l.setIntValues(currentOffset, offset);
        this.f1239l.start();
    }

    public final int X(e eVar, int offset) {
        int count = eVar.getChildCount();
        for (int i2 = 0; i2 < count; i2++) {
            View child = eVar.getChildAt(i2);
            int top = child.getTop();
            int bottom = child.getBottom();
            d lp = (d) child.getLayoutParams();
            if (U(lp.a(), 32)) {
                top -= ((LinearLayout.LayoutParams) lp).topMargin;
                bottom += ((LinearLayout.LayoutParams) lp).bottomMargin;
            }
            if (top <= (-offset) && bottom >= (-offset)) {
                return i2;
            }
        }
        return -1;
    }

    public final void l0(CoordinatorLayout coordinatorLayout, e eVar) {
        int offset = L();
        int offsetChildIndex = X(eVar, offset);
        if (offsetChildIndex >= 0) {
            View offsetChild = eVar.getChildAt(offsetChildIndex);
            d lp = (d) offsetChild.getLayoutParams();
            int flags = lp.a();
            if ((flags & 17) == 17) {
                int snapTop = -offsetChild.getTop();
                int snapBottom = -offsetChild.getBottom();
                if (offsetChildIndex != eVar.getChildCount() - 1) {
                    if (U(flags, 2)) {
                        snapBottom += c1.B(offsetChild);
                    } else if (U(flags, 5)) {
                        int seam = c1.B(offsetChild) + snapBottom;
                        if (offset < seam) {
                            snapTop = seam;
                        } else {
                            snapBottom = seam;
                        }
                    }
                    if (U(flags, 32)) {
                        snapTop += ((LinearLayout.LayoutParams) lp).topMargin;
                        snapBottom -= ((LinearLayout.LayoutParams) lp).bottomMargin;
                    }
                    int i2 = (snapBottom + snapTop) / 2;
                    eVar.d();
                    throw null;
                }
                eVar.c();
                throw null;
            }
        }
    }

    public static boolean U(int flags, int check) {
        return (flags & check) == check;
    }

    public boolean c0(CoordinatorLayout parent, e eVar, int parentWidthMeasureSpec, int widthUsed, int parentHeightMeasureSpec, int heightUsed) {
        s.e lp = (s.e) eVar.getLayoutParams();
        if (((ViewGroup.MarginLayoutParams) lp).height == -2) {
            parent.J(eVar, parentWidthMeasureSpec, widthUsed, View.MeasureSpec.makeMeasureSpec(0, 0), heightUsed);
            return true;
        }
        super.m(parent, eVar, parentWidthMeasureSpec, widthUsed, parentHeightMeasureSpec, heightUsed);
        return false;
    }

    public boolean b0(CoordinatorLayout parent, e eVar, int layoutDirection) {
        super.l(parent, eVar, layoutDirection);
        int offset = eVar.b();
        int i2 = this.f1240m;
        if (i2 >= 0 && (offset & 8) == 0) {
            View child = eVar.getChildAt(i2);
            int offset2 = -child.getBottom();
            if (this.f1241n) {
                c1.B(child);
                eVar.c();
                throw null;
            }
            N(parent, eVar, offset2 + Math.round(child.getHeight() * this.f1242o));
        } else if (offset != 0) {
            boolean animate = (offset & 4) != 0;
            if ((offset & 2) != 0) {
                int offset3 = -eVar.e();
                if (animate) {
                    Q(parent, eVar, offset3, 0.0f);
                } else {
                    N(parent, eVar, offset3);
                }
            } else if ((offset & 1) != 0) {
                if (animate) {
                    Q(parent, eVar, 0, 0.0f);
                } else {
                    N(parent, eVar, 0);
                }
            }
        }
        eVar.j();
        this.f1240m = -1;
        E();
        eVar.d();
        throw null;
    }

    public final void m0(CoordinatorLayout coordinatorLayout, e eVar) {
        c1.f0(coordinatorLayout, c.f2008f.b());
        c1.f0(coordinatorLayout, c.f2009g.b());
        View scrollingView = V(coordinatorLayout);
        if (scrollingView != null) {
            eVar.d();
            throw null;
        }
    }

    public boolean S(e eVar) {
        WeakReference weakReference = this.f1243p;
        if (weakReference == null) {
            return true;
        }
        View scrollingView = (View) weakReference.get();
        return scrollingView != null && scrollingView.isShown() && !scrollingView.canScrollVertically(-1);
    }

    public int Y(e eVar) {
        return -eVar.a();
    }

    public int Z(e eVar) {
        return eVar.d();
    }

    public int j0(CoordinatorLayout coordinatorLayout, e eVar, int newOffset, int minOffset, int maxOffset) {
        int curOffset = L();
        int consumed = 0;
        if (minOffset == 0 || curOffset < minOffset || curOffset > maxOffset) {
            this.f1237j = 0;
        } else {
            int newOffset2 = a0.a.b(newOffset, minOffset, maxOffset);
            if (curOffset != newOffset2) {
                int interpolatedOffset = eVar.f() ? a0(eVar, newOffset2) : newOffset2;
                boolean offsetChanged = G(interpolatedOffset);
                consumed = curOffset - newOffset2;
                this.f1237j = newOffset2 - interpolatedOffset;
                if (!offsetChanged && eVar.f()) {
                    coordinatorLayout.l(eVar);
                }
                eVar.i(E());
                n0(coordinatorLayout, eVar, newOffset2, newOffset2 < curOffset ? -1 : 1, false);
            }
        }
        m0(coordinatorLayout, eVar);
        return consumed;
    }

    public final int a0(e eVar, int offset) {
        int absOffset = Math.abs(offset);
        int i2 = 0;
        int z2 = eVar.getChildCount();
        while (true) {
            if (i2 >= z2) {
                break;
            }
            View child = eVar.getChildAt(i2);
            d childLp = (d) child.getLayoutParams();
            Interpolator interpolator = childLp.b();
            if (absOffset < child.getTop() || absOffset > child.getBottom()) {
                i2++;
            } else if (interpolator != null) {
                int childScrollableHeight = 0;
                int flags = childLp.a();
                if ((flags & 1) != 0) {
                    childScrollableHeight = 0 + child.getHeight() + ((LinearLayout.LayoutParams) childLp).topMargin + ((LinearLayout.LayoutParams) childLp).bottomMargin;
                    if ((flags & 2) != 0) {
                        childScrollableHeight -= c1.B(child);
                    }
                }
                if (c1.x(child)) {
                    eVar.c();
                    throw null;
                } else if (childScrollableHeight > 0) {
                    int offsetForView = absOffset - child.getTop();
                    int interpolatedDiff = Math.round(childScrollableHeight * interpolator.getInterpolation(offsetForView / childScrollableHeight));
                    return Integer.signum(offset) * (child.getTop() + interpolatedDiff);
                }
            }
        }
        return offset;
    }

    public final void n0(CoordinatorLayout parent, e eVar, int offset, int direction, boolean forceJump) {
        View child = W(offset);
        if (child != null) {
            d childLp = (d) child.getLayoutParams();
            int flags = childLp.a();
            boolean lifted = false;
            if ((flags & 1) != 0) {
                c1.B(child);
                if (direction > 0 && (flags & 12) != 0) {
                    child.getBottom();
                    eVar.c();
                    throw null;
                } else if ((flags & 2) != 0) {
                    child.getBottom();
                    eVar.c();
                    throw null;
                }
            }
            if (eVar.h()) {
                lifted = eVar.m(V(parent));
            }
            boolean changed = eVar.l(lifted);
            if (forceJump || (changed && k0(parent, eVar))) {
                eVar.jumpDrawablesToCurrentState();
            }
        }
    }

    public final boolean k0(CoordinatorLayout parent, e eVar) {
        List<View> dependencies = parent.s(eVar);
        int size = dependencies.size();
        for (int i2 = 0; i2 < size; i2++) {
            View dependency = dependencies.get(i2);
            s.e lp = (s.e) dependency.getLayoutParams();
            b behavior = lp.f();
            if (behavior instanceof AppBarLayout$ScrollingViewBehavior) {
                return ((AppBarLayout$ScrollingViewBehavior) behavior).K() != 0;
            }
        }
        return false;
    }

    public static View W(int offset) {
        e layout = null;
        int absOffset = Math.abs(offset);
        int z2 = layout.getChildCount();
        for (int i2 = 0; i2 < z2; i2++) {
            View child = layout.getChildAt(i2);
            if (absOffset >= child.getTop() && absOffset <= child.getBottom()) {
                return child;
            }
        }
        return null;
    }

    public final View V(CoordinatorLayout parent) {
        int z2 = parent.getChildCount();
        for (int i2 = 0; i2 < z2; i2++) {
            View child = parent.getChildAt(i2);
            if ((child instanceof v) || (child instanceof ListView) || (child instanceof ScrollView)) {
                return child;
            }
        }
        return null;
    }

    @Override // x0.f
    public int L() {
        return E() + this.f1237j;
    }

    public Parcelable g0(CoordinatorLayout parent, e eVar) {
        Parcelable superState = super.y(parent, eVar);
        int offset = E();
        int count = eVar.getChildCount();
        for (int i2 = 0; i2 < count; i2++) {
            View child = eVar.getChildAt(i2);
            int visBottom = child.getBottom() + offset;
            if (child.getTop() + offset <= 0 && visBottom >= 0) {
                x0.c ss = new x0.c(superState);
                ss.f3694d = i2;
                c1.B(child);
                eVar.c();
                throw null;
            }
        }
        return superState;
    }

    public void f0(CoordinatorLayout parent, e eVar, Parcelable state) {
        if (state instanceof x0.c) {
            x0.c ss = (x0.c) state;
            super.x(parent, eVar, ss.i());
            this.f1240m = ss.f3694d;
            this.f1242o = ss.f3695e;
            this.f1241n = ss.f3696f;
            return;
        }
        super.x(parent, eVar, state);
        this.f1240m = -1;
    }
}
