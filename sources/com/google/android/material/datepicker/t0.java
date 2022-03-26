package com.google.android.material.datepicker;

import android.view.View;

/* JADX WARN: Classes with same name are omitted:
  
 */
/* loaded from: classes.dex */
public class t0 implements View.OnClickListener {

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ int f1435b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ v0 f1436c;

    public t0(v0 this$0, int i2) {
        this.f1436c = this$0;
        this.f1435b = i2;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        x xVar;
        x xVar2;
        x xVar3;
        x xVar4;
        int i2 = this.f1435b;
        xVar = this.f1436c.f1443c;
        i0 current = i0.j(i2, xVar.A1().f1392c);
        xVar2 = this.f1436c.f1443c;
        d calendarConstraints = xVar2.y1();
        i0 moveTo = calendarConstraints.m(current);
        xVar3 = this.f1436c.f1443c;
        xVar3.G1(moveTo);
        xVar4 = this.f1436c.f1443c;
        xVar4.H1(v.DAY);
    }
}
