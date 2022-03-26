package q0;

import androidx.recyclerview.widget.RecyclerView;

/* JADX WARN: Classes with same name are omitted:
  
 */
/* loaded from: classes.dex */
public class s extends q1 {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ v f3188a;

    public s(v this$0) {
        this.f3188a = this$0;
    }

    @Override // q0.q1
    public void b(RecyclerView recyclerView, int dx, int dy) {
        this.f3188a.B(recyclerView.computeHorizontalScrollOffset(), recyclerView.computeVerticalScrollOffset());
    }
}
