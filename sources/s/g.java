package s;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX WARN: Classes with same name are omitted:
  
 */
/* loaded from: classes.dex */
public final class g implements Parcelable.ClassLoaderCreator {
    /* renamed from: b */
    public h createFromParcel(Parcel in, ClassLoader loader) {
        return new h(in, loader);
    }

    /* renamed from: a */
    public h createFromParcel(Parcel in) {
        return new h(in, null);
    }

    /* renamed from: c */
    public h[] newArray(int size) {
        return new h[size];
    }
}
