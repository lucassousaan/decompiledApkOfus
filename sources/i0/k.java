package i0;

import android.os.Bundle;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.widget.ScrollView;
import androidx.core.widget.NestedScrollView;
import f0.b;
import g0.c;
import g0.f;

/* JADX WARN: Classes with same name are omitted:
  
 */
/* loaded from: classes.dex */
public class k extends b {
    @Override // f0.b
    public boolean j(View host, int action, Bundle arguments) {
        if (super.j(host, action, arguments)) {
            return true;
        }
        NestedScrollView nsvHost = (NestedScrollView) host;
        if (!nsvHost.isEnabled()) {
            return false;
        }
        switch (action) {
            case 4096:
            case 16908346:
                int viewportHeight = (nsvHost.getHeight() - nsvHost.getPaddingBottom()) - nsvHost.getPaddingTop();
                int targetScrollY = Math.min(nsvHost.getScrollY() + viewportHeight, nsvHost.getScrollRange());
                if (targetScrollY == nsvHost.getScrollY()) {
                    return false;
                }
                nsvHost.P(0, targetScrollY, true);
                return true;
            case 8192:
            case 16908344:
                int viewportHeight2 = (nsvHost.getHeight() - nsvHost.getPaddingBottom()) - nsvHost.getPaddingTop();
                int targetScrollY2 = Math.max(nsvHost.getScrollY() - viewportHeight2, 0);
                if (targetScrollY2 == nsvHost.getScrollY()) {
                    return false;
                }
                nsvHost.P(0, targetScrollY2, true);
                return true;
            default:
                return false;
        }
    }

    @Override // f0.b
    public void g(View host, f info) {
        int scrollRange;
        super.g(host, info);
        NestedScrollView nsvHost = (NestedScrollView) host;
        info.W(ScrollView.class.getName());
        if (nsvHost.isEnabled() && (scrollRange = nsvHost.getScrollRange()) > 0) {
            info.n0(true);
            if (nsvHost.getScrollY() > 0) {
                info.b(c.f2009g);
                info.b(c.f2013k);
            }
            if (nsvHost.getScrollY() < scrollRange) {
                info.b(c.f2008f);
                info.b(c.f2014l);
            }
        }
    }

    @Override // f0.b
    public void f(View host, AccessibilityEvent event) {
        super.f(host, event);
        NestedScrollView nsvHost = (NestedScrollView) host;
        event.setClassName(ScrollView.class.getName());
        boolean scrollable = nsvHost.getScrollRange() > 0;
        event.setScrollable(scrollable);
        event.setScrollX(nsvHost.getScrollX());
        event.setScrollY(nsvHost.getScrollY());
        g0.k.a(event, nsvHost.getScrollX());
        g0.k.b(event, nsvHost.getScrollRange());
    }
}
