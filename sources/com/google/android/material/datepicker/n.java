package com.google.android.material.datepicker;

import android.content.Context;
import androidx.recyclerview.widget.RecyclerView;
import q0.b2;

/* JADX WARN: Classes with same name are omitted:
  
 */
/* loaded from: classes.dex */
public class n extends q0 {
    public final /* synthetic */ int G;
    public final /* synthetic */ x H;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(x this$0, Context context, int orientation, boolean reverseLayout, int i2) {
        super(context, orientation, reverseLayout);
        this.H = this$0;
        this.G = i2;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public void M1(b2 state, int[] ints) {
        RecyclerView recyclerView;
        RecyclerView recyclerView2;
        RecyclerView recyclerView3;
        RecyclerView recyclerView4;
        if (this.G == 0) {
            recyclerView3 = this.H.f1451d0;
            ints[0] = recyclerView3.getWidth();
            recyclerView4 = this.H.f1451d0;
            ints[1] = recyclerView4.getWidth();
            return;
        }
        recyclerView = this.H.f1451d0;
        ints[0] = recyclerView.getHeight();
        recyclerView2 = this.H.f1451d0;
        ints[1] = recyclerView2.getHeight();
    }
}
