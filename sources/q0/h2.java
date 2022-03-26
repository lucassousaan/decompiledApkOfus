package q0;

import android.view.View;

/* JADX WARN: Classes with same name are omitted:
  
 */
/* loaded from: classes.dex */
public abstract class h2 {
    public static int b(b2 state, o0 orientation, View startChild, View endChild, m1 lm, boolean smoothScrollbarEnabled, boolean reverseLayout) {
        int itemsBefore;
        if (lm.J() == 0 || state.b() == 0 || startChild == null || endChild == null) {
            return 0;
        }
        int minPosition = Math.min(lm.h0(startChild), lm.h0(endChild));
        int maxPosition = Math.max(lm.h0(startChild), lm.h0(endChild));
        if (reverseLayout) {
            itemsBefore = Math.max(0, (state.b() - maxPosition) - 1);
        } else {
            itemsBefore = Math.max(0, minPosition);
        }
        if (!smoothScrollbarEnabled) {
            return itemsBefore;
        }
        int laidOutArea = Math.abs(orientation.d(endChild) - orientation.g(startChild));
        int itemRange = Math.abs(lm.h0(startChild) - lm.h0(endChild)) + 1;
        float avgSizePerRow = laidOutArea / itemRange;
        return Math.round((itemsBefore * avgSizePerRow) + (orientation.m() - orientation.g(startChild)));
    }

    public static int a(b2 state, o0 orientation, View startChild, View endChild, m1 lm, boolean smoothScrollbarEnabled) {
        if (lm.J() == 0 || state.b() == 0 || startChild == null || endChild == null) {
            return 0;
        }
        if (!smoothScrollbarEnabled) {
            return Math.abs(lm.h0(startChild) - lm.h0(endChild)) + 1;
        }
        int extend = orientation.d(endChild) - orientation.g(startChild);
        return Math.min(orientation.n(), extend);
    }

    public static int c(b2 state, o0 orientation, View startChild, View endChild, m1 lm, boolean smoothScrollbarEnabled) {
        if (lm.J() == 0 || state.b() == 0 || startChild == null || endChild == null) {
            return 0;
        }
        if (!smoothScrollbarEnabled) {
            return state.b();
        }
        int laidOutArea = orientation.d(endChild) - orientation.g(startChild);
        int laidOutRange = Math.abs(lm.h0(startChild) - lm.h0(endChild)) + 1;
        return (int) ((laidOutArea / laidOutRange) * state.b());
    }
}
