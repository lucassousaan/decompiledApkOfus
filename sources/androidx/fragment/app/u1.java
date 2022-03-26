package androidx.fragment.app;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX WARN: Classes with same name are omitted:
  
 */
/* loaded from: classes.dex */
public final class u1 implements Parcelable {
    public static final Parcelable.Creator<u1> CREATOR = new t1();

    /* renamed from: b  reason: collision with root package name */
    public final String f929b;

    /* renamed from: c  reason: collision with root package name */
    public final String f930c;

    /* renamed from: d  reason: collision with root package name */
    public final boolean f931d;

    /* renamed from: e  reason: collision with root package name */
    public final int f932e;

    /* renamed from: f  reason: collision with root package name */
    public final int f933f;

    /* renamed from: g  reason: collision with root package name */
    public final String f934g;

    /* renamed from: h  reason: collision with root package name */
    public final boolean f935h;

    /* renamed from: i  reason: collision with root package name */
    public final boolean f936i;

    /* renamed from: j  reason: collision with root package name */
    public final boolean f937j;

    /* renamed from: k  reason: collision with root package name */
    public final Bundle f938k;

    /* renamed from: l  reason: collision with root package name */
    public final boolean f939l;

    /* renamed from: m  reason: collision with root package name */
    public final int f940m;

    /* renamed from: n  reason: collision with root package name */
    public Bundle f941n;

    public u1(f0 frag) {
        this.f929b = frag.getClass().getName();
        this.f930c = frag.f764g;
        this.f931d = frag.f772o;
        this.f932e = frag.f781x;
        this.f933f = frag.f782y;
        this.f934g = frag.f783z;
        this.f935h = frag.C;
        this.f936i = frag.f771n;
        this.f937j = frag.B;
        this.f938k = frag.f765h;
        this.f939l = frag.A;
        this.f940m = frag.O.ordinal();
    }

    public u1(Parcel in) {
        this.f929b = in.readString();
        this.f930c = in.readString();
        boolean z2 = true;
        this.f931d = in.readInt() != 0;
        this.f932e = in.readInt();
        this.f933f = in.readInt();
        this.f934g = in.readString();
        this.f935h = in.readInt() != 0;
        this.f936i = in.readInt() != 0;
        this.f937j = in.readInt() != 0;
        this.f938k = in.readBundle();
        this.f939l = in.readInt() == 0 ? false : z2;
        this.f941n = in.readBundle();
        this.f940m = in.readInt();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("FragmentState{");
        sb.append(this.f929b);
        sb.append(" (");
        sb.append(this.f930c);
        sb.append(")}:");
        if (this.f931d) {
            sb.append(" fromLayout");
        }
        if (this.f933f != 0) {
            sb.append(" id=0x");
            sb.append(Integer.toHexString(this.f933f));
        }
        String str = this.f934g;
        if (str != null && !str.isEmpty()) {
            sb.append(" tag=");
            sb.append(this.f934g);
        }
        if (this.f935h) {
            sb.append(" retainInstance");
        }
        if (this.f936i) {
            sb.append(" removing");
        }
        if (this.f937j) {
            sb.append(" detached");
        }
        if (this.f939l) {
            sb.append(" hidden");
        }
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.f929b);
        dest.writeString(this.f930c);
        dest.writeInt(this.f931d ? 1 : 0);
        dest.writeInt(this.f932e);
        dest.writeInt(this.f933f);
        dest.writeString(this.f934g);
        dest.writeInt(this.f935h ? 1 : 0);
        dest.writeInt(this.f936i ? 1 : 0);
        dest.writeInt(this.f937j ? 1 : 0);
        dest.writeBundle(this.f938k);
        dest.writeInt(this.f939l ? 1 : 0);
        dest.writeBundle(this.f941n);
        dest.writeInt(this.f940m);
    }
}
