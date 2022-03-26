package d;

import android.content.res.Configuration;

/* JADX WARN: Classes with same name are omitted:
  
 */
/* loaded from: classes.dex */
public abstract class d0 {
    public static void a(Configuration base, Configuration change, Configuration delta) {
        int i2 = base.colorMode & 3;
        int i3 = change.colorMode;
        if (i2 != (i3 & 3)) {
            delta.colorMode |= i3 & 3;
        }
        int i4 = base.colorMode & 12;
        int i5 = change.colorMode;
        if (i4 != (i5 & 12)) {
            delta.colorMode |= i5 & 12;
        }
    }
}
