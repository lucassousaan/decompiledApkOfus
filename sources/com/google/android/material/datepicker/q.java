package com.google.android.material.datepicker;

import android.view.View;
import com.example.helloworld.R;
import f0.b;
import g0.f;

/* JADX WARN: Classes with same name are omitted:
  
 */
/* loaded from: classes.dex */
public class q extends b {

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ x f1424d;

    public q(x this$0) {
        this.f1424d = this$0;
    }

    @Override // f0.b
    public void g(View view, f accessibilityNodeInfoCompat) {
        View view2;
        String str;
        super.g(view, accessibilityNodeInfoCompat);
        view2 = this.f1424d.f1453f0;
        if (view2.getVisibility() == 0) {
            str = this.f1424d.N(R.string.mtrl_picker_toggle_to_year_selection);
        } else {
            str = this.f1424d.N(R.string.mtrl_picker_toggle_to_day_selection);
        }
        accessibilityNodeInfoCompat.g0(str);
    }
}
