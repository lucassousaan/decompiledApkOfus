package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import c.a;
import com.example.helloworld.R;
import f0.c1;
import f0.h1;
import h.d0;
import h.q;

/* JADX WARN: Classes with same name are omitted:
  
 */
/* loaded from: classes.dex */
public class d4 implements r1 {

    /* renamed from: a  reason: collision with root package name */
    public Toolbar f286a;

    /* renamed from: b  reason: collision with root package name */
    public int f287b;

    /* renamed from: c  reason: collision with root package name */
    public View f288c;

    /* renamed from: d  reason: collision with root package name */
    public View f289d;

    /* renamed from: e  reason: collision with root package name */
    public Drawable f290e;

    /* renamed from: f  reason: collision with root package name */
    public Drawable f291f;

    /* renamed from: g  reason: collision with root package name */
    public Drawable f292g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f293h;

    /* renamed from: i  reason: collision with root package name */
    public CharSequence f294i;

    /* renamed from: j  reason: collision with root package name */
    public CharSequence f295j;

    /* renamed from: k  reason: collision with root package name */
    public CharSequence f296k;

    /* renamed from: l  reason: collision with root package name */
    public Window.Callback f297l;

    /* renamed from: m  reason: collision with root package name */
    public boolean f298m;

    /* renamed from: n  reason: collision with root package name */
    public q f299n;

    /* renamed from: o  reason: collision with root package name */
    public int f300o;

    /* renamed from: p  reason: collision with root package name */
    public int f301p;

    /* renamed from: q  reason: collision with root package name */
    public Drawable f302q;

    public d4(Toolbar toolbar, boolean style) {
        this(toolbar, style, R.string.abc_action_bar_up_description);
    }

    public d4(Toolbar toolbar, boolean style, int defaultNavigationContentDescription) {
        Drawable drawable;
        this.f300o = 0;
        this.f301p = 0;
        this.f286a = toolbar;
        this.f294i = toolbar.getTitle();
        this.f295j = toolbar.getSubtitle();
        this.f293h = this.f294i != null;
        this.f292g = toolbar.getNavigationIcon();
        s3 a2 = s3.v(toolbar.getContext(), null, a.f1167a, R.attr.actionBarStyle, 0);
        int[] iArr = a.f1167a;
        this.f302q = a2.g(15);
        if (style) {
            CharSequence title = a2.p(27);
            if (!TextUtils.isEmpty(title)) {
                F(title);
            }
            CharSequence subtitle = a2.p(25);
            if (!TextUtils.isEmpty(subtitle)) {
                E(subtitle);
            }
            Drawable logo = a2.g(20);
            if (logo != null) {
                y(logo);
            }
            Drawable icon = a2.g(17);
            if (icon != null) {
                w(icon);
            }
            if (this.f292g == null && (drawable = this.f302q) != null) {
                D(drawable);
            }
            s(a2.k(10, 0));
            int customNavId = a2.n(9, 0);
            if (customNavId != 0) {
                q(LayoutInflater.from(this.f286a.getContext()).inflate(customNavId, (ViewGroup) this.f286a, false));
                s(this.f287b | 16);
            }
            int height = a2.m(13, 0);
            if (height > 0) {
                ViewGroup.LayoutParams lp = this.f286a.getLayoutParams();
                lp.height = height;
                this.f286a.setLayoutParams(lp);
            }
            int contentInsetStart = a2.e(7, -1);
            int contentInsetEnd = a2.e(3, -1);
            if (contentInsetStart >= 0 || contentInsetEnd >= 0) {
                this.f286a.H(Math.max(contentInsetStart, 0), Math.max(contentInsetEnd, 0));
            }
            int titleTextStyle = a2.n(28, 0);
            if (titleTextStyle != 0) {
                Toolbar toolbar2 = this.f286a;
                toolbar2.K(toolbar2.getContext(), titleTextStyle);
            }
            int subtitleTextStyle = a2.n(26, 0);
            if (subtitleTextStyle != 0) {
                Toolbar toolbar3 = this.f286a;
                toolbar3.J(toolbar3.getContext(), subtitleTextStyle);
            }
            int popupTheme = a2.n(22, 0);
            if (popupTheme != 0) {
                this.f286a.setPopupTheme(popupTheme);
            }
        } else {
            this.f287b = c();
        }
        a2.w();
        r(defaultNavigationContentDescription);
        this.f296k = this.f286a.getNavigationContentDescription();
        this.f286a.setNavigationOnClickListener(new b4(this));
    }

    public void r(int defaultNavigationContentDescription) {
        if (defaultNavigationContentDescription != this.f301p) {
            this.f301p = defaultNavigationContentDescription;
            if (TextUtils.isEmpty(this.f286a.getNavigationContentDescription())) {
                B(this.f301p);
            }
        }
    }

    public final int c() {
        if (this.f286a.getNavigationIcon() == null) {
            return 11;
        }
        int opts = 11 | 4;
        this.f302q = this.f286a.getNavigationIcon();
        return opts;
    }

    public ViewGroup i() {
        return this.f286a;
    }

    public Context e() {
        return this.f286a.getContext();
    }

    public boolean j() {
        return this.f286a.v();
    }

    public void b() {
        this.f286a.e();
    }

    public void I(Window.Callback cb) {
        this.f297l = cb;
    }

    public void J(CharSequence title) {
        if (!this.f293h) {
            G(title);
        }
    }

    public CharSequence h() {
        return this.f286a.getTitle();
    }

    public void F(CharSequence title) {
        this.f293h = true;
        G(title);
    }

    public final void G(CharSequence title) {
        this.f294i = title;
        if ((this.f287b & 8) != 0) {
            this.f286a.setTitle(title);
        }
    }

    public void E(CharSequence subtitle) {
        this.f295j = subtitle;
        if ((this.f287b & 8) != 0) {
            this.f286a.setSubtitle(subtitle);
        }
    }

    public void m() {
        Log.i("ToolbarWidgetWrapper", "Progress display unsupported");
    }

    public void l() {
        Log.i("ToolbarWidgetWrapper", "Progress display unsupported");
    }

    public void v(int resId) {
        w(resId != 0 ? e.a.b(e(), resId) : null);
    }

    public void w(Drawable d2) {
        this.f290e = d2;
        O();
    }

    public void x(int resId) {
        y(resId != 0 ? e.a.b(e(), resId) : null);
    }

    public void y(Drawable d2) {
        this.f291f = d2;
        O();
    }

    public final void O() {
        Drawable logo = null;
        int i2 = this.f287b;
        if ((i2 & 2) != 0) {
            if ((i2 & 1) != 0) {
                logo = this.f291f;
                if (logo == null) {
                    logo = this.f290e;
                }
            } else {
                logo = this.f290e;
            }
        }
        this.f286a.setLogo(logo);
    }

    public boolean a() {
        return this.f286a.d();
    }

    public boolean o() {
        return this.f286a.A();
    }

    public boolean n() {
        return this.f286a.z();
    }

    public boolean L() {
        return this.f286a.N();
    }

    public boolean k() {
        return this.f286a.w();
    }

    public void A() {
        this.f298m = true;
    }

    public void z(Menu menu, d0 cb) {
        if (this.f299n == null) {
            q qVar = new q(this.f286a.getContext());
            this.f299n = qVar;
            qVar.p(R.id.action_menu_presenter);
        }
        this.f299n.d(cb);
        this.f286a.I((q) menu, this.f299n);
    }

    public void d() {
        this.f286a.f();
    }

    public int f() {
        return this.f287b;
    }

    public void s(int newOpts) {
        View view;
        int oldOpts = this.f287b;
        int changed = oldOpts ^ newOpts;
        this.f287b = newOpts;
        if (changed != 0) {
            if ((changed & 4) != 0) {
                if ((newOpts & 4) != 0) {
                    M();
                }
                N();
            }
            if ((changed & 3) != 0) {
                O();
            }
            if ((changed & 8) != 0) {
                if ((newOpts & 8) != 0) {
                    this.f286a.setTitle(this.f294i);
                    this.f286a.setSubtitle(this.f295j);
                } else {
                    this.f286a.setTitle((CharSequence) null);
                    this.f286a.setSubtitle((CharSequence) null);
                }
            }
            if ((changed & 16) != 0 && (view = this.f289d) != null) {
                if ((newOpts & 16) != 0) {
                    this.f286a.addView(view);
                } else {
                    this.f286a.removeView(view);
                }
            }
        }
    }

    public void t(t2 tabView) {
        View view = this.f288c;
        if (view != null) {
            ViewParent parent = view.getParent();
            Toolbar toolbar = this.f286a;
            if (parent == toolbar) {
                toolbar.removeView(this.f288c);
            }
        }
        this.f288c = tabView;
    }

    public void p(boolean collapsible) {
        this.f286a.setCollapsible(collapsible);
    }

    public void u(boolean enable) {
    }

    public int g() {
        return 0;
    }

    public void q(View view) {
        View view2 = this.f289d;
        if (!(view2 == null || (this.f287b & 16) == 0)) {
            this.f286a.removeView(view2);
        }
        this.f289d = view;
        if (view != null && (this.f287b & 16) != 0) {
            this.f286a.addView(view);
        }
    }

    public h1 K(int visibility, long duration) {
        h1 e2 = c1.e(this.f286a);
        e2.a(visibility == 0 ? 1.0f : 0.0f);
        e2.d(duration);
        e2.f(new c4(this, visibility));
        return e2;
    }

    public void D(Drawable icon) {
        this.f292g = icon;
        N();
    }

    public final void N() {
        if ((this.f287b & 4) != 0) {
            Toolbar toolbar = this.f286a;
            Drawable drawable = this.f292g;
            if (drawable == null) {
                drawable = this.f302q;
            }
            toolbar.setNavigationIcon(drawable);
            return;
        }
        this.f286a.setNavigationIcon((Drawable) null);
    }

    public void C(CharSequence description) {
        this.f296k = description;
        M();
    }

    public void B(int resId) {
        C(resId == 0 ? null : e().getString(resId));
    }

    public final void M() {
        if ((this.f287b & 4) == 0) {
            return;
        }
        if (TextUtils.isEmpty(this.f296k)) {
            this.f286a.setNavigationContentDescription(this.f301p);
        } else {
            this.f286a.setNavigationContentDescription(this.f296k);
        }
    }

    public void H(int visible) {
        this.f286a.setVisibility(visible);
    }
}
