package com.google.android.material.datepicker;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX WARN: Classes with same name are omitted:
  
 */
/* loaded from: classes.dex */
public final class a implements Parcelable.Creator {
    /* renamed from: a */
    public d createFromParcel(Parcel source) {
        i0 start = (i0) source.readParcelable(i0.class.getClassLoader());
        i0 end = (i0) source.readParcelable(i0.class.getClassLoader());
        i0 openAt = (i0) source.readParcelable(i0.class.getClassLoader());
        c validator = (c) source.readParcelable(c.class.getClassLoader());
        return new d(start, end, validator, openAt, null);
    }

    /* renamed from: b */
    public d[] newArray(int size) {
        return new d[size];
    }
}
