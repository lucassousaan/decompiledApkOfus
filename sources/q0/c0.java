package q0;

import android.util.SparseIntArray;

/* JADX WARN: Classes with same name are omitted:
  
 */
/* loaded from: classes.dex */
public abstract class c0 {

    /* renamed from: a  reason: collision with root package name */
    public final SparseIntArray f2988a = new SparseIntArray();

    /* renamed from: b  reason: collision with root package name */
    public final SparseIntArray f2989b = new SparseIntArray();

    /* renamed from: c  reason: collision with root package name */
    public boolean f2990c = false;

    /* renamed from: d  reason: collision with root package name */
    public boolean f2991d = false;

    public abstract int d(int i2, int i3);

    public abstract int e(int i2);

    public void g() {
        this.f2988a.clear();
    }

    public void f() {
        this.f2989b.clear();
    }

    public int b(int position, int spanCount) {
        return d(position, spanCount);
    }

    public int a(int position, int spanCount) {
        return c(position, spanCount);
    }

    public int c(int adapterPosition, int spanCount) {
        int span = 0;
        int group = 0;
        e(adapterPosition);
        for (int i2 = 0; i2 < adapterPosition; i2++) {
            e(i2);
            span++;
            if (span == spanCount) {
                span = 0;
                group++;
            } else if (span > spanCount) {
                span = 1;
                group++;
            }
        }
        int i3 = span + 1;
        if (i3 > spanCount) {
            return group + 1;
        }
        return group;
    }
}
