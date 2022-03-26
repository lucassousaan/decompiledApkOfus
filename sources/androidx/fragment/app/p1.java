package androidx.fragment.app;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* JADX WARN: Classes with same name are omitted:
  
 */
/* loaded from: classes.dex */
public final class p1 implements Parcelable {
    public static final Parcelable.Creator<p1> CREATOR = new o1();

    /* renamed from: b  reason: collision with root package name */
    public ArrayList f879b;

    /* renamed from: c  reason: collision with root package name */
    public ArrayList f880c;

    /* renamed from: d  reason: collision with root package name */
    public c[] f881d;

    /* renamed from: e  reason: collision with root package name */
    public int f882e;

    /* renamed from: f  reason: collision with root package name */
    public String f883f;

    /* renamed from: g  reason: collision with root package name */
    public ArrayList f884g;

    /* renamed from: h  reason: collision with root package name */
    public ArrayList f885h;

    /* renamed from: i  reason: collision with root package name */
    public ArrayList f886i;

    public p1() {
        this.f883f = null;
        this.f884g = new ArrayList();
        this.f885h = new ArrayList();
    }

    public p1(Parcel in) {
        this.f883f = null;
        this.f884g = new ArrayList();
        this.f885h = new ArrayList();
        this.f879b = in.createTypedArrayList(u1.CREATOR);
        this.f880c = in.createStringArrayList();
        this.f881d = (c[]) in.createTypedArray(c.CREATOR);
        this.f882e = in.readInt();
        this.f883f = in.readString();
        this.f884g = in.createStringArrayList();
        this.f885h = in.createTypedArrayList(Bundle.CREATOR);
        this.f886i = in.createTypedArrayList(i1.CREATOR);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeTypedList(this.f879b);
        dest.writeStringList(this.f880c);
        dest.writeTypedArray(this.f881d, flags);
        dest.writeInt(this.f882e);
        dest.writeString(this.f883f);
        dest.writeStringList(this.f884g);
        dest.writeTypedList(this.f885h);
        dest.writeTypedList(this.f886i);
    }
}
