package com.google.android.material.datepicker;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX WARN: Classes with same name are omitted:
  
 */
/* loaded from: classes.dex */
public final class h0 implements Parcelable.Creator {
    /* renamed from: a */
    public i0 createFromParcel(Parcel source) {
        int year = source.readInt();
        int month = source.readInt();
        return i0.j(year, month);
    }

    /* renamed from: b */
    public i0[] newArray(int size) {
        return new i0[size];
    }
}
