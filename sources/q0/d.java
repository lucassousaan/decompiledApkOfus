package q0;

/* JADX WARN: Classes with same name are omitted:
  
 */
/* loaded from: classes.dex */
public class d {

    /* renamed from: a  reason: collision with root package name */
    public long f2992a = 0;

    /* renamed from: b  reason: collision with root package name */
    public d f2993b;

    public void h(int index) {
        if (index >= 64) {
            c();
            this.f2993b.h(index - 64);
            return;
        }
        this.f2992a |= 1 << index;
    }

    public final void c() {
        if (this.f2993b == null) {
            this.f2993b = new d();
        }
    }

    public void a(int index) {
        if (index >= 64) {
            d dVar = this.f2993b;
            if (dVar != null) {
                dVar.a(index - 64);
                return;
            }
            return;
        }
        this.f2992a &= ~(1 << index);
    }

    public boolean d(int index) {
        if (index < 64) {
            return (this.f2992a & (1 << index)) != 0;
        }
        c();
        return this.f2993b.d(index - 64);
    }

    public void g() {
        this.f2992a = 0L;
        d dVar = this.f2993b;
        if (dVar != null) {
            dVar.g();
        }
    }

    public void e(int index, boolean value) {
        if (index >= 64) {
            c();
            this.f2993b.e(index - 64, value);
            return;
        }
        long j2 = this.f2992a;
        boolean lastBit = (Long.MIN_VALUE & j2) != 0;
        long mask = (1 << index) - 1;
        long before = j2 & mask;
        long after = (j2 & (~mask)) << 1;
        this.f2992a = before | after;
        if (value) {
            h(index);
        } else {
            a(index);
        }
        if (lastBit || this.f2993b != null) {
            c();
            this.f2993b.e(0, lastBit);
        }
    }

    public boolean f(int index) {
        if (index >= 64) {
            c();
            return this.f2993b.f(index - 64);
        }
        long mask = 1 << index;
        long j2 = this.f2992a;
        boolean value = (j2 & mask) != 0;
        long j3 = j2 & (~mask);
        this.f2992a = j3;
        long mask2 = mask - 1;
        long before = j3 & mask2;
        long after = Long.rotateRight(j3 & (~mask2), 1);
        this.f2992a = before | after;
        d dVar = this.f2993b;
        if (dVar != null) {
            if (dVar.d(0)) {
                h(63);
            }
            this.f2993b.f(0);
        }
        return value;
    }

    public int b(int index) {
        d dVar = this.f2993b;
        if (dVar == null) {
            if (index >= 64) {
                return Long.bitCount(this.f2992a);
            }
            return Long.bitCount(this.f2992a & ((1 << index) - 1));
        } else if (index < 64) {
            return Long.bitCount(this.f2992a & ((1 << index) - 1));
        } else {
            return dVar.b(index - 64) + Long.bitCount(this.f2992a);
        }
    }

    public String toString() {
        if (this.f2993b == null) {
            return Long.toBinaryString(this.f2992a);
        }
        return this.f2993b.toString() + "xx" + Long.toBinaryString(this.f2992a);
    }
}
