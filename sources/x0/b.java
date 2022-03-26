package x0;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX WARN: Classes with same name are omitted:
  
 */
/* loaded from: classes.dex */
public final class b implements Parcelable.ClassLoaderCreator {
    /* renamed from: b */
    public c createFromParcel(Parcel source, ClassLoader loader) {
        return new c(source, loader);
    }

    /* renamed from: a */
    public c createFromParcel(Parcel source) {
        return new c(source, null);
    }

    /* renamed from: c */
    public c[] newArray(int size) {
        return new c[size];
    }
}
