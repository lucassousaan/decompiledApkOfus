package q0;

import androidx.recyclerview.widget.RecyclerView;

/* JADX WARN: Classes with same name are omitted:
  
 */
/* loaded from: classes.dex */
public class r0 implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ RecyclerView f3183b;

    public r0(RecyclerView this$0) {
        this.f3183b = this$0;
    }

    @Override // java.lang.Runnable
    public void run() {
        RecyclerView recyclerView = this.f3183b;
        if (recyclerView.f1105u && !recyclerView.isLayoutRequested()) {
            RecyclerView recyclerView2 = this.f3183b;
            if (!recyclerView2.f1099r) {
                recyclerView2.requestLayout();
            } else if (recyclerView2.f1111x) {
                recyclerView2.f1109w = true;
            } else {
                recyclerView2.u();
            }
        }
    }
}
