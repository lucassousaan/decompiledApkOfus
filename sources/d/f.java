package d;

import android.view.View;
import android.widget.AdapterView;

/* JADX WARN: Classes with same name are omitted:
  
 */
/* loaded from: classes.dex */
public class f implements AdapterView.OnItemClickListener {

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ j f1608b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ g f1609c;

    public f(g this$0, j jVar) {
        this.f1609c = this$0;
        this.f1608b = jVar;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public void onItemClick(AdapterView adapterView, View v2, int position, long id) {
        this.f1609c.f1622k.onClick(this.f1608b.f1633b, position);
        if (!this.f1609c.f1624m) {
            this.f1608b.f1633b.dismiss();
        }
    }
}
