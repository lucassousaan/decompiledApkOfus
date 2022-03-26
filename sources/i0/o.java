package i0;

import android.view.View;
import android.widget.PopupWindow;

/* JADX WARN: Classes with same name are omitted:
  
 */
/* loaded from: classes.dex */
public abstract class o {
    public static void a(PopupWindow popupWindow, View anchor, int xoff, int yoff, int gravity) {
        popupWindow.showAsDropDown(anchor, xoff, yoff, gravity);
    }
}
