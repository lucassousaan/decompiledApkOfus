package androidx.appcompat.widget;

import android.database.DataSetObserver;

/* JADX WARN: Classes with same name are omitted:
  
 */
/* loaded from: classes.dex */
public class f2 extends DataSetObserver {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ j2 f321a;

    public f2(j2 j2Var) {
        this.f321a = j2Var;
    }

    @Override // android.database.DataSetObserver
    public void onChanged() {
        if (this.f321a.a()) {
            this.f321a.i();
        }
    }

    @Override // android.database.DataSetObserver
    public void onInvalidated() {
        this.f321a.dismiss();
    }
}
