package l0;

import android.content.Context;
import android.graphics.Rect;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import f0.b;
import f0.c1;
import f0.e1;
import g0.f;
import g0.j;
import g0.k;
import java.util.ArrayList;
import java.util.List;
import k.o;

/* JADX WARN: Classes with same name are omitted:
  
 */
/* loaded from: classes.dex */
public abstract class d extends b {

    /* renamed from: n  reason: collision with root package name */
    public static final Rect f2357n = new Rect(Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE);

    /* renamed from: o  reason: collision with root package name */
    public static final e f2358o = new a();

    /* renamed from: p  reason: collision with root package name */
    public static final f f2359p = new b();

    /* renamed from: h  reason: collision with root package name */
    public final AccessibilityManager f2364h;

    /* renamed from: i  reason: collision with root package name */
    public final View f2365i;

    /* renamed from: j  reason: collision with root package name */
    public c f2366j;

    /* renamed from: d  reason: collision with root package name */
    public final Rect f2360d = new Rect();

    /* renamed from: e  reason: collision with root package name */
    public final Rect f2361e = new Rect();

    /* renamed from: f  reason: collision with root package name */
    public final Rect f2362f = new Rect();

    /* renamed from: g  reason: collision with root package name */
    public final int[] f2363g = new int[2];

    /* renamed from: k  reason: collision with root package name */
    public int f2367k = Integer.MIN_VALUE;

    /* renamed from: l  reason: collision with root package name */
    public int f2368l = Integer.MIN_VALUE;

    /* renamed from: m  reason: collision with root package name */
    public int f2369m = Integer.MIN_VALUE;

    public abstract int B(float f2, float f3);

    public abstract void C(List list);

    public abstract boolean J(int i2, int i3, Bundle bundle);

    public abstract void M(f fVar);

    public abstract void N(int i2, f fVar);

    public abstract void O(int i2, boolean z2);

    public d(View host) {
        if (host != null) {
            this.f2365i = host;
            Context context = host.getContext();
            this.f2364h = (AccessibilityManager) context.getSystemService("accessibility");
            host.setFocusable(true);
            if (c1.y(host) == 0) {
                c1.s0(host, 1);
                return;
            }
            return;
        }
        throw new IllegalArgumentException("View may not be null");
    }

    @Override // f0.b
    public j b(View host) {
        if (this.f2366j == null) {
            this.f2366j = new c(this);
        }
        return this.f2366j;
    }

    public final boolean v(MotionEvent event) {
        if (!this.f2364h.isEnabled() || !this.f2364h.isTouchExplorationEnabled()) {
            return false;
        }
        switch (event.getAction()) {
            case 7:
            case 9:
                int virtualViewId = B(event.getX(), event.getY());
                V(virtualViewId);
                return virtualViewId != Integer.MIN_VALUE;
            case 8:
            default:
                return false;
            case 10:
                if (this.f2369m == Integer.MIN_VALUE) {
                    return false;
                }
                V(Integer.MIN_VALUE);
                return true;
        }
    }

    public final boolean w(KeyEvent event) {
        boolean handled = false;
        int action = event.getAction();
        if (action == 1) {
            return false;
        }
        int keyCode = event.getKeyCode();
        switch (keyCode) {
            case 19:
            case 20:
            case 21:
            case 22:
                if (!event.hasNoModifiers()) {
                    return false;
                }
                int direction = F(keyCode);
                int count = event.getRepeatCount() + 1;
                for (int i2 = 0; i2 < count && G(direction, null); i2++) {
                    handled = true;
                }
                return handled;
            case 23:
            case 66:
                if (!event.hasNoModifiers() || event.getRepeatCount() != 0) {
                    return false;
                }
                p();
                return true;
            case 61:
                if (event.hasNoModifiers()) {
                    boolean handled2 = G(2, null);
                    return handled2;
                } else if (!event.hasModifiers(1)) {
                    return false;
                } else {
                    boolean handled3 = G(1, null);
                    return handled3;
                }
            default:
                return false;
        }
    }

    public final void I(boolean gainFocus, int direction, Rect previouslyFocusedRect) {
        int i2 = this.f2368l;
        if (i2 != Integer.MIN_VALUE) {
            o(i2);
        }
        if (gainFocus) {
            G(direction, previouslyFocusedRect);
        }
    }

    public final int x() {
        return this.f2367k;
    }

    public final int A() {
        return this.f2368l;
    }

    public static int F(int keyCode) {
        switch (keyCode) {
            case 19:
                return 33;
            case 20:
            default:
                return 130;
            case 21:
                return 17;
            case 22:
                return 66;
        }
    }

    public final void z(int virtualViewId, Rect outBounds) {
        f node = H(virtualViewId);
        node.l(outBounds);
    }

    /* JADX WARN: Generic types in debug info not equals: k.o != androidx.collection.SparseArrayCompat<androidx.core.view.accessibility.AccessibilityNodeInfoCompat> */
    public final boolean G(int direction, Rect previouslyFocusedRect) {
        f nextFocusedNode;
        int index;
        o y2 = y();
        int focusedNodeId = this.f2368l;
        f focusedNode = focusedNodeId == Integer.MIN_VALUE ? null : (f) y2.e(focusedNodeId);
        switch (direction) {
            case 1:
            case 2:
                boolean isLayoutRtl = c1.A(this.f2365i) == 1;
                nextFocusedNode = (f) h.d(y2, f2359p, f2358o, focusedNode, direction, isLayoutRtl, false);
                break;
            case 17:
            case 33:
            case 66:
            case 130:
                Rect selectedRect = new Rect();
                int i2 = this.f2368l;
                if (i2 != Integer.MIN_VALUE) {
                    z(i2, selectedRect);
                } else if (previouslyFocusedRect != null) {
                    selectedRect.set(previouslyFocusedRect);
                } else {
                    D(this.f2365i, direction, selectedRect);
                }
                nextFocusedNode = (f) h.c(y2, f2359p, f2358o, focusedNode, selectedRect, direction);
                break;
            default:
                throw new IllegalArgumentException("direction must be one of {FOCUS_FORWARD, FOCUS_BACKWARD, FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
        }
        if (nextFocusedNode == null) {
            index = Integer.MIN_VALUE;
        } else {
            int index2 = y2.g(nextFocusedNode);
            index = y2.h(index2);
        }
        return T(index);
    }

    /* JADX WARN: Generic types in debug info not equals: k.o != androidx.collection.SparseArrayCompat<androidx.core.view.accessibility.AccessibilityNodeInfoCompat> */
    public final o y() {
        List<Integer> virtualViewIds = new ArrayList<>();
        C(virtualViewIds);
        o oVar = new o();
        for (int virtualViewId = 0; virtualViewId < virtualViewIds.size(); virtualViewId++) {
            f virtualView = t(virtualViewId);
            oVar.i(virtualViewId, virtualView);
        }
        return oVar;
    }

    public static Rect D(View host, int direction, Rect outBounds) {
        int w2 = host.getWidth();
        int h2 = host.getHeight();
        switch (direction) {
            case 17:
                outBounds.set(w2, 0, w2, h2);
                break;
            case 33:
                outBounds.set(0, h2, w2, h2);
                break;
            case 66:
                outBounds.set(-1, 0, -1, h2);
                break;
            case 130:
                outBounds.set(0, -1, w2, -1);
                break;
            default:
                throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
        }
        return outBounds;
    }

    public final boolean p() {
        int i2 = this.f2368l;
        return i2 != Integer.MIN_VALUE && J(i2, 16, null);
    }

    public final boolean U(int virtualViewId, int eventType) {
        ViewParent parent;
        if (virtualViewId == Integer.MIN_VALUE || !this.f2364h.isEnabled() || (parent = this.f2365i.getParent()) == null) {
            return false;
        }
        AccessibilityEvent event = q(virtualViewId, eventType);
        return e1.h(parent, this.f2365i, event);
    }

    public final void V(int virtualViewId) {
        if (this.f2369m != virtualViewId) {
            int previousVirtualViewId = this.f2369m;
            this.f2369m = virtualViewId;
            U(virtualViewId, 128);
            U(previousVirtualViewId, 256);
        }
    }

    public final AccessibilityEvent q(int virtualViewId, int eventType) {
        switch (virtualViewId) {
            case -1:
                return s(eventType);
            default:
                return r(virtualViewId, eventType);
        }
    }

    public final AccessibilityEvent s(int eventType) {
        AccessibilityEvent event = AccessibilityEvent.obtain(eventType);
        this.f2365i.onInitializeAccessibilityEvent(event);
        return event;
    }

    @Override // f0.b
    public void f(View host, AccessibilityEvent event) {
        super.f(host, event);
        K();
    }

    public final AccessibilityEvent r(int virtualViewId, int eventType) {
        AccessibilityEvent event = AccessibilityEvent.obtain(eventType);
        f node = H(virtualViewId);
        event.getText().add(node.v());
        event.setContentDescription(node.q());
        event.setScrollable(node.H());
        event.setPassword(node.G());
        event.setEnabled(node.C());
        event.setChecked(node.A());
        L();
        if (!event.getText().isEmpty() || event.getContentDescription() != null) {
            event.setClassName(node.o());
            k.c(event, this.f2365i, virtualViewId);
            event.setPackageName(this.f2365i.getContext().getPackageName());
            return event;
        }
        throw new RuntimeException("Callbacks must add text or a content description in populateEventForVirtualViewId()");
    }

    public f H(int virtualViewId) {
        if (virtualViewId == -1) {
            return u();
        }
        return t(virtualViewId);
    }

    public final f u() {
        f info = f.L(this.f2365i);
        c1.Y(this.f2365i, info);
        ArrayList<Integer> virtualViewIds = new ArrayList<>();
        C(virtualViewIds);
        int realNodeCount = info.n();
        if (realNodeCount <= 0 || virtualViewIds.size() <= 0) {
            int count = virtualViewIds.size();
            for (int i2 = 0; i2 < count; i2++) {
                info.c(this.f2365i, virtualViewIds.get(i2).intValue());
            }
            return info;
        }
        throw new RuntimeException("Views cannot have both real and virtual children");
    }

    @Override // f0.b
    public void g(View host, f info) {
        super.g(host, info);
        M(info);
    }

    public final f t(int virtualViewId) {
        f node = f.K();
        node.b0(true);
        node.d0(true);
        node.W("android.view.View");
        Rect rect = f2357n;
        node.S(rect);
        node.T(rect);
        node.k0(this.f2365i);
        N(virtualViewId, node);
        if (node.v() == null && node.q() == null) {
            throw new RuntimeException("Callbacks must add text or a content description in populateNodeForVirtualViewId()");
        }
        node.l(this.f2361e);
        if (!this.f2361e.equals(rect)) {
            int actions = node.j();
            if ((actions & 64) != 0) {
                throw new RuntimeException("Callbacks must not add ACTION_ACCESSIBILITY_FOCUS in populateNodeForVirtualViewId()");
            } else if ((actions & 128) == 0) {
                node.i0(this.f2365i.getContext().getPackageName());
                node.p0(this.f2365i, virtualViewId);
                if (this.f2367k == virtualViewId) {
                    node.Q(true);
                    node.a(128);
                } else {
                    node.Q(false);
                    node.a(64);
                }
                boolean isFocused = this.f2368l == virtualViewId;
                if (isFocused) {
                    node.a(2);
                } else if (node.D()) {
                    node.a(1);
                }
                node.e0(isFocused);
                this.f2365i.getLocationOnScreen(this.f2363g);
                node.m(this.f2360d);
                if (this.f2360d.equals(rect)) {
                    node.l(this.f2360d);
                    if (node.f2023b != -1) {
                        f parentNode = f.K();
                        for (int virtualDescendantId = node.f2023b; virtualDescendantId != -1; virtualDescendantId = parentNode.f2023b) {
                            parentNode.l0(this.f2365i, -1);
                            parentNode.S(f2357n);
                            N(virtualDescendantId, parentNode);
                            parentNode.l(this.f2361e);
                            Rect rect2 = this.f2360d;
                            Rect rect3 = this.f2361e;
                            rect2.offset(rect3.left, rect3.top);
                        }
                        parentNode.O();
                    }
                    this.f2360d.offset(this.f2363g[0] - this.f2365i.getScrollX(), this.f2363g[1] - this.f2365i.getScrollY());
                }
                if (this.f2365i.getLocalVisibleRect(this.f2362f)) {
                    this.f2362f.offset(this.f2363g[0] - this.f2365i.getScrollX(), this.f2363g[1] - this.f2365i.getScrollY());
                    boolean intersects = this.f2360d.intersect(this.f2362f);
                    if (intersects) {
                        node.T(this.f2360d);
                        if (E(this.f2360d)) {
                            node.t0(true);
                        }
                    }
                }
                return node;
            } else {
                throw new RuntimeException("Callbacks must not add ACTION_CLEAR_ACCESSIBILITY_FOCUS in populateNodeForVirtualViewId()");
            }
        } else {
            throw new RuntimeException("Callbacks must set parent bounds in populateNodeForVirtualViewId()");
        }
    }

    public boolean P(int virtualViewId, int action, Bundle arguments) {
        switch (virtualViewId) {
            case -1:
                return R(action, arguments);
            default:
                return Q(virtualViewId, action, arguments);
        }
    }

    public final boolean R(int action, Bundle arguments) {
        return c1.a0(this.f2365i, action, arguments);
    }

    public final boolean Q(int virtualViewId, int action, Bundle arguments) {
        switch (action) {
            case 1:
                return T(virtualViewId);
            case 2:
                return o(virtualViewId);
            case 64:
                return S(virtualViewId);
            case 128:
                return n(virtualViewId);
            default:
                return J(virtualViewId, action, arguments);
        }
    }

    public final boolean E(Rect localRect) {
        if (localRect == null || localRect.isEmpty() || this.f2365i.getWindowVisibility() != 0) {
            return false;
        }
        ViewParent viewParent = this.f2365i.getParent();
        while (viewParent instanceof View) {
            View view = (View) viewParent;
            if (view.getAlpha() <= 0.0f || view.getVisibility() != 0) {
                return false;
            }
            viewParent = view.getParent();
        }
        return viewParent != null;
    }

    public final boolean S(int virtualViewId) {
        int i2;
        if (!this.f2364h.isEnabled() || !this.f2364h.isTouchExplorationEnabled() || (i2 = this.f2367k) == virtualViewId) {
            return false;
        }
        if (i2 != Integer.MIN_VALUE) {
            n(i2);
        }
        this.f2367k = virtualViewId;
        this.f2365i.invalidate();
        U(virtualViewId, 32768);
        return true;
    }

    public final boolean n(int virtualViewId) {
        if (this.f2367k != virtualViewId) {
            return false;
        }
        this.f2367k = Integer.MIN_VALUE;
        this.f2365i.invalidate();
        U(virtualViewId, 65536);
        return true;
    }

    public final boolean T(int virtualViewId) {
        int i2;
        if ((!this.f2365i.isFocused() && !this.f2365i.requestFocus()) || (i2 = this.f2368l) == virtualViewId) {
            return false;
        }
        if (i2 != Integer.MIN_VALUE) {
            o(i2);
        }
        this.f2368l = virtualViewId;
        O(virtualViewId, true);
        U(virtualViewId, 8);
        return true;
    }

    public final boolean o(int virtualViewId) {
        if (this.f2368l != virtualViewId) {
            return false;
        }
        this.f2368l = Integer.MIN_VALUE;
        O(virtualViewId, false);
        U(virtualViewId, 8);
        return true;
    }

    public void L() {
    }

    public void K() {
    }
}
