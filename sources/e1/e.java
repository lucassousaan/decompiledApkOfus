package e1;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.text.TextUtils;
import android.util.AttributeSet;
import com.google.android.material.chip.Chip;
import d0.c;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import l1.n;
import l1.o;
import l1.q;
import l1.w;
import n1.g;
import o1.a;
import q1.j;
import w0.d;

/* JADX WARN: Classes with same name are omitted:
  
 */
/* loaded from: classes.dex */
public class e extends j implements Drawable.Callback, n {
    public static final int[] J0 = {16842910};
    public static final ShapeDrawable K0 = new ShapeDrawable(new OvalShape());
    public ColorStateList A;
    public float B;
    public int[] B0;
    public boolean C0;
    public ColorStateList D;
    public ColorStateList D0;
    public float E;
    public ColorStateList F;
    public TextUtils.TruncateAt F0;
    public boolean H;
    public int H0;
    public Drawable I;
    public boolean I0;
    public ColorStateList J;
    public float K;
    public boolean L;
    public boolean M;
    public Drawable N;
    public Drawable O;
    public ColorStateList P;
    public float Q;
    public CharSequence R;
    public boolean S;
    public boolean T;
    public Drawable U;
    public ColorStateList V;
    public d W;
    public d X;
    public float Y;
    public float Z;

    /* renamed from: a0  reason: collision with root package name */
    public float f1812a0;

    /* renamed from: b0  reason: collision with root package name */
    public float f1813b0;

    /* renamed from: c0  reason: collision with root package name */
    public float f1814c0;

    /* renamed from: d0  reason: collision with root package name */
    public float f1815d0;

    /* renamed from: e0  reason: collision with root package name */
    public float f1816e0;

    /* renamed from: f0  reason: collision with root package name */
    public float f1817f0;

    /* renamed from: g0  reason: collision with root package name */
    public final Context f1818g0;

    /* renamed from: n0  reason: collision with root package name */
    public final o f1825n0;

    /* renamed from: o0  reason: collision with root package name */
    public int f1826o0;

    /* renamed from: p0  reason: collision with root package name */
    public int f1827p0;

    /* renamed from: q0  reason: collision with root package name */
    public int f1828q0;

    /* renamed from: r0  reason: collision with root package name */
    public int f1829r0;

    /* renamed from: s0  reason: collision with root package name */
    public int f1830s0;

    /* renamed from: t0  reason: collision with root package name */
    public int f1831t0;

    /* renamed from: u0  reason: collision with root package name */
    public boolean f1832u0;

    /* renamed from: v0  reason: collision with root package name */
    public int f1833v0;

    /* renamed from: x0  reason: collision with root package name */
    public ColorFilter f1835x0;

    /* renamed from: y0  reason: collision with root package name */
    public PorterDuffColorFilter f1836y0;

    /* renamed from: z  reason: collision with root package name */
    public ColorStateList f1837z;

    /* renamed from: z0  reason: collision with root package name */
    public ColorStateList f1838z0;
    public float C = -1.0f;

    /* renamed from: h0  reason: collision with root package name */
    public final Paint f1819h0 = new Paint(1);

    /* renamed from: j0  reason: collision with root package name */
    public final Paint.FontMetrics f1821j0 = new Paint.FontMetrics();

    /* renamed from: k0  reason: collision with root package name */
    public final RectF f1822k0 = new RectF();

    /* renamed from: l0  reason: collision with root package name */
    public final PointF f1823l0 = new PointF();

    /* renamed from: m0  reason: collision with root package name */
    public final Path f1824m0 = new Path();

    /* renamed from: w0  reason: collision with root package name */
    public int f1834w0 = 255;
    public PorterDuff.Mode A0 = PorterDuff.Mode.SRC_IN;
    public WeakReference E0 = new WeakReference(null);
    public CharSequence G = "";

    /* renamed from: i0  reason: collision with root package name */
    public final Paint f1820i0 = null;
    public boolean G0 = true;

    public static e o0(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        e chip = new e(context, attrs, defStyleAttr, defStyleRes);
        chip.n1(attrs, defStyleAttr, defStyleRes);
        return chip;
    }

    public e(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
        J(context);
        this.f1818g0 = context;
        o oVar = new o(this);
        this.f1825n0 = oVar;
        oVar.e().density = context.getResources().getDisplayMetrics().density;
        int[] iArr = J0;
        setState(iArr);
        f2(iArr);
        boolean z2 = a.f2694a;
        K0.setTint(-1);
    }

    public final void n1(AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        TypedArray a2 = q.h(this.f1818g0, attrs, v0.a.f3605b, defStyleAttr, defStyleRes, new int[0]);
        int[] iArr = v0.a.f3604a;
        this.I0 = a2.hasValue(37);
        V1(n1.d.a(this.f1818g0, a2, 24));
        z1(n1.d.a(this.f1818g0, a2, 11));
        N1(a2.getDimension(19, 0.0f));
        if (a2.hasValue(12)) {
            B1(a2.getDimension(12, 0.0f));
        }
        R1(n1.d.a(this.f1818g0, a2, 22));
        T1(a2.getDimension(23, 0.0f));
        s2(n1.d.a(this.f1818g0, a2, 36));
        x2(a2.getText(5));
        g textAppearance = n1.d.f(this.f1818g0, a2, 0);
        float textSize = a2.getDimension(1, textAppearance.f2577k);
        textAppearance.f2577k = textSize;
        y2(textAppearance);
        int ellipsize = a2.getInt(3, 0);
        switch (ellipsize) {
            case 1:
                k2(TextUtils.TruncateAt.START);
                break;
            case 2:
                k2(TextUtils.TruncateAt.MIDDLE);
                break;
            case 3:
                k2(TextUtils.TruncateAt.END);
                break;
        }
        M1(a2.getBoolean(18, false));
        if (!(attrs == null || attrs.getAttributeValue("http://schemas.android.com/apk/res-auto", "chipIconEnabled") == null || attrs.getAttributeValue("http://schemas.android.com/apk/res-auto", "chipIconVisible") != null)) {
            M1(a2.getBoolean(15, false));
        }
        F1(n1.d.d(this.f1818g0, a2, 14));
        if (a2.hasValue(17)) {
            J1(n1.d.a(this.f1818g0, a2, 17));
        }
        H1(a2.getDimension(16, -1.0f));
        i2(a2.getBoolean(31, false));
        if (!(attrs == null || attrs.getAttributeValue("http://schemas.android.com/apk/res-auto", "closeIconEnabled") == null || attrs.getAttributeValue("http://schemas.android.com/apk/res-auto", "closeIconVisible") != null)) {
            i2(a2.getBoolean(26, false));
        }
        W1(n1.d.d(this.f1818g0, a2, 25));
        g2(n1.d.a(this.f1818g0, a2, 30));
        b2(a2.getDimension(28, 0.0f));
        r1(a2.getBoolean(6, false));
        y1(a2.getBoolean(10, false));
        if (!(attrs == null || attrs.getAttributeValue("http://schemas.android.com/apk/res-auto", "checkedIconEnabled") == null || attrs.getAttributeValue("http://schemas.android.com/apk/res-auto", "checkedIconVisible") != null)) {
            y1(a2.getBoolean(8, false));
        }
        t1(n1.d.d(this.f1818g0, a2, 7));
        if (a2.hasValue(9)) {
            v1(n1.d.a(this.f1818g0, a2, 9));
        }
        v2(d.b(this.f1818g0, a2, 39));
        l2(d.b(this.f1818g0, a2, 33));
        P1(a2.getDimension(21, 0.0f));
        p2(a2.getDimension(35, 0.0f));
        n2(a2.getDimension(34, 0.0f));
        C2(a2.getDimension(41, 0.0f));
        A2(a2.getDimension(40, 0.0f));
        d2(a2.getDimension(29, 0.0f));
        Y1(a2.getDimension(27, 0.0f));
        D1(a2.getDimension(13, 0.0f));
        r2(a2.getDimensionPixelSize(4, Integer.MAX_VALUE));
        a2.recycle();
    }

    public void E2(boolean useCompatRipple) {
        if (this.C0 != useCompatRipple) {
            this.C0 = useCompatRipple;
            K2();
            onStateChange(getState());
        }
    }

    public boolean f1() {
        return this.C0;
    }

    public void j2(d delegate) {
        this.E0 = new WeakReference(delegate);
    }

    public void o1() {
        d delegate = (d) this.E0.get();
        if (delegate != null) {
            ((Chip) delegate).r();
        }
    }

    public void R0(RectF bounds) {
        i0(getBounds(), bounds);
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        int calculatedWidth = Math.round(this.Y + g0() + this.f1813b0 + this.f1825n0.f(a1().toString()) + this.f1814c0 + j0() + this.f1817f0);
        return Math.min(calculatedWidth, this.H0);
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return (int) this.B;
    }

    public final boolean H2() {
        return this.H && this.I != null;
    }

    public final boolean G2() {
        return this.T && this.U != null && this.f1832u0;
    }

    public final boolean I2() {
        return this.M && this.N != null;
    }

    public final boolean n0() {
        return this.T && this.U != null && this.S;
    }

    public float g0() {
        if (H2() || G2()) {
            return this.Z + T0() + this.f1812a0;
        }
        return 0.0f;
    }

    public final float T0() {
        Drawable iconDrawable = this.f1832u0 ? this.U : this.I;
        float f2 = this.K;
        if (f2 > 0.0f || iconDrawable == null) {
            return f2;
        }
        return iconDrawable.getIntrinsicWidth();
    }

    public final float S0() {
        Drawable icon = this.f1832u0 ? this.U : this.I;
        float maxChipIconHeight = this.K;
        if (maxChipIconHeight > 0.0f || icon == null) {
            return maxChipIconHeight;
        }
        float maxChipIconHeight2 = (float) Math.ceil(w.b(this.f1818g0, 24));
        if (icon.getIntrinsicHeight() <= maxChipIconHeight2) {
            return icon.getIntrinsicHeight();
        }
        return maxChipIconHeight2;
    }

    public float j0() {
        if (I2()) {
            return this.f1815d0 + this.Q + this.f1816e0;
        }
        return 0.0f;
    }

    @Override // q1.j, android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        Rect bounds = getBounds();
        if (!bounds.isEmpty() && getAlpha() != 0) {
            int saveCount = 0;
            int i2 = this.f1834w0;
            if (i2 < 255) {
                saveCount = c1.a.a(canvas, bounds.left, bounds.top, bounds.right, bounds.bottom, i2);
            }
            t0(canvas, bounds);
            q0(canvas, bounds);
            if (this.I0) {
                super.draw(canvas);
            }
            s0(canvas, bounds);
            v0(canvas, bounds);
            r0(canvas, bounds);
            p0(canvas, bounds);
            if (this.G0) {
                x0(canvas, bounds);
            }
            u0(canvas, bounds);
            w0(canvas, bounds);
            if (this.f1834w0 < 255) {
                canvas.restoreToCount(saveCount);
            }
        }
    }

    public final void t0(Canvas canvas, Rect bounds) {
        if (!this.I0) {
            this.f1819h0.setColor(this.f1826o0);
            this.f1819h0.setStyle(Paint.Style.FILL);
            this.f1822k0.set(bounds);
            canvas.drawRoundRect(this.f1822k0, B0(), B0(), this.f1819h0);
        }
    }

    public final void q0(Canvas canvas, Rect bounds) {
        if (!this.I0) {
            this.f1819h0.setColor(this.f1827p0);
            this.f1819h0.setStyle(Paint.Style.FILL);
            this.f1819h0.setColorFilter(e1());
            this.f1822k0.set(bounds);
            canvas.drawRoundRect(this.f1822k0, B0(), B0(), this.f1819h0);
        }
    }

    public final void s0(Canvas canvas, Rect bounds) {
        if (this.E > 0.0f && !this.I0) {
            this.f1819h0.setColor(this.f1829r0);
            this.f1819h0.setStyle(Paint.Style.STROKE);
            if (!this.I0) {
                this.f1819h0.setColorFilter(e1());
            }
            RectF rectF = this.f1822k0;
            float f2 = this.E;
            rectF.set(bounds.left + (f2 / 2.0f), bounds.top + (f2 / 2.0f), bounds.right - (f2 / 2.0f), bounds.bottom - (f2 / 2.0f));
            float strokeCornerRadius = this.C - (this.E / 2.0f);
            canvas.drawRoundRect(this.f1822k0, strokeCornerRadius, strokeCornerRadius, this.f1819h0);
        }
    }

    public final void v0(Canvas canvas, Rect bounds) {
        this.f1819h0.setColor(this.f1830s0);
        this.f1819h0.setStyle(Paint.Style.FILL);
        this.f1822k0.set(bounds);
        if (!this.I0) {
            canvas.drawRoundRect(this.f1822k0, B0(), B0(), this.f1819h0);
            return;
        }
        g(new RectF(bounds), this.f1824m0);
        o(canvas, this.f1819h0, this.f1824m0, t());
    }

    public final void r0(Canvas canvas, Rect bounds) {
        if (H2()) {
            f0(bounds, this.f1822k0);
            RectF rectF = this.f1822k0;
            float tx = rectF.left;
            float ty = rectF.top;
            canvas.translate(tx, ty);
            this.I.setBounds(0, 0, (int) this.f1822k0.width(), (int) this.f1822k0.height());
            this.I.draw(canvas);
            canvas.translate(-tx, -ty);
        }
    }

    public final void p0(Canvas canvas, Rect bounds) {
        if (G2()) {
            f0(bounds, this.f1822k0);
            RectF rectF = this.f1822k0;
            float tx = rectF.left;
            float ty = rectF.top;
            canvas.translate(tx, ty);
            this.U.setBounds(0, 0, (int) this.f1822k0.width(), (int) this.f1822k0.height());
            this.U.draw(canvas);
            canvas.translate(-tx, -ty);
        }
    }

    public final void x0(Canvas canvas, Rect bounds) {
        if (this.G != null) {
            Paint.Align align = m0(bounds, this.f1823l0);
            k0(bounds, this.f1822k0);
            if (this.f1825n0.d() != null) {
                this.f1825n0.e().drawableState = getState();
                this.f1825n0.j(this.f1818g0);
            }
            this.f1825n0.e().setTextAlign(align);
            boolean clip = Math.round(this.f1825n0.f(a1().toString())) > Math.round(this.f1822k0.width());
            int saveCount = 0;
            if (clip) {
                saveCount = canvas.save();
                canvas.clipRect(this.f1822k0);
            }
            CharSequence finalText = this.G;
            if (clip && this.F0 != null) {
                finalText = TextUtils.ellipsize(this.G, this.f1825n0.e(), this.f1822k0.width(), this.F0);
            }
            int length = finalText.length();
            PointF pointF = this.f1823l0;
            canvas.drawText(finalText, 0, length, pointF.x, pointF.y, this.f1825n0.e());
            if (clip) {
                canvas.restoreToCount(saveCount);
            }
        }
    }

    public final void u0(Canvas canvas, Rect bounds) {
        if (I2()) {
            h0(bounds, this.f1822k0);
            RectF rectF = this.f1822k0;
            float tx = rectF.left;
            float ty = rectF.top;
            canvas.translate(tx, ty);
            this.N.setBounds(0, 0, (int) this.f1822k0.width(), (int) this.f1822k0.height());
            boolean z2 = a.f2694a;
            this.O.setBounds(this.N.getBounds());
            this.O.jumpToCurrentState();
            this.O.draw(canvas);
            canvas.translate(-tx, -ty);
        }
    }

    public final void w0(Canvas canvas, Rect bounds) {
    }

    public final void f0(Rect bounds, RectF outBounds) {
        outBounds.setEmpty();
        if (H2() || G2()) {
            float offsetFromStart = this.Y + this.Z;
            float chipWidth = T0();
            if (y.a.b(this) == 0) {
                float f2 = bounds.left + offsetFromStart;
                outBounds.left = f2;
                outBounds.right = f2 + chipWidth;
            } else {
                float f3 = bounds.right - offsetFromStart;
                outBounds.right = f3;
                outBounds.left = f3 - chipWidth;
            }
            float chipHeight = S0();
            float exactCenterY = bounds.exactCenterY() - (chipHeight / 2.0f);
            outBounds.top = exactCenterY;
            outBounds.bottom = exactCenterY + chipHeight;
        }
    }

    public Paint.Align m0(Rect bounds, PointF pointF) {
        pointF.set(0.0f, 0.0f);
        Paint.Align align = Paint.Align.LEFT;
        if (this.G != null) {
            float offsetFromStart = this.Y + g0() + this.f1813b0;
            if (y.a.b(this) == 0) {
                pointF.x = bounds.left + offsetFromStart;
                align = Paint.Align.LEFT;
            } else {
                pointF.x = bounds.right - offsetFromStart;
                align = Paint.Align.RIGHT;
            }
            pointF.y = bounds.centerY() - l0();
        }
        return align;
    }

    public final float l0() {
        this.f1825n0.e().getFontMetrics(this.f1821j0);
        Paint.FontMetrics fontMetrics = this.f1821j0;
        return (fontMetrics.descent + fontMetrics.ascent) / 2.0f;
    }

    public final void k0(Rect bounds, RectF outBounds) {
        outBounds.setEmpty();
        if (this.G != null) {
            float offsetFromStart = this.Y + g0() + this.f1813b0;
            float offsetFromEnd = this.f1817f0 + j0() + this.f1814c0;
            if (y.a.b(this) == 0) {
                outBounds.left = bounds.left + offsetFromStart;
                outBounds.right = bounds.right - offsetFromEnd;
            } else {
                outBounds.left = bounds.left + offsetFromEnd;
                outBounds.right = bounds.right - offsetFromStart;
            }
            outBounds.top = bounds.top;
            outBounds.bottom = bounds.bottom;
        }
    }

    public final void h0(Rect bounds, RectF outBounds) {
        outBounds.setEmpty();
        if (I2()) {
            float offsetFromEnd = this.f1817f0 + this.f1816e0;
            if (y.a.b(this) == 0) {
                float f2 = bounds.right - offsetFromEnd;
                outBounds.right = f2;
                outBounds.left = f2 - this.Q;
            } else {
                float f3 = bounds.left + offsetFromEnd;
                outBounds.left = f3;
                outBounds.right = f3 + this.Q;
            }
            float exactCenterY = bounds.exactCenterY();
            float f4 = this.Q;
            float f5 = exactCenterY - (f4 / 2.0f);
            outBounds.top = f5;
            outBounds.bottom = f5 + f4;
        }
    }

    public final void i0(Rect bounds, RectF outBounds) {
        outBounds.setEmpty();
        if (I2()) {
            float offsetFromEnd = this.f1817f0 + this.f1816e0 + this.Q + this.f1815d0 + this.f1814c0;
            if (y.a.b(this) == 0) {
                float f2 = bounds.right;
                outBounds.right = f2;
                outBounds.left = f2 - offsetFromEnd;
            } else {
                int i2 = bounds.left;
                outBounds.left = i2;
                outBounds.right = i2 + offsetFromEnd;
            }
            outBounds.top = bounds.top;
            outBounds.bottom = bounds.bottom;
        }
    }

    @Override // q1.j, android.graphics.drawable.Drawable
    public boolean isStateful() {
        return k1(this.f1837z) || k1(this.A) || k1(this.D) || (this.C0 && k1(this.D0)) || m1(this.f1825n0.d()) || n0() || l1(this.I) || l1(this.U) || k1(this.f1838z0);
    }

    public boolean i1() {
        return l1(this.N);
    }

    public boolean f2(int[] stateSet) {
        if (Arrays.equals(this.B0, stateSet)) {
            return false;
        }
        this.B0 = stateSet;
        if (I2()) {
            return p1(getState(), stateSet);
        }
        return false;
    }

    public int[] P0() {
        return this.B0;
    }

    public void q1() {
        o1();
        invalidateSelf();
    }

    @Override // q1.j, android.graphics.drawable.Drawable
    public boolean onStateChange(int[] state) {
        if (this.I0) {
            super.onStateChange(state);
        }
        return p1(state, P0());
    }

    public final boolean p1(int[] chipState, int[] closeIconState) {
        boolean invalidate = super.onStateChange(chipState);
        boolean sizeChanged = false;
        ColorStateList colorStateList = this.f1837z;
        int newChipSurfaceColor = k(colorStateList != null ? colorStateList.getColorForState(chipState, this.f1826o0) : 0);
        if (this.f1826o0 != newChipSurfaceColor) {
            this.f1826o0 = newChipSurfaceColor;
            invalidate = true;
        }
        ColorStateList colorStateList2 = this.A;
        int newChipBackgroundColor = k(colorStateList2 != null ? colorStateList2.getColorForState(chipState, this.f1827p0) : 0);
        if (this.f1827p0 != newChipBackgroundColor) {
            this.f1827p0 = newChipBackgroundColor;
            invalidate = true;
        }
        int newCompositeSurfaceBackgroundColor = f1.a.e(newChipSurfaceColor, newChipBackgroundColor);
        boolean newChecked = true;
        boolean shouldUpdate = this.f1828q0 != newCompositeSurfaceBackgroundColor;
        if (shouldUpdate || (w() == null)) {
            this.f1828q0 = newCompositeSurfaceBackgroundColor;
            T(ColorStateList.valueOf(newCompositeSurfaceBackgroundColor));
            invalidate = true;
        }
        ColorStateList colorStateList3 = this.D;
        int newChipStrokeColor = colorStateList3 != null ? colorStateList3.getColorForState(chipState, this.f1829r0) : 0;
        if (this.f1829r0 != newChipStrokeColor) {
            this.f1829r0 = newChipStrokeColor;
            invalidate = true;
        }
        int newCompatRippleColor = (this.D0 == null || !a.b(chipState)) ? 0 : this.D0.getColorForState(chipState, this.f1830s0);
        if (this.f1830s0 != newCompatRippleColor) {
            this.f1830s0 = newCompatRippleColor;
            if (this.C0) {
                invalidate = true;
            }
        }
        int newTextColor = (this.f1825n0.d() == null || this.f1825n0.d().f2567a == null) ? 0 : this.f1825n0.d().f2567a.getColorForState(chipState, this.f1831t0);
        if (this.f1831t0 != newTextColor) {
            this.f1831t0 = newTextColor;
            invalidate = true;
        }
        if (!g1(getState(), 16842912) || !this.S) {
            newChecked = false;
        }
        if (!(this.f1832u0 == newChecked || this.U == null)) {
            float oldChipIconWidth = g0();
            this.f1832u0 = newChecked;
            float newChipIconWidth = g0();
            invalidate = true;
            if (oldChipIconWidth != newChipIconWidth) {
                sizeChanged = true;
            }
        }
        ColorStateList colorStateList4 = this.f1838z0;
        int newTint = colorStateList4 != null ? colorStateList4.getColorForState(chipState, this.f1833v0) : 0;
        if (this.f1833v0 != newTint) {
            this.f1833v0 = newTint;
            this.f1836y0 = h1.a.a(this, this.f1838z0, this.A0);
            invalidate = true;
        }
        if (l1(this.I)) {
            invalidate |= this.I.setState(chipState);
        }
        if (l1(this.U)) {
            invalidate |= this.U.setState(chipState);
        }
        if (l1(this.N)) {
            int[] closeIconMergedState = new int[chipState.length + closeIconState.length];
            System.arraycopy(chipState, 0, closeIconMergedState, 0, chipState.length);
            System.arraycopy(closeIconState, 0, closeIconMergedState, chipState.length, closeIconState.length);
            invalidate |= this.N.setState(closeIconMergedState);
        }
        boolean z2 = a.f2694a;
        if (l1(this.O)) {
            invalidate |= this.O.setState(closeIconState);
        }
        if (invalidate) {
            invalidateSelf();
        }
        if (sizeChanged) {
            o1();
        }
        return invalidate;
    }

    public static boolean k1(ColorStateList colorStateList) {
        return colorStateList != null && colorStateList.isStateful();
    }

    public static boolean l1(Drawable drawable) {
        return drawable != null && drawable.isStateful();
    }

    public static boolean m1(g textAppearance) {
        ColorStateList colorStateList;
        return (textAppearance == null || (colorStateList = textAppearance.f2567a) == null || !colorStateList.isStateful()) ? false : true;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onLayoutDirectionChanged(int layoutDirection) {
        boolean invalidate = super.onLayoutDirectionChanged(layoutDirection);
        if (H2()) {
            invalidate |= y.a.g(this.I, layoutDirection);
        }
        if (G2()) {
            invalidate |= y.a.g(this.U, layoutDirection);
        }
        if (I2()) {
            invalidate |= y.a.g(this.N, layoutDirection);
        }
        if (!invalidate) {
            return true;
        }
        invalidateSelf();
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onLevelChange(int level) {
        boolean invalidate = super.onLevelChange(level);
        if (H2()) {
            invalidate |= this.I.setLevel(level);
        }
        if (G2()) {
            invalidate |= this.U.setLevel(level);
        }
        if (I2()) {
            invalidate |= this.N.setLevel(level);
        }
        if (invalidate) {
            invalidateSelf();
        }
        return invalidate;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean visible, boolean restart) {
        boolean invalidate = super.setVisible(visible, restart);
        if (H2()) {
            invalidate |= this.I.setVisible(visible, restart);
        }
        if (G2()) {
            invalidate |= this.U.setVisible(visible, restart);
        }
        if (I2()) {
            invalidate |= this.N.setVisible(visible, restart);
        }
        if (invalidate) {
            invalidateSelf();
        }
        return invalidate;
    }

    @Override // q1.j, android.graphics.drawable.Drawable
    public void setAlpha(int alpha) {
        if (this.f1834w0 != alpha) {
            this.f1834w0 = alpha;
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.f1834w0;
    }

    @Override // q1.j, android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        if (this.f1835x0 != colorFilter) {
            this.f1835x0 = colorFilter;
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public ColorFilter getColorFilter() {
        return this.f1835x0;
    }

    @Override // q1.j, android.graphics.drawable.Drawable
    public void setTintList(ColorStateList tint) {
        if (this.f1838z0 != tint) {
            this.f1838z0 = tint;
            onStateChange(getState());
        }
    }

    @Override // q1.j, android.graphics.drawable.Drawable
    public void setTintMode(PorterDuff.Mode tintMode) {
        if (this.A0 != tintMode) {
            this.A0 = tintMode;
            this.f1836y0 = h1.a.a(this, this.f1838z0, tintMode);
            invalidateSelf();
        }
    }

    @Override // q1.j, android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // q1.j, android.graphics.drawable.Drawable
    public void getOutline(Outline outline) {
        if (this.I0) {
            super.getOutline(outline);
            return;
        }
        Rect bounds = getBounds();
        if (!bounds.isEmpty()) {
            outline.setRoundRect(bounds, this.C);
        } else {
            outline.setRoundRect(0, 0, getIntrinsicWidth(), getIntrinsicHeight(), this.C);
        }
        outline.setAlpha(getAlpha() / 255.0f);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void invalidateDrawable(Drawable who) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.invalidateDrawable(this);
        }
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void scheduleDrawable(Drawable who, Runnable what, long when) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.scheduleDrawable(this, what, when);
        }
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void unscheduleDrawable(Drawable who, Runnable what) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.unscheduleDrawable(this, what);
        }
    }

    public final void J2(Drawable drawable) {
        if (drawable != null) {
            drawable.setCallback(null);
        }
    }

    public final void e0(Drawable drawable) {
        if (drawable != null) {
            drawable.setCallback(this);
            y.a.g(drawable, y.a.b(this));
            drawable.setLevel(getLevel());
            drawable.setVisible(isVisible(), false);
            if (drawable == this.N) {
                if (drawable.isStateful()) {
                    drawable.setState(P0());
                }
                y.a.i(drawable, this.P);
                return;
            }
            if (drawable.isStateful()) {
                drawable.setState(getState());
            }
            Drawable drawable2 = this.I;
            if (drawable == drawable2 && this.L) {
                y.a.i(drawable2, this.J);
            }
        }
    }

    public final ColorFilter e1() {
        ColorFilter colorFilter = this.f1835x0;
        return colorFilter != null ? colorFilter : this.f1836y0;
    }

    public final void K2() {
        this.D0 = this.C0 ? a.a(this.F) : null;
    }

    public final void V1(ColorStateList chipSurfaceColor) {
        if (this.f1837z != chipSurfaceColor) {
            this.f1837z = chipSurfaceColor;
            onStateChange(getState());
        }
    }

    public static boolean g1(int[] stateSet, int state) {
        if (stateSet == null) {
            return false;
        }
        for (int s2 : stateSet) {
            if (s2 == state) {
                return true;
            }
        }
        return false;
    }

    public ColorStateList A0() {
        return this.A;
    }

    public void A1(int id) {
        z1(e.a.a(this.f1818g0, id));
    }

    public void z1(ColorStateList chipBackgroundColor) {
        if (this.A != chipBackgroundColor) {
            this.A = chipBackgroundColor;
            onStateChange(getState());
        }
    }

    public float G0() {
        return this.B;
    }

    public void O1(int id) {
        N1(this.f1818g0.getResources().getDimension(id));
    }

    public void N1(float chipMinHeight) {
        if (this.B != chipMinHeight) {
            this.B = chipMinHeight;
            invalidateSelf();
            o1();
        }
    }

    public float B0() {
        return this.I0 ? C() : this.C;
    }

    public void C1(int id) {
        B1(this.f1818g0.getResources().getDimension(id));
    }

    public void B1(float chipCornerRadius) {
        if (this.C != chipCornerRadius) {
            this.C = chipCornerRadius;
            setShapeAppearanceModel(A().w(chipCornerRadius));
        }
    }

    public ColorStateList I0() {
        return this.D;
    }

    public void S1(int id) {
        R1(e.a.a(this.f1818g0, id));
    }

    public void R1(ColorStateList chipStrokeColor) {
        if (this.D != chipStrokeColor) {
            this.D = chipStrokeColor;
            if (this.I0) {
                Z(chipStrokeColor);
            }
            onStateChange(getState());
        }
    }

    public float J0() {
        return this.E;
    }

    public void U1(int id) {
        T1(this.f1818g0.getResources().getDimension(id));
    }

    public void T1(float chipStrokeWidth) {
        if (this.E != chipStrokeWidth) {
            this.E = chipStrokeWidth;
            this.f1819h0.setStrokeWidth(chipStrokeWidth);
            if (this.I0) {
                a0(chipStrokeWidth);
            }
            invalidateSelf();
        }
    }

    public ColorStateList Y0() {
        return this.F;
    }

    public void t2(int id) {
        s2(e.a.a(this.f1818g0, id));
    }

    public void s2(ColorStateList rippleColor) {
        if (this.F != rippleColor) {
            this.F = rippleColor;
            K2();
            onStateChange(getState());
        }
    }

    public CharSequence a1() {
        return this.G;
    }

    public void x2(CharSequence text) {
        if (text == null) {
            text = "";
        }
        if (!TextUtils.equals(this.G, text)) {
            this.G = text;
            this.f1825n0.i(true);
            invalidateSelf();
            o1();
        }
    }

    public g b1() {
        return this.f1825n0.d();
    }

    public void z2(int id) {
        y2(new g(this.f1818g0, id));
    }

    public void y2(g textAppearance) {
        this.f1825n0.h(textAppearance, this.f1818g0);
    }

    public TextUtils.TruncateAt U0() {
        return this.F0;
    }

    public void k2(TextUtils.TruncateAt truncateAt) {
        this.F0 = truncateAt;
    }

    public void L1(int id) {
        M1(this.f1818g0.getResources().getBoolean(id));
    }

    public void M1(boolean chipIconVisible) {
        if (this.H != chipIconVisible) {
            boolean oldShowsChipIcon = H2();
            this.H = chipIconVisible;
            boolean newShowsChipIcon = H2();
            boolean changed = oldShowsChipIcon != newShowsChipIcon;
            if (changed) {
                if (newShowsChipIcon) {
                    e0(this.I);
                } else {
                    J2(this.I);
                }
                invalidateSelf();
                o1();
            }
        }
    }

    public Drawable D0() {
        Drawable drawable = this.I;
        if (drawable != null) {
            return y.a.k(drawable);
        }
        return null;
    }

    public void G1(int id) {
        F1(e.a.b(this.f1818g0, id));
    }

    public void F1(Drawable chipIcon) {
        Drawable drawable;
        Drawable oldChipIcon = D0();
        if (oldChipIcon != chipIcon) {
            float oldChipIconWidth = g0();
            if (chipIcon != null) {
                y.a.l(chipIcon);
                drawable = chipIcon.mutate();
            } else {
                drawable = null;
            }
            this.I = drawable;
            float newChipIconWidth = g0();
            J2(oldChipIcon);
            if (H2()) {
                e0(this.I);
            }
            invalidateSelf();
            if (oldChipIconWidth != newChipIconWidth) {
                o1();
            }
        }
    }

    public ColorStateList F0() {
        return this.J;
    }

    public void K1(int id) {
        J1(e.a.a(this.f1818g0, id));
    }

    public void J1(ColorStateList chipIconTint) {
        this.L = true;
        if (this.J != chipIconTint) {
            this.J = chipIconTint;
            if (H2()) {
                y.a.i(this.I, chipIconTint);
            }
            onStateChange(getState());
        }
    }

    public float E0() {
        return this.K;
    }

    public void I1(int id) {
        H1(this.f1818g0.getResources().getDimension(id));
    }

    public void H1(float chipIconSize) {
        if (this.K != chipIconSize) {
            float oldChipIconWidth = g0();
            this.K = chipIconSize;
            float newChipIconWidth = g0();
            invalidateSelf();
            if (oldChipIconWidth != newChipIconWidth) {
                o1();
            }
        }
    }

    public boolean j1() {
        return this.M;
    }

    public void i2(boolean closeIconVisible) {
        if (this.M != closeIconVisible) {
            boolean oldShowsCloseIcon = I2();
            this.M = closeIconVisible;
            boolean newShowsCloseIcon = I2();
            boolean changed = oldShowsCloseIcon != newShowsCloseIcon;
            if (changed) {
                if (newShowsCloseIcon) {
                    e0(this.N);
                } else {
                    J2(this.N);
                }
                invalidateSelf();
                o1();
            }
        }
    }

    public Drawable K0() {
        Drawable drawable = this.N;
        if (drawable != null) {
            return y.a.k(drawable);
        }
        return null;
    }

    public void a2(int id) {
        W1(e.a.b(this.f1818g0, id));
    }

    public void W1(Drawable closeIcon) {
        Drawable drawable;
        Drawable oldCloseIcon = K0();
        if (oldCloseIcon != closeIcon) {
            float oldCloseIconWidth = j0();
            if (closeIcon != null) {
                y.a.l(closeIcon);
                drawable = closeIcon.mutate();
            } else {
                drawable = null;
            }
            this.N = drawable;
            boolean z2 = a.f2694a;
            L2();
            float newCloseIconWidth = j0();
            J2(oldCloseIcon);
            if (I2()) {
                e0(this.N);
            }
            invalidateSelf();
            if (oldCloseIconWidth != newCloseIconWidth) {
                o1();
            }
        }
    }

    public final void L2() {
        this.O = new RippleDrawable(a.a(Y0()), this.N, K0);
    }

    public ColorStateList Q0() {
        return this.P;
    }

    public void h2(int id) {
        g2(e.a.a(this.f1818g0, id));
    }

    public void g2(ColorStateList closeIconTint) {
        if (this.P != closeIconTint) {
            this.P = closeIconTint;
            if (I2()) {
                y.a.i(this.N, closeIconTint);
            }
            onStateChange(getState());
        }
    }

    public float N0() {
        return this.Q;
    }

    public void c2(int id) {
        b2(this.f1818g0.getResources().getDimension(id));
    }

    public void b2(float closeIconSize) {
        if (this.Q != closeIconSize) {
            this.Q = closeIconSize;
            invalidateSelf();
            if (I2()) {
                o1();
            }
        }
    }

    public void X1(CharSequence closeIconContentDescription) {
        if (this.R != closeIconContentDescription) {
            this.R = c.c().h(closeIconContentDescription);
            invalidateSelf();
        }
    }

    public CharSequence L0() {
        return this.R;
    }

    public boolean h1() {
        return this.S;
    }

    public void s1(int id) {
        r1(this.f1818g0.getResources().getBoolean(id));
    }

    public void r1(boolean checkable) {
        if (this.S != checkable) {
            this.S = checkable;
            float oldChipIconWidth = g0();
            if (!checkable && this.f1832u0) {
                this.f1832u0 = false;
            }
            float newChipIconWidth = g0();
            invalidateSelf();
            if (oldChipIconWidth != newChipIconWidth) {
                o1();
            }
        }
    }

    public void x1(int id) {
        y1(this.f1818g0.getResources().getBoolean(id));
    }

    public void y1(boolean checkedIconVisible) {
        if (this.T != checkedIconVisible) {
            boolean oldShowsCheckedIcon = G2();
            this.T = checkedIconVisible;
            boolean newShowsCheckedIcon = G2();
            boolean changed = oldShowsCheckedIcon != newShowsCheckedIcon;
            if (changed) {
                if (newShowsCheckedIcon) {
                    e0(this.U);
                } else {
                    J2(this.U);
                }
                invalidateSelf();
                o1();
            }
        }
    }

    public Drawable y0() {
        return this.U;
    }

    public void u1(int id) {
        t1(e.a.b(this.f1818g0, id));
    }

    public void t1(Drawable checkedIcon) {
        Drawable oldCheckedIcon = this.U;
        if (oldCheckedIcon != checkedIcon) {
            float oldChipIconWidth = g0();
            this.U = checkedIcon;
            float newChipIconWidth = g0();
            J2(this.U);
            e0(this.U);
            invalidateSelf();
            if (oldChipIconWidth != newChipIconWidth) {
                o1();
            }
        }
    }

    public ColorStateList z0() {
        return this.V;
    }

    public void w1(int id) {
        v1(e.a.a(this.f1818g0, id));
    }

    public void v1(ColorStateList checkedIconTint) {
        if (this.V != checkedIconTint) {
            this.V = checkedIconTint;
            if (n0()) {
                y.a.i(this.U, checkedIconTint);
            }
            onStateChange(getState());
        }
    }

    public d Z0() {
        return this.W;
    }

    public void w2(int id) {
        v2(d.c(this.f1818g0, id));
    }

    public void v2(d showMotionSpec) {
        this.W = showMotionSpec;
    }

    public d V0() {
        return this.X;
    }

    public void m2(int id) {
        l2(d.c(this.f1818g0, id));
    }

    public void l2(d hideMotionSpec) {
        this.X = hideMotionSpec;
    }

    public float H0() {
        return this.Y;
    }

    public void Q1(int id) {
        P1(this.f1818g0.getResources().getDimension(id));
    }

    public void P1(float chipStartPadding) {
        if (this.Y != chipStartPadding) {
            this.Y = chipStartPadding;
            invalidateSelf();
            o1();
        }
    }

    public float X0() {
        return this.Z;
    }

    public void q2(int id) {
        p2(this.f1818g0.getResources().getDimension(id));
    }

    public void p2(float iconStartPadding) {
        if (this.Z != iconStartPadding) {
            float oldChipIconWidth = g0();
            this.Z = iconStartPadding;
            float newChipIconWidth = g0();
            invalidateSelf();
            if (oldChipIconWidth != newChipIconWidth) {
                o1();
            }
        }
    }

    public float W0() {
        return this.f1812a0;
    }

    public void o2(int id) {
        n2(this.f1818g0.getResources().getDimension(id));
    }

    public void n2(float iconEndPadding) {
        if (this.f1812a0 != iconEndPadding) {
            float oldChipIconWidth = g0();
            this.f1812a0 = iconEndPadding;
            float newChipIconWidth = g0();
            invalidateSelf();
            if (oldChipIconWidth != newChipIconWidth) {
                o1();
            }
        }
    }

    public float d1() {
        return this.f1813b0;
    }

    public void D2(int id) {
        C2(this.f1818g0.getResources().getDimension(id));
    }

    public void C2(float textStartPadding) {
        if (this.f1813b0 != textStartPadding) {
            this.f1813b0 = textStartPadding;
            invalidateSelf();
            o1();
        }
    }

    public float c1() {
        return this.f1814c0;
    }

    public void B2(int id) {
        A2(this.f1818g0.getResources().getDimension(id));
    }

    public void A2(float textEndPadding) {
        if (this.f1814c0 != textEndPadding) {
            this.f1814c0 = textEndPadding;
            invalidateSelf();
            o1();
        }
    }

    public float O0() {
        return this.f1815d0;
    }

    public void e2(int id) {
        d2(this.f1818g0.getResources().getDimension(id));
    }

    public void d2(float closeIconStartPadding) {
        if (this.f1815d0 != closeIconStartPadding) {
            this.f1815d0 = closeIconStartPadding;
            invalidateSelf();
            if (I2()) {
                o1();
            }
        }
    }

    public float M0() {
        return this.f1816e0;
    }

    public void Z1(int id) {
        Y1(this.f1818g0.getResources().getDimension(id));
    }

    public void Y1(float closeIconEndPadding) {
        if (this.f1816e0 != closeIconEndPadding) {
            this.f1816e0 = closeIconEndPadding;
            invalidateSelf();
            if (I2()) {
                o1();
            }
        }
    }

    public float C0() {
        return this.f1817f0;
    }

    public void E1(int id) {
        D1(this.f1818g0.getResources().getDimension(id));
    }

    public void D1(float chipEndPadding) {
        if (this.f1817f0 != chipEndPadding) {
            this.f1817f0 = chipEndPadding;
            invalidateSelf();
            o1();
        }
    }

    public void r2(int maxWidth) {
        this.H0 = maxWidth;
    }

    public boolean F2() {
        return this.G0;
    }

    public void u2(boolean shouldDrawText) {
        this.G0 = shouldDrawText;
    }
}
