package com.google.android.material.datepicker;

import android.view.View;
import android.widget.AdapterView;

/* JADX WARN: Classes with same name are omitted:
  
 */
/* loaded from: classes.dex */
public class k0 implements AdapterView.OnItemClickListener {

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ MaterialCalendarGridView f1409b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ m0 f1410c;

    public k0(m0 this$0, MaterialCalendarGridView materialCalendarGridView) {
        this.f1410c = this$0;
        this.f1409b = materialCalendarGridView;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public void onItemClick(AdapterView adapterView, View view, int position, long id) {
        w wVar;
        if (this.f1409b.getAdapter2().l(position)) {
            wVar = this.f1410c.f1418f;
            ((o) wVar).a(this.f1409b.getAdapter2().getItem(position).longValue());
        }
    }
}
