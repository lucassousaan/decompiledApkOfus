package i0;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.widget.ImageView;

/* JADX WARN: Classes with same name are omitted:
  
 */
/* loaded from: classes.dex */
public abstract class h {
    public static void a(ImageView view, ColorStateList tintList) {
        view.setImageTintList(tintList);
    }

    public static void b(ImageView view, PorterDuff.Mode mode) {
        view.setImageTintMode(mode);
    }
}
