package q0;

import androidx.recyclerview.widget.RecyclerView;

/* JADX WARN: Classes with same name are omitted:
  
 */
/* loaded from: classes.dex */
public class g1 implements d1 {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ RecyclerView f3065a;

    public g1(RecyclerView recyclerView) {
        this.f3065a = recyclerView;
    }

    public void a(e2 item) {
        item.G(true);
        if (item.f3025h != null && item.f3026i == null) {
            item.f3025h = null;
        }
        item.f3026i = null;
        if (!item.I() && !this.f3065a.U0(item.f3018a) && item.x()) {
            this.f3065a.removeDetachedView(item.f3018a, false);
        }
    }
}
