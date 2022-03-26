package k;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* JADX WARN: Classes with same name are omitted:
  
 */
/* loaded from: classes.dex */
public final class i implements Set {

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ m f2330b;

    /* JADX WARN: Generic types in debug info not equals: k.i != androidx.collection.MapCollections<K, V>$EntrySet */
    public i(m this$0) {
        this.f2330b = this$0;
    }

    /* JADX WARN: Generic types in debug info not equals: k.i != androidx.collection.MapCollections<K, V>$EntrySet */
    @Override // java.util.Set, java.util.Collection
    public /* bridge */ /* synthetic */ boolean add(Object obj) {
        Map.Entry entry = (Map.Entry) obj;
        a();
        throw null;
    }

    /* JADX WARN: Generic types in debug info not equals: k.i != androidx.collection.MapCollections<K, V>$EntrySet */
    public boolean a() {
        throw new UnsupportedOperationException();
    }

    /* JADX WARN: Generic types in debug info not equals: k.i != androidx.collection.MapCollections<K, V>$EntrySet */
    @Override // java.util.Set, java.util.Collection
    public boolean addAll(Collection collection) {
        int oldSize = this.f2330b.d();
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            this.f2330b.g(entry.getKey(), entry.getValue());
        }
        return oldSize != this.f2330b.d();
    }

    /* JADX WARN: Generic types in debug info not equals: k.i != androidx.collection.MapCollections<K, V>$EntrySet */
    @Override // java.util.Set, java.util.Collection
    public void clear() {
        this.f2330b.a();
    }

    /* JADX WARN: Generic types in debug info not equals: k.i != androidx.collection.MapCollections<K, V>$EntrySet */
    @Override // java.util.Set, java.util.Collection
    public boolean contains(Object o2) {
        if (!(o2 instanceof Map.Entry)) {
            return false;
        }
        Map.Entry<?, ?> e2 = (Map.Entry) o2;
        int index = this.f2330b.e(e2.getKey());
        if (index < 0) {
            return false;
        }
        Object foundVal = this.f2330b.b(index, 1);
        return e.c(foundVal, e2.getValue());
    }

    /* JADX WARN: Generic types in debug info not equals: k.i != androidx.collection.MapCollections<K, V>$EntrySet */
    @Override // java.util.Set, java.util.Collection
    public boolean containsAll(Collection collection) {
        for (Object obj : collection) {
            if (!contains(obj)) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Generic types in debug info not equals: k.i != androidx.collection.MapCollections<K, V>$EntrySet */
    @Override // java.util.Set, java.util.Collection
    public boolean isEmpty() {
        return this.f2330b.d() == 0;
    }

    /* JADX WARN: Generic types in debug info not equals: k.i != androidx.collection.MapCollections<K, V>$EntrySet */
    @Override // java.util.Set, java.util.Collection, java.lang.Iterable
    public Iterator iterator() {
        return new k(this.f2330b);
    }

    /* JADX WARN: Generic types in debug info not equals: k.i != androidx.collection.MapCollections<K, V>$EntrySet */
    @Override // java.util.Set, java.util.Collection
    public boolean remove(Object object) {
        throw new UnsupportedOperationException();
    }

    /* JADX WARN: Generic types in debug info not equals: k.i != androidx.collection.MapCollections<K, V>$EntrySet */
    @Override // java.util.Set, java.util.Collection
    public boolean removeAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    /* JADX WARN: Generic types in debug info not equals: k.i != androidx.collection.MapCollections<K, V>$EntrySet */
    @Override // java.util.Set, java.util.Collection
    public boolean retainAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    /* JADX WARN: Generic types in debug info not equals: k.i != androidx.collection.MapCollections<K, V>$EntrySet */
    @Override // java.util.Set, java.util.Collection
    public int size() {
        return this.f2330b.d();
    }

    /* JADX WARN: Generic types in debug info not equals: k.i != androidx.collection.MapCollections<K, V>$EntrySet */
    @Override // java.util.Set, java.util.Collection
    public Object[] toArray() {
        throw new UnsupportedOperationException();
    }

    /* JADX WARN: Generic types in debug info not equals: k.i != androidx.collection.MapCollections<K, V>$EntrySet */
    @Override // java.util.Set, java.util.Collection
    public Object[] toArray(Object[] objArr) {
        throw new UnsupportedOperationException();
    }

    /* JADX WARN: Generic types in debug info not equals: k.i != androidx.collection.MapCollections<K, V>$EntrySet */
    @Override // java.util.Set, java.util.Collection
    public boolean equals(Object object) {
        return m.k(this, object);
    }

    /* JADX WARN: Generic types in debug info not equals: k.i != androidx.collection.MapCollections<K, V>$EntrySet */
    @Override // java.util.Set, java.util.Collection
    public int hashCode() {
        int result = 0;
        for (int i2 = this.f2330b.d() - 1; i2 >= 0; i2--) {
            int i3 = 0;
            Object key = this.f2330b.b(i2, 0);
            Object value = this.f2330b.b(i2, 1);
            int hashCode = key == null ? 0 : key.hashCode();
            if (value != null) {
                i3 = value.hashCode();
            }
            result += i3 ^ hashCode;
        }
        return result;
    }
}
