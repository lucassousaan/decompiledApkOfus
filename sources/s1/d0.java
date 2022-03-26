package s1;

import android.view.View;
import android.widget.AdapterView;
import androidx.appcompat.widget.j2;

/* JADX WARN: Classes with same name are omitted:
  
 */
/* loaded from: classes.dex */
public class d0 implements AdapterView.OnItemClickListener {

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ e0 f3486b;

    public d0(e0 this$0) {
        this.f3486b = this$0;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public void onItemClick(AdapterView adapterView, View selectedView, int position, long id) {
        Object selectedItem;
        j2 j2Var;
        j2 j2Var2;
        j2 j2Var3;
        j2 j2Var4;
        j2 j2Var5;
        j2 j2Var6;
        if (position < 0) {
            j2Var6 = this.f3486b.f3488e;
            selectedItem = j2Var6.v();
        } else {
            selectedItem = this.f3486b.getAdapter().getItem(position);
        }
        this.f3486b.e(selectedItem);
        AdapterView.OnItemClickListener userOnitemClickListener = this.f3486b.getOnItemClickListener();
        if (userOnitemClickListener != null) {
            if (selectedView == null || position < 0) {
                j2Var3 = this.f3486b.f3488e;
                selectedView = j2Var3.y();
                j2Var4 = this.f3486b.f3488e;
                position = j2Var4.x();
                j2Var5 = this.f3486b.f3488e;
                id = j2Var5.w();
            }
            j2Var2 = this.f3486b.f3488e;
            userOnitemClickListener.onItemClick(j2Var2.e(), selectedView, position, id);
        }
        j2Var = this.f3486b.f3488e;
        j2Var.dismiss();
    }
}
