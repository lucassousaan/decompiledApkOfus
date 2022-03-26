package q0;

import android.view.ViewGroup;
import b0.d;

/* JADX WARN: Classes with same name are omitted:
  
 */
/* loaded from: classes.dex */
public abstract class x0 {

    /* renamed from: a  reason: collision with root package name */
    public final y0 f3260a = new y0();

    /* renamed from: b  reason: collision with root package name */
    public boolean f3261b = false;

    public abstract int c();

    public abstract void j(e2 e2Var, int i2);

    public abstract e2 l(ViewGroup viewGroup, int i2);

    /* JADX WARN: Generic types in debug info not equals: q0.x0 != androidx.recyclerview.widget.RecyclerView$Adapter<VH> */
    public void k(e2 e2Var, int position) {
        j(e2Var, position);
    }

    /* JADX WARN: Generic types in debug info not equals: q0.x0 != androidx.recyclerview.widget.RecyclerView$Adapter<VH> */
    public final e2 b(ViewGroup parent, int viewType) {
        try {
            d.a("RV CreateView");
            e2 l2 = l(parent, viewType);
            if (l2.f3018a.getParent() == null) {
                l2.f3023f = viewType;
                return l2;
            }
            throw new IllegalStateException("ViewHolder views must not be attached when created. Ensure that you are not passing 'true' to the attachToRoot parameter of LayoutInflater.inflate(..., boolean attachToRoot)");
        } finally {
            d.b();
        }
    }

    /* JADX WARN: Generic types in debug info not equals: q0.x0 != androidx.recyclerview.widget.RecyclerView$Adapter<VH> */
    public final void a(e2 e2Var, int position) {
        e2Var.f3020c = position;
        if (g()) {
            e2Var.f3022e = d(position);
        }
        e2Var.F(1, 519);
        d.a("RV OnBindView");
        e2Var.o();
        k(e2Var, position);
        e2Var.d();
        ViewGroup.LayoutParams layoutParams = e2Var.f3018a.getLayoutParams();
        if (layoutParams instanceof n1) {
            ((n1) layoutParams).f3144c = true;
        }
        d.b();
    }

    /* JADX WARN: Generic types in debug info not equals: q0.x0 != androidx.recyclerview.widget.RecyclerView$Adapter<VH> */
    public int e() {
        return 0;
    }

    /* JADX WARN: Generic types in debug info not equals: q0.x0 != androidx.recyclerview.widget.RecyclerView$Adapter<VH> */
    public void s(boolean hasStableIds) {
        if (!f()) {
            this.f3261b = hasStableIds;
            return;
        }
        throw new IllegalStateException("Cannot change whether this adapter has stable IDs while the adapter has registered observers.");
    }

    /* JADX WARN: Generic types in debug info not equals: q0.x0 != androidx.recyclerview.widget.RecyclerView$Adapter<VH> */
    public long d(int position) {
        return -1L;
    }

    /* JADX WARN: Generic types in debug info not equals: q0.x0 != androidx.recyclerview.widget.RecyclerView$Adapter<VH> */
    public final boolean g() {
        return this.f3261b;
    }

    /* JADX WARN: Generic types in debug info not equals: q0.x0 != androidx.recyclerview.widget.RecyclerView$Adapter<VH> */
    public void q() {
    }

    /* JADX WARN: Generic types in debug info not equals: q0.x0 != androidx.recyclerview.widget.RecyclerView$Adapter<VH> */
    public boolean n() {
        return false;
    }

    /* JADX WARN: Generic types in debug info not equals: q0.x0 != androidx.recyclerview.widget.RecyclerView$Adapter<VH> */
    public void o() {
    }

    /* JADX WARN: Generic types in debug info not equals: q0.x0 != androidx.recyclerview.widget.RecyclerView$Adapter<VH> */
    public void p() {
    }

    /* JADX WARN: Generic types in debug info not equals: q0.x0 != androidx.recyclerview.widget.RecyclerView$Adapter<VH> */
    public final boolean f() {
        return this.f3260a.a();
    }

    /* JADX WARN: Generic types in debug info not equals: q0.x0 != androidx.recyclerview.widget.RecyclerView$Adapter<VH> */
    public void r(z0 observer) {
        this.f3260a.registerObserver(observer);
    }

    /* JADX WARN: Generic types in debug info not equals: q0.x0 != androidx.recyclerview.widget.RecyclerView$Adapter<VH> */
    public void t(z0 observer) {
        this.f3260a.unregisterObserver(observer);
    }

    /* JADX WARN: Generic types in debug info not equals: q0.x0 != androidx.recyclerview.widget.RecyclerView$Adapter<VH> */
    public void i() {
    }

    /* JADX WARN: Generic types in debug info not equals: q0.x0 != androidx.recyclerview.widget.RecyclerView$Adapter<VH> */
    public void m() {
    }

    /* JADX WARN: Generic types in debug info not equals: q0.x0 != androidx.recyclerview.widget.RecyclerView$Adapter<VH> */
    public final void h() {
        this.f3260a.b();
    }
}
