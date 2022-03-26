package androidx.fragment.app;

import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Looper;
import android.os.Parcelable;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.activity.f;
import androidx.activity.h;
import androidx.activity.i;
import androidx.activity.result.d;
import androidx.lifecycle.g0;
import androidx.lifecycle.h0;
import androidx.lifecycle.m;
import b.b;
import b.c;
import com.example.helloworld.R;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX WARN: Classes with same name are omitted:
  
 */
/* loaded from: classes.dex */
public abstract class m1 {
    public static boolean N = false;
    public static boolean O = true;
    public d A;
    public boolean C;
    public boolean D;
    public boolean E;
    public boolean F;
    public boolean G;
    public ArrayList H;
    public ArrayList I;
    public ArrayList J;
    public ArrayList K;
    public r1 L;

    /* renamed from: b  reason: collision with root package name */
    public boolean f836b;

    /* renamed from: d  reason: collision with root package name */
    public ArrayList f838d;

    /* renamed from: e  reason: collision with root package name */
    public ArrayList f839e;

    /* renamed from: g  reason: collision with root package name */
    public h f841g;

    /* renamed from: q  reason: collision with root package name */
    public r0 f851q;

    /* renamed from: r  reason: collision with root package name */
    public n0 f852r;

    /* renamed from: s  reason: collision with root package name */
    public f0 f853s;

    /* renamed from: t  reason: collision with root package name */
    public f0 f854t;

    /* renamed from: y  reason: collision with root package name */
    public d f859y;

    /* renamed from: z  reason: collision with root package name */
    public d f860z;

    /* renamed from: a  reason: collision with root package name */
    public final ArrayList f835a = new ArrayList();

    /* renamed from: c  reason: collision with root package name */
    public final x1 f837c = new x1();

    /* renamed from: f  reason: collision with root package name */
    public final t0 f840f = new t0(this);

    /* renamed from: h  reason: collision with root package name */
    public final f f842h = new y0(this, false);

    /* renamed from: i  reason: collision with root package name */
    public final AtomicInteger f843i = new AtomicInteger();

    /* renamed from: j  reason: collision with root package name */
    public final Map f844j = Collections.synchronizedMap(new HashMap());

    /* renamed from: k  reason: collision with root package name */
    public final Map f845k = Collections.synchronizedMap(new HashMap());

    /* renamed from: l  reason: collision with root package name */
    public Map f846l = Collections.synchronizedMap(new HashMap());

    /* renamed from: m  reason: collision with root package name */
    public final a2 f847m = new z0(this);

    /* renamed from: n  reason: collision with root package name */
    public final v0 f848n = new v0(this);

    /* renamed from: o  reason: collision with root package name */
    public final CopyOnWriteArrayList f849o = new CopyOnWriteArrayList();

    /* renamed from: p  reason: collision with root package name */
    public int f850p = -1;

    /* renamed from: u  reason: collision with root package name */
    public q0 f855u = null;

    /* renamed from: v  reason: collision with root package name */
    public q0 f856v = new a1(this);

    /* renamed from: w  reason: collision with root package name */
    public u2 f857w = null;

    /* renamed from: x  reason: collision with root package name */
    public u2 f858x = new b1(this);
    public ArrayDeque B = new ArrayDeque();
    public Runnable M = new c1(this);

    public static boolean v0(int level) {
        return Log.isLoggable("FragmentManager", level);
    }

    public z1 i() {
        return new a(this);
    }

    public final void W0() {
        synchronized (this.f835a) {
            boolean z2 = true;
            if (!this.f835a.isEmpty()) {
                this.f842h.f(true);
                return;
            }
            f fVar = this.f842h;
            if (d0() <= 0 || !y0(this.f853s)) {
                z2 = false;
            }
            fVar.f(z2);
        }
    }

    public boolean y0(f0 parent) {
        if (parent == null) {
            return true;
        }
        m1 parentFragmentManager = parent.f777t;
        f0 primaryNavigationFragment = parentFragmentManager.n0();
        return parent.equals(primaryNavigationFragment) && y0(parentFragmentManager.f853s);
    }

    public boolean x0(f0 parent) {
        if (parent == null) {
            return true;
        }
        return parent.V();
    }

    public void r0() {
        S(true);
        if (this.f842h.c()) {
            G0();
        } else {
            this.f841g.c();
        }
    }

    public boolean G0() {
        return H0(null, -1, 0);
    }

    public void F0(int id, int flags) {
        if (id >= 0) {
            Q(new k1(this, null, id, flags), false);
            return;
        }
        throw new IllegalArgumentException("Bad id: " + id);
    }

    public final boolean H0(String name, int id, int flags) {
        S(false);
        R(true);
        f0 f0Var = this.f854t;
        if (f0Var != null && id < 0 && name == null) {
            m1 childManager = f0Var.o();
            if (childManager.G0()) {
                return true;
            }
        }
        boolean executePop = I0(this.H, this.I, name, id, flags);
        if (executePop) {
            this.f836b = true;
            try {
                K0(this.H, this.I);
            } finally {
                l();
            }
        }
        W0();
        N();
        this.f837c.b();
        return executePop;
    }

    public int d0() {
        ArrayList arrayList = this.f838d;
        if (arrayList != null) {
            return arrayList.size();
        }
        return 0;
    }

    public static f0 p0(View view) {
        Object tag = view.getTag(R.id.fragment_container_view_tag);
        if (tag instanceof f0) {
            return (f0) tag;
        }
        return null;
    }

    public void D0(o0 container) {
        View view;
        for (w1 fragmentStateManager : this.f837c.k()) {
            f0 fragment = fragmentStateManager.k();
            if (fragment.f782y == container.getId() && (view = fragment.H) != null && view.getParent() == null) {
                fragment.G = container;
                fragmentStateManager.b();
            }
        }
    }

    public List i0() {
        return this.f837c.n();
    }

    public g0 q0(f0 f2) {
        return this.L.k(f2);
    }

    public final r1 e0(f0 f2) {
        return this.L.h(f2);
    }

    public boolean u0() {
        return this.F;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("FragmentManager{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" in ");
        f0 f0Var = this.f853s;
        if (f0Var != null) {
            Class<?> cls = f0Var.getClass();
            sb.append(cls.getSimpleName());
            sb.append("{");
            sb.append(Integer.toHexString(System.identityHashCode(this.f853s)));
            sb.append("}");
        } else {
            r0 r0Var = this.f851q;
            if (r0Var != null) {
                Class<?> cls2 = r0Var.getClass();
                sb.append(cls2.getSimpleName());
                sb.append("{");
                sb.append(Integer.toHexString(System.identityHashCode(this.f851q)));
                sb.append("}");
            } else {
                sb.append("null");
            }
        }
        sb.append("}}");
        return sb.toString();
    }

    public void O(String prefix, FileDescriptor fd, PrintWriter writer, String[] args) {
        int count;
        int count2;
        String innerPrefix = prefix + "    ";
        this.f837c.e(prefix, fd, writer, args);
        ArrayList arrayList = this.f839e;
        if (arrayList != null && (count2 = arrayList.size()) > 0) {
            writer.print(prefix);
            writer.println("Fragments Created Menus:");
            for (int i2 = 0; i2 < count2; i2++) {
                f0 f2 = (f0) this.f839e.get(i2);
                writer.print(prefix);
                writer.print("  #");
                writer.print(i2);
                writer.print(": ");
                writer.println(f2.toString());
            }
        }
        ArrayList arrayList2 = this.f838d;
        if (arrayList2 != null && (count = arrayList2.size()) > 0) {
            writer.print(prefix);
            writer.println("Back Stack:");
            for (int i3 = 0; i3 < count; i3++) {
                a bs = (a) this.f838d.get(i3);
                writer.print(prefix);
                writer.print("  #");
                writer.print(i3);
                writer.print(": ");
                writer.println(bs.toString());
                bs.q(innerPrefix, writer);
            }
        }
        writer.print(prefix);
        writer.println("Back Stack Index: " + this.f843i.get());
        synchronized (this.f835a) {
            int count3 = this.f835a.size();
            if (count3 > 0) {
                writer.print(prefix);
                writer.println("Pending Actions:");
                for (int i4 = 0; i4 < count3; i4++) {
                    j1 r2 = (j1) this.f835a.get(i4);
                    writer.print(prefix);
                    writer.print("  #");
                    writer.print(i4);
                    writer.print(": ");
                    writer.println(r2);
                }
            }
        }
        writer.print(prefix);
        writer.println("FragmentManager misc state:");
        writer.print(prefix);
        writer.print("  mHost=");
        writer.println(this.f851q);
        writer.print(prefix);
        writer.print("  mContainer=");
        writer.println(this.f852r);
        if (this.f853s != null) {
            writer.print(prefix);
            writer.print("  mParent=");
            writer.println(this.f853s);
        }
        writer.print(prefix);
        writer.print("  mCurState=");
        writer.print(this.f850p);
        writer.print(" mStateSaved=");
        writer.print(this.D);
        writer.print(" mStopped=");
        writer.print(this.E);
        writer.print(" mDestroyed=");
        writer.println(this.F);
        if (this.C) {
            writer.print(prefix);
            writer.print("  mNeedMenuInvalidate=");
            writer.println(this.C);
        }
    }

    public void E0(w1 fragmentStateManager) {
        f0 f2 = fragmentStateManager.k();
        if (!f2.I) {
            return;
        }
        if (this.f836b) {
            this.G = true;
            return;
        }
        f2.I = false;
        fragmentStateManager.m();
    }

    public boolean z0(int state) {
        return this.f850p >= state;
    }

    public void Q0(f0 f2, boolean isPop) {
        ViewGroup container = g0(f2);
        if (container != null && (container instanceof o0)) {
            ((o0) container).setDrawDisappearingViewsLast(!isPop);
        }
    }

    public void B0(int newState, boolean always) {
        r0 r0Var;
        if (this.f851q == null && newState != -1) {
            throw new IllegalStateException("No activity");
        } else if (always || newState != this.f850p) {
            this.f850p = newState;
            this.f837c.r();
            V0();
            if (this.C && (r0Var = this.f851q) != null && this.f850p == 7) {
                r0Var.o();
                this.C = false;
            }
        }
    }

    public final void V0() {
        for (w1 fragmentStateManager : this.f837c.k()) {
            E0(fragmentStateManager);
        }
    }

    public w1 o(f0 f2) {
        w1 existing = this.f837c.m(f2.f764g);
        if (existing != null) {
            return existing;
        }
        w1 fragmentStateManager = new w1(this.f848n, this.f837c, f2);
        fragmentStateManager.o(this.f851q.k().getClassLoader());
        fragmentStateManager.t(this.f850p);
        return fragmentStateManager;
    }

    public w1 d(f0 fragment) {
        if (v0(2)) {
            Log.v("FragmentManager", "add: " + fragment);
        }
        w1 fragmentStateManager = o(fragment);
        fragment.f777t = this;
        this.f837c.p(fragmentStateManager);
        if (!fragment.B) {
            this.f837c.a(fragment);
            fragment.f771n = false;
            if (fragment.H == null) {
                fragment.L = false;
            }
            if (w0(fragment)) {
                this.C = true;
            }
        }
        return fragmentStateManager;
    }

    public void J0(f0 fragment) {
        if (v0(2)) {
            Log.v("FragmentManager", "remove: " + fragment + " nesting=" + fragment.f776s);
        }
        boolean inactive = !fragment.U();
        if (!fragment.B || inactive) {
            this.f837c.s(fragment);
            if (w0(fragment)) {
                this.C = true;
            }
            fragment.f771n = true;
            T0(fragment);
        }
    }

    public void s0(f0 fragment) {
        if (v0(2)) {
            Log.v("FragmentManager", "hide: " + fragment);
        }
        if (!fragment.A) {
            fragment.A = true;
            fragment.L = true ^ fragment.L;
            T0(fragment);
        }
    }

    public void U0(f0 fragment) {
        if (v0(2)) {
            Log.v("FragmentManager", "show: " + fragment);
        }
        if (fragment.A) {
            fragment.A = false;
            fragment.L = !fragment.L;
        }
    }

    public void p(f0 fragment) {
        if (v0(2)) {
            Log.v("FragmentManager", "detach: " + fragment);
        }
        if (!fragment.B) {
            fragment.B = true;
            if (fragment.f770m) {
                if (v0(2)) {
                    Log.v("FragmentManager", "remove from detach: " + fragment);
                }
                this.f837c.s(fragment);
                if (w0(fragment)) {
                    this.C = true;
                }
                T0(fragment);
            }
        }
    }

    public void h(f0 fragment) {
        if (v0(2)) {
            Log.v("FragmentManager", "attach: " + fragment);
        }
        if (fragment.B) {
            fragment.B = false;
            if (!fragment.f770m) {
                this.f837c.a(fragment);
                if (v0(2)) {
                    Log.v("FragmentManager", "add from attach: " + fragment);
                }
                if (w0(fragment)) {
                    this.C = true;
                }
            }
        }
    }

    public f0 Y(int id) {
        return this.f837c.g(id);
    }

    public f0 Z(String tag) {
        return this.f837c.h(tag);
    }

    public f0 a0(String who) {
        return this.f837c.i(who);
    }

    public f0 X(String who) {
        return this.f837c.f(who);
    }

    public final void k() {
        if (A0()) {
            throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
        }
    }

    public boolean A0() {
        return this.D || this.E;
    }

    public void Q(j1 action, boolean allowStateLoss) {
        if (!allowStateLoss) {
            if (this.f851q != null) {
                k();
            } else if (this.F) {
                throw new IllegalStateException("FragmentManager has been destroyed");
            } else {
                throw new IllegalStateException("FragmentManager has not been attached to a host.");
            }
        }
        synchronized (this.f835a) {
            if (this.f851q != null) {
                this.f835a.add(action);
                P0();
            } else if (!allowStateLoss) {
                throw new IllegalStateException("Activity has been destroyed");
            }
        }
    }

    public void P0() {
        synchronized (this.f835a) {
            ArrayList arrayList = this.K;
            boolean pendingReady = false;
            boolean postponeReady = arrayList != null && !arrayList.isEmpty();
            if (this.f835a.size() == 1) {
                pendingReady = true;
            }
            if (postponeReady || pendingReady) {
                this.f851q.l().removeCallbacks(this.M);
                this.f851q.l().post(this.M);
                W0();
            }
        }
    }

    public int f() {
        return this.f843i.getAndIncrement();
    }

    public final void R(boolean allowStateLoss) {
        if (this.f836b) {
            throw new IllegalStateException("FragmentManager is already executing transactions");
        } else if (this.f851q == null) {
            if (this.F) {
                throw new IllegalStateException("FragmentManager has been destroyed");
            }
            throw new IllegalStateException("FragmentManager has not been attached to a host.");
        } else if (Looper.myLooper() == this.f851q.l().getLooper()) {
            if (!allowStateLoss) {
                k();
            }
            if (this.H == null) {
                this.H = new ArrayList();
                this.I = new ArrayList();
            }
            this.f836b = true;
            try {
                W(null, null);
            } finally {
                this.f836b = false;
            }
        } else {
            throw new IllegalStateException("Must be called from main thread of fragment host");
        }
    }

    public void T(j1 action, boolean allowStateLoss) {
        if (!allowStateLoss || (this.f851q != null && !this.F)) {
            R(allowStateLoss);
            if (action.a(this.H, this.I)) {
                this.f836b = true;
                try {
                    K0(this.H, this.I);
                } finally {
                    l();
                }
            }
            W0();
            N();
            this.f837c.b();
        }
    }

    public final void l() {
        this.f836b = false;
        this.I.clear();
        this.H.clear();
    }

    /* JADX WARN: Finally extract failed */
    public boolean S(boolean allowStateLoss) {
        R(allowStateLoss);
        boolean didSomething = false;
        while (c0(this.H, this.I)) {
            this.f836b = true;
            try {
                K0(this.H, this.I);
                l();
                didSomething = true;
            } catch (Throwable th) {
                l();
                throw th;
            }
        }
        W0();
        N();
        this.f837c.b();
        return didSomething;
    }

    public final void W(ArrayList arrayList, ArrayList arrayList2) {
        int index;
        int index2;
        ArrayList arrayList3 = this.K;
        int numPostponed = arrayList3 == null ? 0 : arrayList3.size();
        int i2 = 0;
        while (i2 < numPostponed) {
            l1 listener = (l1) this.K.get(i2);
            if (arrayList != null && !listener.f830a && (index2 = arrayList.indexOf(listener.f831b)) != -1 && arrayList2 != null && ((Boolean) arrayList2.get(index2)).booleanValue()) {
                this.K.remove(i2);
                i2--;
                numPostponed--;
                listener.a();
            } else if (listener.c() || (arrayList != null && listener.f831b.w(arrayList, 0, arrayList.size()))) {
                this.K.remove(i2);
                i2--;
                numPostponed--;
                if (arrayList == null || listener.f830a || (index = arrayList.indexOf(listener.f831b)) == -1 || arrayList2 == null || !((Boolean) arrayList2.get(index)).booleanValue()) {
                    listener.b();
                } else {
                    listener.a();
                }
            }
            i2++;
        }
    }

    public final void K0(ArrayList arrayList, ArrayList arrayList2) {
        if (!arrayList.isEmpty()) {
            if (arrayList.size() == arrayList2.size()) {
                W(arrayList, arrayList2);
                int numRecords = arrayList.size();
                int startIndex = 0;
                int recordNum = 0;
                while (recordNum < numRecords) {
                    boolean canReorder = ((a) arrayList.get(recordNum)).f995o;
                    if (!canReorder) {
                        if (startIndex != recordNum) {
                            V(arrayList, arrayList2, startIndex, recordNum);
                        }
                        int reorderingEnd = recordNum + 1;
                        if (((Boolean) arrayList2.get(recordNum)).booleanValue()) {
                            while (reorderingEnd < numRecords && ((Boolean) arrayList2.get(reorderingEnd)).booleanValue() && !((a) arrayList.get(reorderingEnd)).f995o) {
                                reorderingEnd++;
                            }
                        }
                        V(arrayList, arrayList2, recordNum, reorderingEnd);
                        startIndex = reorderingEnd;
                        recordNum = reorderingEnd - 1;
                    }
                    recordNum++;
                }
                if (startIndex != numRecords) {
                    V(arrayList, arrayList2, startIndex, numRecords);
                    return;
                }
                return;
            }
            throw new IllegalStateException("Internal error with the back stack records");
        }
    }

    public final void V(ArrayList arrayList, ArrayList arrayList2, int startIndex, int endIndex) {
        boolean allowReordering = ((a) arrayList.get(startIndex)).f995o;
        boolean addToBackStack = false;
        ArrayList arrayList3 = this.J;
        if (arrayList3 == null) {
            this.J = new ArrayList();
        } else {
            arrayList3.clear();
        }
        this.J.addAll(this.f837c.n());
        f0 oldPrimaryNav = n0();
        int recordNum = startIndex;
        while (true) {
            addToBackStack = true;
            if (recordNum >= endIndex) {
                break;
            }
            a record = (a) arrayList.get(recordNum);
            if (!((Boolean) arrayList2.get(recordNum)).booleanValue()) {
                oldPrimaryNav = record.u(this.J, oldPrimaryNav);
            } else {
                oldPrimaryNav = record.y(this.J, oldPrimaryNav);
            }
            if (!addToBackStack && !record.f987g) {
                addToBackStack = false;
            }
            recordNum++;
        }
        this.J.clear();
        if (!allowReordering && this.f850p >= 1) {
            for (int index = startIndex; index < endIndex; index++) {
                Iterator it = ((a) arrayList.get(index)).f981a.iterator();
                while (it.hasNext()) {
                    y1 op = (y1) it.next();
                    f0 fragment = op.f972b;
                    if (!(fragment == null || fragment.f777t == null)) {
                        w1 fragmentStateManager = o(fragment);
                        this.f837c.p(fragmentStateManager);
                    }
                }
            }
        }
        U(arrayList, arrayList2, startIndex, endIndex);
        boolean isPop = ((Boolean) arrayList2.get(endIndex - 1)).booleanValue();
        for (int index2 = startIndex; index2 < endIndex; index2++) {
            a record2 = (a) arrayList.get(index2);
            if (isPop) {
                for (int opIndex = record2.f981a.size() - 1; opIndex >= 0; opIndex--) {
                    y1 op2 = (y1) record2.f981a.get(opIndex);
                    f0 fragment2 = op2.f972b;
                    if (fragment2 != null) {
                        w1 fragmentStateManager2 = o(fragment2);
                        fragmentStateManager2.m();
                    }
                }
            } else {
                Iterator it2 = record2.f981a.iterator();
                while (it2.hasNext()) {
                    y1 op3 = (y1) it2.next();
                    f0 fragment3 = op3.f972b;
                    if (fragment3 != null) {
                        w1 fragmentStateManager3 = o(fragment3);
                        fragmentStateManager3.m();
                    }
                }
            }
        }
        int index3 = this.f850p;
        B0(index3, true);
        Set<SpecialEffectsController> changedControllers = n(arrayList, startIndex, endIndex);
        Iterator<SpecialEffectsController> it3 = changedControllers.iterator();
        while (it3.hasNext()) {
            t2 controller = (t2) it3.next();
            controller.r(isPop);
            controller.p();
            controller.g();
        }
        for (int recordNum2 = startIndex; recordNum2 < endIndex; recordNum2++) {
            a record3 = (a) arrayList.get(recordNum2);
            if (((Boolean) arrayList2.get(recordNum2)).booleanValue() && record3.f698s >= 0) {
                record3.f698s = -1;
            }
            record3.x();
        }
        if (addToBackStack) {
            L0();
        }
    }

    public final Set n(ArrayList arrayList, int startIndex, int endIndex) {
        ViewGroup container;
        Set<SpecialEffectsController> controllers = new HashSet<>();
        for (int index = startIndex; index < endIndex; index++) {
            a record = (a) arrayList.get(index);
            Iterator it = record.f981a.iterator();
            while (it.hasNext()) {
                y1 op = (y1) it.next();
                f0 fragment = op.f972b;
                if (!(fragment == null || (container = fragment.G) == null)) {
                    controllers.add(t2.n(container, this));
                }
            }
        }
        return controllers;
    }

    public static void U(ArrayList arrayList, ArrayList arrayList2, int startIndex, int endIndex) {
        for (int i2 = startIndex; i2 < endIndex; i2++) {
            a record = (a) arrayList.get(i2);
            boolean isPop = ((Boolean) arrayList2.get(i2)).booleanValue();
            boolean moveToState = true;
            if (isPop) {
                record.o(-1);
                if (i2 != endIndex - 1) {
                    moveToState = false;
                }
                record.t(moveToState);
            } else {
                record.o(1);
                record.s();
            }
        }
    }

    public final void T0(f0 f2) {
        ViewGroup container = g0(f2);
        if (container != null && f2.q() + f2.t() + f2.D() + f2.E() > 0) {
            if (container.getTag(R.id.visible_removing_fragment_view_tag) == null) {
                container.setTag(R.id.visible_removing_fragment_view_tag, f2);
            }
            ((f0) container.getTag(R.id.visible_removing_fragment_view_tag)).k1(f2.C());
        }
    }

    public final ViewGroup g0(f0 f2) {
        ViewGroup viewGroup = f2.G;
        if (viewGroup != null) {
            return viewGroup;
        }
        if (f2.f782y > 0 && this.f852r.i()) {
            View view = this.f852r.h(f2.f782y);
            if (view instanceof ViewGroup) {
                return (ViewGroup) view;
            }
        }
        return null;
    }

    public final void b0() {
        Set<SpecialEffectsController> controllers = m();
        Iterator<SpecialEffectsController> it = controllers.iterator();
        while (it.hasNext()) {
            t2 controller = (t2) it.next();
            controller.k();
        }
    }

    public final void P() {
        Set<SpecialEffectsController> controllers = m();
        Iterator<SpecialEffectsController> it = controllers.iterator();
        while (it.hasNext()) {
            t2 controller = (t2) it.next();
            controller.j();
        }
    }

    public final Set m() {
        Set<SpecialEffectsController> controllers = new HashSet<>();
        for (w1 fragmentStateManager : this.f837c.k()) {
            ViewGroup container = fragmentStateManager.k().G;
            if (container != null) {
                controllers.add(t2.o(container, o0()));
            }
        }
        return controllers;
    }

    public final boolean c0(ArrayList arrayList, ArrayList arrayList2) {
        boolean didSomething = false;
        synchronized (this.f835a) {
            if (this.f835a.isEmpty()) {
                return false;
            }
            int numActions = this.f835a.size();
            for (int i2 = 0; i2 < numActions; i2++) {
                didSomething |= ((j1) this.f835a.get(i2)).a(arrayList, arrayList2);
            }
            this.f835a.clear();
            this.f851q.l().removeCallbacks(this.M);
            return didSomething;
        }
    }

    public final void N() {
        if (this.G) {
            this.G = false;
            V0();
        }
    }

    public final void L0() {
    }

    public void c(a state) {
        if (this.f838d == null) {
            this.f838d = new ArrayList();
        }
        this.f838d.add(state);
    }

    public boolean I0(ArrayList arrayList, ArrayList arrayList2, String name, int id, int flags) {
        ArrayList arrayList3 = this.f838d;
        if (arrayList3 == null) {
            return false;
        }
        if (name == null && id < 0 && (flags & 1) == 0) {
            int last = arrayList3.size() - 1;
            if (last < 0) {
                return false;
            }
            arrayList.add(this.f838d.remove(last));
            arrayList2.add(true);
        } else {
            int index = -1;
            if (name != null || id >= 0) {
                index = arrayList3.size() - 1;
                while (index >= 0) {
                    a bss = (a) this.f838d.get(index);
                    if ((name != null && name.equals(bss.v())) || (id >= 0 && id == bss.f698s)) {
                        break;
                    }
                    index--;
                }
                if (index < 0) {
                    return false;
                }
                if ((flags & 1) != 0) {
                    index--;
                    while (index >= 0) {
                        a bss2 = (a) this.f838d.get(index);
                        if ((name == null || !name.equals(bss2.v())) && (id < 0 || id != bss2.f698s)) {
                            break;
                        }
                        index--;
                    }
                }
            }
            if (index == this.f838d.size() - 1) {
                return false;
            }
            for (int i2 = this.f838d.size() - 1; i2 > index; i2--) {
                arrayList.add(this.f838d.remove(i2));
                arrayList2.add(true);
            }
        }
        return true;
    }

    public Parcelable O0() {
        int size;
        b0();
        P();
        S(true);
        this.D = true;
        this.L.n(true);
        ArrayList<FragmentState> active = this.f837c.v();
        if (!active.isEmpty()) {
            ArrayList<String> added = this.f837c.w();
            c[] backStack = null;
            ArrayList arrayList = this.f838d;
            if (arrayList != null && (size = arrayList.size()) > 0) {
                backStack = new c[size];
                for (int i2 = 0; i2 < size; i2++) {
                    backStack[i2] = new c((a) this.f838d.get(i2));
                    if (v0(2)) {
                        Log.v("FragmentManager", "saveAllState: adding back stack #" + i2 + ": " + this.f838d.get(i2));
                    }
                }
            }
            p1 fms = new p1();
            fms.f879b = active;
            fms.f880c = added;
            fms.f881d = backStack;
            fms.f882e = this.f843i.get();
            f0 f0Var = this.f854t;
            if (f0Var != null) {
                fms.f883f = f0Var.f764g;
            }
            fms.f884g.addAll(this.f844j.keySet());
            fms.f885h.addAll(this.f844j.values());
            fms.f886i = new ArrayList(this.B);
            return fms;
        } else if (!v0(2)) {
            return null;
        } else {
            Log.v("FragmentManager", "saveAllState: no fragments!");
            return null;
        }
    }

    public void M0(Parcelable state) {
        w1 fragmentStateManager;
        if (state != null) {
            p1 fms = (p1) state;
            if (fms.f879b != null) {
                this.f837c.t();
                Iterator it = fms.f879b.iterator();
                while (it.hasNext()) {
                    u1 fs = (u1) it.next();
                    if (fs != null) {
                        f0 retainedFragment = this.L.g(fs.f930c);
                        if (retainedFragment != null) {
                            if (v0(2)) {
                                Log.v("FragmentManager", "restoreSaveState: re-attaching retained " + retainedFragment);
                            }
                            fragmentStateManager = new w1(this.f848n, this.f837c, retainedFragment, fs);
                        } else {
                            fragmentStateManager = new w1(this.f848n, this.f837c, this.f851q.k().getClassLoader(), h0(), fs);
                        }
                        f0 f2 = fragmentStateManager.k();
                        f2.f777t = this;
                        if (v0(2)) {
                            Log.v("FragmentManager", "restoreSaveState: active (" + f2.f764g + "): " + f2);
                        }
                        fragmentStateManager.o(this.f851q.k().getClassLoader());
                        this.f837c.p(fragmentStateManager);
                        fragmentStateManager.t(this.f850p);
                    }
                }
                Iterator it2 = ((ArrayList) this.L.j()).iterator();
                while (it2.hasNext()) {
                    f0 f3 = (f0) it2.next();
                    if (!this.f837c.c(f3.f764g)) {
                        if (v0(2)) {
                            Log.v("FragmentManager", "Discarding retained Fragment " + f3 + " that was not found in the set of active Fragments " + fms.f879b);
                        }
                        this.L.m(f3);
                        f3.f777t = this;
                        w1 fragmentStateManager2 = new w1(this.f848n, this.f837c, f3);
                        fragmentStateManager2.t(1);
                        fragmentStateManager2.m();
                        f3.f771n = true;
                        fragmentStateManager2.m();
                    }
                }
                this.f837c.u(fms.f880c);
                if (fms.f881d != null) {
                    this.f838d = new ArrayList(fms.f881d.length);
                    int i2 = 0;
                    while (true) {
                        c[] cVarArr = fms.f881d;
                        if (i2 >= cVarArr.length) {
                            break;
                        }
                        a bse = cVarArr[i2].i(this);
                        if (v0(2)) {
                            Log.v("FragmentManager", "restoreAllState: back stack #" + i2 + " (index " + bse.f698s + "): " + bse);
                            l2 logw = new l2("FragmentManager");
                            PrintWriter pw = new PrintWriter(logw);
                            bse.r("  ", pw, false);
                            pw.close();
                        }
                        this.f838d.add(bse);
                        i2++;
                    }
                } else {
                    this.f838d = null;
                }
                this.f843i.set(fms.f882e);
                String str = fms.f883f;
                if (str != null) {
                    f0 X = X(str);
                    this.f854t = X;
                    D(X);
                }
                ArrayList<String> savedResultKeys = fms.f884g;
                if (savedResultKeys != null) {
                    for (int i3 = 0; i3 < savedResultKeys.size(); i3++) {
                        Bundle savedResult = (Bundle) fms.f885h.get(i3);
                        savedResult.setClassLoader(this.f851q.k().getClassLoader());
                        this.f844j.put(savedResultKeys.get(i3), savedResult);
                    }
                }
                this.B = new ArrayDeque(fms.f886i);
            }
        }
    }

    public r0 j0() {
        return this.f851q;
    }

    public f0 m0() {
        return this.f853s;
    }

    public n0 f0() {
        return this.f852r;
    }

    /* JADX WARN: Generic types in debug info not equals: androidx.fragment.app.r0 != androidx.fragment.app.FragmentHostCallback<?> */
    public void g(r0 r0Var, n0 container, f0 parent) {
        String parentId;
        if (this.f851q == null) {
            this.f851q = r0Var;
            this.f852r = container;
            this.f853s = parent;
            if (parent != null) {
                e(new d1(this, parent));
            } else if (r0Var instanceof s1) {
                e((s1) r0Var);
            }
            if (this.f853s != null) {
                W0();
            }
            if (r0Var instanceof i) {
                i dispatcherOwner = (i) r0Var;
                h a2 = dispatcherOwner.a();
                this.f841g = a2;
                m owner = parent != null ? parent : dispatcherOwner;
                a2.a(owner, this.f842h);
            }
            if (parent != null) {
                this.L = parent.f777t.e0(parent);
            } else if (r0Var instanceof h0) {
                g0 viewModelStore = ((h0) r0Var).d();
                this.L = r1.i(viewModelStore);
            } else {
                this.L = new r1(false);
            }
            this.L.n(A0());
            this.f837c.x(this.L);
            r0 r0Var2 = this.f851q;
            if (r0Var2 instanceof androidx.activity.result.i) {
                androidx.activity.result.h registry = ((androidx.activity.result.i) r0Var2).f();
                if (parent != null) {
                    parentId = parent.f764g + ":";
                } else {
                    parentId = "";
                }
                String keyPrefix = "FragmentManager:" + parentId;
                this.f859y = registry.g(keyPrefix + "StartActivityForResult", new c(), new e1(this));
                this.f860z = registry.g(keyPrefix + "StartIntentSenderForResult", new f1(), new w0(this));
                this.A = registry.g(keyPrefix + "RequestPermissions", new b(), new x0(this));
                return;
            }
            return;
        }
        throw new IllegalStateException("Already attached");
    }

    public void C0() {
        if (this.f851q != null) {
            this.D = false;
            this.E = false;
            this.L.n(false);
            for (f0 fragment : this.f837c.n()) {
                if (fragment != null) {
                    fragment.Y();
                }
            }
        }
    }

    public void r() {
        this.D = false;
        this.E = false;
        this.L.n(false);
        K(0);
    }

    public void u() {
        this.D = false;
        this.E = false;
        this.L.n(false);
        K(1);
    }

    public void M() {
        K(2);
    }

    public void q() {
        this.D = false;
        this.E = false;
        this.L.n(false);
        K(4);
    }

    public void J() {
        this.D = false;
        this.E = false;
        this.L.n(false);
        K(5);
    }

    public void I() {
        this.D = false;
        this.E = false;
        this.L.n(false);
        K(7);
    }

    public void E() {
        K(5);
    }

    public void L() {
        this.E = true;
        this.L.n(true);
        K(4);
    }

    public void x() {
        K(1);
    }

    public void w() {
        this.F = true;
        S(true);
        P();
        K(-1);
        this.f851q = null;
        this.f852r = null;
        this.f853s = null;
        if (this.f841g != null) {
            this.f842h.d();
            this.f841g = null;
        }
        d dVar = this.f859y;
        if (dVar != null) {
            dVar.a();
            this.f860z.a();
            this.A.a();
        }
    }

    /* JADX WARN: Finally extract failed */
    public final void K(int nextState) {
        try {
            this.f836b = true;
            this.f837c.d(nextState);
            B0(nextState, false);
            Set<SpecialEffectsController> controllers = m();
            Iterator<SpecialEffectsController> it = controllers.iterator();
            while (it.hasNext()) {
                t2 controller = (t2) it.next();
                controller.j();
            }
            this.f836b = false;
            S(true);
        } catch (Throwable th) {
            this.f836b = false;
            throw th;
        }
    }

    public void z(boolean isInMultiWindowMode) {
        for (f0 f2 : this.f837c.n()) {
            if (f2 != null) {
                f2.O0(isInMultiWindowMode);
            }
        }
    }

    public void F(boolean isInPictureInPictureMode) {
        for (f0 f2 : this.f837c.n()) {
            if (f2 != null) {
                f2.S0(isInPictureInPictureMode);
            }
        }
    }

    public void s(Configuration newConfig) {
        for (f0 f2 : this.f837c.n()) {
            if (f2 != null) {
                f2.E0(newConfig);
            }
        }
    }

    public void y() {
        for (f0 f2 : this.f837c.n()) {
            if (f2 != null) {
                f2.N0();
            }
        }
    }

    public boolean v(Menu menu, MenuInflater inflater) {
        if (this.f850p < 1) {
            return false;
        }
        boolean show = false;
        ArrayList<Fragment> newMenus = null;
        for (f0 f2 : this.f837c.n()) {
            if (f2 != null && x0(f2) && f2.H0(menu, inflater)) {
                show = true;
                if (newMenus == null) {
                    newMenus = new ArrayList<>();
                }
                newMenus.add(f2);
            }
        }
        if (this.f839e != null) {
            for (int i2 = 0; i2 < this.f839e.size(); i2++) {
                f0 f3 = (f0) this.f839e.get(i2);
                if (newMenus == null || !newMenus.contains(f3)) {
                    f3.k0();
                }
            }
        }
        this.f839e = newMenus;
        return show;
    }

    public boolean G(Menu menu) {
        if (this.f850p < 1) {
            return false;
        }
        boolean show = false;
        for (f0 f2 : this.f837c.n()) {
            if (f2 != null && x0(f2) && f2.T0(menu)) {
                show = true;
            }
        }
        return show;
    }

    public boolean B(MenuItem item) {
        if (this.f850p < 1) {
            return false;
        }
        for (f0 f2 : this.f837c.n()) {
            if (f2 != null && f2.P0(item)) {
                return true;
            }
        }
        return false;
    }

    public boolean t(MenuItem item) {
        if (this.f850p < 1) {
            return false;
        }
        for (f0 f2 : this.f837c.n()) {
            if (f2 != null && f2.F0(item)) {
                return true;
            }
        }
        return false;
    }

    public void C(Menu menu) {
        if (this.f850p >= 1) {
            for (f0 f2 : this.f837c.n()) {
                if (f2 != null) {
                    f2.Q0(menu);
                }
            }
        }
    }

    public void S0(f0 f2) {
        if (f2 == null || (f2.equals(X(f2.f764g)) && (f2.f778u == null || f2.f777t == this))) {
            f0 previousPrimaryNav = this.f854t;
            this.f854t = f2;
            D(previousPrimaryNav);
            D(this.f854t);
            return;
        }
        throw new IllegalArgumentException("Fragment " + f2 + " is not an active fragment of FragmentManager " + this);
    }

    public final void D(f0 f2) {
        if (f2 != null && f2.equals(X(f2.f764g))) {
            f2.U0();
        }
    }

    public void H() {
        W0();
        D(this.f854t);
    }

    public f0 n0() {
        return this.f854t;
    }

    public void R0(f0 f2, androidx.lifecycle.i state) {
        if (!f2.equals(X(f2.f764g)) || !(f2.f778u == null || f2.f777t == this)) {
            throw new IllegalArgumentException("Fragment " + f2 + " is not an active fragment of FragmentManager " + this);
        }
        f2.O = state;
    }

    public q0 h0() {
        f0 f0Var = this.f853s;
        if (f0Var != null) {
            return f0Var.f777t.h0();
        }
        return this.f856v;
    }

    public u2 o0() {
        f0 f0Var = this.f853s;
        if (f0Var != null) {
            return f0Var.f777t.o0();
        }
        return this.f858x;
    }

    public v0 l0() {
        return this.f848n;
    }

    public void e(s1 listener) {
        this.f849o.add(listener);
    }

    public void A(f0 fragment) {
        Iterator it = this.f849o.iterator();
        while (it.hasNext()) {
            s1 listener = (s1) it.next();
            listener.c(this, fragment);
        }
    }

    public boolean j() {
        boolean hasMenu = false;
        for (f0 fragment : this.f837c.l()) {
            if (fragment != null) {
                hasMenu = w0(fragment);
                continue;
            }
            if (hasMenu) {
                return true;
            }
        }
        return false;
    }

    public final boolean w0(f0 f2) {
        Objects.requireNonNull(f2);
        return f2.f779v.j();
    }

    public void t0(f0 f2) {
        if (f2.f770m && w0(f2)) {
            this.C = true;
        }
    }

    public static int N0(int transit) {
        switch (transit) {
            case 4097:
                return 8194;
            case 4099:
                return 4099;
            case 8194:
                return 4097;
            default:
                return 0;
        }
    }

    public LayoutInflater.Factory2 k0() {
        return this.f840f;
    }
}
