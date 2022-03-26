package q1;

import android.graphics.Matrix;
import android.graphics.Path;
import com.google.android.material.shape.ShapePath;
import java.util.ArrayList;
import java.util.List;

/* JADX WARN: Classes with same name are omitted:
  
 */
/* loaded from: classes.dex */
public class c0 {

    /* renamed from: a  reason: collision with root package name */
    public float f3292a;

    /* renamed from: b  reason: collision with root package name */
    public float f3293b;

    /* renamed from: c  reason: collision with root package name */
    public float f3294c;

    /* renamed from: d  reason: collision with root package name */
    public float f3295d;

    /* renamed from: e  reason: collision with root package name */
    public float f3296e;

    /* renamed from: f  reason: collision with root package name */
    public float f3297f;

    /* renamed from: g  reason: collision with root package name */
    public final List f3298g = new ArrayList();

    /* renamed from: h  reason: collision with root package name */
    public final List f3299h = new ArrayList();

    /* renamed from: i  reason: collision with root package name */
    public boolean f3300i;

    public c0() {
        n(0.0f, 0.0f);
    }

    public void n(float startX, float startY) {
        o(startX, startY, 270.0f, 0.0f);
    }

    public void o(float startX, float startY, float shadowStartAngle, float shadowSweepAngle) {
        t(startX);
        u(startY);
        r(startX);
        s(startY);
        p(shadowStartAngle);
        q((shadowStartAngle + shadowSweepAngle) % 360.0f);
        this.f3298g.clear();
        this.f3299h.clear();
        this.f3300i = false;
    }

    public void m(float x2, float y2) {
        z operation = new z();
        operation.f3407b = x2;
        operation.f3408c = y2;
        this.f3298g.add(operation);
        x shadowOperation = new x(operation, i(), j());
        c(shadowOperation, shadowOperation.c() + 270.0f, shadowOperation.c() + 270.0f);
        r(x2);
        s(y2);
    }

    public void a(float left, float top, float right, float bottom, float startAngle, float sweepAngle) {
        y operation = new y(left, top, right, bottom);
        operation.s(startAngle);
        operation.t(sweepAngle);
        this.f3298g.add(operation);
        w arcShadowOperation = new w(operation);
        float endAngle = startAngle + sweepAngle;
        boolean drawShadowInsideBounds = sweepAngle < 0.0f;
        c(arcShadowOperation, drawShadowInsideBounds ? (startAngle + 180.0f) % 360.0f : startAngle, drawShadowInsideBounds ? (180.0f + endAngle) % 360.0f : endAngle);
        r(((left + right) * 0.5f) + (((right - left) / 2.0f) * ((float) Math.cos(Math.toRadians(startAngle + sweepAngle)))));
        s(((top + bottom) * 0.5f) + (((bottom - top) / 2.0f) * ((float) Math.sin(Math.toRadians(startAngle + sweepAngle)))));
    }

    public void d(Matrix transform, Path path) {
        int size = this.f3298g.size();
        for (int i2 = 0; i2 < size; i2++) {
            a0 operation = (a0) this.f3298g.get(i2);
            operation.a(transform, path);
        }
    }

    public b0 f(Matrix transform) {
        b(h());
        Matrix transformCopy = new Matrix(transform);
        List<ShapePath.ShadowCompatOperation> operations = new ArrayList<>(this.f3299h);
        return new v(this, operations, transformCopy);
    }

    public final void c(b0 shadowOperation, float startShadowAngle, float endShadowAngle) {
        b(startShadowAngle);
        this.f3299h.add(shadowOperation);
        p(endShadowAngle);
    }

    public boolean e() {
        return false;
    }

    public final void b(float nextShadowAngle) {
        if (g() != nextShadowAngle) {
            float shadowSweep = ((nextShadowAngle - g()) + 360.0f) % 360.0f;
            if (shadowSweep <= 180.0f) {
                y pathArcOperation = new y(i(), j(), i(), j());
                pathArcOperation.s(g());
                pathArcOperation.t(shadowSweep);
                this.f3299h.add(new w(pathArcOperation));
                p(nextShadowAngle);
            }
        }
    }

    public float k() {
        return this.f3292a;
    }

    public float l() {
        return this.f3293b;
    }

    public float i() {
        return this.f3294c;
    }

    public float j() {
        return this.f3295d;
    }

    public final float g() {
        return this.f3296e;
    }

    public final float h() {
        return this.f3297f;
    }

    public final void t(float startX) {
        this.f3292a = startX;
    }

    public final void u(float startY) {
        this.f3293b = startY;
    }

    public final void r(float endX) {
        this.f3294c = endX;
    }

    public final void s(float endY) {
        this.f3295d = endY;
    }

    public final void p(float currentShadowAngle) {
        this.f3296e = currentShadowAngle;
    }

    public final void q(float endShadowAngle) {
        this.f3297f = endShadowAngle;
    }
}
