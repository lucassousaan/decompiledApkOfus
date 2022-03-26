package q0;

import androidx.recyclerview.widget.RecyclerView;
import java.util.Comparator;

/* JADX WARN: Classes with same name are omitted:
  
 */
/* loaded from: classes.dex */
public final class w implements Comparator {
    /* renamed from: a */
    public int compare(y lhs, y rhs) {
        RecyclerView recyclerView = lhs.f3270d;
        if ((recyclerView == null) != (rhs.f3270d == null)) {
            return recyclerView == null ? 1 : -1;
        }
        boolean z2 = lhs.f3267a;
        if (z2 != rhs.f3267a) {
            return z2 ? -1 : 1;
        }
        int deltaViewVelocity = rhs.f3268b - lhs.f3268b;
        if (deltaViewVelocity != 0) {
            return deltaViewVelocity;
        }
        int deltaDistanceToItem = lhs.f3269c - rhs.f3269c;
        if (deltaDistanceToItem != 0) {
            return deltaDistanceToItem;
        }
        return 0;
    }
}
