package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import c.a;
import com.example.helloworld.R;
import f0.c1;

/* JADX WARN: Classes with same name are omitted:
  
 */
/* loaded from: classes.dex */
public class ActionBarContainer extends FrameLayout {

    /* renamed from: b  reason: collision with root package name */
    public boolean f94b;

    /* renamed from: c  reason: collision with root package name */
    public View f95c;

    /* renamed from: d  reason: collision with root package name */
    public View f96d;

    /* renamed from: e  reason: collision with root package name */
    public View f97e;

    /* renamed from: f  reason: collision with root package name */
    public Drawable f98f;

    /* renamed from: g  reason: collision with root package name */
    public Drawable f99g;

    /* renamed from: h  reason: collision with root package name */
    public Drawable f100h;

    /* renamed from: i  reason: collision with root package name */
    public boolean f101i;

    /* renamed from: j  reason: collision with root package name */
    public boolean f102j;

    /* renamed from: k  reason: collision with root package name */
    public int f103k;

    public ActionBarContainer(Context context, AttributeSet attrs) {
        super(context, attrs);
        Drawable bg = new c(this);
        c1.o0(this, bg);
        TypedArray a2 = context.obtainStyledAttributes(attrs, a.f1167a);
        int[] iArr = a.f1167a;
        boolean z2 = false;
        this.f98f = a2.getDrawable(0);
        this.f99g = a2.getDrawable(2);
        this.f103k = a2.getDimensionPixelSize(13, -1);
        if (getId() == R.id.split_action_bar) {
            this.f101i = true;
            this.f100h = a2.getDrawable(1);
        }
        a2.recycle();
        if (this.f101i) {
            if (this.f100h == null) {
                z2 = true;
            }
        } else if (this.f98f == null && this.f99g == null) {
            z2 = true;
        }
        setWillNotDraw(z2);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        this.f96d = findViewById(R.id.action_bar);
        this.f97e = findViewById(R.id.action_context_bar);
    }

    public void setPrimaryBackground(Drawable bg) {
        Drawable drawable = this.f98f;
        if (drawable != null) {
            drawable.setCallback(null);
            unscheduleDrawable(this.f98f);
        }
        this.f98f = bg;
        if (bg != null) {
            bg.setCallback(this);
            View view = this.f96d;
            if (view != null) {
                this.f98f.setBounds(view.getLeft(), this.f96d.getTop(), this.f96d.getRight(), this.f96d.getBottom());
            }
        }
        boolean z2 = true;
        if (this.f101i) {
            if (this.f100h != null) {
                z2 = false;
            }
        } else if (!(this.f98f == null && this.f99g == null)) {
            z2 = false;
        }
        setWillNotDraw(z2);
        invalidate();
        invalidateOutline();
    }

    public void setStackedBackground(Drawable bg) {
        Drawable drawable;
        Drawable drawable2 = this.f99g;
        if (drawable2 != null) {
            drawable2.setCallback(null);
            unscheduleDrawable(this.f99g);
        }
        this.f99g = bg;
        if (bg != null) {
            bg.setCallback(this);
            if (this.f102j && (drawable = this.f99g) != null) {
                drawable.setBounds(this.f95c.getLeft(), this.f95c.getTop(), this.f95c.getRight(), this.f95c.getBottom());
            }
        }
        boolean z2 = true;
        if (this.f101i) {
            if (this.f100h != null) {
                z2 = false;
            }
        } else if (!(this.f98f == null && this.f99g == null)) {
            z2 = false;
        }
        setWillNotDraw(z2);
        invalidate();
        invalidateOutline();
    }

    public void setSplitBackground(Drawable bg) {
        Drawable drawable;
        Drawable drawable2 = this.f100h;
        if (drawable2 != null) {
            drawable2.setCallback(null);
            unscheduleDrawable(this.f100h);
        }
        this.f100h = bg;
        boolean z2 = false;
        if (bg != null) {
            bg.setCallback(this);
            if (this.f101i && (drawable = this.f100h) != null) {
                drawable.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            }
        }
        if (this.f101i) {
            if (this.f100h == null) {
                z2 = true;
            }
        } else if (this.f98f == null && this.f99g == null) {
            z2 = true;
        }
        setWillNotDraw(z2);
        invalidate();
        invalidateOutline();
    }

    @Override // android.view.View
    public void setVisibility(int visibility) {
        super.setVisibility(visibility);
        boolean isVisible = visibility == 0;
        Drawable drawable = this.f98f;
        if (drawable != null) {
            drawable.setVisible(isVisible, false);
        }
        Drawable drawable2 = this.f99g;
        if (drawable2 != null) {
            drawable2.setVisible(isVisible, false);
        }
        Drawable drawable3 = this.f100h;
        if (drawable3 != null) {
            drawable3.setVisible(isVisible, false);
        }
    }

    @Override // android.view.View
    public boolean verifyDrawable(Drawable who) {
        return (who == this.f98f && !this.f101i) || (who == this.f99g && this.f102j) || ((who == this.f100h && this.f101i) || super.verifyDrawable(who));
    }

    @Override // android.view.ViewGroup, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.f98f;
        if (drawable != null && drawable.isStateful()) {
            this.f98f.setState(getDrawableState());
        }
        Drawable drawable2 = this.f99g;
        if (drawable2 != null && drawable2.isStateful()) {
            this.f99g.setState(getDrawableState());
        }
        Drawable drawable3 = this.f100h;
        if (drawable3 != null && drawable3.isStateful()) {
            this.f100h.setState(getDrawableState());
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f98f;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
        Drawable drawable2 = this.f99g;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
        }
        Drawable drawable3 = this.f100h;
        if (drawable3 != null) {
            drawable3.jumpToCurrentState();
        }
    }

    public void setTransitioning(boolean isTransitioning) {
        this.f94b = isTransitioning;
        setDescendantFocusability(isTransitioning ? 393216 : 262144);
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent ev) {
        return this.f94b || super.onInterceptTouchEvent(ev);
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent ev) {
        super.onTouchEvent(ev);
        return true;
    }

    @Override // android.view.View
    public boolean onHoverEvent(MotionEvent ev) {
        super.onHoverEvent(ev);
        return true;
    }

    public void setTabContainer(t2 tabView) {
        View view = this.f95c;
        if (view != null) {
            removeView(view);
        }
        this.f95c = tabView;
        if (tabView != null) {
            addView(tabView);
            ViewGroup.LayoutParams lp = tabView.getLayoutParams();
            lp.width = -1;
            lp.height = -2;
            tabView.a(false);
        }
    }

    public View getTabContainer() {
        return this.f95c;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public ActionMode startActionModeForChild(View child, ActionMode.Callback callback) {
        return null;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public ActionMode startActionModeForChild(View child, ActionMode.Callback callback, int type) {
        if (type != 0) {
            return super.startActionModeForChild(child, callback, type);
        }
        return null;
    }

    public final boolean b(View view) {
        return view == null || view.getVisibility() == 8 || view.getMeasuredHeight() == 0;
    }

    public final int a(View view) {
        FrameLayout.LayoutParams lp = (FrameLayout.LayoutParams) view.getLayoutParams();
        return view.getMeasuredHeight() + lp.topMargin + lp.bottomMargin;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        int topMarginForTabs;
        int i2;
        if (this.f96d == null && View.MeasureSpec.getMode(heightMeasureSpec) == Integer.MIN_VALUE && (i2 = this.f103k) >= 0) {
            heightMeasureSpec = View.MeasureSpec.makeMeasureSpec(Math.min(i2, View.MeasureSpec.getSize(heightMeasureSpec)), Integer.MIN_VALUE);
        }
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        if (this.f96d != null) {
            int mode = View.MeasureSpec.getMode(heightMeasureSpec);
            View view = this.f95c;
            if (view != null && view.getVisibility() != 8 && mode != 1073741824) {
                if (!b(this.f96d)) {
                    topMarginForTabs = a(this.f96d);
                } else if (!b(this.f97e)) {
                    topMarginForTabs = a(this.f97e);
                } else {
                    topMarginForTabs = 0;
                }
                int maxHeight = mode == Integer.MIN_VALUE ? View.MeasureSpec.getSize(heightMeasureSpec) : Integer.MAX_VALUE;
                setMeasuredDimension(getMeasuredWidth(), Math.min(a(this.f95c) + topMarginForTabs, maxHeight));
            }
        }
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean changed, int l2, int t2, int r2, int b2) {
        Drawable drawable;
        super.onLayout(changed, l2, t2, r2, b2);
        View tabContainer = this.f95c;
        boolean hasTabs = (tabContainer == null || tabContainer.getVisibility() == 8) ? false : true;
        if (!(tabContainer == null || tabContainer.getVisibility() == 8)) {
            int containerHeight = getMeasuredHeight();
            FrameLayout.LayoutParams lp = (FrameLayout.LayoutParams) tabContainer.getLayoutParams();
            int tabHeight = tabContainer.getMeasuredHeight();
            int i2 = lp.bottomMargin;
            tabContainer.layout(l2, (containerHeight - tabHeight) - i2, r2, containerHeight - i2);
        }
        boolean needsInvalidate = false;
        if (this.f101i) {
            Drawable drawable2 = this.f100h;
            if (drawable2 != null) {
                drawable2.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
                needsInvalidate = true;
            }
        } else {
            if (this.f98f != null) {
                if (this.f96d.getVisibility() == 0) {
                    this.f98f.setBounds(this.f96d.getLeft(), this.f96d.getTop(), this.f96d.getRight(), this.f96d.getBottom());
                } else {
                    View view = this.f97e;
                    if (view == null || view.getVisibility() != 0) {
                        this.f98f.setBounds(0, 0, 0, 0);
                    } else {
                        this.f98f.setBounds(this.f97e.getLeft(), this.f97e.getTop(), this.f97e.getRight(), this.f97e.getBottom());
                    }
                }
                needsInvalidate = true;
            }
            this.f102j = hasTabs;
            if (hasTabs && (drawable = this.f99g) != null) {
                drawable.setBounds(tabContainer.getLeft(), tabContainer.getTop(), tabContainer.getRight(), tabContainer.getBottom());
                needsInvalidate = true;
            }
        }
        if (needsInvalidate) {
            invalidate();
        }
    }
}
