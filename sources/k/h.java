package k;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX WARN: Classes with same name are omitted:
  
 */
/* loaded from: classes.dex */
public final class h implements Iterator {

    /* renamed from: b  reason: collision with root package name */
    public final int f2325b;

    /* renamed from: c  reason: collision with root package name */
    public int f2326c;

    /* renamed from: d  reason: collision with root package name */
    public int f2327d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f2328e = false;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ m f2329f;

    /* JADX WARN: Generic types in debug info not equals: k.h != androidx.collection.MapCollections<K, V>$ArrayIterator<T> */
    public h(m this$0, int offset) {
        this.f2329f = this$0;
        this.f2325b = offset;
        this.f2326c = this$0.d();
    }

    /* JADX WARN: Generic types in debug info not equals: k.h != androidx.collection.MapCollections<K, V>$ArrayIterator<T> */
    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f2327d < this.f2326c;
    }

    /* JADX WARN: Generic types in debug info not equals: k.h != androidx.collection.MapCollections<K, V>$ArrayIterator<T> */
    @Override // java.util.Iterator
    public Object next() {
        if (hasNext()) {
            Object res = this.f2329f.b(this.f2327d, this.f2325b);
            this.f2327d++;
            this.f2328e = true;
            return res;
        }
        throw new NoSuchElementException();
    }

    /* JADX WARN: Generic types in debug info not equals: k.h != androidx.collection.MapCollections<K, V>$ArrayIterator<T> */
    @Override // java.util.Iterator
    public void remove() {
        if (this.f2328e) {
            int i2 = this.f2327d - 1;
            this.f2327d = i2;
            this.f2326c--;
            this.f2328e = false;
            this.f2329f.h(i2);
            return;
        }
        throw new IllegalStateException();
    }
}
