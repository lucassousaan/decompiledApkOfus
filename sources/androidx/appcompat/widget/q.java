package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.SparseBooleanArray;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.appcompat.view.menu.ActionMenuItemView;
import androidx.appcompat.view.menu.MenuItemImpl;
import com.example.helloworld.R;
import f0.c;
import f0.e;
import g.a;
import h.c0;
import h.d;
import h.f0;
import h.g0;
import h.m0;
import h.t;
import java.util.ArrayList;

/* JADX WARN: Classes with same name are omitted:
  
 */
/* loaded from: classes.dex */
public class q extends d implements c {

    /* renamed from: j  reason: collision with root package name */
    public n f482j;

    /* renamed from: k  reason: collision with root package name */
    public Drawable f483k;

    /* renamed from: l  reason: collision with root package name */
    public boolean f484l;

    /* renamed from: m  reason: collision with root package name */
    public boolean f485m;

    /* renamed from: n  reason: collision with root package name */
    public boolean f486n;

    /* renamed from: o  reason: collision with root package name */
    public int f487o;

    /* renamed from: p  reason: collision with root package name */
    public int f488p;

    /* renamed from: q  reason: collision with root package name */
    public int f489q;

    /* renamed from: r  reason: collision with root package name */
    public boolean f490r;

    /* renamed from: s  reason: collision with root package name */
    public int f491s;

    /* renamed from: u  reason: collision with root package name */
    public o f493u;

    /* renamed from: v  reason: collision with root package name */
    public j f494v;

    /* renamed from: w  reason: collision with root package name */
    public l f495w;

    /* renamed from: x  reason: collision with root package name */
    public k f496x;

    /* renamed from: t  reason: collision with root package name */
    public final SparseBooleanArray f492t = new SparseBooleanArray();

    /* renamed from: y  reason: collision with root package name */
    public final p f497y = new p(this);

    public q(Context context) {
        super(context, R.layout.abc_action_menu_layout, R.layout.abc_action_menu_item_layout);
    }

    @Override // h.d, h.e0
    public void f(Context context, h.q menu) {
        super.f(context, menu);
        Resources res = context.getResources();
        a abp = a.b(context);
        if (!this.f486n) {
            abp.f();
            this.f485m = true;
        }
        this.f487o = abp.c();
        this.f489q = abp.d();
        int width = this.f487o;
        if (this.f485m) {
            if (this.f482j == null) {
                n nVar = new n(this, this.f2065b);
                this.f482j = nVar;
                if (this.f484l) {
                    nVar.setImageDrawable(this.f483k);
                    this.f483k = null;
                    this.f484l = false;
                }
                int spec = View.MeasureSpec.makeMeasureSpec(0, 0);
                this.f482j.measure(spec, spec);
            }
            width -= this.f482j.getMeasuredWidth();
        } else {
            this.f482j = null;
        }
        this.f488p = width;
        this.f491s = (int) (res.getDisplayMetrics().density * 56.0f);
    }

    public void F() {
        this.f489q = a.b(this.f2066c).d();
        h.q qVar = this.f2067d;
        if (qVar != null) {
            qVar.K(true);
        }
    }

    public void J(boolean reserveOverflow) {
        this.f485m = reserveOverflow;
        this.f486n = true;
    }

    public void G(boolean isExclusive) {
        this.f490r = isExclusive;
    }

    public void I(Drawable icon) {
        n nVar = this.f482j;
        if (nVar != null) {
            nVar.setImageDrawable(icon);
            return;
        }
        this.f484l = true;
        this.f483k = icon;
    }

    public Drawable A() {
        n nVar = this.f482j;
        if (nVar != null) {
            return nVar.getDrawable();
        }
        if (this.f484l) {
            return this.f483k;
        }
        return null;
    }

    @Override // h.d
    public g0 o(ViewGroup root) {
        g0 oldMenuView = this.f2072i;
        g0 result = super.o(root);
        if (oldMenuView != result) {
            ((ActionMenuView) result).setPresenter(this);
        }
        return result;
    }

    @Override // h.d
    public View n(t item, View convertView, ViewGroup parent) {
        View actionView = item.getActionView();
        if (actionView == null || item.j()) {
            actionView = super.n(item, convertView, parent);
        }
        actionView.setVisibility(item.isActionViewExpanded() ? 8 : 0);
        ActionMenuView menuParent = (ActionMenuView) parent;
        ViewGroup.LayoutParams lp = actionView.getLayoutParams();
        if (!menuParent.checkLayoutParams(lp)) {
            actionView.setLayoutParams(menuParent.o(lp));
        }
        return actionView;
    }

    @Override // h.d
    public void e(t item, f0 itemView) {
        itemView.c(item, 0);
        ActionMenuView menuView = (ActionMenuView) this.f2072i;
        ActionMenuItemView actionItemView = (ActionMenuItemView) itemView;
        actionItemView.setItemInvoker(menuView);
        if (this.f496x == null) {
            this.f496x = new k(this);
        }
        actionItemView.setPopupCallback(this.f496x);
    }

    @Override // h.d
    public boolean q(int childIndex, t item) {
        return item.l();
    }

    @Override // h.d, h.e0
    public void k(boolean cleared) {
        super.k(cleared);
        ((View) this.f2072i).requestLayout();
        h.q qVar = this.f2067d;
        if (qVar != null) {
            ArrayList<MenuItemImpl> actionItems = qVar.s();
            int count = actionItems.size();
            for (int i2 = 0; i2 < count; i2++) {
                e provider = ((t) actionItems.get(i2)).a();
                if (provider != null) {
                    provider.h(this);
                }
            }
        }
        h.q qVar2 = this.f2067d;
        ArrayList<MenuItemImpl> nonActionItems = qVar2 != null ? qVar2.z() : null;
        boolean hasOverflow = false;
        if (this.f485m && nonActionItems != null) {
            int count2 = nonActionItems.size();
            hasOverflow = false;
            if (count2 == 1) {
                hasOverflow = !((t) nonActionItems.get(0)).isActionViewExpanded();
            } else if (count2 > 0) {
                hasOverflow = true;
            }
        }
        if (hasOverflow) {
            if (this.f482j == null) {
                this.f482j = new n(this, this.f2065b);
            }
            ViewGroup parent = (ViewGroup) this.f482j.getParent();
            if (parent != this.f2072i) {
                if (parent != null) {
                    parent.removeView(this.f482j);
                }
                ActionMenuView menuView = (ActionMenuView) this.f2072i;
                menuView.addView(this.f482j, menuView.F());
            }
        } else {
            n nVar = this.f482j;
            if (nVar != null) {
                ViewParent parent2 = nVar.getParent();
                g0 g0Var = this.f2072i;
                if (parent2 == g0Var) {
                    ((ViewGroup) g0Var).removeView(this.f482j);
                }
            }
        }
        ((ActionMenuView) this.f2072i).setOverflowReserved(this.f485m);
    }

    @Override // h.d
    public boolean l(ViewGroup parent, int childIndex) {
        if (parent.getChildAt(childIndex) == this.f482j) {
            return false;
        }
        super.l(parent, childIndex);
        return true;
    }

    @Override // h.d, h.e0
    public boolean h(m0 subMenu) {
        if (!subMenu.hasVisibleItems()) {
            return false;
        }
        m0 topSubMenu = subMenu;
        while (topSubMenu.e0() != this.f2067d) {
            topSubMenu = (m0) topSubMenu.e0();
        }
        View anchor = z(topSubMenu.getItem());
        if (anchor == null) {
            return false;
        }
        ((t) subMenu.getItem()).getItemId();
        boolean preserveIconSpacing = false;
        int count = subMenu.size();
        int i2 = 0;
        while (true) {
            if (i2 >= count) {
                break;
            }
            MenuItem childItem = subMenu.getItem(i2);
            if (childItem.isVisible() && childItem.getIcon() != null) {
                preserveIconSpacing = true;
                break;
            }
            i2++;
        }
        j jVar = new j(this, this.f2066c, subMenu, anchor);
        this.f494v = jVar;
        jVar.g(preserveIconSpacing);
        this.f494v.k();
        super.h(subMenu);
        return true;
    }

    public final View z(MenuItem item) {
        ViewGroup parent = (ViewGroup) this.f2072i;
        if (parent == null) {
            return null;
        }
        int count = parent.getChildCount();
        for (int i2 = 0; i2 < count; i2++) {
            View child = parent.getChildAt(i2);
            if ((child instanceof f0) && ((f0) child).getItemData() == item) {
                return child;
            }
        }
        return null;
    }

    public boolean K() {
        h.q qVar;
        if (!this.f485m || E() || (qVar = this.f2067d) == null || this.f2072i == null || this.f495w != null || qVar.z().isEmpty()) {
            return false;
        }
        o popup = new o(this, this.f2066c, this.f2067d, this.f482j, true);
        l lVar = new l(this, popup);
        this.f495w = lVar;
        ((View) this.f2072i).post(lVar);
        return true;
    }

    public boolean B() {
        g0 g0Var;
        l lVar = this.f495w;
        if (lVar == null || (g0Var = this.f2072i) == null) {
            c0 popup = this.f493u;
            if (popup == null) {
                return false;
            }
            popup.b();
            return true;
        }
        ((View) g0Var).removeCallbacks(lVar);
        this.f495w = null;
        return true;
    }

    public boolean y() {
        boolean result = B();
        return result | C();
    }

    public boolean C() {
        j jVar = this.f494v;
        if (jVar == null) {
            return false;
        }
        jVar.b();
        return true;
    }

    public boolean E() {
        o oVar = this.f493u;
        return oVar != null && oVar.d();
    }

    public boolean D() {
        return this.f495w != null || E();
    }

    @Override // h.e0
    public boolean g() {
        int itemsSize;
        ArrayList<MenuItemImpl> visibleItems;
        ArrayList<MenuItemImpl> visibleItems2;
        boolean z2;
        int maxActions;
        boolean isAction;
        int widthLimit;
        int widthLimit2;
        boolean z3;
        q qVar = this;
        h.q qVar2 = qVar.f2067d;
        if (qVar2 != null) {
            visibleItems = qVar2.E();
            itemsSize = visibleItems.size();
        } else {
            visibleItems = null;
            itemsSize = 0;
        }
        int maxActions2 = qVar.f489q;
        int widthLimit3 = qVar.f488p;
        int querySpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        ViewGroup parent = (ViewGroup) qVar.f2072i;
        int requiredItems = 0;
        int requestedItems = 0;
        int firstActionWidth = 0;
        boolean hasOverflow = false;
        for (int i2 = 0; i2 < itemsSize; i2++) {
            t item = (t) visibleItems.get(i2);
            if (item.o()) {
                requiredItems++;
            } else if (item.n()) {
                requestedItems++;
            } else {
                hasOverflow = true;
            }
            if (qVar.f490r && item.isActionViewExpanded()) {
                maxActions2 = 0;
            }
        }
        if (qVar.f485m && (hasOverflow || requiredItems + requestedItems > maxActions2)) {
            maxActions2--;
        }
        int maxActions3 = maxActions2 - requiredItems;
        SparseBooleanArray seenGroups = qVar.f492t;
        seenGroups.clear();
        int i3 = 0;
        while (i3 < itemsSize) {
            t item2 = (t) visibleItems.get(i3);
            if (item2.o()) {
                View v2 = qVar.n(item2, null, parent);
                v2.measure(querySpec, querySpec);
                int measuredWidth = v2.getMeasuredWidth();
                int widthLimit4 = widthLimit3 - measuredWidth;
                if (firstActionWidth == 0) {
                    firstActionWidth = measuredWidth;
                }
                int groupId = item2.getGroupId();
                if (groupId != 0) {
                    widthLimit2 = widthLimit4;
                    z3 = true;
                    seenGroups.put(groupId, true);
                } else {
                    widthLimit2 = widthLimit4;
                    z3 = true;
                }
                item2.u(z3);
                widthLimit3 = widthLimit2;
                z2 = false;
                visibleItems2 = visibleItems;
            } else if (item2.n()) {
                int groupId2 = item2.getGroupId();
                boolean inGroup = seenGroups.get(groupId2);
                boolean isAction2 = (maxActions3 > 0 || inGroup) && widthLimit3 > 0;
                if (isAction2) {
                    maxActions = maxActions3;
                    View v3 = qVar.n(item2, null, parent);
                    v3.measure(querySpec, querySpec);
                    int measuredWidth2 = v3.getMeasuredWidth();
                    widthLimit3 -= measuredWidth2;
                    if (firstActionWidth == 0) {
                        firstActionWidth = measuredWidth2;
                    }
                    isAction = isAction2 & (widthLimit3 + firstActionWidth > 0);
                } else {
                    maxActions = maxActions3;
                    isAction = isAction2;
                }
                if (isAction && groupId2 != 0) {
                    seenGroups.put(groupId2, true);
                    visibleItems2 = visibleItems;
                    widthLimit = widthLimit3;
                } else if (inGroup) {
                    seenGroups.put(groupId2, false);
                    int j2 = 0;
                    while (j2 < i3) {
                        t areYouMyGroupie = (t) visibleItems.get(j2);
                        int widthLimit5 = areYouMyGroupie.getGroupId();
                        if (widthLimit5 == groupId2) {
                            if (areYouMyGroupie.l()) {
                                maxActions++;
                            }
                            areYouMyGroupie.u(false);
                        }
                        j2++;
                        widthLimit3 = widthLimit3;
                        visibleItems = visibleItems;
                    }
                    visibleItems2 = visibleItems;
                    widthLimit = widthLimit3;
                } else {
                    visibleItems2 = visibleItems;
                    widthLimit = widthLimit3;
                }
                if (isAction) {
                    maxActions--;
                }
                item2.u(isAction);
                widthLimit3 = widthLimit;
                maxActions3 = maxActions;
                z2 = false;
            } else {
                visibleItems2 = visibleItems;
                z2 = false;
                item2.u(false);
            }
            i3++;
            itemsSize = itemsSize;
            visibleItems = visibleItems2;
            qVar = this;
        }
        return true;
    }

    @Override // h.d, h.e0
    public void b(h.q menu, boolean allMenusAreClosing) {
        y();
        super.b(menu, allMenusAreClosing);
    }

    public void H(ActionMenuView menuView) {
        this.f2072i = menuView;
        menuView.b(this.f2067d);
    }
}
