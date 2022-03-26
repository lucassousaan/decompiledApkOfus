package g0;

import android.view.accessibility.AccessibilityEvent;

/* JADX WARN: Classes with same name are omitted:
  
 */
/* loaded from: classes.dex */
public abstract class b {
    public static void b(AccessibilityEvent event, int changeTypes) {
        event.setContentChangeTypes(changeTypes);
    }

    public static int a(AccessibilityEvent event) {
        return event.getContentChangeTypes();
    }
}
