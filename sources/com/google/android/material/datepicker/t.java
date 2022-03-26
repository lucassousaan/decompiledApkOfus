package com.google.android.material.datepicker;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* JADX WARN: Classes with same name are omitted:
  
 */
/* loaded from: classes.dex */
public class t implements View.OnClickListener {

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ m0 f1433b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ x f1434c;

    public t(x this$0, m0 m0Var) {
        this.f1434c = this$0;
        this.f1433b = m0Var;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        RecyclerView recyclerView;
        int currentItem = this.f1434c.D1().Z1();
        int i2 = currentItem + 1;
        recyclerView = this.f1434c.f1451d0;
        if (i2 < recyclerView.getAdapter().c()) {
            this.f1434c.G1(this.f1433b.v(currentItem + 1));
        }
    }
}
