package f0;

import android.view.View;

/* JADX WARN: Classes with same name are omitted:
  
 */
/* loaded from: classes.dex */
public class z {

    /* renamed from: a  reason: collision with root package name */
    public int f1936a;

    /* renamed from: b  reason: collision with root package name */
    public int f1937b;

    public void c(View child, View target, int axes) {
        b(axes, 0);
    }

    public void b(int axes, int type) {
        if (type == 1) {
            this.f1937b = axes;
        } else {
            this.f1936a = axes;
        }
    }

    public int a() {
        return this.f1936a | this.f1937b;
    }

    public void d(int type) {
        if (type == 1) {
            this.f1937b = 0;
        } else {
            this.f1936a = 0;
        }
    }
}
