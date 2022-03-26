package u;

import android.app.AppOpsManager;
import android.content.Context;

/* JADX WARN: Classes with same name are omitted:
  
 */
/* loaded from: classes.dex */
public abstract class g {
    public static AppOpsManager c(Context context) {
        return (AppOpsManager) context.getSystemService(AppOpsManager.class);
    }

    public static int a(AppOpsManager appOpsManager, String op, int uid, String packageName) {
        if (appOpsManager == null) {
            return 1;
        }
        return appOpsManager.checkOpNoThrow(op, uid, packageName);
    }

    public static String b(Context context) {
        return context.getOpPackageName();
    }
}
