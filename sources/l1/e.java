package l1;

import a0.a;
import android.animation.TimeInterpolator;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import d0.k;
import d0.n;
import e0.h;
import f0.c1;
import f0.o;
import n1.b;
import n1.g;

/* JADX WARN: Classes with same name are omitted:
  
 */
/* loaded from: classes.dex */
public final class e {

    /* renamed from: a0  reason: collision with root package name */
    public static final boolean f2400a0 = false;

    /* renamed from: b0  reason: collision with root package name */
    public static final Paint f2401b0 = null;
    public boolean B;
    public Bitmap C;
    public Paint D;
    public float E;
    public float F;
    public int[] G;
    public boolean H;
    public final TextPaint I;
    public final TextPaint J;
    public TimeInterpolator K;
    public TimeInterpolator L;
    public float M;
    public float N;
    public float O;
    public ColorStateList P;
    public float Q;
    public StaticLayout R;
    public float S;
    public float T;
    public float U;
    public CharSequence V;

    /* renamed from: a  reason: collision with root package name */
    public final View f2402a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f2403b;

    /* renamed from: c  reason: collision with root package name */
    public float f2404c;

    /* renamed from: l  reason: collision with root package name */
    public ColorStateList f2413l;

    /* renamed from: m  reason: collision with root package name */
    public ColorStateList f2414m;

    /* renamed from: n  reason: collision with root package name */
    public float f2415n;

    /* renamed from: o  reason: collision with root package name */
    public float f2416o;

    /* renamed from: p  reason: collision with root package name */
    public float f2417p;

    /* renamed from: q  reason: collision with root package name */
    public float f2418q;

    /* renamed from: r  reason: collision with root package name */
    public float f2419r;

    /* renamed from: s  reason: collision with root package name */
    public float f2420s;

    /* renamed from: t  reason: collision with root package name */
    public Typeface f2421t;

    /* renamed from: u  reason: collision with root package name */
    public Typeface f2422u;

    /* renamed from: v  reason: collision with root package name */
    public Typeface f2423v;

    /* renamed from: w  reason: collision with root package name */
    public b f2424w;

    /* renamed from: x  reason: collision with root package name */
    public CharSequence f2425x;

    /* renamed from: y  reason: collision with root package name */
    public CharSequence f2426y;

    /* renamed from: z  reason: collision with root package name */
    public boolean f2427z;

    /* renamed from: h  reason: collision with root package name */
    public int f2409h = 16;

    /* renamed from: i  reason: collision with root package name */
    public int f2410i = 16;

    /* renamed from: j  reason: collision with root package name */
    public float f2411j = 15.0f;

    /* renamed from: k  reason: collision with root package name */
    public float f2412k = 15.0f;
    public boolean A = true;
    public int W = 1;
    public float X = 0.0f;
    public float Y = 1.0f;
    public int Z = 1;

    /* renamed from: f  reason: collision with root package name */
    public final Rect f2407f = new Rect();

    /* renamed from: e  reason: collision with root package name */
    public final Rect f2406e = new Rect();

    /* renamed from: g  reason: collision with root package name */
    public final RectF f2408g = new RectF();

    /* renamed from: d  reason: collision with root package name */
    public float f2405d = 0.5f;

    public e(View view) {
        this.f2402a = view;
        TextPaint textPaint = new TextPaint(129);
        this.I = textPaint;
        this.J = new TextPaint(textPaint);
        e();
    }

    public void c0(TimeInterpolator interpolator) {
        this.L = interpolator;
        F();
    }

    public void Z(TimeInterpolator interpolator) {
        this.K = interpolator;
        F();
    }

    public void V(float textSize) {
        if (this.f2411j != textSize) {
            this.f2411j = textSize;
            F();
        }
    }

    public void M(ColorStateList textColor) {
        if (this.f2414m != textColor) {
            this.f2414m = textColor;
            F();
        }
    }

    public void T(ColorStateList textColor) {
        if (this.f2413l != textColor) {
            this.f2413l = textColor;
            F();
        }
    }

    public void Q(int left, int top, int right, int bottom) {
        if (!H(this.f2406e, left, top, right, bottom)) {
            this.f2406e.set(left, top, right, bottom);
            this.H = true;
            E();
        }
    }

    public void R(Rect bounds) {
        Q(bounds.left, bounds.top, bounds.right, bounds.bottom);
    }

    public void I(int left, int top, int right, int bottom) {
        if (!H(this.f2407f, left, top, right, bottom)) {
            this.f2407f.set(left, top, right, bottom);
            this.H = true;
            E();
        }
    }

    public void J(Rect bounds) {
        I(bounds.left, bounds.top, bounds.right, bounds.bottom);
    }

    public void m(RectF bounds, int labelWidth, int textGravity) {
        this.f2427z = f(this.f2425x);
        bounds.left = p(labelWidth, textGravity);
        bounds.top = this.f2407f.top;
        bounds.right = q(bounds, labelWidth, textGravity);
        bounds.bottom = this.f2407f.top + o();
    }

    public final float p(int width, int gravity) {
        if (gravity == 17 || (gravity & 7) == 1) {
            return (width / 2.0f) - (c() / 2.0f);
        }
        return ((gravity & 8388613) == 8388613 || (gravity & 5) == 5) ? this.f2427z ? this.f2407f.left : this.f2407f.right - c() : this.f2427z ? this.f2407f.right - c() : this.f2407f.left;
    }

    public final float q(RectF bounds, int width, int gravity) {
        if (gravity == 17 || (gravity & 7) == 1) {
            return (width / 2.0f) + (c() / 2.0f);
        }
        return ((gravity & 8388613) == 8388613 || (gravity & 5) == 5) ? this.f2427z ? bounds.left + c() : this.f2407f.right : this.f2427z ? this.f2407f.right : bounds.left + c();
    }

    public float c() {
        if (this.f2425x == null) {
            return 0.0f;
        }
        w(this.J);
        TextPaint textPaint = this.J;
        CharSequence charSequence = this.f2425x;
        return textPaint.measureText(charSequence, 0, charSequence.length());
    }

    public float u() {
        x(this.J);
        return -this.J.ascent();
    }

    public float o() {
        w(this.J);
        return -this.J.ascent();
    }

    public final float e() {
        return 0.5f;
    }

    public final void x(TextPaint textPaint) {
        textPaint.setTextSize(this.f2411j);
        textPaint.setTypeface(this.f2422u);
        textPaint.setLetterSpacing(0.0f);
    }

    public final void w(TextPaint textPaint) {
        textPaint.setTextSize(this.f2412k);
        textPaint.setTypeface(this.f2421t);
        textPaint.setLetterSpacing(this.Q);
    }

    public void E() {
        this.f2403b = this.f2407f.width() > 0 && this.f2407f.height() > 0 && this.f2406e.width() > 0 && this.f2406e.height() > 0;
    }

    public void U(int gravity) {
        if (this.f2409h != gravity) {
            this.f2409h = gravity;
            F();
        }
    }

    public void N(int gravity) {
        if (this.f2410i != gravity) {
            this.f2410i = gravity;
            F();
        }
    }

    public void K(int resId) {
        g textAppearance = new g(this.f2402a.getContext(), resId);
        ColorStateList colorStateList = textAppearance.f2567a;
        if (colorStateList != null) {
            this.f2414m = colorStateList;
        }
        float f2 = textAppearance.f2577k;
        if (f2 != 0.0f) {
            this.f2412k = f2;
        }
        ColorStateList colorStateList2 = textAppearance.f2568b;
        if (colorStateList2 != null) {
            this.P = colorStateList2;
        }
        this.N = textAppearance.f2572f;
        this.O = textAppearance.f2573g;
        this.M = textAppearance.f2574h;
        this.Q = textAppearance.f2576j;
        b bVar = this.f2424w;
        if (bVar != null) {
            bVar.c();
        }
        this.f2424w = new b(new d(this), textAppearance.e());
        textAppearance.h(this.f2402a.getContext(), this.f2424w);
        F();
    }

    public void O(Typeface typeface) {
        if (P(typeface)) {
            F();
        }
    }

    public void d0(Typeface typeface) {
        boolean collapsedFontChanged = P(typeface);
        boolean expandedFontChanged = W(typeface);
        if (collapsedFontChanged || expandedFontChanged) {
            F();
        }
    }

    public final boolean P(Typeface typeface) {
        b bVar = this.f2424w;
        if (bVar != null) {
            bVar.c();
        }
        if (this.f2421t == typeface) {
            return false;
        }
        this.f2421t = typeface;
        return true;
    }

    public final boolean W(Typeface typeface) {
        if (this.f2422u == typeface) {
            return false;
        }
        this.f2422u = typeface;
        return true;
    }

    public void X(float fraction) {
        float fraction2 = a.a(fraction, 0.0f, 1.0f);
        if (fraction2 != this.f2404c) {
            this.f2404c = fraction2;
            d();
        }
    }

    public final boolean a0(int[] state) {
        this.G = state;
        if (!B()) {
            return false;
        }
        F();
        return true;
    }

    public final boolean B() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2 = this.f2414m;
        return (colorStateList2 != null && colorStateList2.isStateful()) || ((colorStateList = this.f2413l) != null && colorStateList.isStateful());
    }

    public float v() {
        return this.f2404c;
    }

    public final void d() {
        g(this.f2404c);
    }

    public final void g(float fraction) {
        y(fraction);
        this.f2419r = D(this.f2417p, this.f2418q, fraction, this.K);
        this.f2420s = D(this.f2415n, this.f2416o, fraction, this.K);
        Y(D(this.f2411j, this.f2412k, fraction, this.L));
        TimeInterpolator timeInterpolator = w0.a.f3652b;
        L(1.0f - D(0.0f, 1.0f, 1.0f - fraction, timeInterpolator));
        S(D(1.0f, 0.0f, fraction, timeInterpolator));
        if (this.f2414m != this.f2413l) {
            this.I.setColor(a(t(), r(), fraction));
        } else {
            this.I.setColor(r());
        }
        float f2 = this.Q;
        if (f2 != 0.0f) {
            this.I.setLetterSpacing(D(0.0f, f2, fraction, timeInterpolator));
        } else {
            this.I.setLetterSpacing(f2);
        }
        this.I.setShadowLayer(D(0.0f, this.M, fraction, null), D(0.0f, this.N, fraction, null), D(0.0f, this.O, fraction, null), a(s(null), s(this.P), fraction));
        c1.c0(this.f2402a);
    }

    public final int t() {
        return s(this.f2413l);
    }

    public int r() {
        return s(this.f2414m);
    }

    public final int s(ColorStateList colorStateList) {
        if (colorStateList == null) {
            return 0;
        }
        int[] iArr = this.G;
        if (iArr != null) {
            return colorStateList.getColorForState(iArr, 0);
        }
        return colorStateList.getDefaultColor();
    }

    public final void b(boolean forceRecalculate) {
        StaticLayout staticLayout;
        float currentTextSize = this.F;
        i(this.f2412k, forceRecalculate);
        CharSequence charSequence = this.f2426y;
        if (!(charSequence == null || (staticLayout = this.R) == null)) {
            this.V = TextUtils.ellipsize(charSequence, this.I, staticLayout.getWidth(), TextUtils.TruncateAt.END);
        }
        CharSequence charSequence2 = this.V;
        float f2 = 0.0f;
        float width = charSequence2 != null ? this.I.measureText(charSequence2, 0, charSequence2.length()) : 0.0f;
        int collapsedAbsGravity = o.b(this.f2410i, this.f2427z ? 1 : 0);
        switch (collapsedAbsGravity & 112) {
            case 48:
                this.f2416o = this.f2407f.top;
                break;
            case 80:
                this.f2416o = this.f2407f.bottom + this.I.ascent();
                break;
            default:
                float textOffset = (this.I.descent() - this.I.ascent()) / 2.0f;
                this.f2416o = this.f2407f.centerY() - textOffset;
                break;
        }
        switch (collapsedAbsGravity & 8388615) {
            case 1:
                this.f2418q = this.f2407f.centerX() - (width / 2.0f);
                break;
            case 5:
                this.f2418q = this.f2407f.right - width;
                break;
            default:
                this.f2418q = this.f2407f.left;
                break;
        }
        i(this.f2411j, forceRecalculate);
        StaticLayout staticLayout2 = this.R;
        float expandedTextHeight = staticLayout2 != null ? staticLayout2.getHeight() : 0.0f;
        CharSequence charSequence3 = this.f2426y;
        float measuredWidth = charSequence3 != null ? this.I.measureText(charSequence3, 0, charSequence3.length()) : 0.0f;
        StaticLayout staticLayout3 = this.R;
        if (staticLayout3 != null) {
        }
        if (staticLayout3 != null) {
            f2 = staticLayout3.getLineLeft(0);
        }
        this.U = f2;
        int expandedAbsGravity = o.b(this.f2409h, this.f2427z ? 1 : 0);
        switch (expandedAbsGravity & 112) {
            case 48:
                this.f2415n = this.f2406e.top;
                break;
            case 80:
                this.f2415n = (this.f2406e.bottom - expandedTextHeight) + this.I.descent();
                break;
            default:
                float textOffset2 = expandedTextHeight / 2.0f;
                this.f2415n = this.f2406e.centerY() - textOffset2;
                break;
        }
        switch (expandedAbsGravity & 8388615) {
            case 1:
                this.f2417p = this.f2406e.centerX() - (measuredWidth / 2.0f);
                break;
            case 5:
                this.f2417p = this.f2406e.right - measuredWidth;
                break;
            default:
                this.f2417p = this.f2406e.left;
                break;
        }
        j();
        Y(currentTextSize);
    }

    public final void y(float fraction) {
        this.f2408g.left = D(this.f2406e.left, this.f2407f.left, fraction, this.K);
        this.f2408g.top = D(this.f2415n, this.f2416o, fraction, this.K);
        this.f2408g.right = D(this.f2406e.right, this.f2407f.right, fraction, this.K);
        this.f2408g.bottom = D(this.f2406e.bottom, this.f2407f.bottom, fraction, this.K);
    }

    public final void L(float blend) {
        this.S = blend;
        c1.c0(this.f2402a);
    }

    public final void S(float blend) {
        this.T = blend;
        c1.c0(this.f2402a);
    }

    public void l(Canvas canvas) {
        int saveCount = canvas.save();
        if (this.f2426y != null && this.f2403b) {
            float firstLineX = this.R.getLineLeft(0);
            float f2 = (this.f2419r + firstLineX) - (this.U * 2.0f);
            this.I.setTextSize(this.F);
            float x2 = this.f2419r;
            float y2 = this.f2420s;
            float f3 = this.E;
            if (f3 != 1.0f) {
                canvas.scale(f3, f3, x2, y2);
            }
            if (0 != 0) {
                canvas.drawBitmap(this.C, x2, y2, this.D);
                canvas.restoreToCount(saveCount);
                return;
            }
            e0();
            canvas.translate(x2, y2);
            this.R.draw(canvas);
            canvas.restoreToCount(saveCount);
        }
    }

    public final boolean e0() {
        return false;
    }

    public final boolean f(CharSequence text) {
        boolean defaultIsRtl = A();
        return C(text, defaultIsRtl);
    }

    public final boolean A() {
        return c1.A(this.f2402a) == 1;
    }

    public final boolean C(CharSequence text, boolean defaultIsRtl) {
        return ((k) (defaultIsRtl ? n.f1797d : n.f1796c)).c(text, 0, text.length());
    }

    public final void Y(float textSize) {
        h(textSize);
        this.B = false;
        c1.c0(this.f2402a);
    }

    public final void h(float textSize) {
        i(textSize, false);
    }

    public final void i(float textSize, boolean forceRecalculate) {
        float textSizeRatio;
        float newTextSize;
        if (this.f2425x != null) {
            float collapsedWidth = this.f2407f.width();
            float expandedWidth = this.f2406e.width();
            boolean updateDrawText = false;
            if (z(textSize, this.f2412k)) {
                newTextSize = this.f2412k;
                this.E = 1.0f;
                Typeface typeface = this.f2423v;
                Typeface typeface2 = this.f2421t;
                if (typeface != typeface2) {
                    this.f2423v = typeface2;
                    updateDrawText = true;
                }
                textSizeRatio = collapsedWidth;
            } else {
                newTextSize = this.f2411j;
                Typeface typeface3 = this.f2423v;
                Typeface typeface4 = this.f2422u;
                if (typeface3 != typeface4) {
                    this.f2423v = typeface4;
                    updateDrawText = true;
                }
                if (z(textSize, this.f2411j)) {
                    this.E = 1.0f;
                } else {
                    this.E = textSize / this.f2411j;
                }
                float textSizeRatio2 = this.f2412k / this.f2411j;
                float scaledDownWidth = expandedWidth * textSizeRatio2;
                if (forceRecalculate) {
                    textSizeRatio = expandedWidth;
                } else {
                    textSizeRatio = scaledDownWidth > collapsedWidth ? Math.min(collapsedWidth / textSizeRatio2, expandedWidth) : expandedWidth;
                }
            }
            boolean z2 = false;
            if (textSizeRatio > 0.0f) {
                updateDrawText = this.F != newTextSize || this.H || updateDrawText;
                this.F = newTextSize;
                this.H = false;
            }
            if (this.f2426y == null || updateDrawText) {
                this.I.setTextSize(this.F);
                this.I.setTypeface(this.f2423v);
                TextPaint textPaint = this.I;
                if (this.E != 1.0f) {
                    z2 = true;
                }
                textPaint.setLinearText(z2);
                this.f2427z = f(this.f2425x);
                e0();
                StaticLayout k2 = k(1, textSizeRatio, this.f2427z);
                this.R = k2;
                this.f2426y = k2.getText();
            }
        }
    }

    public final StaticLayout k(int maxLines, float availableWidth, boolean isRtl) {
        StaticLayout textLayout = null;
        try {
            l b2 = l.b(this.f2425x, this.I, (int) availableWidth);
            b2.d(TextUtils.TruncateAt.END);
            b2.g(isRtl);
            b2.c(Layout.Alignment.ALIGN_NORMAL);
            b2.f(false);
            b2.i(maxLines);
            b2.h(0.0f, 1.0f);
            b2.e(1);
            textLayout = b2.a();
        } catch (k e2) {
            Log.e("CollapsingTextHelper", e2.getCause().getMessage(), e2);
        }
        h.e(textLayout);
        return textLayout;
    }

    public void F() {
        G(false);
    }

    public void G(boolean forceRecalculate) {
        if ((this.f2402a.getHeight() > 0 && this.f2402a.getWidth() > 0) || forceRecalculate) {
            b(forceRecalculate);
            d();
        }
    }

    public void b0(CharSequence text) {
        if (text == null || !TextUtils.equals(this.f2425x, text)) {
            this.f2425x = text;
            this.f2426y = null;
            j();
            F();
        }
    }

    public final void j() {
        Bitmap bitmap = this.C;
        if (bitmap != null) {
            bitmap.recycle();
            this.C = null;
        }
    }

    public static boolean z(float value, float targetValue) {
        return Math.abs(value - targetValue) < 0.001f;
    }

    public ColorStateList n() {
        return this.f2414m;
    }

    public static int a(int color1, int color2, float ratio) {
        float inverseRatio = 1.0f - ratio;
        float a2 = (Color.alpha(color1) * inverseRatio) + (Color.alpha(color2) * ratio);
        float r2 = (Color.red(color1) * inverseRatio) + (Color.red(color2) * ratio);
        float g2 = (Color.green(color1) * inverseRatio) + (Color.green(color2) * ratio);
        float b2 = (Color.blue(color1) * inverseRatio) + (Color.blue(color2) * ratio);
        return Color.argb((int) a2, (int) r2, (int) g2, (int) b2);
    }

    public static float D(float startValue, float endValue, float fraction, TimeInterpolator interpolator) {
        if (interpolator != null) {
            fraction = interpolator.getInterpolation(fraction);
        }
        return w0.a.a(startValue, endValue, fraction);
    }

    public static boolean H(Rect r2, int left, int top, int right, int bottom) {
        return r2.left == left && r2.top == top && r2.right == right && r2.bottom == bottom;
    }
}
