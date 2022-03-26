package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import e.a;
import w.h;
import w.l;

/* JADX WARN: Classes with same name are omitted:
  
 */
/* loaded from: classes.dex */
public class s3 {

    /* renamed from: a  reason: collision with root package name */
    public final Context f529a;

    /* renamed from: b  reason: collision with root package name */
    public final TypedArray f530b;

    /* renamed from: c  reason: collision with root package name */
    public TypedValue f531c;

    public static s3 u(Context context, AttributeSet set, int[] attrs) {
        return new s3(context, context.obtainStyledAttributes(set, attrs));
    }

    public static s3 v(Context context, AttributeSet set, int[] attrs, int defStyleAttr, int defStyleRes) {
        return new s3(context, context.obtainStyledAttributes(set, attrs, defStyleAttr, defStyleRes));
    }

    public static s3 t(Context context, int resid, int[] attrs) {
        return new s3(context, context.obtainStyledAttributes(resid, attrs));
    }

    public s3(Context context, TypedArray array) {
        this.f529a = context;
        this.f530b = array;
    }

    public TypedArray r() {
        return this.f530b;
    }

    public Drawable g(int index) {
        int resourceId;
        if (!this.f530b.hasValue(index) || (resourceId = this.f530b.getResourceId(index, 0)) == 0) {
            return this.f530b.getDrawable(index);
        }
        return a.b(this.f529a, resourceId);
    }

    public Drawable h(int index) {
        int resourceId;
        if (!this.f530b.hasValue(index) || (resourceId = this.f530b.getResourceId(index, 0)) == 0) {
            return null;
        }
        return d0.b().d(this.f529a, resourceId, true);
    }

    public Typeface j(int index, int style, h fontCallback) {
        int resourceId = this.f530b.getResourceId(index, 0);
        if (resourceId == 0) {
            return null;
        }
        if (this.f531c == null) {
            this.f531c = new TypedValue();
        }
        return l.d(this.f529a, resourceId, this.f531c, style, fontCallback);
    }

    public CharSequence p(int index) {
        return this.f530b.getText(index);
    }

    public String o(int index) {
        return this.f530b.getString(index);
    }

    public boolean a(int index, boolean defValue) {
        return this.f530b.getBoolean(index, defValue);
    }

    public int k(int index, int defValue) {
        return this.f530b.getInt(index, defValue);
    }

    public float i(int index, float defValue) {
        return this.f530b.getFloat(index, defValue);
    }

    public int b(int index, int defValue) {
        return this.f530b.getColor(index, defValue);
    }

    public ColorStateList c(int index) {
        int resourceId;
        ColorStateList value;
        if (!this.f530b.hasValue(index) || (resourceId = this.f530b.getResourceId(index, 0)) == 0 || (value = a.a(this.f529a, resourceId)) == null) {
            return this.f530b.getColorStateList(index);
        }
        return value;
    }

    public int l(int index, int defValue) {
        return this.f530b.getInteger(index, defValue);
    }

    public float d(int index, float defValue) {
        return this.f530b.getDimension(index, defValue);
    }

    public int e(int index, int defValue) {
        return this.f530b.getDimensionPixelOffset(index, defValue);
    }

    public int f(int index, int defValue) {
        return this.f530b.getDimensionPixelSize(index, defValue);
    }

    public int m(int index, int defValue) {
        return this.f530b.getLayoutDimension(index, defValue);
    }

    public int n(int index, int defValue) {
        return this.f530b.getResourceId(index, defValue);
    }

    public CharSequence[] q(int index) {
        return this.f530b.getTextArray(index);
    }

    public boolean s(int index) {
        return this.f530b.hasValue(index);
    }

    public void w() {
        this.f530b.recycle();
    }
}
