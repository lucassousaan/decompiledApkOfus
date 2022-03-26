package i0;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;

/* JADX WARN: Classes with same name are omitted:
  
 */
/* loaded from: classes.dex */
public class n extends View.BaseSavedState {
    public static final Parcelable.Creator<n> CREATOR = new m();

    /* renamed from: b  reason: collision with root package name */
    public int f2257b;

    public n(Parcelable superState) {
        super(superState);
    }

    public n(Parcel source) {
        super(source);
        this.f2257b = source.readInt();
    }

    @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
    public void writeToParcel(Parcel dest, int flags) {
        super.writeToParcel(dest, flags);
        dest.writeInt(this.f2257b);
    }

    public String toString() {
        return "HorizontalScrollView.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " scrollPosition=" + this.f2257b + "}";
    }
}
