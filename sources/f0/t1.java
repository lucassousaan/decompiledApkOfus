package f0;

import android.view.WindowInsets;
import java.util.Objects;

/* JADX WARN: Classes with same name are omitted:
  
 */
/* loaded from: classes.dex */
public class t1 extends s1 {
    public t1(x1 host, WindowInsets insets) {
        super(host, insets);
    }

    public t1(x1 host, t1 other) {
        super(host, other);
    }

    @Override // f0.w1
    public n f() {
        return n.a(this.f1916c.getDisplayCutout());
    }

    @Override // f0.w1
    public x1 a() {
        return x1.s(this.f1916c.consumeDisplayCutout());
    }

    @Override // f0.r1, f0.w1
    public boolean equals(Object o2) {
        if (this == o2) {
            return true;
        }
        if (!(o2 instanceof t1)) {
            return false;
        }
        t1 otherImpl28 = (t1) o2;
        return Objects.equals(this.f1916c, otherImpl28.f1916c) && Objects.equals(this.f1920g, otherImpl28.f1920g);
    }

    @Override // f0.w1
    public int hashCode() {
        return this.f1916c.hashCode();
    }
}
