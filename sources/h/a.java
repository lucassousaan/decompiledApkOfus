package h;

import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.ActionProvider;
import android.view.ContextMenu;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import f0.e;
import v.d;
import z.b;

/* JADX WARN: Classes with same name are omitted:
  
 */
/* loaded from: classes.dex */
public class a implements b {

    /* renamed from: a  reason: collision with root package name */
    public final int f2031a;

    /* renamed from: b  reason: collision with root package name */
    public final int f2032b;

    /* renamed from: c  reason: collision with root package name */
    public final int f2033c;

    /* renamed from: d  reason: collision with root package name */
    public CharSequence f2034d;

    /* renamed from: e  reason: collision with root package name */
    public CharSequence f2035e;

    /* renamed from: f  reason: collision with root package name */
    public Intent f2036f;

    /* renamed from: g  reason: collision with root package name */
    public char f2037g;

    /* renamed from: i  reason: collision with root package name */
    public char f2039i;

    /* renamed from: k  reason: collision with root package name */
    public Drawable f2041k;

    /* renamed from: l  reason: collision with root package name */
    public Context f2042l;

    /* renamed from: m  reason: collision with root package name */
    public CharSequence f2043m;

    /* renamed from: n  reason: collision with root package name */
    public CharSequence f2044n;

    /* renamed from: h  reason: collision with root package name */
    public int f2038h = 4096;

    /* renamed from: j  reason: collision with root package name */
    public int f2040j = 4096;

    /* renamed from: o  reason: collision with root package name */
    public ColorStateList f2045o = null;

    /* renamed from: p  reason: collision with root package name */
    public PorterDuff.Mode f2046p = null;

    /* renamed from: q  reason: collision with root package name */
    public boolean f2047q = false;

    /* renamed from: r  reason: collision with root package name */
    public boolean f2048r = false;

    /* renamed from: s  reason: collision with root package name */
    public int f2049s = 16;

    @Override // z.b, android.view.MenuItem
    public /* bridge */ /* synthetic */ MenuItem setActionView(int i2) {
        e();
        throw null;
    }

    @Override // z.b, android.view.MenuItem
    public /* bridge */ /* synthetic */ MenuItem setActionView(View view) {
        d();
        throw null;
    }

    @Override // z.b, android.view.MenuItem
    public /* bridge */ /* synthetic */ MenuItem setShowAsActionFlags(int i2) {
        f(i2);
        return this;
    }

    public a(Context context, int group, int id, int ordering, CharSequence title) {
        this.f2042l = context;
        this.f2031a = id;
        this.f2032b = group;
        this.f2033c = ordering;
        this.f2034d = title;
    }

    @Override // android.view.MenuItem
    public char getAlphabeticShortcut() {
        return this.f2039i;
    }

    @Override // z.b, android.view.MenuItem
    public int getAlphabeticModifiers() {
        return this.f2040j;
    }

    @Override // android.view.MenuItem
    public int getGroupId() {
        return this.f2032b;
    }

    @Override // android.view.MenuItem
    public Drawable getIcon() {
        return this.f2041k;
    }

    @Override // android.view.MenuItem
    public Intent getIntent() {
        return this.f2036f;
    }

    @Override // android.view.MenuItem
    public int getItemId() {
        return this.f2031a;
    }

    @Override // android.view.MenuItem
    public ContextMenu.ContextMenuInfo getMenuInfo() {
        return null;
    }

    @Override // android.view.MenuItem
    public char getNumericShortcut() {
        return this.f2037g;
    }

    @Override // z.b, android.view.MenuItem
    public int getNumericModifiers() {
        return this.f2038h;
    }

    @Override // android.view.MenuItem
    public int getOrder() {
        return this.f2033c;
    }

    @Override // android.view.MenuItem
    public SubMenu getSubMenu() {
        return null;
    }

    @Override // android.view.MenuItem
    public CharSequence getTitle() {
        return this.f2034d;
    }

    @Override // android.view.MenuItem
    public CharSequence getTitleCondensed() {
        CharSequence charSequence = this.f2035e;
        return charSequence != null ? charSequence : this.f2034d;
    }

    @Override // android.view.MenuItem
    public boolean hasSubMenu() {
        return false;
    }

    @Override // android.view.MenuItem
    public boolean isCheckable() {
        return (this.f2049s & 1) != 0;
    }

    @Override // android.view.MenuItem
    public boolean isChecked() {
        return (this.f2049s & 2) != 0;
    }

    @Override // android.view.MenuItem
    public boolean isEnabled() {
        return (this.f2049s & 16) != 0;
    }

    @Override // android.view.MenuItem
    public boolean isVisible() {
        return (this.f2049s & 8) == 0;
    }

    @Override // android.view.MenuItem
    public MenuItem setAlphabeticShortcut(char alphaChar) {
        this.f2039i = Character.toLowerCase(alphaChar);
        return this;
    }

    @Override // z.b, android.view.MenuItem
    public MenuItem setAlphabeticShortcut(char alphaChar, int alphaModifiers) {
        this.f2039i = Character.toLowerCase(alphaChar);
        this.f2040j = KeyEvent.normalizeMetaState(alphaModifiers);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setCheckable(boolean checkable) {
        this.f2049s = (this.f2049s & (-2)) | (checkable ? 1 : 0);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setChecked(boolean checked) {
        this.f2049s = (this.f2049s & (-3)) | (checked ? 2 : 0);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setEnabled(boolean enabled) {
        this.f2049s = (this.f2049s & (-17)) | (enabled ? 16 : 0);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIcon(Drawable icon) {
        this.f2041k = icon;
        c();
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIcon(int iconRes) {
        this.f2041k = d.b(this.f2042l, iconRes);
        c();
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIntent(Intent intent) {
        this.f2036f = intent;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setNumericShortcut(char numericChar) {
        this.f2037g = numericChar;
        return this;
    }

    @Override // z.b, android.view.MenuItem
    public MenuItem setNumericShortcut(char numericChar, int numericModifiers) {
        this.f2037g = numericChar;
        this.f2038h = KeyEvent.normalizeMetaState(numericModifiers);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener menuItemClickListener) {
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setShortcut(char numericChar, char alphaChar) {
        this.f2037g = numericChar;
        this.f2039i = Character.toLowerCase(alphaChar);
        return this;
    }

    @Override // z.b, android.view.MenuItem
    public MenuItem setShortcut(char numericChar, char alphaChar, int numericModifiers, int alphaModifiers) {
        this.f2037g = numericChar;
        this.f2038h = KeyEvent.normalizeMetaState(numericModifiers);
        this.f2039i = Character.toLowerCase(alphaChar);
        this.f2040j = KeyEvent.normalizeMetaState(alphaModifiers);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitle(CharSequence title) {
        this.f2034d = title;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitle(int title) {
        this.f2034d = this.f2042l.getResources().getString(title);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitleCondensed(CharSequence title) {
        this.f2035e = title;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setVisible(boolean visible) {
        int i2 = 8;
        int i3 = this.f2049s & 8;
        if (visible) {
            i2 = 0;
        }
        this.f2049s = i3 | i2;
        return this;
    }

    @Override // z.b, android.view.MenuItem
    public void setShowAsAction(int show) {
    }

    public b d() {
        throw new UnsupportedOperationException();
    }

    @Override // z.b, android.view.MenuItem
    public View getActionView() {
        return null;
    }

    @Override // android.view.MenuItem
    public MenuItem setActionProvider(ActionProvider actionProvider) {
        throw new UnsupportedOperationException();
    }

    @Override // android.view.MenuItem
    public ActionProvider getActionProvider() {
        throw new UnsupportedOperationException();
    }

    public b e() {
        throw new UnsupportedOperationException();
    }

    @Override // z.b
    public e a() {
        return null;
    }

    @Override // z.b
    public b b(e actionProvider) {
        throw new UnsupportedOperationException();
    }

    public b f(int actionEnum) {
        setShowAsAction(actionEnum);
        return this;
    }

    @Override // z.b, android.view.MenuItem
    public boolean expandActionView() {
        return false;
    }

    @Override // z.b, android.view.MenuItem
    public boolean collapseActionView() {
        return false;
    }

    @Override // z.b, android.view.MenuItem
    public boolean isActionViewExpanded() {
        return false;
    }

    @Override // android.view.MenuItem
    public MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener listener) {
        throw new UnsupportedOperationException();
    }

    @Override // z.b, android.view.MenuItem
    public b setContentDescription(CharSequence contentDescription) {
        this.f2043m = contentDescription;
        return this;
    }

    @Override // z.b, android.view.MenuItem
    public CharSequence getContentDescription() {
        return this.f2043m;
    }

    @Override // z.b, android.view.MenuItem
    public b setTooltipText(CharSequence tooltipText) {
        this.f2044n = tooltipText;
        return this;
    }

    @Override // z.b, android.view.MenuItem
    public CharSequence getTooltipText() {
        return this.f2044n;
    }

    @Override // z.b, android.view.MenuItem
    public MenuItem setIconTintList(ColorStateList iconTintList) {
        this.f2045o = iconTintList;
        this.f2047q = true;
        c();
        return this;
    }

    @Override // z.b, android.view.MenuItem
    public ColorStateList getIconTintList() {
        return this.f2045o;
    }

    @Override // z.b, android.view.MenuItem
    public MenuItem setIconTintMode(PorterDuff.Mode iconTintMode) {
        this.f2046p = iconTintMode;
        this.f2048r = true;
        c();
        return this;
    }

    @Override // z.b, android.view.MenuItem
    public PorterDuff.Mode getIconTintMode() {
        return this.f2046p;
    }

    public final void c() {
        Drawable drawable = this.f2041k;
        if (drawable == null) {
            return;
        }
        if (this.f2047q || this.f2048r) {
            y.a.l(drawable);
            this.f2041k = drawable;
            Drawable mutate = drawable.mutate();
            this.f2041k = mutate;
            if (this.f2047q) {
                y.a.i(mutate, this.f2045o);
            }
            if (this.f2048r) {
                y.a.j(this.f2041k, this.f2046p);
            }
        }
    }
}
