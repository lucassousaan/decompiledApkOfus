package com.google.android.material.datepicker;

import android.content.Context;
import android.widget.BaseAdapter;
import android.widget.TextView;
import java.util.Collection;

/* JADX WARN: Classes with same name are omitted:
  
 */
/* loaded from: classes.dex */
public class j0 extends BaseAdapter {

    /* renamed from: g  reason: collision with root package name */
    public static final int f1399g = s0.i().getMaximum(4);

    /* renamed from: b  reason: collision with root package name */
    public final i0 f1400b;

    /* renamed from: c  reason: collision with root package name */
    public final g f1401c;

    /* renamed from: d  reason: collision with root package name */
    public Collection f1402d;

    /* renamed from: e  reason: collision with root package name */
    public f f1403e;

    /* renamed from: f  reason: collision with root package name */
    public final d f1404f;

    /* JADX WARN: Generic types in debug info not equals: com.google.android.material.datepicker.g != com.google.android.material.datepicker.DateSelector<?> */
    public j0(i0 month, g gVar, d calendarConstraints) {
        this.f1400b = month;
        this.f1401c = gVar;
        this.f1404f = calendarConstraints;
        this.f1402d = gVar.h();
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public boolean hasStableIds() {
        return true;
    }

    /* renamed from: c */
    public Long getItem(int position) {
        if (position < this.f1400b.m() || position > g()) {
            return null;
        }
        return Long.valueOf(this.f1400b.n(h(position)));
    }

    @Override // android.widget.Adapter
    public long getItemId(int position) {
        return position / this.f1400b.f1394e;
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return this.f1400b.f1395f + b();
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0085 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0086  */
    /* renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public android.widget.TextView getView(int r11, android.view.View r12, android.view.ViewGroup r13) {
        /*
            r10 = this;
            android.content.Context r0 = r13.getContext()
            r10.e(r0)
            r0 = r12
            android.widget.TextView r0 = (android.widget.TextView) r0
            r1 = 0
            if (r12 != 0) goto L_0x001f
            android.content.Context r2 = r13.getContext()
            android.view.LayoutInflater r2 = android.view.LayoutInflater.from(r2)
            r3 = 2131427393(0x7f0b0041, float:1.84764E38)
            android.view.View r3 = r2.inflate(r3, r13, r1)
            r0 = r3
            android.widget.TextView r0 = (android.widget.TextView) r0
        L_0x001f:
            int r2 = r10.b()
            int r2 = r11 - r2
            if (r2 < 0) goto L_0x0077
            com.google.android.material.datepicker.i0 r3 = r10.f1400b
            int r4 = r3.f1395f
            if (r2 < r4) goto L_0x002e
            goto L_0x0077
        L_0x002e:
            int r4 = r2 + 1
            r0.setTag(r3)
            android.content.res.Resources r3 = r0.getResources()
            android.content.res.Configuration r3 = r3.getConfiguration()
            java.util.Locale r3 = r3.locale
            r5 = 1
            java.lang.Object[] r6 = new java.lang.Object[r5]
            java.lang.Integer r7 = java.lang.Integer.valueOf(r4)
            r6[r1] = r7
            java.lang.String r7 = "%d"
            java.lang.String r6 = java.lang.String.format(r3, r7, r6)
            r0.setText(r6)
            com.google.android.material.datepicker.i0 r6 = r10.f1400b
            long r6 = r6.n(r4)
            com.google.android.material.datepicker.i0 r8 = r10.f1400b
            int r8 = r8.f1393d
            com.google.android.material.datepicker.i0 r9 = com.google.android.material.datepicker.i0.l()
            int r9 = r9.f1393d
            if (r8 != r9) goto L_0x0069
            java.lang.String r8 = com.google.android.material.datepicker.h.a(r6)
            r0.setContentDescription(r8)
            goto L_0x0070
        L_0x0069:
            java.lang.String r8 = com.google.android.material.datepicker.h.d(r6)
            r0.setContentDescription(r8)
        L_0x0070:
            r0.setVisibility(r1)
            r0.setEnabled(r5)
            goto L_0x007f
        L_0x0077:
            r3 = 8
            r0.setVisibility(r3)
            r0.setEnabled(r1)
        L_0x007f:
            java.lang.Long r1 = r10.getItem(r11)
            if (r1 != 0) goto L_0x0086
            return r0
        L_0x0086:
            long r3 = r1.longValue()
            r10.i(r0, r3)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.datepicker.j0.getView(int, android.view.View, android.view.ViewGroup):android.widget.TextView");
    }

    public void k(MaterialCalendarGridView monthGrid) {
        for (Long date : this.f1402d) {
            j(monthGrid, date.longValue());
        }
        g gVar = this.f1401c;
        if (gVar != null) {
            for (Long date2 : gVar.h()) {
                j(monthGrid, date2.longValue());
            }
            this.f1402d = this.f1401c.h();
        }
    }

    public final void j(MaterialCalendarGridView monthGrid, long date) {
        if (i0.k(date).equals(this.f1400b)) {
            int day = this.f1400b.o(date);
            i((TextView) monthGrid.getChildAt(monthGrid.getAdapter2().a(day) - monthGrid.getFirstVisiblePosition()), date);
        }
    }

    public final void i(TextView day, long date) {
        e style;
        if (day != null) {
            if (((j) this.f1404f.n()).j(date)) {
                day.setEnabled(true);
                if (f(date)) {
                    style = this.f1403e.f1383b;
                } else if (s0.g().getTimeInMillis() == date) {
                    style = this.f1403e.f1384c;
                } else {
                    style = this.f1403e.f1382a;
                }
            } else {
                day.setEnabled(false);
                style = this.f1403e.f1388g;
            }
            style.b(day);
        }
    }

    public final boolean f(long date) {
        for (Long l2 : this.f1401c.h()) {
            long selectedDay = l2.longValue();
            if (s0.a(date) == s0.a(selectedDay)) {
                return true;
            }
        }
        return false;
    }

    public final void e(Context context) {
        if (this.f1403e == null) {
            this.f1403e = new f(context);
        }
    }

    public int b() {
        return this.f1400b.m();
    }

    public int g() {
        return (this.f1400b.m() + this.f1400b.f1395f) - 1;
    }

    public int h(int position) {
        return (position - this.f1400b.m()) + 1;
    }

    public int a(int day) {
        int offsetFromFirst = day - 1;
        return b() + offsetFromFirst;
    }

    public boolean l(int position) {
        return position >= b() && position <= g();
    }
}
