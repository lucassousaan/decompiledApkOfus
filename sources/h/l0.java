package h;

import android.content.Context;
import android.content.res.Resources;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.ListView;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.appcompat.widget.m2;
import com.example.helloworld.R;
import f0.c1;

/* JADX WARN: Classes with same name are omitted:
  
 */
/* loaded from: classes.dex */
public final class l0 extends a0 implements PopupWindow.OnDismissListener, View.OnKeyListener {

    /* renamed from: w  reason: collision with root package name */
    public static final int f2114w = R.layout.abc_popup_menu_item_layout;

    /* renamed from: c  reason: collision with root package name */
    public final Context f2115c;

    /* renamed from: d  reason: collision with root package name */
    public final q f2116d;

    /* renamed from: e  reason: collision with root package name */
    public final n f2117e;

    /* renamed from: f  reason: collision with root package name */
    public final boolean f2118f;

    /* renamed from: g  reason: collision with root package name */
    public final int f2119g;

    /* renamed from: h  reason: collision with root package name */
    public final int f2120h;

    /* renamed from: i  reason: collision with root package name */
    public final int f2121i;

    /* renamed from: j  reason: collision with root package name */
    public final m2 f2122j;

    /* renamed from: m  reason: collision with root package name */
    public PopupWindow.OnDismissListener f2125m;

    /* renamed from: n  reason: collision with root package name */
    public View f2126n;

    /* renamed from: o  reason: collision with root package name */
    public View f2127o;

    /* renamed from: p  reason: collision with root package name */
    public d0 f2128p;

    /* renamed from: q  reason: collision with root package name */
    public ViewTreeObserver f2129q;

    /* renamed from: r  reason: collision with root package name */
    public boolean f2130r;

    /* renamed from: s  reason: collision with root package name */
    public boolean f2131s;

    /* renamed from: t  reason: collision with root package name */
    public int f2132t;

    /* renamed from: v  reason: collision with root package name */
    public boolean f2134v;

    /* renamed from: k  reason: collision with root package name */
    public final ViewTreeObserver.OnGlobalLayoutListener f2123k = new j0(this);

    /* renamed from: l  reason: collision with root package name */
    public final View.OnAttachStateChangeListener f2124l = new k0(this);

    /* renamed from: u  reason: collision with root package name */
    public int f2133u = 0;

    public l0(Context context, q menu, View anchorView, int popupStyleAttr, int popupStyleRes, boolean overflowOnly) {
        this.f2115c = context;
        this.f2116d = menu;
        this.f2118f = overflowOnly;
        LayoutInflater inflater = LayoutInflater.from(context);
        this.f2117e = new n(menu, inflater, overflowOnly, R.layout.abc_popup_menu_item_layout);
        this.f2120h = popupStyleAttr;
        this.f2121i = popupStyleRes;
        Resources res = context.getResources();
        this.f2119g = Math.max(res.getDisplayMetrics().widthPixels / 2, res.getDimensionPixelSize(R.dimen.abc_config_prefDialogWidth));
        this.f2126n = anchorView;
        this.f2122j = new m2(context, null, popupStyleAttr, popupStyleRes);
        menu.c(this, context);
    }

    @Override // h.a0
    public void r(boolean forceShow) {
        this.f2117e.d(forceShow);
    }

    @Override // h.a0
    public void s(int gravity) {
        this.f2133u = gravity;
    }

    public final boolean z() {
        View view;
        if (a()) {
            return true;
        }
        if (this.f2130r || (view = this.f2126n) == null) {
            return false;
        }
        this.f2127o = view;
        this.f2122j.K(this);
        this.f2122j.L(this);
        this.f2122j.J(true);
        View anchor = this.f2127o;
        boolean addGlobalListener = this.f2129q == null;
        ViewTreeObserver viewTreeObserver = anchor.getViewTreeObserver();
        this.f2129q = viewTreeObserver;
        if (addGlobalListener) {
            viewTreeObserver.addOnGlobalLayoutListener(this.f2123k);
        }
        anchor.addOnAttachStateChangeListener(this.f2124l);
        this.f2122j.D(anchor);
        this.f2122j.G(this.f2133u);
        if (!this.f2131s) {
            this.f2132t = a0.o(this.f2117e, null, this.f2115c, this.f2119g);
            this.f2131s = true;
        }
        this.f2122j.F(this.f2132t);
        this.f2122j.I(2);
        this.f2122j.H(n());
        this.f2122j.i();
        ListView listView = this.f2122j.e();
        listView.setOnKeyListener(this);
        if (this.f2134v && this.f2116d.x() != null) {
            FrameLayout titleItemView = (FrameLayout) LayoutInflater.from(this.f2115c).inflate(R.layout.abc_popup_menu_header_item_layout, (ViewGroup) listView, false);
            TextView titleView = (TextView) titleItemView.findViewById(16908310);
            if (titleView != null) {
                titleView.setText(this.f2116d.x());
            }
            titleItemView.setEnabled(false);
            listView.addHeaderView(titleItemView, null, false);
        }
        this.f2122j.o(this.f2117e);
        this.f2122j.i();
        return true;
    }

    @Override // h.i0
    public void i() {
        if (!z()) {
            throw new IllegalStateException("StandardMenuPopup cannot be used without an anchor");
        }
    }

    @Override // h.i0
    public void dismiss() {
        if (a()) {
            this.f2122j.dismiss();
        }
    }

    @Override // h.a0
    public void l(q menu) {
    }

    @Override // h.i0
    public boolean a() {
        return !this.f2130r && this.f2122j.a();
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public void onDismiss() {
        this.f2130r = true;
        this.f2116d.close();
        ViewTreeObserver viewTreeObserver = this.f2129q;
        if (viewTreeObserver != null) {
            if (!viewTreeObserver.isAlive()) {
                this.f2129q = this.f2127o.getViewTreeObserver();
            }
            this.f2129q.removeGlobalOnLayoutListener(this.f2123k);
            this.f2129q = null;
        }
        this.f2127o.removeOnAttachStateChangeListener(this.f2124l);
        PopupWindow.OnDismissListener onDismissListener = this.f2125m;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
        }
    }

    @Override // h.e0
    public void k(boolean cleared) {
        this.f2131s = false;
        n nVar = this.f2117e;
        if (nVar != null) {
            nVar.notifyDataSetChanged();
        }
    }

    @Override // h.e0
    public void d(d0 cb) {
        this.f2128p = cb;
    }

    @Override // h.e0
    public boolean h(m0 subMenu) {
        if (subMenu.hasVisibleItems()) {
            c0 subPopup = new c0(this.f2115c, subMenu, this.f2127o, this.f2118f, this.f2120h, this.f2121i);
            subPopup.j(this.f2128p);
            subPopup.g(a0.x(subMenu));
            subPopup.i(this.f2125m);
            this.f2125m = null;
            this.f2116d.e(false);
            int horizontalOffset = this.f2122j.d();
            int verticalOffset = this.f2122j.j();
            int hgrav = Gravity.getAbsoluteGravity(this.f2133u, c1.A(this.f2126n)) & 7;
            if (hgrav == 5) {
                horizontalOffset += this.f2126n.getWidth();
            }
            if (subPopup.n(horizontalOffset, verticalOffset)) {
                d0 d0Var = this.f2128p;
                if (d0Var == null) {
                    return true;
                }
                d0Var.c(subMenu);
                return true;
            }
        }
        return false;
    }

    @Override // h.e0
    public void b(q menu, boolean allMenusAreClosing) {
        if (menu == this.f2116d) {
            dismiss();
            d0 d0Var = this.f2128p;
            if (d0Var != null) {
                d0Var.b(menu, allMenusAreClosing);
            }
        }
    }

    @Override // h.e0
    public boolean g() {
        return false;
    }

    @Override // h.a0
    public void p(View anchor) {
        this.f2126n = anchor;
    }

    @Override // android.view.View.OnKeyListener
    public boolean onKey(View v2, int keyCode, KeyEvent event) {
        if (event.getAction() != 1 || keyCode != 82) {
            return false;
        }
        dismiss();
        return true;
    }

    @Override // h.a0
    public void u(PopupWindow.OnDismissListener listener) {
        this.f2125m = listener;
    }

    @Override // h.i0
    public ListView e() {
        return this.f2122j.e();
    }

    @Override // h.a0
    public void t(int x2) {
        this.f2122j.c(x2);
    }

    @Override // h.a0
    public void w(int y2) {
        this.f2122j.m(y2);
    }

    @Override // h.a0
    public void v(boolean showTitle) {
        this.f2134v = showTitle;
    }
}
