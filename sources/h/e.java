package h;

import android.content.Context;
import android.view.MenuItem;
import android.view.SubMenu;
import k.n;
import z.b;

/* JADX WARN: Classes with same name are omitted:
  
 */
/* loaded from: classes.dex */
public abstract class e {

    /* renamed from: a  reason: collision with root package name */
    public final Context f2073a;

    /* renamed from: b  reason: collision with root package name */
    public n f2074b;

    public e(Context context) {
        this.f2073a = context;
    }

    public final MenuItem c(MenuItem menuItem) {
        if (!(menuItem instanceof b)) {
            return menuItem;
        }
        b supportMenuItem = (b) menuItem;
        if (this.f2074b == null) {
            this.f2074b = new n();
        }
        MenuItem wrappedItem = (MenuItem) this.f2074b.get(menuItem);
        if (wrappedItem != null) {
            return wrappedItem;
        }
        MenuItem wrappedItem2 = new z(this.f2073a, supportMenuItem);
        this.f2074b.put(supportMenuItem, wrappedItem2);
        return wrappedItem2;
    }

    public final SubMenu d(SubMenu subMenu) {
        return subMenu;
    }

    public final void e() {
        n nVar = this.f2074b;
        if (nVar != null) {
            nVar.clear();
        }
    }

    public final void f(int groupId) {
        if (this.f2074b != null) {
            int i2 = 0;
            while (i2 < this.f2074b.size()) {
                if (((b) this.f2074b.i(i2)).getGroupId() == groupId) {
                    this.f2074b.j(i2);
                    i2--;
                }
                i2++;
            }
        }
    }

    public final void g(int id) {
        if (this.f2074b != null) {
            for (int i2 = 0; i2 < this.f2074b.size(); i2++) {
                if (((b) this.f2074b.i(i2)).getItemId() == id) {
                    this.f2074b.j(i2);
                    return;
                }
            }
        }
    }
}
