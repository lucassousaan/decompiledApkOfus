package f0;

import android.os.Build;
import android.view.View;
import android.view.WindowInsets;

/* JADX WARN: Classes with same name are omitted:
  
 */
/* loaded from: classes.dex */
public class q0 implements View.OnApplyWindowInsetsListener {

    /* renamed from: a  reason: collision with root package name */
    public x1 f1907a = null;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ View f1908b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ a0 f1909c;

    public q0(View view, a0 a0Var) {
        this.f1908b = view;
        this.f1909c = a0Var;
    }

    @Override // android.view.View.OnApplyWindowInsetsListener
    public WindowInsets onApplyWindowInsets(View view, WindowInsets insets) {
        x1 compatInsets = x1.t(insets, view);
        int i2 = Build.VERSION.SDK_INT;
        if (i2 < 30) {
            r0.a(insets, this.f1908b);
            if (compatInsets.equals(this.f1907a)) {
                return this.f1909c.a(view, compatInsets).r();
            }
        }
        this.f1907a = compatInsets;
        x1 compatInsets2 = this.f1909c.a(view, compatInsets);
        if (i2 >= 30) {
            return compatInsets2.r();
        }
        c1.i0(view);
        return compatInsets2.r();
    }
}
