package k;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

/* JADX WARN: Classes with same name are omitted:
  
 */
/* loaded from: classes.dex */
public final class j implements Set {

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ m f2331b;

    /* JADX WARN: Generic types in debug info not equals: k.j != androidx.collection.MapCollections<K, V>$KeySet */
    public j(m this$0) {
        this.f2331b = this$0;
    }

    /* JADX WARN: Generic types in debug info not equals: k.j != androidx.collection.MapCollections<K, V>$KeySet */
    @Override // java.util.Set, java.util.Collection
    public boolean add(Object obj) {
        throw new UnsupportedOperationException();
    }

    /* JADX WARN: Generic types in debug info not equals: k.j != androidx.collection.MapCollections<K, V>$KeySet */
    @Override // java.util.Set, java.util.Collection
    public boolean addAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    /* JADX WARN: Generic types in debug info not equals: k.j != androidx.collection.MapCollections<K, V>$KeySet */
    @Override // java.util.Set, java.util.Collection
    public void clear() {
        this.f2331b.a();
    }

    /* JADX WARN: Generic types in debug info not equals: k.j != androidx.collection.MapCollections<K, V>$KeySet */
    @Override // java.util.Set, java.util.Collection
    public boolean contains(Object object) {
        return this.f2331b.e(object) >= 0;
    }

    /* JADX WARN: Generic types in debug info not equals: k.j != androidx.collection.MapCollections<K, V>$KeySet */
    @Override // java.util.Set, java.util.Collection
    public boolean containsAll(Collection collection) {
        return m.j(this.f2331b.c(), collection);
    }

    /* JADX WARN: Generic types in debug info not equals: k.j != androidx.collection.MapCollections<K, V>$KeySet */
    @Override // java.util.Set, java.util.Collection
    public boolean isEmpty() {
        return this.f2331b.d() == 0;
    }

    /* JADX WARN: Generic types in debug info not equals: k.j != androidx.collection.MapCollections<K, V>$KeySet */
    @Override // java.util.Set, java.util.Collection, java.lang.Iterable
    public Iterator iterator() {
        return new h(this.f2331b, 0);
    }

    /* JADX WARN: Generic types in debug info not equals: k.j != androidx.collection.MapCollections<K, V>$KeySet */
    @Override // java.util.Set, java.util.Collection
    public boolean remove(Object object) {
        int index = this.f2331b.e(object);
        if (index < 0) {
            return false;
        }
        this.f2331b.h(index);
        return true;
    }

    /* JADX WARN: Generic types in debug info not equals: k.j != androidx.collection.MapCollections<K, V>$KeySet */
    @Override // java.util.Set, java.util.Collection
    public boolean removeAll(Collection collection) {
        return m.o(this.f2331b.c(), collection);
    }

    /* JADX WARN: Generic types in debug info not equals: k.j != androidx.collection.MapCollections<K, V>$KeySet */
    @Override // java.util.Set, java.util.Collection
    public boolean retainAll(Collection collection) {
        return m.p(this.f2331b.c(), collection);
    }

    /* JADX WARN: Generic types in debug info not equals: k.j != androidx.collection.MapCollections<K, V>$KeySet */
    @Override // java.util.Set, java.util.Collection
    public int size() {
        return this.f2331b.d();
    }

    /* JADX WARN: Generic types in debug info not equals: k.j != androidx.collection.MapCollections<K, V>$KeySet */
    @Override // java.util.Set, java.util.Collection
    public Object[] toArray() {
        return this.f2331b.q(0);
    }

    /* JADX WARN: Generic types in debug info not equals: k.j != androidx.collection.MapCollections<K, V>$KeySet */
    @Override // java.util.Set, java.util.Collection
    public Object[] toArray(Object[] objArr) {
        return this.f2331b.r(objArr, 0);
    }

    /* JADX WARN: Generic types in debug info not equals: k.j != androidx.collection.MapCollections<K, V>$KeySet */
    @Override // java.util.Set, java.util.Collection
    public boolean equals(Object object) {
        return m.k(this, object);
    }

    /* JADX WARN: Generic types in debug info not equals: k.j != androidx.collection.MapCollections<K, V>$KeySet */
    @Override // java.util.Set, java.util.Collection
    public int hashCode() {
        int result = 0;
        for (int i2 = this.f2331b.d() - 1; i2 >= 0; i2--) {
            int i3 = 0;
            Object obj = this.f2331b.b(i2, 0);
            if (obj != null) {
                i3 = obj.hashCode();
            }
            result += i3;
        }
        return result;
    }
}
