package q0;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* JADX WARN: Classes with same name are omitted:
  
 */
/* loaded from: classes.dex */
public class p2 implements Parcelable {
    public static final Parcelable.Creator<p2> CREATOR = new o2();

    /* renamed from: b  reason: collision with root package name */
    public int f3162b;

    /* renamed from: c  reason: collision with root package name */
    public int f3163c;

    /* renamed from: d  reason: collision with root package name */
    public int[] f3164d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f3165e;

    public p2(Parcel in) {
        this.f3162b = in.readInt();
        this.f3163c = in.readInt();
        this.f3165e = in.readInt() != 1 ? false : true;
        int spanCount = in.readInt();
        if (spanCount > 0) {
            int[] iArr = new int[spanCount];
            this.f3164d = iArr;
            in.readIntArray(iArr);
        }
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeInt(this.f3162b);
        dest.writeInt(this.f3163c);
        dest.writeInt(this.f3165e ? 1 : 0);
        int[] iArr = this.f3164d;
        if (iArr == null || iArr.length <= 0) {
            dest.writeInt(0);
            return;
        }
        dest.writeInt(iArr.length);
        dest.writeIntArray(this.f3164d);
    }

    public String toString() {
        return "FullSpanItem{mPosition=" + this.f3162b + ", mGapDir=" + this.f3163c + ", mHasUnwantedGapAfter=" + this.f3165e + ", mGapPerSpan=" + Arrays.toString(this.f3164d) + '}';
    }
}
