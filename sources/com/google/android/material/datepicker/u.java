package com.google.android.material.datepicker;

import android.view.View;

/* JADX WARN: Classes with same name are omitted:
  
 */
/* loaded from: classes.dex */
public class u implements View.OnClickListener {

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ m0 f1437b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ x f1438c;

    public u(x this$0, m0 m0Var) {
        this.f1438c = this$0;
        this.f1437b = m0Var;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        int currentItem = this.f1438c.D1().c2();
        if (currentItem - 1 >= 0) {
            this.f1438c.G1(this.f1437b.v(currentItem - 1));
        }
    }
}
