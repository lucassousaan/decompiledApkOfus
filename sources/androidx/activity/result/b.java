package androidx.activity.result;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX WARN: Classes with same name are omitted:
  
 */
/* loaded from: classes.dex */
public final class b implements Parcelable {
    public static final Parcelable.Creator<b> CREATOR = new a();

    /* renamed from: b  reason: collision with root package name */
    public final int f48b;

    /* renamed from: c  reason: collision with root package name */
    public final Intent f49c;

    public b(int resultCode, Intent data) {
        this.f48b = resultCode;
        this.f49c = data;
    }

    public b(Parcel in) {
        this.f48b = in.readInt();
        this.f49c = in.readInt() == 0 ? null : (Intent) Intent.CREATOR.createFromParcel(in);
    }

    public int j() {
        return this.f48b;
    }

    public Intent i() {
        return this.f49c;
    }

    public String toString() {
        return "ActivityResult{resultCode=" + k(this.f48b) + ", data=" + this.f49c + '}';
    }

    public static String k(int resultCode) {
        switch (resultCode) {
            case -1:
                return "RESULT_OK";
            case 0:
                return "RESULT_CANCELED";
            default:
                return String.valueOf(resultCode);
        }
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeInt(this.f48b);
        dest.writeInt(this.f49c == null ? 0 : 1);
        Intent intent = this.f49c;
        if (intent != null) {
            intent.writeToParcel(dest, flags);
        }
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }
}
