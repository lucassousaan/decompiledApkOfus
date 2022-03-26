package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import androidx.appcompat.view.menu.ListMenuItemView;
import h.n;
import h.q;

/* JADX WARN: Classes with same name are omitted:
  
 */
/* loaded from: classes.dex */
public class l2 extends v1 {

    /* renamed from: p  reason: collision with root package name */
    public final int f419p;

    /* renamed from: q  reason: collision with root package name */
    public final int f420q;

    /* renamed from: r  reason: collision with root package name */
    public k2 f421r;

    /* renamed from: s  reason: collision with root package name */
    public MenuItem f422s;

    @Override // androidx.appcompat.widget.v1, android.widget.AbsListView
    public /* bridge */ /* synthetic */ void setSelector(Drawable drawable) {
        super.setSelector(drawable);
    }

    public l2(Context context, boolean hijackFocus) {
        super(context, hijackFocus);
        Resources res = context.getResources();
        Configuration config = res.getConfiguration();
        if (1 == config.getLayoutDirection()) {
            this.f419p = 21;
            this.f420q = 22;
            return;
        }
        this.f419p = 22;
        this.f420q = 21;
    }

    public void setHoverListener(k2 hoverListener) {
        this.f421r = hoverListener;
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.view.View, android.view.KeyEvent.Callback
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        n menuAdapter;
        ListMenuItemView selectedItem = (ListMenuItemView) getSelectedView();
        if (selectedItem != null && keyCode == this.f419p) {
            if (selectedItem.isEnabled() && selectedItem.getItemData().hasSubMenu()) {
                performItemClick(selectedItem, getSelectedItemPosition(), getSelectedItemId());
            }
            return true;
        } else if (selectedItem == null || keyCode != this.f420q) {
            return super.onKeyDown(keyCode, event);
        } else {
            setSelection(-1);
            ListAdapter adapter = getAdapter();
            if (adapter instanceof HeaderViewListAdapter) {
                menuAdapter = (n) ((HeaderViewListAdapter) adapter).getWrappedAdapter();
            } else {
                menuAdapter = (n) adapter;
            }
            menuAdapter.b().e(false);
            return true;
        }
    }

    @Override // androidx.appcompat.widget.v1, android.view.View
    public boolean onHoverEvent(MotionEvent ev) {
        int headersCount;
        n menuAdapter;
        int position;
        int itemPosition;
        if (this.f421r != null) {
            ListAdapter adapter = getAdapter();
            if (adapter instanceof HeaderViewListAdapter) {
                HeaderViewListAdapter headerAdapter = (HeaderViewListAdapter) adapter;
                headersCount = headerAdapter.getHeadersCount();
                menuAdapter = (n) headerAdapter.getWrappedAdapter();
            } else {
                headersCount = 0;
                menuAdapter = (n) adapter;
            }
            MenuItem menuItem = null;
            if (ev.getAction() != 10 && (position = pointToPosition((int) ev.getX(), (int) ev.getY())) != -1 && (itemPosition = position - headersCount) >= 0 && itemPosition < menuAdapter.getCount()) {
                menuItem = menuAdapter.getItem(itemPosition);
            }
            MenuItem oldMenuItem = this.f422s;
            if (oldMenuItem != menuItem) {
                q menu = menuAdapter.b();
                if (oldMenuItem != null) {
                    this.f421r.g(menu, oldMenuItem);
                }
                this.f422s = menuItem;
                if (menuItem != null) {
                    this.f421r.k(menu, menuItem);
                }
            }
        }
        return super.onHoverEvent(ev);
    }
}
