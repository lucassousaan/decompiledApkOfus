package com.google.android.material.datepicker;

import java.util.Iterator;

/* JADX WARN: Classes with same name are omitted:
  
 */
/* loaded from: classes.dex */
public class f0 extends n0 {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ g0 f1390a;

    public f0(g0 this$0) {
        this.f1390a = this$0;
    }

    /* JADX WARN: Generic types in debug info not equals: com.google.android.material.datepicker.n0 != com.google.android.material.datepicker.OnSelectionChangedListener<S> */
    @Override // com.google.android.material.datepicker.n0
    public void a(Object obj) {
        Iterator it = this.f1390a.V.iterator();
        while (it.hasNext()) {
            ((n0) it.next()).a(obj);
        }
    }
}
