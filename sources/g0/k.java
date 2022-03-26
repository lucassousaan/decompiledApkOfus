package g0;

import android.view.View;
import android.view.accessibility.AccessibilityRecord;

/* JADX WARN: Classes with same name are omitted:
  
 */
/* loaded from: classes.dex */
public abstract class k {
    public static void c(AccessibilityRecord record, View root, int virtualDescendantId) {
        record.setSource(root, virtualDescendantId);
    }

    public static void a(AccessibilityRecord record, int maxScrollX) {
        record.setMaxScrollX(maxScrollX);
    }

    public static void b(AccessibilityRecord record, int maxScrollY) {
        record.setMaxScrollY(maxScrollY);
    }
}
