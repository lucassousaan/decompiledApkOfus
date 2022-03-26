package y;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;

/* JADX WARN: Classes with same name are omitted:
  
 */
/* loaded from: classes.dex */
public abstract class a {
    public static void d(Drawable drawable, boolean mirrored) {
        drawable.setAutoMirrored(mirrored);
    }

    public static boolean c(Drawable drawable) {
        return drawable.isAutoMirrored();
    }

    public static void e(Drawable drawable, float x2, float y2) {
        drawable.setHotspot(x2, y2);
    }

    public static void f(Drawable drawable, int left, int top, int right, int bottom) {
        drawable.setHotspotBounds(left, top, right, bottom);
    }

    public static void h(Drawable drawable, int tint) {
        drawable.setTint(tint);
    }

    public static void i(Drawable drawable, ColorStateList tint) {
        drawable.setTintList(tint);
    }

    public static void j(Drawable drawable, PorterDuff.Mode tintMode) {
        drawable.setTintMode(tintMode);
    }

    public static void a(Drawable drawable) {
        drawable.clearColorFilter();
    }

    public static Drawable l(Drawable drawable) {
        return drawable;
    }

    public static Drawable k(Drawable drawable) {
        if (drawable instanceof b) {
            return ((c) ((b) drawable)).a();
        }
        return drawable;
    }

    public static boolean g(Drawable drawable, int layoutDirection) {
        return drawable.setLayoutDirection(layoutDirection);
    }

    public static int b(Drawable drawable) {
        return drawable.getLayoutDirection();
    }
}
