package l1;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX WARN: Classes with same name are omitted:
  
 */
/* loaded from: classes.dex */
public final class b implements Parcelable.ClassLoaderCreator {
    /* renamed from: b */
    public c createFromParcel(Parcel in, ClassLoader loader) {
        return new c(in, loader);
    }

    /* renamed from: a */
    public c createFromParcel(Parcel in) {
        return new c(in, null);
    }

    /* renamed from: c */
    public c[] newArray(int size) {
        return new c[size];
    }
}
