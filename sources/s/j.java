package s;

import e0.e;
import e0.f;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import k.n;

/* JADX WARN: Classes with same name are omitted:
  
 */
/* loaded from: classes.dex */
public final class j {

    /* renamed from: a  reason: collision with root package name */
    public final e f3446a = new f(10);

    /* renamed from: b  reason: collision with root package name */
    public final n f3447b = new n();

    /* renamed from: c  reason: collision with root package name */
    public final ArrayList f3448c = new ArrayList();

    /* renamed from: d  reason: collision with root package name */
    public final HashSet f3449d = new HashSet();

    /* JADX WARN: Generic types in debug info not equals: s.j != androidx.coordinatorlayout.widget.DirectedAcyclicGraph<T> */
    public void b(Object obj) {
        if (!this.f3447b.containsKey(obj)) {
            this.f3447b.put(obj, null);
        }
    }

    /* JADX WARN: Generic types in debug info not equals: s.j != androidx.coordinatorlayout.widget.DirectedAcyclicGraph<T> */
    public boolean d(Object obj) {
        return this.f3447b.containsKey(obj);
    }

    /* JADX WARN: Generic types in debug info not equals: s.j != androidx.coordinatorlayout.widget.DirectedAcyclicGraph<T> */
    public void a(Object obj, Object obj2) {
        if (!this.f3447b.containsKey(obj) || !this.f3447b.containsKey(obj2)) {
            throw new IllegalArgumentException("All nodes must be present in the graph before being added as an edge");
        }
        ArrayList arrayList = (ArrayList) this.f3447b.get(obj);
        if (arrayList == null) {
            arrayList = f();
            this.f3447b.put(obj, arrayList);
        }
        arrayList.add(obj2);
    }

    /* JADX WARN: Generic types in debug info not equals: s.j != androidx.coordinatorlayout.widget.DirectedAcyclicGraph<T> */
    public List g(Object obj) {
        return (List) this.f3447b.get(obj);
    }

    /* JADX WARN: Generic types in debug info not equals: s.j != androidx.coordinatorlayout.widget.DirectedAcyclicGraph<T> */
    public List h(Object obj) {
        ArrayList arrayList = null;
        int size = this.f3447b.size();
        for (int i2 = 0; i2 < size; i2++) {
            ArrayList arrayList2 = (ArrayList) this.f3447b.l(i2);
            if (arrayList2 != null && arrayList2.contains(obj)) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(this.f3447b.i(i2));
            }
        }
        return arrayList;
    }

    /* JADX WARN: Generic types in debug info not equals: s.j != androidx.coordinatorlayout.widget.DirectedAcyclicGraph<T> */
    public boolean j(Object obj) {
        int size = this.f3447b.size();
        for (int i2 = 0; i2 < size; i2++) {
            ArrayList arrayList = (ArrayList) this.f3447b.l(i2);
            if (arrayList != null && arrayList.contains(obj)) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Generic types in debug info not equals: s.j != androidx.coordinatorlayout.widget.DirectedAcyclicGraph<T> */
    public void c() {
        int size = this.f3447b.size();
        for (int i2 = 0; i2 < size; i2++) {
            ArrayList arrayList = (ArrayList) this.f3447b.l(i2);
            if (arrayList != null) {
                k(arrayList);
            }
        }
        this.f3447b.clear();
    }

    /* JADX WARN: Generic types in debug info not equals: s.j != androidx.coordinatorlayout.widget.DirectedAcyclicGraph<T> */
    public ArrayList i() {
        this.f3448c.clear();
        this.f3449d.clear();
        int size = this.f3447b.size();
        for (int i2 = 0; i2 < size; i2++) {
            e(this.f3447b.i(i2), this.f3448c, this.f3449d);
        }
        return this.f3448c;
    }

    /* JADX WARN: Generic types in debug info not equals: s.j != androidx.coordinatorlayout.widget.DirectedAcyclicGraph<T> */
    public final void e(Object obj, ArrayList arrayList, HashSet hashSet) {
        if (!arrayList.contains(obj)) {
            if (!hashSet.contains(obj)) {
                hashSet.add(obj);
                ArrayList arrayList2 = (ArrayList) this.f3447b.get(obj);
                if (arrayList2 != null) {
                    int size = arrayList2.size();
                    for (int i2 = 0; i2 < size; i2++) {
                        e(arrayList2.get(i2), arrayList, hashSet);
                    }
                }
                hashSet.remove(obj);
                arrayList.add(obj);
                return;
            }
            throw new RuntimeException("This graph contains cyclic dependencies");
        }
    }

    /* JADX WARN: Generic types in debug info not equals: s.j != androidx.coordinatorlayout.widget.DirectedAcyclicGraph<T> */
    public final ArrayList f() {
        ArrayList arrayList = (ArrayList) this.f3446a.b();
        if (arrayList == null) {
            return new ArrayList();
        }
        return arrayList;
    }

    /* JADX WARN: Generic types in debug info not equals: s.j != androidx.coordinatorlayout.widget.DirectedAcyclicGraph<T> */
    public final void k(ArrayList arrayList) {
        arrayList.clear();
        this.f3446a.a(arrayList);
    }
}
