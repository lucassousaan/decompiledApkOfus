package androidx.fragment.app;

import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.SpecialEffectsController;
import b0.c;
import com.example.helloworld.R;
import f0.c1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX WARN: Classes with same name are omitted:
  
 */
/* loaded from: classes.dex */
public abstract class t2 {

    /* renamed from: a  reason: collision with root package name */
    public final ViewGroup f923a;

    /* renamed from: b  reason: collision with root package name */
    public final ArrayList f924b = new ArrayList();

    /* renamed from: c  reason: collision with root package name */
    public final ArrayList f925c = new ArrayList();

    /* renamed from: d  reason: collision with root package name */
    public boolean f926d = false;

    /* renamed from: e  reason: collision with root package name */
    public boolean f927e = false;

    public abstract void f(List list, boolean z2);

    public static t2 n(ViewGroup container, m1 fragmentManager) {
        u2 factory = fragmentManager.o0();
        return o(container, factory);
    }

    public static t2 o(ViewGroup container, u2 factory) {
        Object controller = container.getTag(R.id.special_effects_controller_view_tag);
        if (controller instanceof t2) {
            return (t2) controller;
        }
        t2 newController = ((b1) factory).a(container);
        container.setTag(R.id.special_effects_controller_view_tag, newController);
        return newController;
    }

    public t2(ViewGroup container) {
        this.f923a = container;
    }

    public ViewGroup m() {
        return this.f923a;
    }

    public q2 l(w1 fragmentStateManager) {
        s2 pendingOperation = h(fragmentStateManager.k());
        if (pendingOperation != null) {
            return pendingOperation.g();
        }
        s2 runningOperation = i(fragmentStateManager.k());
        if (runningOperation != null) {
            return runningOperation.g();
        }
        return null;
    }

    public final s2 h(f0 fragment) {
        Iterator it = this.f924b.iterator();
        while (it.hasNext()) {
            s2 operation = (s2) it.next();
            if (operation.f().equals(fragment) && !operation.h()) {
                return operation;
            }
        }
        return null;
    }

    public final s2 i(f0 fragment) {
        Iterator it = this.f925c.iterator();
        while (it.hasNext()) {
            s2 operation = (s2) it.next();
            if (operation.f().equals(fragment) && !operation.h()) {
                return operation;
            }
        }
        return null;
    }

    public void b(r2 finalState, w1 fragmentStateManager) {
        if (m1.v0(2)) {
            Log.v("FragmentManager", "SpecialEffectsController: Enqueuing add operation for fragment " + fragmentStateManager.k());
        }
        a(finalState, q2.ADDING, fragmentStateManager);
    }

    public void e(w1 fragmentStateManager) {
        if (m1.v0(2)) {
            Log.v("FragmentManager", "SpecialEffectsController: Enqueuing show operation for fragment " + fragmentStateManager.k());
        }
        a(r2.VISIBLE, q2.NONE, fragmentStateManager);
    }

    public void c(w1 fragmentStateManager) {
        if (m1.v0(2)) {
            Log.v("FragmentManager", "SpecialEffectsController: Enqueuing hide operation for fragment " + fragmentStateManager.k());
        }
        a(r2.GONE, q2.NONE, fragmentStateManager);
    }

    public void d(w1 fragmentStateManager) {
        if (m1.v0(2)) {
            Log.v("FragmentManager", "SpecialEffectsController: Enqueuing remove operation for fragment " + fragmentStateManager.k());
        }
        a(r2.REMOVED, q2.REMOVING, fragmentStateManager);
    }

    public final void a(r2 finalState, q2 lifecycleImpact, w1 fragmentStateManager) {
        synchronized (this.f924b) {
            c signal = new c();
            s2 existingOperation = h(fragmentStateManager.k());
            if (existingOperation != null) {
                existingOperation.k(finalState, lifecycleImpact);
                return;
            }
            o2 operation = new o2(finalState, lifecycleImpact, fragmentStateManager, signal);
            this.f924b.add(operation);
            operation.a(new m2(this, operation));
            operation.a(new n2(this, operation));
        }
    }

    public void r(boolean isPop) {
        this.f926d = isPop;
    }

    public void p() {
        synchronized (this.f924b) {
            q();
            this.f927e = false;
            int index = this.f924b.size() - 1;
            while (true) {
                if (index < 0) {
                    break;
                }
                s2 operation = (s2) this.f924b.get(index);
                r2 currentState = r2.c(operation.f().H);
                r2 e2 = operation.e();
                r2 r2Var = r2.VISIBLE;
                if (e2 == r2Var && currentState != r2Var) {
                    f0 fragment = operation.f();
                    this.f927e = fragment.W();
                    break;
                }
                index--;
            }
        }
    }

    public void k() {
        if (this.f927e) {
            this.f927e = false;
            g();
        }
    }

    public void g() {
        if (!this.f927e) {
            if (!c1.O(this.f923a)) {
                j();
                this.f926d = false;
                return;
            }
            synchronized (this.f924b) {
                if (!this.f924b.isEmpty()) {
                    ArrayList<SpecialEffectsController.Operation> currentlyRunningOperations = new ArrayList<>(this.f925c);
                    this.f925c.clear();
                    Iterator<SpecialEffectsController.Operation> it = currentlyRunningOperations.iterator();
                    while (it.hasNext()) {
                        s2 operation = (s2) it.next();
                        if (m1.v0(2)) {
                            Log.v("FragmentManager", "SpecialEffectsController: Cancelling operation " + operation);
                        }
                        operation.b();
                        if (!operation.i()) {
                            this.f925c.add(operation);
                        }
                    }
                    q();
                    ArrayList<SpecialEffectsController.Operation> newPendingOperations = new ArrayList<>(this.f924b);
                    this.f924b.clear();
                    this.f925c.addAll(newPendingOperations);
                    Iterator<SpecialEffectsController.Operation> it2 = newPendingOperations.iterator();
                    while (it2.hasNext()) {
                        ((s2) it2.next()).l();
                    }
                    f(newPendingOperations, this.f926d);
                    this.f926d = false;
                }
            }
        }
    }

    public void j() {
        String str;
        String str2;
        boolean attachedToWindow = c1.O(this.f923a);
        synchronized (this.f924b) {
            q();
            Iterator it = this.f924b.iterator();
            while (it.hasNext()) {
                ((s2) it.next()).l();
            }
            ArrayList<SpecialEffectsController.Operation> runningOperations = new ArrayList<>(this.f925c);
            Iterator<SpecialEffectsController.Operation> it2 = runningOperations.iterator();
            while (it2.hasNext()) {
                s2 operation = (s2) it2.next();
                if (m1.v0(2)) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("SpecialEffectsController: ");
                    if (attachedToWindow) {
                        str2 = "";
                    } else {
                        str2 = "Container " + this.f923a + " is not attached to window. ";
                    }
                    sb.append(str2);
                    sb.append("Cancelling running operation ");
                    sb.append(operation);
                    Log.v("FragmentManager", sb.toString());
                }
                operation.b();
            }
            ArrayList<SpecialEffectsController.Operation> pendingOperations = new ArrayList<>(this.f924b);
            Iterator<SpecialEffectsController.Operation> it3 = pendingOperations.iterator();
            while (it3.hasNext()) {
                s2 operation2 = (s2) it3.next();
                if (m1.v0(2)) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("SpecialEffectsController: ");
                    if (attachedToWindow) {
                        str = "";
                    } else {
                        str = "Container " + this.f923a + " is not attached to window. ";
                    }
                    sb2.append(str);
                    sb2.append("Cancelling pending operation ");
                    sb2.append(operation2);
                    Log.v("FragmentManager", sb2.toString());
                }
                operation2.b();
            }
        }
    }

    public final void q() {
        Iterator it = this.f924b.iterator();
        while (it.hasNext()) {
            s2 operation = (s2) it.next();
            if (operation.g() == q2.ADDING) {
                f0 fragment = operation.f();
                View view = fragment.c1();
                r2 finalState = r2.b(view.getVisibility());
                operation.k(finalState, q2.NONE);
            }
        }
    }
}
