package h;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;
import z.a;

/* JADX WARN: Classes with same name are omitted:
  
 */
/* loaded from: classes.dex */
public class h0 extends e implements Menu {

    /* renamed from: c  reason: collision with root package name */
    public final a f2081c;

    public h0(Context context, a object) {
        super(context);
        if (object != null) {
            this.f2081c = object;
            return;
        }
        throw new IllegalArgumentException("Wrapped Object can not be null.");
    }

    @Override // android.view.Menu
    public MenuItem add(CharSequence title) {
        return c(((q) this.f2081c).add(title));
    }

    @Override // android.view.Menu
    public MenuItem add(int titleRes) {
        return c(((q) this.f2081c).add(titleRes));
    }

    @Override // android.view.Menu
    public MenuItem add(int groupId, int itemId, int order, CharSequence title) {
        return c(((q) this.f2081c).add(groupId, itemId, order, title));
    }

    @Override // android.view.Menu
    public MenuItem add(int groupId, int itemId, int order, int titleRes) {
        return c(((q) this.f2081c).add(groupId, itemId, order, titleRes));
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(CharSequence title) {
        SubMenu addSubMenu = ((q) this.f2081c).addSubMenu(title);
        d(addSubMenu);
        return addSubMenu;
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(int titleRes) {
        SubMenu addSubMenu = ((q) this.f2081c).addSubMenu(titleRes);
        d(addSubMenu);
        return addSubMenu;
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(int groupId, int itemId, int order, CharSequence title) {
        SubMenu addSubMenu = ((q) this.f2081c).addSubMenu(groupId, itemId, order, title);
        d(addSubMenu);
        return addSubMenu;
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(int groupId, int itemId, int order, int titleRes) {
        SubMenu addSubMenu = ((q) this.f2081c).addSubMenu(groupId, itemId, order, titleRes);
        d(addSubMenu);
        return addSubMenu;
    }

    @Override // android.view.Menu
    public int addIntentOptions(int groupId, int itemId, int order, ComponentName caller, Intent[] specifics, Intent intent, int flags, MenuItem[] outSpecificItems) {
        MenuItem[] items = null;
        if (outSpecificItems != null) {
            items = new MenuItem[outSpecificItems.length];
        }
        int result = ((q) this.f2081c).addIntentOptions(groupId, itemId, order, caller, specifics, intent, flags, items);
        if (items != null) {
            int z2 = items.length;
            for (int i2 = 0; i2 < z2; i2++) {
                outSpecificItems[i2] = c(items[i2]);
            }
        }
        return result;
    }

    @Override // android.view.Menu
    public void removeItem(int id) {
        g(id);
        ((q) this.f2081c).removeItem(id);
    }

    @Override // android.view.Menu
    public void removeGroup(int groupId) {
        f(groupId);
        ((q) this.f2081c).removeGroup(groupId);
    }

    @Override // android.view.Menu
    public void clear() {
        e();
        ((q) this.f2081c).clear();
    }

    @Override // android.view.Menu
    public void setGroupCheckable(int group, boolean checkable, boolean exclusive) {
        ((q) this.f2081c).setGroupCheckable(group, checkable, exclusive);
    }

    @Override // android.view.Menu
    public void setGroupVisible(int group, boolean visible) {
        ((q) this.f2081c).setGroupVisible(group, visible);
    }

    @Override // android.view.Menu
    public void setGroupEnabled(int group, boolean enabled) {
        ((q) this.f2081c).setGroupEnabled(group, enabled);
    }

    @Override // android.view.Menu
    public boolean hasVisibleItems() {
        return ((q) this.f2081c).hasVisibleItems();
    }

    @Override // android.view.Menu
    public MenuItem findItem(int id) {
        return c(((q) this.f2081c).findItem(id));
    }

    @Override // android.view.Menu
    public int size() {
        return ((q) this.f2081c).size();
    }

    @Override // android.view.Menu
    public MenuItem getItem(int index) {
        return c(((q) this.f2081c).getItem(index));
    }

    @Override // android.view.Menu
    public void close() {
        ((q) this.f2081c).close();
    }

    @Override // android.view.Menu
    public boolean performShortcut(int keyCode, KeyEvent event, int flags) {
        return ((q) this.f2081c).performShortcut(keyCode, event, flags);
    }

    @Override // android.view.Menu
    public boolean isShortcutKey(int keyCode, KeyEvent event) {
        return ((q) this.f2081c).isShortcutKey(keyCode, event);
    }

    @Override // android.view.Menu
    public boolean performIdentifierAction(int id, int flags) {
        return ((q) this.f2081c).performIdentifierAction(id, flags);
    }

    @Override // android.view.Menu
    public void setQwertyMode(boolean isQwerty) {
        this.f2081c.setQwertyMode(isQwerty);
    }
}
