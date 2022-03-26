package k;

import java.util.ConcurrentModificationException;
import java.util.Map;

/* JADX WARN: Classes with same name are omitted:
  
 */
/* loaded from: classes.dex */
public class n {

    /* renamed from: e  reason: collision with root package name */
    public static Object[] f2340e;

    /* renamed from: f  reason: collision with root package name */
    public static int f2341f;

    /* renamed from: g  reason: collision with root package name */
    public static Object[] f2342g;

    /* renamed from: h  reason: collision with root package name */
    public static int f2343h;

    /* renamed from: b  reason: collision with root package name */
    public int[] f2344b = e.f2309a;

    /* renamed from: c  reason: collision with root package name */
    public Object[] f2345c = e.f2311c;

    /* renamed from: d  reason: collision with root package name */
    public int f2346d = 0;

    public static int b(int[] hashes, int N, int hash) {
        try {
            return e.a(hashes, N, hash);
        } catch (ArrayIndexOutOfBoundsException e2) {
            throw new ConcurrentModificationException();
        }
    }

    /* JADX WARN: Generic types in debug info not equals: k.n != androidx.collection.SimpleArrayMap<K, V> */
    public int e(Object key, int hash) {
        int N = this.f2346d;
        if (N == 0) {
            return -1;
        }
        int index = b(this.f2344b, N, hash);
        if (index < 0) {
            return index;
        }
        if (key.equals(this.f2345c[index << 1])) {
            return index;
        }
        int end = index + 1;
        while (end < N && this.f2344b[end] == hash) {
            if (key.equals(this.f2345c[end << 1])) {
                return end;
            }
            end++;
        }
        for (int i2 = index - 1; i2 >= 0 && this.f2344b[i2] == hash; i2--) {
            if (key.equals(this.f2345c[i2 << 1])) {
                return i2;
            }
        }
        int i3 = ~end;
        return i3;
    }

    /* JADX WARN: Generic types in debug info not equals: k.n != androidx.collection.SimpleArrayMap<K, V> */
    public int g() {
        int N = this.f2346d;
        if (N == 0) {
            return -1;
        }
        int index = b(this.f2344b, N, 0);
        if (index < 0) {
            return index;
        }
        if (this.f2345c[index << 1] == null) {
            return index;
        }
        int end = index + 1;
        while (end < N && this.f2344b[end] == 0) {
            if (this.f2345c[end << 1] == null) {
                return end;
            }
            end++;
        }
        for (int i2 = index - 1; i2 >= 0 && this.f2344b[i2] == 0; i2--) {
            if (this.f2345c[i2 << 1] == null) {
                return i2;
            }
        }
        int i3 = ~end;
        return i3;
    }

    /* JADX WARN: Generic types in debug info not equals: k.n != androidx.collection.SimpleArrayMap<K, V> */
    private void a(int size) {
        if (size == 8) {
            synchronized (n.class) {
                Object[] array = f2342g;
                if (array != null) {
                    this.f2345c = array;
                    f2342g = (Object[]) array[0];
                    this.f2344b = (int[]) array[1];
                    array[1] = null;
                    array[0] = null;
                    f2343h--;
                    return;
                }
            }
        } else if (size == 4) {
            synchronized (n.class) {
                Object[] array2 = f2340e;
                if (array2 != null) {
                    this.f2345c = array2;
                    f2340e = (Object[]) array2[0];
                    this.f2344b = (int[]) array2[1];
                    array2[1] = null;
                    array2[0] = null;
                    f2341f--;
                    return;
                }
            }
        }
        this.f2344b = new int[size];
        this.f2345c = new Object[size << 1];
    }

    public static void d(int[] hashes, Object[] array, int size) {
        if (hashes.length == 8) {
            synchronized (n.class) {
                if (f2343h < 10) {
                    array[0] = f2342g;
                    array[1] = hashes;
                    for (int i2 = (size << 1) - 1; i2 >= 2; i2--) {
                        array[i2] = null;
                    }
                    f2342g = array;
                    f2343h++;
                }
            }
        } else if (hashes.length == 4) {
            synchronized (n.class) {
                if (f2341f < 10) {
                    array[0] = f2340e;
                    array[1] = hashes;
                    for (int i3 = (size << 1) - 1; i3 >= 2; i3--) {
                        array[i3] = null;
                    }
                    f2340e = array;
                    f2341f++;
                }
            }
        }
    }

    /* JADX WARN: Generic types in debug info not equals: k.n != androidx.collection.SimpleArrayMap<K, V> */
    public void clear() {
        if (this.f2346d > 0) {
            int[] ohashes = this.f2344b;
            Object[] oarray = this.f2345c;
            int osize = this.f2346d;
            this.f2344b = e.f2309a;
            this.f2345c = e.f2311c;
            this.f2346d = 0;
            d(ohashes, oarray, osize);
        }
        if (this.f2346d > 0) {
            throw new ConcurrentModificationException();
        }
    }

    /* JADX WARN: Generic types in debug info not equals: k.n != androidx.collection.SimpleArrayMap<K, V> */
    public void c(int minimumCapacity) {
        int osize = this.f2346d;
        if (this.f2344b.length < minimumCapacity) {
            int[] ohashes = this.f2344b;
            Object[] oarray = this.f2345c;
            a(minimumCapacity);
            if (this.f2346d > 0) {
                System.arraycopy(ohashes, 0, this.f2344b, 0, osize);
                System.arraycopy(oarray, 0, this.f2345c, 0, osize << 1);
            }
            d(ohashes, oarray, osize);
        }
        if (this.f2346d != osize) {
            throw new ConcurrentModificationException();
        }
    }

    /* JADX WARN: Generic types in debug info not equals: k.n != androidx.collection.SimpleArrayMap<K, V> */
    public boolean containsKey(Object key) {
        return f(key) >= 0;
    }

    /* JADX WARN: Generic types in debug info not equals: k.n != androidx.collection.SimpleArrayMap<K, V> */
    public int f(Object key) {
        return key == null ? g() : e(key, key.hashCode());
    }

    /* JADX WARN: Generic types in debug info not equals: k.n != androidx.collection.SimpleArrayMap<K, V> */
    public int h(Object value) {
        int N = this.f2346d * 2;
        Object[] array = this.f2345c;
        if (value == null) {
            for (int i2 = 1; i2 < N; i2 += 2) {
                if (array[i2] == null) {
                    return i2 >> 1;
                }
            }
            return -1;
        }
        for (int i3 = 1; i3 < N; i3 += 2) {
            if (value.equals(array[i3])) {
                return i3 >> 1;
            }
        }
        return -1;
    }

    /* JADX WARN: Generic types in debug info not equals: k.n != androidx.collection.SimpleArrayMap<K, V> */
    public boolean containsValue(Object value) {
        return h(value) >= 0;
    }

    /* JADX WARN: Generic types in debug info not equals: k.n != androidx.collection.SimpleArrayMap<K, V> */
    public Object get(Object key) {
        return getOrDefault(key, null);
    }

    /* JADX WARN: Generic types in debug info not equals: k.n != androidx.collection.SimpleArrayMap<K, V> */
    public Object getOrDefault(Object key, Object obj) {
        int index = f(key);
        return index >= 0 ? this.f2345c[(index << 1) + 1] : obj;
    }

    /* JADX WARN: Generic types in debug info not equals: k.n != androidx.collection.SimpleArrayMap<K, V> */
    public Object i(int index) {
        return this.f2345c[index << 1];
    }

    /* JADX WARN: Generic types in debug info not equals: k.n != androidx.collection.SimpleArrayMap<K, V> */
    public Object l(int index) {
        return this.f2345c[(index << 1) + 1];
    }

    /* JADX WARN: Generic types in debug info not equals: k.n != androidx.collection.SimpleArrayMap<K, V> */
    public Object k(int index, Object obj) {
        int index2 = (index << 1) + 1;
        Object[] objArr = this.f2345c;
        Object obj2 = objArr[index2];
        objArr[index2] = obj;
        return obj2;
    }

    /* JADX WARN: Generic types in debug info not equals: k.n != androidx.collection.SimpleArrayMap<K, V> */
    public boolean isEmpty() {
        return this.f2346d <= 0;
    }

    /* JADX WARN: Generic types in debug info not equals: k.n != androidx.collection.SimpleArrayMap<K, V> */
    public Object put(Object obj, Object obj2) {
        int index;
        int hash;
        int osize = this.f2346d;
        if (obj == null) {
            hash = 0;
            index = g();
        } else {
            hash = obj.hashCode();
            index = e(obj, hash);
        }
        if (index >= 0) {
            int index2 = (index << 1) + 1;
            Object[] objArr = this.f2345c;
            Object obj3 = objArr[index2];
            objArr[index2] = obj2;
            return obj3;
        }
        int index3 = ~index;
        if (osize >= this.f2344b.length) {
            int n2 = 4;
            if (osize >= 8) {
                n2 = (osize >> 1) + osize;
            } else if (osize >= 4) {
                n2 = 8;
            }
            int[] ohashes = this.f2344b;
            Object[] oarray = this.f2345c;
            a(n2);
            if (osize == this.f2346d) {
                int[] iArr = this.f2344b;
                if (iArr.length > 0) {
                    System.arraycopy(ohashes, 0, iArr, 0, ohashes.length);
                    System.arraycopy(oarray, 0, this.f2345c, 0, oarray.length);
                }
                d(ohashes, oarray, osize);
            } else {
                throw new ConcurrentModificationException();
            }
        }
        if (index3 < osize) {
            int[] iArr2 = this.f2344b;
            System.arraycopy(iArr2, index3, iArr2, index3 + 1, osize - index3);
            Object[] objArr2 = this.f2345c;
            System.arraycopy(objArr2, index3 << 1, objArr2, (index3 + 1) << 1, (this.f2346d - index3) << 1);
        }
        int i2 = this.f2346d;
        if (osize == i2) {
            int[] iArr3 = this.f2344b;
            if (index3 < iArr3.length) {
                iArr3[index3] = hash;
                Object[] objArr3 = this.f2345c;
                objArr3[index3 << 1] = obj;
                objArr3[(index3 << 1) + 1] = obj2;
                this.f2346d = i2 + 1;
                return null;
            }
        }
        throw new ConcurrentModificationException();
    }

    /* JADX WARN: Generic types in debug info not equals: k.n != androidx.collection.SimpleArrayMap<K, V> */
    public Object putIfAbsent(Object obj, Object obj2) {
        Object obj3 = get(obj);
        if (obj3 == null) {
            return put(obj, obj2);
        }
        return obj3;
    }

    /* JADX WARN: Generic types in debug info not equals: k.n != androidx.collection.SimpleArrayMap<K, V> */
    public Object remove(Object key) {
        int index = f(key);
        if (index >= 0) {
            return j(index);
        }
        return null;
    }

    /* JADX WARN: Generic types in debug info not equals: k.n != androidx.collection.SimpleArrayMap<K, V> */
    public boolean remove(Object key, Object value) {
        int index = f(key);
        if (index < 0) {
            return false;
        }
        Object l2 = l(index);
        if (value != l2 && (value == null || !value.equals(l2))) {
            return false;
        }
        j(index);
        return true;
    }

    /* JADX WARN: Generic types in debug info not equals: k.n != androidx.collection.SimpleArrayMap<K, V> */
    public Object j(int index) {
        int nsize;
        Object[] objArr = this.f2345c;
        Object old = objArr[(index << 1) + 1];
        int osize = this.f2346d;
        if (osize <= 1) {
            d(this.f2344b, objArr, osize);
            this.f2344b = e.f2309a;
            this.f2345c = e.f2311c;
            nsize = 0;
        } else {
            nsize = osize - 1;
            int[] iArr = this.f2344b;
            int n2 = 8;
            if (iArr.length <= 8 || this.f2346d >= iArr.length / 3) {
                if (index < nsize) {
                    System.arraycopy(iArr, index + 1, iArr, index, nsize - index);
                    Object[] objArr2 = this.f2345c;
                    System.arraycopy(objArr2, (index + 1) << 1, objArr2, index << 1, (nsize - index) << 1);
                }
                Object[] objArr3 = this.f2345c;
                objArr3[nsize << 1] = null;
                objArr3[(nsize << 1) + 1] = null;
            } else {
                if (osize > 8) {
                    n2 = osize + (osize >> 1);
                }
                int[] ohashes = this.f2344b;
                Object[] oarray = this.f2345c;
                a(n2);
                if (osize == this.f2346d) {
                    if (index > 0) {
                        System.arraycopy(ohashes, 0, this.f2344b, 0, index);
                        System.arraycopy(oarray, 0, this.f2345c, 0, index << 1);
                    }
                    if (index < nsize) {
                        System.arraycopy(ohashes, index + 1, this.f2344b, index, nsize - index);
                        System.arraycopy(oarray, (index + 1) << 1, this.f2345c, index << 1, (nsize - index) << 1);
                    }
                } else {
                    throw new ConcurrentModificationException();
                }
            }
        }
        if (osize == this.f2346d) {
            this.f2346d = nsize;
            return old;
        }
        throw new ConcurrentModificationException();
    }

    /* JADX WARN: Generic types in debug info not equals: k.n != androidx.collection.SimpleArrayMap<K, V> */
    public Object replace(Object obj, Object obj2) {
        int index = f(obj);
        if (index >= 0) {
            return k(index, obj2);
        }
        return null;
    }

    /* JADX WARN: Generic types in debug info not equals: k.n != androidx.collection.SimpleArrayMap<K, V> */
    public boolean replace(Object obj, Object obj2, Object obj3) {
        int index = f(obj);
        if (index < 0) {
            return false;
        }
        Object l2 = l(index);
        if (l2 != obj2 && (obj2 == null || !obj2.equals(l2))) {
            return false;
        }
        k(index, obj3);
        return true;
    }

    /* JADX WARN: Generic types in debug info not equals: k.n != androidx.collection.SimpleArrayMap<K, V> */
    public int size() {
        return this.f2346d;
    }

    /* JADX WARN: Generic types in debug info not equals: k.n != androidx.collection.SimpleArrayMap<?, ?> */
    /* JADX WARN: Generic types in debug info not equals: k.n != androidx.collection.SimpleArrayMap<K, V> */
    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object instanceof n) {
            n nVar = (n) object;
            if (size() != nVar.size()) {
                return false;
            }
            for (int i2 = 0; i2 < this.f2346d; i2++) {
                try {
                    Object i3 = i(i2);
                    Object l2 = l(i2);
                    Object theirs = nVar.get(i3);
                    if (l2 == null) {
                        if (theirs != null || !nVar.containsKey(i3)) {
                            return false;
                        }
                    } else if (!l2.equals(theirs)) {
                        return false;
                    }
                } catch (ClassCastException e2) {
                    return false;
                } catch (NullPointerException e3) {
                    return false;
                }
            }
            return true;
        } else if (!(object instanceof Map)) {
            return false;
        } else {
            Map<?, ?> map = (Map) object;
            if (size() != map.size()) {
                return false;
            }
            for (int i4 = 0; i4 < this.f2346d; i4++) {
                try {
                    Object i5 = i(i4);
                    Object l3 = l(i4);
                    Object theirs2 = map.get(i5);
                    if (l3 == null) {
                        if (theirs2 != null || !map.containsKey(i5)) {
                            return false;
                        }
                    } else if (!l3.equals(theirs2)) {
                        return false;
                    }
                } catch (ClassCastException e4) {
                    return false;
                } catch (NullPointerException e5) {
                    return false;
                }
            }
            return true;
        }
    }

    /* JADX WARN: Generic types in debug info not equals: k.n != androidx.collection.SimpleArrayMap<K, V> */
    public int hashCode() {
        int[] hashes = this.f2344b;
        Object[] array = this.f2345c;
        int result = 0;
        int i2 = 0;
        int v2 = 1;
        int s2 = this.f2346d;
        while (i2 < s2) {
            Object value = array[v2];
            result += hashes[i2] ^ (value == null ? 0 : value.hashCode());
            i2++;
            v2 += 2;
        }
        return result;
    }

    /* JADX WARN: Generic types in debug info not equals: k.n != androidx.collection.SimpleArrayMap<K, V> */
    public String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder buffer = new StringBuilder(this.f2346d * 28);
        buffer.append('{');
        for (int i2 = 0; i2 < this.f2346d; i2++) {
            if (i2 > 0) {
                buffer.append(", ");
            }
            Object key = i(i2);
            if (key != this) {
                buffer.append(key);
            } else {
                buffer.append("(this Map)");
            }
            buffer.append('=');
            Object value = l(i2);
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
