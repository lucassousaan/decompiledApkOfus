package g0;

import android.view.accessibility.AccessibilityNodeInfo;

/* JADX WARN: Classes with same name are omitted:
  
 */
/* loaded from: classes.dex */
public class d {

    /* renamed from: a  reason: collision with root package name */
    public final Object f2019a;

    public static d a(int rowCount, int columnCount, boolean hierarchical, int selectionMode) {
        return new d(AccessibilityNodeInfo.CollectionInfo.obtain(rowCount, columnCount, hierarchical, selectionMode));
    }

    public d(Object info) {
        this.f2019a = info;
    }
}
