package h;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.view.ActionProvider;
import android.view.ContextMenu;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.example.helloworld.R;
import e.a;
import f0.e;
import z.b;

/* JADX WARN: Classes with same name are omitted:
  
 */
/* loaded from: classes.dex */
public final class t implements b {
    public e A;
    public MenuItem.OnActionExpandListener B;
    public ContextMenu.ContextMenuInfo D;

    /* renamed from: a  reason: collision with root package name */
    public final int f2179a;

    /* renamed from: b  reason: collision with root package name */
    public final int f2180b;

    /* renamed from: c  reason: collision with root package name */
    public final int f2181c;

    /* renamed from: d  reason: collision with root package name */
    public final int f2182d;

    /* renamed from: e  reason: collision with root package name */
    public CharSequence f2183e;

    /* renamed from: f  reason: collision with root package name */
    public CharSequence f2184f;

    /* renamed from: g  reason: collision with root package name */
    public Intent f2185g;

    /* renamed from: h  reason: collision with root package name */
    public char f2186h;

    /* renamed from: j  reason: collision with root package name */
    public char f2188j;

    /* renamed from: l  reason: collision with root package name */
    public Drawable f2190l;

    /* renamed from: n  reason: collision with root package name */
    public q f2192n;

    /* renamed from: o  reason: collision with root package name */
    public m0 f2193o;

    /* renamed from: p  reason: collision with root package name */
    public MenuItem.OnMenuItemClickListener f2194p;

    /* renamed from: q  reason: collision with root package name */
    public CharSequence f2195q;

    /* renamed from: r  reason: collision with root package name */
    public CharSequence f2196r;

    /* renamed from: y  reason: collision with root package name */
    public int f2203y;

    /* renamed from: z  reason: collision with root package name */
    public View f2204z;

    /* renamed from: i  reason: collision with root package name */
    public int f2187i = 4096;

    /* renamed from: k  reason: collision with root package name */
    public int f2189k = 4096;

    /* renamed from: m  reason: collision with root package name */
    public int f2191m = 0;

    /* renamed from: s  reason: collision with root package name */
    public ColorStateList f2197s = null;

    /* renamed from: t  reason: collision with root package name */
    public PorterDuff.Mode f2198t = null;

    /* renamed from: u  reason: collision with root package name */
    public boolean f2199u = false;

    /* renamed from: v  reason: collision with root package name */
    public boolean f2200v = false;

    /* renamed from: w  reason: collision with root package name */
    public boolean f2201w = false;

    /* renamed from: x  reason: collision with root package name */
    public int f2202x = 16;
    public boolean C = false;

    @Override // z.b, android.view.MenuItem
    public /* bridge */ /* synthetic */ MenuItem setActionView(int i2) {
        p(i2);
        return this;
    }

    @Override // z.b, android.view.MenuItem
    public /* bridge */ /* synthetic */ MenuItem setActionView(View view) {
        q(view);
        return this;
    }

    @Override // z.b, android.view.MenuItem
    public /* bridge */ /* synthetic */ MenuItem setShowAsActionFlags(int i2) {
        v(i2);
        return this;
    }

    public t(q menu, int group, int id, int categoryOrder, int ordering, CharSequence title, int showAsAction) {
        this.f2203y = 0;
        this.f2192n = menu;
        this.f2179a = id;
        this.f2180b = group;
        this.f2181c = categoryOrder;
        this.f2182d = ordering;
        this.f2183e = title;
        this.f2203y = showAsAction;
    }

    public boolean k() {
        MenuItem.OnMenuItemClickListener onMenuItemClickListener = this.f2194p;
        if (onMenuItemClickListener != null && onMenuItemClickListener.onMenuItemClick(this)) {
            return true;
        }
        q qVar = this.f2192n;
        if (qVar.h(qVar, this)) {
            return true;
        }
        if (this.f2185g != null) {
            try {
                this.f2192n.u().startActivity(this.f2185g);
                return true;
            } catch (ActivityNotFoundException e2) {
                Log.e("MenuItemImpl", "Can't find activity to handle intent; ignoring", e2);
            }
        }
        e eVar = this.A;
        return eVar != null && eVar.d();
    }

    @Override // android.view.MenuItem
    public boolean isEnabled() {
        return (this.f2202x & 16) != 0;
    }

    @Override // android.view.MenuItem
    public MenuItem setEnabled(boolean enabled) {
        if (enabled) {
            this.f2202x |= 16;
        } else {
            this.f2202x &= -17;
        }
        this.f2192n.K(false);
        return this;
    }

    @Override // android.view.MenuItem
    public int getGroupId() {
        return this.f2180b;
    }

    @Override // android.view.MenuItem
    public int getItemId() {
        return this.f2179a;
    }

    @Override // android.view.MenuItem
    public int getOrder() {
        return this.f2181c;
    }

    public int f() {
        return this.f2182d;
    }

    @Override // android.view.MenuItem
    public Intent getIntent() {
        return this.f2185g;
    }

    @Override // android.view.MenuItem
    public MenuItem setIntent(Intent intent) {
        this.f2185g = intent;
        return this;
    }

    @Override // android.view.MenuItem
    public char getAlphabeticShortcut() {
        return this.f2188j;
    }

    @Override // android.view.MenuItem
    public MenuItem setAlphabeticShortcut(char alphaChar) {
        if (this.f2188j == alphaChar) {
            return this;
        }
        this.f2188j = Character.toLowerCase(alphaChar);
        this.f2192n.K(false);
        return this;
    }

    @Override // z.b, android.view.MenuItem
    public MenuItem setAlphabeticShortcut(char alphaChar, int alphaModifiers) {
        if (this.f2188j == alphaChar && this.f2189k == alphaModifiers) {
            return this;
        }
        this.f2188j = Character.toLowerCase(alphaChar);
        this.f2189k = KeyEvent.normalizeMetaState(alphaModifiers);
        this.f2192n.K(false);
        return this;
    }

    @Override // z.b, android.view.MenuItem
    public int getAlphabeticModifiers() {
        return this.f2189k;
    }

    @Override // android.view.MenuItem
    public char getNumericShortcut() {
        return this.f2186h;
    }

    @Override // z.b, android.view.MenuItem
    public int getNumericModifiers() {
        return this.f2187i;
    }

    @Override // android.view.MenuItem
    public MenuItem setNumericShortcut(char numericChar) {
        if (this.f2186h == numericChar) {
            return this;
        }
        this.f2186h = numericChar;
        this.f2192n.K(false);
        return this;
    }

    @Override // z.b, android.view.MenuItem
    public MenuItem setNumericShortcut(char numericChar, int numericModifiers) {
        if (this.f2186h == numericChar && this.f2187i == numericModifiers) {
            return this;
        }
        this.f2186h = numericChar;
        this.f2187i = KeyEvent.normalizeMetaState(numericModifiers);
        this.f2192n.K(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setShortcut(char numericChar, char alphaChar) {
        this.f2186h = numericChar;
        this.f2188j = Character.toLowerCase(alphaChar);
        this.f2192n.K(false);
        return this;
    }

    @Override // z.b, android.view.MenuItem
    public MenuItem setShortcut(char numericChar, char alphaChar, int numericModifiers, int alphaModifiers) {
        this.f2186h = numericChar;
        this.f2187i = KeyEvent.normalizeMetaState(numericModifiers);
        this.f2188j = Character.toLowerCase(alphaChar);
        this.f2189k = KeyEvent.normalizeMetaState(alphaModifiers);
        this.f2192n.K(false);
        return this;
    }

    public char g() {
        return this.f2192n.G() ? this.f2188j : this.f2186h;
    }

    public String h() {
        char shortcut = g();
        if (shortcut == 0) {
            return "";
        }
        Resources res = this.f2192n.u().getResources();
        StringBuilder sb = new StringBuilder();
        if (ViewConfiguration.get(this.f2192n.u()).hasPermanentMenuKey()) {
            sb.append(res.getString(R.string.abc_prepend_shortcut_label));
        }
        int modifiers = this.f2192n.G() ? this.f2189k : this.f2187i;
        d(sb, modifiers, 65536, res.getString(R.string.abc_menu_meta_shortcut_label));
        d(sb, modifiers, 4096, res.getString(R.string.abc_menu_ctrl_shortcut_label));
        d(sb, modifiers, 2, res.getString(R.string.abc_menu_alt_shortcut_label));
        d(sb, modifiers, 1, res.getString(R.string.abc_menu_shift_shortcut_label));
        d(sb, modifiers, 4, res.getString(R.string.abc_menu_sym_shortcut_label));
        d(sb, modifiers, 8, res.getString(R.string.abc_menu_function_shortcut_label));
        switch (shortcut) {
            case '\b':
                sb.append(res.getString(R.string.abc_menu_delete_shortcut_label));
                break;
            case '\n':
                sb.append(res.getString(R.string.abc_menu_enter_shortcut_label));
                break;
            case ' ':
                sb.append(res.getString(R.string.abc_menu_space_shortcut_label));
                break;
            default:
                sb.append(shortcut);
                break;
        }
        return sb.toString();
    }

    public static void d(StringBuilder sb, int modifiers, int flag, String label) {
        if ((modifiers & flag) == flag) {
            sb.append(label);
        }
    }

    public boolean z() {
        return this.f2192n.H() && g() != 0;
    }

    @Override // android.view.MenuItem
    public SubMenu getSubMenu() {
        return this.f2193o;
    }

    @Override // android.view.MenuItem
    public boolean hasSubMenu() {
        return this.f2193o != null;
    }

    public void w(m0 subMenu) {
        this.f2193o = subMenu;
        subMenu.setHeaderTitle(getTitle());
    }

    @Override // android.view.MenuItem
    public CharSequence getTitle() {
        return this.f2183e;
    }

    public CharSequence i(f0 itemView) {
        if (itemView == null || !itemView.d()) {
            return getTitle();
        }
        return getTitleCondensed();
    }

    @Override // android.view.MenuItem
    public MenuItem setTitle(CharSequence title) {
        this.f2183e = title;
        this.f2192n.K(false);
        m0 m0Var = this.f2193o;
        if (m0Var != null) {
            m0Var.setHeaderTitle(title);
        }
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitle(int title) {
        setTitle(this.f2192n.u().getString(title));
        return this;
    }

    @Override // android.view.MenuItem
    public CharSequence getTitleCondensed() {
        CharSequence ctitle = this.f2184f;
        return ctitle != null ? ctitle : this.f2183e;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitleCondensed(CharSequence title) {
        this.f2184f = title;
        if (title == null) {
            CharSequence title2 = this.f2183e;
        }
        this.f2192n.K(false);
        return this;
    }

    @Override // android.view.MenuItem
    public Drawable getIcon() {
        Drawable drawable = this.f2190l;
        if (drawable != null) {
            return e(drawable);
        }
        if (this.f2191m == 0) {
            return null;
        }
        Drawable icon = a.b(this.f2192n.u(), this.f2191m);
        this.f2191m = 0;
        this.f2190l = icon;
        return e(icon);
    }

    @Override // android.view.MenuItem
    public MenuItem setIcon(Drawable icon) {
        this.f2191m = 0;
        this.f2190l = icon;
        this.f2201w = true;
        this.f2192n.K(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIcon(int iconResId) {
        this.f2190l = null;
        this.f2191m = iconResId;
        this.f2201w = true;
        this.f2192n.K(false);
        return this;
    }

    @Override // z.b, android.view.MenuItem
    public MenuItem setIconTintList(ColorStateList iconTintList) {
        this.f2197s = iconTintList;
        this.f2199u = true;
        this.f2201w = true;
        this.f2192n.K(false);
        return this;
    }

    @Override // z.b, android.view.MenuItem
    public ColorStateList getIconTintList() {
        return this.f2197s;
    }

    @Override // z.b, android.view.MenuItem
    public MenuItem setIconTintMode(PorterDuff.Mode iconTintMode) {
        this.f2198t = iconTintMode;
        this.f2200v = true;
        this.f2201w = true;
        this.f2192n.K(false);
        return this;
    }

    @Override // z.b, android.view.MenuItem
    public PorterDuff.Mode getIconTintMode() {
        return this.f2198t;
    }

    public final Drawable e(Drawable icon) {
        if (icon != null && this.f2201w && (this.f2199u || this.f2200v)) {
            icon = y.a.l(icon).mutate();
            if (this.f2199u) {
                y.a.i(icon, this.f2197s);
            }
            if (this.f2200v) {
                y.a.j(icon, this.f2198t);
            }
            this.f2201w = false;
        }
        return icon;
    }

    @Override // android.view.MenuItem
    public boolean isCheckable() {
        return (this.f2202x & 1) == 1;
    }

    @Override // android.view.MenuItem
    public MenuItem setCheckable(boolean checkable) {
        int oldFlags = this.f2202x;
        int i2 = (this.f2202x & (-2)) | (checkable ? 1 : 0);
        this.f2202x = i2;
        if (oldFlags != i2) {
            this.f2192n.K(false);
        }
        return this;
    }

    public void t(boolean exclusive) {
        this.f2202x = (this.f2202x & (-5)) | (exclusive ? 4 : 0);
    }

    public boolean m() {
        return (this.f2202x & 4) != 0;
    }

    @Override // android.view.MenuItem
    public boolean isChecked() {
        return (this.f2202x & 2) == 2;
    }

    @Override // android.view.MenuItem
    public MenuItem setChecked(boolean checked) {
        if ((this.f2202x & 4) != 0) {
            this.f2192n.T(this);
        } else {
            s(checked);
        }
        return this;
    }

    public void s(boolean checked) {
        int oldFlags = this.f2202x;
        int i2 = (this.f2202x & (-3)) | (checked ? 2 : 0);
        this.f2202x = i2;
        if (oldFlags != i2) {
            this.f2192n.K(false);
        }
    }

    @Override // android.view.MenuItem
    public boolean isVisible() {
        e eVar = this.A;
        return (eVar == null || !eVar.f()) ? (this.f2202x & 8) == 0 : (this.f2202x & 8) == 0 && this.A.b();
    }

    public boolean x(boolean shown) {
        int oldFlags = this.f2202x;
        int i2 = (this.f2202x & (-9)) | (shown ? 0 : 8);
        this.f2202x = i2;
        return oldFlags != i2;
    }

    @Override // android.view.MenuItem
    public MenuItem setVisible(boolean shown) {
        if (x(shown)) {
            this.f2192n.J(this);
        }
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener clickListener) {
        this.f2194p = clickListener;
        return this;
    }

    public String toString() {
        CharSequence charSequence = this.f2183e;
        if (charSequence != null) {
            return charSequence.toString();
        }
        return null;
    }

    @Override // android.view.MenuItem
    public ContextMenu.ContextMenuInfo getMenuInfo() {
        return this.D;
    }

    public void c() {
        this.f2192n.I(this);
    }

    public boolean y() {
        this.f2192n.A();
        return false;
    }

    public boolean l() {
        return (this.f2202x & 32) == 32;
    }

    public boolean n() {
        return (this.f2203y & 1) == 1;
    }

    public boolean o() {
        return (this.f2203y & 2) == 2;
    }

    public void u(boolean isActionButton) {
        if (isActionButton) {
            this.f2202x |= 32;
        } else {
            this.f2202x &= -33;
        }
    }

    public boolean A() {
        return (this.f2203y & 4) == 4;
    }

    @Override // z.b, android.view.MenuItem
    public void setShowAsAction(int actionEnum) {
        switch (actionEnum & 3) {
            case 0:
            case 1:
            case 2:
                this.f2203y = actionEnum;
                this.f2192n.I(this);
                return;
            default:
                throw new IllegalArgumentException("SHOW_AS_ACTION_ALWAYS, SHOW_AS_ACTION_IF_ROOM, and SHOW_AS_ACTION_NEVER are mutually exclusive.");
        }
    }

    public b q(View view) {
        int i2;
        this.f2204z = view;
        this.A = null;
        if (view != null && view.getId() == -1 && (i2 = this.f2179a) > 0) {
            view.setId(i2);
        }
        this.f2192n.I(this);
        return this;
    }

    public b p(int resId) {
        Context context = this.f2192n.u();
        LayoutInflater inflater = LayoutInflater.from(context);
        q(inflater.inflate(resId, (ViewGroup) new LinearLayout(context), false));
        return this;
    }

    @Override // z.b, android.view.MenuItem
    public View getActionView() {
        View view = this.f2204z;
        if (view != null) {
            return view;
        }
        e eVar = this.A;
        if (eVar == null) {
            return null;
        }
        View c2 = eVar.c(this);
        this.f2204z = c2;
        return c2;
    }

    @Override // android.view.MenuItem
    public MenuItem setActionProvider(ActionProvider actionProvider) {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.setActionProvider()");
    }

    @Override // android.view.MenuItem
    public ActionProvider getActionProvider() {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.getActionProvider()");
    }

    @Override // z.b
    public e a() {
        return this.A;
    }

    @Override // z.b
    public b b(e actionProvider) {
        e eVar = this.A;
        if (eVar != null) {
            eVar.g();
        }
        this.f2204z = null;
        this.A = actionProvider;
        this.f2192n.K(true);
        e eVar2 = this.A;
        if (eVar2 != null) {
            eVar2.i(new s(this));
        }
        return this;
    }

    public b v(int actionEnum) {
        setShowAsAction(actionEnum);
        return this;
    }

    @Override // z.b, android.view.MenuItem
    public boolean expandActionView() {
        if (!j()) {
            return false;
        }
        MenuItem.OnActionExpandListener onActionExpandListener = this.B;
        if (onActionExpandListener == null || onActionExpandListener.onMenuItemActionExpand(this)) {
            return this.f2192n.k(this);
        }
        return false;
    }

    @Override // z.b, android.view.MenuItem
    public boolean collapseActionView() {
        if ((this.f2203y & 8) == 0) {
            return false;
        }
        if (this.f2204z == null) {
            return true;
        }
        MenuItem.OnActionExpandListener onActionExpandListener = this.B;
        if (onActionExpandListener == null || onActionExpandListener.onMenuItemActionCollapse(this)) {
            return this.f2192n.f(this);
        }
        return false;
    }

    public boolean j() {
        e eVar;
        if ((this.f2203y & 8) == 0) {
            return false;
        }
        if (this.f2204z == null && (eVar = this.A) != null) {
            this.f2204z = eVar.c(this);
        }
        return this.f2204z != null;
    }

    public void r(boolean isExpanded) {
        this.C = isExpanded;
        this.f2192n.K(false);
    }

    @Override // z.b, android.view.MenuItem
    public boolean isActionViewExpanded() {
        return this.C;
    }

    @Override // android.view.MenuItem
    public MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener listener) {
        this.B = listener;
        return this;
    }

    @Override // z.b, android.view.MenuItem
    public b setContentDescription(CharSequence contentDescription) {
        this.f2195q = contentDescription;
        this.f2192n.K(false);
        return this;
    }

    @Override // z.b, android.view.MenuItem
    public CharSequence getContentDescription() {
        return this.f2195q;
    }

    @Override // z.b, android.view.MenuItem
    public b setTooltipText(CharSequence tooltipText) {
        this.f2196r = tooltipText;
        this.f2192n.K(false);
        return this;
    }

    @Override // z.b, android.view.MenuItem
    public CharSequence getTooltipText() {
        return this.f2196r;
    }
}
