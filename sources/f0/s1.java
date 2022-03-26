package f0;

import android.view.WindowInsets;
import x.b;

/* JADX WARN: Classes with same name are omitted:
  
 */
/* loaded from: classes.dex */
public class s1 extends r1 {

    /* renamed from: m  reason: collision with root package name */
    public b f1921m;

    public s1(x1 host, WindowInsets insets) {
        super(host, insets);
        this.f1921m = null;
    }

    public s1(x1 host, s1 other) {
        super(host, other);
        this.f1921m = null;
        this.f1921m = other.f1921m;
    }

    @Override // f0.w1
    public boolean k() {
        return this.f1916c.isConsumed();
    }

    @Override // f0.w1
    public x1 b() {
        return x1.s(this.f1916c.consumeStableInsets());
    }

    @Override // f0.w1
    public x1 c() {
        return x1.s(this.f1916c.consumeSystemWindowInsets());
    }

    @Override // f0.w1
    public final b h() {
        if (this.f1921m == null) {
            this.f1921m = b.a(this.f1916c.getStableInsetLeft(), this.f1916c.getStableInsetTop(), this.f1916c.getStableInsetRight(), this.f1916c.getStableInsetBottom());
        }
        return this.f1921m;
    }

    @Override // f0.w1
    public void p(b stableInsets) {
        this.f1921m = stableInsets;
    }
}
