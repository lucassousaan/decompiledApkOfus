package androidx.fragment.app;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX WARN: Classes with same name are omitted:
  
 */
/* loaded from: classes.dex */
public class i1 implements Parcelable {
    public static final Parcelable.Creator<i1> CREATOR = new h1();

    /* renamed from: b  reason: collision with root package name */
    public String f796b;

    /* renamed from: c  reason: collision with root package name */
    public int f797c;

    public i1(Parcel in) {
        this.f796b = in.readString();
        this.f797c = in.readInt();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.f796b);
        dest.writeInt(this.f797c);
    }
}
