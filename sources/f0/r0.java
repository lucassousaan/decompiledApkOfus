package f0;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import com.example.helloworld.R;

/* JADX WARN: Classes with same name are omitted:
  
 */
/* loaded from: classes.dex */
public abstract class r0 {
    public static x1 j(View v2) {
        return l1.a(v2);
    }

    public static x1 b(View v2, x1 insets, Rect outLocalInsets) {
        WindowInsets platformInsets = insets.r();
        if (platformInsets != null) {
            return x1.t(v2.computeSystemWindowInsets(platformInsets, outLocalInsets), v2);
        }
        outLocalInsets.setEmpty();
        return insets;
    }

    public static void u(View v2, a0 listener) {
        if (Build.VERSION.SDK_INT < 30) {
            v2.setTag(R.id.tag_on_apply_window_listener, listener);
        }
        if (listener == null) {
            View.OnApplyWindowInsetsListener compatInsetsAnimationCallback = (View.OnApplyWindowInsetsListener) v2.getTag(R.id.tag_window_insets_animation_callback);
            v2.setOnApplyWindowInsetsListener(compatInsetsAnimationCallback);
            return;
        }
        v2.setOnApplyWindowInsetsListener(new q0(v2, listener));
    }

    public static void a(WindowInsets insets, View v2) {
        View.OnApplyWindowInsetsListener insetsAnimationCallback = (View.OnApplyWindowInsetsListener) v2.getTag(R.id.tag_window_insets_animation_callback);
        if (insetsAnimationCallback != null) {
            insetsAnimationCallback.onApplyWindowInsets(v2, insets);
        }
    }

    public static boolean c(View view, float velocityX, float velocityY, boolean consumed) {
        return view.dispatchNestedFling(velocityX, velocityY, consumed);
    }

    public static boolean d(View view, float velocityX, float velocityY) {
        return view.dispatchNestedPreFling(velocityX, velocityY);
    }

    public static float m(View view) {
        return view.getZ();
    }

    public static void x(View view, float z2) {
        view.setZ(z2);
    }

    public static void s(View view, float elevation) {
        view.setElevation(elevation);
    }

    public static void w(View view, float translationZ) {
        view.setTranslationZ(translationZ);
    }

    public static float l(View view) {
        return view.getTranslationZ();
    }

    public static void v(View view, String transitionName) {
        view.setTransitionName(transitionName);
    }

    public static boolean o(View view) {
        return view.isImportantForAccessibility();
    }

    public static float i(View view) {
        return view.getElevation();
    }

    public static String k(View view) {
        return view.getTransitionName();
    }

    public static void q(View view, ColorStateList tint) {
        view.setBackgroundTintList(tint);
    }

    public static ColorStateList g(View view) {
        return view.getBackgroundTintList();
    }

    public static PorterDuff.Mode h(View view) {
        return view.getBackgroundTintMode();
    }

    public static void r(View view, PorterDuff.Mode tintMode) {
        view.setBackgroundTintMode(tintMode);
    }

    public static void t(View view, boolean enabled) {
        view.setNestedScrollingEnabled(enabled);
    }

    public static boolean p(View view) {
        return view.isNestedScrollingEnabled();
    }

    public static boolean y(View view, int axes) {
        return view.startNestedScroll(axes);
    }

    public static void z(View view) {
        view.stopNestedScroll();
    }

    public static boolean n(View view) {
        return view.hasNestedScrollingParent();
    }

    public static boolean f(View view, int dxConsumed, int dyConsumed, int dxUnconsumed, int dyUnconsumed, int[] offsetInWindow) {
        return view.dispatchNestedScroll(dxConsumed, dyConsumed, dxUnconsumed, dyUnconsumed, offsetInWindow);
    }

    public static boolean e(View view, int dx, int dy, int[] consumed, int[] offsetInWindow) {
        return view.dispatchNestedPreScroll(dx, dy, consumed, offsetInWindow);
    }
}
