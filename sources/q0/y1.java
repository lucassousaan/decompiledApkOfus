package q0;

import android.util.Log;
import android.view.animation.Interpolator;
import androidx.recyclerview.widget.RecyclerView;

/* JADX WARN: Classes with same name are omitted:
  
 */
/* loaded from: classes.dex */
public class y1 {

    /* renamed from: a  reason: collision with root package name */
    public int f3272a;

    /* renamed from: b  reason: collision with root package name */
    public int f3273b;

    /* renamed from: c  reason: collision with root package name */
    public int f3274c;

    /* renamed from: d  reason: collision with root package name */
    public int f3275d;

    /* renamed from: e  reason: collision with root package name */
    public Interpolator f3276e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f3277f;

    /* renamed from: g  reason: collision with root package name */
    public int f3278g;

    public y1(int dx, int dy) {
        this(dx, dy, Integer.MIN_VALUE, null);
    }

    public y1(int dx, int dy, int duration, Interpolator interpolator) {
        this.f3275d = -1;
        this.f3277f = false;
        this.f3278g = 0;
        this.f3272a = dx;
        this.f3273b = dy;
        this.f3274c = duration;
        this.f3276e = interpolator;
    }

    public void b(int targetPosition) {
        this.f3275d = targetPosition;
    }

    public boolean a() {
        return this.f3275d >= 0;
    }

    public void c(RecyclerView recyclerView) {
        if (this.f3275d >= 0) {
            int position = this.f3275d;
            this.f3275d = -1;
            recyclerView.v0(position);
            this.f3277f = false;
        } else if (this.f3277f) {
            e();
            recyclerView.f1072d0.f(this.f3272a, this.f3273b, this.f3274c, this.f3276e);
            int i2 = this.f3278g + 1;
            this.f3278g = i2;
            if (i2 > 10) {
                Log.e("RecyclerView", "Smooth Scroll action is being updated too frequently. Make sure you are not changing it unless necessary");
            }
            this.f3277f = false;
        } else {
            this.f3278g = 0;
        }
    }

    public final void e() {
        if (this.f3276e != null && this.f3274c < 1) {
            throw new IllegalStateException("If you provide an interpolator, you must set a positive duration");
        } else if (this.f3274c < 1) {
            throw new IllegalStateException("Scroll duration must be a positive number");
        }
    }

    public void d(int dx, int dy, int duration, Interpolator interpolator) {
        this.f3272a = dx;
        this.f3273b = dy;
        this.f3274c = duration;
        this.f3276e = interpolator;
        this.f3277f = true;
    }
}
