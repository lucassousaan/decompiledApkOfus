package com.google.android.material.timepicker;

import android.content.res.Resources;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* JADX WARN: Classes with same name are omitted:
  
 */
/* loaded from: classes.dex */
public class l implements Parcelable {
    public static final Parcelable.Creator<l> CREATOR = new k();

    /* renamed from: b  reason: collision with root package name */
    public final int f1560b;

    /* renamed from: c  reason: collision with root package name */
    public int f1561c;

    /* renamed from: d  reason: collision with root package name */
    public int f1562d;

    /* renamed from: e  reason: collision with root package name */
    public int f1563e;

    public l(int hour, int minute, int selection, int format) {
        this.f1561c = hour;
        this.f1562d = minute;
        this.f1563e = selection;
        this.f1560b = format;
        k(hour);
        new h(59);
        new h(format == 1 ? 24 : 12);
    }

    public l(Parcel in) {
        this(in.readInt(), in.readInt(), in.readInt(), in.readInt());
    }

    public static int k(int hourOfDay) {
        return hourOfDay >= 12 ? 1 : 0;
    }

    public int hashCode() {
        Object[] hashedFields = {Integer.valueOf(this.f1560b), Integer.valueOf(this.f1561c), Integer.valueOf(this.f1562d), Integer.valueOf(this.f1563e)};
        return Arrays.hashCode(hashedFields);
    }

    public boolean equals(Object o2) {
        if (this == o2) {
            return true;
        }
        if (!(o2 instanceof l)) {
            return false;
        }
        l that = (l) o2;
        return this.f1561c == that.f1561c && this.f1562d == that.f1562d && this.f1560b == that.f1560b && this.f1563e == that.f1563e;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeInt(this.f1561c);
        dest.writeInt(this.f1562d);
        dest.writeInt(this.f1563e);
        dest.writeInt(this.f1560b);
    }

    public static String i(Resources resources, CharSequence text) {
        return j(resources, text, "%02d");
    }

    public static String j(Resources resources, CharSequence text, String format) {
        return String.format(resources.getConfiguration().locale, format, Integer.valueOf(Integer.parseInt(String.valueOf(text))));
    }
}
