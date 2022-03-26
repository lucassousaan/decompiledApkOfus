package q1;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Looper;
import android.util.AttributeSet;
import android.util.Log;
import com.example.helloworld.R;
import e0.c;
import java.util.BitSet;
import p1.a;

/* loaded from: classes.dex */
public class j extends Drawable implements d0 {

    /* renamed from: x */
    public static final String f3326x = j.class.getSimpleName();

    /* renamed from: y */
    public static final Paint f3327y = new Paint(1);

    /* renamed from: b */
    public i f3328b;

    /* renamed from: c */
    public final b0[] f3329c;

    /* renamed from: d */
    public final b0[] f3330d;

    /* renamed from: e */
    public final BitSet f3331e;

    /* renamed from: f */
    public boolean f3332f;

    /* renamed from: g */
    public final Matrix f3333g;

    /* renamed from: h */
    public final Path f3334h;

    /* renamed from: i */
    public final Path f3335i;

    /* renamed from: j */
    public final RectF f3336j;

    /* renamed from: k */
    public final RectF f3337k;

    /* renamed from: l */
    public final Region f3338l;

    /* renamed from: m */
    public final Region f3339m;

    /* renamed from: n */
    public q f3340n;

    /* renamed from: o */
    public final Paint f3341o;

    /* renamed from: p */
    public final Paint f3342p;

    /* renamed from: q */
    public final a f3343q;

    /* renamed from: r */
    public final s f3344r;

    /* renamed from: s */
    public final u f3345s;

    /* renamed from: t */
    public PorterDuffColorFilter f3346t;

    /* renamed from: u */
    public PorterDuffColorFilter f3347u;

    /* renamed from: v */
    public final RectF f3348v;

    /* renamed from: w */
    public boolean f3349w;

    public /* synthetic */ j(i x02, g x1) {
        this(x02);
    }

    public static /* synthetic */ BitSet a(j x02) {
        return x02.f3331e;
    }

    public static /* synthetic */ b0[] b(j x02) {
        return x02.f3329c;
    }

    public static /* synthetic */ b0[] c(j x02) {
        return x02.f3330d;
    }

    public static j l(Context context, float elevation) {
        int colorSurface = f1.a.b(context, R.attr.colorSurface, j.class.getSimpleName());
        j materialShapeDrawable = new j();
        materialShapeDrawable.J(context);
        materialShapeDrawable.T(ColorStateList.valueOf(colorSurface));
        materialShapeDrawable.S(elevation);
        return materialShapeDrawable;
    }

    public j() {
        this(new q());
    }

    public j(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        this(q.e(context, attrs, defStyleAttr, defStyleRes).m());
    }

    public j(q shapeAppearanceModel) {
        this(new i(shapeAppearanceModel, null));
    }

    public j(i drawableState) {
        this.f3329c = new b0[4];
        this.f3330d = new b0[4];
        this.f3331e = new BitSet(8);
        this.f3333g = new Matrix();
        this.f3334h = new Path();
        this.f3335i = new Path();
        this.f3336j = new RectF();
        this.f3337k = new RectF();
        this.f3338l = new Region();
        this.f3339m = new Region();
        Paint paint = new Paint(1);
        this.f3341o = paint;
        Paint paint2 = new Paint(1);
        this.f3342p = paint2;
        this.f3343q = new a();
        this.f3345s = Looper.getMainLooper().getThread() == Thread.currentThread() ? u.k() : new u();
        this.f3348v = new RectF();
        this.f3349w = true;
        this.f3328b = drawableState;
        paint2.setStyle(Paint.Style.STROKE);
        paint.setStyle(Paint.Style.FILL);
        Paint paint3 = f3327y;
        paint3.setColor(-1);
        paint3.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        c0();
        b0(getState());
        this.f3344r = new g(this);
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable.ConstantState getConstantState() {
        return this.f3328b;
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable mutate() {
        i newDrawableState = new i(this.f3328b);
        this.f3328b = newDrawableState;
        return this;
    }

    public static int O(int paintAlpha, int alpha) {
        int scale = (alpha >>> 7) + alpha;
        return (paintAlpha * scale) >>> 8;
    }

    @Override // q1.d0
    public void setShapeAppearanceModel(q shapeAppearanceModel) {
        this.f3328b.f3304a = shapeAppearanceModel;
        invalidateSelf();
    }

    public q A() {
        return this.f3328b.f3304a;
    }

    public void T(ColorStateList fillColor) {
        i iVar = this.f3328b;
        if (iVar.f3307d != fillColor) {
            iVar.f3307d = fillColor;
            onStateChange(getState());
        }
    }

    public ColorStateList w() {
        return this.f3328b.f3307d;
    }

    public void Z(ColorStateList strokeColor) {
        i iVar = this.f3328b;
        if (iVar.f3308e != strokeColor) {
            iVar.f3308e = strokeColor;
            onStateChange(getState());
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintMode(PorterDuff.Mode tintMode) {
        i iVar = this.f3328b;
        if (iVar.f3311h != tintMode) {
            iVar.f3311h = tintMode;
            c0();
            K();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintList(ColorStateList tintList) {
        this.f3328b.f3310g = tintList;
        c0();
        K();
    }

    @Override // android.graphics.drawable.Drawable
    public void setTint(int tintColor) {
        setTintList(ColorStateList.valueOf(tintColor));
    }

    public void X(float strokeWidth, int strokeColor) {
        a0(strokeWidth);
        Z(ColorStateList.valueOf(strokeColor));
    }

    public void Y(float strokeWidth, ColorStateList strokeColor) {
        a0(strokeWidth);
        Z(strokeColor);
    }

    public void a0(float strokeWidth) {
        this.f3328b.f3315l = strokeWidth;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int alpha) {
        i iVar = this.f3328b;
        if (iVar.f3316m != alpha) {
            iVar.f3316m = alpha;
            K();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f3328b.f3306c = colorFilter;
        K();
    }

    @Override // android.graphics.drawable.Drawable
    public Region getTransparentRegion() {
        Rect bounds = getBounds();
        this.f3338l.set(bounds);
        f(t(), this.f3334h);
        this.f3339m.setPath(this.f3334h, this.f3338l);
        this.f3338l.op(this.f3339m, Region.Op.DIFFERENCE);
        return this.f3338l;
    }

    public RectF t() {
        this.f3336j.set(getBounds());
        return this.f3336j;
    }

    public void R(c cornerSize) {
        setShapeAppearanceModel(this.f3328b.f3304a.x(cornerSize));
    }

    @Override // android.graphics.drawable.Drawable
    public boolean getPadding(Rect padding) {
        Rect rect = this.f3328b.f3312i;
        if (rect == null) {
            return super.getPadding(padding);
        }
        padding.set(rect);
        return true;
    }

    public void V(int left, int top, int right, int bottom) {
        i iVar = this.f3328b;
        if (iVar.f3312i == null) {
            iVar.f3312i = new Rect();
        }
        this.f3328b.f3312i.set(left, top, right, bottom);
        invalidateSelf();
    }

    public boolean L() {
        i1.a aVar = this.f3328b.f3305b;
        return aVar != null && aVar.d();
    }

    public void J(Context context) {
        this.f3328b.f3305b = new i1.a(context);
        d0();
    }

    public int k(int backgroundColor) {
        float elevation = F() + x();
        i1.a aVar = this.f3328b.f3305b;
        return aVar != null ? aVar.c(backgroundColor, elevation) : backgroundColor;
    }

    public void U(float interpolation) {
        i iVar = this.f3328b;
        if (iVar.f3314k != interpolation) {
            iVar.f3314k = interpolation;
            this.f3332f = true;
            invalidateSelf();
        }
    }

    public float x() {
        return this.f3328b.f3317n;
    }

    public void W(float parentAbsoluteElevation) {
        i iVar = this.f3328b;
        if (iVar.f3317n != parentAbsoluteElevation) {
            iVar.f3317n = parentAbsoluteElevation;
            d0();
        }
    }

    public float v() {
        return this.f3328b.f3318o;
    }

    public void S(float elevation) {
        i iVar = this.f3328b;
        if (iVar.f3318o != elevation) {
            iVar.f3318o = elevation;
            d0();
        }
    }

    public float E() {
        return this.f3328b.f3319p;
    }

    public float F() {
        return v() + E();
    }

    public final void d0() {
        float z2 = F();
        this.f3328b.f3321r = (int) Math.ceil(0.75f * z2);
        this.f3328b.f3322s = (int) Math.ceil(0.25f * z2);
        c0();
        K();
    }

    public boolean Q() {
        return !M() && !this.f3334h.isConvex() && Build.VERSION.SDK_INT < 29;
    }

    @Override // android.graphics.drawable.Drawable
    public void invalidateSelf() {
        this.f3332f = true;
        super.invalidateSelf();
    }

    public final void K() {
        super.invalidateSelf();
    }

    public final boolean G() {
        i iVar = this.f3328b;
        int i2 = iVar.f3320q;
        return i2 != 1 && iVar.f3321r > 0 && (i2 == 2 || Q());
    }

    public final boolean H() {
        Paint.Style style = this.f3328b.f3325v;
        return style == Paint.Style.FILL_AND_STROKE || style == Paint.Style.FILL;
    }

    public final boolean I() {
        Paint.Style style = this.f3328b.f3325v;
        return (style == Paint.Style.FILL_AND_STROKE || style == Paint.Style.STROKE) && this.f3342p.getStrokeWidth() > 0.0f;
    }

    @Override // android.graphics.drawable.Drawable
    public void onBoundsChange(Rect bounds) {
        this.f3332f = true;
        super.onBoundsChange(bounds);
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        this.f3341o.setColorFilter(this.f3346t);
        int prevAlpha = this.f3341o.getAlpha();
        this.f3341o.setAlpha(O(prevAlpha, this.f3328b.f3316m));
        this.f3342p.setColorFilter(this.f3347u);
        this.f3342p.setStrokeWidth(this.f3328b.f3315l);
        int prevStrokeAlpha = this.f3342p.getAlpha();
        this.f3342p.setAlpha(O(prevStrokeAlpha, this.f3328b.f3316m));
        if (this.f3332f) {
            h();
            f(t(), this.f3334h);
            this.f3332f = false;
        }
        N(canvas);
        if (H()) {
            n(canvas);
        }
        if (I()) {
            q(canvas);
        }
        this.f3341o.setAlpha(prevAlpha);
        this.f3342p.setAlpha(prevStrokeAlpha);
    }

    public final void N(Canvas canvas) {
        if (G()) {
            canvas.save();
            P(canvas);
            if (!this.f3349w) {
                m(canvas);
                canvas.restore();
                return;
            }
            int pathExtraWidth = (int) (this.f3348v.width() - getBounds().width());
            int pathExtraHeight = (int) (this.f3348v.height() - getBounds().height());
            if (pathExtraWidth < 0 || pathExtraHeight < 0) {
                throw new IllegalStateException("Invalid shadow bounds. Check that the treatments result in a valid path.");
            }
            Bitmap shadowLayer = Bitmap.createBitmap(((int) this.f3348v.width()) + (this.f3328b.f3321r * 2) + pathExtraWidth, ((int) this.f3348v.height()) + (this.f3328b.f3321r * 2) + pathExtraHeight, Bitmap.Config.ARGB_8888);
            Canvas shadowCanvas = new Canvas(shadowLayer);
            float shadowLeft = (getBounds().left - this.f3328b.f3321r) - pathExtraWidth;
            float shadowTop = (getBounds().top - this.f3328b.f3321r) - pathExtraHeight;
            shadowCanvas.translate(-shadowLeft, -shadowTop);
            m(shadowCanvas);
            canvas.drawBitmap(shadowLayer, shadowLeft, shadowTop, (Paint) null);
            shadowLayer.recycle();
            canvas.restore();
        }
    }

    public void o(Canvas canvas, Paint paint, Path path, RectF bounds) {
        p(canvas, paint, path, this.f3328b.f3304a, bounds);
    }

    public final void p(Canvas canvas, Paint paint, Path path, q shapeAppearanceModel, RectF bounds) {
        if (shapeAppearanceModel.u(bounds)) {
            float cornerSize = shapeAppearanceModel.t().a(bounds) * this.f3328b.f3314k;
            canvas.drawRoundRect(bounds, cornerSize, cornerSize, paint);
            return;
        }
        canvas.drawPath(path, paint);
    }

    public final void n(Canvas canvas) {
        p(canvas, this.f3341o, this.f3334h, this.f3328b.f3304a, t());
    }

    public final void q(Canvas canvas) {
        p(canvas, this.f3342p, this.f3335i, this.f3340n, u());
    }

    public final void P(Canvas canvas) {
        int shadowOffsetX = y();
        int shadowOffsetY = z();
        canvas.translate(shadowOffsetX, shadowOffsetY);
    }

    public final void m(Canvas canvas) {
        if (this.f3331e.cardinality() > 0) {
            Log.w(f3326x, "Compatibility shadow requested but can't be drawn for all operations in this shape.");
        }
        if (this.f3328b.f3322s != 0) {
            canvas.drawPath(this.f3334h, this.f3343q.c());
        }
        for (int index = 0; index < 4; index++) {
            this.f3329c[index].b(this.f3343q, this.f3328b.f3321r, canvas);
            this.f3330d[index].b(this.f3343q, this.f3328b.f3321r, canvas);
        }
        if (this.f3349w) {
            int shadowOffsetX = y();
            int shadowOffsetY = z();
            canvas.translate(-shadowOffsetX, -shadowOffsetY);
            canvas.drawPath(this.f3334h, f3327y);
            canvas.translate(shadowOffsetX, shadowOffsetY);
        }
    }

    public int y() {
        i iVar = this.f3328b;
        return (int) (iVar.f3322s * Math.sin(Math.toRadians(iVar.f3323t)));
    }

    public int z() {
        i iVar = this.f3328b;
        return (int) (iVar.f3322s * Math.cos(Math.toRadians(iVar.f3323t)));
    }

    public final void g(RectF bounds, Path path) {
        u uVar = this.f3345s;
        i iVar = this.f3328b;
        uVar.e(iVar.f3304a, iVar.f3314k, bounds, this.f3344r, path);
    }

    public final void h() {
        float strokeInsetLength = -B();
        q y2 = A().y(new h(this, strokeInsetLength));
        this.f3340n = y2;
        this.f3345s.d(y2, this.f3328b.f3314k, u(), this.f3335i);
    }

    @Override // android.graphics.drawable.Drawable
    public void getOutline(Outline outline) {
        if (this.f3328b.f3320q != 2) {
            if (M()) {
                float radius = C() * this.f3328b.f3314k;
                outline.setRoundRect(getBounds(), radius);
                return;
            }
            f(t(), this.f3334h);
            if (this.f3334h.isConvex() || Build.VERSION.SDK_INT >= 29) {
                try {
                    outline.setConvexPath(this.f3334h);
                } catch (IllegalArgumentException e2) {
                }
            }
        }
    }

    public final void f(RectF bounds, Path path) {
        g(bounds, path);
        if (this.f3328b.f3313j != 1.0f) {
            this.f3333g.reset();
            Matrix matrix = this.f3333g;
            float f2 = this.f3328b.f3313j;
            matrix.setScale(f2, f2, bounds.width() / 2.0f, bounds.height() / 2.0f);
            path.transform(this.f3333g);
        }
        path.computeBounds(this.f3348v, true);
    }

    public final boolean c0() {
        PorterDuffColorFilter originalTintFilter = this.f3346t;
        PorterDuffColorFilter originalStrokeTintFilter = this.f3347u;
        i iVar = this.f3328b;
        this.f3346t = j(iVar.f3310g, iVar.f3311h, this.f3341o, true);
        i iVar2 = this.f3328b;
        this.f3347u = j(iVar2.f3309f, iVar2.f3311h, this.f3342p, false);
        i iVar3 = this.f3328b;
        if (iVar3.f3324u) {
            this.f3343q.d(iVar3.f3310g.getColorForState(getState(), 0));
        }
        if (!c.a(originalTintFilter, this.f3346t) || !c.a(originalStrokeTintFilter, this.f3347u)) {
            return true;
        }
        return false;
    }

    public final PorterDuffColorFilter j(ColorStateList tintList, PorterDuff.Mode tintMode, Paint paint, boolean requiresElevationOverlay) {
        if (tintList == null || tintMode == null) {
            return e(paint, requiresElevationOverlay);
        }
        return i(tintList, tintMode, requiresElevationOverlay);
    }

    public final PorterDuffColorFilter e(Paint paint, boolean requiresElevationOverlay) {
        int paintColor;
        int tintColor;
        if (!requiresElevationOverlay || (tintColor = k((paintColor = paint.getColor()))) == paintColor) {
            return null;
        }
        return new PorterDuffColorFilter(tintColor, PorterDuff.Mode.SRC_IN);
    }

    public final PorterDuffColorFilter i(ColorStateList tintList, PorterDuff.Mode tintMode, boolean requiresElevationOverlay) {
        int tintColor = tintList.getColorForState(getState(), 0);
        if (requiresElevationOverlay) {
            tintColor = k(tintColor);
        }
        return new PorterDuffColorFilter(tintColor, tintMode);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        ColorStateList colorStateList3;
        ColorStateList colorStateList4;
        return super.isStateful() || ((colorStateList = this.f3328b.f3310g) != null && colorStateList.isStateful()) || (((colorStateList2 = this.f3328b.f3309f) != null && colorStateList2.isStateful()) || (((colorStateList3 = this.f3328b.f3308e) != null && colorStateList3.isStateful()) || ((colorStateList4 = this.f3328b.f3307d) != null && colorStateList4.isStateful())));
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onStateChange(int[] state) {
        boolean paintColorChanged = b0(state);
        boolean tintFilterChanged = c0();
        boolean invalidateSelf = paintColorChanged || tintFilterChanged;
        if (invalidateSelf) {
            invalidateSelf();
        }
        return invalidateSelf;
    }

    public final boolean b0(int[] state) {
        int previousStrokeColor;
        int newStrokeColor;
        int previousFillColor;
        int newFillColor;
        boolean invalidateSelf = false;
        if (!(this.f3328b.f3307d == null || previousFillColor == (newFillColor = this.f3328b.f3307d.getColorForState(state, (previousFillColor = this.f3341o.getColor()))))) {
            this.f3341o.setColor(newFillColor);
            invalidateSelf = true;
        }
        if (this.f3328b.f3308e == null || previousStrokeColor == (newStrokeColor = this.f3328b.f3308e.getColorForState(state, (previousStrokeColor = this.f3342p.getColor())))) {
            return invalidateSelf;
        }
        this.f3342p.setColor(newStrokeColor);
        return true;
    }

    public final float B() {
        if (I()) {
            return this.f3342p.getStrokeWidth() / 2.0f;
        }
        return 0.0f;
    }

    public final RectF u() {
        this.f3337k.set(t());
        float inset = B();
        this.f3337k.inset(inset, inset);
        return this.f3337k;
    }

    public float C() {
        return this.f3328b.f3304a.r().a(t());
    }

    public float D() {
        return this.f3328b.f3304a.t().a(t());
    }

    public float r() {
        return this.f3328b.f3304a.j().a(t());
    }

    public float s() {
        return this.f3328b.f3304a.l().a(t());
    }

    public boolean M() {
        return this.f3328b.f3304a.u(t());
    }
}
