package androidx.fragment.app;

import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* JADX WARN: Classes with same name are omitted:
  
 */
/* loaded from: classes.dex */
public class x1 {

    /* renamed from: a  reason: collision with root package name */
    public final ArrayList f966a = new ArrayList();

    /* renamed from: b  reason: collision with root package name */
    public final HashMap f967b = new HashMap();

    /* renamed from: c  reason: collision with root package name */
    public r1 f968c;

    public void x(r1 nonConfig) {
        this.f968c = nonConfig;
    }

    public r1 o() {
        return this.f968c;
    }

    public void t() {
        this.f967b.clear();
    }

    public void u(List list) {
        this.f966a.clear();
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                String who = (String) it.next();
                f0 f2 = f(who);
                if (f2 != null) {
                    if (m1.v0(2)) {
                        Log.v("FragmentManager", "restoreSaveState: added (" + who + "): " + f2);
                    }
                    a(f2);
                } else {
                    throw new IllegalStateException("No instantiated fragment for (" + who + ")");
                }
            }
        }
    }

    public void p(w1 newlyActive) {
        f0 f2 = newlyActive.k();
        if (!c(f2.f764g)) {
            this.f967b.put(f2.f764g, newlyActive);
            if (f2.D) {
                if (f2.C) {
                    this.f968c.e(f2);
                } else {
                    this.f968c.m(f2);
                }
                f2.D = false;
            }
            if (m1.v0(2)) {
                Log.v("FragmentManager", "Added fragment to active set " + f2);
            }
        }
    }

    public void a(f0 fragment) {
        if (!this.f966a.contains(fragment)) {
            synchronized (this.f966a) {
                this.f966a.add(fragment);
            }
            fragment.f770m = true;
            return;
        }
        throw new IllegalStateException("Fragment already added: " + fragment);
    }

    public void d(int state) {
        for (w1 fragmentStateManager : this.f967b.values()) {
            if (fragmentStateManager != null) {
                fragmentStateManager.t(state);
            }
        }
    }

    public void r() {
        Iterator it = this.f966a.iterator();
        while (it.hasNext()) {
            w1 fragmentStateManager = (w1) this.f967b.get(((f0) it.next()).f764g);
            if (fragmentStateManager != null) {
                fragmentStateManager.m();
            }
        }
        for (w1 fragmentStateManager2 : this.f967b.values()) {
            if (fragmentStateManager2 != null) {
                fragmentStateManager2.m();
                f0 f2 = fragmentStateManager2.k();
                boolean beingRemoved = f2.f771n && !f2.U();
                if (beingRemoved) {
                    q(fragmentStateManager2);
                }
            }
        }
    }

    public void s(f0 fragment) {
        synchronized (this.f966a) {
            this.f966a.remove(fragment);
        }
        fragment.f770m = false;
    }

    public void q(w1 newlyInactive) {
        f0 f2 = newlyInactive.k();
        if (f2.C) {
            this.f968c.m(f2);
        }
        w1 removedStateManager = (w1) this.f967b.put(f2.f764g, null);
        if (removedStateManager != null && m1.v0(2)) {
            Log.v("FragmentManager", "Removed fragment from active set " + f2);
        }
    }

    public void b() {
        Collection<FragmentStateManager> values = this.f967b.values();
        values.removeAll(Collections.singleton(null));
    }

    public ArrayList v() {
        ArrayList<FragmentState> active = new ArrayList<>(this.f967b.size());
        for (w1 fragmentStateManager : this.f967b.values()) {
            if (fragmentStateManager != null) {
                f0 f2 = fragmentStateManager.k();
                u1 fs = fragmentStateManager.r();
                active.add(fs);
                if (m1.v0(2)) {
                    Log.v("FragmentManager", "Saved state of " + f2 + ": " + fs.f941n);
                }
            }
        }
        return active;
    }

    public ArrayList w() {
        synchronized (this.f966a) {
            if (this.f966a.isEmpty()) {
                return null;
            }
            ArrayList<String> added = new ArrayList<>(this.f966a.size());
            Iterator it = this.f966a.iterator();
            while (it.hasNext()) {
                f0 f2 = (f0) it.next();
                added.add(f2.f764g);
                if (m1.v0(2)) {
                    Log.v("FragmentManager", "saveAllState: adding fragment (" + f2.f764g + "): " + f2);
                }
            }
            return added;
        }
    }

    public List k() {
        ArrayList<FragmentStateManager> activeFragmentStateManagers = new ArrayList<>();
        for (w1 fragmentStateManager : this.f967b.values()) {
            if (fragmentStateManager != null) {
                activeFragmentStateManagers.add(fragmentStateManager);
            }
        }
        return activeFragmentStateManagers;
    }

    public List n() {
        ArrayList arrayList;
        if (this.f966a.isEmpty()) {
            return Collections.emptyList();
        }
        synchronized (this.f966a) {
            arrayList = new ArrayList(this.f966a);
        }
        return arrayList;
    }

    public List l() {
        ArrayList<Fragment> activeFragments = new ArrayList<>();
        for (w1 fragmentStateManager : this.f967b.values()) {
            if (fragmentStateManager != null) {
                activeFragments.add(fragmentStateManager.k());
            } else {
                activeFragments.add(null);
            }
        }
        return activeFragments;
    }

    public f0 g(int id) {
        for (int i2 = this.f966a.size() - 1; i2 >= 0; i2--) {
            f0 f2 = (f0) this.f966a.get(i2);
            if (f2 != null && f2.f781x == id) {
                return f2;
            }
        }
        for (w1 fragmentStateManager : this.f967b.values()) {
            if (fragmentStateManager != null) {
                f0 f3 = fragmentStateManager.k();
                if (f3.f781x == id) {
                    return f3;
                }
            }
        }
        return null;
    }

    public f0 h(String tag) {
        if (tag != null) {
            for (int i2 = this.f966a.size() - 1; i2 >= 0; i2--) {
                f0 f2 = (f0) this.f966a.get(i2);
                if (f2 != null && tag.equals(f2.f783z)) {
                    return f2;
                }
            }
        }
        if (tag == null) {
            return null;
        }
        for (w1 fragmentStateManager : this.f967b.values()) {
            if (fragmentStateManager != null) {
                f0 f3 = fragmentStateManager.k();
                if (tag.equals(f3.f783z)) {
                    return f3;
                }
            }
        }
        return null;
    }

    public boolean c(String who) {
        return this.f967b.get(who) != null;
    }

    public w1 m(String who) {
        return (w1) this.f967b.get(who);
    }

    public f0 i(String who) {
        f0 f2;
        for (w1 fragmentStateManager : this.f967b.values()) {
            if (!(fragmentStateManager == null || (f2 = fragmentStateManager.k().i(who)) == null)) {
                return f2;
            }
        }
        return null;
    }

    public f0 f(String who) {
        w1 fragmentStateManager = (w1) this.f967b.get(who);
        if (fragmentStateManager != null) {
            return fragmentStateManager.k();
        }
        return null;
    }

    public int j(f0 f2) {
        View view;
        View view2;
        ViewGroup container = f2.G;
        if (container == null) {
            return -1;
        }
        int fragmentIndex = this.f966a.indexOf(f2);
        for (int i2 = fragmentIndex - 1; i2 >= 0; i2--) {
            f0 underFragment = (f0) this.f966a.get(i2);
            if (underFragment.G == container && (view2 = underFragment.H) != null) {
                int underIndex = container.indexOfChild(view2);
                return underIndex + 1;
            }
        }
        for (int i3 = fragmentIndex + 1; i3 < this.f966a.size(); i3++) {
            f0 overFragment = (f0) this.f966a.get(i3);
            if (overFragment.G == container && (view = overFragment.H) != null) {
                return container.indexOfChild(view);
            }
        }
        return -1;
    }

    public void e(String prefix, FileDescriptor fd, PrintWriter writer, String[] args) {
        String innerPrefix = prefix + "    ";
        if (!this.f967b.isEmpty()) {
            writer.print(prefix);
            writer.println("Active Fragments:");
            for (w1 fragmentStateManager : this.f967b.values()) {
                writer.print(prefix);
                if (fragmentStateManager != null) {
                    f0 f2 = fragmentStateManager.k();
                    writer.println(f2);
                    f2.f(innerPrefix, fd, writer, args);
                } else {
                    writer.println("null");
                }
            }
        }
        int count = this.f966a.size();
        if (count > 0) {
            writer.print(prefix);
            writer.println("Added Fragments:");
            for (int i2 = 0; i2 < count; i2++) {
                writer.print(prefix);
                writer.print("  #");
                writer.print(i2);
                writer.print(": ");
                writer.println(((f0) this.f966a.get(i2)).toString());
            }
        }
    }
}
