package q0;

import android.graphics.PointF;
import android.util.Log;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* JADX WARN: Classes with same name are omitted:
  
 */
/* loaded from: classes.dex */
public abstract class a2 {

    /* renamed from: b  reason: collision with root package name */
    public RecyclerView f2954b;

    /* renamed from: c  reason: collision with root package name */
    public m1 f2955c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f2956d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f2957e;

    /* renamed from: f  reason: collision with root package name */
    public View f2958f;

    /* renamed from: h  reason: collision with root package name */
    public boolean f2960h;

    /* renamed from: a  reason: collision with root package name */
    public int f2953a = -1;

    /* renamed from: g  reason: collision with root package name */
    public final y1 f2959g = new y1(0, 0);

    public abstract void l(int i2, int i3, b2 b2Var, y1 y1Var);

    public abstract void m();

    public abstract void n();

    public abstract void o(View view, b2 b2Var, y1 y1Var);

    public void q(RecyclerView recyclerView, m1 layoutManager) {
        recyclerView.f1072d0.g();
        if (this.f2960h) {
            Log.w("RecyclerView", "An instance of " + getClass().getSimpleName() + " was started more than once. Each instance of" + getClass().getSimpleName() + " is intended to only be used once. You should create a new instance for each use.");
        }
        this.f2954b = recyclerView;
        this.f2955c = layoutManager;
        int i2 = this.f2953a;
        if (i2 != -1) {
            recyclerView.f1078g0.f2967a = i2;
            this.f2957e = true;
            this.f2956d = true;
            this.f2958f = b(f());
            m();
            this.f2954b.f1072d0.e();
            this.f2960h = true;
            return;
        }
        throw new IllegalArgumentException("Invalid target position");
    }

    public void p(int targetPosition) {
        this.f2953a = targetPosition;
    }

    public PointF a(int targetPosition) {
        m1 layoutManager = e();
        if (layoutManager instanceof z1) {
            return ((z1) layoutManager).a(targetPosition);
        }
        Log.w("RecyclerView", "You should override computeScrollVectorForPosition when the LayoutManager does not implement " + z1.class.getCanonicalName());
        return null;
    }

    public m1 e() {
        return this.f2955c;
    }

    public final void r() {
        if (this.f2957e) {
            this.f2957e = false;
            n();
            this.f2954b.f1078g0.f2967a = -1;
            this.f2958f = null;
            this.f2953a = -1;
            this.f2956d = false;
            this.f2955c.f1(this);
            this.f2955c = null;
            this.f2954b = null;
        }
    }

    public boolean g() {
        return this.f2956d;
    }

    public boolean h() {
        return this.f2957e;
    }

    public int f() {
        return this.f2953a;
    }

    public void j(int dx, int dy) {
        PointF pointF;
        RecyclerView recyclerView = this.f2954b;
        if (this.f2953a == -1 || recyclerView == null) {
            r();
        }
        if (this.f2956d && this.f2958f == null && this.f2955c != null && (pointF = a(this.f2953a)) != null) {
            float f2 = pointF.x;
            if (!(f2 == 0.0f && pointF.y == 0.0f)) {
                recyclerView.f1((int) Math.signum(f2), (int) Math.signum(pointF.y), null);
            }
        }
        this.f2956d = false;
        View view = this.f2958f;
        if (view != null) {
            if (d(view) == this.f2953a) {
                o(this.f2958f, recyclerView.f1078g0, this.f2959g);
                this.f2959g.c(recyclerView);
                r();
            } else {
                Log.e("RecyclerView", "Passed over target position while smooth scrolling.");
                this.f2958f = null;
            }
        }
        if (this.f2957e) {
            l(dx, dy, recyclerView.f1078g0, this.f2959g);
            boolean hadJumpTarget = this.f2959g.a();
            this.f2959g.c(recyclerView);
            if (hadJumpTarget && this.f2957e) {
                this.f2956d = true;
                recyclerView.f1072d0.e();
            }
        }
    }

    public int d(View view) {
        return this.f2954b.d0(view);
    }

    public int c() {
        return this.f2954b.f1089m.J();
    }

    public View b(int position) {
        return this.f2954b.f1089m.C(position);
    }

    public void k(View child) {
        if (d(child) == f()) {
            this.f2958f = child;
        }
    }

    public void i(PointF scrollVector) {
        float f2 = scrollVector.x;
        float f3 = scrollVector.y;
        float magnitude = (float) Math.sqrt((f2 * f2) + (f3 * f3));
        scrollVector.x /= magnitude;
        scrollVector.y /= magnitude;
    }
}
