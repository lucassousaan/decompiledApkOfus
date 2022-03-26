package q0;

/* JADX WARN: Classes with same name are omitted:
  
 */
/* loaded from: classes.dex */
public class u2 {

    /* renamed from: a  reason: collision with root package name */
    public int f3220a = 0;

    /* renamed from: b  reason: collision with root package name */
    public int f3221b;

    /* renamed from: c  reason: collision with root package name */
    public int f3222c;

    /* renamed from: d  reason: collision with root package name */
    public int f3223d;

    /* renamed from: e  reason: collision with root package name */
    public int f3224e;

    public void e(int rvStart, int rvEnd, int childStart, int childEnd) {
        this.f3221b = rvStart;
        this.f3222c = rvEnd;
        this.f3223d = childStart;
        this.f3224e = childEnd;
    }

    public void a(int flags) {
        this.f3220a |= flags;
    }

    public void d() {
        this.f3220a = 0;
    }

    public int c(int x2, int y2) {
        if (x2 > y2) {
            return 1;
        }
        if (x2 == y2) {
            return 2;
        }
        return 4;
    }

    public boolean b() {
        int i2 = this.f3220a;
        if ((i2 & 7) != 0 && (i2 & (c(this.f3223d, this.f3221b) << 0)) == 0) {
            return false;
        }
        int i3 = this.f3220a;
        if ((i3 & 112) != 0 && (i3 & (c(this.f3223d, this.f3222c) << 4)) == 0) {
            return false;
        }
        int i4 = this.f3220a;
        if ((i4 & 1792) != 0 && (i4 & (c(this.f3224e, this.f3221b) << 8)) == 0) {
            return false;
        }
        int i5 = this.f3220a;
        return (i5 & 28672) == 0 || (i5 & (c(this.f3224e, this.f3222c) << 12)) != 0;
    }
}
