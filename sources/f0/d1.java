package f0;

import android.content.Context;
import android.content.res.Resources;
import android.os.Build;
import android.util.Log;
import android.util.TypedValue;
import android.view.ViewConfiguration;
import java.lang.reflect.Method;

/* JADX WARN: Classes with same name are omitted:
  
 */
/* loaded from: classes.dex */
public abstract class d1 {

    /* renamed from: a  reason: collision with root package name */
    public static Method f1860a;

    static {
        if (Build.VERSION.SDK_INT == 25) {
            try {
                f1860a = ViewConfiguration.class.getDeclaredMethod("getScaledScrollFactor", new Class[0]);
            } catch (Exception e2) {
                Log.i("ViewConfigCompat", "Could not find method getScaledScrollFactor() on ViewConfiguration");
            }
        }
    }

    public static float b(ViewConfiguration config, Context context) {
        if (Build.VERSION.SDK_INT >= 26) {
            return config.getScaledHorizontalScrollFactor();
        }
        return a(config, context);
    }

    public static float d(ViewConfiguration config, Context context) {
        if (Build.VERSION.SDK_INT >= 26) {
            return config.getScaledVerticalScrollFactor();
        }
        return a(config, context);
    }

    public static float a(ViewConfiguration config, Context context) {
        Method method = f1860a;
        if (method != null) {
            try {
                return ((Integer) method.invoke(config, new Object[0])).intValue();
            } catch (Exception e2) {
                Log.i("ViewConfigCompat", "Could not find method getScaledScrollFactor() on ViewConfiguration");
            }
        }
        TypedValue outValue = new TypedValue();
        if (context.getTheme().resolveAttribute(16842829, outValue, true)) {
            return outValue.getDimension(context.getResources().getDisplayMetrics());
        }
        return 0.0f;
    }

    public static int c(ViewConfiguration config) {
        if (Build.VERSION.SDK_INT >= 28) {
            return config.getScaledHoverSlop();
        }
        return config.getScaledTouchSlop() / 2;
    }

    public static boolean e(ViewConfiguration config, Context context) {
        if (Build.VERSION.SDK_INT >= 28) {
            return config.shouldShowMenuShortcutsWhenKeyboardPresent();
        }
        Resources res = context.getResources();
        int platformResId = res.getIdentifier("config_showMenuShortcutsWhenKeyboardPresent", "bool", "android");
        return platformResId != 0 && res.getBoolean(platformResId);
    }
}
