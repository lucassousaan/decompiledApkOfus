package q1;

import android.graphics.Matrix;
import android.graphics.Path;

/* JADX WARN: Classes with same name are omitted:
  
 */
/* loaded from: classes.dex */
public class z extends a0 {

    /* renamed from: b  reason: collision with root package name */
    public float f3407b;

    /* renamed from: c  reason: collision with root package name */
    public float f3408c;

    @Override // q1.a0
    public void a(Matrix transform, Path path) {
        Matrix inverse = this.f3288a;
        transform.invert(inverse);
        path.transform(inverse);
        path.lineTo(this.f3407b, this.f3408c);
        path.transform(transform);
    }
}
