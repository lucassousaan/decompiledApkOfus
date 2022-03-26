package s1;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.View;
import q1.j;
import q1.q;

/* JADX WARN: Classes with same name are omitted:
  
 */
/* loaded from: classes.dex */
public class m extends j {
    public final RectF A;
    public int B;

    /* renamed from: z  reason: collision with root package name */
    public final Paint f3511z;

    public m(q shapeAppearanceModel) {
        super(shapeAppearanceModel != null ? shapeAppearanceModel : new q());
        this.f3511z = new Paint(1);
        l0();
        this.A = new RectF();
    }

    public final void l0() {
        this.f3511z.setStyle(Paint.Style.FILL_AND_STROKE);
        this.f3511z.setColor(-1);
        this.f3511z.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
    }

    public boolean e0() {
        return !this.A.isEmpty();
    }

    public void j0(float left, float top, float right, float bottom) {
        RectF rectF = this.A;
        if (left != rectF.left || top != rectF.top || right != rectF.right || bottom != rectF.bottom) {
            rectF.set(left, top, right, bottom);
            invalidateSelf();
        }
    }

    public void k0(RectF bounds) {
        j0(bounds.left, bounds.top, bounds.right, bounds.bottom);
    }

    public void h0() {
        j0(0.0f, 0.0f, 0.0f, 0.0f);
    }

    @Override // q1.j, android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        g0(canvas);
        super.draw(canvas);
        canvas.drawRect(this.A, this.f3511z);
        f0(canvas);
    }

    public final void g0(Canvas canvas) {
        Drawable.Callback callback = getCallback();
        if (m0(callback)) {
            View viewCallback = (View) callback;
            if (viewCallback.getLayerType() != 2) {
                viewCallback.setLayerType(2, null);
                return;
            }
            return;
        }
        i0(canvas);
    }

    public final void i0(Canvas canvas) {
        this.B = canvas.saveLayer(0.0f, 0.0f, canvas.getWidth(), canvas.getHeight(), null);
    }

    public final void f0(Canvas canvas) {
        if (!m0(getCallback())) {
            canvas.restoreToCount(this.B);
        }
    }

    public final boolean m0(Drawable.Callback callback) {
        return callback instanceof View;
    }
}
