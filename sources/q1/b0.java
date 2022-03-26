package q1;

import android.graphics.Canvas;
import android.graphics.Matrix;
import p1.a;

/* JADX WARN: Classes with same name are omitted:
  
 */
/* loaded from: classes.dex */
public abstract class b0 {

    /* renamed from: a  reason: collision with root package name */
    public static final Matrix f3291a = new Matrix();

    public abstract void a(Matrix matrix, a aVar, int i2, Canvas canvas);

    public final void b(a shadowRenderer, int shadowElevation, Canvas canvas) {
        a(f3291a, shadowRenderer, shadowElevation, canvas);
    }
}
