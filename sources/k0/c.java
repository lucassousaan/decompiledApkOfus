package k0;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX WARN: Classes with same name are omitted:
  
 */
/* loaded from: classes.dex */
public abstract class c implements Parcelable {

    /* renamed from: b  reason: collision with root package name */
    public final Parcelable f2353b;

    /* renamed from: c  reason: collision with root package name */
    public static final c f2352c = new a();
    public static final Parcelable.Creator<c> CREATOR = new b();

    public /* synthetic */ c(a x02) {
        this();
    }

    public c() {
        this.f2353b = null;
    }

    public c(Parcelable superState) {
        if (superState != null) {
            this.f2353b = superState != f2352c ? superState : null;
            return;
        }
        throw new IllegalArgumentException("superState must not be null");
    }

    public c(Parcel source, ClassLoader loader) {
        Parcelable superState = source.readParcelable(loader);
        this.f2353b = superState != null ? superState : f2352c;
    }

    public final Parcelable i() {
        return this.f2353b;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeParcelable(this.f2353b, flags);
    }
}
