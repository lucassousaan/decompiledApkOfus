package q1;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import v0.a;

/* JADX WARN: Classes with same name are omitted:
  
 */
/* loaded from: classes.dex */
public class q {

    /* renamed from: a  reason: collision with root package name */
    public d f3364a;

    /* renamed from: b  reason: collision with root package name */
    public d f3365b;

    /* renamed from: c  reason: collision with root package name */
    public d f3366c;

    /* renamed from: d  reason: collision with root package name */
    public d f3367d;

    /* renamed from: e  reason: collision with root package name */
    public c f3368e;

    /* renamed from: f  reason: collision with root package name */
    public c f3369f;

    /* renamed from: g  reason: collision with root package name */
    public c f3370g;

    /* renamed from: h  reason: collision with root package name */
    public c f3371h;

    /* renamed from: i  reason: collision with root package name */
    public f f3372i;

    /* renamed from: j  reason: collision with root package name */
    public f f3373j;

    /* renamed from: k  reason: collision with root package name */
    public f f3374k;

    /* renamed from: l  reason: collision with root package name */
    public f f3375l;

    public static o a() {
        return new o();
    }

    public static o e(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        return f(context, attrs, defStyleAttr, defStyleRes, 0);
    }

    public static o f(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes, int defaultCornerSize) {
        return g(context, attrs, defStyleAttr, defStyleRes, new a(defaultCornerSize));
    }

    public static o g(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes, c defaultCornerSize) {
        TypedArray a2 = context.obtainStyledAttributes(attrs, a.f3620q, defStyleAttr, defStyleRes);
        int[] iArr = a.f3604a;
        int shapeAppearanceResId = a2.getResourceId(0, 0);
        int shapeAppearanceOverlayResId = a2.getResourceId(1, 0);
        a2.recycle();
        return d(context, shapeAppearanceResId, shapeAppearanceOverlayResId, defaultCornerSize);
    }

    public static o b(Context context, int shapeAppearanceResId, int shapeAppearanceOverlayResId) {
        return c(context, shapeAppearanceResId, shapeAppearanceOverlayResId, 0);
    }

    public static o c(Context context, int shapeAppearanceResId, int shapeAppearanceOverlayResId, int defaultCornerSize) {
        return d(context, shapeAppearanceResId, shapeAppearanceOverlayResId, new a(defaultCornerSize));
    }

    public static o d(Context context, int shapeAppearanceResId, int shapeAppearanceOverlayResId, c defaultCornerSize) {
        if (shapeAppearanceOverlayResId != 0) {
            context = new ContextThemeWrapper(context, shapeAppearanceResId);
            shapeAppearanceResId = shapeAppearanceOverlayResId;
        }
        TypedArray a2 = context.obtainStyledAttributes(shapeAppearanceResId, a.f3626w);
        try {
            int[] iArr = a.f3604a;
            int cornerFamily = a2.getInt(0, 0);
            int cornerFamilyTopLeft = a2.getInt(3, cornerFamily);
            int cornerFamilyTopRight = a2.getInt(4, cornerFamily);
            int cornerFamilyBottomRight = a2.getInt(2, cornerFamily);
            int cornerFamilyBottomLeft = a2.getInt(1, cornerFamily);
            c cornerSize = m(a2, 5, defaultCornerSize);
            c cornerSizeTopLeft = m(a2, 8, cornerSize);
            c cornerSizeTopRight = m(a2, 9, cornerSize);
            c cornerSizeBottomRight = m(a2, 7, cornerSize);
            c cornerSizeBottomLeft = m(a2, 6, cornerSize);
            o oVar = new o();
            oVar.y(cornerFamilyTopLeft, cornerSizeTopLeft);
            oVar.C(cornerFamilyTopRight, cornerSizeTopRight);
            oVar.u(cornerFamilyBottomRight, cornerSizeBottomRight);
            oVar.q(cornerFamilyBottomLeft, cornerSizeBottomLeft);
            return oVar;
        } finally {
            a2.recycle();
        }
    }

    public static c m(TypedArray a2, int index, c defaultValue) {
        TypedValue value = a2.peekValue(index);
        if (value == null) {
            return defaultValue;
        }
        int i2 = value.type;
        if (i2 == 5) {
            return new a(TypedValue.complexToDimensionPixelSize(value.data, a2.getResources().getDisplayMetrics()));
        }
        if (i2 == 6) {
            return new l(value.getFraction(1.0f, 1.0f));
        }
        return defaultValue;
    }

    static {
        new l(0.5f);
    }

    public q(o builder) {
        this.f3364a = o.a(builder);
        this.f3365b = o.e(builder);
        this.f3366c = o.f(builder);
        this.f3367d = o.g(builder);
        this.f3368e = o.h(builder);
        this.f3369f = o.i(builder);
        this.f3370g = o.j(builder);
        this.f3371h = o.k(builder);
        this.f3372i = o.l(builder);
        this.f3373j = o.b(builder);
        this.f3374k = o.c(builder);
        this.f3375l = o.d(builder);
    }

    public q() {
        this.f3364a = k.b();
        this.f3365b = k.b();
        this.f3366c = k.b();
        this.f3367d = k.b();
        this.f3368e = new a(0.0f);
        this.f3369f = new a(0.0f);
        this.f3370g = new a(0.0f);
        this.f3371h = new a(0.0f);
        this.f3372i = k.c();
        this.f3373j = k.c();
        this.f3374k = k.c();
        this.f3375l = k.c();
    }

    public d q() {
        return this.f3364a;
    }

    public d s() {
        return this.f3365b;
    }

    public d k() {
        return this.f3366c;
    }

    public d i() {
        return this.f3367d;
    }

    public c r() {
        return this.f3368e;
    }

    public c t() {
        return this.f3369f;
    }

    public c l() {
        return this.f3370g;
    }

    public c j() {
        return this.f3371h;
    }

    public f n() {
        return this.f3375l;
    }

    public f p() {
        return this.f3372i;
    }

    public f o() {
        return this.f3373j;
    }

    public f h() {
        return this.f3374k;
    }

    public o v() {
        return new o(this);
    }

    public q w(float cornerSize) {
        o v2 = v();
        v2.o(cornerSize);
        return v2.m();
    }

    public q x(c cornerSize) {
        o v2 = v();
        v2.p(cornerSize);
        return v2.m();
    }

    public q y(p op) {
        o v2 = v();
        v2.B(((h) op).a(r()));
        v2.F(((h) op).a(t()));
        v2.t(((h) op).a(j()));
        v2.x(((h) op).a(l()));
        return v2.m();
    }

    public boolean u(RectF bounds) {
        boolean hasDefaultEdges = this.f3375l.getClass().equals(f.class) && this.f3373j.getClass().equals(f.class) && this.f3372i.getClass().equals(f.class) && this.f3374k.getClass().equals(f.class);
        float cornerSize = this.f3368e.a(bounds);
        boolean cornersHaveSameSize = this.f3369f.a(bounds) == cornerSize && this.f3371h.a(bounds) == cornerSize && this.f3370g.a(bounds) == cornerSize;
        boolean hasRoundedCorners = (this.f3365b instanceof m) && (this.f3364a instanceof m) && (this.f3366c instanceof m) && (this.f3367d instanceof m);
        return hasDefaultEdges && cornersHaveSameSize && hasRoundedCorners;
    }
}
