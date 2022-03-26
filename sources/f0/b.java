package f0;

import android.os.Bundle;
import android.text.style.ClickableSpan;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import com.example.helloworld.R;
import g0.c;
import g0.f;
import g0.j;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.List;

/* JADX WARN: Classes with same name are omitted:
  
 */
/* loaded from: classes.dex */
public class b {

    /* renamed from: c  reason: collision with root package name */
    public static final View.AccessibilityDelegate f1844c = new View.AccessibilityDelegate();

    /* renamed from: a  reason: collision with root package name */
    public final View.AccessibilityDelegate f1845a;

    /* renamed from: b  reason: collision with root package name */
    public final View.AccessibilityDelegate f1846b;

    public b() {
        this(f1844c);
    }

    public b(View.AccessibilityDelegate originalDelegate) {
        this.f1845a = originalDelegate;
        this.f1846b = new a(this);
    }

    public View.AccessibilityDelegate d() {
        return this.f1846b;
    }

    public void l(View host, int eventType) {
        this.f1845a.sendAccessibilityEvent(host, eventType);
    }

    public void m(View host, AccessibilityEvent event) {
        this.f1845a.sendAccessibilityEventUnchecked(host, event);
    }

    public boolean a(View host, AccessibilityEvent event) {
        return this.f1845a.dispatchPopulateAccessibilityEvent(host, event);
    }

    public void h(View host, AccessibilityEvent event) {
        this.f1845a.onPopulateAccessibilityEvent(host, event);
    }

    public void f(View host, AccessibilityEvent event) {
        this.f1845a.onInitializeAccessibilityEvent(host, event);
    }

    public void g(View host, f info) {
        this.f1845a.onInitializeAccessibilityNodeInfo(host, info.u0());
    }

    public boolean i(ViewGroup host, View child, AccessibilityEvent event) {
        return this.f1845a.onRequestSendAccessibilityEvent(host, child, event);
    }

    public j b(View host) {
        Object provider = this.f1845a.getAccessibilityNodeProvider(host);
        if (provider != null) {
            return new j(provider);
        }
        return null;
    }

    public boolean j(View host, int action, Bundle args) {
        boolean success = false;
        List<AccessibilityNodeInfoCompat.AccessibilityActionCompat> actions = c(host);
        int i2 = 0;
        while (true) {
            if (i2 >= actions.size()) {
                break;
            }
            c actionCompat = (c) actions.get(i2);
            if (actionCompat.b() == action) {
                success = actionCompat.d(host, args);
                break;
            }
            i2++;
        }
        if (!success) {
            success = this.f1845a.performAccessibilityAction(host, action, args);
        }
        if (success || action != R.id.accessibility_action_clickable_span) {
            return success;
        }
        boolean success2 = k(args.getInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", -1), host);
        return success2;
    }

    public final boolean k(int clickableSpanId, View host) {
        WeakReference<ClickableSpan> reference;
        SparseArray<WeakReference<ClickableSpan>> spans = (SparseArray) host.getTag(R.id.tag_accessibility_clickable_spans);
        if (spans == null || (reference = spans.get(clickableSpanId)) == null) {
            return false;
        }
        ClickableSpan span = reference.get();
        if (!e(span, host)) {
            return false;
        }
        span.onClick(host);
        return true;
    }

    public final boolean e(ClickableSpan span, View view) {
        if (span == null) {
            return false;
        }
        AccessibilityNodeInfo info = view.createAccessibilityNodeInfo();
        ClickableSpan[] spans = f.p(info.getText());
        for (int i2 = 0; spans != null && i2 < spans.length; i2++) {
            if (span.equals(spans[i2])) {
                return true;
            }
        }
        return false;
    }

    public static List c(View view) {
        List<AccessibilityNodeInfoCompat.AccessibilityActionCompat> actions = (List) view.getTag(R.id.tag_accessibility_actions);
        return actions == null ? Collections.emptyList() : actions;
    }
}
