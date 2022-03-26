package f0;

import android.os.Build;
import x.b;

/* JADX WARN: Classes with same name are omitted:
  
 */
/* loaded from: classes.dex */
public final class m1 {

    /* renamed from: a  reason: collision with root package name */
    public final q1 f1894a;

    public m1() {
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 30) {
            this.f1894a = new p1();
        } else if (i2 >= 29) {
            this.f1894a = new o1();
        } else {
            this.f1894a = new n1();
        }
    }

    public m1(x1 insets) {
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 30) {
            this.f1894a = new p1(insets);
        } else if (i2 >= 29) {
            this.f1894a = new o1(insets);
        } else {
            this.f1894a = new n1(insets);
        }
    }

    public m1 c(b insets) {
        this.f1894a.d(insets);
        return this;
    }

    public m1 b(b insets) {
        this.f1894a.c(insets);
        return this;
    }

    public x1 a() {
        return this.f1894a.b();
    }
}
