package f0;

import android.view.WindowInsets;
import x.b;

/* JADX WARN: Classes with same name are omitted:
  
 */
/* loaded from: classes.dex */
public class o1 extends q1 {

    /* renamed from: b  reason: collision with root package name */
    public final WindowInsets.Builder f1902b;

    public o1() {
        this.f1902b = new WindowInsets.Builder();
    }

    public o1(x1 insets) {
        super(insets);
        WindowInsets.Builder builder;
        WindowInsets platInsets = insets.r();
        if (platInsets != null) {
            builder = new WindowInsets.Builder(platInsets);
        } else {
            builder = new WindowInsets.Builder();
        }
        this.f1902b = builder;
    }

    @Override // f0.q1
    public void d(b insets) {
        this.f1902b.setSystemWindowInsets(insets.d());
    }

    @Override // f0.q1
    public void c(b insets) {
        this.f1902b.setStableInsets(insets.d());
    }

    @Override // f0.q1
    public x1 b() {
        a();
        x1 windowInsetsCompat = x1.s(this.f1902b.build());
        windowInsetsCompat.n(null);
        return windowInsetsCompat;
    }
}
