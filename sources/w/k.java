package w;

import android.content.res.Resources;
import android.os.Build;

/* JADX WARN: Classes with same name are omitted:
  
 */
/* loaded from: classes.dex */
public abstract class k {
    public static void a(Resources.Theme theme) {
        if (Build.VERSION.SDK_INT >= 29) {
            j.a(theme);
        } else {
            i.a(theme);
        }
    }
}
