package q1;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.RectF;
import p1.a;

/* JADX WARN: Classes with same name are omitted:
  
 */
/* loaded from: classes.dex */
public class x extends b0 {

    /* renamed from: b  reason: collision with root package name */
    public final z f3397b;

    /* renamed from: c  reason: collision with root package name */
    public final float f3398c;

    /* renamed from: d  reason: collision with root package name */
    public final float f3399d;

    public x(z operation, float startX, float startY) {
        this.f3397b = operation;
        this.f3398c = startX;
        this.f3399d = startY;
    }

    @Override // q1.b0
    public void a(Matrix transform, a shadowRenderer, int shadowElevation, Canvas canvas) {
        float f2;
        float f3;
        f2 = this.f3397b.f3408c;
        float height = f2 - this.f3399d;
        f3 = this.f3397b.f3407b;
        float width = f3 - this.f3398c;
        RectF rect = new RectF(0.0f, 0.0f, (float) Math.hypot(height, width), 0.0f);
        Matrix edgeTransform = new Matrix(transform);
        edgeTransform.preTranslate(this.f3398c, this.f3399d);
        edgeTransform.preRotate(c());
        shadowRenderer.b(canvas, edgeTransform, rect, shadowElevation);
    }

    public float c() {
        float f2;
        float f3;
        f2 = this.f3397b.f3408c;
        float f4 = f2 - this.f3399d;
        f3 = this.f3397b.f3407b;
        return (float) Math.toDegrees(Math.atan(f4 / (f3 - this.f3398c)));
    }
}
