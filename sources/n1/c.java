package n1;

import android.content.Context;
import android.util.TypedValue;
import android.view.View;

/* JADX WARN: Classes with same name are omitted:
  
 */
/* loaded from: classes.dex */
public abstract class c {
    public static TypedValue a(Context context, int attributeResId) {
        TypedValue typedValue = new TypedValue();
        if (context.getTheme().resolveAttribute(attributeResId, typedValue, true)) {
            return typedValue;
        }
        return null;
    }

    public static int c(Context context, int attributeResId, String errorMessageComponent) {
        TypedValue typedValue = a(context, attributeResId);
        if (typedValue != null) {
            return typedValue.data;
        }
        throw new IllegalArgumentException(String.format("%1$s requires a value for the %2$s attribute to be set in your app theme. You can either set the attribute in your theme or update your theme to inherit from Theme.MaterialComponents (or a descendant).", errorMessageComponent, context.getResources().getResourceName(attributeResId)));
    }

    public static int d(View componentView, int attributeResId) {
        return c(componentView.getContext(), attributeResId, componentView.getClass().getCanonicalName());
    }

    public static boolean b(Context context, int attributeResId, boolean defaultValue) {
        TypedValue typedValue = a(context, attributeResId);
        return (typedValue == null || typedValue.type != 18) ? defaultValue : typedValue.data != 0;
    }
}
