package com.google.android.material.datepicker;

import android.widget.LinearLayout;
import android.widget.TextView;
import com.example.helloworld.R;
import f0.c1;
import q0.e2;

/* JADX WARN: Classes with same name are omitted:
  
 */
/* loaded from: classes.dex */
public class l0 extends e2 {

    /* renamed from: t  reason: collision with root package name */
    public final TextView f1413t;

    /* renamed from: u  reason: collision with root package name */
    public final MaterialCalendarGridView f1414u;

    public l0(LinearLayout container, boolean showLabel) {
        super(container);
        TextView textView = (TextView) container.findViewById(R.id.month_title);
        this.f1413t = textView;
        c1.m0(textView, true);
        this.f1414u = (MaterialCalendarGridView) container.findViewById(R.id.month_grid);
        if (!showLabel) {
            textView.setVisibility(8);
        }
    }
}
