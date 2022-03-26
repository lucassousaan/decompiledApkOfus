package a1;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import k0.c;

/* JADX WARN: Classes with same name are omitted:
  
 */
/* loaded from: classes.dex */
public class j extends c {
    public static final Parcelable.Creator<j> CREATOR = new i();

    /* renamed from: d  reason: collision with root package name */
    public final int f13d;

    /* renamed from: e  reason: collision with root package name */
    public int f14e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f15f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f16g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f17h;

    public j(Parcel source, ClassLoader loader) {
        super(source, loader);
        this.f13d = source.readInt();
        this.f14e = source.readInt();
        boolean z2 = false;
        this.f15f = source.readInt() == 1;
        this.f16g = source.readInt() == 1;
        this.f17h = source.readInt() == 1 ? true : z2;
    }

    public j(Parcelable superState, BottomSheetBehavior bottomSheetBehavior) {
        super(superState);
        int i2;
        boolean z2;
        boolean z3;
        this.f13d = bottomSheetBehavior.G;
        i2 = bottomSheetBehavior.f1264e;
        this.f14e = i2;
        z2 = bottomSheetBehavior.f1261b;
        this.f15f = z2;
        this.f16g = bottomSheetBehavior.D;
        z3 = bottomSheetBehavior.E;
        this.f17h = z3;
    }

    @Override // k0.c, android.os.Parcelable
    public void writeToParcel(Parcel out, int flags) {
        super.writeToParcel(out, flags);
        out.writeInt(this.f13d);
        out.writeInt(this.f14e);
        out.writeInt(this.f15f ? 1 : 0);
        out.writeInt(this.f16g ? 1 : 0);
        out.writeInt(this.f17h ? 1 : 0);
    }
}
