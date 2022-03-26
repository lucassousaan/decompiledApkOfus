package v;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

/* JADX WARN: Classes with same name are omitted:
  
 */
/* loaded from: classes.dex */
public abstract class a {
    public static void a(Context obj, Intent[] intents, Bundle options) {
        obj.startActivities(intents, options);
    }

    public static void b(Context obj, Intent intent, Bundle options) {
        obj.startActivity(intent, options);
    }
}
