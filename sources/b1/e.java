package b1;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import com.example.helloworld.R;
import com.google.android.material.button.MaterialButton;
import f0.c1;
import l1.w;
import n1.d;
import q1.d0;
import q1.j;
import q1.q;
import v0.a;

/* JADX WARN: Classes with same name are omitted:
  
 */
/* loaded from: classes.dex */
public class e {

    /* renamed from: t  reason: collision with root package name */
    public static final boolean f1138t = true;

    /* renamed from: a  reason: collision with root package name */
    public final MaterialButton f1139a;

    /* renamed from: b  reason: collision with root package name */
    public q f1140b;

    /* renamed from: c  reason: collision with root package name */
    public int f1141c;

    /* renamed from: d  reason: collision with root package name */
    public int f1142d;

    /* renamed from: e  reason: collision with root package name */
    public int f1143e;

    /* renamed from: f  reason: collision with root package name */
    public int f1144f;

    /* renamed from: g  reason: collision with root package name */
    public int f1145g;

    /* renamed from: h  reason: collision with root package name */
    public int f1146h;

    /* renamed from: i  reason: collision with root package name */
    public PorterDuff.Mode f1147i;

    /* renamed from: j  reason: collision with root package name */
    public ColorStateList f1148j;

    /* renamed from: k  reason: collision with root package name */
    public ColorStateList f1149k;

    /* renamed from: l  reason: collision with root package name */
    public ColorStateList f1150l;

    /* renamed from: m  reason: collision with root package name */
    public Drawable f1151m;

    /* renamed from: n  reason: collision with root package name */
    public boolean f1152n = false;

    /* renamed from: o  reason: collision with root package name */
    public boolean f1153o = false;

    /* renamed from: p  reason: collision with root package name */
    public boolean f1154p = false;

    /* renamed from: q  reason: collision with root package name */
    public boolean f1155q;

    /* renamed from: r  reason: collision with root package name */
    public LayerDrawable f1156r;

    /* renamed from: s  reason: collision with root package name */
    public int f1157s;

    public e(MaterialButton button, q shapeAppearanceModel) {
        this.f1139a = button;
        this.f1140b = shapeAppearanceModel;
    }

    public void q(TypedArray attributes) {
        int[] iArr = a.f3604a;
        this.f1141c = attributes.getDimensionPixelOffset(1, 0);
        this.f1142d = attributes.getDimensionPixelOffset(2, 0);
        this.f1143e = attributes.getDimensionPixelOffset(3, 0);
        this.f1144f = attributes.getDimensionPixelOffset(4, 0);
        if (attributes.hasValue(8)) {
            int dimensionPixelSize = attributes.getDimensionPixelSize(8, -1);
            this.f1145g = dimensionPixelSize;
            y(this.f1140b.w(dimensionPixelSize));
            this.f1154p = true;
        }
        this.f1146h = attributes.getDimensionPixelSize(20, 0);
        this.f1147i = w.e(attributes.getInt(7, -1), PorterDuff.Mode.SRC_IN);
        this.f1148j = d.a(this.f1139a.getContext(), attributes, 6);
        this.f1149k = d.a(this.f1139a.getContext(), attributes, 19);
        this.f1150l = d.a(this.f1139a.getContext(), attributes, 16);
        this.f1155q = attributes.getBoolean(5, false);
        this.f1157s = attributes.getDimensionPixelSize(9, 0);
        int paddingStart = c1.F(this.f1139a);
        int paddingTop = this.f1139a.getPaddingTop();
        int paddingEnd = c1.E(this.f1139a);
        int paddingBottom = this.f1139a.getPaddingBottom();
        if (attributes.hasValue(0)) {
            s();
        } else {
            F();
        }
        c1.v0(this.f1139a, this.f1141c + paddingStart, this.f1143e + paddingTop, this.f1142d + paddingEnd, this.f1144f + paddingBottom);
    }

    public final void F() {
        this.f1139a.setInternalBackground(a());
        j materialShapeDrawable = f();
        if (materialShapeDrawable != null) {
            materialShapeDrawable.S(this.f1157s);
        }
    }

    public void s() {
        this.f1153o = true;
        this.f1139a.setSupportBackgroundTintList(this.f1148j);
        this.f1139a.setSupportBackgroundTintMode(this.f1147i);
    }

    public boolean o() {
        return this.f1153o;
    }

    public final InsetDrawable I(Drawable drawable) {
        return new InsetDrawable(drawable, this.f1141c, this.f1143e, this.f1142d, this.f1144f);
    }

    public void C(ColorStateList tintList) {
        if (this.f1148j != tintList) {
            this.f1148j = tintList;
            if (f() != null) {
                y.a.i(f(), this.f1148j);
            }
        }
    }

    public ColorStateList l() {
        return this.f1148j;
    }

    public void D(PorterDuff.Mode mode) {
        if (this.f1147i != mode) {
            this.f1147i = mode;
            if (f() != null && this.f1147i != null) {
                y.a.j(f(), this.f1147i);
            }
        }
    }

    public PorterDuff.Mode m() {
        return this.f1147i;
    }

    public void z(boolean shouldDrawSurfaceColorStroke) {
        this.f1152n = shouldDrawSurfaceColorStroke;
        H();
    }

    public final Drawable a() {
        int i2;
        j backgroundDrawable = new j(this.f1140b);
        Context context = this.f1139a.getContext();
        backgroundDrawable.J(context);
        y.a.i(backgroundDrawable, this.f1148j);
        PorterDuff.Mode mode = this.f1147i;
        if (mode != null) {
            y.a.j(backgroundDrawable, mode);
        }
        backgroundDrawable.Y(this.f1146h, this.f1149k);
        j surfaceColorStrokeDrawable = new j(this.f1140b);
        surfaceColorStrokeDrawable.setTint(0);
        float f2 = this.f1146h;
        if (this.f1152n) {
            i2 = f1.a.c(this.f1139a, R.attr.colorSurface);
        } else {
            i2 = 0;
        }
        surfaceColorStrokeDrawable.X(f2, i2);
        j jVar = new j(this.f1140b);
        this.f1151m = jVar;
        y.a.h(jVar, -1);
        RippleDrawable rippleDrawable = new RippleDrawable(o1.a.a(this.f1150l), I(new LayerDrawable(new Drawable[]{surfaceColorStrokeDrawable, backgroundDrawable})), this.f1151m);
        this.f1156r = rippleDrawable;
        return rippleDrawable;
    }

    public void r(int color) {
        if (f() != null) {
            f().setTint(color);
        }
    }

    public void x(ColorStateList rippleColor) {
        if (this.f1150l != rippleColor) {
            this.f1150l = rippleColor;
            if (this.f1139a.getBackground() instanceof RippleDrawable) {
                ((RippleDrawable) this.f1139a.getBackground()).setColor(o1.a.a(rippleColor));
            }
        }
    }

    public ColorStateList h() {
        return this.f1150l;
    }

    public void A(ColorStateList strokeColor) {
        if (this.f1149k != strokeColor) {
            this.f1149k = strokeColor;
            H();
        }
    }

    public ColorStateList j() {
        return this.f1149k;
    }

    public void B(int strokeWidth) {
        if (this.f1146h != strokeWidth) {
            this.f1146h = strokeWidth;
            H();
        }
    }

    public int k() {
        return this.f1146h;
    }

    public final void H() {
        j materialShapeDrawable = f();
        j surfaceColorStrokeDrawable = n();
        if (materialShapeDrawable != null) {
            materialShapeDrawable.Y(this.f1146h, this.f1149k);
            if (surfaceColorStrokeDrawable != null) {
                surfaceColorStrokeDrawable.X(this.f1146h, this.f1152n ? f1.a.c(this.f1139a, R.attr.colorSurface) : 0);
            }
        }
    }

    public void u(int cornerRadius) {
        if (!this.f1154p || this.f1145g != cornerRadius) {
            this.f1145g = cornerRadius;
            this.f1154p = true;
            y(this.f1140b.w(cornerRadius));
        }
    }

    public int b() {
        return this.f1145g;
    }

    public final j g(boolean getSurfaceColorStrokeDrawable) {
        LayerDrawable layerDrawable = this.f1156r;
        if (layerDrawable == null || layerDrawable.getNumberOfLayers() <= 0) {
            return null;
        }
        InsetDrawable insetDrawable = (InsetDrawable) this.f1156r.getDrawable(0);
        LayerDrawable layerDrawable2 = (LayerDrawable) insetDrawable.getDrawable();
        return (j) layerDrawable2.getDrawable(!getSurfaceColorStrokeDrawable ? 1 : 0);
    }

    public j f() {
        return g(false);
    }

    public void t(boolean checkable) {
        this.f1155q = checkable;
    }

    public boolean p() {
        return this.f1155q;
    }

    public final j n() {
        return g(true);
    }

    public final void G(q shapeAppearanceModel) {
        if (f() != null) {
            f().setShapeAppearanceModel(shapeAppearanceModel);
        }
        if (n() != null) {
            n().setShapeAppearanceModel(shapeAppearanceModel);
        }
        if (e() != null) {
            e().setShapeAppearanceModel(shapeAppearanceModel);
        }
    }

    public d0 e() {
        LayerDrawable layerDrawable = this.f1156r;
        if (layerDrawable == null || layerDrawable.getNumberOfLayers() <= 1) {
            return null;
        }
        if (this.f1156r.getNumberOfLayers() > 2) {
            return (d0) this.f1156r.getDrawable(2);
        }
        return (d0) this.f1156r.getDrawable(1);
    }

    public void y(q shapeAppearanceModel) {
        this.f1140b = shapeAppearanceModel;
        G(shapeAppearanceModel);
    }

    public q i() {
        return this.f1140b;
    }

    public void v(int newInsetBottom) {
        E(this.f1143e, newInsetBottom);
    }

    public int c() {
        return this.f1144f;
    }

    public void w(int newInsetTop) {
        E(newInsetTop, this.f1144f);
    }

    public final void E(int newInsetTop, int newInsetBottom) {
        int paddingStart = c1.F(this.f1139a);
        int paddingTop = this.f1139a.getPaddingTop();
        int paddingEnd = c1.E(this.f1139a);
        int paddingBottom = this.f1139a.getPaddingBottom();
        int oldInsetTop = this.f1143e;
        int oldInsetBottom = this.f1144f;
        this.f1144f = newInsetBottom;
        this.f1143e = newInsetTop;
        if (!this.f1153o) {
            F();
        }
        c1.v0(this.f1139a, paddingStart, (paddingTop + newInsetTop) - oldInsetTop, paddingEnd, (paddingBottom + newInsetBottom) - oldInsetBottom);
    }

    public int d() {
        return this.f1143e;
    }
}
