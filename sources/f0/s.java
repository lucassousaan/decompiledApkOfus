package f0;

import android.view.ViewGroup;

/* JADX WARN: Classes with same name are omitted:
  
 */
/* loaded from: classes.dex */
public abstract class s {
    public static int b(ViewGroup.MarginLayoutParams lp) {
        return lp.getMarginStart();
    }

    public static int a(ViewGroup.MarginLayoutParams lp) {
        return lp.getMarginEnd();
    }

    public static void d(ViewGroup.MarginLayoutParams lp, int marginStart) {
        lp.setMarginStart(marginStart);
    }

    public static void c(ViewGroup.MarginLayoutParams lp, int marginEnd) {
        lp.setMarginEnd(marginEnd);
    }
}
