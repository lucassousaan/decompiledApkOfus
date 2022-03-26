package androidx.fragment.app;

import android.animation.LayoutTransition;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.widget.FrameLayout;
import f0.c1;
import f0.x1;
import java.util.ArrayList;
import m0.a;

/* JADX WARN: Classes with same name are omitted:
  
 */
/* loaded from: classes.dex */
public final class o0 extends FrameLayout {

    /* renamed from: b  reason: collision with root package name */
    public ArrayList f870b;

    /* renamed from: c  reason: collision with root package name */
    public ArrayList f871c;

    /* renamed from: d  reason: collision with root package name */
    public View.OnApplyWindowInsetsListener f872d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f873e = true;

    public o0(Context context, AttributeSet attrs, m1 fm) {
        super(context, attrs);
        String tagMessage;
        String name = attrs.getClassAttribute();
        TypedArray a2 = context.obtainStyledAttributes(attrs, a.f2471b);
        if (name == null) {
            int[] iArr = a.f2470a;
            name = a2.getString(0);
        }
        int[] iArr2 = a.f2470a;
        String tag = a2.getString(1);
        a2.recycle();
        int id = getId();
        f0 existingFragment = fm.Y(id);
        if (name != null && existingFragment == null) {
            if (id <= 0) {
                if (tag != null) {
                    tagMessage = " with tag " + tag;
                } else {
                    tagMessage = "";
                }
                throw new IllegalStateException("FragmentContainerView must have an android:id to add Fragment " + name + tagMessage);
            }
            f0 containerFragment = fm.h0().a(context.getClassLoader(), name);
            containerFragment.q0(context, attrs, null);
            z1 i2 = fm.i();
            i2.n(true);
            i2.c(this, containerFragment, tag);
            i2.h();
        }
        fm.D0(this);
    }

    @Override // android.view.ViewGroup
    public void setLayoutTransition(LayoutTransition transition) {
        throw new UnsupportedOperationException("FragmentContainerView does not support Layout Transitions or animateLayoutChanges=\"true\".");
    }

    @Override // android.view.View
    public void setOnApplyWindowInsetsListener(View.OnApplyWindowInsetsListener listener) {
        this.f872d = listener;
    }

    @Override // android.view.View
    public WindowInsets onApplyWindowInsets(WindowInsets insets) {
        return insets;
    }

    @Override // android.view.ViewGroup, android.view.View
    public WindowInsets dispatchApplyWindowInsets(WindowInsets insets) {
        x1 dispatchInsets;
        x1 insetsCompat = x1.s(insets);
        View.OnApplyWindowInsetsListener onApplyWindowInsetsListener = this.f872d;
        if (onApplyWindowInsetsListener != null) {
            dispatchInsets = x1.s(onApplyWindowInsetsListener.onApplyWindowInsets(this, insets));
        } else {
            dispatchInsets = c1.X(this, insetsCompat);
        }
        if (!dispatchInsets.l()) {
            int count = getChildCount();
            for (int i2 = 0; i2 < count; i2++) {
                c1.g(getChildAt(i2), dispatchInsets);
            }
        }
        return insets;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        if (this.f873e && this.f870b != null) {
            for (int i2 = 0; i2 < this.f870b.size(); i2++) {
                super.drawChild(canvas, (View) this.f870b.get(i2), getDrawingTime());
            }
        }
        super.dispatchDraw(canvas);
    }

    @Override // android.view.ViewGroup
    public boolean drawChild(Canvas canvas, View child, long drawingTime) {
        ArrayList arrayList;
        if (!this.f873e || (arrayList = this.f870b) == null || arrayList.size() <= 0 || !this.f870b.contains(child)) {
            return super.drawChild(canvas, child, drawingTime);
        }
        return false;
    }

    @Override // android.view.ViewGroup
    public void startViewTransition(View view) {
        if (view.getParent() == this) {
            if (this.f871c == null) {
                this.f871c = new ArrayList();
            }
            this.f871c.add(view);
        }
        super.startViewTransition(view);
    }

    @Override // android.view.ViewGroup
    public void endViewTransition(View view) {
        ArrayList arrayList = this.f871c;
        if (arrayList != null) {
            arrayList.remove(view);
            ArrayList arrayList2 = this.f870b;
            if (arrayList2 != null && arrayList2.remove(view)) {
                this.f873e = true;
            }
        }
        super.endViewTransition(view);
    }

    public void setDrawDisappearingViewsLast(boolean drawDisappearingViewsFirst) {
        this.f873e = drawDisappearingViewsFirst;
    }

    @Override // android.view.ViewGroup
    public void addView(View child, int index, ViewGroup.LayoutParams params) {
        if (m1.p0(child) != null) {
            super.addView(child, index, params);
            return;
        }
        throw new IllegalStateException("Views added to a FragmentContainerView must be associated with a Fragment. View " + child + " is not associated with a Fragment.");
    }

    @Override // android.view.ViewGroup
    public boolean addViewInLayout(View child, int index, ViewGroup.LayoutParams params, boolean preventRequestLayout) {
        if (m1.p0(child) != null) {
            return super.addViewInLayout(child, index, params, preventRequestLayout);
        }
        throw new IllegalStateException("Views added to a FragmentContainerView must be associated with a Fragment. View " + child + " is not associated with a Fragment.");
    }

    @Override // android.view.ViewGroup
    public void removeViewAt(int index) {
        View view = getChildAt(index);
        a(view);
        super.removeViewAt(index);
    }

    @Override // android.view.ViewGroup
    public void removeViewInLayout(View view) {
        a(view);
        super.removeViewInLayout(view);
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public void removeView(View view) {
        a(view);
        super.removeView(view);
    }

    @Override // android.view.ViewGroup
    public void removeViews(int start, int count) {
        for (int i2 = start; i2 < start + count; i2++) {
            View view = getChildAt(i2);
            a(view);
        }
        super.removeViews(start, count);
    }

    @Override // android.view.ViewGroup
    public void removeViewsInLayout(int start, int count) {
        for (int i2 = start; i2 < start + count; i2++) {
            View view = getChildAt(i2);
            a(view);
        }
        super.removeViewsInLayout(start, count);
    }

    @Override // android.view.ViewGroup
    public void removeAllViewsInLayout() {
        for (int i2 = getChildCount() - 1; i2 >= 0; i2--) {
            View view = getChildAt(i2);
            a(view);
        }
        super.removeAllViewsInLayout();
    }

    @Override // android.view.ViewGroup
    public void removeDetachedView(View child, boolean animate) {
        if (animate) {
            a(child);
        }
        super.removeDetachedView(child, animate);
    }

    public final void a(View v2) {
        ArrayList arrayList = this.f871c;
        if (arrayList != null && arrayList.contains(v2)) {
            if (this.f870b == null) {
                this.f870b = new ArrayList();
            }
            this.f870b.add(v2);
        }
    }
}
