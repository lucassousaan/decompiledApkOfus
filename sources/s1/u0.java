package s1;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import k0.c;

/* JADX WARN: Classes with same name are omitted:
  
 */
/* loaded from: classes.dex */
public class u0 extends c {
    public static final Parcelable.Creator<u0> CREATOR = new t0();

    /* renamed from: d  reason: collision with root package name */
    public CharSequence f3527d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f3528e;

    /* renamed from: f  reason: collision with root package name */
    public CharSequence f3529f;

    /* renamed from: g  reason: collision with root package name */
    public CharSequence f3530g;

    /* renamed from: h  reason: collision with root package name */
    public CharSequence f3531h;

    public u0(Parcelable superState) {
        super(superState);
    }

    public u0(Parcel source, ClassLoader loader) {
        super(source, loader);
        this.f3527d = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(source);
        this.f3528e = source.readInt() != 1 ? false : true;
        this.f3529f = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(source);
        this.f3530g = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(source);
        this.f3531h = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(source);
    }

    @Override // k0.c, android.os.Parcelable
    public void writeToParcel(Parcel dest, int flags) {
        super.writeToParcel(dest, flags);
        TextUtils.writeToParcel(this.f3527d, dest, flags);
        dest.writeInt(this.f3528e ? 1 : 0);
        TextUtils.writeToParcel(this.f3529f, dest, flags);
        TextUtils.writeToParcel(this.f3530g, dest, flags);
        TextUtils.writeToParcel(this.f3531h, dest, flags);
    }

    public String toString() {
        return "TextInputLayout.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " error=" + ((Object) this.f3527d) + " hint=" + ((Object) this.f3529f) + " helperText=" + ((Object) this.f3530g) + " placeholderText=" + ((Object) this.f3531h) + "}";
    }
}
