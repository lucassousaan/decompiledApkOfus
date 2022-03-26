package f1;

import android.content.Context;
import android.graphics.Color;
import android.util.TypedValue;
import android.view.View;
import n1.c;

/* JADX WARN: Classes with same name are omitted:
  
 */
/* loaded from: classes.dex */
public abstract class a {
    public static int c(View view, int colorAttributeResId) {
        return c.d(view, colorAttributeResId);
    }

    public static int b(Context context, int colorAttributeResId, String errorMessageComponent) {
        return c.c(context, colorAttributeResId, errorMessageComponent);
    }

    public static int d(View view, int colorAttributeResId, int defaultValue) {
        return a(view.getContext(), colorAttributeResId, defaultValue);
    }

    public static int a(Context context, int colorAttributeResId, int defaultValue) {
        TypedValue typedValue = c.a(context, colorAttributeResId);
        if (typedValue != null) {
            return typedValue.data;
        }
        return defaultValue;
    }

    public static int g(View view, int backgroundColorAttributeResId, int overlayColorAttributeResId, float overlayAlpha) {
        int backgroundColor = c(view, backgroundColorAttributeResId);
        int overlayColor = c(view, overlayColorAttributeResId);
        return f(backgroundColor, overlayColor, overlayAlpha);
    }

    public static int f(int backgroundColor, int overlayColor, float overlayAlpha) {
        int computedAlpha = Math.round(Color.alpha(overlayColor) * overlayAlpha);
        int computedOverlayColor = x.a.d(overlayColor, computedAlpha);
        return e(backgroundColor, computedOverlayColor);
    }

    public static int e(int backgroundColor, int overlayColor) {
        return x.a.b(overlayColor, backgroundColor);
    }
}
