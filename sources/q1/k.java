package q1;

import android.graphics.drawable.Drawable;
import android.view.View;
import l1.w;

/* JADX WARN: Classes with same name are omitted:
  
 */
/* loaded from: classes.dex */
public abstract class k {
    public static d a(int cornerFamily) {
        switch (cornerFamily) {
            case 0:
                return new m();
            case 1:
                return new e();
            default:
                return b();
        }
    }

    public static d b() {
        return new m();
    }

    public static f c() {
        return new f();
    }

    public static void d(View view, float elevation) {
        Drawable background = view.getBackground();
        if (background instanceof j) {
            ((j) background).S(elevation);
        }
    }

    public static void e(View view) {
        Drawable background = view.getBackground();
        if (background instanceof j) {
            f(view, (j) background);
        }
    }

    public static void f(View view, j materialShapeDrawable) {
        if (materialShapeDrawable.L()) {
            materialShapeDrawable.W(w.c(view));
        }
    }
}
