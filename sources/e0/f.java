package e0;

/* JADX WARN: Classes with same name are omitted:
  
 */
/* loaded from: classes.dex */
public class f implements e {

    /* renamed from: a  reason: collision with root package name */
    public final Object[] f1806a;

    /* renamed from: b  reason: collision with root package name */
    public int f1807b;

    /* JADX WARN: Generic types in debug info not equals: e0.f != androidx.core.util.Pools$SimplePool<T> */
    public f(int maxPoolSize) {
        if (maxPoolSize > 0) {
            this.f1806a = new Object[maxPoolSize];
            return;
        }
        throw new IllegalArgumentException("The max pool size must be > 0");
    }

    /* JADX WARN: Generic types in debug info not equals: e0.f != androidx.core.util.Pools$SimplePool<T> */
    @Override // e0.e
    public Object b() {
        int i2 = this.f1807b;
        if (i2 <= 0) {
            return null;
        }
        int lastPooledIndex = i2 - 1;
        Object[] objArr = this.f1806a;
        Object obj = objArr[lastPooledIndex];
        objArr[lastPooledIndex] = null;
        this.f1807b = i2 - 1;
        return obj;
    }

    /* JADX WARN: Generic types in debug info not equals: e0.f != androidx.core.util.Pools$SimplePool<T> */
    @Override // e0.e
    public boolean a(Object obj) {
        if (!c(obj)) {
            int i2 = this.f1807b;
            Object[] objArr = this.f1806a;
            if (i2 >= objArr.length) {
                return false;
            }
            objArr[i2] = obj;
            this.f1807b = i2 + 1;
            return true;
        }
        throw new IllegalStateException("Already in the pool!");
    }

    /* JADX WARN: Generic types in debug info not equals: e0.f != androidx.core.util.Pools$SimplePool<T> */
    public final boolean c(Object obj) {
        for (int i2 = 0; i2 < this.f1807b; i2++) {
            if (this.f1806a[i2] == obj) {
                return true;
            }
        }
        return false;
    }
}
