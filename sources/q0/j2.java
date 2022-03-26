package q0;

import androidx.recyclerview.widget.RecyclerView;

/* JADX WARN: Classes with same name are omitted:
  
 */
/* loaded from: classes.dex */
public class j2 extends q1 {

    /* renamed from: a  reason: collision with root package name */
    public boolean f3090a = false;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ k2 f3091b;

    public j2(k2 this$0) {
        this.f3091b = this$0;
    }

    @Override // q0.q1
    public void a(RecyclerView recyclerView, int newState) {
        super.a(recyclerView, newState);
        if (newState == 0 && this.f3090a) {
            this.f3090a = false;
            this.f3091b.k();
        }
    }

    @Override // q0.q1
    public void b(RecyclerView recyclerView, int dx, int dy) {
        if (dx != 0 || dy != 0) {
            this.f3090a = true;
        }
    }
}
