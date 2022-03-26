package q0;

import androidx.recyclerview.widget.RecyclerView;

/* JADX WARN: Classes with same name are omitted:
  
 */
/* loaded from: classes.dex */
public class u0 implements y2 {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ RecyclerView f3219a;

    public u0(RecyclerView this$0) {
        this.f3219a = this$0;
    }

    public void b(e2 viewHolder, e1 info, e1 postInfo) {
        this.f3219a.f1069c.H(viewHolder);
        this.f3219a.n(viewHolder, info, postInfo);
    }

    public void a(e2 viewHolder, e1 preInfo, e1 info) {
        this.f3219a.l(viewHolder, preInfo, info);
    }

    public void c(e2 viewHolder, e1 preInfo, e1 postInfo) {
        viewHolder.G(false);
        RecyclerView recyclerView = this.f3219a;
        if (recyclerView.C) {
            if (recyclerView.L.b(viewHolder, viewHolder, preInfo, postInfo)) {
                this.f3219a.L0();
            }
        } else if (recyclerView.L.d(viewHolder, preInfo, postInfo)) {
            this.f3219a.L0();
        }
    }

    public void d(e2 viewHolder) {
        RecyclerView recyclerView = this.f3219a;
        recyclerView.f1089m.m1(viewHolder.f3018a, recyclerView.f1069c);
    }
}
