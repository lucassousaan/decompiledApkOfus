package f0;

import android.view.WindowInsets;
import x.b;

/* JADX WARN: Classes with same name are omitted:
  
 */
/* loaded from: classes.dex */
public class u1 extends t1 {

    /* renamed from: n  reason: collision with root package name */
    public b f1923n = null;

    /* renamed from: o  reason: collision with root package name */
    public b f1924o = null;

    /* renamed from: p  reason: collision with root package name */
    public b f1925p = null;

    public u1(x1 host, WindowInsets insets) {
        super(host, insets);
    }

    public u1(x1 host, u1 other) {
        super(host, other);
    }

    @Override // f0.w1
    public b g() {
        if (this.f1924o == null) {
            this.f1924o = b.c(this.f1916c.getMandatorySystemGestureInsets());
        }
        return this.f1924o;
    }

    @Override // f0.r1, f0.w1
    public x1 j(int left, int top, int right, int bottom) {
        return x1.s(this.f1916c.inset(left, top, right, bottom));
    }

    @Override // f0.s1, f0.w1
    public void p(b stableInsets) {
    }
}
