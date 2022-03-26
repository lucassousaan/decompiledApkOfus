package m;

import android.content.Context;
import android.view.View;

/* JADX WARN: Classes with same name are omitted:
  
 */
/* loaded from: classes.dex */
public abstract class a {
    public static String a(View view) {
        try {
            Context context = view.getContext();
            return context.getResources().getResourceEntryName(view.getId());
        } catch (Exception e2) {
            return "UNKNOWN";
        }
    }
}
