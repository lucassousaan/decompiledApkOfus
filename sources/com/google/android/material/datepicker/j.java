package com.google.android.material.datepicker;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* JADX WARN: Classes with same name are omitted:
  
 */
/* loaded from: classes.dex */
public class j implements c {
    public static final Parcelable.Creator<j> CREATOR = new i();

    /* renamed from: b  reason: collision with root package name */
    public final long f1398b;

    public /* synthetic */ j(long x02, i x1) {
        this(x02);
    }

    public j(long point) {
        this.f1398b = point;
    }

    public static j i(long point) {
        return new j(point);
    }

    public boolean j(long date) {
        return date >= this.f1398b;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeLong(this.f1398b);
    }

    public boolean equals(Object o2) {
        if (this == o2) {
            return true;
        }
        if (!(o2 instanceof j)) {
            return false;
        }
        j that = (j) o2;
        return this.f1398b == that.f1398b;
    }

    public int hashCode() {
        Object[] hashedFields = {Long.valueOf(this.f1398b)};
        return Arrays.hashCode(hashedFields);
    }
}
