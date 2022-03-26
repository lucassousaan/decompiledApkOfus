package com.google.android.material.datepicker;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.example.helloworld.R;
import java.util.Calendar;
import java.util.Locale;
import q0.e2;
import q0.x0;

/* JADX WARN: Classes with same name are omitted:
  
 */
/* loaded from: classes.dex */
public class v0 extends x0 {

    /* renamed from: c  reason: collision with root package name */
    public final x f1443c;

    @Override // q0.x0
    public /* bridge */ /* synthetic */ e2 l(ViewGroup viewGroup, int i2) {
        return z(viewGroup);
    }

    /* JADX WARN: Generic types in debug info not equals: com.google.android.material.datepicker.x != com.google.android.material.datepicker.MaterialCalendar<?> */
    public v0(x xVar) {
        this.f1443c = xVar;
    }

    public u0 z(ViewGroup viewGroup) {
        TextView yearTextView = (TextView) LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.mtrl_calendar_year, viewGroup, false);
        return new u0(yearTextView);
    }

    /* renamed from: y */
    public void j(u0 viewHolder, int position) {
        int year = x(position);
        String navigateYear = viewHolder.f1439t.getContext().getString(R.string.mtrl_picker_navigate_to_year_description);
        viewHolder.f1439t.setText(String.format(Locale.getDefault(), "%d", Integer.valueOf(year)));
        viewHolder.f1439t.setContentDescription(String.format(navigateYear, Integer.valueOf(year)));
        f styles = this.f1443c.z1();
        Calendar calendar = s0.g();
        e style = calendar.get(1) == year ? styles.f1387f : styles.f1385d;
        for (Long day : this.f1443c.B1().h()) {
            calendar.setTimeInMillis(day.longValue());
            if (calendar.get(1) == year) {
                style = styles.f1386e;
            }
        }
        style.b(viewHolder.f1439t);
        viewHolder.f1439t.setOnClickListener(v(year));
    }

    public final View.OnClickListener v(int year) {
        return new t0(this, year);
    }

    @Override // q0.x0
    public int c() {
        return this.f1443c.y1().s();
    }

    public int w(int year) {
        return year - this.f1443c.y1().r().f1393d;
    }

    public int x(int position) {
        return this.f1443c.y1().r().f1393d + position;
    }
}
