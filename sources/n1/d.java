package n1;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.TypedValue;
import androidx.appcompat.widget.s3;
import e.a;

/* JADX WARN: Classes with same name are omitted:
  
 */
/* loaded from: classes.dex */
public abstract class d {
    public static ColorStateList a(Context context, TypedArray attributes, int index) {
        int resourceId;
        ColorStateList value;
        if (!attributes.hasValue(index) || (resourceId = attributes.getResourceId(index, 0)) == 0 || (value = a.a(context, resourceId)) == null) {
            return attributes.getColorStateList(index);
        }
        return value;
    }

    public static ColorStateList b(Context context, s3 attributes, int index) {
        int resourceId;
        ColorStateList value;
        if (!attributes.s(index) || (resourceId = attributes.n(index, 0)) == 0 || (value = a.a(context, resourceId)) == null) {
            return attributes.c(index);
        }
        return value;
    }

    public static Drawable d(Context context, TypedArray attributes, int index) {
        int resourceId;
        Drawable value;
        if (!attributes.hasValue(index) || (resourceId = attributes.getResourceId(index, 0)) == 0 || (value = a.b(context, resourceId)) == null) {
            return attributes.getDrawable(index);
        }
        return value;
    }

    public static g f(Context context, TypedArray attributes, int index) {
        int resourceId;
        if (!attributes.hasValue(index) || (resourceId = attributes.getResourceId(index, 0)) == 0) {
            return null;
        }
        return new g(context, resourceId);
    }

    public static int c(Context context, TypedArray attributes, int index, int defaultValue) {
        TypedValue value = new TypedValue();
        if (!attributes.getValue(index, value) || value.type != 2) {
            return attributes.getDimensionPixelSize(index, defaultValue);
        }
        TypedArray styledAttrs = context.getTheme().obtainStyledAttributes(new int[]{value.data});
        int dimension = styledAttrs.getDimensionPixelSize(0, defaultValue);
        styledAttrs.recycle();
        return dimension;
    }

    public static boolean g(Context context) {
        return context.getResources().getConfiguration().fontScale >= 1.3f;
    }

    public static boolean h(Context context) {
        return context.getResources().getConfiguration().fontScale >= 2.0f;
    }

    public static int e(TypedArray attributes, int a2, int b2) {
        if (attributes.hasValue(a2)) {
            return a2;
        }
        return b2;
    }
}
