package h;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Build;
import android.os.Handler;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.appcompat.widget.k2;
import androidx.appcompat.widget.m2;
import com.example.helloworld.R;
import f0.c1;
import f0.o;
import java.util.ArrayList;
import java.util.List;

/* JADX WARN: Classes with same name are omitted:
  
 */
/* loaded from: classes.dex */
public final class k extends a0 implements View.OnKeyListener, PopupWindow.OnDismissListener {
    public static final int C = R.layout.abc_cascading_menu_item_layout;
    public PopupWindow.OnDismissListener A;
    public boolean B;

    /* renamed from: c  reason: collision with root package name */
    public final Context f2087c;

    /* renamed from: d  reason: collision with root package name */
    public final int f2088d;

    /* renamed from: e  reason: collision with root package name */
    public final int f2089e;

    /* renamed from: f  reason: collision with root package name */
    public final int f2090f;

    /* renamed from: g  reason: collision with root package name */
    public final boolean f2091g;

    /* renamed from: p  reason: collision with root package name */
    public View f2100p;

    /* renamed from: q  reason: collision with root package name */
    public View f2101q;

    /* renamed from: s  reason: collision with root package name */
    public boolean f2103s;

    /* renamed from: t  reason: collision with root package name */
    public boolean f2104t;

    /* renamed from: u  reason: collision with root package name */
    public int f2105u;

    /* renamed from: v  reason: collision with root package name */
    public int f2106v;

    /* renamed from: x  reason: collision with root package name */
    public boolean f2108x;

    /* renamed from: y  reason: collision with root package name */
    public d0 f2109y;

    /* renamed from: z  reason: collision with root package name */
    public ViewTreeObserver f2110z;

    /* renamed from: i  reason: collision with root package name */
    public final List f2093i = new ArrayList();

    /* renamed from: j  reason: collision with root package name */
    public final List f2094j = new ArrayList();

    /* renamed from: k  reason: collision with root package name */
    public final ViewTreeObserver.OnGlobalLayoutListener f2095k = new f(this);

    /* renamed from: l  reason: collision with root package name */
    public final View.OnAttachStateChangeListener f2096l = new g(this);

    /* renamed from: m  reason: collision with root package name */
    public final k2 f2097m = new i(this);

    /* renamed from: n  reason: collision with root package name */
    public int f2098n = 0;

    /* renamed from: o  reason: collision with root package name */
    public int f2099o = 0;

    /* renamed from: w  reason: collision with root package name */
    public boolean f2107w = false;

    /* renamed from: r  reason: collision with root package name */
    public int f2102r = D();

    /* renamed from: h  reason: collision with root package name */
    public final Handler f2092h = new Handler();

    public k(Context context, View anchor, int popupStyleAttr, int popupStyleRes, boolean overflowOnly) {
        this.f2087c = context;
        this.f2100p = anchor;
        this.f2089e = popupStyleAttr;
        this.f2090f = popupStyleRes;
        this.f2091g = overflowOnly;
        Resources res = context.getResources();
        this.f2088d = Math.max(res.getDisplayMetrics().widthPixels / 2, res.getDimensionPixelSize(R.dimen.abc_config_prefDialogWidth));
    }

    @Override // h.a0
    public void r(boolean forceShow) {
        this.f2107w = forceShow;
    }

    public final m2 z() {
        m2 popupWindow = new m2(this.f2087c, null, this.f2089e, this.f2090f);
        popupWindow.T(this.f2097m);
        popupWindow.L(this);
        popupWindow.K(this);
        popupWindow.D(this.f2100p);
        popupWindow.G(this.f2099o);
        popupWindow.J(true);
        popupWindow.I(2);
        return popupWindow;
    }

    @Override // h.i0
    public void i() {
        if (!a()) {
            for (q menu : this.f2093i) {
                F(menu);
            }
            this.f2093i.clear();
            View view = this.f2100p;
            this.f2101q = view;
            if (view != null) {
                boolean addGlobalListener = this.f2110z == null;
                ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
                this.f2110z = viewTreeObserver;
                if (addGlobalListener) {
                    viewTreeObserver.addOnGlobalLayoutListener(this.f2095k);
                }
                this.f2101q.addOnAttachStateChangeListener(this.f2096l);
            }
        }
    }

    @Override // h.i0
    public void dismiss() {
        int length = this.f2094j.size();
        if (length > 0) {
            j[] addedMenus = (j[]) this.f2094j.toArray(new j[length]);
            for (int i2 = length - 1; i2 >= 0; i2--) {
                j info = addedMenus[i2];
                if (info.f2083a.a()) {
                    info.f2083a.dismiss();
                }
            }
        }
    }

    @Override // android.view.View.OnKeyListener
    public boolean onKey(View v2, int keyCode, KeyEvent event) {
        if (event.getAction() != 1 || keyCode != 82) {
            return false;
        }
        dismiss();
        return true;
    }

    public final int D() {
        int layoutDirection = c1.A(this.f2100p);
        return layoutDirection == 1 ? 0 : 1;
    }

    public final int E(int nextMenuWidth) {
        List list = this.f2094j;
        ListView lastListView = ((j) list.get(list.size() - 1)).a();
        int[] screenLocation = new int[2];
        lastListView.getLocationOnScreen(screenLocation);
        Rect displayFrame = new Rect();
        this.f2101q.getWindowVisibleDisplayFrame(displayFrame);
        if (this.f2102r == 1) {
            int right = screenLocation[0] + lastListView.getWidth() + nextMenuWidth;
            return right > displayFrame.right ? 0 : 1;
        }
        int right2 = screenLocation[0];
        int left = right2 - nextMenuWidth;
        return left < 0 ? 1 : 0;
    }

    @Override // h.a0
    public void l(q menu) {
        menu.c(this, this.f2087c);
        if (a()) {
            F(menu);
        } else {
            this.f2093i.add(menu);
        }
    }

    public final void F(q menu) {
        View parentView;
        j parentInfo;
        int parentOffsetY;
        int parentOffsetX;
        int x2;
        LayoutInflater inflater = LayoutInflater.from(this.f2087c);
        n adapter = new n(menu, inflater, this.f2091g, R.layout.abc_cascading_menu_item_layout);
        if (!a() && this.f2107w) {
            adapter.d(true);
        } else if (a()) {
            adapter.d(a0.x(menu));
        }
        int menuWidth = a0.o(adapter, null, this.f2087c, this.f2088d);
        m2 popupWindow = z();
        popupWindow.o(adapter);
        popupWindow.F(menuWidth);
        popupWindow.G(this.f2099o);
        if (this.f2094j.size() > 0) {
            List list = this.f2094j;
            parentInfo = (j) list.get(list.size() - 1);
            parentView = C(parentInfo, menu);
        } else {
            parentInfo = null;
            parentView = null;
        }
        if (parentView != null) {
            popupWindow.U(false);
            popupWindow.R(null);
            int nextMenuPosition = E(menuWidth);
            boolean showOnRight = nextMenuPosition == 1;
            this.f2102r = nextMenuPosition;
            if (Build.VERSION.SDK_INT >= 26) {
                popupWindow.D(parentView);
                parentOffsetX = 0;
                parentOffsetY = 0;
            } else {
                int[] anchorScreenLocation = new int[2];
                this.f2100p.getLocationOnScreen(anchorScreenLocation);
                int[] parentViewScreenLocation = new int[2];
                parentView.getLocationOnScreen(parentViewScreenLocation);
                if ((this.f2099o & 7) == 5) {
                    anchorScreenLocation[0] = anchorScreenLocation[0] + this.f2100p.getWidth();
                    parentViewScreenLocation[0] = parentViewScreenLocation[0] + parentView.getWidth();
                }
                parentOffsetX = parentViewScreenLocation[0] - anchorScreenLocation[0];
                parentOffsetY = parentViewScreenLocation[1] - anchorScreenLocation[1];
            }
            if ((this.f2099o & 5) == 5) {
                if (showOnRight) {
                    x2 = parentOffsetX + menuWidth;
                } else {
                    int x3 = parentView.getWidth();
                    x2 = parentOffsetX - x3;
                }
            } else if (showOnRight) {
                x2 = parentView.getWidth() + parentOffsetX;
            } else {
                x2 = parentOffsetX - menuWidth;
            }
            popupWindow.c(x2);
            popupWindow.M(true);
            popupWindow.m(parentOffsetY);
        } else {
            if (this.f2103s) {
                popupWindow.c(this.f2105u);
            }
            if (this.f2104t) {
                popupWindow.m(this.f2106v);
            }
            Rect epicenterBounds = n();
            popupWindow.H(epicenterBounds);
        }
        j menuInfo = new j(popupWindow, menu, this.f2102r);
        this.f2094j.add(menuInfo);
        popupWindow.i();
        ListView listView = popupWindow.e();
        listView.setOnKeyListener(this);
        if (parentInfo == null && this.f2108x && menu.x() != null) {
            FrameLayout titleItemView = (FrameLayout) inflater.inflate(R.layout.abc_popup_menu_header_item_layout, (ViewGroup) listView, false);
            TextView titleView = (TextView) titleItemView.findViewById(16908310);
            titleItemView.setEnabled(false);
            titleView.setText(menu.x());
            listView.addHeaderView(titleItemView, null, false);
            popupWindow.i();
        }
    }

    public final MenuItem B(q parent, q submenu) {
        int count = parent.size();
        for (int i2 = 0; i2 < count; i2++) {
            MenuItem item = parent.getItem(i2);
            if (item.hasSubMenu() && submenu == item.getSubMenu()) {
                return item;
            }
        }
        return null;
    }

    public final View C(j parentInfo, q submenu) {
        int headersCount;
        n menuAdapter;
        int ownerViewPosition;
        MenuItem owner = B(parentInfo.f2084b, submenu);
        if (owner == null) {
            return null;
        }
        ListView listView = parentInfo.a();
        ListAdapter listAdapter = listView.getAdapter();
        if (listAdapter instanceof HeaderViewListAdapter) {
            HeaderViewListAdapter headerAdapter = (HeaderViewListAdapter) listAdapter;
            headersCount = headerAdapter.getHeadersCount();
            menuAdapter = (n) headerAdapter.getWrappedAdapter();
        } else {
            headersCount = 0;
            menuAdapter = (n) listAdapter;
        }
        int ownerPosition = -1;
        int i2 = 0;
        int count = menuAdapter.getCount();
        while (true) {
            if (i2 >= count) {
                break;
            } else if (owner == menuAdapter.getItem(i2)) {
                ownerPosition = i2;
                break;
            } else {
                i2++;
            }
        }
        if (ownerPosition != -1 && (ownerViewPosition = (ownerPosition + headersCount) - listView.getFirstVisiblePosition()) >= 0 && ownerViewPosition < listView.getChildCount()) {
            return listView.getChildAt(ownerViewPosition);
        }
        return null;
    }

    @Override // h.i0
    public boolean a() {
        return this.f2094j.size() > 0 && ((j) this.f2094j.get(0)).f2083a.a();
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public void onDismiss() {
        j dismissedInfo = null;
        int i2 = 0;
        int count = this.f2094j.size();
        while (true) {
            if (i2 >= count) {
                break;
            }
            j info = (j) this.f2094j.get(i2);
            if (!info.f2083a.a()) {
                dismissedInfo = info;
                break;
            }
            i2++;
        }
        if (dismissedInfo != null) {
            dismissedInfo.f2084b.e(false);
        }
    }

    @Override // h.e0
    public void k(boolean cleared) {
        for (j info : this.f2094j) {
            a0.y(info.a().getAdapter()).notifyDataSetChanged();
        }
    }

    @Override // h.e0
    public void d(d0 cb) {
        this.f2109y = cb;
    }

    @Override // h.e0
    public boolean h(m0 subMenu) {
        for (j info : this.f2094j) {
            if (subMenu == info.f2084b) {
                info.a().requestFocus();
                return true;
            }
        }
        if (!subMenu.hasVisibleItems()) {
            return false;
        }
        l(subMenu);
        d0 d0Var = this.f2109y;
        if (d0Var != null) {
            d0Var.c(subMenu);
        }
        return true;
    }

    public final int A(q menu) {
        int count = this.f2094j.size();
        for (int i2 = 0; i2 < count; i2++) {
            j info = (j) this.f2094j.get(i2);
            if (menu == info.f2084b) {
                return i2;
            }
        }
        return -1;
    }

    @Override // h.e0
    public void b(q menu, boolean allMenusAreClosing) {
        int menuIndex = A(menu);
        if (menuIndex >= 0) {
            int nextMenuIndex = menuIndex + 1;
            if (nextMenuIndex < this.f2094j.size()) {
                j childInfo = (j) this.f2094j.get(nextMenuIndex);
                childInfo.f2084b.e(false);
            }
            j info = (j) this.f2094j.remove(menuIndex);
            info.f2084b.O(this);
            if (this.B) {
                info.f2083a.S(null);
                info.f2083a.E(0);
            }
            info.f2083a.dismiss();
            int count = this.f2094j.size();
            if (count > 0) {
                this.f2102r = ((j) this.f2094j.get(count - 1)).f2085c;
            } else {
                this.f2102r = D();
            }
            if (count == 0) {
                dismiss();
                d0 d0Var = this.f2109y;
                if (d0Var != null) {
                    d0Var.b(menu, true);
                }
                ViewTreeObserver viewTreeObserver = this.f2110z;
                if (viewTreeObserver != null) {
                    if (viewTreeObserver.isAlive()) {
                        this.f2110z.removeGlobalOnLayoutListener(this.f2095k);
                    }
                    this.f2110z = null;
                }
                this.f2101q.removeOnAttachStateChangeListener(this.f2096l);
                this.A.onDismiss();
            } else if (allMenusAreClosing) {
                j rootInfo = (j) this.f2094j.get(0);
                rootInfo.f2084b.e(false);
            }
        }
    }

    @Override // h.e0
    public boolean g() {
        return false;
    }

    @Override // h.a0
    public void s(int dropDownGravity) {
        if (this.f2098n != dropDownGravity) {
            this.f2098n = dropDownGravity;
            this.f2099o = o.b(dropDownGravity, c1.A(this.f2100p));
        }
    }

    @Override // h.a0
    public void p(View anchor) {
        if (this.f2100p != anchor) {
            this.f2100p = anchor;
            this.f2099o = o.b(this.f2098n, c1.A(anchor));
        }
    }

    @Override // h.a0
    public void u(PopupWindow.OnDismissListener listener) {
        this.A = listener;
    }

    @Override // h.i0
    public ListView e() {
        if (this.f2094j.isEmpty()) {
            return null;
        }
        List list = this.f2094j;
        return ((j) list.get(list.size() - 1)).a();
    }

    @Override // h.a0
    public void t(int x2) {
        this.f2103s = true;
        this.f2105u = x2;
    }

    @Override // h.a0
    public void w(int y2) {
        this.f2104t = true;
        this.f2106v = y2;
    }

    @Override // h.a0
    public void v(boolean showTitle) {
        this.f2108x = showTitle;
    }

    @Override // h.a0
    public boolean m() {
        return false;
    }
}
