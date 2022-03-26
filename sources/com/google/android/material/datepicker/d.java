package com.google.android.material.datepicker;

import android.os.Parcel;
import android.os.Parcelable;
import e0.c;
import java.util.Arrays;

/* JADX WARN: Classes with same name are omitted:
  
 */
/* loaded from: classes.dex */
public final class d implements Parcelable {
    public static final Parcelable.Creator<d> CREATOR = new a();

    /* renamed from: b  reason: collision with root package name */
    public final i0 f1355b;

    /* renamed from: c  reason: collision with root package name */
    public final i0 f1356c;

    /* renamed from: d  reason: collision with root package name */
    public final c f1357d;

    /* renamed from: e  reason: collision with root package name */
    public i0 f1358e;

    /* renamed from: f  reason: collision with root package name */
    public final int f1359f;

    /* renamed from: g  reason: collision with root package name */
    public final int f1360g;

    public /* synthetic */ d(i0 x02, i0 x1, c x2, i0 x3, a x4) {
        this(x02, x1, x2, x3);
    }

    public d(i0 start, i0 end, c validator, i0 openAt) {
        this.f1355b = start;
        this.f1356c = end;
        this.f1358e = openAt;
        this.f1357d = validator;
        if (openAt != null && start.compareTo(openAt) > 0) {
            throw new IllegalArgumentException("start Month cannot be after current Month");
        } else if (openAt == null || openAt.compareTo(end) <= 0) {
            this.f1360g = start.s(end) + 1;
            this.f1359f = (end.f1393d - start.f1393d) + 1;
        } else {
            throw new IllegalArgumentException("current Month cannot be after end Month");
        }
    }

    public c n() {
        return this.f1357d;
    }

    public i0 r() {
        return this.f1355b;
    }

    public i0 o() {
        return this.f1356c;
    }

    public i0 q() {
        return this.f1358e;
    }

    public int p() {
        return this.f1360g;
    }

    public int s() {
        return this.f1359f;
    }

    public boolean equals(Object o2) {
        if (this == o2) {
            return true;
        }
        if (!(o2 instanceof d)) {
            return false;
        }
        d that = (d) o2;
        return this.f1355b.equals(that.f1355b) && this.f1356c.equals(that.f1356c) && c.a(this.f1358e, that.f1358e) && this.f1357d.equals(that.f1357d);
    }

    public int hashCode() {
        Object[] hashedFields = {this.f1355b, this.f1356c, this.f1358e, this.f1357d};
        return Arrays.hashCode(hashedFields);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeParcelable(this.f1355b, 0);
        dest.writeParcelable(this.f1356c, 0);
        dest.writeParcelable(this.f1358e, 0);
        dest.writeParcelable(this.f1357d, 0);
    }

    public i0 m(i0 month) {
        if (month.compareTo(this.f1355b) < 0) {
            return this.f1355b;
        }
        if (month.compareTo(this.f1356c) > 0) {
            return this.f1356c;
        }
        return month;
    }
}
