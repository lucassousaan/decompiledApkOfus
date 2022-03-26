package g;

import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;

/* JADX WARN: Classes with same name are omitted:
  
 */
/* loaded from: classes.dex */
public abstract class c {

    /* renamed from: b  reason: collision with root package name */
    public Object f1940b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f1941c;

    public abstract void c();

    public abstract View d();

    public abstract Menu e();

    public abstract MenuInflater f();

    public abstract CharSequence g();

    public abstract CharSequence i();

    public abstract void k();

    public abstract boolean l();

    public abstract void m(View view);

    public abstract void n(int i2);

    public abstract void o(CharSequence charSequence);

    public abstract void q(int i2);

    public abstract void r(CharSequence charSequence);

    public void p(Object tag) {
        this.f1940b = tag;
    }

    public Object h() {
        return this.f1940b;
    }

    public void s(boolean titleOptional) {
        this.f1941c = titleOptional;
    }

    public boolean j() {
        return this.f1941c;
    }
}
