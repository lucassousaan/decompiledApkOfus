package k;

import java.util.Collection;
import java.util.Iterator;

/* JADX WARN: Classes with same name are omitted:
  
 */
/* loaded from: classes.dex */
public final class l implements Collection {

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ m f2336b;

    /* JADX WARN: Generic types in debug info not equals: k.l != androidx.collection.MapCollections<K, V>$ValuesCollection */
    public l(m this$0) {
        this.f2336b = this$0;
    }

    /* JADX WARN: Generic types in debug info not equals: k.l != androidx.collection.MapCollections<K, V>$ValuesCollection */
    @Override // java.util.Collection
    public boolean add(Object obj) {
        throw new UnsupportedOperationException();
    }

    /* JADX WARN: Generic types in debug info not equals: k.l != androidx.collection.MapCollections<K, V>$ValuesCollection */
    @Override // java.util.Collection
    public boolean addAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    /* JADX WARN: Generic types in debug info not equals: k.l != androidx.collection.MapCollections<K, V>$ValuesCollection */
    @Override // java.util.Collection
    public void clear() {
        this.f2336b.a();
    }

    /* JADX WARN: Generic types in debug info not equals: k.l != androidx.collection.MapCollections<K, V>$ValuesCollection */
    @Override // java.util.Collection
    public boolean contains(Object object) {
        return this.f2336b.f(object) >= 0;
    }

    /* JADX WARN: Generic types in debug info not equals: k.l != androidx.collection.MapCollections<K, V>$ValuesCollection */
    @Override // java.util.Collection
    public boolean containsAll(Collection collection) {
        for (Object obj : collection) {
            if (!contains(obj)) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Generic types in debug info not equals: k.l != androidx.collection.MapCollections<K, V>$ValuesCollection */
    @Override // java.util.Collection
    public boolean isEmpty() {
        return this.f2336b.d() == 0;
    }

    /* JADX WARN: Generic types in debug info not equals: k.l != androidx.collection.MapCollections<K, V>$ValuesCollection */
    @Override // java.util.Collection, java.lang.Iterable
    public Iterator iterator() {
        return new h(this.f2336b, 1);
    }

    /* JADX WARN: Generic types in debug info not equals: k.l != androidx.collection.MapCollections<K, V>$ValuesCollection */
    @Override // java.util.Collection
    public boolean remove(Object object) {
        int index = this.f2336b.f(object);
        if (index < 0) {
            return false;
        }
        this.f2336b.h(index);
        return true;
    }

    /* JADX WARN: Generic types in debug info not equals: k.l != androidx.collection.MapCollections<K, V>$ValuesCollection */
    @Override // java.util.Collection
    public boolean removeAll(Collection collection) {
        int N = this.f2336b.d();
        boolean changed = false;
        int i2 = 0;
        while (i2 < N) {
            Object cur = this.f2336b.b(i2, 1);
            if (collection.contains(cur)) {
                this.f2336b.h(i2);
                i2--;
                N--;
                changed = true;
            }
            i2++;
        }
        return changed;
    }

    /* JADX WARN: Generic types in debug info not equals: k.l != androidx.collection.MapCollections<K, V>$ValuesCollection */
    @Override // java.util.Collection
    public boolean retainAll(Collection collection) {
        int N = this.f2336b.d();
        boolean changed = false;
        int i2 = 0;
        while (i2 < N) {
            Object cur = this.f2336b.b(i2, 1);
            if (!collection.contains(cur)) {
                this.f2336b.h(i2);
                i2--;
                N--;
                changed = true;
            }
            i2++;
        }
        return changed;
    }

    /* JADX WARN: Generic types in debug info not equals: k.l != androidx.collection.MapCollections<K, V>$ValuesCollection */
    @Override // java.util.Collection
    public int size() {
        return this.f2336b.d();
    }

    /* JADX WARN: Generic types in debug info not equals: k.l != androidx.collection.MapCollections<K, V>$ValuesCollection */
    @Override // java.util.Collection
    public Object[] toArray() {
        return this.f2336b.q(1);
    }

    /* JADX WARN: Generic types in debug info not equals: k.l != androidx.collection.MapCollections<K, V>$ValuesCollection */
    @Override // java.util.Collection
    public Object[] toArray(Object[] objArr) {
        return this.f2336b.r(objArr, 1);
    }
}
