package a1;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX WARN: Classes with same name are omitted:
  
 */
/* loaded from: classes.dex */
public final class i implements Parcelable.ClassLoaderCreator {
    /* renamed from: b */
    public j createFromParcel(Parcel in, ClassLoader loader) {
        return new j(in, loader);
    }

    /* renamed from: a */
    public j createFromParcel(Parcel in) {
        return new j(in, (ClassLoader) null);
    }

    /* renamed from: c */
    public j[] newArray(int size) {
        return new j[size];
    }
}
