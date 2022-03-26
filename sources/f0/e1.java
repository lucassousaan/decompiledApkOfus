package f0;

import android.util.Log;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;

/* JADX WARN: Classes with same name are omitted:
  
 */
/* loaded from: classes.dex */
public abstract class e1 {
    public static boolean h(ViewParent parent, View child, AccessibilityEvent event) {
        return parent.requestSendAccessibilityEvent(child, event);
    }

    public static boolean f(ViewParent parent, View child, View target, int nestedScrollAxes, int type) {
        if (parent instanceof x) {
            return ((x) parent).f(child, target, nestedScrollAxes, type);
        }
        if (type != 0) {
            return false;
        }
        try {
            return parent.onStartNestedScroll(child, target, nestedScrollAxes);
        } catch (AbstractMethodError e2) {
            Log.e("ViewParentCompat", "ViewParent " + parent + " does not implement interface method onStartNestedScroll", e2);
            return false;
        }
    }

    public static void e(ViewParent parent, View child, View target, int nestedScrollAxes, int type) {
        if (parent instanceof x) {
            ((x) parent).a(child, target, nestedScrollAxes, type);
        } else if (type == 0) {
            try {
                parent.onNestedScrollAccepted(child, target, nestedScrollAxes);
            } catch (AbstractMethodError e2) {
                Log.e("ViewParentCompat", "ViewParent " + parent + " does not implement interface method onNestedScrollAccepted", e2);
            }
        }
    }

    public static void g(ViewParent parent, View target, int type) {
        if (parent instanceof x) {
            ((x) parent).d(target, type);
        } else if (type == 0) {
            try {
                parent.onStopNestedScroll(target);
            } catch (AbstractMethodError e2) {
                Log.e("ViewParentCompat", "ViewParent " + parent + " does not implement interface method onStopNestedScroll", e2);
            }
        }
    }

    public static void d(ViewParent parent, View target, int dxConsumed, int dyConsumed, int dxUnconsumed, int dyUnconsumed, int type, int[] consumed) {
        if (parent instanceof y) {
            ((y) parent).b(target, dxConsumed, dyConsumed, dxUnconsumed, dyUnconsumed, type, consumed);
            return;
        }
        consumed[0] = consumed[0] + dxUnconsumed;
        consumed[1] = consumed[1] + dyUnconsumed;
        if (parent instanceof x) {
            ((x) parent).c(target, dxConsumed, dyConsumed, dxUnconsumed, dyUnconsumed, type);
        } else if (type == 0) {
            try {
                parent.onNestedScroll(target, dxConsumed, dyConsumed, dxUnconsumed, dyUnconsumed);
            } catch (AbstractMethodError e2) {
                Log.e("ViewParentCompat", "ViewParent " + parent + " does not implement interface method onNestedScroll", e2);
            }
        }
    }

    public static void c(ViewParent parent, View target, int dx, int dy, int[] consumed, int type) {
        if (parent instanceof x) {
            ((x) parent).e(target, dx, dy, consumed, type);
        } else if (type == 0) {
            try {
                parent.onNestedPreScroll(target, dx, dy, consumed);
            } catch (AbstractMethodError e2) {
                Log.e("ViewParentCompat", "ViewParent " + parent + " does not implement interface method onNestedPreScroll", e2);
            }
        }
    }

    public static boolean a(ViewParent parent, View target, float velocityX, float velocityY, boolean consumed) {
        try {
            return parent.onNestedFling(target, velocityX, velocityY, consumed);
        } catch (AbstractMethodError e2) {
            Log.e("ViewParentCompat", "ViewParent " + parent + " does not implement interface method onNestedFling", e2);
            return false;
        }
    }

    public static boolean b(ViewParent parent, View target, float velocityX, float velocityY) {
        try {
            return parent.onNestedPreFling(target, velocityX, velocityY);
        } catch (AbstractMethodError e2) {
            Log.e("ViewParentCompat", "ViewParent " + parent + " does not implement interface method onNestedPreFling", e2);
            return false;
        }
    }
}
