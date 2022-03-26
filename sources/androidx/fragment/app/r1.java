package androidx.fragment.app;

import android.util.Log;
import androidx.lifecycle.d0;
import androidx.lifecycle.e0;
import androidx.lifecycle.f0;
import androidx.lifecycle.g0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;

/* JADX WARN: Classes with same name are omitted:
  
 */
/* loaded from: classes.dex */
public final class r1 extends d0 {

    /* renamed from: i  reason: collision with root package name */
    public static final e0 f898i = new q1();

    /* renamed from: e  reason: collision with root package name */
    public final boolean f902e;

    /* renamed from: b  reason: collision with root package name */
    public final HashMap f899b = new HashMap();

    /* renamed from: c  reason: collision with root package name */
    public final HashMap f900c = new HashMap();

    /* renamed from: d  reason: collision with root package name */
    public final HashMap f901d = new HashMap();

    /* renamed from: f  reason: collision with root package name */
    public boolean f903f = false;

    /* renamed from: g  reason: collision with root package name */
    public boolean f904g = false;

    /* renamed from: h  reason: collision with root package name */
    public boolean f905h = false;

    public static r1 i(g0 viewModelStore) {
        f0 viewModelProvider = new f0(viewModelStore, f898i);
        return (r1) viewModelProvider.a(r1.class);
    }

    public r1(boolean stateAutomaticallySaved) {
        this.f902e = stateAutomaticallySaved;
    }

    public void n(boolean isStateSaved) {
        this.f905h = isStateSaved;
    }

    @Override // androidx.lifecycle.d0
    public void d() {
        if (m1.v0(3)) {
            Log.d("FragmentManager", "onCleared called for " + this);
        }
        this.f903f = true;
    }

    public boolean l() {
        return this.f903f;
    }

    public void e(f0 fragment) {
        if (this.f905h) {
            if (m1.v0(2)) {
                Log.v("FragmentManager", "Ignoring addRetainedFragment as the state is already saved");
            }
        } else if (!this.f899b.containsKey(fragment.f764g)) {
            this.f899b.put(fragment.f764g, fragment);
            if (m1.v0(2)) {
                Log.v("FragmentManager", "Updating retained Fragments: Added " + fragment);
            }
        }
    }

    public f0 g(String who) {
        return (f0) this.f899b.get(who);
    }

    public Collection j() {
        return new ArrayList(this.f899b.values());
    }

    public boolean o(f0 fragment) {
        if (this.f899b.containsKey(fragment.f764g) && this.f902e) {
            return this.f903f;
        }
        return true;
    }

    public void m(f0 fragment) {
        if (!this.f905h) {
            boolean removed = this.f899b.remove(fragment.f764g) != null;
            if (removed && m1.v0(2)) {
                Log.v("FragmentManager", "Updating retained Fragments: Removed " + fragment);
            }
        } else if (m1.v0(2)) {
            Log.v("FragmentManager", "Ignoring removeRetainedFragment as the state is already saved");
        }
    }

    public r1 h(f0 f2) {
        r1 childNonConfig = (r1) this.f900c.get(f2.f764g);
        if (childNonConfig != null) {
            return childNonConfig;
        }
        r1 childNonConfig2 = new r1(this.f902e);
        this.f900c.put(f2.f764g, childNonConfig2);
        return childNonConfig2;
    }

    public g0 k(f0 f2) {
        g0 viewModelStore = (g0) this.f901d.get(f2.f764g);
        if (viewModelStore != null) {
            return viewModelStore;
        }
        g0 viewModelStore2 = new g0();
        this.f901d.put(f2.f764g, viewModelStore2);
        return viewModelStore2;
    }

    public void f(f0 f2) {
        if (m1.v0(3)) {
            Log.d("FragmentManager", "Clearing non-config state for " + f2);
        }
        r1 childNonConfig = (r1) this.f900c.get(f2.f764g);
        if (childNonConfig != null) {
            childNonConfig.d();
            this.f900c.remove(f2.f764g);
        }
        g0 viewModelStore = (g0) this.f901d.get(f2.f764g);
        if (viewModelStore != null) {
            viewModelStore.a();
            this.f901d.remove(f2.f764g);
        }
    }

    public boolean equals(Object o2) {
        if (this == o2) {
            return true;
        }
        if (o2 == null || getClass() != o2.getClass()) {
            return false;
        }
        r1 that = (r1) o2;
        if (!this.f899b.equals(that.f899b) || !this.f900c.equals(that.f900c) || !this.f901d.equals(that.f901d)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        int result = this.f899b.hashCode();
        return (((result * 31) + this.f900c.hashCode()) * 31) + this.f901d.hashCode();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("FragmentManagerViewModel{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("} Fragments (");
        Iterator<Fragment> fragmentIterator = this.f899b.values().iterator();
        while (fragmentIterator.hasNext()) {
            sb.append(fragmentIterator.next());
            if (fragmentIterator.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(") Child Non Config (");
        Iterator<String> childNonConfigIterator = this.f900c.keySet().iterator();
        while (childNonConfigIterator.hasNext()) {
            sb.append(childNonConfigIterator.next());
            if (childNonConfigIterator.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(") ViewModelStores (");
        Iterator<String> viewModelStoreIterator = this.f901d.keySet().iterator();
        while (viewModelStoreIterator.hasNext()) {
            sb.append(viewModelStoreIterator.next());
            if (viewModelStoreIterator.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(')');
        return sb.toString();
    }
}
