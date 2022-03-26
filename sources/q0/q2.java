package q0;

import java.util.Arrays;
import java.util.List;

/* JADX WARN: Classes with same name are omitted:
  
 */
/* loaded from: classes.dex */
public class q2 {

    /* renamed from: a  reason: collision with root package name */
    public int[] f3180a;

    /* renamed from: b  reason: collision with root package name */
    public List f3181b;

    public int c(int position) {
        List list = this.f3181b;
        if (list != null) {
            for (int i2 = list.size() - 1; i2 >= 0; i2--) {
                p2 fsi = (p2) this.f3181b.get(i2);
                if (fsi.f3162b >= position) {
                    this.f3181b.remove(i2);
                }
            }
        }
        int i3 = g(position);
        return i3;
    }

    public int g(int position) {
        int[] iArr = this.f3180a;
        if (iArr == null || position >= iArr.length) {
            return -1;
        }
        int endPosition = h(position);
        if (endPosition == -1) {
            int[] iArr2 = this.f3180a;
            Arrays.fill(iArr2, position, iArr2.length, -1);
            return this.f3180a.length;
        }
        Arrays.fill(this.f3180a, position, endPosition + 1, -1);
        return endPosition + 1;
    }

    public int f(int position) {
        int[] iArr = this.f3180a;
        if (iArr == null || position >= iArr.length) {
            return -1;
        }
        return iArr[position];
    }

    public void m(int position, t2 span) {
        b(position);
        this.f3180a[position] = span.f3216e;
    }

    public int n(int position) {
        int len = this.f3180a.length;
        while (len <= position) {
            len *= 2;
        }
        return len;
    }

    public void b(int position) {
        int[] iArr = this.f3180a;
        if (iArr == null) {
            int[] iArr2 = new int[Math.max(position, 10) + 1];
            this.f3180a = iArr2;
            Arrays.fill(iArr2, -1);
        } else if (position >= iArr.length) {
            int[] old = this.f3180a;
            int[] iArr3 = new int[n(position)];
            this.f3180a = iArr3;
            System.arraycopy(old, 0, iArr3, 0, old.length);
            int[] iArr4 = this.f3180a;
            Arrays.fill(iArr4, old.length, iArr4.length, -1);
        }
    }

    public void a() {
        int[] iArr = this.f3180a;
        if (iArr != null) {
            Arrays.fill(iArr, -1);
        }
        this.f3181b = null;
    }

    public void j(int positionStart, int itemCount) {
        int[] iArr = this.f3180a;
        if (iArr != null && positionStart < iArr.length) {
            b(positionStart + itemCount);
            int[] iArr2 = this.f3180a;
            System.arraycopy(iArr2, positionStart + itemCount, iArr2, positionStart, (iArr2.length - positionStart) - itemCount);
            int[] iArr3 = this.f3180a;
            Arrays.fill(iArr3, iArr3.length - itemCount, iArr3.length, -1);
            l(positionStart, itemCount);
        }
    }

    public final void l(int positionStart, int itemCount) {
        List list = this.f3181b;
        if (list != null) {
            int end = positionStart + itemCount;
            for (int i2 = list.size() - 1; i2 >= 0; i2--) {
                p2 fsi = (p2) this.f3181b.get(i2);
                int i3 = fsi.f3162b;
                if (i3 >= positionStart) {
                    if (i3 < end) {
                        this.f3181b.remove(i2);
                    } else {
                        fsi.f3162b = i3 - itemCount;
                    }
                }
            }
        }
    }

    public void i(int positionStart, int itemCount) {
        int[] iArr = this.f3180a;
        if (iArr != null && positionStart < iArr.length) {
            b(positionStart + itemCount);
            int[] iArr2 = this.f3180a;
            System.arraycopy(iArr2, positionStart, iArr2, positionStart + itemCount, (iArr2.length - positionStart) - itemCount);
            Arrays.fill(this.f3180a, positionStart, positionStart + itemCount, -1);
            k(positionStart, itemCount);
        }
    }

    public final void k(int positionStart, int itemCount) {
        List list = this.f3181b;
        if (list != null) {
            for (int i2 = list.size() - 1; i2 >= 0; i2--) {
                p2 fsi = (p2) this.f3181b.get(i2);
                int i3 = fsi.f3162b;
                if (i3 >= positionStart) {
                    fsi.f3162b = i3 + itemCount;
                }
            }
        }
    }

    public final int h(int position) {
        if (this.f3181b == null) {
            return -1;
        }
        p2 item = e(position);
        if (item != null) {
            this.f3181b.remove(item);
        }
        int nextFsiIndex = -1;
        int count = this.f3181b.size();
        int i2 = 0;
        while (true) {
            if (i2 >= count) {
                break;
            }
            p2 fsi = (p2) this.f3181b.get(i2);
            if (fsi.f3162b >= position) {
                nextFsiIndex = i2;
                break;
            }
            i2++;
        }
        if (nextFsiIndex == -1) {
            return -1;
        }
        p2 fsi2 = (p2) this.f3181b.get(nextFsiIndex);
        this.f3181b.remove(nextFsiIndex);
        return fsi2.f3162b;
    }

    public p2 e(int position) {
        List list = this.f3181b;
        if (list == null) {
            return null;
        }
        for (int i2 = list.size() - 1; i2 >= 0; i2--) {
            p2 fsi = (p2) this.f3181b.get(i2);
            if (fsi.f3162b == position) {
                return fsi;
            }
        }
        return null;
    }

    public p2 d(int minPos, int maxPos, int gapDir, boolean hasUnwantedGapAfter) {
        List list = this.f3181b;
        if (list == null) {
            return null;
        }
        int limit = list.size();
        for (int i2 = 0; i2 < limit; i2++) {
            p2 fsi = (p2) this.f3181b.get(i2);
            int i3 = fsi.f3162b;
            if (i3 >= maxPos) {
                return null;
            }
            if (i3 >= minPos && (gapDir == 0 || fsi.f3163c == gapDir || (hasUnwantedGapAfter && fsi.f3165e))) {
                return fsi;
            }
        }
        return null;
    }
}
