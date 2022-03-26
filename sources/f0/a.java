package f0;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import g0.c;
import g0.f;
import g0.j;
import java.util.List;

/* JADX WARN: Classes with same name are omitted:
  
 */
/* loaded from: classes.dex */
public final class a extends View.AccessibilityDelegate {

    /* renamed from: a  reason: collision with root package name */
    public final b f1843a;

    public a(b compat) {
        this.f1843a = compat;
    }

    @Override // android.view.View.AccessibilityDelegate
    public boolean dispatchPopulateAccessibilityEvent(View host, AccessibilityEvent event) {
        return this.f1843a.a(host, event);
    }

    @Override // android.view.View.AccessibilityDelegate
    public void onInitializeAccessibilityEvent(View host, AccessibilityEvent event) {
        this.f1843a.f(host, event);
    }

    @Override // android.view.View.AccessibilityDelegate
    public void onInitializeAccessibilityNodeInfo(View host, AccessibilityNodeInfo info) {
        f nodeInfoCompat = f.v0(info);
        nodeInfoCompat.m0(c1.S(host));
        nodeInfoCompat.f0(c1.N(host));
        nodeInfoCompat.j0(c1.p(host));
        nodeInfoCompat.q0(c1.H(host));
        this.f1843a.g(host, nodeInfoCompat);
        nodeInfoCompat.e(info.getText(), host);
        List<AccessibilityNodeInfoCompat.AccessibilityActionCompat> actions = b.c(host);
        for (int i2 = 0; i2 < actions.size(); i2++) {
            nodeInfoCompat.b((c) actions.get(i2));
        }
    }

    @Override // android.view.View.AccessibilityDelegate
    public void onPopulateAccessibilityEvent(View host, AccessibilityEvent event) {
        this.f1843a.h(host, event);
    }

    @Override // android.view.View.AccessibilityDelegate
    public boolean onRequestSendAccessibilityEvent(ViewGroup host, View child, AccessibilityEvent event) {
        return this.f1843a.i(host, child, event);
    }

    @Override // android.view.View.AccessibilityDelegate
    public void sendAccessibilityEvent(View host, int eventType) {
        this.f1843a.l(host, eventType);
    }

    @Override // android.view.View.AccessibilityDelegate
    public void sendAccessibilityEventUnchecked(View host, AccessibilityEvent event) {
        this.f1843a.m(host, event);
    }

    @Override // android.view.View.AccessibilityDelegate
    public AccessibilityNodeProvider getAccessibilityNodeProvider(View host) {
        j provider = this.f1843a.b(host);
        if (provider != null) {
            return (AccessibilityNodeProvider) provider.e();
        }
        return null;
    }

    @Override // android.view.View.AccessibilityDelegate
    public boolean performAccessibilityAction(View host, int action, Bundle args) {
        return this.f1843a.j(host, action, args);
    }
}
