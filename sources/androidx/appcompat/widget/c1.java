package androidx.appcompat.widget;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;

/* JADX WARN: Classes with same name are omitted:
  
 */
/* loaded from: classes.dex */
public class c1 extends View.BaseSavedState {
    public static final Parcelable.Creator<c1> CREATOR = new b1();

    /* renamed from: b  reason: collision with root package name */
    public boolean f274b;

    public c1(Parcelable superState) {
        super(superState);
    }

    public c1(Parcel in) {
        super(in);
        this.f274b = in.readByte() != 0;
    }

    @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
    public void writeToParcel(Parcel out, int flags) {
        super.writeToParcel(out, flags);
        out.writeByte(this.f274b ? (byte) 1 : (byte) 0);
    }
}
