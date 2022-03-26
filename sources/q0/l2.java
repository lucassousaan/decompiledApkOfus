package q0;

import androidx.recyclerview.widget.StaggeredGridLayoutManager;

/* JADX WARN: Classes with same name are omitted:
  
 */
/* loaded from: classes.dex */
public class l2 implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ StaggeredGridLayoutManager f3109b;

    public l2(StaggeredGridLayoutManager this$0) {
        this.f3109b = this$0;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f3109b.P1();
    }
}
