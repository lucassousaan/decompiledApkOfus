package b1;

import android.os.Parcel;
import android.os.Parcelable;
import k0.c;

/* JADX WARN: Classes with same name are omitted:
  
 */
/* loaded from: classes.dex */
public class d extends c {
    public static final Parcelable.Creator<d> CREATOR = new c();

    /* renamed from: d  reason: collision with root package name */
    public boolean f1137d;

    public d(Parcelable superState) {
        super(superState);
    }

    public d(Parcel source, ClassLoader loader) {
        super(source, loader);
        if (loader == null) {
            getClass().getClassLoader();
        }
        j(source);
    }

    @Override // k0.c, android.os.Parcelable
    public void writeToParcel(Parcel out, int flags) {
        super.writeToParcel(out, flags);
        out.writeInt(this.f1137d ? 1 : 0);
    }

    public final void j(Parcel in) {
        boolean z2 = true;
        if (in.readInt() != 1) {
            z2 = false;
        }
        this.f1137d = z2;
    }
}
