package f0;

import android.graphics.Paint;
import android.view.Display;
import android.view.View;

/* JADX WARN: Classes with same name are omitted:
  
 */
/* loaded from: classes.dex */
public abstract class n0 {
    public static Display b(View view) {
        return view.getDisplay();
    }

    public static int a() {
        return View.generateViewId();
    }

    public static int c(View view) {
        return view.getLabelFor();
    }

    public static void h(View view, int id) {
        view.setLabelFor(id);
    }

    public static void i(View view, Paint paint) {
        view.setLayerPaint(paint);
    }

    public static int d(View view) {
        return view.getLayoutDirection();
    }

    public static void j(View view, int layoutDirection) {
        view.setLayoutDirection(layoutDirection);
    }

    public static int f(View view) {
        return view.getPaddingStart();
    }

    public static int e(View view) {
        return view.getPaddingEnd();
    }

    public static void k(View view, int start, int top, int end, int bottom) {
        view.setPaddingRelative(start, top, end, bottom);
    }

    public static boolean g(View view) {
        return view.isPaddingRelative();
    }
}
