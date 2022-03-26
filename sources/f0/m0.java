package f0;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.view.accessibility.AccessibilityNodeProvider;

/* JADX WARN: Classes with same name are omitted:
  
 */
/* loaded from: classes.dex */
public abstract class m0 {
    public static boolean i(View view) {
        return view.hasTransientState();
    }

    public static void r(View view, boolean hasTransientState) {
        view.setHasTransientState(hasTransientState);
    }

    public static void k(View view) {
        view.postInvalidateOnAnimation();
    }

    public static void l(View view, int left, int top, int right, int bottom) {
        view.postInvalidateOnAnimation(left, top, right, bottom);
    }

    public static void m(View view, Runnable action) {
        view.postOnAnimation(action);
    }

    public static void n(View view, Runnable action, long delayMillis) {
        view.postOnAnimationDelayed(action, delayMillis);
    }

    public static int c(View view) {
        return view.getImportantForAccessibility();
    }

    public static void s(View view, int mode) {
        view.setImportantForAccessibility(mode);
    }

    public static AccessibilityNodeProvider a(View view) {
        return view.getAccessibilityNodeProvider();
    }

    public static ViewParent f(View view) {
        return view.getParentForAccessibility();
    }

    public static int e(View view) {
        return view.getMinimumWidth();
    }

    public static int d(View view) {
        return view.getMinimumHeight();
    }

    public static int g(View view) {
        return view.getWindowSystemUiVisibility();
    }

    public static void p(View view) {
        view.requestFitSystemWindows();
    }

    public static boolean b(View view) {
        return view.getFitsSystemWindows();
    }

    public static boolean j(View view, int action, Bundle arguments) {
        return view.performAccessibilityAction(action, arguments);
    }

    public static boolean h(View view) {
        return view.hasOverlappingRendering();
    }

    public static void q(View view, Drawable background) {
        view.setBackground(background);
    }

    public static void o(ViewTreeObserver viewTreeObserver, ViewTreeObserver.OnGlobalLayoutListener victim) {
        viewTreeObserver.removeOnGlobalLayoutListener(victim);
    }
}
