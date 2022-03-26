package n;

import java.util.Arrays;

/* JADX WARN: Classes with same name are omitted:
  
 */
/* loaded from: classes.dex */
public class m {

    /* renamed from: q  reason: collision with root package name */
    public static int f2537q = 1;

    /* renamed from: a  reason: collision with root package name */
    public boolean f2538a;

    /* renamed from: b  reason: collision with root package name */
    public String f2539b;

    /* renamed from: f  reason: collision with root package name */
    public float f2543f;

    /* renamed from: j  reason: collision with root package name */
    public l f2547j;

    /* renamed from: c  reason: collision with root package name */
    public int f2540c = -1;

    /* renamed from: d  reason: collision with root package name */
    public int f2541d = -1;

    /* renamed from: e  reason: collision with root package name */
    public int f2542e = 0;

    /* renamed from: g  reason: collision with root package name */
    public boolean f2544g = false;

    /* renamed from: h  reason: collision with root package name */
    public float[] f2545h = new float[9];

    /* renamed from: i  reason: collision with root package name */
    public float[] f2546i = new float[9];

    /* renamed from: k  reason: collision with root package name */
    public c[] f2548k = new c[16];

    /* renamed from: l  reason: collision with root package name */
    public int f2549l = 0;

    /* renamed from: m  reason: collision with root package name */
    public int f2550m = 0;

    /* renamed from: n  reason: collision with root package name */
    public boolean f2551n = false;

    /* renamed from: o  reason: collision with root package name */
    public int f2552o = -1;

    /* renamed from: p  reason: collision with root package name */
    public float f2553p = 0.0f;

    public static void b() {
        f2537q++;
    }

    public m(l type) {
        this.f2547j = type;
    }

    public final void a(c row) {
        int i2 = 0;
        while (true) {
            int i3 = this.f2549l;
            if (i2 >= i3) {
                c[] cVarArr = this.f2548k;
                if (i3 >= cVarArr.length) {
                    this.f2548k = (c[]) Arrays.copyOf(cVarArr, cVarArr.length * 2);
                }
                c[] cVarArr2 = this.f2548k;
                int i4 = this.f2549l;
                cVarArr2[i4] = row;
                this.f2549l = i4 + 1;
                return;
            } else if (this.f2548k[i2] != row) {
                i2++;
            } else {
                return;
            }
        }
    }

    public final void c(c row) {
        int count = this.f2549l;
        for (int i2 = 0; i2 < count; i2++) {
            if (this.f2548k[i2] == row) {
                for (int j2 = i2; j2 < count - 1; j2++) {
                    c[] cVarArr = this.f2548k;
                    cVarArr[j2] = cVarArr[j2 + 1];
                }
                int j3 = this.f2549l;
                this.f2549l = j3 - 1;
                return;
            }
        }
    }

    public final void g(f system, c definition) {
        int count = this.f2549l;
        for (int i2 = 0; i2 < count; i2++) {
            this.f2548k[i2].C(system, definition, false);
        }
        this.f2549l = 0;
    }

    public void e(f system, float value) {
        this.f2543f = value;
        this.f2544g = true;
        this.f2551n = false;
        this.f2552o = -1;
        this.f2553p = 0.0f;
        int count = this.f2549l;
        this.f2541d = -1;
        for (int i2 = 0; i2 < count; i2++) {
            this.f2548k[i2].B(system, this, false);
        }
        this.f2549l = 0;
    }

    public void d() {
        this.f2539b = null;
        this.f2547j = l.UNKNOWN;
        this.f2542e = 0;
        this.f2540c = -1;
        this.f2541d = -1;
        this.f2543f = 0.0f;
        this.f2544g = false;
        this.f2551n = false;
        this.f2552o = -1;
        this.f2553p = 0.0f;
        int count = this.f2549l;
        for (int i2 = 0; i2 < count; i2++) {
            this.f2548k[i2] = null;
        }
        this.f2549l = 0;
        this.f2550m = 0;
        this.f2538a = false;
        Arrays.fill(this.f2546i, 0.0f);
    }

    public void f(l type) {
        this.f2547j = type;
    }

    public String toString() {
        String result = "" + this.f2540c;
        return result;
    }
}
