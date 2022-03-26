package g0;

import android.os.Bundle;
import android.view.accessibility.AccessibilityNodeInfo;

/* JADX WARN: Classes with same name are omitted:
  
 */
/* loaded from: classes.dex */
public class i extends h {
    public i(j compat) {
        super(compat);
    }

    @Override // android.view.accessibility.AccessibilityNodeProvider
    public void addExtraDataToAccessibilityNodeInfo(int virtualViewId, AccessibilityNodeInfo info, String extraDataKey, Bundle arguments) {
        j jVar = this.f2025a;
        f.v0(info);
        jVar.a();
    }
}
