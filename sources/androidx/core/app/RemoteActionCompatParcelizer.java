package androidx.core.app;

import android.app.PendingIntent;
import androidx.core.graphics.drawable.IconCompat;
import u0.b;

/* JADX WARN: Classes with same name are omitted:
  
 */
/* loaded from: classes.dex */
public class RemoteActionCompatParcelizer {
    public static RemoteActionCompat read(b parcel) {
        RemoteActionCompat obj = new RemoteActionCompat();
        obj.f653a = (IconCompat) parcel.v(obj.f653a, 1);
        obj.f654b = parcel.l(obj.f654b, 2);
        obj.f655c = parcel.l(obj.f655c, 3);
        obj.f656d = (PendingIntent) parcel.r(obj.f656d, 4);
        obj.f657e = parcel.h(obj.f657e, 5);
        obj.f658f = parcel.h(obj.f658f, 6);
        return obj;
    }

    public static void write(RemoteActionCompat obj, b parcel) {
        parcel.x();
        parcel.M(obj.f653a, 1);
        parcel.D(obj.f654b, 2);
        parcel.D(obj.f655c, 3);
        parcel.H(obj.f656d, 4);
        parcel.z(obj.f657e, 5);
        parcel.z(obj.f658f, 6);
    }
}
