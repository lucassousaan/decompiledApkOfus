package androidx.appcompat.widget;

import android.view.View;
import android.widget.AdapterView;

/* JADX WARN: Classes with same name are omitted:
  
 */
/* loaded from: classes.dex */
public class x0 implements AdapterView.OnItemClickListener {

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ a1 f582b;

    public x0(a1 this$1, e1 e1Var) {
        this.f582b = this$1;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public void onItemClick(AdapterView adapterView, View v2, int position, long id) {
        this.f582b.J.setSelection(position);
        if (this.f582b.J.getOnItemClickListener() != null) {
            a1 a1Var = this.f582b;
            a1Var.J.performItemClick(v2, position, a1Var.G.getItemId(position));
        }
        this.f582b.dismiss();
    }
}
