package q0;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import java.util.List;

/* JADX WARN: Classes with same name are omitted:
  
 */
/* loaded from: classes.dex */
public class s2 implements Parcelable {
    public static final Parcelable.Creator<s2> CREATOR = new r2();

    /* renamed from: b  reason: collision with root package name */
    public int f3192b;

    /* renamed from: c  reason: collision with root package name */
    public int f3193c;

    /* renamed from: d  reason: collision with root package name */
    public int f3194d;

    /* renamed from: e  reason: collision with root package name */
    public int[] f3195e;

    /* renamed from: f  reason: collision with root package name */
    public int f3196f;

    /* renamed from: g  reason: collision with root package name */
    public int[] f3197g;

    /* renamed from: h  reason: collision with root package name */
    public List f3198h;

    /* renamed from: i  reason: collision with root package name */
    public boolean f3199i;

    /* renamed from: j  reason: collision with root package name */
    public boolean f3200j;

    /* renamed from: k  reason: collision with root package name */
    public boolean f3201k;

    public s2() {
    }

    public s2(Parcel in) {
        this.f3192b = in.readInt();
        this.f3193c = in.readInt();
        int readInt = in.readInt();
        this.f3194d = readInt;
        if (readInt > 0) {
            int[] iArr = new int[readInt];
            this.f3195e = iArr;
            in.readIntArray(iArr);
        }
        int readInt2 = in.readInt();
        this.f3196f = readInt2;
        if (readInt2 > 0) {
            int[] iArr2 = new int[readInt2];
            this.f3197g = iArr2;
            in.readIntArray(iArr2);
        }
        boolean z2 = false;
        this.f3199i = in.readInt() == 1;
        this.f3200j = in.readInt() == 1;
        this.f3201k = in.readInt() == 1 ? true : z2;
        List<StaggeredGridLayoutManager.LazySpanLookup.FullSpanItem> fullSpanItems = in.readArrayList(p2.class.getClassLoader());
        this.f3198h = fullSpanItems;
    }

    public s2(s2 other) {
        this.f3194d = other.f3194d;
        this.f3192b = other.f3192b;
        this.f3193c = other.f3193c;
        this.f3195e = other.f3195e;
        this.f3196f = other.f3196f;
        this.f3197g = other.f3197g;
        this.f3199i = other.f3199i;
        this.f3200j = other.f3200j;
        this.f3201k = other.f3201k;
        this.f3198h = other.f3198h;
    }

    public void j() {
        this.f3195e = null;
        this.f3194d = 0;
        this.f3196f = 0;
        this.f3197g = null;
        this.f3198h = null;
    }

    public void i() {
        this.f3195e = null;
        this.f3194d = 0;
        this.f3192b = -1;
        this.f3193c = -1;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeInt(this.f3192b);
        dest.writeInt(this.f3193c);
        dest.writeInt(this.f3194d);
        if (this.f3194d > 0) {
            dest.writeIntArray(this.f3195e);
        }
        dest.writeInt(this.f3196f);
        if (this.f3196f > 0) {
            dest.writeIntArray(this.f3197g);
        }
        dest.writeInt(this.f3199i ? 1 : 0);
        dest.writeInt(this.f3200j ? 1 : 0);
        dest.writeInt(this.f3201k ? 1 : 0);
        dest.writeList(this.f3198h);
    }
}
