package k;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* JADX WARN: Classes with same name are omitted:
  
 */
/* loaded from: classes.dex */
public class b extends n implements Map {

    /* renamed from: i  reason: collision with root package name */
    public m f2297i;

    /* JADX WARN: Generic types in debug info not equals: k.b != androidx.collection.ArrayMap<K, V> */
    public final m m() {
        if (this.f2297i == null) {
            this.f2297i = new a(this);
        }
        return this.f2297i;
    }

    /* JADX WARN: Generic types in debug info not equals: k.b != androidx.collection.ArrayMap<K, V> */
    @Override // java.util.Map
    public void putAll(Map map) {
        c(this.f2346d + map.size());
        for (Map.Entry entry : map.entrySet()) {
            put(entry.getKey(), entry.getValue());
        }
    }

    /* JADX WARN: Generic types in debug info not equals: k.b != androidx.collection.ArrayMap<K, V> */
    public boolean n(Collection collection) {
        return m.p(this, collection);
    }

    /* JADX WARN: Generic types in debug info not equals: k.b != androidx.collection.ArrayMap<K, V> */
    @Override // java.util.Map
    public Set entrySet() {
        return m().l();
    }

    /* JADX WARN: Generic types in debug info not equals: k.b != androidx.collection.ArrayMap<K, V> */
    @Override // java.util.Map
    public Set keySet() {
        return m().m();
    }

    /* JADX WARN: Generic types in debug info not equals: k.b != androidx.collection.ArrayMap<K, V> */
    @Override // java.util.Map
    public Collection values() {
        return m().n();
    }
}
