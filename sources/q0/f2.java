package q0;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import f0.b;
import f0.c1;
import g0.f;
import g0.j;
import java.util.Map;
import java.util.WeakHashMap;

/* JADX WARN: Classes with same name are omitted:
  
 */
/* loaded from: classes.dex */
public class f2 extends b {

    /* renamed from: d  reason: collision with root package name */
    public final g2 f3049d;

    /* renamed from: e  reason: collision with root package name */
    public Map f3050e = new WeakHashMap();

    public f2(g2 recyclerViewDelegate) {
        this.f3049d = recyclerViewDelegate;
    }

    public void o(View itemView) {
        b delegate = c1.l(itemView);
        if (delegate != null && delegate != this) {
            this.f3050e.put(itemView, delegate);
        }
    }

    public b n(View itemView) {
        return (b) this.f3050e.remove(itemView);
    }

    @Override // f0.b
    public void g(View host, f info) {
        if (this.f3049d.o() || this.f3049d.f3066d.getLayoutManager() == null) {
            super.g(host, info);
            return;
        }
        this.f3049d.f3066d.getLayoutManager().O0(host, info);
        b originalDelegate = (b) this.f3050e.get(host);
        if (originalDelegate != null) {
            originalDelegate.g(host, info);
        } else {
            super.g(host, info);
        }
    }

    @Override // f0.b
    public boolean j(View host, int action, Bundle args) {
        if (this.f3049d.o() || this.f3049d.f3066d.getLayoutManager() == null) {
            return super.j(host, action, args);
        }
        b originalDelegate = (b) this.f3050e.get(host);
        if (originalDelegate != null) {
            if (originalDelegate.j(host, action, args)) {
                return true;
            }
        } else if (super.j(host, action, args)) {
            return true;
        }
        this.f3049d.f3066d.getLayoutManager().j1(host, action, args);
        return false;
    }

    @Override // f0.b
    public void l(View host, int eventType) {
        b originalDelegate = (b) this.f3050e.get(host);
        if (originalDelegate != null) {
            originalDelegate.l(host, eventType);
        } else {
            super.l(host, eventType);
        }
    }

    @Override // f0.b
    public void m(View host, AccessibilityEvent event) {
        b originalDelegate = (b) this.f3050e.get(host);
        if (originalDelegate != null) {
            originalDelegate.m(host, event);
        } else {
            super.m(host, event);
        }
    }

    @Override // f0.b
    public boolean a(View host, AccessibilityEvent event) {
        b originalDelegate = (b) this.f3050e.get(host);
        if (originalDelegate != null) {
            return originalDelegate.a(host, event);
        }
        return super.a(host, event);
    }

    @Override // f0.b
    public void h(View host, AccessibilityEvent event) {
        b originalDelegate = (b) this.f3050e.get(host);
        if (originalDelegate != null) {
            originalDelegate.h(host, event);
        } else {
            super.h(host, event);
        }
    }

    @Override // f0.b
    public void f(View host, AccessibilityEvent event) {
        b originalDelegate = (b) this.f3050e.get(host);
        if (originalDelegate != null) {
            originalDelegate.f(host, event);
        } else {
            super.f(host, event);
        }
    }

    @Override // f0.b
    public boolean i(ViewGroup host, View child, AccessibilityEvent event) {
        b originalDelegate = (b) this.f3050e.get(host);
        if (originalDelegate != null) {
            return originalDelegate.i(host, child, event);
        }
        return super.i(host, child, event);
    }

    @Override // f0.b
    public j b(View host) {
        b originalDelegate = (b) this.f3050e.get(host);
        if (originalDelegate != null) {
            return originalDelegate.b(host);
        }
        return super.b(host);
    }
}
