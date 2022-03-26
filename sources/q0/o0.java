package q0;

import android.graphics.Rect;
import android.view.View;

/* JADX WARN: Classes with same name are omitted:
  
 */
/* loaded from: classes.dex */
public abstract class o0 {

    /* renamed from: a  reason: collision with root package name */
    public final m1 f3153a;

    /* renamed from: b  reason: collision with root package name */
    public int f3154b;

    /* renamed from: c  reason: collision with root package name */
    public final Rect f3155c;

    public abstract int d(View view);

    public abstract int e(View view);

    public abstract int f(View view);

    public abstract int g(View view);

    public abstract int h();

    public abstract int i();

    public abstract int j();

    public abstract int k();

    public abstract int l();

    public abstract int m();

    public abstract int n();

    public abstract int p(View view);

    public abstract int q(View view);

    public abstract void r(int i2);

    public /* synthetic */ o0(m1 x02, m0 x1) {
        this(x02);
    }

    public o0(m1 layoutManager) {
        this.f3154b = Integer.MIN_VALUE;
        this.f3155c = new Rect();
        this.f3153a = layoutManager;
    }

    public void s() {
        this.f3154b = n();
    }

    public int o() {
        if (Integer.MIN_VALUE == this.f3154b) {
            return 0;
        }
        return n() - this.f3154b;
    }

    public static o0 b(m1 layoutManager, int orientation) {
        switch (orientation) {
            case 0:
                return a(layoutManager);
            case 1:
                return c(layoutManager);
            default:
                throw new IllegalArgumentException("invalid orientation");
        }
    }

    public static o0 a(m1 layoutManager) {
        return new m0(layoutManager);
    }

    public static o0 c(m1 layoutManager) {
        return new n0(layoutManager);
    }
}
