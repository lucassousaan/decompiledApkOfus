package k;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* JADX WARN: Classes with same name are omitted:
  
 */
/* loaded from: classes.dex */
public abstract class m {

    /* renamed from: a  reason: collision with root package name */
    public i f2337a;

    /* renamed from: b  reason: collision with root package name */
    public j f2338b;

    /* renamed from: c  reason: collision with root package name */
    public l f2339c;

    public abstract void a();

    public abstract Object b(int i2, int i3);

    public abstract Map c();

    public abstract int d();

    public abstract int e(Object obj);

    public abstract int f(Object obj);

    public abstract void g(Object obj, Object obj2);

    public abstract void h(int i2);

    public abstract Object i(int i2, Object obj);

    public static boolean j(Map map, Collection collection) {
        for (Object obj : collection) {
            if (!map.containsKey(obj)) {
                return false;
            }
        }
        return true;
    }

    public static boolean o(Map map, Collection collection) {
        int oldSize = map.size();
        for (Object obj : collection) {
            map.remove(obj);
        }
        return oldSize != map.size();
    }

    public static boolean p(Map map, Collection collection) {
        int oldSize = map.size();
        Iterator it = map.keySet().iterator();
        while (it.hasNext()) {
            if (!collection.contains(it.next())) {
                it.remove();
            }
        }
        return oldSize != map.size();
    }

    /* JADX WARN: Generic types in debug info not equals: k.m != androidx.collection.MapCollections<K, V> */
    public Object[] q(int offset) {
        int N = d();
        Object[] result = new Object[N];
        for (int i2 = 0; i2 < N; i2++) {
            result[i2] = b(i2, offset);
        }
        return result;
    }

    /* JADX WARN: Generic types in debug info not equals: k.m != androidx.collection.MapCollections<K, V> */
    public Object[] r(Object[] objArr, int offset) {
        int N = d();
        if (objArr.length < N) {
            objArr = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), N);
        }
        for (int i2 = 0; i2 < N; i2++) {
            objArr[i2] = b(i2, offset);
        }
        int i3 = objArr.length;
        if (i3 > N) {
            objArr[N] = null;
        }
        return objArr;
    }

    public static boolean k(Set set, Object object) {
        if (set == object) {
            return true;
        }
        if (!(object instanceof Set)) {
            return false;
        }
        Set<?> s2 = (Set) object;
        try {
            if (set.size() == s2.size()) {
                if (set.containsAll(s2)) {
                    return true;
                }
            }
            return false;
        } catch (ClassCastException e2) {
            return false;
        } catch (NullPointerException e3) {
            return false;
        }
    }

    /* JADX WARN: Generic types in debug info not equals: k.m != androidx.collection.MapCollections<K, V> */
    public Set l() {
        if (this.f2337a == null) {
            this.f2337a = new i(this);
        }
        return this.f2337a;
    }

    /* JADX WARN: Generic types in debug info not equals: k.m != androidx.collection.MapCollections<K, V> */
    public Set m() {
        if (this.f2338b == null) {
            this.f2338b = new j(this);
        }
        return this.f2338b;
    }

    /* JADX WARN: Generic types in debug info not equals: k.m != androidx.collection.MapCollections<K, V> */
    public Collection n() {
        if (this.f2339c == null) {
            this.f2339c = new l(this);
        }
        return this.f2339c;
    }
}
