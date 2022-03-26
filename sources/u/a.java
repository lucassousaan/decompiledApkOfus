package u;

import android.app.Activity;
import android.os.Build;
import v.d;

/* JADX WARN: Classes with same name are omitted:
  
 */
/* loaded from: classes.dex */
public abstract class a extends d {
    public static void d(Activity activity) {
        activity.finishAffinity();
    }

    public static void e(Activity activity) {
        if (Build.VERSION.SDK_INT >= 28) {
            activity.recreate();
        } else if (!f.i(activity)) {
            activity.recreate();
        }
    }
}
