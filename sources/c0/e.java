package c0;

import java.util.Comparator;

/* JADX WARN: Classes with same name are omitted:
  
 */
/* loaded from: classes.dex */
public class e implements Comparator {
    /* renamed from: a */
    public int compare(byte[] l2, byte[] r2) {
        if (l2.length != r2.length) {
            return l2.length - r2.length;
        }
        for (int i2 = 0; i2 < l2.length; i2++) {
            if (l2[i2] != r2[i2]) {
                return l2[i2] - r2[i2];
            }
        }
        return 0;
    }
}
