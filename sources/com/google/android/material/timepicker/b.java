package com.google.android.material.timepicker;

import android.text.Editable;
import android.text.TextUtils;
import com.google.android.material.chip.Chip;
import l1.p;

/* JADX WARN: Classes with same name are omitted:
  
 */
/* loaded from: classes.dex */
public class b extends p {

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ ChipTextInputComboView f1551b;

    public b(ChipTextInputComboView chipTextInputComboView) {
        this.f1551b = chipTextInputComboView;
    }

    @Override // l1.p, android.text.TextWatcher
    public void afterTextChanged(Editable editable) {
        Chip chip;
        String c2;
        Chip chip2;
        String c3;
        if (TextUtils.isEmpty(editable)) {
            chip2 = this.f1551b.f1525b;
            c3 = this.f1551b.c("00");
            chip2.setText(c3);
            return;
        }
        chip = this.f1551b.f1525b;
        c2 = this.f1551b.c(editable);
        chip.setText(c2);
    }
}
