package v;

import android.content.Context;
import android.os.Process;
import e0.c;
import u.h;

/* JADX WARN: Classes with same name are omitted:
  
 */
/* loaded from: classes.dex */
public abstract class e {
    public static int a(Context context, String permission, int pid, int uid, String packageName) {
        int checkOpResult;
        if (context.checkPermission(permission, pid, uid) == -1) {
            return -1;
        }
        String op = h.c(permission);
        if (op == null) {
            return 0;
        }
        if (packageName == null) {
            String[] packageNames = context.getPackageManager().getPackagesForUid(uid);
            if (packageNames == null || packageNames.length <= 0) {
                return -1;
            }
            packageName = packageNames[0];
        }
        int proxyUid = Process.myUid();
        String proxyPackageName = context.getPackageName();
        boolean isCheckSelfPermission = proxyUid == uid && c.a(proxyPackageName, packageName);
        if (isCheckSelfPermission) {
            checkOpResult = h.a(context, uid, op, packageName);
        } else {
            checkOpResult = h.b(context, op, packageName);
        }
        if (checkOpResult == 0) {
            return 0;
        }
        return -2;
    }

    public static int b(Context context, String permission) {
        return a(context, permission, Process.myPid(), Process.myUid(), context.getPackageName());
    }
}
