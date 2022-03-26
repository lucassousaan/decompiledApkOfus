package q0;

import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.widget.Scroller;
import androidx.recyclerview.widget.RecyclerView;

/* JADX WARN: Classes with same name are omitted:
  
 */
/* loaded from: classes.dex */
public abstract class k2 extends o1 {

    /* renamed from: a  reason: collision with root package name */
    public RecyclerView f3096a;

    /* renamed from: b  reason: collision with root package name */
    public final q1 f3097b = new j2(this);

    public abstract int[] c(m1 m1Var, View view);

    public abstract j0 e(m1 m1Var);

    public abstract View g(m1 m1Var);

    public abstract int h(m1 m1Var, int i2, int i3);

    @Override // q0.o1
    public boolean a(int velocityX, int velocityY) {
        m1 layoutManager = this.f3096a.getLayoutManager();
        if (layoutManager == null) {
            return false;
        }
        x0 adapter = this.f3096a.getAdapter();
        if (adapter == null) {
            return false;
        }
        int minFlingVelocity = this.f3096a.getMinFlingVelocity();
        return (Math.abs(velocityY) > minFlingVelocity || Math.abs(velocityX) > minFlingVelocity) && j(layoutManager, velocityX, velocityY);
    }

    public void b(RecyclerView recyclerView) {
        RecyclerView recyclerView2 = this.f3096a;
        if (recyclerView2 != recyclerView) {
            if (recyclerView2 != null) {
                f();
            }
            this.f3096a = recyclerView;
            if (recyclerView != null) {
                i();
                new Scroller(this.f3096a.getContext(), new DecelerateInterpolator());
                k();
            }
        }
    }

    public final void i() {
        if (this.f3096a.getOnFlingListener() == null) {
            this.f3096a.k(this.f3097b);
            this.f3096a.setOnFlingListener(this);
            return;
        }
        throw new IllegalStateException("An instance of OnFlingListener already set.");
    }

    public final void f() {
        this.f3096a.X0(this.f3097b);
        this.f3096a.setOnFlingListener(null);
    }

    public final boolean j(m1 layoutManager, int velocityX, int velocityY) {
        a2 smoothScroller;
        int targetPosition;
        if (!(layoutManager instanceof z1) || (smoothScroller = d(layoutManager)) == null || (targetPosition = h(layoutManager, velocityX, velocityY)) == -1) {
            return false;
        }
        smoothScroller.p(targetPosition);
        layoutManager.J1(smoothScroller);
        return true;
    }

    public void k() {
        m1 layoutManager;
        View snapView;
        RecyclerView recyclerView = this.f3096a;
        if (recyclerView != null && (layoutManager = recyclerView.getLayoutManager()) != null && (snapView = g(layoutManager)) != null) {
            int[] snapDistance = c(layoutManager, snapView);
            if (snapDistance[0] != 0 || snapDistance[1] != 0) {
                this.f3096a.k1(snapDistance[0], snapDistance[1]);
            }
        }
    }

    public a2 d(m1 layoutManager) {
        return e(layoutManager);
    }
}
