package k;

import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;

/* JADX WARN: Classes with same name are omitted:
  
 */
/* loaded from: classes.dex */
public final class k implements Iterator, Map.Entry {

    /* renamed from: b  reason: collision with root package name */
    public int f2332b;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ m f2335e;

    /* renamed from: d  reason: collision with root package name */
    public boolean f2334d = false;

    /* renamed from: c  reason: collision with root package name */
    public int f2333c = -1;

    /* JADX WARN: Generic types in debug info not equals: k.k != androidx.collection.MapCollections<K, V>$MapIterator */
    @Override // java.util.Iterator
    public /* bridge */ /* synthetic */ Object next() {
        a();
        return this;
    }

    /* JADX WARN: Generic types in debug info not equals: k.k != androidx.collection.MapCollections<K, V>$MapIterator */
    public k(m this$0) {
        this.f2335e = this$0;
        this.f2332b = this$0.d() - 1;
    }

    /* JADX WARN: Generic types in debug info not equals: k.k != androidx.collection.MapCollections<K, V>$MapIterator */
    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f2333c < this.f2332b;
    }

    /* JADX WARN: Generic types in debug info not equals: k.k != androidx.collection.MapCollections<K, V>$MapIterator */
    public Map.Entry a() {
        if (hasNext()) {
            this.f2333c++;
            this.f2334d = true;
            return this;
        }
        throw new NoSuchElementException();
    }

    /* JADX WARN: Generic types in debug info not equals: k.k != androidx.collection.MapCollections<K, V>$MapIterator */
    @Override // java.util.Iterator
    public void remove() {
        if (this.f2334d) {
            this.f2335e.h(this.f2333c);
            this.f2333c--;
            this.f2332b--;
            this.f2334d = false;
            return;
        }
        throw new IllegalStateException();
    }

    /* JADX WARN: Generic types in debug info not equals: k.k != androidx.collection.MapCollections<K, V>$MapIterator */
    @Override // java.util.Map.Entry
    public Object getKey() {
        if (this.f2334d) {
            return this.f2335e.b(this.f2333c, 0);
        }
        throw new IllegalStateException("This container does not support retaining Map.Entry objects");
    }

    /* JADX WARN: Generic types in debug info not equals: k.k != androidx.collection.MapCollections<K, V>$MapIterator */
    @Override // java.util.Map.Entry
    public Object getValue() {
        if (this.f2334d) {
            return this.f2335e.b(this.f2333c, 1);
        }
        throw new IllegalStateException("This container does not support retaining Map.Entry objects");
    }

    /* JADX WARN: Generic types in debug info not equals: k.k != androidx.collection.MapCollections<K, V>$MapIterator */
    @Override // java.util.Map.Entry
    public Object setValue(Object obj) {
        if (this.f2334d) {
            return this.f2335e.i(this.f2333c, obj);
        }
        throw new IllegalStateException("This container does not support retaining Map.Entry objects");
    }

    /* JADX WARN: Generic types in debug info not equals: k.k != androidx.collection.MapCollections<K, V>$MapIterator */
    @Override // java.util.Map.Entry
    public boolean equals(Object o2) {
        if (!this.f2334d) {
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        } else if (!(o2 instanceof Map.Entry)) {
            return false;
        } else {
            Map.Entry<?, ?> e2 = (Map.Entry) o2;
            return e.c(e2.getKey(), this.f2335e.b(this.f2333c, 0)) && e.c(e2.getValue(), this.f2335e.b(this.f2333c, 1));
        }
    }

    /* JADX WARN: Generic types in debug info not equals: k.k != androidx.collection.MapCollections<K, V>$MapIterator */
    @Override // java.util.Map.Entry
    public int hashCode() {
        if (this.f2334d) {
            int i2 = 0;
            Object key = this.f2335e.b(this.f2333c, 0);
            Object value = this.f2335e.b(this.f2333c, 1);
            int hashCode = key == null ? 0 : key.hashCode();
            if (value != null) {
                i2 = value.hashCode();
            }
            return i2 ^ hashCode;
        }
        throw new IllegalStateException("This container does not support retaining Map.Entry objects");
    }

    /* JADX WARN: Generic types in debug info not equals: k.k != androidx.collection.MapCollections<K, V>$MapIterator */
    public String toString() {
        return getKey() + "=" + getValue();
    }
}
