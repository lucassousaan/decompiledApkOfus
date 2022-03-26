package com.google.android.material.datepicker;

import android.view.View;
import android.widget.Button;
import com.google.android.material.internal.CheckableImageButton;

/* JADX WARN: Classes with same name are omitted:
  
 */
/* loaded from: classes.dex */
public class c0 implements View.OnClickListener {

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ d0 f1354b;

    public c0(d0 this$0) {
        this.f1354b = this$0;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View v2) {
        Button button;
        g gVar;
        CheckableImageButton checkableImageButton;
        CheckableImageButton checkableImageButton2;
        button = this.f1354b.B0;
        gVar = this.f1354b.f1366q0;
        button.setEnabled(gVar.b());
        checkableImageButton = this.f1354b.f1375z0;
        checkableImageButton.toggle();
        d0 d0Var = this.f1354b;
        checkableImageButton2 = d0Var.f1375z0;
        d0Var.V1(checkableImageButton2);
        this.f1354b.T1();
    }
}
