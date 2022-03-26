package androidx.appcompat.widget;

import android.view.View;

/* JADX WARN: Classes with same name are omitted:
  
 */
/* loaded from: classes.dex */
public class z2 implements View.OnClickListener {

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ SearchView f605b;

    public z2(SearchView this$0) {
        this.f605b = this$0;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View v2) {
        SearchView searchView = this.f605b;
        if (v2 == searchView.f187u) {
            searchView.V();
        } else if (v2 == searchView.f189w) {
            searchView.R();
        } else if (v2 == searchView.f188v) {
            searchView.W();
        } else if (v2 == searchView.f190x) {
            searchView.a0();
        } else if (v2 == searchView.f182q) {
            searchView.H();
        }
    }
}
