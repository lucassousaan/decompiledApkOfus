package q0;

import androidx.recyclerview.widget.RecyclerView;

/* JADX WARN: Classes with same name are omitted:
  
 */
/* loaded from: classes.dex */
public class v1 extends z0 {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ RecyclerView f3252a;

    public v1(RecyclerView recyclerView) {
        this.f3252a = recyclerView;
    }

    @Override // q0.z0
    public void a() {
        this.f3252a.o(null);
        RecyclerView recyclerView = this.f3252a;
        recyclerView.f1078g0.f2972f = true;
        recyclerView.O0(true);
        if (!this.f3252a.f1073e.n()) {
            this.f3252a.requestLayout();
        }
    }
}
