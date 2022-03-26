package androidx.appcompat.widget;

import android.os.Parcel;
import android.os.Parcelable;
import k0.c;

/* JADX WARN: Classes with same name are omitted:
  
 */
/* loaded from: classes.dex */
public class j3 extends c {
    public static final Parcelable.Creator<j3> CREATOR = new i3();

    /* renamed from: d  reason: collision with root package name */
    public boolean f409d;

    public j3(Parcelable superState) {
        super(superState);
    }

    public j3(Parcel source, ClassLoader loader) {
        super(source, loader);
        this.f409d = ((Boolean) source.readValue(null)).booleanValue();
    }

    @Override // k0.c, android.os.Parcelable
    public void writeToParcel(Parcel dest, int flags) {
        super.writeToParcel(dest, flags);
        dest.writeValue(Boolean.valueOf(this.f409d));
    }

    public String toString() {
        return "SearchView.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " isIconified=" + this.f409d + "}";
    }
}
