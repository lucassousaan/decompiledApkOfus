package u;

import android.app.AppOpsManager;
import android.content.Context;
import android.os.Binder;
import android.os.Build;

/* JADX WARN: Classes with same name are omitted:
  
 */
/* loaded from: classes.dex */
public abstract class h {
    public static String c(String permission) {
        return AppOpsManager.permissionToOp(permission);
    }

    public static int b(Context context, String op, String proxiedPackageName) {
        AppOpsManager appOpsManager = (AppOpsManager) context.getSystemService(AppOpsManager.class);
        return appOpsManager.noteProxyOpNoThrow(op, proxiedPackageName);
    }

    public static int a(Context context, int proxyUid, String op, String proxiedPackageName) {
        if (Build.VERSION.SDK_INT < 29) {
            return b(context, op, proxiedPackageName);
        }
        AppOpsManager appOpsManager = g.c(context);
        int proxiedUid = Binder.getCallingUid();
        int checkProxiedOpResult = g.a(appOpsManager, op, proxiedUid, proxiedPackageName);
        if (checkProxiedOpResult != 0) {
            return checkProxiedOpResult;
        }
        String proxyPackageName = g.b(context);
        return g.a(appOpsManager, op, proxyUid, proxyPackageName);
    }
}
