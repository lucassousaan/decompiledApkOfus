package u0;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.versionedparcelable.ParcelImpl;

/* JADX WARN: Classes with same name are omitted:
  
 */
/* loaded from: classes.dex */
public final class a implements Parcelable.Creator {
    /* renamed from: a */
    public ParcelImpl createFromParcel(Parcel in) {
        return new ParcelImpl(in);
    }

    /* renamed from: b */
    public ParcelImpl[] newArray(int size) {
        return new ParcelImpl[size];
    }
}
