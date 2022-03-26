package h;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;

/* JADX WARN: Classes with same name are omitted:
  
 */
/* loaded from: classes.dex */
public class m0 extends q implements SubMenu {
    public q A;
    public t B;

    public m0(Context context, q parentMenu, t item) {
        super(context);
        this.A = parentMenu;
        this.B = item;
    }

    @Override // h.q, android.view.Menu
    public void setQwertyMode(boolean isQwerty) {
        this.A.setQwertyMode(isQwerty);
    }

    @Override // h.q
    public boolean G() {
        return this.A.G();
    }

    @Override // h.q
    public boolean H() {
        return this.A.H();
    }

    public Menu e0() {
        return this.A;
    }

    @Override // android.view.SubMenu
    public MenuItem getItem() {
        return this.B;
    }

    @Override // h.q
    public void R(o callback) {
        this.A.R(callback);
    }

    @Override // h.q
    public q D() {
        return this.A.D();
    }

    @Override // h.q
    public boolean h(q menu, MenuItem item) {
        return super.h(menu, item) || this.A.h(menu, item);
    }

    @Override // android.view.SubMenu
    public SubMenu setIcon(Drawable icon) {
        this.B.setIcon(icon);
        return this;
    }

    @Override // android.view.SubMenu
    public SubMenu setIcon(int iconRes) {
        this.B.setIcon(iconRes);
        return this;
    }

    @Override // android.view.SubMenu
    public SubMenu setHeaderIcon(Drawable icon) {
        V(icon);
        return this;
    }

    @Override // android.view.SubMenu
    public SubMenu setHeaderIcon(int iconRes) {
        U(iconRes);
        return this;
    }

    @Override // android.view.SubMenu
    public SubMenu setHeaderTitle(CharSequence title) {
        Y(title);
        return this;
    }

    @Override // android.view.SubMenu
    public SubMenu setHeaderTitle(int titleRes) {
        X(titleRes);
        return this;
    }

    @Override // android.view.SubMenu
    public SubMenu setHeaderView(View view) {
        Z(view);
        return this;
    }

    @Override // h.q
    public boolean k(t item) {
        return this.A.k(item);
    }

    @Override // h.q
    public boolean f(t item) {
        return this.A.f(item);
    }

    @Override // h.q
    public String t() {
        t tVar = this.B;
        int itemId = tVar != null ? tVar.getItemId() : 0;
        if (itemId == 0) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        super.t();
        sb.append("android:menu:actionviewstates");
        sb.append(":");
        sb.append(itemId);
        return sb.toString();
    }

    @Override // h.q, android.view.Menu
    public void setGroupDividerEnabled(boolean groupDividerEnabled) {
        this.A.setGroupDividerEnabled(groupDividerEnabled);
    }

    @Override // h.q
    public boolean F() {
        return this.A.F();
    }
}
