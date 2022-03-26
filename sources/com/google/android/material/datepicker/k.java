package com.google.android.material.datepicker;

import android.os.Build;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import com.example.helloworld.R;
import java.util.Calendar;
import java.util.Locale;

/* JADX WARN: Classes with same name are omitted:
  
 */
/* loaded from: classes.dex */
public class k extends BaseAdapter {

    /* renamed from: e  reason: collision with root package name */
    public static final int f1405e;

    /* renamed from: b  reason: collision with root package name */
    public final Calendar f1406b;

    /* renamed from: c  reason: collision with root package name */
    public final int f1407c;

    /* renamed from: d  reason: collision with root package name */
    public final int f1408d;

    static {
        f1405e = Build.VERSION.SDK_INT >= 26 ? 4 : 1;
    }

    public k() {
        Calendar i2 = s0.i();
        this.f1406b = i2;
        this.f1407c = i2.getMaximum(7);
        this.f1408d = i2.getFirstDayOfWeek();
    }

    /* renamed from: a */
    public Integer getItem(int position) {
        if (position >= this.f1407c) {
            return null;
        }
        return Integer.valueOf(b(position));
    }

    @Override // android.widget.Adapter
    public long getItemId(int position) {
        return 0L;
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return this.f1407c;
    }

    @Override // android.widget.Adapter
    public View getView(int position, View convertView, ViewGroup parent) {
        TextView dayOfWeek = (TextView) convertView;
        if (convertView == null) {
            LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
            dayOfWeek = (TextView) layoutInflater.inflate(R.layout.mtrl_calendar_day_of_week, parent, false);
        }
        this.f1406b.set(7, b(position));
        Locale locale = dayOfWeek.getResources().getConfiguration().locale;
        dayOfWeek.setText(this.f1406b.getDisplayName(7, f1405e, locale));
        dayOfWeek.setContentDescription(String.format(parent.getContext().getString(R.string.mtrl_picker_day_of_week_column_header), this.f1406b.getDisplayName(7, 2, Locale.getDefault())));
        return dayOfWeek;
    }

    public final int b(int position) {
        int dayConstant = this.f1408d + position;
        int i2 = this.f1407c;
        if (dayConstant > i2) {
            return dayConstant - i2;
        }
        return dayConstant;
    }
}
