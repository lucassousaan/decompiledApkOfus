package j;

import java.util.Iterator;
import java.util.Map;

/* JADX WARN: Classes with same name are omitted:
  
 */
/* loaded from: classes.dex */
public class e implements Iterator, g {

    /* renamed from: b  reason: collision with root package name */
    public d f2273b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f2274c = true;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ h f2275d;

    /* JADX WARN: Generic types in debug info not equals: j.e != androidx.arch.core.internal.SafeIterableMap<K, V>$IteratorWithAdditions */
    public e(h hVar) {
        this.f2275d = hVar;
    }

    /* JADX WARN: Generic types in debug info not equals: j.d != androidx.arch.core.internal.SafeIterableMap$Entry<K, V> */
    /* JADX WARN: Generic types in debug info not equals: j.e != androidx.arch.core.internal.SafeIterableMap<K, V>$IteratorWithAdditions */
    @Override // j.g
    public void a(d dVar) {
        d dVar2 = this.f2273b;
        if (dVar == dVar2) {
            d dVar3 = dVar2.f2272e;
            this.f2273b = dVar3;
            this.f2274c = dVar3 == null;
        }
    }

    /* JADX WARN: Generic types in debug info not equals: j.e != androidx.arch.core.internal.SafeIterableMap<K, V>$IteratorWithAdditions */
    @Override // java.util.Iterator
    public boolean hasNext() {
        if (this.f2274c) {
            return this.f2275d.f2278b != null;
        }
        d dVar = this.f2273b;
        return (dVar == null || dVar.f2271d == null) ? false : true;
    }

    /* JADX WARN: Generic types in debug info not equals: j.e != androidx.arch.core.internal.SafeIterableMap<K, V>$IteratorWithAdditions */
    /* renamed from: b */
    public Map.Entry next() {
        if (this.f2274c) {
            this.f2274c = false;
            this.f2273b = this.f2275d.f2278b;
        } else {
            d dVar = this.f2273b;
            this.f2273b = dVar != null ? dVar.f2271d : null;
        }
        return this.f2273b;
    }
}
