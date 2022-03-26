package androidx.lifecycle;

import androidx.lifecycle.LifecycleRegistry;
import i.c;
import j.a;
import j.d;
import j.f;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;

/* JADX WARN: Classes with same name are omitted:
  
 */
/* loaded from: classes.dex */
public class o extends j {

    /* renamed from: a  reason: collision with root package name */
    public a f1029a;

    /* renamed from: b  reason: collision with root package name */
    public i f1030b;

    /* renamed from: c  reason: collision with root package name */
    public final WeakReference f1031c;

    /* renamed from: d  reason: collision with root package name */
    public int f1032d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f1033e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f1034f;

    /* renamed from: g  reason: collision with root package name */
    public ArrayList f1035g;

    /* renamed from: h  reason: collision with root package name */
    public final boolean f1036h;

    public o(m provider) {
        this(provider, true);
    }

    public o(m provider, boolean enforceMainThread) {
        this.f1029a = new a();
        this.f1032d = 0;
        this.f1033e = false;
        this.f1034f = false;
        this.f1035g = new ArrayList();
        this.f1031c = new WeakReference(provider);
        this.f1030b = i.INITIALIZED;
        this.f1036h = enforceMainThread;
    }

    public void j(i state) {
        f("markState");
        o(state);
    }

    public void o(i state) {
        f("setCurrentState");
        l(state);
    }

    public void h(h event) {
        f("handleLifecycleEvent");
        l(event.b());
    }

    public final void l(i next) {
        if (this.f1030b != next) {
            this.f1030b = next;
            if (this.f1033e || this.f1032d != 0) {
                this.f1034f = true;
                return;
            }
            this.f1033e = true;
            p();
            this.f1033e = false;
        }
    }

    public final boolean i() {
        if (this.f1029a.size() == 0) {
            return true;
        }
        i eldestObserverState = ((n) ((d) this.f1029a.b()).getValue()).f1027a;
        i newestObserverState = ((n) ((d) this.f1029a.e()).getValue()).f1027a;
        return eldestObserverState == newestObserverState && this.f1030b == newestObserverState;
    }

    public final i e(l observer) {
        Map.Entry<LifecycleObserver, LifecycleRegistry.ObserverWithState> previous = this.f1029a.i(observer);
        i parentState = null;
        i siblingState = previous != null ? ((n) ((d) previous).getValue()).f1027a : null;
        if (!this.f1035g.isEmpty()) {
            ArrayList arrayList = this.f1035g;
            parentState = (i) arrayList.get(arrayList.size() - 1);
        }
        return k(k(this.f1030b, siblingState), parentState);
    }

    @Override // androidx.lifecycle.j
    public void a(l observer) {
        m lifecycleOwner;
        f("addObserver");
        i iVar = this.f1030b;
        i initialState = i.DESTROYED;
        if (iVar != initialState) {
            initialState = i.INITIALIZED;
        }
        n statefulObserver = new n(observer, initialState);
        n previous = (n) this.f1029a.g(observer, statefulObserver);
        if (previous == null && (lifecycleOwner = (m) this.f1031c.get()) != null) {
            boolean isReentrance = this.f1032d != 0 || this.f1033e;
            i targetState = e(observer);
            this.f1032d++;
            while (statefulObserver.f1027a.compareTo(targetState) < 0 && this.f1029a.contains(observer)) {
                n(statefulObserver.f1027a);
                h event = h.c(statefulObserver.f1027a);
                if (event != null) {
                    statefulObserver.a(lifecycleOwner, event);
                    m();
                    targetState = e(observer);
                } else {
                    throw new IllegalStateException("no event up from " + statefulObserver.f1027a);
                }
            }
            if (!isReentrance) {
                p();
            }
            this.f1032d--;
        }
    }

    public final void m() {
        ArrayList arrayList = this.f1035g;
        arrayList.remove(arrayList.size() - 1);
    }

    public final void n(i state) {
        this.f1035g.add(state);
    }

    @Override // androidx.lifecycle.j
    public void c(l observer) {
        f("removeObserver");
        this.f1029a.h(observer);
    }

    @Override // androidx.lifecycle.j
    public i b() {
        return this.f1030b;
    }

    public final void g(m lifecycleOwner) {
        Iterator<Map.Entry<LifecycleObserver, LifecycleRegistry.ObserverWithState>> ascendingIterator = this.f1029a.d();
        while (ascendingIterator.hasNext() && !this.f1034f) {
            Map.Entry<LifecycleObserver, LifecycleRegistry.ObserverWithState> entry = (Map.Entry) ascendingIterator.next();
            n observer = (n) entry.getValue();
            while (observer.f1027a.compareTo(this.f1030b) < 0 && !this.f1034f && this.f1029a.contains(entry.getKey())) {
                n(observer.f1027a);
                h event = h.c(observer.f1027a);
                if (event != null) {
                    observer.a(lifecycleOwner, event);
                    m();
                } else {
                    throw new IllegalStateException("no event up from " + observer.f1027a);
                }
            }
        }
    }

    public final void d(m lifecycleOwner) {
        Iterator<Map.Entry<LifecycleObserver, LifecycleRegistry.ObserverWithState>> descendingIterator = this.f1029a.a();
        while (((f) descendingIterator).hasNext() && !this.f1034f) {
            Map.Entry<LifecycleObserver, LifecycleRegistry.ObserverWithState> entry = (Map.Entry) ((f) descendingIterator).next();
            n observer = (n) entry.getValue();
            while (observer.f1027a.compareTo(this.f1030b) > 0 && !this.f1034f && this.f1029a.contains(entry.getKey())) {
                h event = h.a(observer.f1027a);
                if (event != null) {
                    n(event.b());
                    observer.a(lifecycleOwner, event);
                    m();
                } else {
                    throw new IllegalStateException("no event down from " + observer.f1027a);
                }
            }
        }
    }

    public final void p() {
        m lifecycleOwner = (m) this.f1031c.get();
        if (lifecycleOwner != null) {
            while (!i()) {
                this.f1034f = false;
                if (this.f1030b.compareTo(((n) ((d) this.f1029a.b()).getValue()).f1027a) < 0) {
                    d(lifecycleOwner);
                }
                Map.Entry<LifecycleObserver, LifecycleRegistry.ObserverWithState> newest = this.f1029a.e();
                if (!this.f1034f && newest != null && this.f1030b.compareTo(((n) ((d) newest).getValue()).f1027a) > 0) {
                    g(lifecycleOwner);
                }
            }
            this.f1034f = false;
            return;
        }
        throw new IllegalStateException("LifecycleOwner of this LifecycleRegistry is alreadygarbage collected. It is too late to change lifecycle state.");
    }

    public final void f(String methodName) {
        if (this.f1036h && !c.d().b()) {
            throw new IllegalStateException("Method " + methodName + " must be called on the main thread");
        }
    }

    public static i k(i state1, i state2) {
        return (state2 == null || state2.compareTo(state1) >= 0) ? state1 : state2;
    }
}
