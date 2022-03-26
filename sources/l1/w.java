package l1;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewParent;
import f0.c1;

/* JADX WARN: Classes with same name are omitted:
  
 */
/* loaded from: classes.dex */
public abstract class w {
    public static PorterDuff.Mode e(int value, PorterDuff.Mode defaultMode) {
        switch (value) {
            case 3:
                return PorterDuff.Mode.SRC_OVER;
            case 5:
                return PorterDuff.Mode.SRC_IN;
            case 9:
                return PorterDuff.Mode.SRC_ATOP;
            case 14:
                return PorterDuff.Mode.MULTIPLY;
            case 15:
                return PorterDuff.Mode.SCREEN;
            case 16:
                return PorterDuff.Mode.ADD;
            default:
                return defaultMode;
        }
    }

    public static boolean d(View view) {
        return c1.A(view) == 1;
    }

    public static float b(Context context, int dp) {
        Resources r2 = context.getResources();
        return TypedValue.applyDimension(1, dp, r2.getDisplayMetrics());
    }

    public static void a(View view, u listener) {
        v initialPadding = new v(c1.F(view), view.getPaddingTop(), c1.E(view), view.getPaddingBottom());
        c1.u0(view, new s(listener, initialPadding));
        f(view);
    }

    public static void f(View view) {
        if (c1.O(view)) {
            c1.i0(view);
        } else {
            view.addOnAttachStateChangeListener(new t());
        }
    }

    public static float c(View view) {
        float absoluteElevation = 0.0f;
        for (ViewParent viewParent = view.getParent(); viewParent instanceof View; viewParent = viewParent.getParent()) {
            absoluteElevation += c1.v((View) viewParent);
        }
        return absoluteElevation;
    }
}
