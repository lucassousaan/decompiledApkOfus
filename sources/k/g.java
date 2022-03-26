package k;

import java.util.LinkedHashMap;
import java.util.Locale;

/* JADX WARN: Classes with same name are omitted:
  
 */
/* loaded from: classes.dex */
public class g {

    /* renamed from: a  reason: collision with root package name */
    public final LinkedHashMap f2317a;

    /* renamed from: b  reason: collision with root package name */
    public int f2318b;

    /* renamed from: c  reason: collision with root package name */
    public int f2319c;

    /* renamed from: d  reason: collision with root package name */
    public int f2320d;

    /* renamed from: e  reason: collision with root package name */
    public int f2321e;

    /* renamed from: f  reason: collision with root package name */
    public int f2322f;

    /* renamed from: g  reason: collision with root package name */
    public int f2323g;

    /* renamed from: h  reason: collision with root package name */
    public int f2324h;

    /* JADX WARN: Generic types in debug info not equals: k.g != androidx.collection.LruCache<K, V> */
    public g(int maxSize) {
        if (maxSize > 0) {
            this.f2319c = maxSize;
            this.f2317a = new LinkedHashMap(0, 0.75f, true);
            return;
        }
        throw new IllegalArgumentException("maxSize <= 0");
    }

    /* JADX WARN: Generic types in debug info not equals: k.g != androidx.collection.LruCache<K, V> */
    public final Object c(Object obj) {
        Object put;
        if (obj != null) {
            synchronized (this) {
                Object obj2 = this.f2317a.get(obj);
                if (obj2 != null) {
                    this.f2323g++;
                    return obj2;
                }
                this.f2324h++;
                a();
                if (0 == 0) {
                    return null;
                }
                synchronized (this) {
                    this.f2321e++;
                    put = this.f2317a.put(obj, null);
                    if (put != null) {
                        this.f2317a.put(obj, put);
                    } else {
                        int i2 = this.f2318b;
                        e(obj, null);
                        this.f2318b = i2 + 1;
                    }
                }
                if (put != null) {
                    b();
                    return put;
                }
                g(this.f2319c);
                return null;
            }
        }
        throw new NullPointerException("key == null");
    }

    /* JADX WARN: Generic types in debug info not equals: k.g != androidx.collection.LruCache<K, V> */
    public final Object d(Object obj, Object obj2) {
        Object put;
        if (obj == null || obj2 == null) {
            throw new NullPointerException("key == null || value == null");
        }
        synchronized (this) {
            this.f2320d++;
            int i2 = this.f2318b;
            e(obj, obj2);
            this.f2318b = i2 + 1;
            put = this.f2317a.put(obj, obj2);
            if (put != null) {
                int i3 = this.f2318b;
                e(obj, put);
                this.f2318b = i3 - 1;
            }
        }
        if (put != null) {
            b();
        }
        g(this.f2319c);
        return put;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x006f, code lost:
        throw new java.lang.IllegalStateException(getClass().getName() + ".sizeOf() is reporting inconsistent results!");
     */
    /* JADX WARN: Generic types in debug info not equals: k.g != androidx.collection.LruCache<K, V> */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void g(int r5) {
        /*
            r4 = this;
        L_0x0000:
            monitor-enter(r4)
            int r0 = r4.f2318b     // Catch: all -> 0x0070
            if (r0 < 0) goto L_0x0051
            java.util.LinkedHashMap r0 = r4.f2317a     // Catch: all -> 0x0070
            boolean r0 = r0.isEmpty()     // Catch: all -> 0x0070
            if (r0 == 0) goto L_0x0011
            int r0 = r4.f2318b     // Catch: all -> 0x0070
            if (r0 != 0) goto L_0x0051
        L_0x0011:
            int r0 = r4.f2318b     // Catch: all -> 0x0070
            if (r0 <= r5) goto L_0x004f
            java.util.LinkedHashMap r0 = r4.f2317a     // Catch: all -> 0x0070
            boolean r0 = r0.isEmpty()     // Catch: all -> 0x0070
            if (r0 == 0) goto L_0x001e
            goto L_0x004f
        L_0x001e:
            java.util.LinkedHashMap r0 = r4.f2317a     // Catch: all -> 0x0070
            java.util.Set r0 = r0.entrySet()     // Catch: all -> 0x0070
            java.util.Iterator r0 = r0.iterator()     // Catch: all -> 0x0070
            java.lang.Object r0 = r0.next()     // Catch: all -> 0x0070
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0     // Catch: all -> 0x0070
            java.lang.Object r1 = r0.getKey()     // Catch: all -> 0x0070
            java.lang.Object r2 = r0.getValue()     // Catch: all -> 0x0070
            java.util.LinkedHashMap r3 = r4.f2317a     // Catch: all -> 0x0070
            r3.remove(r1)     // Catch: all -> 0x0070
            int r3 = r4.f2318b     // Catch: all -> 0x0070
            r4.e(r1, r2)     // Catch: all -> 0x0070
            int r3 = r3 + (-1)
            r4.f2318b = r3     // Catch: all -> 0x0070
            int r3 = r4.f2322f     // Catch: all -> 0x0070
            int r3 = r3 + 1
            r4.f2322f = r3     // Catch: all -> 0x0070
            monitor-exit(r4)     // Catch: all -> 0x0070
            r4.b()
            goto L_0x0000
        L_0x004f:
            monitor-exit(r4)     // Catch: all -> 0x0070
            return
        L_0x0051:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch: all -> 0x0070
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: all -> 0x0070
            r1.<init>()     // Catch: all -> 0x0070
            java.lang.Class r2 = r4.getClass()     // Catch: all -> 0x0070
            java.lang.String r2 = r2.getName()     // Catch: all -> 0x0070
            r1.append(r2)     // Catch: all -> 0x0070
            java.lang.String r2 = ".sizeOf() is reporting inconsistent results!"
            r1.append(r2)     // Catch: all -> 0x0070
            java.lang.String r1 = r1.toString()     // Catch: all -> 0x0070
            r0.<init>(r1)     // Catch: all -> 0x0070
            throw r0     // Catch: all -> 0x0070
        L_0x0070:
            r0 = move-exception
            monitor-exit(r4)     // Catch: all -> 0x0070
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: k.g.g(int):void");
    }

    /* JADX WARN: Generic types in debug info not equals: k.g != androidx.collection.LruCache<K, V> */
    public void b() {
    }

    /* JADX WARN: Generic types in debug info not equals: k.g != androidx.collection.LruCache<K, V> */
    public Object a() {
        return null;
    }

    /* JADX WARN: Generic types in debug info not equals: k.g != androidx.collection.LruCache<K, V> */
    public final int e(Object obj, Object obj2) {
        f();
        if (1 >= 0) {
            return 1;
        }
        throw new IllegalStateException("Negative size: " + obj + "=" + obj2);
    }

    /* JADX WARN: Generic types in debug info not equals: k.g != androidx.collection.LruCache<K, V> */
    public int f() {
        return 1;
    }

    /* JADX WARN: Generic types in debug info not equals: k.g != androidx.collection.LruCache<K, V> */
    public final synchronized String toString() {
        int hitPercent;
        int i2 = this.f2323g;
        int accesses = this.f2324h + i2;
        hitPercent = accesses != 0 ? (i2 * 100) / accesses : 0;
        return String.format(Locale.US, "LruCache[maxSize=%d,hits=%d,misses=%d,hitRate=%d%%]", Integer.valueOf(this.f2319c), Integer.valueOf(this.f2323g), Integer.valueOf(this.f2324h), Integer.valueOf(hitPercent));
    }
}
