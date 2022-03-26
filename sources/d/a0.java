package d;

import android.content.Context;
import android.content.res.Configuration;

/* JADX WARN: Classes with same name are omitted:
  
 */
/* loaded from: classes.dex */
public abstract class a0 {
    public static void b(Configuration base, Configuration change, Configuration delta) {
        int i2 = base.densityDpi;
        int i3 = change.densityDpi;
        if (i2 != i3) {
            delta.densityDpi = i3;
        }
    }

    public static Context a(Context context, Configuration overrideConfiguration) {
        return context.createConfigurationContext(overrideConfiguration);
    }
}
