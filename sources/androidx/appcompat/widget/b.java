package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import c.a;
import com.example.helloworld.R;
import f0.c1;
import f0.h1;

/* JADX WARN: Classes with same name are omitted:
  
 */
/* loaded from: classes.dex */
public abstract class b extends ViewGroup {

    /* renamed from: b  reason: collision with root package name */
    public final a f235b = new a(this);

    /* renamed from: c  reason: collision with root package name */
    public final Context f236c;

    /* renamed from: d  reason: collision with root package name */
    public ActionMenuView f237d;

    /* renamed from: e  reason: collision with root package name */
    public q f238e;

    /* renamed from: f  reason: collision with root package name */
    public int f239f;

    /* renamed from: g  reason: collision with root package name */
    public h1 f240g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f241h;

    /* renamed from: i  reason: collision with root package name */
    public boolean f242i;

    public abstract void setContentHeight(int i2);

    public b(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
        TypedValue tv = new TypedValue();
        if (!context.getTheme().resolveAttribute(R.attr.actionBarPopupTheme, tv, true) || tv.resourceId == 0) {
            this.f236c = context;
        } else {
            this.f236c = new ContextThemeWrapper(context, tv.resourceId);
        }
    }

    @Override // android.view.View
    public void onConfigurationChanged(Configuration newConfig) {
        super.onConfigurationChanged(newConfig);
        TypedArray a2 = getContext().obtainStyledAttributes(null, a.f1167a, R.attr.actionBarStyle, 0);
        int[] iArr = a.f1167a;
        setContentHeight(a2.getLayoutDimension(13, 0));
        a2.recycle();
        q qVar = this.f238e;
        if (qVar != null) {
            qVar.F();
        }
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent ev) {
        int action = ev.getActionMasked();
        if (action == 0) {
            this.f241h = false;
        }
        if (!this.f241h) {
            boolean handled = super.onTouchEvent(ev);
            if (action == 0 && !handled) {
                this.f241h = true;
            }
        }
        if (action == 1 || action == 3) {
            this.f241h = false;
        }
        return true;
    }

    @Override // android.view.View
    public boolean onHoverEvent(MotionEvent ev) {
        int action = ev.getActionMasked();
        if (action == 9) {
            this.f242i = false;
        }
        if (!this.f242i) {
            boolean handled = super.onHoverEvent(ev);
            if (action == 9 && !handled) {
                this.f242i = true;
            }
        }
        if (action == 10 || action == 3) {
            this.f242i = false;
        }
        return true;
    }

    public int getContentHeight() {
        return this.f239f;
    }

    public int getAnimatedVisibility() {
        if (this.f240g != null) {
            return this.f235b.f228b;
        }
        return getVisibility();
    }

    public h1 f(int visibility, long duration) {
        h1 h1Var = this.f240g;
        if (h1Var != null) {
            h1Var.b();
        }
        if (visibility == 0) {
            if (getVisibility() != 0) {
                setAlpha(0.0f);
            }
            h1 anim = c1.e(this).a(1.0f);
            anim.d(duration);
            a aVar = this.f235b;
            aVar.d(anim, visibility);
            anim.f(aVar);
            return anim;
        }
        h1 anim2 = c1.e(this).a(0.0f);
        anim2.d(duration);
        a aVar2 = this.f235b;
        aVar2.d(anim2, visibility);
        anim2.f(aVar2);
        return anim2;
    }

    @Override // android.view.View
    public void setVisibility(int visibility) {
        if (visibility != getVisibility()) {
            h1 h1Var = this.f240g;
            if (h1Var != null) {
                h1Var.b();
            }
            super.setVisibility(visibility);
        }
    }

    public int c(View child, int availableWidth, int childSpecHeight, int spacing) {
        child.measure(View.MeasureSpec.makeMeasureSpec(availableWidth, Integer.MIN_VALUE), childSpecHeight);
        return Math.max(0, (availableWidth - child.getMeasuredWidth()) - spacing);
    }

    public static int d(int x2, int val, boolean isRtl) {
        return isRtl ? x2 - val : x2 + val;
    }

    public int e(View child, int x2, int y2, int contentHeight, boolean reverse) {
        int childWidth = child.getMeasuredWidth();
        int childHeight = child.getMeasuredHeight();
        int childTop = ((contentHeight - childHeight) / 2) + y2;
        if (reverse) {
            child.layout(x2 - childWidth, childTop, x2, childTop + childHeight);
        } else {
            child.layout(x2, childTop, x2 + childWidth, childTop + childHeight);
        }
        return reverse ? -childWidth : childWidth;
    }
}
