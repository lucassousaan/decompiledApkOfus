package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.SeekBar;
import c.a;
import f0.c1;

/* JADX WARN: Classes with same name are omitted:
  
 */
/* loaded from: classes.dex */
public class s0 extends l0 {

    /* renamed from: d  reason: collision with root package name */
    public final SeekBar f513d;

    /* renamed from: e  reason: collision with root package name */
    public Drawable f514e;

    /* renamed from: f  reason: collision with root package name */
    public ColorStateList f515f = null;

    /* renamed from: g  reason: collision with root package name */
    public PorterDuff.Mode f516g = null;

    /* renamed from: h  reason: collision with root package name */
    public boolean f517h = false;

    /* renamed from: i  reason: collision with root package name */
    public boolean f518i = false;

    public s0(SeekBar view) {
        super(view);
        this.f513d = view;
    }

    @Override // androidx.appcompat.widget.l0
    public void c(AttributeSet attrs, int defStyleAttr) {
        super.c(attrs, defStyleAttr);
        Context context = this.f513d.getContext();
        int[] iArr = a.f1173g;
        s3 a2 = s3.v(context, attrs, iArr, defStyleAttr, 0);
        SeekBar seekBar = this.f513d;
        c1.j0(seekBar, seekBar.getContext(), iArr, attrs, a2.r(), defStyleAttr, 0);
        int[] iArr2 = a.f1167a;
        Drawable drawable = a2.h(0);
        if (drawable != null) {
            this.f513d.setThumb(drawable);
        }
        Drawable tickMark = a2.g(1);
        j(tickMark);
        if (a2.s(3)) {
            this.f516g = s1.c(a2.k(3, -1), this.f516g);
            this.f518i = true;
        }
        if (a2.s(2)) {
            this.f515f = a2.c(2);
            this.f517h = true;
        }
        a2.w();
        f();
    }

    public void j(Drawable tickMark) {
        Drawable drawable = this.f514e;
        if (drawable != null) {
            drawable.setCallback(null);
        }
        this.f514e = tickMark;
        if (tickMark != null) {
            tickMark.setCallback(this.f513d);
            y.a.g(tickMark, c1.A(this.f513d));
            if (tickMark.isStateful()) {
                tickMark.setState(this.f513d.getDrawableState());
            }
            f();
        }
        this.f513d.invalidate();
    }

    public final void f() {
        Drawable drawable = this.f514e;
        if (drawable == null) {
            return;
        }
        if (this.f517h || this.f518i) {
            Drawable mutate = drawable.mutate();
            y.a.l(mutate);
            this.f514e = mutate;
            if (this.f517h) {
                y.a.i(mutate, this.f515f);
            }
            if (this.f518i) {
                y.a.j(this.f514e, this.f516g);
            }
            if (this.f514e.isStateful()) {
                this.f514e.setState(this.f513d.getDrawableState());
            }
        }
    }

    public void i() {
        Drawable drawable = this.f514e;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    public void h() {
        Drawable tickMark = this.f514e;
        if (tickMark != null && tickMark.isStateful() && tickMark.setState(this.f513d.getDrawableState())) {
            this.f513d.invalidateDrawable(tickMark);
        }
    }

    public void g(Canvas canvas) {
        if (this.f514e != null) {
            int count = this.f513d.getMax();
            int halfH = 1;
            if (count > 1) {
                int w2 = this.f514e.getIntrinsicWidth();
                int h2 = this.f514e.getIntrinsicHeight();
                int halfW = w2 >= 0 ? w2 / 2 : 1;
                if (h2 >= 0) {
                    halfH = h2 / 2;
                }
                this.f514e.setBounds(-halfW, -halfH, halfW, halfH);
                float spacing = ((this.f513d.getWidth() - this.f513d.getPaddingLeft()) - this.f513d.getPaddingRight()) / count;
                int saveCount = canvas.save();
                canvas.translate(this.f513d.getPaddingLeft(), this.f513d.getHeight() / 2);
                for (int i2 = 0; i2 <= count; i2++) {
                    this.f514e.draw(canvas);
                    canvas.translate(spacing, 0.0f);
                }
                canvas.restoreToCount(saveCount);
            }
        }
    }
}
