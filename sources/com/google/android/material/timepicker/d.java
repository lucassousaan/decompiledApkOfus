package com.google.android.material.timepicker;

import android.util.SparseArray;
import android.view.View;
import com.example.helloworld.R;
import f0.b;
import g0.e;
import g0.f;

/* JADX WARN: Classes with same name are omitted:
  
 */
/* loaded from: classes.dex */
public class d extends b {

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ ClockFaceView f1553d;

    public d(ClockFaceView this$0) {
        this.f1553d = this$0;
    }

    @Override // f0.b
    public void g(View host, f info) {
        SparseArray sparseArray;
        super.g(host, info);
        int index = ((Integer) host.getTag(R.id.material_value_index)).intValue();
        if (index > 0) {
            sparseArray = this.f1553d.A;
            info.s0((View) sparseArray.get(index - 1));
        }
        info.Z(e.a(0, 1, index, 1, false, host.isSelected()));
    }
}
