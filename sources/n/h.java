package n;

/* JADX WARN: Classes with same name are omitted:
  
 */
/* loaded from: classes.dex */
public class h implements g {

    /* renamed from: a  reason: collision with root package name */
    public final Object[] f2522a;

    /* renamed from: b  reason: collision with root package name */
    public int f2523b;

    /* JADX WARN: Generic types in debug info not equals: n.h != androidx.constraintlayout.solver.Pools$SimplePool<T> */
    public h(int maxPoolSize) {
        if (maxPoolSize > 0) {
            this.f2522a = new Object[maxPoolSize];
            return;
        }
        throw new IllegalArgumentException("The max pool size must be > 0");
    }

    /* JADX WARN: Generic types in debug info not equals: n.h != androidx.constraintlayout.solver.Pools$SimplePool<T> */
    public Object a() {
        int i2 = this.f2523b;
        if (i2 <= 0) {
            return null;
        }
        int lastPooledIndex = i2 - 1;
        Object[] objArr = this.f2522a;
        Object obj = objArr[lastPooledIndex];
        objArr[lastPooledIndex] = null;
        this.f2523b = i2 - 1;
        return obj;
    }

    /* JADX WARN: Generic types in debug info not equals: n.h != androidx.constraintlayout.solver.Pools$SimplePool<T> */
    public boolean b(Object obj) {
        int i2 = this.f2523b;
        Object[] objArr = this.f2522a;
        if (i2 >= objArr.length) {
            return false;
        }
        objArr[i2] = obj;
        this.f2523b = i2 + 1;
        return true;
    }

    /* JADX WARN: Generic types in debug info not equals: n.h != androidx.constraintlayout.solver.Pools$SimplePool<T> */
    public void c(Object[] objArr, int count) {
        if (count > objArr.length) {
            count = objArr.length;
        }
        for (int i2 = 0; i2 < count; i2++) {
            Object obj = objArr[i2];
            int i3 = this.f2523b;
            Object[] objArr2 = this.f2522a;
            if (i3 < objArr2.length) {
                objArr2[i3] = obj;
                this.f2523b = i3 + 1;
            }
        }
    }
}
