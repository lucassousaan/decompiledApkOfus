package h;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewConfiguration;
import androidx.appcompat.view.menu.MenuItemImpl;
import androidx.appcompat.view.menu.MenuPresenter;
import f0.d1;
import f0.e;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import v.d;
import z.a;

/* JADX WARN: Classes with same name are omitted:
  
 */
/* loaded from: classes.dex */
public class q implements a {

    /* renamed from: z  reason: collision with root package name */
    public static final int[] f2149z = {1, 4, 5, 3, 2, 0};

    /* renamed from: a  reason: collision with root package name */
    public final Context f2150a;

    /* renamed from: b  reason: collision with root package name */
    public final Resources f2151b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f2152c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f2153d;

    /* renamed from: e  reason: collision with root package name */
    public o f2154e;

    /* renamed from: m  reason: collision with root package name */
    public CharSequence f2162m;

    /* renamed from: n  reason: collision with root package name */
    public Drawable f2163n;

    /* renamed from: o  reason: collision with root package name */
    public View f2164o;

    /* renamed from: w  reason: collision with root package name */
    public t f2172w;

    /* renamed from: y  reason: collision with root package name */
    public boolean f2174y;

    /* renamed from: l  reason: collision with root package name */
    public int f2161l = 0;

    /* renamed from: p  reason: collision with root package name */
    public boolean f2165p = false;

    /* renamed from: q  reason: collision with root package name */
    public boolean f2166q = false;

    /* renamed from: r  reason: collision with root package name */
    public boolean f2167r = false;

    /* renamed from: s  reason: collision with root package name */
    public boolean f2168s = false;

    /* renamed from: t  reason: collision with root package name */
    public boolean f2169t = false;

    /* renamed from: u  reason: collision with root package name */
    public ArrayList f2170u = new ArrayList();

    /* renamed from: v  reason: collision with root package name */
    public CopyOnWriteArrayList f2171v = new CopyOnWriteArrayList();

    /* renamed from: x  reason: collision with root package name */
    public boolean f2173x = false;

    /* renamed from: f  reason: collision with root package name */
    public ArrayList f2155f = new ArrayList();

    /* renamed from: g  reason: collision with root package name */
    public ArrayList f2156g = new ArrayList();

    /* renamed from: h  reason: collision with root package name */
    public boolean f2157h = true;

    /* renamed from: i  reason: collision with root package name */
    public ArrayList f2158i = new ArrayList();

    /* renamed from: j  reason: collision with root package name */
    public ArrayList f2159j = new ArrayList();

    /* renamed from: k  reason: collision with root package name */
    public boolean f2160k = true;

    public q(Context context) {
        this.f2150a = context;
        this.f2151b = context.getResources();
        b0(true);
    }

    public q S(int defaultShowAsAction) {
        this.f2161l = defaultShowAsAction;
        return this;
    }

    public void b(e0 presenter) {
        c(presenter, this.f2150a);
    }

    public void c(e0 presenter, Context menuContext) {
        this.f2171v.add(new WeakReference(presenter));
        presenter.f(menuContext, this);
        this.f2160k = true;
    }

    public void O(e0 presenter) {
        Iterator it = this.f2171v.iterator();
        while (it.hasNext()) {
            WeakReference<MenuPresenter> ref = (WeakReference) it.next();
            e0 item = (e0) ref.get();
            if (item == null || item == presenter) {
                this.f2171v.remove(ref);
            }
        }
    }

    public final void i(boolean cleared) {
        if (!this.f2171v.isEmpty()) {
            d0();
            Iterator it = this.f2171v.iterator();
            while (it.hasNext()) {
                WeakReference<MenuPresenter> ref = (WeakReference) it.next();
                e0 presenter = (e0) ref.get();
                if (presenter == null) {
                    this.f2171v.remove(ref);
                } else {
                    presenter.k(cleared);
                }
            }
            c0();
        }
    }

    public final boolean j(m0 subMenu, e0 preferredPresenter) {
        if (this.f2171v.isEmpty()) {
            return false;
        }
        boolean result = false;
        if (preferredPresenter != null) {
            result = preferredPresenter.h(subMenu);
        }
        Iterator it = this.f2171v.iterator();
        while (it.hasNext()) {
            WeakReference<MenuPresenter> ref = (WeakReference) it.next();
            e0 presenter = (e0) ref.get();
            if (presenter == null) {
                this.f2171v.remove(ref);
            } else if (!result) {
                result = presenter.h(subMenu);
            }
        }
        return result;
    }

    public void Q(Bundle outStates) {
        SparseArray<Parcelable> viewStates = null;
        int itemCount = size();
        for (int i2 = 0; i2 < itemCount; i2++) {
            MenuItem item = getItem(i2);
            View v2 = item.getActionView();
            if (!(v2 == null || v2.getId() == -1)) {
                if (viewStates == null) {
                    viewStates = new SparseArray<>();
                }
                v2.saveHierarchyState(viewStates);
                if (item.isActionViewExpanded()) {
                    outStates.putInt("android:menu:expandedactionview", item.getItemId());
                }
            }
            if (item.hasSubMenu()) {
                m0 subMenu = (m0) item.getSubMenu();
                subMenu.Q(outStates);
            }
        }
        if (viewStates != null) {
            outStates.putSparseParcelableArray(t(), viewStates);
        }
    }

    public void P(Bundle states) {
        MenuItem itemToExpand;
        if (states != null) {
            SparseArray<Parcelable> viewStates = states.getSparseParcelableArray(t());
            int itemCount = size();
            for (int i2 = 0; i2 < itemCount; i2++) {
                MenuItem item = getItem(i2);
                View v2 = item.getActionView();
                if (!(v2 == null || v2.getId() == -1)) {
                    v2.restoreHierarchyState(viewStates);
                }
                if (item.hasSubMenu()) {
                    m0 subMenu = (m0) item.getSubMenu();
                    subMenu.P(states);
                }
            }
            int expandedId = states.getInt("android:menu:expandedactionview");
            if (expandedId > 0 && (itemToExpand = findItem(expandedId)) != null) {
                itemToExpand.expandActionView();
            }
        }
    }

    public String t() {
        return "android:menu:actionviewstates";
    }

    public void R(o cb) {
        this.f2154e = cb;
    }

    public MenuItem a(int group, int id, int categoryOrder, CharSequence title) {
        int ordering = B(categoryOrder);
        t item = g(group, id, categoryOrder, ordering, title, this.f2161l);
        ArrayList arrayList = this.f2155f;
        arrayList.add(n(arrayList, ordering), item);
        K(true);
        return item;
    }

    public final t g(int group, int id, int categoryOrder, int ordering, CharSequence title, int defaultShowAsAction) {
        return new t(this, group, id, categoryOrder, ordering, title, defaultShowAsAction);
    }

    @Override // android.view.Menu
    public MenuItem add(CharSequence title) {
        return a(0, 0, 0, title);
    }

    @Override // android.view.Menu
    public MenuItem add(int titleRes) {
        return a(0, 0, 0, this.f2151b.getString(titleRes));
    }

    @Override // android.view.Menu
    public MenuItem add(int group, int id, int categoryOrder, CharSequence title) {
        return a(group, id, categoryOrder, title);
    }

    @Override // android.view.Menu
    public MenuItem add(int group, int id, int categoryOrder, int title) {
        return a(group, id, categoryOrder, this.f2151b.getString(title));
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(CharSequence title) {
        return addSubMenu(0, 0, 0, title);
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(int titleRes) {
        return addSubMenu(0, 0, 0, this.f2151b.getString(titleRes));
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(int group, int id, int categoryOrder, CharSequence title) {
        t item = (t) a(group, id, categoryOrder, title);
        m0 subMenu = new m0(this.f2150a, this, item);
        item.w(subMenu);
        return subMenu;
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(int group, int id, int categoryOrder, int title) {
        return addSubMenu(group, id, categoryOrder, this.f2151b.getString(title));
    }

    @Override // android.view.Menu
    public void setGroupDividerEnabled(boolean enabled) {
        this.f2173x = enabled;
    }

    public boolean F() {
        return this.f2173x;
    }

    @Override // android.view.Menu
    public int addIntentOptions(int group, int id, int categoryOrder, ComponentName caller, Intent[] specifics, Intent intent, int flags, MenuItem[] outSpecificItems) {
        int i2;
        PackageManager pm = this.f2150a.getPackageManager();
        int N = 0;
        List<ResolveInfo> lri = pm.queryIntentActivityOptions(caller, specifics, intent, 0);
        if (lri != null) {
            N = lri.size();
        }
        if ((flags & 1) == 0) {
            removeGroup(group);
        }
        for (int i3 = 0; i3 < N; i3++) {
            ResolveInfo ri = lri.get(i3);
            int i4 = ri.specificIndex;
            Intent rintent = new Intent(i4 < 0 ? intent : specifics[i4]);
            ActivityInfo activityInfo = ri.activityInfo;
            rintent.setComponent(new ComponentName(activityInfo.applicationInfo.packageName, activityInfo.name));
            t tVar = (t) add(group, id, categoryOrder, ri.loadLabel(pm));
            tVar.setIcon(ri.loadIcon(pm));
            MenuItem item = tVar.setIntent(rintent);
            if (outSpecificItems != null && (i2 = ri.specificIndex) >= 0) {
                outSpecificItems[i2] = item;
            }
        }
        return N;
    }

    @Override // android.view.Menu
    public void removeItem(int id) {
        N(o(id), true);
    }

    @Override // android.view.Menu
    public void removeGroup(int group) {
        int i2 = l(group);
        if (i2 >= 0) {
            int maxRemovable = this.f2155f.size() - i2;
            int numRemoved = 0;
            while (true) {
                int numRemoved2 = numRemoved + 1;
                if (numRemoved >= maxRemovable || ((t) this.f2155f.get(i2)).getGroupId() != group) {
                    break;
                }
                N(i2, false);
                numRemoved = numRemoved2;
            }
            K(true);
        }
    }

    public final void N(int index, boolean updateChildrenOnMenuViews) {
        if (index >= 0 && index < this.f2155f.size()) {
            this.f2155f.remove(index);
            if (updateChildrenOnMenuViews) {
                K(true);
            }
        }
    }

    @Override // android.view.Menu
    public void clear() {
        t tVar = this.f2172w;
        if (tVar != null) {
            f(tVar);
        }
        this.f2155f.clear();
        K(true);
    }

    public void T(MenuItem item) {
        int group = item.getGroupId();
        int N = this.f2155f.size();
        d0();
        for (int i2 = 0; i2 < N; i2++) {
            t curItem = (t) this.f2155f.get(i2);
            if (curItem.getGroupId() == group && curItem.m() && curItem.isCheckable()) {
                curItem.s(curItem == item);
            }
        }
        c0();
    }

    @Override // android.view.Menu
    public void setGroupCheckable(int group, boolean checkable, boolean exclusive) {
        int N = this.f2155f.size();
        for (int i2 = 0; i2 < N; i2++) {
            t item = (t) this.f2155f.get(i2);
            if (item.getGroupId() == group) {
                item.t(exclusive);
                item.setCheckable(checkable);
            }
        }
    }

    @Override // android.view.Menu
    public void setGroupVisible(int group, boolean visible) {
        int N = this.f2155f.size();
        boolean changedAtLeastOneItem = false;
        for (int i2 = 0; i2 < N; i2++) {
            t item = (t) this.f2155f.get(i2);
            if (item.getGroupId() == group && item.x(visible)) {
                changedAtLeastOneItem = true;
            }
        }
        if (changedAtLeastOneItem) {
            K(true);
        }
    }

    @Override // android.view.Menu
    public void setGroupEnabled(int group, boolean enabled) {
        int N = this.f2155f.size();
        for (int i2 = 0; i2 < N; i2++) {
            t item = (t) this.f2155f.get(i2);
            if (item.getGroupId() == group) {
                item.setEnabled(enabled);
            }
        }
    }

    @Override // android.view.Menu
    public boolean hasVisibleItems() {
        if (this.f2174y) {
            return true;
        }
        int size = size();
        for (int i2 = 0; i2 < size; i2++) {
            t item = (t) this.f2155f.get(i2);
            if (item.isVisible()) {
                return true;
            }
        }
        return false;
    }

    @Override // android.view.Menu
    public MenuItem findItem(int id) {
        MenuItem possibleItem;
        int size = size();
        for (int i2 = 0; i2 < size; i2++) {
            t item = (t) this.f2155f.get(i2);
            if (item.getItemId() == id) {
                return item;
            }
            if (item.hasSubMenu() && (possibleItem = ((q) item.getSubMenu()).findItem(id)) != null) {
                return possibleItem;
            }
        }
        return null;
    }

    public int o(int id) {
        int size = size();
        for (int i2 = 0; i2 < size; i2++) {
            t item = (t) this.f2155f.get(i2);
            if (item.getItemId() == id) {
                return i2;
            }
        }
        return -1;
    }

    public int l(int group) {
        return m(group, 0);
    }

    public int m(int group, int start) {
        int size = size();
        if (start < 0) {
            start = 0;
        }
        for (int i2 = start; i2 < size; i2++) {
            t item = (t) this.f2155f.get(i2);
            if (item.getGroupId() == group) {
                return i2;
            }
        }
        return -1;
    }

    @Override // android.view.Menu
    public int size() {
        return this.f2155f.size();
    }

    @Override // android.view.Menu
    public MenuItem getItem(int index) {
        return (MenuItem) this.f2155f.get(index);
    }

    @Override // android.view.Menu
    public boolean isShortcutKey(int keyCode, KeyEvent event) {
        return p(keyCode, event) != null;
    }

    @Override // android.view.Menu
    public void setQwertyMode(boolean isQwerty) {
        this.f2152c = isQwerty;
        K(false);
    }

    public static int B(int categoryOrder) {
        int index = ((-65536) & categoryOrder) >> 16;
        if (index >= 0) {
            int[] iArr = f2149z;
            if (index < iArr.length) {
                return (iArr[index] << 16) | (65535 & categoryOrder);
            }
        }
        throw new IllegalArgumentException("order does not contain a valid category.");
    }

    public boolean G() {
        return this.f2152c;
    }

    public final void b0(boolean shortcutsVisible) {
        boolean z2 = true;
        if (!shortcutsVisible || this.f2151b.getConfiguration().keyboard == 1 || !d1.e(ViewConfiguration.get(this.f2150a), this.f2150a)) {
            z2 = false;
        }
        this.f2153d = z2;
    }

    public boolean H() {
        return this.f2153d;
    }

    public Resources C() {
        return this.f2151b;
    }

    public Context u() {
        return this.f2150a;
    }

    public boolean h(q menu, MenuItem item) {
        o oVar = this.f2154e;
        return oVar != null && oVar.b(menu, item);
    }

    public void d() {
        o oVar = this.f2154e;
        if (oVar != null) {
            oVar.a(this);
        }
    }

    public static int n(ArrayList arrayList, int ordering) {
        for (int i2 = arrayList.size() - 1; i2 >= 0; i2--) {
            t item = (t) arrayList.get(i2);
            if (item.f() <= ordering) {
                return i2 + 1;
            }
        }
        return 0;
    }

    @Override // android.view.Menu
    public boolean performShortcut(int keyCode, KeyEvent event, int flags) {
        t item = p(keyCode, event);
        boolean handled = false;
        if (item != null) {
            handled = L(item, flags);
        }
        if ((flags & 2) != 0) {
            e(true);
        }
        return handled;
    }

    public void q(List list, int keyCode, KeyEvent event) {
        boolean qwerty = G();
        int modifierState = event.getModifiers();
        KeyCharacterMap.KeyData possibleChars = new KeyCharacterMap.KeyData();
        boolean isKeyCodeMapped = event.getKeyData(possibleChars);
        if (isKeyCodeMapped || keyCode == 67) {
            int N = this.f2155f.size();
            for (int i2 = 0; i2 < N; i2++) {
                t item = (t) this.f2155f.get(i2);
                if (item.hasSubMenu()) {
                    ((q) item.getSubMenu()).q(list, keyCode, event);
                }
                char shortcutChar = qwerty ? item.getAlphabeticShortcut() : item.getNumericShortcut();
                int shortcutModifiers = qwerty ? item.getAlphabeticModifiers() : item.getNumericModifiers();
                boolean isModifiersExactMatch = (modifierState & 69647) == (69647 & shortcutModifiers);
                if (isModifiersExactMatch && shortcutChar != 0) {
                    char[] cArr = possibleChars.meta;
                    if (shortcutChar != cArr[0] && shortcutChar != cArr[2]) {
                        if (qwerty && shortcutChar == '\b') {
                            if (keyCode != 67) {
                            }
                        }
                    }
                    if (item.isEnabled()) {
                        list.add(item);
                    }
                }
            }
        }
    }

    public t p(int keyCode, KeyEvent event) {
        ArrayList<MenuItemImpl> items = this.f2170u;
        items.clear();
        q(items, keyCode, event);
        if (items.isEmpty()) {
            return null;
        }
        int metaState = event.getMetaState();
        KeyCharacterMap.KeyData possibleChars = new KeyCharacterMap.KeyData();
        event.getKeyData(possibleChars);
        int size = items.size();
        if (size == 1) {
            return (t) items.get(0);
        }
        boolean qwerty = G();
        for (int i2 = 0; i2 < size; i2++) {
            t item = (t) items.get(i2);
            char shortcutChar = qwerty ? item.getAlphabeticShortcut() : item.getNumericShortcut();
            char[] cArr = possibleChars.meta;
            if ((shortcutChar == cArr[0] && (metaState & 2) == 0) || ((shortcutChar == cArr[2] && (metaState & 2) != 0) || (qwerty && shortcutChar == '\b' && keyCode == 67))) {
                return item;
            }
        }
        return null;
    }

    @Override // android.view.Menu
    public boolean performIdentifierAction(int id, int flags) {
        return L(findItem(id), flags);
    }

    public boolean L(MenuItem item, int flags) {
        return M(item, null, flags);
    }

    public boolean M(MenuItem item, e0 preferredPresenter, int flags) {
        boolean providerHasSubMenu;
        t itemImpl = (t) item;
        if (itemImpl == null || !itemImpl.isEnabled()) {
            return false;
        }
        boolean invoked = itemImpl.k();
        e provider = itemImpl.a();
        if (provider == null || !provider.a()) {
            providerHasSubMenu = false;
        } else {
            providerHasSubMenu = true;
        }
        if (itemImpl.j()) {
            invoked |= itemImpl.expandActionView();
            if (invoked) {
                e(true);
            }
        } else if (itemImpl.hasSubMenu() || providerHasSubMenu) {
            if ((flags & 4) == 0) {
                e(false);
            }
            if (!itemImpl.hasSubMenu()) {
                itemImpl.w(new m0(u(), this, itemImpl));
            }
            m0 subMenu = (m0) itemImpl.getSubMenu();
            if (providerHasSubMenu) {
                provider.e(subMenu);
            }
            invoked |= j(subMenu, preferredPresenter);
            if (!invoked) {
                e(true);
            }
        } else if ((flags & 1) == 0) {
            e(true);
        }
        return invoked;
    }

    public final void e(boolean closeAllMenus) {
        if (!this.f2169t) {
            this.f2169t = true;
            Iterator it = this.f2171v.iterator();
            while (it.hasNext()) {
                WeakReference<MenuPresenter> ref = (WeakReference) it.next();
                e0 presenter = (e0) ref.get();
                if (presenter == null) {
                    this.f2171v.remove(ref);
                } else {
                    presenter.b(this, closeAllMenus);
                }
            }
            this.f2169t = false;
        }
    }

    @Override // android.view.Menu
    public void close() {
        e(true);
    }

    public void K(boolean structureChanged) {
        if (!this.f2165p) {
            if (structureChanged) {
                this.f2157h = true;
                this.f2160k = true;
            }
            i(structureChanged);
            return;
        }
        this.f2166q = true;
        if (structureChanged) {
            this.f2167r = true;
        }
    }

    public void d0() {
        if (!this.f2165p) {
            this.f2165p = true;
            this.f2166q = false;
            this.f2167r = false;
        }
    }

    public void c0() {
        this.f2165p = false;
        if (this.f2166q) {
            this.f2166q = false;
            K(this.f2167r);
        }
    }

    public void J(t item) {
        this.f2157h = true;
        K(true);
    }

    public void I(t item) {
        this.f2160k = true;
        K(true);
    }

    public ArrayList E() {
        if (!this.f2157h) {
            return this.f2156g;
        }
        this.f2156g.clear();
        int itemsSize = this.f2155f.size();
        for (int i2 = 0; i2 < itemsSize; i2++) {
            t item = (t) this.f2155f.get(i2);
            if (item.isVisible()) {
                this.f2156g.add(item);
            }
        }
        this.f2157h = false;
        this.f2160k = true;
        return this.f2156g;
    }

    public void r() {
        ArrayList<MenuItemImpl> visibleItems = E();
        if (this.f2160k) {
            boolean flagged = false;
            Iterator it = this.f2171v.iterator();
            while (it.hasNext()) {
                WeakReference<MenuPresenter> ref = (WeakReference) it.next();
                e0 presenter = (e0) ref.get();
                if (presenter == null) {
                    this.f2171v.remove(ref);
                } else {
                    flagged |= presenter.g();
                }
            }
            if (flagged) {
                this.f2158i.clear();
                this.f2159j.clear();
                int itemsSize = visibleItems.size();
                for (int i2 = 0; i2 < itemsSize; i2++) {
                    t item = (t) visibleItems.get(i2);
                    if (item.l()) {
                        this.f2158i.add(item);
                    } else {
                        this.f2159j.add(item);
                    }
                }
            } else {
                this.f2158i.clear();
                this.f2159j.clear();
                this.f2159j.addAll(E());
            }
            this.f2160k = false;
        }
    }

    public ArrayList s() {
        r();
        return this.f2158i;
    }

    public ArrayList z() {
        r();
        return this.f2159j;
    }

    public void clearHeader() {
        this.f2163n = null;
        this.f2162m = null;
        this.f2164o = null;
        K(false);
    }

    public final void W(int titleRes, CharSequence title, int iconRes, Drawable icon, View view) {
        Resources r2 = C();
        if (view != null) {
            this.f2164o = view;
            this.f2162m = null;
            this.f2163n = null;
        } else {
            if (titleRes > 0) {
                this.f2162m = r2.getText(titleRes);
            } else if (title != null) {
                this.f2162m = title;
            }
            if (iconRes > 0) {
                this.f2163n = d.b(u(), iconRes);
            } else if (icon != null) {
                this.f2163n = icon;
            }
            this.f2164o = null;
        }
        K(false);
    }

    public q Y(CharSequence title) {
        W(0, title, 0, null, null);
        return this;
    }

    public q X(int titleRes) {
        W(titleRes, null, 0, null, null);
        return this;
    }

    public q V(Drawable icon) {
        W(0, null, 0, icon, null);
        return this;
    }

    public q U(int iconRes) {
        W(0, null, iconRes, null, null);
        return this;
    }

    public q Z(View view) {
        W(0, null, 0, null, view);
        return this;
    }

    public CharSequence x() {
        return this.f2162m;
    }

    public Drawable w() {
        return this.f2163n;
    }

    public View y() {
        return this.f2164o;
    }

    public q D() {
        return this;
    }

    public boolean A() {
        return false;
    }

    public boolean k(t item) {
        if (this.f2171v.isEmpty()) {
            return false;
        }
        boolean expanded = false;
        d0();
        Iterator it = this.f2171v.iterator();
        while (it.hasNext()) {
            WeakReference<MenuPresenter> ref = (WeakReference) it.next();
            e0 presenter = (e0) ref.get();
            if (presenter == null) {
                this.f2171v.remove(ref);
            } else {
                boolean c2 = presenter.c(this, item);
                expanded = c2;
                if (c2) {
                    break;
                }
            }
        }
        c0();
        if (expanded) {
            this.f2172w = item;
        }
        return expanded;
    }

    public boolean f(t item) {
        if (this.f2171v.isEmpty() || this.f2172w != item) {
            return false;
        }
        boolean collapsed = false;
        d0();
        Iterator it = this.f2171v.iterator();
        while (it.hasNext()) {
            WeakReference<MenuPresenter> ref = (WeakReference) it.next();
            e0 presenter = (e0) ref.get();
            if (presenter == null) {
                this.f2171v.remove(ref);
            } else {
                boolean j2 = presenter.j(this, item);
                collapsed = j2;
                if (j2) {
                    break;
                }
            }
        }
        c0();
        if (collapsed) {
            this.f2172w = null;
        }
        return collapsed;
    }

    public t v() {
        return this.f2172w;
    }

    public void a0(boolean override) {
        this.f2174y = override;
    }
}
