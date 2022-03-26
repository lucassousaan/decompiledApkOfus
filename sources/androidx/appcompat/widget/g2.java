package androidx.appcompat.widget;

import android.widget.AbsListView;

/* JADX WARN: Classes with same name are omitted:
  
 */
/* loaded from: classes.dex */
public class g2 implements AbsListView.OnScrollListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ j2 f330a;

    public g2(j2 j2Var) {
        this.f330a = j2Var;
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public void onScroll(AbsListView view, int firstVisibleItem, int visibleItemCount, int totalItemCount) {
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public void onScrollStateChanged(AbsListView view, int scrollState) {
        if (scrollState == 1 && !this.f330a.A() && this.f330a.C.getContentView() != null) {
            j2 j2Var = this.f330a;
            j2Var.f407y.removeCallbacks(j2Var.f403u);
            this.f330a.f403u.run();
        }
    }
}
