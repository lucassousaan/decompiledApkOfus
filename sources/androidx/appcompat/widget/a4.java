package androidx.appcompat.widget;

import android.os.Parcel;
import android.os.Parcelable;
import k0.c;

/* JADX WARN: Classes with same name are omitted:
  
 */
/* loaded from: classes.dex */
public class a4 extends c {
    public static final Parcelable.Creator<a4> CREATOR = new z3();

    /* renamed from: d  reason: collision with root package name */
    public int f233d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f234e;

    public a4(Parcel source, ClassLoader loader) {
        super(source, loader);
        this.f233d = source.readInt();
        this.f234e = source.readInt() != 0;
    }

    public a4(Parcelable superState) {
        super(superState);
    }

    @Override // k0.c, android.os.Parcelable
    public void writeToParcel(Parcel out, int flags) {
        super.writeToParcel(out, flags);
        out.writeInt(this.f233d);
        out.writeInt(this.f234e ? 1 : 0);
    }
}
