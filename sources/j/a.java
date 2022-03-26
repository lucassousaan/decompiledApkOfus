package j;

import java.util.HashMap;
import java.util.Map;

/* JADX WARN: Classes with same name are omitted:
  
 */
/* loaded from: classes.dex */
public class a extends h {

    /* renamed from: f  reason: collision with root package name */
    public HashMap f2268f = new HashMap();

    /* JADX WARN: Generic types in debug info not equals: j.a != androidx.arch.core.internal.FastSafeIterableMap<K, V> */
    @Override // j.h
    public d c(Object obj) {
        return (d) this.f2268f.get(obj);
    }

    /* JADX WARN: Generic types in debug info not equals: j.a != androidx.arch.core.internal.FastSafeIterableMap<K, V> */
    /* JADX WARN: Generic types in debug info not equals: j.d != androidx.arch.core.internal.SafeIterableMap$Entry<K, V> */
    @Override // j.h
    public Object g(Object obj, Object obj2) {
        d c2 = c(obj);
        if (c2 != null) {
            return c2.f2270c;
        }
        this.f2268f.put(obj, f(obj, obj2));
        return null;
    }

    /* JADX WARN: Generic types in debug info not equals: j.a != androidx.arch.core.internal.FastSafeIterableMap<K, V> */
    @Override // j.h
    public Object h(Object obj) {
        Object h2 = super.h(obj);
        this.f2268f.remove(obj);
        return h2;
    }

    /* JADX WARN: Generic types in debug info not equals: j.a != androidx.arch.core.internal.FastSafeIterableMap<K, V> */
    public boolean contains(Object obj) {
        return this.f2268f.containsKey(obj);
    }

    /* JADX WARN: Generic types in debug info not equals: j.a != androidx.arch.core.internal.FastSafeIterableMap<K, V> */
    public Map.Entry i(Object obj) {
        if (contains(obj)) {
            return ((d) this.f2268f.get(obj)).f2272e;
        }
        return null;
    }
}
