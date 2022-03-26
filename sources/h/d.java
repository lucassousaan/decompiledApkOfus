package h;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.view.menu.MenuItemImpl;
import java.util.ArrayList;

/* JADX WARN: Classes with same name are omitted:
  
 */
/* loaded from: classes.dex */
public abstract class d implements e0 {

    /* renamed from: b  reason: collision with root package name */
    public Context f2065b;

    /* renamed from: c  reason: collision with root package name */
    public Context f2066c;

    /* renamed from: d  reason: collision with root package name */
    public q f2067d;

    /* renamed from: e  reason: collision with root package name */
    public LayoutInflater f2068e;

    /* renamed from: f  reason: collision with root package name */
    public d0 f2069f;

    /* renamed from: g  reason: collision with root package name */
    public int f2070g;

    /* renamed from: h  reason: collision with root package name */
    public int f2071h;

    /* renamed from: i  reason: collision with root package name */
    public g0 f2072i;

    public abstract void e(t tVar, f0 f0Var);

    public abstract boolean q(int i2, t tVar);

    public d(Context context, int menuLayoutRes, int itemLayoutRes) {
        this.f2065b = context;
        this.f2068e = LayoutInflater.from(context);
        this.f2070g = menuLayoutRes;
        this.f2071h = itemLayoutRes;
    }

    @Override // h.e0
    public void f(Context context, q menu) {
        this.f2066c = context;
        LayoutInflater.from(context);
        this.f2067d = menu;
    }

    public g0 o(ViewGroup root) {
        if (this.f2072i == null) {
            g0 g0Var = (g0) this.f2068e.inflate(this.f2070g, root, false);
            this.f2072i = g0Var;
            g0Var.b(this.f2067d);
            k(true);
        }
        return this.f2072i;
    }

    @Override // h.e0
    public void k(boolean cleared) {
        ViewGroup parent = (ViewGroup) this.f2072i;
        if (parent != null) {
            int childIndex = 0;
            q qVar = this.f2067d;
            if (qVar != null) {
                qVar.r();
                ArrayList<MenuItemImpl> visibleItems = this.f2067d.E();
                int itemCount = visibleItems.size();
                for (int i2 = 0; i2 < itemCount; i2++) {
                    t item = (t) visibleItems.get(i2);
                    if (q(childIndex, item)) {
                        View convertView = parent.getChildAt(childIndex);
                        t oldItem = convertView instanceof f0 ? ((f0) convertView).getItemData() : null;
                        View itemView = n(item, convertView, parent);
                        if (item != oldItem) {
                            itemView.setPressed(false);
                            itemView.jumpDrawablesToCurrentState();
                        }
                        if (itemView != convertView) {
                            a(itemView, childIndex);
                        }
                        childIndex++;
                    }
                }
            }
            while (childIndex < parent.getChildCount()) {
                if (!l(parent, childIndex)) {
                    childIndex++;
                }
            }
        }
    }

    public void a(View itemView, int childIndex) {
        ViewGroup currentParent = (ViewGroup) itemView.getParent();
        if (currentParent != null) {
            currentParent.removeView(itemView);
        }
        ((ViewGroup) this.f2072i).addView(itemView, childIndex);
    }

    public boolean l(ViewGroup parent, int childIndex) {
        parent.removeViewAt(childIndex);
        return true;
    }

    @Override // h.e0
    public void d(d0 cb) {
        this.f2069f = cb;
    }

    public d0 m() {
        return this.f2069f;
    }

    public f0 i(ViewGroup parent) {
        return (f0) this.f2068e.inflate(this.f2071h, parent, false);
    }

    public View n(t item, View convertView, ViewGroup parent) {
        f0 itemView;
        if (convertView instanceof f0) {
            itemView = (f0) convertView;
        } else {
            itemView = i(parent);
        }
        e(item, itemView);
        return (View) itemView;
    }

    @Override // h.e0
    public void b(q menu, boolean allMenusAreClosing) {
        d0 d0Var = this.f2069f;
        if (d0Var != null) {
            d0Var.b(menu, allMenusAreClosing);
        }
    }

    @Override // h.e0
    public boolean h(m0 menu) {
        d0 d0Var = this.f2069f;
        if (d0Var == null) {
            return false;
        }
        return d0Var.c(menu != null ? menu : this.f2067d);
    }

    @Override // h.e0
    public boolean c(q menu, t item) {
        return false;
    }

    @Override // h.e0
    public boolean j(q menu, t item) {
        return false;
    }

    public void p(int id) {
    }
}
