package com.google.android.material.datepicker;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.Calendar;
import java.util.GregorianCalendar;

/* JADX WARN: Classes with same name are omitted:
  
 */
/* loaded from: classes.dex */
public final class i0 implements Comparable, Parcelable {
    public static final Parcelable.Creator<i0> CREATOR = new h0();

    /* renamed from: b  reason: collision with root package name */
    public final Calendar f1391b;

    /* renamed from: c  reason: collision with root package name */
    public final int f1392c;

    /* renamed from: d  reason: collision with root package name */
    public final int f1393d;

    /* renamed from: e  reason: collision with root package name */
    public final int f1394e;

    /* renamed from: f  reason: collision with root package name */
    public final int f1395f;

    /* renamed from: g  reason: collision with root package name */
    public final long f1396g;

    /* renamed from: h  reason: collision with root package name */
    public String f1397h;

    public i0(Calendar rawCalendar) {
        rawCalendar.set(5, 1);
        Calendar d2 = s0.d(rawCalendar);
        this.f1391b = d2;
        this.f1392c = d2.get(2);
        this.f1393d = d2.get(1);
        this.f1394e = d2.getMaximum(7);
        this.f1395f = d2.getActualMaximum(5);
        this.f1396g = d2.getTimeInMillis();
    }

    public static i0 k(long timeInMillis) {
        Calendar calendar = s0.i();
        calendar.setTimeInMillis(timeInMillis);
        return new i0(calendar);
    }

    public static i0 j(int year, int month) {
        Calendar calendar = s0.i();
        calendar.set(1, year);
        calendar.set(2, month);
        return new i0(calendar);
    }

    public static i0 l() {
        return new i0(s0.g());
    }

    public int m() {
        int difference = this.f1391b.get(7) - this.f1391b.getFirstDayOfWeek();
        if (difference < 0) {
            return difference + this.f1394e;
        }
        return difference;
    }

    public boolean equals(Object o2) {
        if (this == o2) {
            return true;
        }
        if (!(o2 instanceof i0)) {
            return false;
        }
        i0 that = (i0) o2;
        return this.f1392c == that.f1392c && this.f1393d == that.f1393d;
    }

    public int hashCode() {
        Object[] hashedFields = {Integer.valueOf(this.f1392c), Integer.valueOf(this.f1393d)};
        return Arrays.hashCode(hashedFields);
    }

    /* renamed from: i */
    public int compareTo(i0 other) {
        return this.f1391b.compareTo(other.f1391b);
    }

    public int s(i0 other) {
        if (this.f1391b instanceof GregorianCalendar) {
            return ((other.f1393d - this.f1393d) * 12) + (other.f1392c - this.f1392c);
        }
        throw new IllegalArgumentException("Only Gregorian calendars are supported.");
    }

    public long q() {
        return this.f1391b.getTimeInMillis();
    }

    public long n(int day) {
        Calendar dayCalendar = s0.d(this.f1391b);
        dayCalendar.set(5, day);
        return dayCalendar.getTimeInMillis();
    }

    public int o(long date) {
        Calendar dayCalendar = s0.d(this.f1391b);
        dayCalendar.setTimeInMillis(date);
        return dayCalendar.get(5);
    }

    public i0 r(int months) {
        Calendar laterMonth = s0.d(this.f1391b);
        laterMonth.add(2, months);
        return new i0(laterMonth);
    }

    public String p(Context context) {
        if (this.f1397h == null) {
            this.f1397h = h.c(context, this.f1391b.getTimeInMillis());
        }
        return this.f1397h;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeInt(this.f1393d);
        dest.writeInt(this.f1392c);
    }
}
