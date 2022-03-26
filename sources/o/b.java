package o;

import java.util.ArrayList;
import n.f;

/* JADX WARN: Classes with same name are omitted:
  
 */
/* loaded from: classes.dex */
public abstract class b {
    public static void b(h constraintWidgetContainer, f system, ArrayList arrayList, int orientation) {
        c[] chainsArray;
        int chainsSize;
        int offset;
        if (orientation == 0) {
            offset = 0;
            chainsSize = constraintWidgetContainer.f2677x0;
            chainsArray = constraintWidgetContainer.A0;
        } else {
            offset = 2;
            chainsSize = constraintWidgetContainer.f2678y0;
            chainsArray = constraintWidgetContainer.f2679z0;
        }
        for (int i2 = 0; i2 < chainsSize; i2++) {
            c first = chainsArray[i2];
            first.a();
            if (arrayList == null || arrayList.contains(first.f2585a)) {
                a(constraintWidgetContainer, system, orientation, offset, first);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:302:0x0642  */
    /* JADX WARN: Removed duplicated region for block: B:303:0x0645  */
    /* JADX WARN: Removed duplicated region for block: B:306:0x064c  */
    /* JADX WARN: Removed duplicated region for block: B:307:0x064f  */
    /* JADX WARN: Removed duplicated region for block: B:309:0x0652  */
    /* JADX WARN: Removed duplicated region for block: B:314:0x0664  */
    /* JADX WARN: Removed duplicated region for block: B:316:0x0668  */
    /* JADX WARN: Removed duplicated region for block: B:317:0x0671  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void a(o.h r45, n.f r46, int r47, int r48, o.c r49) {
        /*
            Method dump skipped, instructions count: 1701
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o.b.a(o.h, n.f, int, int, o.c):void");
    }
}
