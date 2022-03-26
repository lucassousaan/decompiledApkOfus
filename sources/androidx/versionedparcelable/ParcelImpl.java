package androidx.versionedparcelable;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
import u0.a;
import u0.c;
import u0.d;

/* JADX WARN: Classes with same name are omitted:
  
 */
@SuppressLint({"BanParcelableUsage"})
/* loaded from: classes.dex */
public class ParcelImpl implements Parcelable {
    public static final Parcelable.Creator<ParcelImpl> CREATOR = new a();

    /* renamed from: b  reason: collision with root package name */
    public final d f1133b;

    public ParcelImpl(Parcel in) {
        this.f1133b = new c(in).u();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel dest, int flags) {
        c parcel = new c(dest);
        parcel.L(this.f1133b);
    }
}
