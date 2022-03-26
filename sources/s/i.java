package s;

import android.view.View;
import f0.c1;
import java.util.Comparator;

/* JADX WARN: Classes with same name are omitted:
  
 */
/* loaded from: classes.dex */
public class i implements Comparator {
    /* renamed from: a */
    public int compare(View lhs, View rhs) {
        float lz = c1.K(lhs);
        float rz = c1.K(rhs);
        if (lz > rz) {
            return -1;
        }
        if (lz < rz) {
            return 1;
        }
        return 0;
    }
}
