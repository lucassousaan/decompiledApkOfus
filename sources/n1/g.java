package n1;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.text.TextPaint;
import android.util.Log;
import v0.a;
import w.l;

/* JADX WARN: Classes with same name are omitted:
  
 */
/* loaded from: classes.dex */
public class g {

    /* renamed from: a  reason: collision with root package name */
    public final ColorStateList f2567a;

    /* renamed from: b  reason: collision with root package name */
    public final ColorStateList f2568b;

    /* renamed from: c  reason: collision with root package name */
    public final String f2569c;

    /* renamed from: d  reason: collision with root package name */
    public final int f2570d;

    /* renamed from: e  reason: collision with root package name */
    public final int f2571e;

    /* renamed from: f  reason: collision with root package name */
    public final float f2572f;

    /* renamed from: g  reason: collision with root package name */
    public final float f2573g;

    /* renamed from: h  reason: collision with root package name */
    public final float f2574h;

    /* renamed from: i  reason: collision with root package name */
    public final boolean f2575i;

    /* renamed from: j  reason: collision with root package name */
    public final float f2576j;

    /* renamed from: k  reason: collision with root package name */
    public float f2577k;

    /* renamed from: l  reason: collision with root package name */
    public final int f2578l;

    /* renamed from: m  reason: collision with root package name */
    public boolean f2579m = false;

    /* renamed from: n  reason: collision with root package name */
    public Typeface f2580n;

    public g(Context context, int id) {
        TypedArray a2 = context.obtainStyledAttributes(id, a.f3628y);
        int[] iArr = a.f3604a;
        this.f2577k = a2.getDimension(0, 0.0f);
        this.f2567a = d.a(context, a2, 3);
        d.a(context, a2, 4);
        d.a(context, a2, 5);
        this.f2570d = a2.getInt(2, 0);
        this.f2571e = a2.getInt(1, 1);
        int fontFamilyIndex = d.e(a2, 12, 10);
        this.f2578l = a2.getResourceId(fontFamilyIndex, 0);
        this.f2569c = a2.getString(fontFamilyIndex);
        a2.getBoolean(14, false);
        this.f2568b = d.a(context, a2, 6);
        this.f2572f = a2.getFloat(7, 0.0f);
        this.f2573g = a2.getFloat(8, 0.0f);
        this.f2574h = a2.getFloat(9, 0.0f);
        a2.recycle();
        TypedArray a3 = context.obtainStyledAttributes(id, a.f3621r);
        this.f2575i = a3.hasValue(0);
        this.f2576j = a3.getFloat(0, 0.0f);
        a3.recycle();
    }

    public Typeface f(Context context) {
        if (this.f2579m) {
            return this.f2580n;
        }
        if (!context.isRestricted()) {
            try {
                Typeface c2 = l.c(context, this.f2578l);
                this.f2580n = c2;
                if (c2 != null) {
                    this.f2580n = Typeface.create(c2, this.f2570d);
                }
            } catch (Resources.NotFoundException e2) {
            } catch (UnsupportedOperationException e3) {
            } catch (Exception e4) {
                Log.d("TextAppearance", "Error loading font " + this.f2569c, e4);
            }
        }
        d();
        this.f2579m = true;
        return this.f2580n;
    }

    public void h(Context context, i callback) {
        if (i(context)) {
            f(context);
        } else {
            d();
        }
        int i2 = this.f2578l;
        if (i2 == 0) {
            this.f2579m = true;
        }
        if (this.f2579m) {
            callback.b(this.f2580n, true);
            return;
        }
        try {
            l.e(context, i2, new e(this, callback), null);
        } catch (Resources.NotFoundException e2) {
            this.f2579m = true;
            callback.a(1);
        } catch (Exception e3) {
            Log.d("TextAppearance", "Error loading font " + this.f2569c, e3);
            this.f2579m = true;
            callback.a(-3);
        }
    }

    public void g(Context context, TextPaint textPaint, i callback) {
        l(textPaint, e());
        h(context, new f(this, textPaint, callback));
    }

    public Typeface e() {
        d();
        return this.f2580n;
    }

    public final void d() {
        String str;
        if (this.f2580n == null && (str = this.f2569c) != null) {
            this.f2580n = Typeface.create(str, this.f2570d);
        }
        if (this.f2580n == null) {
            switch (this.f2571e) {
                case 1:
                    this.f2580n = Typeface.SANS_SERIF;
                    break;
                case 2:
                    this.f2580n = Typeface.SERIF;
                    break;
                case 3:
                    this.f2580n = Typeface.MONOSPACE;
                    break;
                default:
                    this.f2580n = Typeface.DEFAULT;
                    break;
            }
            this.f2580n = Typeface.create(this.f2580n, this.f2570d);
        }
    }

    public void j(Context context, TextPaint textPaint, i callback) {
        k(context, textPaint, callback);
        ColorStateList colorStateList = this.f2567a;
        textPaint.setColor(colorStateList != null ? colorStateList.getColorForState(textPaint.drawableState, colorStateList.getDefaultColor()) : -16777216);
        float f2 = this.f2574h;
        float f3 = this.f2572f;
        float f4 = this.f2573g;
        ColorStateList colorStateList2 = this.f2568b;
        textPaint.setShadowLayer(f2, f3, f4, colorStateList2 != null ? colorStateList2.getColorForState(textPaint.drawableState, colorStateList2.getDefaultColor()) : 0);
    }

    public void k(Context context, TextPaint textPaint, i callback) {
        if (i(context)) {
            l(textPaint, f(context));
        } else {
            g(context, textPaint, callback);
        }
    }

    public void l(TextPaint textPaint, Typeface typeface) {
        textPaint.setTypeface(typeface);
        int fake = this.f2570d & (~typeface.getStyle());
        textPaint.setFakeBoldText((fake & 1) != 0);
        textPaint.setTextSkewX((fake & 2) != 0 ? -0.25f : 0.0f);
        textPaint.setTextSize(this.f2577k);
        if (this.f2575i) {
            textPaint.setLetterSpacing(this.f2576j);
        }
    }

    public final boolean i(Context context) {
        h.a();
        int i2 = this.f2578l;
        Typeface typeface = i2 != 0 ? l.a(context, i2) : null;
        return typeface != null;
    }
}
