package g0;

import android.view.accessibility.AccessibilityNodeInfo;

/* JADX WARN: Classes with same name are omitted:
  
 */
/* loaded from: classes.dex */
public class h extends g {
    public h(j compat) {
        super(compat);
    }

    @Override // android.view.accessibility.AccessibilityNodeProvider
    public AccessibilityNodeInfo findFocus(int focus) {
        f compatInfo = this.f2025a.d(focus);
        if (compatInfo == null) {
            return null;
        }
        return compatInfo.u0();
    }
}
