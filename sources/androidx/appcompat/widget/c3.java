package androidx.appcompat.widget;

import android.view.View;
import android.widget.AdapterView;

/* JADX WARN: Classes with same name are omitted:
  
 */
/* loaded from: classes.dex */
public class c3 implements AdapterView.OnItemClickListener {

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ SearchView f276b;

    public c3(SearchView this$0) {
        this.f276b = this$0;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public void onItemClick(AdapterView adapterView, View view, int position, long id) {
        this.f276b.S(position);
    }
}
