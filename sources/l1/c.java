package l1;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX WARN: Classes with same name are omitted:
  
 */
/* loaded from: classes.dex */
public class c extends k0.c {
    public static final Parcelable.Creator<c> CREATOR = new b();

    /* renamed from: d  reason: collision with root package name */
    public boolean f2398d;

    public c(Parcelable superState) {
        super(superState);
    }

    public c(Parcel source, ClassLoader loader) {
        super(source, loader);
        j(source);
    }

    @Override // k0.c, android.os.Parcelable
    public void writeToParcel(Parcel out, int flags) {
        super.writeToParcel(out, flags);
        out.writeInt(this.f2398d ? 1 : 0);
    }

    public final void j(Parcel in) {
        boolean z2 = true;
        if (in.readInt() != 1) {
            z2 = false;
        }
        this.f2398d = z2;
    }
}
