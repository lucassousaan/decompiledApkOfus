package k;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

/* JADX WARN: Classes with same name are omitted:
  
 */
/* loaded from: classes.dex */
public final class d implements Collection, Set {

    /* renamed from: f  reason: collision with root package name */
    public static final int[] f2299f = new int[0];

    /* renamed from: g  reason: collision with root package name */
    public static final Object[] f2300g = new Object[0];

    /* renamed from: h  reason: collision with root package name */
    public static Object[] f2301h;

    /* renamed from: i  reason: collision with root package name */
    public static int f2302i;

    /* renamed from: j  reason: collision with root package name */
    public static Object[] f2303j;

    /* renamed from: k  reason: collision with root package name */
    public static int f2304k;

    /* renamed from: b  reason: collision with root package name */
    public int[] f2305b;

    /* renamed from: c  reason: collision with root package name */
    public Object[] f2306c;

    /* renamed from: d  reason: collision with root package name */
    public int f2307d;

    /* renamed from: e  reason: collision with root package name */
    public m f2308e;

    /* JADX WARN: Generic types in debug info not equals: k.d != androidx.collection.ArraySet<E> */
    public final int f(Object key, int hash) {
        int N = this.f2307d;
        if (N == 0) {
            return -1;
        }
        int index = e.a(this.f2305b, N, hash);
        if (index < 0) {
            return index;
        }
        if (key.equals(this.f2306c[index])) {
            return index;
        }
        int end = index + 1;
        while (end < N && this.f2305b[end] == hash) {
            if (key.equals(this.f2306c[end])) {
                return end;
            }
            end++;
        }
        for (int i2 = index - 1; i2 >= 0 && this.f2305b[i2] == hash; i2--) {
            if (key.equals(this.f2306c[i2])) {
                return i2;
            }
        }
        int i3 = ~end;
        return i3;
    }

    /* JADX WARN: Generic types in debug info not equals: k.d != androidx.collection.ArraySet<E> */
    public final int g() {
        int N = this.f2307d;
        if (N == 0) {
            return -1;
        }
        int index = e.a(this.f2305b, N, 0);
        if (index < 0) {
            return index;
        }
        if (this.f2306c[index] == null) {
            return index;
        }
        int end = index + 1;
        while (end < N && this.f2305b[end] == 0) {
            if (this.f2306c[end] == null) {
                return end;
            }
            end++;
        }
        for (int i2 = index - 1; i2 >= 0 && this.f2305b[i2] == 0; i2--) {
            if (this.f2306c[i2] == null) {
                return i2;
            }
        }
        int i3 = ~end;
        return i3;
    }

    /* JADX WARN: Generic types in debug info not equals: k.d != androidx.collection.ArraySet<E> */
    public final void a(int size) {
        if (size == 8) {
            synchronized (d.class) {
                Object[] array = f2303j;
                if (array != null) {
                    this.f2306c = array;
                    f2303j = (Object[]) array[0];
                    this.f2305b = (int[]) array[1];
                    array[1] = null;
                    array[0] = null;
                    f2304k--;
                    return;
                }
            }
        } else if (size == 4) {
            synchronized (d.class) {
                Object[] array2 = f2301h;
                if (array2 != null) {
                    this.f2306c = array2;
                    f2301h = (Object[]) array2[0];
                    this.f2305b = (int[]) array2[1];
                    array2[1] = null;
                    array2[0] = null;
                    f2302i--;
                    return;
                }
            }
        }
        this.f2305b = new int[size];
        this.f2306c = new Object[size];
    }

    public static void c(int[] hashes, Object[] array, int size) {
        if (hashes.length == 8) {
            synchronized (d.class) {
                if (f2304k < 10) {
                    array[0] = f2303j;
                    array[1] = hashes;
                    for (int i2 = size - 1; i2 >= 2; i2--) {
                        array[i2] = null;
                    }
                    f2303j = array;
                    f2304k++;
                }
            }
        } else if (hashes.length == 4) {
            synchronized (d.class) {
                if (f2302i < 10) {
                    array[0] = f2301h;
                    array[1] = hashes;
                    for (int i3 = size - 1; i3 >= 2; i3--) {
                        array[i3] = null;
                    }
                    f2301h = array;
                    f2302i++;
                }
            }
        }
    }

    /* JADX WARN: Generic types in debug info not equals: k.d != androidx.collection.ArraySet<E> */
    public d() {
        this(0);
    }

    /* JADX WARN: Generic types in debug info not equals: k.d != androidx.collection.ArraySet<E> */
    public d(int capacity) {
        if (capacity == 0) {
            this.f2305b = f2299f;
            this.f2306c = f2300g;
        } else {
            a(capacity);
        }
        this.f2307d = 0;
    }

    /* JADX WARN: Generic types in debug info not equals: k.d != androidx.collection.ArraySet<E> */
    @Override // java.util.Collection, java.util.Set
    public void clear() {
        int i2 = this.f2307d;
        if (i2 != 0) {
            c(this.f2305b, this.f2306c, i2);
            this.f2305b = f2299f;
            this.f2306c = f2300g;
            this.f2307d = 0;
        }
    }

    /* JADX WARN: Generic types in debug info not equals: k.d != androidx.collection.ArraySet<E> */
    public void b(int minimumCapacity) {
        if (this.f2305b.length < minimumCapacity) {
            int[] ohashes = this.f2305b;
            Object[] oarray = this.f2306c;
            a(minimumCapacity);
            int i2 = this.f2307d;
            if (i2 > 0) {
                System.arraycopy(ohashes, 0, this.f2305b, 0, i2);
                System.arraycopy(oarray, 0, this.f2306c, 0, this.f2307d);
            }
            c(ohashes, oarray, this.f2307d);
        }
    }

    /* JADX WARN: Generic types in debug info not equals: k.d != androidx.collection.ArraySet<E> */
    @Override // java.util.Collection, java.util.Set
    public boolean contains(Object key) {
        return e(key) >= 0;
    }

    /* JADX WARN: Generic types in debug info not equals: k.d != androidx.collection.ArraySet<E> */
    public int e(Object key) {
        return key == null ? g() : f(key, key.hashCode());
    }

    /* JADX WARN: Generic types in debug info not equals: k.d != androidx.collection.ArraySet<E> */
    public Object i(int index) {
        return this.f2306c[index];
    }

    /* JADX WARN: Generic types in debug info not equals: k.d != androidx.collection.ArraySet<E> */
    @Override // java.util.Collection, java.util.Set
    public boolean isEmpty() {
        return this.f2307d <= 0;
    }

    /* JADX WARN: Generic types in debug info not equals: k.d != androidx.collection.ArraySet<E> */
    @Override // java.util.Collection, java.util.Set
    public boolean add(Object obj) {
        int index;
        int hash;
        if (obj == null) {
            hash = 0;
            index = g();
        } else {
            hash = obj.hashCode();
            index = f(obj, hash);
        }
        if (index >= 0) {
            return false;
        }
        int index2 = ~index;
        int i2 = this.f2307d;
        if (i2 >= this.f2305b.length) {
            int n2 = 4;
            if (i2 >= 8) {
                n2 = (i2 >> 1) + i2;
            } else if (i2 >= 4) {
                n2 = 8;
            }
            int[] ohashes = this.f2305b;
            Object[] oarray = this.f2306c;
            a(n2);
            int[] iArr = this.f2305b;
            if (iArr.length > 0) {
                System.arraycopy(ohashes, 0, iArr, 0, ohashes.length);
                System.arraycopy(oarray, 0, this.f2306c, 0, oarray.length);
            }
            c(ohashes, oarray, this.f2307d);
        }
        int i3 = this.f2307d;
        if (index2 < i3) {
            int[] iArr2 = this.f2305b;
            System.arraycopy(iArr2, index2, iArr2, index2 + 1, i3 - index2);
            Object[] objArr = this.f2306c;
            System.arraycopy(objArr, index2, objArr, index2 + 1, this.f2307d - index2);
        }
        this.f2305b[index2] = hash;
        this.f2306c[index2] = obj;
        this.f2307d++;
        return true;
    }

    /* JADX WARN: Generic types in debug info not equals: k.d != androidx.collection.ArraySet<E> */
    @Override // java.util.Collection, java.util.Set
    public boolean remove(Object object) {
        int index = e(object);
        if (index < 0) {
            return false;
        }
        h(index);
        return true;
    }

    /* JADX WARN: Generic types in debug info not equals: k.d != androidx.collection.ArraySet<E> */
    public Object h(int index) {
        Object[] objArr = this.f2306c;
        Object old = objArr[index];
        int i2 = this.f2307d;
        if (i2 <= 1) {
            c(this.f2305b, objArr, i2);
            this.f2305b = f2299f;
            this.f2306c = f2300g;
            this.f2307d = 0;
        } else {
            int[] iArr = this.f2305b;
            int n2 = 8;
            if (iArr.length <= 8 || i2 >= iArr.length / 3) {
                int i3 = i2 - 1;
                this.f2307d = i3;
                if (index < i3) {
                    System.arraycopy(iArr, index + 1, iArr, index, i3 - index);
                    Object[] objArr2 = this.f2306c;
                    System.arraycopy(objArr2, index + 1, objArr2, index, this.f2307d - index);
                }
                this.f2306c[this.f2307d] = null;
            } else {
                if (i2 > 8) {
                    n2 = i2 + (i2 >> 1);
                }
                int[] ohashes = this.f2305b;
                Object[] oarray = this.f2306c;
                a(n2);
                this.f2307d--;
                if (index > 0) {
                    System.arraycopy(ohashes, 0, this.f2305b, 0, index);
                    System.arraycopy(oarray, 0, this.f2306c, 0, index);
                }
                int i4 = this.f2307d;
                if (index < i4) {
                    System.arraycopy(ohashes, index + 1, this.f2305b, index, i4 - index);
                    System.arraycopy(oarray, index + 1, this.f2306c, index, this.f2307d - index);
                }
            }
        }
        return old;
    }

    /* JADX WARN: Generic types in debug info not equals: k.d != androidx.collection.ArraySet<E> */
    @Override // java.util.Collection, java.util.Set
    public int size() {
        return this.f2307d;
    }

    /* JADX WARN: Generic types in debug info not equals: k.d != androidx.collection.ArraySet<E> */
    @Override // java.util.Collection, java.util.Set
    public Object[] toArray() {
        int i2 = this.f2307d;
        Object[] result = new Object[i2];
        System.arraycopy(this.f2306c, 0, result, 0, i2);
        return result;
    }

    /* JADX WARN: Generic types in debug info not equals: k.d != androidx.collection.ArraySet<E> */
    @Override // java.util.Collection, java.util.Set
    public Object[] toArray(Object[] objArr) {
        if (objArr.length < this.f2307d) {
            objArr = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), this.f2307d);
        }
        System.arraycopy(this.f2306c, 0, objArr, 0, this.f2307d);
        int length = objArr.length;
        int i2 = this.f2307d;
        if (length > i2) {
            objArr[i2] = null;
        }
        return objArr;
    }

    /* JADX WARN: Generic types in debug info not equals: k.d != androidx.collection.ArraySet<E> */
    @Override // java.util.Collection, java.util.Set
    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (!(object instanceof Set)) {
            return false;
        }
        Set<?> set = (Set) object;
        if (size() != set.size()) {
            return false;
        }
        for (int i2 = 0; i2 < this.f2307d; i2++) {
            try {
                if (!set.contains(i(i2))) {
                    return false;
                }
            } catch (ClassCastException e2) {
                return false;
            } catch (NullPointerException e3) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Generic types in debug info not equals: k.d != androidx.collection.ArraySet<E> */
    @Override // java.util.Collection, java.util.Set
    public int hashCode() {
        int[] hashes = this.f2305b;
        int result = 0;
        int s2 = this.f2307d;
        for (int i2 = 0; i2 < s2; i2++) {
            result += hashes[i2];
        }
        return result;
    }

    /* JADX WARN: Generic types in debug info not equals: k.d != androidx.collection.ArraySet<E> */
    public String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder buffer = new StringBuilder(this.f2307d * 14);
        buffer.append('{');
        for (int i2 = 0; i2 < this.f2307d; i2++) {
            if (i2 > 0) {
                buffer.append(", ");
            }
            Object value = i(i2);
            if (value != this) {
                buffer.append(value);
            } else {
                buffer.append("(this Set)");
            }
        }
        buffer.append('}');
        return buffer.toString();
    }

    /* JADX WARN: Generic types in debug info not equals: k.d != androidx.collection.ArraySet<E> */
    public final m d() {
        if (this.f2308e == null) {
            this.f2308e = new c(this);
        }
        return this.f2308e;
    }

    /* JADX WARN: Generic types in debug info not equals: k.d != androidx.collection.ArraySet<E> */
    @Override // java.util.Collection, java.lang.Iterable, java.util.Set
    public Iterator iterator() {
        return ((j) d().m()).iterator();
    }

    /* JADX WARN: Generic types in debug info not equals: k.d != androidx.collection.ArraySet<E> */
    @Override // java.util.Collection, java.util.Set
    public boolean containsAll(Collection collection) {
        for (Object item : collection) {
            if (!contains(item)) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Generic types in debug info not equals: k.d != androidx.collection.ArraySet<E> */
    @Override // java.util.Collection, java.util.Set
    public boolean addAll(Collection collection) {
        b(this.f2307d + collection.size());
        boolean added = false;
        for (Object obj : collection) {
            added |= add(obj);
        }
        return added;
    }

    /* JADX WARN: Generic types in debug info not equals: k.d != androidx.collection.ArraySet<E> */
    @Override // java.util.Collection, java.util.Set
    public boolean removeAll(Collection collection) {
        boolean removed = false;
        for (Object value : collection) {
            removed |= remove(value);
        }
        return removed;
    }

    /* JADX WARN: Generic types in debug info not equals: k.d != androidx.collection.ArraySet<E> */
    @Override // java.util.Collection, java.util.Set
    public boolean retainAll(Collection collection) {
        boolean removed = false;
        for (int i2 = this.f2307d - 1; i2 >= 0; i2--) {
            if (!collection.contains(this.f2306c[i2])) {
                h(i2);
                removed = true;
            }
        }
        return removed;
    }
}
