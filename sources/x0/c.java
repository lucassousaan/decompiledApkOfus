package x0;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX WARN: Classes with same name are omitted:
  
 */
/* loaded from: classes.dex */
public class c extends k0.c {
    public static final Parcelable.Creator<c> CREATOR = new b();

    /* renamed from: d  reason: collision with root package name */
    public int f3694d;

    /* renamed from: e  reason: collision with root package name */
    public float f3695e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f3696f;

    public c(Parcel source, ClassLoader loader) {
        super(source, loader);
        this.f3694d = source.readInt();
        this.f3695e = source.readFloat();
        this.f3696f = source.readByte() != 0;
    }

    public c(Parcelable superState) {
        super(superState);
    }

    @Override // k0.c, android.os.Parcelable
    public void writeToParcel(Parcel dest, int flags) {
        super.writeToParcel(dest, flags);
        dest.writeInt(this.f3694d);
        dest.writeFloat(this.f3695e);
        dest.writeByte(this.f3696f ? (byte) 1 : (byte) 0);
    }
}
