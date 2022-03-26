package j;

import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

/* JADX WARN: Classes with same name are omitted:
  
 */
/* loaded from: classes.dex */
public class h implements Iterable {

    /* renamed from: b  reason: collision with root package name */
    public d f2278b;

    /* renamed from: c  reason: collision with root package name */
    public d f2279c;

    /* renamed from: d  reason: collision with root package name */
    public WeakHashMap f2280d = new WeakHashMap();

    /* renamed from: e  reason: collision with root package name */
    public int f2281e = 0;

    /* JADX WARN: Generic types in debug info not equals: j.d != androidx.arch.core.internal.SafeIterableMap$Entry<K, V> */
    /* JADX WARN: Generic types in debug info not equals: j.h != androidx.arch.core.internal.SafeIterableMap<K, V> */
    public d c(Object obj) {
        d dVar = this.f2278b;
        while (dVar != null && !dVar.f2269b.equals(obj)) {
            dVar = dVar.f2271d;
        }
        return dVar;
    }

    /* JADX WARN: Generic types in debug info not equals: j.d != androidx.arch.core.internal.SafeIterableMap$Entry<K, V> */
    /* JADX WARN: Generic types in debug info not equals: j.h != androidx.arch.core.internal.SafeIterableMap<K, V> */
    public Object g(Object obj, Object obj2) {
        d c2 = c(obj);
        if (c2 != null) {
            return c2.f2270c;
        }
        f(obj, obj2);
        return null;
    }

    /* JADX WARN: Generic types in debug info not equals: j.d != androidx.arch.core.internal.SafeIterableMap$Entry<K, V> */
    /* JADX WARN: Generic types in debug info not equals: j.h != androidx.arch.core.internal.SafeIterableMap<K, V> */
    public d f(Object obj, Object obj2) {
        d dVar = new d(obj, obj2);
        this.f2281e++;
        d dVar2 = this.f2279c;
        if (dVar2 == null) {
            this.f2278b = dVar;
            this.f2279c = dVar;
            return dVar;
        }
        dVar2.f2271d = dVar;
        dVar.f2272e = dVar2;
        this.f2279c = dVar;
        return dVar;
    }

    /* JADX WARN: Generic types in debug info not equals: j.d != androidx.arch.core.internal.SafeIterableMap$Entry<K, V> */
    /* JADX WARN: Generic types in debug info not equals: j.g != androidx.arch.core.internal.SafeIterableMap$SupportRemove<K, V> */
    /* JADX WARN: Generic types in debug info not equals: j.h != androidx.arch.core.internal.SafeIterableMap<K, V> */
    public Object h(Object obj) {
        d c2 = c(obj);
        if (c2 == null) {
            return null;
        }
        this.f2281e--;
        if (!this.f2280d.isEmpty()) {
            for (g gVar : this.f2280d.keySet()) {
                gVar.a(c2);
            }
        }
        d dVar = c2.f2272e;
        if (dVar != null) {
            dVar.f2271d = c2.f2271d;
        } else {
            this.f2278b = c2.f2271d;
        }
        d dVar2 = c2.f2271d;
        if (dVar2 != null) {
            dVar2.f2272e = dVar;
        } else {
            this.f2279c = dVar;
        }
        c2.f2271d = null;
        c2.f2272e = null;
        return c2.f2270c;
    }

    /* JADX WARN: Generic types in debug info not equals: j.h != androidx.arch.core.internal.SafeIterableMap<K, V> */
    public int size() {
        return this.f2281e;
    }

    /* JADX WARN: Generic types in debug info not equals: j.f != androidx.arch.core.internal.SafeIterableMap$ListIterator<K, V> */
    /* JADX WARN: Generic types in debug info not equals: j.h != androidx.arch.core.internal.SafeIterableMap<K, V> */
    @Override // java.lang.Iterable
    public Iterator iterator() {
        b bVar = new b(this.f2278b, this.f2279c);
        this.f2280d.put(bVar, false);
        return bVar;
    }

    /* JADX WARN: Generic types in debug info not equals: j.c != androidx.arch.core.internal.SafeIterableMap$DescendingIterator<K, V> */
    /* JADX WARN: Generic types in debug info not equals: j.h != androidx.arch.core.internal.SafeIterableMap<K, V> */
    public Iterator a() {
        c cVar = new c(this.f2279c, this.f2278b);
        this.f2280d.put(cVar, false);
        return cVar;
    }

    /* JADX WARN: Generic types in debug info not equals: j.e != androidx.arch.core.internal.SafeIterableMap<K, V>$IteratorWithAdditions */
    /* JADX WARN: Generic types in debug info not equals: j.h != androidx.arch.core.internal.SafeIterableMap<K, V> */
    public e d() {
        e eVar = new e(this);
        this.f2280d.put(eVar, false);
        return eVar;
    }

    /* JADX WARN: Generic types in debug info not equals: j.h != androidx.arch.core.internal.SafeIterableMap<K, V> */
    public Map.Entry b() {
        return this.f2278b;
    }

    /* JADX WARN: Generic types in debug info not equals: j.h != androidx.arch.core.internal.SafeIterableMap<K, V> */
    public Map.Entry e() {
        return this.f2279c;
    }

    /* JADX WARN: Generic types in debug info not equals: j.h != androidx.arch.core.internal.SafeIterableMap<K, V> */
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h map = (h) obj;
        if (size() != map.size()) {
            return false;
        }
        Iterator it = iterator();
        Iterator iterator2 = map.iterator();
        while (((f) it).hasNext() && ((f) iterator2).hasNext()) {
            Map.Entry entry = (Map.Entry) ((f) it).next();
            Object next2 = ((f) iterator2).next();
            if ((entry == null && next2 != null) || (entry != null && !entry.equals(next2))) {
                return false;
            }
        }
        return !((f) it).hasNext() && !((f) iterator2).hasNext();
    }

    /* JADX WARN: Generic types in debug info not equals: j.h != androidx.arch.core.internal.SafeIterableMap<K, V> */
    public int hashCode() {
        int h2 = 0;
        Iterator it = iterator();
        while (((f) it).hasNext()) {
            h2 += ((Map.Entry) ((f) it).next()).hashCode();
        }
        return h2;
    }

    /* JADX WARN: Generic types in debug info not equals: j.h != androidx.arch.core.internal.SafeIterableMap<K, V> */
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("[");
        Iterator it = iterator();
        while (((f) it).hasNext()) {
            builder.append(((Map.Entry) ((f) it).next()).toString());
            if (((f) it).hasNext()) {
                builder.append(", ");
            }
        }
        builder.append("]");
        return builder.toString();
    }
}
