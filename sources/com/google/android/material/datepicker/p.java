package com.google.android.material.datepicker;

import android.graphics.Canvas;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import e0.d;
import java.util.Calendar;
import java.util.Objects;
import q0.b2;
import q0.h1;

/* JADX WARN: Classes with same name are omitted:
  
 */
/* loaded from: classes.dex */
public class p extends h1 {

    /* renamed from: a  reason: collision with root package name */
    public final Calendar f1421a = s0.i();

    /* renamed from: b  reason: collision with root package name */
    public final Calendar f1422b = s0.i();

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ x f1423c;

    public p(x this$0) {
        this.f1423c = this$0;
    }

    /* JADX WARN: Generic types in debug info not equals: e0.d != androidx.core.util.Pair<java.lang.Long, java.lang.Long> */
    @Override // q0.h1
    public void d(Canvas canvas, RecyclerView recyclerView, b2 state) {
        g gVar;
        if ((recyclerView.getAdapter() instanceof v0) && (recyclerView.getLayoutManager() instanceof GridLayoutManager)) {
            v0 v0Var = (v0) recyclerView.getAdapter();
            GridLayoutManager gridLayoutManager = (GridLayoutManager) recyclerView.getLayoutManager();
            gVar = this.f1423c.X;
            for (d dVar : gVar.g()) {
                Objects.requireNonNull(dVar);
            }
        }
    }
}
