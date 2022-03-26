package com.google.android.material.datepicker;

import android.content.Context;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import q0.b2;
import q0.j0;

/* JADX WARN: Classes with same name are omitted:
  
 */
/* loaded from: classes.dex */
public abstract class q0 extends LinearLayoutManager {
    public q0(Context context, int orientation, boolean reverseLayout) {
        super(orientation, reverseLayout);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, q0.m1
    public void I1(RecyclerView recyclerView, b2 state, int position) {
        j0 linearSmoothScroller = new p0(this, recyclerView.getContext());
        linearSmoothScroller.p(position);
        J1(linearSmoothScroller);
    }
}
