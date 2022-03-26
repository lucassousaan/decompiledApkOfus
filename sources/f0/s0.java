package f0;

import android.view.View;
import android.view.WindowInsets;

/* JADX WARN: Classes with same name are omitted:
  
 */
/* loaded from: classes.dex */
public abstract class s0 {
    public static x1 a(View v2) {
        WindowInsets wi = v2.getRootWindowInsets();
        if (wi == null) {
            return null;
        }
        x1 insets = x1.s(wi);
        insets.p(insets);
        insets.d(v2.getRootView());
        return insets;
    }

    public static void c(View view, int indicators) {
        view.setScrollIndicators(indicators);
    }

    public static void d(View view, int indicators, int mask) {
        view.setScrollIndicators(indicators, mask);
    }

    public static int b(View view) {
        return view.getScrollIndicators();
    }
}
