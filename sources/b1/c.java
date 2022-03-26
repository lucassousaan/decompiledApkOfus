package b1;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX WARN: Classes with same name are omitted:
  
 */
/* loaded from: classes.dex */
public final class c implements Parcelable.ClassLoaderCreator {
    /* renamed from: b */
    public d createFromParcel(Parcel in, ClassLoader loader) {
        return new d(in, loader);
    }

    /* renamed from: a */
    public d createFromParcel(Parcel in) {
        return new d(in, null);
    }

    /* renamed from: c */
    public d[] newArray(int size) {
        return new d[size];
    }
}
