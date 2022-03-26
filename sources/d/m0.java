package d;

import android.view.Menu;
import android.view.Window;
import h.d0;
import h.q;

/* JADX WARN: Classes with same name are omitted:
  
 */
/* loaded from: classes.dex */
public final class m0 implements d0 {

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ n0 f1680b;

    public m0(n0 n0Var) {
        this.f1680b = n0Var;
    }

    @Override // h.d0
    public void b(q menu, boolean allMenusAreClosing) {
        Menu parentMenu = menu.D();
        boolean isSubMenu = parentMenu != menu;
        l0 panel = this.f1680b.Y(isSubMenu ? parentMenu : menu);
        if (panel == null) {
            return;
        }
        if (isSubMenu) {
            this.f1680b.K(panel.f1662a, panel, parentMenu);
            this.f1680b.O(panel, true);
            return;
        }
        this.f1680b.O(panel, allMenusAreClosing);
    }

    @Override // h.d0
    public boolean c(q subMenu) {
        Window.Callback cb;
        if (subMenu != subMenu.D()) {
            return true;
        }
        n0 n0Var = this.f1680b;
        if (!n0Var.B || (cb = n0Var.f0()) == null || this.f1680b.N) {
            return true;
        }
        cb.onMenuOpened(108, subMenu);
        return true;
    }
}
