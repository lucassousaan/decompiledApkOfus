package f0;

import android.view.View;
import java.util.Collection;

/* JADX WARN: Classes with same name are omitted:
  
 */
/* loaded from: classes.dex */
public abstract class t0 {
    public static void j(View view, String... autofillHints) {
        view.setAutofillHints(autofillHints);
    }

    public static void o(View view, CharSequence tooltipText) {
        view.setTooltipText(tooltipText);
    }

    public static int c(View view) {
        return view.getNextClusterForwardId();
    }

    public static void n(View view, int nextClusterForwardId) {
        view.setNextClusterForwardId(nextClusterForwardId);
    }

    public static boolean g(View view) {
        return view.isKeyboardNavigationCluster();
    }

    public static void m(View view, boolean isCluster) {
        view.setKeyboardNavigationCluster(isCluster);
    }

    public static boolean e(View view) {
        return view.isFocusedByDefault();
    }

    public static void k(View view, boolean isFocusedByDefault) {
        view.setFocusedByDefault(isFocusedByDefault);
    }

    public static View h(View view, View currentCluster, int direction) {
        return view.keyboardNavigationClusterSearch(currentCluster, direction);
    }

    public static void a(View view, Collection<View> views, int direction) {
        view.addKeyboardNavigationClusters(views, direction);
    }

    public static boolean i(View view) {
        return view.restoreDefaultFocus();
    }

    public static boolean d(View view) {
        return view.hasExplicitFocusable();
    }

    public static int b(View view) {
        return view.getImportantForAutofill();
    }

    public static void l(View view, int mode) {
        view.setImportantForAutofill(mode);
    }

    public static boolean f(View view) {
        return view.isImportantForAutofill();
    }
}
