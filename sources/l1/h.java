package l1;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.Gravity;
import androidx.appcompat.widget.b2;
import v0.a;

/* JADX WARN: Classes with same name are omitted:
  
 */
/* loaded from: classes.dex */
public abstract class h extends b2 {

    /* renamed from: q  reason: collision with root package name */
    public Drawable f2434q;

    /* renamed from: t  reason: collision with root package name */
    public int f2437t;

    /* renamed from: u  reason: collision with root package name */
    public boolean f2438u;

    /* renamed from: r  reason: collision with root package name */
    public final Rect f2435r = new Rect();

    /* renamed from: s  reason: collision with root package name */
    public final Rect f2436s = new Rect();

    /* renamed from: v  reason: collision with root package name */
    public boolean f2439v = false;

    public h(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
        this.f2437t = 119;
        this.f2438u = true;
        TypedArray a2 = q.h(context, attrs, a.f3612i, defStyle, 0, new int[0]);
        int[] iArr = a.f3604a;
        this.f2437t = a2.getInt(1, this.f2437t);
        Drawable d2 = a2.getDrawable(0);
        if (d2 != null) {
            setForeground(d2);
        }
        this.f2438u = a2.getBoolean(2, true);
        a2.recycle();
    }

    @Override // android.view.View
    public int getForegroundGravity() {
        return this.f2437t;
    }

    @Override // android.view.View
    public void setForegroundGravity(int foregroundGravity) {
        if (this.f2437t != foregroundGravity) {
            if ((8388615 & foregroundGravity) == 0) {
                foregroundGravity |= 8388611;
            }
            if ((foregroundGravity & 112) == 0) {
                foregroundGravity |= 48;
            }
            this.f2437t = foregroundGravity;
            if (foregroundGravity == 119 && this.f2434q != null) {
                Rect padding = new Rect();
                this.f2434q.getPadding(padding);
            }
            requestLayout();
        }
    }

    @Override // android.view.View
    public boolean verifyDrawable(Drawable who) {
        return super.verifyDrawable(who) || who == this.f2434q;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f2434q;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.f2434q;
        if (drawable != null && drawable.isStateful()) {
            this.f2434q.setState(getDrawableState());
        }
    }

    @Override // android.view.View
    public void setForeground(Drawable drawable) {
        Drawable drawable2 = this.f2434q;
        if (drawable2 != drawable) {
            if (drawable2 != null) {
                drawable2.setCallback(null);
                unscheduleDrawable(this.f2434q);
            }
            this.f2434q = drawable;
            if (drawable != null) {
                setWillNotDraw(false);
                drawable.setCallback(this);
                if (drawable.isStateful()) {
                    drawable.setState(getDrawableState());
                }
                if (this.f2437t == 119) {
                    Rect padding = new Rect();
                    drawable.getPadding(padding);
                }
            } else {
                setWillNotDraw(true);
            }
            requestLayout();
            invalidate();
        }
    }

    @Override // android.view.View
    public Drawable getForeground() {
        return this.f2434q;
    }

    @Override // androidx.appcompat.widget.b2, android.view.ViewGroup, android.view.View
    public void onLayout(boolean changed, int left, int top, int right, int bottom) {
        super.onLayout(changed, left, top, right, bottom);
        this.f2439v |= changed;
    }

    @Override // android.view.View
    public void onSizeChanged(int w2, int h2, int oldw, int oldh) {
        super.onSizeChanged(w2, h2, oldw, oldh);
        this.f2439v = true;
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        super.draw(canvas);
        if (this.f2434q != null) {
            Drawable foreground = this.f2434q;
            if (this.f2439v) {
                this.f2439v = false;
                Rect selfBounds = this.f2435r;
                Rect overlayBounds = this.f2436s;
                int w2 = getRight() - getLeft();
                int h2 = getBottom() - getTop();
                if (this.f2438u) {
                    selfBounds.set(0, 0, w2, h2);
                } else {
                    selfBounds.set(getPaddingLeft(), getPaddingTop(), w2 - getPaddingRight(), h2 - getPaddingBottom());
                }
                Gravity.apply(this.f2437t, foreground.getIntrinsicWidth(), foreground.getIntrinsicHeight(), selfBounds, overlayBounds);
                foreground.setBounds(overlayBounds);
            }
            foreground.draw(canvas);
        }
    }

    @Override // android.view.View
    public void drawableHotspotChanged(float x2, float y2) {
        super.drawableHotspotChanged(x2, y2);
        Drawable drawable = this.f2434q;
        if (drawable != null) {
            drawable.setHotspot(x2, y2);
        }
    }
}
