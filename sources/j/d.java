package j;

import java.util.Map;

/* JADX WARN: Classes with same name are omitted:
  
 */
/* loaded from: classes.dex */
public class d implements Map.Entry {

    /* renamed from: b  reason: collision with root package name */
    public final Object f2269b;

    /* renamed from: c  reason: collision with root package name */
    public final Object f2270c;

    /* renamed from: d  reason: collision with root package name */
    public d f2271d;

    /* renamed from: e  reason: collision with root package name */
    public d f2272e;

    /* JADX WARN: Generic types in debug info not equals: j.d != androidx.arch.core.internal.SafeIterableMap$Entry<K, V> */
    public d(Object obj, Object obj2) {
        this.f2269b = obj;
        this.f2270c = obj2;
    }

    /* JADX WARN: Generic types in debug info not equals: j.d != androidx.arch.core.internal.SafeIterableMap$Entry<K, V> */
    @Override // java.util.Map.Entry
    public Object getKey() {
        return this.f2269b;
    }

    /* JADX WARN: Generic types in debug info not equals: j.d != androidx.arch.core.internal.SafeIterableMap$Entry<K, V> */
    @Override // java.util.Map.Entry
    public Object getValue() {
        return this.f2270c;
    }

    /* JADX WARN: Generic types in debug info not equals: j.d != androidx.arch.core.internal.SafeIterableMap$Entry<K, V> */
    @Override // java.util.Map.Entry
    public Object setValue(Object obj) {
        throw new UnsupportedOperationException("An entry modification is not supported");
    }

    /* JADX WARN: Generic types in debug info not equals: j.d != androidx.arch.core.internal.SafeIterableMap$Entry<K, V> */
    public String toString() {
        return this.f2269b + "=" + this.f2270c;
    }

    /* JADX WARN: Generic types in debug info not equals: j.d != androidx.arch.core.internal.SafeIterableMap$Entry<K, V> */
    @Override // java.util.Map.Entry
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d entry = (d) obj;
        return this.f2269b.equals(entry.f2269b) && this.f2270c.equals(entry.f2270c);
    }

    /* JADX WARN: Generic types in debug info not equals: j.d != androidx.arch.core.internal.SafeIterableMap$Entry<K, V> */
    @Override // java.util.Map.Entry
    public int hashCode() {
        return this.f2269b.hashCode() ^ this.f2270c.hashCode();
    }
}
