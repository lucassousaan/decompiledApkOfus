package p1;

import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.Shader;

/* JADX WARN: Classes with same name are omitted:
  
 */
/* loaded from: classes.dex */
public class a {

    /* renamed from: i  reason: collision with root package name */
    public static final int[] f2774i = new int[3];

    /* renamed from: j  reason: collision with root package name */
    public static final float[] f2775j = {0.0f, 0.5f, 1.0f};

    /* renamed from: k  reason: collision with root package name */
    public static final int[] f2776k = new int[4];

    /* renamed from: l  reason: collision with root package name */
    public static final float[] f2777l = {0.0f, 0.0f, 0.5f, 1.0f};

    /* renamed from: a  reason: collision with root package name */
    public final Paint f2778a;

    /* renamed from: b  reason: collision with root package name */
    public final Paint f2779b;

    /* renamed from: c  reason: collision with root package name */
    public final Paint f2780c;

    /* renamed from: d  reason: collision with root package name */
    public int f2781d;

    /* renamed from: e  reason: collision with root package name */
    public int f2782e;

    /* renamed from: f  reason: collision with root package name */
    public int f2783f;

    /* renamed from: g  reason: collision with root package name */
    public final Path f2784g;

    /* renamed from: h  reason: collision with root package name */
    public Paint f2785h;

    public a() {
        this(-16777216);
    }

    public a(int color) {
        this.f2784g = new Path();
        this.f2785h = new Paint();
        this.f2778a = new Paint();
        d(color);
        this.f2785h.setColor(0);
        Paint paint = new Paint(4);
        this.f2779b = paint;
        paint.setStyle(Paint.Style.FILL);
        this.f2780c = new Paint(paint);
    }

    public void d(int color) {
        this.f2781d = x.a.d(color, 68);
        this.f2782e = x.a.d(color, 20);
        this.f2783f = x.a.d(color, 0);
        this.f2778a.setColor(this.f2781d);
    }

    public void b(Canvas canvas, Matrix transform, RectF bounds, int elevation) {
        bounds.bottom += elevation;
        bounds.offset(0.0f, -elevation);
        int[] iArr = f2774i;
        iArr[0] = this.f2783f;
        iArr[1] = this.f2782e;
        iArr[2] = this.f2781d;
        Paint paint = this.f2780c;
        float f2 = bounds.left;
        paint.setShader(new LinearGradient(f2, bounds.top, f2, bounds.bottom, iArr, f2775j, Shader.TileMode.CLAMP));
        canvas.save();
        canvas.concat(transform);
        canvas.drawRect(bounds, this.f2780c);
        canvas.restore();
    }

    public void a(Canvas canvas, Matrix matrix, RectF bounds, int elevation, float startAngle, float sweepAngle) {
        boolean drawShadowInsideBounds = sweepAngle < 0.0f;
        Path arcBounds = this.f2784g;
        if (drawShadowInsideBounds) {
            int[] iArr = f2776k;
            iArr[0] = 0;
            iArr[1] = this.f2783f;
            iArr[2] = this.f2782e;
            iArr[3] = this.f2781d;
        } else {
            arcBounds.rewind();
            arcBounds.moveTo(bounds.centerX(), bounds.centerY());
            arcBounds.arcTo(bounds, startAngle, sweepAngle);
            arcBounds.close();
            bounds.inset(-elevation, -elevation);
            int[] iArr2 = f2776k;
            iArr2[0] = 0;
            iArr2[1] = this.f2781d;
            iArr2[2] = this.f2782e;
            iArr2[3] = this.f2783f;
        }
        float radius = bounds.width() / 2.0f;
        if (radius > 0.0f) {
            float startRatio = 1.0f - (elevation / radius);
            float midRatio = startRatio + ((1.0f - startRatio) / 2.0f);
            float[] fArr = f2777l;
            fArr[1] = startRatio;
            fArr[2] = midRatio;
            RadialGradient shader = new RadialGradient(bounds.centerX(), bounds.centerY(), radius, f2776k, fArr, Shader.TileMode.CLAMP);
            this.f2779b.setShader(shader);
            canvas.save();
            canvas.concat(matrix);
            canvas.scale(1.0f, bounds.height() / bounds.width());
            if (!drawShadowInsideBounds) {
                canvas.clipPath(arcBounds, Region.Op.DIFFERENCE);
                canvas.drawPath(arcBounds, this.f2785h);
            }
            canvas.drawArc(bounds, startAngle, sweepAngle, true, this.f2779b);
            canvas.restore();
        }
    }

    public Paint c() {
        return this.f2778a;
    }
}
