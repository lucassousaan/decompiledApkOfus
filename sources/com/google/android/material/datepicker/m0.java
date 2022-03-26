package com.google.android.material.datepicker;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import com.example.helloworld.R;
import q0.e2;
import q0.n1;
import q0.x0;

/* JADX WARN: Classes with same name are omitted:
  
 */
/* loaded from: classes.dex */
public class m0 extends x0 {

    /* renamed from: c  reason: collision with root package name */
    public final Context f1415c;

    /* renamed from: d  reason: collision with root package name */
    public final d f1416d;

    /* renamed from: e  reason: collision with root package name */
    public final g f1417e;

    /* renamed from: f  reason: collision with root package name */
    public final w f1418f;

    /* renamed from: g  reason: collision with root package name */
    public final int f1419g;

    @Override // q0.x0
    public /* bridge */ /* synthetic */ e2 l(ViewGroup viewGroup, int i2) {
        return z(viewGroup);
    }

    /* JADX WARN: Generic types in debug info not equals: com.google.android.material.datepicker.g != com.google.android.material.datepicker.DateSelector<?> */
    public m0(Context context, g gVar, d calendarConstraints, w onDayClickListener) {
        i0 firstPage = calendarConstraints.r();
        i0 lastPage = calendarConstraints.o();
        i0 currentPage = calendarConstraints.q();
        if (firstPage.compareTo(currentPage) > 0) {
            throw new IllegalArgumentException("firstPage cannot be after currentPage");
        } else if (currentPage.compareTo(lastPage) <= 0) {
            int daysHeight = j0.f1399g * x.C1(context);
            int labelHeight = d0.Q1(context) ? x.C1(context) : 0;
            this.f1415c = context;
            this.f1419g = daysHeight + labelHeight;
            this.f1416d = calendarConstraints;
            this.f1417e = gVar;
            this.f1418f = onDayClickListener;
            s(true);
        } else {
            throw new IllegalArgumentException("currentPage cannot be after lastPage");
        }
    }

    public l0 z(ViewGroup viewGroup) {
        LinearLayout container = (LinearLayout) LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.mtrl_calendar_month_labeled, viewGroup, false);
        if (!d0.Q1(viewGroup.getContext())) {
            return new l0(container, false);
        }
        container.setLayoutParams(new n1(-1, this.f1419g));
        return new l0(container, true);
    }

    /* renamed from: y */
    public void j(l0 viewHolder, int position) {
        i0 month = this.f1416d.r().r(position);
        viewHolder.f1413t.setText(month.p(viewHolder.f3018a.getContext()));
        MaterialCalendarGridView monthGrid = (MaterialCalendarGridView) viewHolder.f1414u.findViewById(R.id.month_grid);
        if (monthGrid.getAdapter2() == null || !month.equals(monthGrid.getAdapter2().f1400b)) {
            j0 monthAdapter = new j0(month, this.f1417e, this.f1416d);
            monthGrid.setNumColumns(month.f1394e);
            monthGrid.setAdapter((ListAdapter) monthAdapter);
        } else {
            monthGrid.invalidate();
            monthGrid.getAdapter2().k(monthGrid);
        }
        monthGrid.setOnItemClickListener(new k0(this, monthGrid));
    }

    @Override // q0.x0
    public long d(int position) {
        return this.f1416d.r().r(position).q();
    }

    @Override // q0.x0
    public int c() {
        return this.f1416d.p();
    }

    public CharSequence w(int position) {
        return v(position).p(this.f1415c);
    }

    public i0 v(int position) {
        return this.f1416d.r().r(position);
    }

    public int x(i0 month) {
        return this.f1416d.r().s(month);
    }
}
