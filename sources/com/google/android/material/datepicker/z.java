package com.google.android.material.datepicker;

import android.view.View;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* JADX WARN: Classes with same name are omitted:
  
 */
/* loaded from: classes.dex */
public class z implements View.OnClickListener {

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ d0 f1454b;

    public z(d0 this$0) {
        this.f1454b = this$0;
    }

    /* JADX WARN: Generic types in debug info not equals: com.google.android.material.datepicker.e0 != com.google.android.material.datepicker.MaterialPickerOnPositiveButtonClickListener<? super S> */
    @Override // android.view.View.OnClickListener
    public void onClick(View v2) {
        LinkedHashSet linkedHashSet;
        linkedHashSet = this.f1454b.f1361l0;
        Iterator it = linkedHashSet.iterator();
        while (it.hasNext()) {
            ((e0) it.next()).a(this.f1454b.N1());
        }
        this.f1454b.r1();
    }
}
