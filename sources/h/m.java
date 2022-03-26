package h;

import android.content.Context;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import androidx.appcompat.view.menu.ExpandedMenuView;
import com.example.helloworld.R;

/* JADX WARN: Classes with same name are omitted:
  
 */
/* loaded from: classes.dex */
public class m implements e0, AdapterView.OnItemClickListener {

    /* renamed from: b  reason: collision with root package name */
    public Context f2135b;

    /* renamed from: c  reason: collision with root package name */
    public LayoutInflater f2136c;

    /* renamed from: d  reason: collision with root package name */
    public q f2137d;

    /* renamed from: e  reason: collision with root package name */
    public ExpandedMenuView f2138e;

    /* renamed from: f  reason: collision with root package name */
    public int f2139f;

    /* renamed from: g  reason: collision with root package name */
    public int f2140g;

    /* renamed from: h  reason: collision with root package name */
    public d0 f2141h;

    /* renamed from: i  reason: collision with root package name */
    public l f2142i;

    public m(Context context, int itemLayoutRes) {
        this(itemLayoutRes, 0);
        this.f2135b = context;
        this.f2136c = LayoutInflater.from(context);
    }

    public m(int itemLayoutRes, int themeRes) {
        this.f2140g = itemLayoutRes;
        this.f2139f = themeRes;
    }

    @Override // h.e0
    public void f(Context context, q menu) {
        if (this.f2139f != 0) {
            ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context, this.f2139f);
            this.f2135b = contextThemeWrapper;
            this.f2136c = LayoutInflater.from(contextThemeWrapper);
        } else if (this.f2135b != null) {
            this.f2135b = context;
            if (this.f2136c == null) {
                this.f2136c = LayoutInflater.from(context);
            }
        }
        this.f2137d = menu;
        l lVar = this.f2142i;
        if (lVar != null) {
            lVar.notifyDataSetChanged();
        }
    }

    public g0 e(ViewGroup root) {
        if (this.f2138e == null) {
            this.f2138e = (ExpandedMenuView) this.f2136c.inflate(R.layout.abc_expanded_menu_layout, root, false);
            if (this.f2142i == null) {
                this.f2142i = new l(this);
            }
            this.f2138e.setAdapter((ListAdapter) this.f2142i);
            this.f2138e.setOnItemClickListener(this);
        }
        return this.f2138e;
    }

    public ListAdapter a() {
        if (this.f2142i == null) {
            this.f2142i = new l(this);
        }
        return this.f2142i;
    }

    @Override // h.e0
    public void k(boolean cleared) {
        l lVar = this.f2142i;
        if (lVar != null) {
            lVar.notifyDataSetChanged();
        }
    }

    @Override // h.e0
    public void d(d0 cb) {
        this.f2141h = cb;
    }

    @Override // h.e0
    public boolean h(m0 subMenu) {
        if (!subMenu.hasVisibleItems()) {
            return false;
        }
        new r(subMenu).d(null);
        d0 d0Var = this.f2141h;
        if (d0Var == null) {
            return true;
        }
        d0Var.c(subMenu);
        return true;
    }

    @Override // h.e0
    public void b(q menu, boolean allMenusAreClosing) {
        d0 d0Var = this.f2141h;
        if (d0Var != null) {
            d0Var.b(menu, allMenusAreClosing);
        }
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public void onItemClick(AdapterView adapterView, View view, int position, long id) {
        this.f2137d.M(this.f2142i.getItem(position), this, 0);
    }

    @Override // h.e0
    public boolean g() {
        return false;
    }

    @Override // h.e0
    public boolean c(q menu, t item) {
        return false;
    }

    @Override // h.e0
    public boolean j(q menu, t item) {
        return false;
    }
}
