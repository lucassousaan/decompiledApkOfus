package androidx.appcompat.widget;

import android.os.Build;
import android.view.View;

/* JADX WARN: Classes with same name are omitted:
  
 */
/* loaded from: classes.dex */
public abstract class e4 {
    public static void a(View view, CharSequence tooltipText) {
        if (Build.VERSION.SDK_INT >= 26) {
            view.setTooltipText(tooltipText);
        } else {
            h4.f(view, tooltipText);
        }
    }
}
