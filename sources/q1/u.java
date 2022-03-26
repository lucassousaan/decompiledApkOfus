package q1;

import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;

/* JADX WARN: Classes with same name are omitted:
  
 */
/* loaded from: classes.dex */
public class u {

    /* renamed from: a  reason: collision with root package name */
    public final c0[] f3382a = new c0[4];

    /* renamed from: b  reason: collision with root package name */
    public final Matrix[] f3383b = new Matrix[4];

    /* renamed from: c  reason: collision with root package name */
    public final Matrix[] f3384c = new Matrix[4];

    /* renamed from: d  reason: collision with root package name */
    public final PointF f3385d = new PointF();

    /* renamed from: e  reason: collision with root package name */
    public final Path f3386e = new Path();

    /* renamed from: f  reason: collision with root package name */
    public final Path f3387f = new Path();

    /* renamed from: g  reason: collision with root package name */
    public final c0 f3388g = new c0();

    /* renamed from: h  reason: collision with root package name */
    public final float[] f3389h = new float[2];

    /* renamed from: i  reason: collision with root package name */
    public final float[] f3390i = new float[2];

    /* renamed from: j  reason: collision with root package name */
    public final Path f3391j = new Path();

    /* renamed from: k  reason: collision with root package name */
    public final Path f3392k = new Path();

    /* renamed from: l  reason: collision with root package name */
    public boolean f3393l = true;

    public u() {
        for (int i2 = 0; i2 < 4; i2++) {
            this.f3382a[i2] = new c0();
            this.f3383b[i2] = new Matrix();
            this.f3384c[i2] = new Matrix();
        }
    }

    public static u k() {
        return r.f3376a;
    }

    public void d(q shapeAppearanceModel, float interpolation, RectF bounds, Path path) {
        e(shapeAppearanceModel, interpolation, bounds, null, path);
    }

    public void e(q shapeAppearanceModel, float interpolation, RectF bounds, s pathListener, Path path) {
        path.rewind();
        this.f3386e.rewind();
        this.f3387f.rewind();
        this.f3387f.addRect(bounds, Path.Direction.CW);
        t spec = new t(shapeAppearanceModel, interpolation, bounds, pathListener, path);
        for (int index = 0; index < 4; index++) {
            m(spec, index);
            n(index);
        }
        for (int index2 = 0; index2 < 4; index2++) {
            b(spec, index2);
            c(spec, index2);
        }
        path.close();
        this.f3386e.close();
        if (!this.f3386e.isEmpty()) {
            path.op(this.f3386e, Path.Op.UNION);
        }
    }

    public final void m(t spec, int index) {
        c size = g(index, spec.f3377a);
        h(index, spec.f3377a).b(this.f3382a[index], 90.0f, spec.f3381e, spec.f3379c, size);
        float edgeAngle = a(index);
        this.f3383b[index].reset();
        f(index, spec.f3379c, this.f3385d);
        Matrix matrix = this.f3383b[index];
        PointF pointF = this.f3385d;
        matrix.setTranslate(pointF.x, pointF.y);
        this.f3383b[index].preRotate(edgeAngle);
    }

    public final void n(int index) {
        this.f3389h[0] = this.f3382a[index].i();
        this.f3389h[1] = this.f3382a[index].j();
        this.f3383b[index].mapPoints(this.f3389h);
        float edgeAngle = a(index);
        this.f3384c[index].reset();
        Matrix matrix = this.f3384c[index];
        float[] fArr = this.f3389h;
        matrix.setTranslate(fArr[0], fArr[1]);
        this.f3384c[index].preRotate(edgeAngle);
    }

    public final void b(t spec, int index) {
        this.f3389h[0] = this.f3382a[index].k();
        this.f3389h[1] = this.f3382a[index].l();
        this.f3383b[index].mapPoints(this.f3389h);
        if (index == 0) {
            Path path = spec.f3378b;
            float[] fArr = this.f3389h;
            path.moveTo(fArr[0], fArr[1]);
        } else {
            Path path2 = spec.f3378b;
            float[] fArr2 = this.f3389h;
            path2.lineTo(fArr2[0], fArr2[1]);
        }
        this.f3382a[index].d(this.f3383b[index], spec.f3378b);
        s sVar = spec.f3380d;
        if (sVar != null) {
            ((g) sVar).a(this.f3382a[index], this.f3383b[index], index);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:14:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void c(q1.t r10, int r11) {
        /*
            Method dump skipped, instructions count: 252
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: q1.u.c(q1.t, int):void");
    }

    public final boolean l(Path edgePath, int index) {
        this.f3392k.reset();
        this.f3382a[index].d(this.f3383b[index], this.f3392k);
        RectF bounds = new RectF();
        edgePath.computeBounds(bounds, true);
        this.f3392k.computeBounds(bounds, true);
        edgePath.op(this.f3392k, Path.Op.INTERSECT);
        edgePath.computeBounds(bounds, true);
        if (bounds.isEmpty()) {
            return bounds.width() > 1.0f && bounds.height() > 1.0f;
        }
        return true;
    }

    public final float i(RectF bounds, int index) {
        float[] fArr = this.f3389h;
        c0[] c0VarArr = this.f3382a;
        fArr[0] = c0VarArr[index].f3294c;
        fArr[1] = c0VarArr[index].f3295d;
        this.f3383b[index].mapPoints(fArr);
        switch (index) {
            case 1:
            case 3:
                return Math.abs(bounds.centerX() - this.f3389h[0]);
            case 2:
            default:
                return Math.abs(bounds.centerY() - this.f3389h[1]);
        }
    }

    public final d h(int index, q shapeAppearanceModel) {
        switch (index) {
            case 1:
                return shapeAppearanceModel.k();
            case 2:
                return shapeAppearanceModel.i();
            case 3:
                return shapeAppearanceModel.q();
            default:
                return shapeAppearanceModel.s();
        }
    }

    public final c g(int index, q shapeAppearanceModel) {
        switch (index) {
            case 1:
                return shapeAppearanceModel.l();
            case 2:
                return shapeAppearanceModel.j();
            case 3:
                return shapeAppearanceModel.r();
            default:
                return shapeAppearanceModel.t();
        }
    }

    public final f j(int index, q shapeAppearanceModel) {
        switch (index) {
            case 1:
                return shapeAppearanceModel.h();
            case 2:
                return shapeAppearanceModel.n();
            case 3:
                return shapeAppearanceModel.p();
            default:
                return shapeAppearanceModel.o();
        }
    }

    public final void f(int index, RectF bounds, PointF pointF) {
        switch (index) {
            case 1:
                pointF.set(bounds.right, bounds.bottom);
                return;
            case 2:
                pointF.set(bounds.left, bounds.bottom);
                return;
            case 3:
                pointF.set(bounds.left, bounds.top);
                return;
            default:
                pointF.set(bounds.right, bounds.top);
                return;
        }
    }

    public final float a(int index) {
        return (index + 1) * 90;
    }
}
