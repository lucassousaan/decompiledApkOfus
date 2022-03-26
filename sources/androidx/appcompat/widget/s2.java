package androidx.appcompat.widget;

/* JADX WARN: Classes with same name are omitted:
  
 */
/* loaded from: classes.dex */
public class s2 {

    /* renamed from: a  reason: collision with root package name */
    public int f521a = 0;

    /* renamed from: b  reason: collision with root package name */
    public int f522b = 0;

    /* renamed from: c  reason: collision with root package name */
    public int f523c = Integer.MIN_VALUE;

    /* renamed from: d  reason: collision with root package name */
    public int f524d = Integer.MIN_VALUE;

    /* renamed from: e  reason: collision with root package name */
    public int f525e = 0;

    /* renamed from: f  reason: collision with root package name */
    public int f526f = 0;

    /* renamed from: g  reason: collision with root package name */
    public boolean f527g = false;

    /* renamed from: h  reason: collision with root package name */
    public boolean f528h = false;

    public int b() {
        return this.f521a;
    }

    public int c() {
        return this.f522b;
    }

    public int d() {
        return this.f527g ? this.f522b : this.f521a;
    }

    public int a() {
        return this.f527g ? this.f521a : this.f522b;
    }

    public void g(int start, int end) {
        this.f523c = start;
        this.f524d = end;
        this.f528h = true;
        if (this.f527g) {
            if (end != Integer.MIN_VALUE) {
                this.f521a = end;
            }
            if (start != Integer.MIN_VALUE) {
                this.f522b = start;
                return;
            }
            return;
        }
        if (start != Integer.MIN_VALUE) {
            this.f521a = start;
        }
        if (end != Integer.MIN_VALUE) {
            this.f522b = end;
        }
    }

    public void e(int left, int right) {
        this.f528h = false;
        if (left != Integer.MIN_VALUE) {
            this.f525e = left;
            this.f521a = left;
        }
        if (right != Integer.MIN_VALUE) {
            this.f526f = right;
            this.f522b = right;
        }
    }

    public void f(boolean isRtl) {
        if (isRtl != this.f527g) {
            this.f527g = isRtl;
            if (!this.f528h) {
                this.f521a = this.f525e;
                this.f522b = this.f526f;
            } else if (isRtl) {
                int i2 = this.f524d;
                if (i2 == Integer.MIN_VALUE) {
                    i2 = this.f525e;
                }
                this.f521a = i2;
                int i3 = this.f523c;
                if (i3 == Integer.MIN_VALUE) {
                    i3 = this.f526f;
                }
                this.f522b = i3;
            } else {
                int i4 = this.f523c;
                if (i4 == Integer.MIN_VALUE) {
                    i4 = this.f525e;
                }
                this.f521a = i4;
                int i5 = this.f524d;
                if (i5 == Integer.MIN_VALUE) {
                    i5 = this.f526f;
                }
                this.f522b = i5;
            }
        }
    }
}
