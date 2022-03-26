package com.google.android.material.datepicker;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX WARN: Classes with same name are omitted:
  
 */
/* loaded from: classes.dex */
public final class i implements Parcelable.Creator {
    /* renamed from: a */
    public j createFromParcel(Parcel source) {
        return new j(source.readLong(), null);
    }

    /* renamed from: b */
    public j[] newArray(int size) {
        return new j[size];
    }
}
