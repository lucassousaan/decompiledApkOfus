package q0;

import androidx.recyclerview.widget.RecyclerView;

/* JADX WARN: Classes with same name are omitted:
  
 */
/* loaded from: classes.dex */
public class w0 implements a {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ RecyclerView f3253a;

    public w0(RecyclerView this$0) {
        this.f3253a = this$0;
    }

    public e2 b(int position) {
        e2 vh = this.f3253a.Z(position, true);
        if (vh != null && !this.f3253a.f1075f.n(vh.f3018a)) {
            return vh;
        }
        return null;
    }

    public void f(int start, int count) {
        this.f3253a.C0(start, count, true);
        RecyclerView recyclerView = this.f3253a;
        recyclerView.f1084j0 = true;
        recyclerView.f1078g0.f2969c += count;
    }

    public void g(int positionStart, int itemCount) {
        this.f3253a.C0(positionStart, itemCount, false);
        this.f3253a.f1084j0 = true;
    }

    public void c(int positionStart, int itemCount, Object payload) {
        this.f3253a.v1(positionStart, itemCount, payload);
        this.f3253a.f1086k0 = true;
    }

    public void h(b op) {
        a(op);
    }

    public void a(b op) {
        switch (op.f2961a) {
            case 1:
                RecyclerView recyclerView = this.f3253a;
                recyclerView.f1089m.R0(recyclerView, op.f2962b, op.f2964d);
                return;
            case 2:
                RecyclerView recyclerView2 = this.f3253a;
                recyclerView2.f1089m.U0(recyclerView2, op.f2962b, op.f2964d);
                return;
            case 4:
                RecyclerView recyclerView3 = this.f3253a;
                recyclerView3.f1089m.W0(recyclerView3, op.f2962b, op.f2964d, op.f2963c);
                return;
            case 8:
                RecyclerView recyclerView4 = this.f3253a;
                recyclerView4.f1089m.T0(recyclerView4, op.f2962b, op.f2964d, 1);
                return;
            default:
                return;
        }
    }

    public void i(b op) {
        a(op);
    }

    public void d(int positionStart, int itemCount) {
        this.f3253a.A0(positionStart, itemCount);
        this.f3253a.f1084j0 = true;
    }

    public void e(int from, int to) {
        this.f3253a.B0(from, to);
        this.f3253a.f1084j0 = true;
    }
}
