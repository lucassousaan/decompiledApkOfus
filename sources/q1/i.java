package q1;

import android.content.res.ColorStateList;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import i1.a;

/* JADX WARN: Classes with same name are omitted:
  
 */
/* loaded from: classes.dex */
public final class i extends Drawable.ConstantState {

    /* renamed from: a  reason: collision with root package name */
    public q f3304a;

    /* renamed from: b  reason: collision with root package name */
    public a f3305b;

    /* renamed from: c  reason: collision with root package name */
    public ColorFilter f3306c;

    /* renamed from: d  reason: collision with root package name */
    public ColorStateList f3307d;

    /* renamed from: e  reason: collision with root package name */
    public ColorStateList f3308e;

    /* renamed from: f  reason: collision with root package name */
    public ColorStateList f3309f;

    /* renamed from: g  reason: collision with root package name */
    public ColorStateList f3310g;

    /* renamed from: h  reason: collision with root package name */
    public PorterDuff.Mode f3311h;

    /* renamed from: i  reason: collision with root package name */
    public Rect f3312i;

    /* renamed from: j  reason: collision with root package name */
    public float f3313j;

    /* renamed from: k  reason: collision with root package name */
    public float f3314k;

    /* renamed from: l  reason: collision with root package name */
    public float f3315l;

    /* renamed from: m  reason: collision with root package name */
    public int f3316m;

    /* renamed from: n  reason: collision with root package name */
    public float f3317n;

    /* renamed from: o  reason: collision with root package name */
    public float f3318o;

    /* renamed from: p  reason: collision with root package name */
    public float f3319p;

    /* renamed from: q  reason: collision with root package name */
    public int f3320q;

    /* renamed from: r  reason: collision with root package name */
    public int f3321r;

    /* renamed from: s  reason: collision with root package name */
    public int f3322s;

    /* renamed from: t  reason: collision with root package name */
    public int f3323t;

    /* renamed from: u  reason: collision with root package name */
    public boolean f3324u;

    /* renamed from: v  reason: collision with root package name */
    public Paint.Style f3325v;

    public i(q shapeAppearanceModel, a elevationOverlayProvider) {
        this.f3307d = null;
        this.f3308e = null;
        this.f3309f = null;
        this.f3310g = null;
        this.f3311h = PorterDuff.Mode.SRC_IN;
        this.f3312i = null;
        this.f3313j = 1.0f;
        this.f3314k = 1.0f;
        this.f3316m = 255;
        this.f3317n = 0.0f;
        this.f3318o = 0.0f;
        this.f3319p = 0.0f;
        this.f3320q = 0;
        this.f3321r = 0;
        this.f3322s = 0;
        this.f3323t = 0;
        this.f3324u = false;
        this.f3325v = Paint.Style.FILL_AND_STROKE;
        this.f3304a = shapeAppearanceModel;
        this.f3305b = elevationOverlayProvider;
    }

    public i(i orig) {
        this.f3307d = null;
        this.f3308e = null;
        this.f3309f = null;
        this.f3310g = null;
        this.f3311h = PorterDuff.Mode.SRC_IN;
        this.f3312i = null;
        this.f3313j = 1.0f;
        this.f3314k = 1.0f;
        this.f3316m = 255;
        this.f3317n = 0.0f;
        this.f3318o = 0.0f;
        this.f3319p = 0.0f;
        this.f3320q = 0;
        this.f3321r = 0;
        this.f3322s = 0;
        this.f3323t = 0;
        this.f3324u = false;
        this.f3325v = Paint.Style.FILL_AND_STROKE;
        this.f3304a = orig.f3304a;
        this.f3305b = orig.f3305b;
        this.f3315l = orig.f3315l;
        this.f3306c = orig.f3306c;
        this.f3307d = orig.f3307d;
        this.f3308e = orig.f3308e;
        this.f3311h = orig.f3311h;
        this.f3310g = orig.f3310g;
        this.f3316m = orig.f3316m;
        this.f3313j = orig.f3313j;
        this.f3322s = orig.f3322s;
        this.f3320q = orig.f3320q;
        this.f3324u = orig.f3324u;
        this.f3314k = orig.f3314k;
        this.f3317n = orig.f3317n;
        this.f3318o = orig.f3318o;
        this.f3319p = orig.f3319p;
        this.f3321r = orig.f3321r;
        this.f3323t = orig.f3323t;
        this.f3309f = orig.f3309f;
        this.f3325v = orig.f3325v;
        if (orig.f3312i != null) {
            this.f3312i = new Rect(orig.f3312i);
        }
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public Drawable newDrawable() {
        j msd = new j(this, null);
        msd.f3332f = true;
        return msd;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public int getChangingConfigurations() {
        return 0;
    }
}
