package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.View;
import android.widget.FrameLayout;
import d.t;
import f0.c1;

/* JADX WARN: Classes with same name are omitted:
  
 */
/* loaded from: classes.dex */
public class ContentFrameLayout extends FrameLayout {

    /* renamed from: b  reason: collision with root package name */
    public TypedValue f155b;

    /* renamed from: c  reason: collision with root package name */
    public TypedValue f156c;

    /* renamed from: d  reason: collision with root package name */
    public TypedValue f157d;

    /* renamed from: e  reason: collision with root package name */
    public TypedValue f158e;

    /* renamed from: f  reason: collision with root package name */
    public TypedValue f159f;

    /* renamed from: g  reason: collision with root package name */
    public TypedValue f160g;

    /* renamed from: h  reason: collision with root package name */
    public final Rect f161h;

    /* renamed from: i  reason: collision with root package name */
    public p1 f162i;

    public ContentFrameLayout(Context context) {
        this(context, null);
    }

    public ContentFrameLayout(Context context, AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public ContentFrameLayout(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        this.f161h = new Rect();
    }

    public void setAttachListener(p1 attachListener) {
        this.f162i = attachListener;
    }

    public void a(int left, int top, int right, int bottom) {
        this.f161h.set(left, top, right, bottom);
        if (c1.P(this)) {
            requestLayout();
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        int i2;
        int i3;
        int i4;
        DisplayMetrics metrics = getContext().getResources().getDisplayMetrics();
        boolean isPortrait = metrics.widthPixels < metrics.heightPixels;
        int widthMode = View.MeasureSpec.getMode(widthMeasureSpec);
        int heightMode = View.MeasureSpec.getMode(heightMeasureSpec);
        boolean fixedWidth = false;
        if (widthMode == Integer.MIN_VALUE) {
            TypedValue tvw = isPortrait ? this.f158e : this.f157d;
            if (!(tvw == null || (i4 = tvw.type) == 0)) {
                int w2 = 0;
                if (i4 == 5) {
                    w2 = (int) tvw.getDimension(metrics);
                } else if (i4 == 6) {
                    int i5 = metrics.widthPixels;
                    w2 = (int) tvw.getFraction(i5, i5);
                }
                if (w2 > 0) {
                    Rect rect = this.f161h;
                    int widthSize = View.MeasureSpec.getSize(widthMeasureSpec);
                    widthMeasureSpec = View.MeasureSpec.makeMeasureSpec(Math.min(w2 - (rect.left + rect.right), widthSize), 1073741824);
                    fixedWidth = true;
                }
            }
        }
        if (heightMode == Integer.MIN_VALUE) {
            TypedValue tvh = isPortrait ? this.f159f : this.f160g;
            if (!(tvh == null || (i3 = tvh.type) == 0)) {
                int h2 = 0;
                if (i3 == 5) {
                    h2 = (int) tvh.getDimension(metrics);
                } else if (i3 == 6) {
                    int i6 = metrics.heightPixels;
                    h2 = (int) tvh.getFraction(i6, i6);
                }
                if (h2 > 0) {
                    Rect rect2 = this.f161h;
                    int heightSize = View.MeasureSpec.getSize(heightMeasureSpec);
                    heightMeasureSpec = View.MeasureSpec.makeMeasureSpec(Math.min(h2 - (rect2.top + rect2.bottom), heightSize), 1073741824);
                }
            }
        }
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        int width = getMeasuredWidth();
        boolean measure = false;
        int widthMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(width, 1073741824);
        if (!fixedWidth && widthMode == Integer.MIN_VALUE) {
            TypedValue tv = isPortrait ? this.f156c : this.f155b;
            if (!(tv == null || (i2 = tv.type) == 0)) {
                int min = 0;
                if (i2 == 5) {
                    min = (int) tv.getDimension(metrics);
                } else if (i2 == 6) {
                    int i7 = metrics.widthPixels;
                    min = (int) tv.getFraction(i7, i7);
                }
                if (min > 0) {
                    Rect rect3 = this.f161h;
                    min -= rect3.left + rect3.right;
                }
                if (width < min) {
                    widthMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(min, 1073741824);
                    measure = true;
                }
            }
        }
        if (measure) {
            super.onMeasure(widthMeasureSpec2, heightMeasureSpec);
        }
    }

    public TypedValue getMinWidthMajor() {
        if (this.f155b == null) {
            this.f155b = new TypedValue();
        }
        return this.f155b;
    }

    public TypedValue getMinWidthMinor() {
        if (this.f156c == null) {
            this.f156c = new TypedValue();
        }
        return this.f156c;
    }

    public TypedValue getFixedWidthMajor() {
        if (this.f157d == null) {
            this.f157d = new TypedValue();
        }
        return this.f157d;
    }

    public TypedValue getFixedWidthMinor() {
        if (this.f158e == null) {
            this.f158e = new TypedValue();
        }
        return this.f158e;
    }

    public TypedValue getFixedHeightMajor() {
        if (this.f159f == null) {
            this.f159f = new TypedValue();
        }
        return this.f159f;
    }

    public TypedValue getFixedHeightMinor() {
        if (this.f160g == null) {
            this.f160g = new TypedValue();
        }
        return this.f160g;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        p1 p1Var = this.f162i;
        if (p1Var != null) {
            ((t) p1Var).a();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        p1 p1Var = this.f162i;
        if (p1Var != null) {
            ((t) p1Var).b();
        }
    }
}
