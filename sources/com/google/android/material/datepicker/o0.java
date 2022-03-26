package com.google.android.material.datepicker;

import androidx.fragment.app.f0;
import java.util.LinkedHashSet;

/* JADX WARN: Classes with same name are omitted:
  
 */
/* loaded from: classes.dex */
public abstract class o0 extends f0 {
    public final LinkedHashSet V = new LinkedHashSet();

    /* JADX WARN: Generic types in debug info not equals: com.google.android.material.datepicker.n0 != com.google.android.material.datepicker.OnSelectionChangedListener<S> */
    /* JADX WARN: Generic types in debug info not equals: com.google.android.material.datepicker.o0 != com.google.android.material.datepicker.PickerFragment<S> */
    public boolean o1(n0 n0Var) {
        return this.V.add(n0Var);
    }

    /* JADX WARN: Generic types in debug info not equals: com.google.android.material.datepicker.o0 != com.google.android.material.datepicker.PickerFragment<S> */
    public void p1() {
        this.V.clear();
    }
}
