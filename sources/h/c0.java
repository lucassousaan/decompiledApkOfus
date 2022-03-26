package h;

import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.view.Display;
import android.view.View;
import android.view.WindowManager;
import android.widget.PopupWindow;
import com.example.helloworld.R;
import f0.c1;
import f0.o;

/* JADX WARN: Classes with same name are omitted:
  
 */
/* loaded from: classes.dex */
public class c0 {

    /* renamed from: a  reason: collision with root package name */
    public final Context f2053a;

    /* renamed from: b  reason: collision with root package name */
    public final q f2054b;

    /* renamed from: c  reason: collision with root package name */
    public final boolean f2055c;

    /* renamed from: d  reason: collision with root package name */
    public final int f2056d;

    /* renamed from: e  reason: collision with root package name */
    public final int f2057e;

    /* renamed from: f  reason: collision with root package name */
    public View f2058f;

    /* renamed from: g  reason: collision with root package name */
    public int f2059g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f2060h;

    /* renamed from: i  reason: collision with root package name */
    public d0 f2061i;

    /* renamed from: j  reason: collision with root package name */
    public a0 f2062j;

    /* renamed from: k  reason: collision with root package name */
    public PopupWindow.OnDismissListener f2063k;

    /* renamed from: l  reason: collision with root package name */
    public final PopupWindow.OnDismissListener f2064l;

    public c0(Context context, q menu, View anchorView, boolean overflowOnly, int popupStyleAttr) {
        this(context, menu, anchorView, overflowOnly, popupStyleAttr, 0);
    }

    public c0(Context context, q menu, View anchorView, boolean overflowOnly, int popupStyleAttr, int popupStyleRes) {
        this.f2059g = 8388611;
        this.f2064l = new b0(this);
        this.f2053a = context;
        this.f2054b = menu;
        this.f2058f = anchorView;
        this.f2055c = overflowOnly;
        this.f2056d = popupStyleAttr;
        this.f2057e = popupStyleRes;
    }

    public void i(PopupWindow.OnDismissListener listener) {
        this.f2063k = listener;
    }

    public void f(View anchor) {
        this.f2058f = anchor;
    }

    public void g(boolean forceShowIcon) {
        this.f2060h = forceShowIcon;
        a0 a0Var = this.f2062j;
        if (a0Var != null) {
            a0Var.r(forceShowIcon);
        }
    }

    public void h(int gravity) {
        this.f2059g = gravity;
    }

    public void k() {
        if (!m()) {
            throw new IllegalStateException("MenuPopupHelper cannot be used without an anchor");
        }
    }

    public a0 c() {
        if (this.f2062j == null) {
            this.f2062j = a();
        }
        return this.f2062j;
    }

    public boolean m() {
        if (d()) {
            return true;
        }
        if (this.f2058f == null) {
            return false;
        }
        l(0, 0, false, false);
        return true;
    }

    public boolean n(int x2, int y2) {
        if (d()) {
            return true;
        }
        if (this.f2058f == null) {
            return false;
        }
        l(x2, y2, true, true);
        return true;
    }

    public final a0 a() {
        a0 popup;
        WindowManager windowManager = (WindowManager) this.f2053a.getSystemService("window");
        Display display = windowManager.getDefaultDisplay();
        Point displaySize = new Point();
        display.getRealSize(displaySize);
        int smallestWidth = Math.min(displaySize.x, displaySize.y);
        int minSmallestWidthCascading = this.f2053a.getResources().getDimensionPixelSize(R.dimen.abc_cascading_menus_min_smallest_width);
        boolean enableCascadingSubmenus = smallestWidth >= minSmallestWidthCascading;
        if (enableCascadingSubmenus) {
            popup = new k(this.f2053a, this.f2058f, this.f2056d, this.f2057e, this.f2055c);
        } else {
            popup = new l0(this.f2053a, this.f2054b, this.f2058f, this.f2056d, this.f2057e, this.f2055c);
        }
        popup.l(this.f2054b);
        popup.u(this.f2064l);
        popup.p(this.f2058f);
        popup.d(this.f2061i);
        popup.r(this.f2060h);
        popup.s(this.f2059g);
        return popup;
    }

    public final void l(int xOffset, int yOffset, boolean useOffsets, boolean showTitle) {
        a0 popup = c();
        popup.v(showTitle);
        if (useOffsets) {
            int hgrav = o.b(this.f2059g, c1.A(this.f2058f)) & 7;
            if (hgrav == 5) {
                xOffset -= this.f2058f.getWidth();
            }
            popup.t(xOffset);
            popup.w(yOffset);
            float density = this.f2053a.getResources().getDisplayMetrics().density;
            int halfSize = (int) ((48.0f * density) / 2.0f);
            Rect epicenter = new Rect(xOffset - halfSize, yOffset - halfSize, xOffset + halfSize, yOffset + halfSize);
            popup.q(epicenter);
        }
        popup.i();
    }

    public void b() {
        if (d()) {
            this.f2062j.dismiss();
        }
    }

    public void e() {
        this.f2062j = null;
        PopupWindow.OnDismissListener onDismissListener = this.f2063k;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
        }
    }

    public boolean d() {
        a0 a0Var = this.f2062j;
        return a0Var != null && a0Var.a();
    }

    public void j(d0 cb) {
        this.f2061i = cb;
        a0 a0Var = this.f2062j;
        if (a0Var != null) {
            a0Var.d(cb);
        }
    }
}
