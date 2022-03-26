package i0;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.widget.CompoundButton;

/* JADX WARN: Classes with same name are omitted:
  
 */
/* loaded from: classes.dex */
public abstract class e {
    public static void c(CompoundButton button, ColorStateList tint) {
        button.setButtonTintList(tint);
    }

    public static ColorStateList b(CompoundButton button) {
        return button.getButtonTintList();
    }

    public static void d(CompoundButton button, PorterDuff.Mode tintMode) {
        button.setButtonTintMode(tintMode);
    }

    public static Drawable a(CompoundButton button) {
        return button.getButtonDrawable();
    }
}
