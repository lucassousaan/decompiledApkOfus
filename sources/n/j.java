package n;

import java.util.Arrays;

/* JADX WARN: Classes with same name are omitted:
  
 */
/* loaded from: classes.dex */
public class j implements Comparable {

    /* renamed from: b  reason: collision with root package name */
    public m f2524b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ k f2525c;

    public j(k this$0, k row) {
        this.f2525c = this$0;
    }

    public void b(m variable) {
        this.f2524b = variable;
    }

    public boolean a(m other, float value) {
        if (this.f2524b.f2538a) {
            boolean empty = true;
            for (int i2 = 0; i2 < 9; i2++) {
                float[] fArr = this.f2524b.f2546i;
                fArr[i2] = fArr[i2] + (other.f2546i[i2] * value);
                if (Math.abs(fArr[i2]) < 1.0E-4f) {
                    this.f2524b.f2546i[i2] = 0.0f;
                } else {
                    empty = false;
                }
            }
            if (!empty) {
                return false;
            }
            this.f2525c.G(this.f2524b);
            return false;
        }
        for (int i3 = 0; i3 < 9; i3++) {
            float strength = other.f2546i[i3];
            if (strength != 0.0f) {
                float v2 = value * strength;
                if (Math.abs(v2) < 1.0E-4f) {
                    v2 = 0.0f;
                }
                this.f2524b.f2546i[i3] = v2;
            } else {
                this.f2524b.f2546i[i3] = 0.0f;
            }
        }
        return true;
    }

    public final boolean c() {
        for (int i2 = 8; i2 >= 0; i2--) {
            float value = this.f2524b.f2546i[i2];
            if (value > 0.0f) {
                return false;
            }
            if (value < 0.0f) {
                return true;
            }
        }
        return false;
    }

    public final boolean d(m other) {
        for (int i2 = 8; i2 >= 0; i2--) {
            float comparedValue = other.f2546i[i2];
            float value = this.f2524b.f2546i[i2];
            if (value != comparedValue) {
                if (value < comparedValue) {
                    return true;
                } else {
                    return false;
                }
            }
        }
        return false;
    }

    @Override // java.lang.Comparable
    public int compareTo(Object o2) {
        m v2 = (m) o2;
        return this.f2524b.f2540c - v2.f2540c;
    }

    public void e() {
        Arrays.fill(this.f2524b.f2546i, 0.0f);
    }

    public String toString() {
        String result = "[ ";
        if (this.f2524b != null) {
            for (int i2 = 0; i2 < 9; i2++) {
                result = result + this.f2524b.f2546i[i2] + " ";
            }
        }
        return result + "] " + this.f2524b;
    }
}
