package k;

/* JADX WARN: Classes with same name are omitted:
  
 */
/* loaded from: classes.dex */
public class f implements Cloneable {

    /* renamed from: f  reason: collision with root package name */
    public static final Object f2312f = new Object();

    /* renamed from: b  reason: collision with root package name */
    public boolean f2313b;

    /* renamed from: c  reason: collision with root package name */
    public long[] f2314c;

    /* renamed from: d  reason: collision with root package name */
    public Object[] f2315d;

    /* renamed from: e  reason: collision with root package name */
    public int f2316e;

    /* JADX WARN: Generic types in debug info not equals: k.f != androidx.collection.LongSparseArray<E> */
    public f() {
        this(10);
    }

    /* JADX WARN: Generic types in debug info not equals: k.f != androidx.collection.LongSparseArray<E> */
    public f(int initialCapacity) {
        this.f2313b = false;
        if (initialCapacity == 0) {
            this.f2314c = e.f2310b;
            this.f2315d = e.f2311c;
            return;
        }
        int initialCapacity2 = e.f(initialCapacity);
        this.f2314c = new long[initialCapacity2];
        this.f2315d = new Object[initialCapacity2];
    }

    /* JADX WARN: Generic types in debug info not equals: k.f != androidx.collection.LongSparseArray<E> */
    /* renamed from: b */
    public f clone() {
        try {
            f fVar = (f) super.clone();
            fVar.f2314c = (long[]) this.f2314c.clone();
            fVar.f2315d = (Object[]) this.f2315d.clone();
            return fVar;
        } catch (CloneNotSupportedException e2) {
            throw new AssertionError(e2);
        }
    }

    /* JADX WARN: Generic types in debug info not equals: k.f != androidx.collection.LongSparseArray<E> */
    public Object d(long key) {
        return e(key, null);
    }

    /* JADX WARN: Generic types in debug info not equals: k.f != androidx.collection.LongSparseArray<E> */
    public Object e(long key, Object obj) {
        int i2 = e.b(this.f2314c, this.f2316e, key);
        if (i2 >= 0) {
            Object[] objArr = this.f2315d;
            if (objArr[i2] != f2312f) {
                return objArr[i2];
            }
        }
        return obj;
    }

    /* JADX WARN: Generic types in debug info not equals: k.f != androidx.collection.LongSparseArray<E> */
    public void h(long key) {
        int i2 = e.b(this.f2314c, this.f2316e, key);
        if (i2 >= 0) {
            Object[] objArr = this.f2315d;
            Object obj = objArr[i2];
            Object obj2 = f2312f;
            if (obj != obj2) {
                objArr[i2] = obj2;
                this.f2313b = true;
            }
        }
    }

    /* JADX WARN: Generic types in debug info not equals: k.f != androidx.collection.LongSparseArray<E> */
    public void i(int index) {
        Object[] objArr = this.f2315d;
        Object obj = objArr[index];
        Object obj2 = f2312f;
        if (obj != obj2) {
            objArr[index] = obj2;
            this.f2313b = true;
        }
    }

    /* JADX WARN: Generic types in debug info not equals: k.f != androidx.collection.LongSparseArray<E> */
    public final void c() {
        int n2 = this.f2316e;
        int o2 = 0;
        long[] keys = this.f2314c;
        Object[] values = this.f2315d;
        for (int i2 = 0; i2 < n2; i2++) {
            Object val = values[i2];
            if (val != f2312f) {
                if (i2 != o2) {
                    keys[o2] = keys[i2];
                    values[o2] = val;
                    values[i2] = null;
                }
                o2++;
            }
        }
        this.f2313b = false;
        this.f2316e = o2;
    }

    /* JADX WARN: Generic types in debug info not equals: k.f != androidx.collection.LongSparseArray<E> */
    public void g(long key, Object obj) {
        int i2 = e.b(this.f2314c, this.f2316e, key);
        if (i2 >= 0) {
            this.f2315d[i2] = obj;
            return;
        }
        int i3 = ~i2;
        int i4 = this.f2316e;
        if (i3 < i4) {
            Object[] objArr = this.f2315d;
            if (objArr[i3] == f2312f) {
                this.f2314c[i3] = key;
                objArr[i3] = obj;
                return;
            }
        }
        if (this.f2313b && i4 >= this.f2314c.length) {
            c();
            i3 = ~e.b(this.f2314c, this.f2316e, key);
        }
        int i5 = this.f2316e;
        if (i5 >= this.f2314c.length) {
            int n2 = e.f(i5 + 1);
            long[] nkeys = new long[n2];
            Object[] nvalues = new Object[n2];
            long[] jArr = this.f2314c;
            System.arraycopy(jArr, 0, nkeys, 0, jArr.length);
            Object[] objArr2 = this.f2315d;
            System.arraycopy(objArr2, 0, nvalues, 0, objArr2.length);
            this.f2314c = nkeys;
            this.f2315d = nvalues;
        }
        int n3 = this.f2316e;
        if (n3 - i3 != 0) {
            long[] jArr2 = this.f2314c;
            System.arraycopy(jArr2, i3, jArr2, i3 + 1, n3 - i3);
            Object[] objArr3 = this.f2315d;
            System.arraycopy(objArr3, i3, objArr3, i3 + 1, this.f2316e - i3);
        }
        this.f2314c[i3] = key;
        this.f2315d[i3] = obj;
        this.f2316e++;
    }

    /* JADX WARN: Generic types in debug info not equals: k.f != androidx.collection.LongSparseArray<E> */
    public int j() {
        if (this.f2313b) {
            c();
        }
        return this.f2316e;
    }

    /* JADX WARN: Generic types in debug info not equals: k.f != androidx.collection.LongSparseArray<E> */
    public long f(int index) {
        if (this.f2313b) {
            c();
        }
        return this.f2314c[index];
    }

    /* JADX WARN: Generic types in debug info not equals: k.f != androidx.collection.LongSparseArray<E> */
    public Object k(int index) {
        if (this.f2313b) {
            c();
        }
        return this.f2315d[index];
    }

    /* JADX WARN: Generic types in debug info not equals: k.f != androidx.collection.LongSparseArray<E> */
    public void a() {
        int n2 = this.f2316e;
        Object[] values = this.f2315d;
        for (int i2 = 0; i2 < n2; i2++) {
            values[i2] = null;
        }
        this.f2316e = 0;
        this.f2313b = false;
    }

    /* JADX WARN: Generic types in debug info not equals: k.f != androidx.collection.LongSparseArray<E> */
    public String toString() {
        if (j() <= 0) {
            return "{}";
        }
        StringBuilder buffer = new StringBuilder(this.f2316e * 28);
        buffer.append('{');
        for (int i2 = 0; i2 < this.f2316e; i2++) {
            if (i2 > 0) {
                buffer.append(", ");
            }
            long key = f(i2);
            buffer.append(key);
            buffer.append('=');
            Object value = k(i2);
            if (value != this) {
                buffer.append(value);
            } else {
                buffer.append("(this Map)");
            }
        }
        buffer.append('}');
        return buffer.toString();
    }
}
