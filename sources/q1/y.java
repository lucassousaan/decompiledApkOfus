package q1;

import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;

/* JADX WARN: Classes with same name are omitted:
  
 */
/* loaded from: classes.dex */
public class y extends a0 {

    /* renamed from: h  reason: collision with root package name */
    public static final RectF f3400h = new RectF();

    /* renamed from: b  reason: collision with root package name */
    public float f3401b;

    /* renamed from: c  reason: collision with root package name */
    public float f3402c;

    /* renamed from: d  reason: collision with root package name */
    public float f3403d;

    /* renamed from: e  reason: collision with root package name */
    public float f3404e;

    /* renamed from: f  reason: collision with root package name */
    public float f3405f;

    /* renamed from: g  reason: collision with root package name */
    public float f3406g;

    public y(float left, float top, float right, float bottom) {
        q(left);
        u(top);
        r(right);
        p(bottom);
    }

    @Override // q1.a0
    public void a(Matrix transform, Path path) {
        Matrix inverse = this.f3288a;
        transform.invert(inverse);
        path.transform(inverse);
        RectF rectF = f3400h;
        rectF.set(k(), o(), l(), j());
        path.arcTo(rectF, m(), n(), false);
        path.transform(transform);
    }

    public final float k() {
        return this.f3401b;
    }

    public final float o() {
        return this.f3402c;
    }

    public final float l() {
        return this.f3403d;
    }

    public final float j() {
        return this.f3404e;
    }

    public final void q(float left) {
        this.f3401b = left;
    }

    public final void u(float top) {
        this.f3402c = top;
    }

    public final void r(float right) {
        this.f3403d = right;
    }

    public final void p(float bottom) {
        this.f3404e = bottom;
    }

    public final float m() {
        return this.f3405f;
    }

    public final float n() {
        return this.f3406g;
    }

    public final void s(float startAngle) {
        this.f3405f = startAngle;
    }

    public final void t(float sweepAngle) {
        this.f3406g = sweepAngle;
    }
}
