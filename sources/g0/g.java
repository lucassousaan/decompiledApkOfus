package g0;

import android.os.Bundle;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import java.util.ArrayList;
import java.util.List;

/* JADX WARN: Classes with same name are omitted:
  
 */
/* loaded from: classes.dex */
public abstract class g extends AccessibilityNodeProvider {

    /* renamed from: a  reason: collision with root package name */
    public final j f2025a;

    public g(j compat) {
        this.f2025a = compat;
    }

    @Override // android.view.accessibility.AccessibilityNodeProvider
    public AccessibilityNodeInfo createAccessibilityNodeInfo(int virtualViewId) {
        f compatInfo = this.f2025a.b(virtualViewId);
        if (compatInfo == null) {
            return null;
        }
        return compatInfo.u0();
    }

    @Override // android.view.accessibility.AccessibilityNodeProvider
    public List findAccessibilityNodeInfosByText(String text, int virtualViewId) {
        this.f2025a.c();
        List<AccessibilityNodeInfoCompat> compatInfos = null;
        if (0 == 0) {
            return null;
        }
        List<AccessibilityNodeInfo> infoList = new ArrayList<>();
        int infoCount = compatInfos.size();
        for (int i2 = 0; i2 < infoCount; i2++) {
            f infoCompat = (f) compatInfos.get(i2);
            infoList.add(infoCompat.u0());
        }
        return infoList;
    }

    @Override // android.view.accessibility.AccessibilityNodeProvider
    public boolean performAction(int virtualViewId, int action, Bundle arguments) {
        return this.f2025a.f(virtualViewId, action, arguments);
    }
}
