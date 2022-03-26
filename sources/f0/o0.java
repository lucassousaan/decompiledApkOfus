package f0;

import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;

/* JADX WARN: Classes with same name are omitted:
  
 */
/* loaded from: classes.dex */
public abstract class o0 {
    public static boolean c(View view) {
        return view.isLaidOut();
    }

    public static boolean b(View view) {
        return view.isAttachedToWindow();
    }

    public static boolean d(View view) {
        return view.isLayoutDirectionResolved();
    }

    public static int a(View view) {
        return view.getAccessibilityLiveRegion();
    }

    public static void f(View view, int mode) {
        view.setAccessibilityLiveRegion(mode);
    }

    public static void g(AccessibilityEvent accessibilityEvent, int changeTypes) {
        accessibilityEvent.setContentChangeTypes(changeTypes);
    }

    public static void e(ViewParent viewParent, View child, View source, int changeType) {
        viewParent.notifySubtreeAccessibilityStateChanged(child, source, changeType);
    }
}
