package j;

import java.util.Iterator;
import java.util.Map;

/* JADX WARN: Classes with same name are omitted:
  
 */
/* loaded from: classes.dex */
public abstract class f implements Iterator, g {

    /* renamed from: b  reason: collision with root package name */
    public d f2276b;

    /* renamed from: c  reason: collision with root package name */
    public d f2277c;

    public abstract d b(d dVar);

    public abstract d c(d dVar);

    /* JADX WARN: Generic types in debug info not equals: j.d != androidx.arch.core.internal.SafeIterableMap$Entry<K, V> */
    /* JADX WARN: Generic types in debug info not equals: j.f != androidx.arch.core.internal.SafeIterableMap$ListIterator<K, V> */
    public f(d dVar, d dVar2) {
        this.f2276b = dVar2;
        this.f2277c = dVar;
    }

    /* JADX WARN: Generic types in debug info not equals: j.f != androidx.arch.core.internal.SafeIterableMap$ListIterator<K, V> */
    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f2277c != null;
    }

    /* JADX WARN: Generic types in debug info not equals: j.d != androidx.arch.core.internal.SafeIterableMap$Entry<K, V> */
    /* JADX WARN: Generic types in debug info not equals: j.f != androidx.arch.core.internal.SafeIterableMap$ListIterator<K, V> */
    @Override // j.g
    public void a(d dVar) {
        if (this.f2276b == dVar && dVar == this.f2277c) {
            this.f2277c = null;
            this.f2276b = null;
        }
        d dVar2 = this.f2276b;
        if (dVar2 == dVar) {
            this.f2276b = b(dVar2);
        }
        if (this.f2277c == dVar) {
            this.f2277c = e();
        }
    }

    /* JADX WARN: Generic types in debug info not equals: j.f != androidx.arch.core.internal.SafeIterableMap$ListIterator<K, V> */
    public final d e() {
        d dVar = this.f2277c;
        d dVar2 = this.f2276b;
        if (dVar == dVar2 || dVar2 == null) {
            return null;
        }
        return c(dVar);
    }

    /* JADX WARN: Generic types in debug info not equals: j.f != androidx.arch.core.internal.SafeIterableMap$ListIterator<K, V> */
    /* renamed from: d */
    public Map.Entry next() {
        d dVar = this.f2277c;
        this.f2277c = e();
        return dVar;
    }
}
