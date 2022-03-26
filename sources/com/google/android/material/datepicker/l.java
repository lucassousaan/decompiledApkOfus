package com.google.android.material.datepicker;

import androidx.recyclerview.widget.RecyclerView;

/* JADX WARN: Classes with same name are omitted:
  
 */
/* loaded from: classes.dex */
public class l implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ int f1411b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ x f1412c;

    public l(x this$0, int i2) {
        this.f1412c = this$0;
        this.f1411b = i2;
    }

    @Override // java.lang.Runnable
    public void run() {
        RecyclerView recyclerView;
        recyclerView = this.f1412c.f1451d0;
        recyclerView.o1(this.f1411b);
    }
}
