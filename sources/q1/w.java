package q1;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.RectF;
import p1.a;

/* JADX WARN: Classes with same name are omitted:
  
 */
/* loaded from: classes.dex */
public class w extends b0 {

    /* renamed from: b  reason: collision with root package name */
    public final y f3396b;

    public w(y operation) {
        this.f3396b = operation;
    }

    @Override // q1.b0
    public void a(Matrix transform, a shadowRenderer, int shadowElevation, Canvas canvas) {
        float startAngle;
        float sweepAngle;
        float k2;
        float o2;
        float l2;
        float j2;
        startAngle = this.f3396b.m();
        sweepAngle = this.f3396b.n();
        k2 = this.f3396b.k();
        o2 = this.f3396b.o();
        l2 = this.f3396b.l();
        j2 = this.f3396b.j();
        RectF rect = new RectF(k2, o2, l2, j2);
        shadowRenderer.a(canvas, transform, rect, shadowElevation, startAngle, sweepAngle);
    }
}
