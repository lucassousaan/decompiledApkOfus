package d;

import android.view.Window;
import h.d0;
import h.q;

/* JADX WARN: Classes with same name are omitted:
  
 */
/* loaded from: classes.dex */
public final class x implements d0 {

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ n0 f1752b;

    public x(n0 n0Var) {
        this.f1752b = n0Var;
    }

    @Override // h.d0
    public boolean c(q subMenu) {
        Window.Callback cb = this.f1752b.f0();
        if (cb == null) {
            return true;
        }
        cb.onMenuOpened(108, subMenu);
        return true;
    }

    @Override // h.d0
    public void b(q menu, boolean allMenusAreClosing) {
        this.f1752b.L(menu);
    }
}
