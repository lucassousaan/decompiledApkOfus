package k;

/* JADX WARN: Classes with same name are omitted:
  
 */
/* loaded from: classes.dex */
public class o implements Cloneable {

    /* renamed from: f  reason: collision with root package name */
    public static final Object f2347f = new Object();

    /* renamed from: b  reason: collision with root package name */
    public boolean f2348b;

    /* renamed from: c  reason: collision with root package name */
    public int[] f2349c;

    /* renamed from: d  reason: collision with root package name */
    public Object[] f2350d;

    /* renamed from: e  reason: collision with root package name */
    public int f2351e;

    /* JADX WARN: Generic types in debug info not equals: k.o != androidx.collection.SparseArrayCompat<E> */
    public o() {
        this(10);
    }

    /* JADX WARN: Generic types in debug info not equals: k.o != androidx.collection.SparseArrayCompat<E> */
    public o(int initialCapacity) {
        this.f2348b = false;
        if (initialCapacity == 0) {
            this.f2349c = e.f2309a;
            this.f2350d = e.f2311c;
            return;
        }
        int initialCapacity2 = e.e(initialCapacity);
        this.f2349c = new int[initialCapacity2];
        this.f2350d = new Object[initialCapacity2];
    }

    /* JADX WARN: Generic types in debug info not equals: k.o != androidx.collection.SparseArrayCompat<E> */
    /* renamed from: c */
    public o clone() {
        try {
            o oVar = (o) super.clone();
            oVar.f2349c = (int[]) this.f2349c.clone();
            oVar.f2350d = (Object[]) this.f2350d.clone();
            return oVar;
        } catch (CloneNotSupportedException e2) {
            throw new AssertionError(e2);
        }
    }

    /* JADX WARN: Generic types in debug info not equals: k.o != androidx.collection.SparseArrayCompat<E> */
    public Object e(int key) {
        return f(key, null);
    }

    /* JADX WARN: Generic types in debug info not equals: k.o != androidx.collection.SparseArrayCompat<E> */
    public Object f(int key, Object obj) {
        int i2 = e.a(this.f2349c, this.f2351e, key);
        if (i2 >= 0) {
            Object[] objArr = this.f2350d;
            if (objArr[i2] != f2347f) {
                return objArr[i2];
            }
        }
        return obj;
    }

    /* JADX WARN: Generic types in debug info not equals: k.o != androidx.collection.SparseArrayCompat<E> */
    public final void d() {
        int n2 = this.f2351e;
        int o2 = 0;
        int[] keys = this.f2349c;
        Object[] values = this.f2350d;
        for (int i2 = 0; i2 < n2; i2++) {
            Object val = values[i2];
            if (val != f2347f) {
                if (i2 != o2) {
                    keys[o2] = keys[i2];
                    values[o2] = val;
                    values[i2] = null;
                }
                o2++;
            }
        }
        this.f2348b = false;
        this.f2351e = o2;
    }

    /* JADX WARN: Generic types in debug info not equals: k.o != androidx.collection.SparseArrayCompat<E> */
    public void i(int key, Object obj) {
        int i2 = e.a(this.f2349c, this.f2351e, key);
        if (i2 >= 0) {
            this.f2350d[i2] = obj;
            return;
        }
        int i3 = ~i2;
        int i4 = this.f2351e;
        if (i3 < i4) {
            Object[] objArr = this.f2350d;
            if (objArr[i3] == f2347f) {
                this.f2349c[i3] = key;
                objArr[i3] = obj;
                return;
            }
        }
        if (this.f2348b && i4 >= this.f2349c.length) {
            d();
            i3 = ~e.a(this.f2349c, this.f2351e, key);
        }
        int i5 = this.f2351e;
        if (i5 >= this.f2349c.length) {
            int n2 = e.e(i5 + 1);
            int[] nkeys = new int[n2];
            Object[] nvalues = new Object[n2];
            int[] iArr = this.f2349c;
            System.arraycopy(iArr, 0, nkeys, 0, iArr.length);
            Object[] objArr2 = this.f2350d;
            System.arraycopy(objArr2, 0, nvalues, 0, objArr2.length);
            this.f2349c = nkeys;
            this.f2350d = nvalues;
        }
        int n3 = this.f2351e;
        if (n3 - i3 != 0) {
            int[] iArr2 = this.f2349c;
            System.arraycopy(iArr2, i3, iArr2, i3 + 1, n3 - i3);
            Object[] objArr3 = this.f2350d;
            System.arraycopy(objArr3, i3, objArr3, i3 + 1, this.f2351e - i3);
        }
        this.f2349c[i3] = key;
        this.f2350d[i3] = obj;
        this.f2351e++;
    }

    /* JADX WARN: Generic types in debug info not equals: k.o != androidx.collection.SparseArrayCompat<E> */
    public int j() {
        if (this.f2348b) {
            d();
        }
        return this.f2351e;
    }

    /* JADX WARN: Generic types in debug info not equals: k.o != androidx.collection.SparseArrayCompat<E> */
    public int h(int index) {
        if (this.f2348b) {
            d();
        }
        return this.f2349c[index];
    }

    /* JADX WARN: Generic types in debug info not equals: k.o != androidx.collection.SparseArrayCompat<E> */
    public Object k(int index) {
        if (this.f2348b) {
            d();
        }
        return this.f2350d[index];
    }

    /* JADX WARN: Generic types in debug info not equals: k.o != androidx.collection.SparseArrayCompat<E> */
    public int g(Object obj) {
        if (this.f2348b) {
            d();
        }
        for (int i2 = 0; i2 < this.f2351e; i2++) {
            if (this.f2350d[i2] == obj) {
                return i2;
            }
        }
        return -1;
    }

    /* JADX WARN: Generic types in debug info not equals: k.o != androidx.collection.SparseArrayCompat<E> */
    public void b() {
        int n2 = this.f2351e;
        Object[] values = this.f2350d;
        for (int i2 = 0; i2 < n2; i2++) {
            values[i2] = null;
        }
        this.f2351e = 0;
        this.f2348b = false;
    }

    /* JADX WARN: Generic types in debug info not equals: k.o != androidx.collection.SparseArrayCompat<E> */
    public void a(int key, Object obj) {
        int i2 = this.f2351e;
        if (i2 == 0 || key > this.f2349c[i2 - 1]) {
            int pos = this.f2351e;
            if (pos >= this.f2349c.length) {
                int n2 = e.e(pos + 1);
                int[] nkeys = new int[n2];
                Object[] nvalues = new Object[n2];
                int[] iArr = this.f2349c;
                System.arraycopy(iArr, 0, nkeys, 0, iArr.length);
                Object[] objArr = this.f2350d;
                System.arraycopy(objArr, 0, nvalues, 0, objArr.length);
                this.f2349c = nkeys;
                this.f2350d = nvalues;
            }
            this.f2349c[pos] = key;
            this.f2350d[pos] = obj;
            this.f2351e = pos + 1;
            return;
        }
        i(key, obj);
    }

    /* JADX WARN: Generic types in debug info not equals: k.o != androidx.collection.SparseArrayCompat<E> */
    public String toString() {
        if (j() <= 0) {
            return "{}";
        }
        StringBuilder buffer = new StringBuilder(this.f2351e * 28);
        buffer.append('{');
        for (int i2 = 0; i2 < this.f2351e; i2++) {
            if (i2 > 0) {
                buffer.append(", ");
            }
            int key = h(i2);
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
