package q1;

import android.graphics.RectF;

/* JADX WARN: Classes with same name are omitted:
  
 */
/* loaded from: classes.dex */
public abstract class d {
    public abstract void a(c0 c0Var, float f2, float f3, float f4);

    public void b(c0 shapePath, float angle, float interpolation, RectF bounds, c size) {
        a(shapePath, angle, interpolation, size.a(bounds));
    }
}
