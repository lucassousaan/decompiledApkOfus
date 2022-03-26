package androidx.fragment.app;

import android.util.Log;
import androidx.core.os.CancellationSignal;
import b0.c;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* JADX WARN: Classes with same name are omitted:
  
 */
/* loaded from: classes.dex */
public abstract class s2 {

    /* renamed from: a  reason: collision with root package name */
    public r2 f914a;

    /* renamed from: b  reason: collision with root package name */
    public q2 f915b;

    /* renamed from: c  reason: collision with root package name */
    public final f0 f916c;

    /* renamed from: d  reason: collision with root package name */
    public final List f917d = new ArrayList();

    /* renamed from: e  reason: collision with root package name */
    public final HashSet f918e = new HashSet();

    /* renamed from: f  reason: collision with root package name */
    public boolean f919f = false;

    /* renamed from: g  reason: collision with root package name */
    public boolean f920g = false;

    public abstract void l();

    public s2(r2 finalState, q2 lifecycleImpact, f0 fragment, c cancellationSignal) {
        this.f914a = finalState;
        this.f915b = lifecycleImpact;
        this.f916c = fragment;
        cancellationSignal.b(new p2(this));
    }

    public r2 e() {
        return this.f914a;
    }

    public q2 g() {
        return this.f915b;
    }

    public final f0 f() {
        return this.f916c;
    }

    public final boolean h() {
        return this.f919f;
    }

    public String toString() {
        return "Operation {" + Integer.toHexString(System.identityHashCode(this)) + "} {mFinalState = " + this.f914a + "} {mLifecycleImpact = " + this.f915b + "} {mFragment = " + this.f916c + "}";
    }

    public final void b() {
        if (!h()) {
            this.f919f = true;
            if (this.f918e.isEmpty()) {
                c();
                return;
            }
            ArrayList<CancellationSignal> signals = new ArrayList<>(this.f918e);
            Iterator<CancellationSignal> it = signals.iterator();
            while (it.hasNext()) {
                c signal = (c) it.next();
                signal.a();
            }
        }
    }

    public final void k(r2 finalState, q2 lifecycleImpact) {
        switch (lifecycleImpact.ordinal()) {
            case 0:
                if (this.f914a != r2.REMOVED) {
                    if (m1.v0(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: For fragment " + this.f916c + " mFinalState = " + this.f914a + " -> " + finalState + ". ");
                    }
                    this.f914a = finalState;
                    return;
                }
                return;
            case 1:
                if (this.f914a == r2.REMOVED) {
                    if (m1.v0(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: For fragment " + this.f916c + " mFinalState = REMOVED -> VISIBLE. mLifecycleImpact = " + this.f915b + " to ADDING.");
                    }
                    this.f914a = r2.VISIBLE;
                    this.f915b = q2.ADDING;
                    return;
                }
                return;
            case 2:
                if (m1.v0(2)) {
                    Log.v("FragmentManager", "SpecialEffectsController: For fragment " + this.f916c + " mFinalState = " + this.f914a + " -> REMOVED. mLifecycleImpact  = " + this.f915b + " to REMOVING.");
                }
                this.f914a = r2.REMOVED;
                this.f915b = q2.REMOVING;
                return;
            default:
                return;
        }
    }

    public final void a(Runnable listener) {
        this.f917d.add(listener);
    }

    public final void j(c signal) {
        l();
        this.f918e.add(signal);
    }

    public final void d(c signal) {
        if (this.f918e.remove(signal) && this.f918e.isEmpty()) {
            c();
        }
    }

    public final boolean i() {
        return this.f920g;
    }

    public void c() {
        if (!this.f920g) {
            if (m1.v0(2)) {
                Log.v("FragmentManager", "SpecialEffectsController: " + this + " has called complete.");
            }
            this.f920g = true;
            for (Runnable listener : this.f917d) {
                listener.run();
            }
        }
    }
}
