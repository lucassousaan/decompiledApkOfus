package i0;

import android.view.View;
import android.widget.PopupWindow;

/* JADX WARN: Classes with same name are omitted:
  
 */
/* loaded from: classes.dex */
public abstract class q {
    public static void c(PopupWindow popup, View anchor, int xoff, int yoff, int gravity) {
        o.a(popup, anchor, xoff, yoff, gravity);
    }

    public static void a(PopupWindow popupWindow, boolean overlapAnchor) {
        p.c(popupWindow, overlapAnchor);
    }

    public static void b(PopupWindow popupWindow, int layoutType) {
        p.d(popupWindow, layoutType);
    }
}
