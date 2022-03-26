package f0;

import android.graphics.Rect;
import android.view.Gravity;

/* JADX WARN: Classes with same name are omitted:
  
 */
/* loaded from: classes.dex */
public abstract class o {
    public static void a(int gravity, int w2, int h2, Rect container, Rect outRect, int layoutDirection) {
        Gravity.apply(gravity, w2, h2, container, outRect, layoutDirection);
    }

    public static int b(int gravity, int layoutDirection) {
        return Gravity.getAbsoluteGravity(gravity, layoutDirection);
    }
}
