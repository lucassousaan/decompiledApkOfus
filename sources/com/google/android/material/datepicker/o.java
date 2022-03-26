package com.google.android.material.datepicker;

import androidx.recyclerview.widget.RecyclerView;
import java.util.Iterator;

/* JADX WARN: Classes with same name are omitted:
  
 */
/* loaded from: classes.dex */
public class o implements w {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ x f1420a;

    public o(x this$0) {
        this.f1420a = this$0;
    }

    /* JADX WARN: Generic types in debug info not equals: com.google.android.material.datepicker.n0 != com.google.android.material.datepicker.OnSelectionChangedListener<S> */
    public void a(long day) {
        d dVar;
        g gVar;
        RecyclerView recyclerView;
        RecyclerView recyclerView2;
        RecyclerView recyclerView3;
        g gVar2;
        dVar = this.f1420a.Y;
        if (((j) dVar.n()).j(day)) {
            gVar = this.f1420a.X;
            gVar.c(day);
            Iterator it = this.f1420a.V.iterator();
            while (it.hasNext()) {
                gVar2 = this.f1420a.X;
                ((n0) it.next()).a(gVar2.a());
            }
            recyclerView = this.f1420a.f1451d0;
            recyclerView.getAdapter().h();
            recyclerView2 = this.f1420a.f1450c0;
            if (recyclerView2 != null) {
                recyclerView3 = this.f1420a.f1450c0;
                recyclerView3.getAdapter().h();
            }
        }
    }
}
