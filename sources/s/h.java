package s;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.SparseArray;
import k0.c;

/* JADX WARN: Classes with same name are omitted:
  
 */
/* loaded from: classes.dex */
public class h extends c {
    public static final Parcelable.Creator<h> CREATOR = new g();

    /* renamed from: d  reason: collision with root package name */
    public SparseArray f3445d;

    public h(Parcel source, ClassLoader loader) {
        super(source, loader);
        int size = source.readInt();
        int[] ids = new int[size];
        source.readIntArray(ids);
        Parcelable[] states = source.readParcelableArray(loader);
        this.f3445d = new SparseArray(size);
        for (int i2 = 0; i2 < size; i2++) {
            this.f3445d.append(ids[i2], states[i2]);
        }
    }

    public h(Parcelable superState) {
        super(superState);
    }

    @Override // k0.c, android.os.Parcelable
    public void writeToParcel(Parcel dest, int flags) {
        super.writeToParcel(dest, flags);
        SparseArray sparseArray = this.f3445d;
        int size = sparseArray != null ? sparseArray.size() : 0;
        dest.writeInt(size);
        int[] ids = new int[size];
        Parcelable[] states = new Parcelable[size];
        for (int i2 = 0; i2 < size; i2++) {
            ids[i2] = this.f3445d.keyAt(i2);
            states[i2] = (Parcelable) this.f3445d.valueAt(i2);
        }
        dest.writeIntArray(ids);
        dest.writeParcelableArray(states, flags);
    }
}
