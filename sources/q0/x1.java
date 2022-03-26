package q0;

import android.os.Parcel;
import android.os.Parcelable;
import k0.c;

/* JADX WARN: Classes with same name are omitted:
  
 */
/* loaded from: classes.dex */
public class x1 extends c {
    public static final Parcelable.Creator<x1> CREATOR = new w1();

    /* renamed from: d  reason: collision with root package name */
    public Parcelable f3262d;

    public x1(Parcel in, ClassLoader loader) {
        super(in, loader);
        this.f3262d = in.readParcelable(loader != null ? loader : m1.class.getClassLoader());
    }

    public x1(Parcelable superState) {
        super(superState);
    }

    @Override // k0.c, android.os.Parcelable
    public void writeToParcel(Parcel dest, int flags) {
        super.writeToParcel(dest, flags);
        dest.writeParcelable(this.f3262d, 0);
    }

    public void j(x1 other) {
        this.f3262d = other.f3262d;
    }
}
