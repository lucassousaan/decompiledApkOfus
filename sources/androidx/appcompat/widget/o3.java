package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.util.Log;
import android.util.TypedValue;
import android.view.View;
import x.a;

/* JADX WARN: Classes with same name are omitted:
  
 */
/* loaded from: classes.dex */
public abstract class o3 {

    /* renamed from: a  reason: collision with root package name */
    public static final ThreadLocal f473a = new ThreadLocal();

    /* renamed from: b  reason: collision with root package name */
    public static final int[] f474b = {-16842910};

    /* renamed from: c  reason: collision with root package name */
    public static final int[] f475c = {16842908};

    /* renamed from: d  reason: collision with root package name */
    public static final int[] f476d = {16842919};

    /* renamed from: e  reason: collision with root package name */
    public static final int[] f477e = {16842912};

    /* renamed from: f  reason: collision with root package name */
    public static final int[] f478f = new int[0];

    /* renamed from: g  reason: collision with root package name */
    public static final int[] f479g = new int[1];

    static {
        new int[1][0] = 16843518;
        new int[1][0] = 16842913;
        int[] iArr = {-16842919, -16842908};
    }

    public static int c(Context context, int attr) {
        int[] iArr = f479g;
        iArr[0] = attr;
        s3 a2 = s3.u(context, null, iArr);
        try {
            return a2.b(0, 0);
        } finally {
            a2.w();
        }
    }

    public static ColorStateList e(Context context, int attr) {
        int[] iArr = f479g;
        iArr[0] = attr;
        s3 a2 = s3.u(context, null, iArr);
        try {
            return a2.c(0);
        } finally {
            a2.w();
        }
    }

    public static int b(Context context, int attr) {
        ColorStateList csl = e(context, attr);
        if (csl != null && csl.isStateful()) {
            return csl.getColorForState(f474b, csl.getDefaultColor());
        }
        TypedValue tv = f();
        context.getTheme().resolveAttribute(16842803, tv, true);
        float disabledAlpha = tv.getFloat();
        return d(context, attr, disabledAlpha);
    }

    public static TypedValue f() {
        ThreadLocal threadLocal = f473a;
        TypedValue typedValue = (TypedValue) threadLocal.get();
        if (typedValue != null) {
            return typedValue;
        }
        TypedValue typedValue2 = new TypedValue();
        threadLocal.set(typedValue2);
        return typedValue2;
    }

    public static int d(Context context, int attr, float alpha) {
        int color = c(context, attr);
        int originalAlpha = Color.alpha(color);
        return a.d(color, Math.round(originalAlpha * alpha));
    }

    public static void a(View view, Context context) {
        TypedArray a2 = context.obtainStyledAttributes(c.a.f1176j);
        try {
            int[] iArr = c.a.f1167a;
            if (!a2.hasValue(117)) {
                Log.e("ThemeUtils", "View " + view.getClass() + " is an AppCompat widget that can only be used with a Theme.AppCompat theme (or descendant).");
            }
        } finally {
            a2.recycle();
        }
    }
}
