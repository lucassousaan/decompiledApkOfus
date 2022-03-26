package f0;

import android.view.View;
import android.view.WindowInsets;

/* JADX WARN: Classes with same name are omitted:
  
 */
/* loaded from: classes.dex */
public abstract class p0 {
    public static void c(View view) {
        view.requestApplyInsets();
    }

    public static WindowInsets b(View view, WindowInsets insets) {
        return view.onApplyWindowInsets(insets);
    }

    public static WindowInsets a(View view, WindowInsets insets) {
        return view.dispatchApplyWindowInsets(insets);
    }
}
