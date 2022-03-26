package r1;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import com.example.helloworld.R;
import f0.c1;
import l1.w;
import n1.d;
import t1.a;

/* JADX WARN: Classes with same name are omitted:
  
 */
/* loaded from: classes.dex */
public abstract class e extends FrameLayout {

    /* renamed from: i  reason: collision with root package name */
    public static final View.OnTouchListener f3413i = new d();

    /* renamed from: b  reason: collision with root package name */
    public c f3414b;

    /* renamed from: c  reason: collision with root package name */
    public b f3415c;

    /* renamed from: d  reason: collision with root package name */
    public int f3416d;

    /* renamed from: e  reason: collision with root package name */
    public final float f3417e;

    /* renamed from: f  reason: collision with root package name */
    public final float f3418f;

    /* renamed from: g  reason: collision with root package name */
    public ColorStateList f3419g;

    /* renamed from: h  reason: collision with root package name */
    public PorterDuff.Mode f3420h;

    public e(Context context, AttributeSet attrs) {
        super(a.c(context, attrs, 0, 0), attrs);
        Context context2 = getContext();
        TypedArray a2 = context2.obtainStyledAttributes(attrs, v0.a.f3627x);
        int[] iArr = v0.a.f3604a;
        if (a2.hasValue(6)) {
            c1.r0(this, a2.getDimensionPixelSize(6, 0));
        }
        this.f3416d = a2.getInt(2, 0);
        this.f3417e = a2.getFloat(3, 1.0f);
        setBackgroundTintList(d.a(context2, a2, 4));
        setBackgroundTintMode(w.e(a2.getInt(5, -1), PorterDuff.Mode.SRC_IN));
        this.f3418f = a2.getFloat(1, 1.0f);
        a2.recycle();
        setOnTouchListener(f3413i);
        setFocusable(true);
        if (getBackground() == null) {
            c1.o0(this, a());
        }
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        setBackgroundDrawable(drawable);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        if (!(drawable == null || this.f3419g == null)) {
            drawable = y.a.l(drawable.mutate());
            y.a.i(drawable, this.f3419g);
            y.a.j(drawable, this.f3420h);
        }
        super.setBackgroundDrawable(drawable);
    }

    @Override // android.view.View
    public void setBackgroundTintList(ColorStateList backgroundTint) {
        this.f3419g = backgroundTint;
        if (getBackground() != null) {
            Drawable wrappedBackground = y.a.l(getBackground().mutate());
            y.a.i(wrappedBackground, backgroundTint);
            y.a.j(wrappedBackground, this.f3420h);
            if (wrappedBackground != getBackground()) {
                super.setBackgroundDrawable(wrappedBackground);
            }
        }
    }

    @Override // android.view.View
    public void setBackgroundTintMode(PorterDuff.Mode backgroundTintMode) {
        this.f3420h = backgroundTintMode;
        if (getBackground() != null) {
            Drawable wrappedBackground = y.a.l(getBackground().mutate());
            y.a.j(wrappedBackground, backgroundTintMode);
            if (wrappedBackground != getBackground()) {
                super.setBackgroundDrawable(wrappedBackground);
            }
        }
    }

    @Override // android.view.View
    public void setOnClickListener(View.OnClickListener onClickListener) {
        setOnTouchListener(onClickListener != null ? null : f3413i);
        super.setOnClickListener(onClickListener);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean changed, int l2, int t2, int r2, int b2) {
        super.onLayout(changed, l2, t2, r2, b2);
        c cVar = this.f3414b;
        if (cVar != null) {
            cVar.a(this, l2, t2, r2, b2);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        b bVar = this.f3415c;
        if (bVar != null) {
            bVar.onViewAttachedToWindow(this);
        }
        c1.i0(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        b bVar = this.f3415c;
        if (bVar != null) {
            bVar.onViewDetachedFromWindow(this);
        }
    }

    public void setOnLayoutChangeListener(c onLayoutChangeListener) {
        this.f3414b = onLayoutChangeListener;
    }

    public void setOnAttachStateChangeListener(b listener) {
        this.f3415c = listener;
    }

    public int getAnimationMode() {
        return this.f3416d;
    }

    public void setAnimationMode(int animationMode) {
        this.f3416d = animationMode;
    }

    public float getBackgroundOverlayColorAlpha() {
        return this.f3417e;
    }

    public float getActionTextColorAlpha() {
        return this.f3418f;
    }

    public final Drawable a() {
        float cornerRadius = getResources().getDimension(R.dimen.mtrl_snackbar_background_corner_radius);
        GradientDrawable background = new GradientDrawable();
        background.setShape(0);
        background.setCornerRadius(cornerRadius);
        int backgroundColor = f1.a.g(this, R.attr.colorSurface, R.attr.colorOnSurface, getBackgroundOverlayColorAlpha());
        background.setColor(backgroundColor);
        if (this.f3419g != null) {
            Drawable wrappedDrawable = y.a.l(background);
            y.a.i(wrappedDrawable, this.f3419g);
            return wrappedDrawable;
        }
        y.a.l(background);
        return background;
    }
}
