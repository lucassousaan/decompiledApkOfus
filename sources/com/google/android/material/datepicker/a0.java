package com.google.android.material.datepicker;

import android.view.View;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* JADX WARN: Classes with same name are omitted:
  
 */
/* loaded from: classes.dex */
public class a0 implements View.OnClickListener {

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ d0 f1346b;

    public a0(d0 this$0) {
        this.f1346b = this$0;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View v2) {
        LinkedHashSet linkedHashSet;
        linkedHashSet = this.f1346b.f1362m0;
        Iterator it = linkedHashSet.iterator();
        while (it.hasNext()) {
            View.OnClickListener listener = (View.OnClickListener) it.next();
            listener.onClick(v2);
        }
        this.f1346b.r1();
    }
}
