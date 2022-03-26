package androidx.core.graphics.drawable;

import android.content.res.ColorStateList;
import android.os.Parcelable;
import u0.b;

/* JADX WARN: Classes with same name are omitted:
  
 */
/* loaded from: classes.dex */
public class IconCompatParcelizer {
    public static IconCompat read(b parcel) {
        IconCompat obj = new IconCompat();
        obj.f660a = parcel.p(obj.f660a, 1);
        obj.f662c = parcel.j(obj.f662c, 2);
        obj.f663d = parcel.r(obj.f663d, 3);
        obj.f664e = parcel.p(obj.f664e, 4);
        obj.f665f = parcel.p(obj.f665f, 5);
        obj.f666g = (ColorStateList) parcel.r(obj.f666g, 6);
        obj.f668i = parcel.t(obj.f668i, 7);
        obj.f669j = parcel.t(obj.f669j, 8);
        obj.c();
        return obj;
    }

    public static void write(IconCompat obj, b parcel) {
        parcel.x();
        parcel.f();
        obj.d(false);
        int i2 = obj.f660a;
        if (-1 != i2) {
            parcel.F(i2, 1);
        }
        byte[] bArr = obj.f662c;
        if (bArr != null) {
            parcel.B(bArr, 2);
        }
        Parcelable parcelable = obj.f663d;
        if (parcelable != null) {
            parcel.H(parcelable, 3);
        }
        int i3 = obj.f664e;
        if (i3 != 0) {
            parcel.F(i3, 4);
        }
        int i4 = obj.f665f;
        if (i4 != 0) {
            parcel.F(i4, 5);
        }
        ColorStateList colorStateList = obj.f666g;
        if (colorStateList != null) {
            parcel.H(colorStateList, 6);
        }
        String str = obj.f668i;
        if (str != null) {
            parcel.J(str, 7);
        }
        String str2 = obj.f669j;
        if (str2 != null) {
            parcel.J(str2, 8);
        }
    }
}
