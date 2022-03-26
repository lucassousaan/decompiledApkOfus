package q0;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX WARN: Classes with same name are omitted:
  
 */
/* loaded from: classes.dex */
public class i0 implements Parcelable {
    public static final Parcelable.Creator<i0> CREATOR = new h0();

    /* renamed from: b  reason: collision with root package name */
    public int f3072b;

    /* renamed from: c  reason: collision with root package name */
    public int f3073c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f3074d;

    public i0() {
    }

    public i0(Parcel in) {
        this.f3072b = in.readInt();
        this.f3073c = in.readInt();
        this.f3074d = in.readInt() != 1 ? false : true;
    }

    public i0(i0 other) {
        this.f3072b = other.f3072b;
        this.f3073c = other.f3073c;
        this.f3074d = other.f3074d;
    }

    public boolean i() {
        return this.f3072b >= 0;
    }

    public void j() {
        this.f3072b = -1;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeInt(this.f3072b);
        dest.writeInt(this.f3073c);
        dest.writeInt(this.f3074d ? 1 : 0);
    }
}
