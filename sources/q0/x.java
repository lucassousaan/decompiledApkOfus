package q0;

import androidx.recyclerview.widget.RecyclerView;
import java.util.Arrays;

/* JADX WARN: Classes with same name are omitted:
  
 */
/* loaded from: classes.dex */
public class x implements k1 {

    /* renamed from: a  reason: collision with root package name */
    public int f3256a;

    /* renamed from: b  reason: collision with root package name */
    public int f3257b;

    /* renamed from: c  reason: collision with root package name */
    public int[] f3258c;

    /* renamed from: d  reason: collision with root package name */
    public int f3259d;

    public void e(int dx, int dy) {
        this.f3256a = dx;
        this.f3257b = dy;
    }

    public void c(RecyclerView view, boolean nested) {
        this.f3259d = 0;
        int[] iArr = this.f3258c;
        if (iArr != null) {
            Arrays.fill(iArr, -1);
        }
        m1 layout = view.f1089m;
        if (view.f1087l != null && layout != null && layout.u0()) {
            if (nested) {
                if (!view.f1073e.n()) {
                    layout.p(view.f1087l.c(), this);
                }
            } else if (!view.l0()) {
                layout.o(this.f3256a, this.f3257b, view.f1078g0, this);
            }
            int i2 = this.f3259d;
            if (i2 > layout.f3125l) {
                layout.f3125l = i2;
                layout.f3126m = nested;
                view.f1069c.I();
            }
        }
    }

    public void a(int layoutPosition, int pixelDistance) {
        if (layoutPosition < 0) {
            throw new IllegalArgumentException("Layout positions must be non-negative");
        } else if (pixelDistance >= 0) {
            int storagePosition = this.f3259d * 2;
            int[] iArr = this.f3258c;
            if (iArr == null) {
                int[] iArr2 = new int[4];
                this.f3258c = iArr2;
                Arrays.fill(iArr2, -1);
            } else if (storagePosition >= iArr.length) {
                int[] oldArray = this.f3258c;
                int[] iArr3 = new int[storagePosition * 2];
                this.f3258c = iArr3;
                System.arraycopy(oldArray, 0, iArr3, 0, oldArray.length);
            }
            int[] oldArray2 = this.f3258c;
            oldArray2[storagePosition] = layoutPosition;
            oldArray2[storagePosition + 1] = pixelDistance;
            this.f3259d++;
        } else {
            throw new IllegalArgumentException("Pixel distance must be non-negative");
        }
    }

    public boolean d(int position) {
        if (this.f3258c == null) {
            return false;
        }
        int count = this.f3259d * 2;
        for (int i2 = 0; i2 < count; i2 += 2) {
            if (this.f3258c[i2] == position) {
                return true;
            }
        }
        return false;
    }

    public void b() {
        int[] iArr = this.f3258c;
        if (iArr != null) {
            Arrays.fill(iArr, -1);
        }
        this.f3259d = 0;
    }
}
