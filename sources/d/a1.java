package d;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.View;
import android.view.Window;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import androidx.appcompat.widget.ActionBarContainer;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import androidx.appcompat.widget.Toolbar;
import androidx.appcompat.widget.d4;
import androidx.appcompat.widget.h;
import androidx.appcompat.widget.r1;
import com.example.helloworld.R;
import f0.c1;
import f0.h1;
import f0.i1;
import f0.k1;
import g.a;
import g.b;
import g.c;
import g.m;
import h.q;
import java.util.ArrayList;

/* JADX WARN: Classes with same name are omitted:
  
 */
/* loaded from: classes.dex */
public class a1 extends c implements h {

    /* renamed from: a  reason: collision with root package name */
    public Context f1581a;

    /* renamed from: b  reason: collision with root package name */
    public Context f1582b;

    /* renamed from: c  reason: collision with root package name */
    public ActionBarOverlayLayout f1583c;

    /* renamed from: d  reason: collision with root package name */
    public ActionBarContainer f1584d;

    /* renamed from: e  reason: collision with root package name */
    public r1 f1585e;

    /* renamed from: f  reason: collision with root package name */
    public ActionBarContextView f1586f;

    /* renamed from: g  reason: collision with root package name */
    public View f1587g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f1588h;

    /* renamed from: i  reason: collision with root package name */
    public z0 f1589i;

    /* renamed from: j  reason: collision with root package name */
    public c f1590j;

    /* renamed from: k  reason: collision with root package name */
    public b f1591k;

    /* renamed from: l  reason: collision with root package name */
    public boolean f1592l;

    /* renamed from: n  reason: collision with root package name */
    public boolean f1594n;

    /* renamed from: q  reason: collision with root package name */
    public boolean f1597q;

    /* renamed from: r  reason: collision with root package name */
    public boolean f1598r;

    /* renamed from: t  reason: collision with root package name */
    public m f1600t;

    /* renamed from: u  reason: collision with root package name */
    public boolean f1601u;

    /* renamed from: v  reason: collision with root package name */
    public boolean f1602v;

    /* renamed from: z  reason: collision with root package name */
    public static final Interpolator f1580z = new AccelerateInterpolator();
    public static final Interpolator A = new DecelerateInterpolator();

    /* renamed from: m  reason: collision with root package name */
    public ArrayList f1593m = new ArrayList();

    /* renamed from: o  reason: collision with root package name */
    public int f1595o = 0;

    /* renamed from: p  reason: collision with root package name */
    public boolean f1596p = true;

    /* renamed from: s  reason: collision with root package name */
    public boolean f1599s = true;

    /* renamed from: w  reason: collision with root package name */
    public final i1 f1603w = new w0(this);

    /* renamed from: x  reason: collision with root package name */
    public final i1 f1604x = new x0(this);

    /* renamed from: y  reason: collision with root package name */
    public final k1 f1605y = new y0(this);

    public a1(Activity activity, boolean overlayMode) {
        new ArrayList();
        Window window = activity.getWindow();
        View decor = window.getDecorView();
        z(decor);
        if (!overlayMode) {
            this.f1587g = decor.findViewById(16908290);
        }
    }

    public a1(Dialog dialog) {
        new ArrayList();
        z(dialog.getWindow().getDecorView());
    }

    public final void z(View decor) {
        ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) decor.findViewById(R.id.decor_content_parent);
        this.f1583c = actionBarOverlayLayout;
        if (actionBarOverlayLayout != null) {
            actionBarOverlayLayout.setActionBarVisibilityCallback(this);
        }
        this.f1585e = v(decor.findViewById(R.id.action_bar));
        this.f1586f = (ActionBarContextView) decor.findViewById(R.id.action_context_bar);
        ActionBarContainer actionBarContainer = (ActionBarContainer) decor.findViewById(R.id.action_bar_container);
        this.f1584d = actionBarContainer;
        r1 r1Var = this.f1585e;
        if (r1Var == null || this.f1586f == null || actionBarContainer == null) {
            throw new IllegalStateException(getClass().getSimpleName() + " can only be used with a compatible window decor layout");
        }
        this.f1581a = ((d4) r1Var).e();
        int current = ((d4) this.f1585e).f();
        boolean homeAsUp = (current & 4) != 0;
        if (homeAsUp) {
            this.f1588h = true;
        }
        a abp = a.b(this.f1581a);
        I(abp.a() || homeAsUp);
        G(abp.e());
        TypedArray a2 = this.f1581a.obtainStyledAttributes(null, c.a.f1167a, R.attr.actionBarStyle, 0);
        int[] iArr = c.a.f1167a;
        if (a2.getBoolean(14, false)) {
            H(true);
        }
        int elevation = a2.getDimensionPixelSize(12, 0);
        if (elevation != 0) {
            F(elevation);
        }
        a2.recycle();
    }

    public final r1 v(View view) {
        if (view instanceof r1) {
            return (r1) view;
        }
        if (view instanceof Toolbar) {
            return ((Toolbar) view).getWrapper();
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Can't make a decor toolbar out of ");
        sb.append(view != null ? view.getClass().getSimpleName() : "null");
        throw new IllegalStateException(sb.toString());
    }

    public void F(float elevation) {
        c1.r0(this.f1584d, elevation);
    }

    @Override // d.c
    public void g(Configuration newConfig) {
        G(a.b(this.f1581a).e());
    }

    public final void G(boolean hasEmbeddedTabs) {
        this.f1594n = hasEmbeddedTabs;
        if (!hasEmbeddedTabs) {
            ((d4) this.f1585e).t(null);
            this.f1584d.setTabContainer(null);
        } else {
            this.f1584d.setTabContainer(null);
            ((d4) this.f1585e).t(null);
        }
        w();
        boolean z2 = false;
        ((d4) this.f1585e).p(!this.f1594n && 0 != 0);
        ActionBarOverlayLayout actionBarOverlayLayout = this.f1583c;
        if (!this.f1594n && 0 != 0) {
            z2 = true;
        }
        actionBarOverlayLayout.setHasNonEmbeddedTabs(z2);
    }

    public void r() {
        b bVar = this.f1591k;
        if (bVar != null) {
            bVar.b(this.f1590j);
            this.f1590j = null;
            this.f1591k = null;
        }
    }

    public void C(int visibility) {
        this.f1595o = visibility;
    }

    @Override // d.c
    public void m(boolean enabled) {
        m mVar;
        this.f1601u = enabled;
        if (!enabled && (mVar = this.f1600t) != null) {
            mVar.a();
        }
    }

    @Override // d.c
    public void c(boolean isVisible) {
        if (isVisible != this.f1592l) {
            this.f1592l = isVisible;
            int count = this.f1593m.size();
            for (int i2 = 0; i2 < count; i2++) {
                ((b) this.f1593m.get(i2)).a(isVisible);
            }
        }
    }

    public void D(boolean showHomeAsUp) {
        E(showHomeAsUp ? 4 : 0, 4);
    }

    public void I(boolean enable) {
        ((d4) this.f1585e).u(enable);
    }

    @Override // d.c
    public void n(CharSequence title) {
        ((d4) this.f1585e).J(title);
    }

    public void E(int options, int mask) {
        int current = ((d4) this.f1585e).f();
        if ((mask & 4) != 0) {
            this.f1588h = true;
        }
        ((d4) this.f1585e).s((options & mask) | ((~mask) & current));
    }

    public int w() {
        ((d4) this.f1585e).g();
        return 0;
    }

    @Override // d.c
    public int d() {
        return ((d4) this.f1585e).f();
    }

    @Override // d.c
    public c o(b callback) {
        z0 z0Var = this.f1589i;
        if (z0Var != null) {
            z0Var.c();
        }
        this.f1583c.setHideOnContentScrollEnabled(false);
        this.f1586f.k();
        z0 mode = new z0(this, this.f1586f.getContext(), callback);
        if (!mode.t()) {
            return null;
        }
        this.f1589i = mode;
        mode.k();
        this.f1586f.h(mode);
        p(true);
        this.f1586f.sendAccessibilityEvent(32);
        return mode;
    }

    public void u(boolean enabled) {
        this.f1596p = enabled;
    }

    public final void K() {
        if (!this.f1598r) {
            this.f1598r = true;
            ActionBarOverlayLayout actionBarOverlayLayout = this.f1583c;
            if (actionBarOverlayLayout != null) {
                actionBarOverlayLayout.setShowingForActionMode(true);
            }
            M(false);
        }
    }

    public void L() {
        if (this.f1597q) {
            this.f1597q = false;
            M(true);
        }
    }

    public final void x() {
        if (this.f1598r) {
            this.f1598r = false;
            ActionBarOverlayLayout actionBarOverlayLayout = this.f1583c;
            if (actionBarOverlayLayout != null) {
                actionBarOverlayLayout.setShowingForActionMode(false);
            }
            M(false);
        }
    }

    public void y() {
        if (!this.f1597q) {
            this.f1597q = true;
            M(true);
        }
    }

    public void H(boolean hideOnContentScroll) {
        if (!hideOnContentScroll || this.f1583c.r()) {
            this.f1602v = hideOnContentScroll;
            this.f1583c.setHideOnContentScrollEnabled(hideOnContentScroll);
            return;
        }
        throw new IllegalStateException("Action bar must be in overlay mode (Window.FEATURE_OVERLAY_ACTION_BAR) to enable hide on content scroll");
    }

    public static boolean q(boolean hiddenByApp, boolean hiddenBySystem, boolean showingForMode) {
        if (showingForMode) {
            return true;
        }
        if (hiddenByApp || hiddenBySystem) {
            return false;
        }
        return true;
    }

    public final void M(boolean fromSystem) {
        boolean shown = q(false, this.f1597q, this.f1598r);
        if (shown) {
            if (!this.f1599s) {
                this.f1599s = true;
                t(fromSystem);
            }
        } else if (this.f1599s) {
            this.f1599s = false;
            s(fromSystem);
        }
    }

    public void t(boolean fromSystem) {
        View view;
        View view2;
        m mVar = this.f1600t;
        if (mVar != null) {
            mVar.a();
        }
        this.f1584d.setVisibility(0);
        if (this.f1595o != 0 || (!this.f1601u && !fromSystem)) {
            this.f1584d.setAlpha(1.0f);
            this.f1584d.setTranslationY(0.0f);
            if (this.f1596p && (view = this.f1587g) != null) {
                view.setTranslationY(0.0f);
            }
            this.f1604x.a(null);
        } else {
            this.f1584d.setTranslationY(0.0f);
            float startingY = -this.f1584d.getHeight();
            if (fromSystem) {
                int[] topLeft = {0, 0};
                this.f1584d.getLocationInWindow(topLeft);
                startingY -= topLeft[1];
            }
            this.f1584d.setTranslationY(startingY);
            m anim = new m();
            h1 a2 = c1.e(this.f1584d).k(0.0f);
            a2.i(this.f1605y);
            anim.c(a2);
            if (this.f1596p && (view2 = this.f1587g) != null) {
                view2.setTranslationY(startingY);
                h1 e2 = c1.e(this.f1587g);
                e2.k(0.0f);
                anim.c(e2);
            }
            anim.f(A);
            anim.e(250L);
            anim.g(this.f1604x);
            this.f1600t = anim;
            anim.h();
        }
        ActionBarOverlayLayout actionBarOverlayLayout = this.f1583c;
        if (actionBarOverlayLayout != null) {
            c1.i0(actionBarOverlayLayout);
        }
    }

    public void s(boolean fromSystem) {
        View view;
        m mVar = this.f1600t;
        if (mVar != null) {
            mVar.a();
        }
        if (this.f1595o != 0 || (!this.f1601u && !fromSystem)) {
            this.f1603w.a(null);
            return;
        }
        this.f1584d.setAlpha(1.0f);
        this.f1584d.setTransitioning(true);
        m anim = new m();
        float endingY = -this.f1584d.getHeight();
        if (fromSystem) {
            int[] topLeft = {0, 0};
            this.f1584d.getLocationInWindow(topLeft);
            endingY -= topLeft[1];
        }
        h1 a2 = c1.e(this.f1584d).k(endingY);
        a2.i(this.f1605y);
        anim.c(a2);
        if (this.f1596p && (view = this.f1587g) != null) {
            h1 e2 = c1.e(view);
            e2.k(endingY);
            anim.c(e2);
        }
        anim.f(f1580z);
        anim.e(250L);
        anim.g(this.f1603w);
        this.f1600t = anim;
        anim.h();
    }

    public void p(boolean toActionMode) {
        h1 fadeIn;
        h1 fadeOut;
        if (toActionMode) {
            K();
        } else {
            x();
        }
        if (J()) {
            if (toActionMode) {
                fadeOut = ((d4) this.f1585e).K(4, 100L);
                fadeIn = this.f1586f.f(0, 200L);
            } else {
                fadeIn = ((d4) this.f1585e).K(0, 200L);
                fadeOut = this.f1586f.f(8, 100L);
            }
            m set = new m();
            set.d(fadeOut, fadeIn);
            set.h();
        } else if (toActionMode) {
            ((d4) this.f1585e).H(4);
            this.f1586f.setVisibility(0);
        } else {
            ((d4) this.f1585e).H(0);
            this.f1586f.setVisibility(8);
        }
    }

    public final boolean J() {
        return c1.P(this.f1584d);
    }

    @Override // d.c
    public Context e() {
        if (this.f1582b == null) {
            TypedValue outValue = new TypedValue();
            Resources.Theme currentTheme = this.f1581a.getTheme();
            currentTheme.resolveAttribute(R.attr.actionBarWidgetTheme, outValue, true);
            int targetThemeRes = outValue.resourceId;
            if (targetThemeRes != 0) {
                this.f1582b = new ContextThemeWrapper(this.f1581a, targetThemeRes);
            } else {
                this.f1582b = this.f1581a;
            }
        }
        return this.f1582b;
    }

    public void A() {
        m mVar = this.f1600t;
        if (mVar != null) {
            mVar.a();
            this.f1600t = null;
        }
    }

    public void B() {
    }

    @Override // d.c
    public boolean b() {
        r1 r1Var = this.f1585e;
        if (r1Var == null || !((d4) r1Var).j()) {
            return false;
        }
        ((d4) this.f1585e).b();
        return true;
    }

    @Override // d.c
    public void l(boolean enable) {
        if (!this.f1588h) {
            D(enable);
        }
    }

    @Override // d.c
    public boolean i(int keyCode, KeyEvent event) {
        Menu menu;
        z0 z0Var = this.f1589i;
        if (z0Var == null || (menu = z0Var.e()) == null) {
            return false;
        }
        KeyCharacterMap kmap = KeyCharacterMap.load(event != null ? event.getDeviceId() : -1);
        boolean z2 = true;
        if (kmap.getKeyboardType() == 1) {
            z2 = false;
        }
        menu.setQwertyMode(z2);
        return ((q) menu).performShortcut(keyCode, event, 0);
    }
}
