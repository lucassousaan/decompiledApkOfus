package k0;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX WARN: Classes with same name are omitted:
  
 */
/* loaded from: classes.dex */
public final class b implements Parcelable.ClassLoaderCreator {
    /* renamed from: b */
    public c createFromParcel(Parcel in, ClassLoader loader) {
        Parcelable superState = in.readParcelable(loader);
        if (superState == null) {
            return c.f2352c;
        }
        throw new IllegalStateException("superState must be null");
    }

    /* renamed from: a */
    public c createFromParcel(Parcel in) {
        return createFromParcel(in, null);
    }

    /* renamed from: c */
    public c[] newArray(int size) {
        return new c[size];
    }
}
