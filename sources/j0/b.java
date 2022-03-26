package j0;

import android.database.DataSetObserver;

/* JADX WARN: Classes with same name are omitted:
  
 */
/* loaded from: classes.dex */
public class b extends DataSetObserver {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ c f2283a;

    public b(c cVar) {
        this.f2283a = cVar;
    }

    @Override // android.database.DataSetObserver
    public void onChanged() {
        c cVar = this.f2283a;
        cVar.f2284b = true;
        cVar.notifyDataSetChanged();
    }

    @Override // android.database.DataSetObserver
    public void onInvalidated() {
        c cVar = this.f2283a;
        cVar.f2284b = false;
        cVar.notifyDataSetInvalidated();
    }
}
