package com.google.android.material.timepicker;

import android.view.View;
import java.util.Objects;

/* JADX WARN: Classes with same name are omitted:
  
 */
/* loaded from: classes.dex */
public class m implements View.OnClickListener {

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ TimePickerView f1564b;

    public m(TimePickerView this$0) {
        this.f1564b = this$0;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View v2) {
        Objects.requireNonNull(this.f1564b);
    }
}
