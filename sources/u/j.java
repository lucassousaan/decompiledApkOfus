package u;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;

/* JADX WARN: Classes with same name are omitted:
  
 */
/* loaded from: classes.dex */
public abstract class j {
    public static boolean f(Activity sourceActivity, Intent targetIntent) {
        return sourceActivity.shouldUpRecreateTask(targetIntent);
    }

    public static void e(Activity sourceActivity, Intent upIntent) {
        sourceActivity.navigateUpTo(upIntent);
    }

    public static Intent a(Activity sourceActivity) {
        Intent result = sourceActivity.getParentActivityIntent();
        if (result != null) {
            return result;
        }
        String parentName = c(sourceActivity);
        if (parentName == null) {
            return null;
        }
        ComponentName target = new ComponentName(sourceActivity, parentName);
        try {
            String grandparent = d(sourceActivity, target);
            if (grandparent == null) {
                return Intent.makeMainActivity(target);
            }
            return new Intent().setComponent(target);
        } catch (PackageManager.NameNotFoundException e2) {
            Log.e("NavUtils", "getParentActivityIntent: bad parentActivityName '" + parentName + "' in manifest");
            return null;
        }
    }

    public static Intent b(Context context, ComponentName componentName) {
        String parentActivity = d(context, componentName);
        if (parentActivity == null) {
            return null;
        }
        ComponentName target = new ComponentName(componentName.getPackageName(), parentActivity);
        String grandparent = d(context, target);
        if (grandparent == null) {
            Intent parentIntent = Intent.makeMainActivity(target);
            return parentIntent;
        }
        Intent parentIntent2 = new Intent().setComponent(target);
        return parentIntent2;
    }

    public static String c(Activity sourceActivity) {
        try {
            return d(sourceActivity, sourceActivity.getComponentName());
        } catch (PackageManager.NameNotFoundException e2) {
            throw new IllegalArgumentException(e2);
        }
    }

    public static String d(Context context, ComponentName componentName) {
        int flags;
        String parentActivity;
        PackageManager pm = context.getPackageManager();
        int flags2 = 128 | 512;
        if (Build.VERSION.SDK_INT >= 29) {
            flags = flags2 | 269221888;
        } else {
            flags = flags2 | 786432;
        }
        ActivityInfo info = pm.getActivityInfo(componentName, flags);
        String result = info.parentActivityName;
        if (result != null) {
            return result;
        }
        Bundle bundle = info.metaData;
        if (bundle == null || (parentActivity = bundle.getString("android.support.PARENT_ACTIVITY")) == null) {
            return null;
        }
        if (parentActivity.charAt(0) != '.') {
            return parentActivity;
        }
        return context.getPackageName() + parentActivity;
    }
}
