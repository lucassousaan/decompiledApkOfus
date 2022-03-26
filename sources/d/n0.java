package d;

import android.app.Activity;
import android.app.Dialog;
import android.app.UiModeManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.media.AudioManager;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.AndroidRuntimeException;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import androidx.appcompat.widget.ContentFrameLayout;
import androidx.appcompat.widget.ViewStubCompat;
import androidx.appcompat.widget.d0;
import androidx.appcompat.widget.j4;
import androidx.appcompat.widget.l4;
import androidx.appcompat.widget.q1;
import androidx.appcompat.widget.s3;
import androidx.lifecycle.i;
import androidx.lifecycle.m;
import c.a;
import com.example.helloworld.R;
import f0.c1;
import f0.h1;
import f0.p;
import f0.r;
import g.b;
import g.c;
import g.e;
import g.f;
import h.g0;
import h.o;
import h.q;
import java.util.Objects;
import k.n;
import u.j;
import v.d;
import w.k;

/* JADX WARN: Classes with same name are omitted:
  
 */
/* loaded from: classes.dex */
public class n0 extends q implements o, LayoutInflater.Factory2 {

    /* renamed from: b0  reason: collision with root package name */
    public static final n f1682b0 = new n();

    /* renamed from: c0  reason: collision with root package name */
    public static final boolean f1683c0 = false;

    /* renamed from: d0  reason: collision with root package name */
    public static final int[] f1684d0 = {16842836};

    /* renamed from: e0  reason: collision with root package name */
    public static final boolean f1685e0 = !"robolectric".equals(Build.FINGERPRINT);

    /* renamed from: f0  reason: collision with root package name */
    public static final boolean f1686f0 = true;
    public boolean A;
    public boolean B;
    public boolean C;
    public boolean D;
    public boolean E;
    public boolean F;
    public boolean G;
    public l0[] H;
    public l0 I;
    public boolean J;
    public boolean K;
    public boolean L;
    public boolean M;
    public boolean N;
    public int O;
    public int P;
    public boolean Q;
    public boolean R;
    public h0 S;
    public h0 T;
    public boolean U;
    public int V;
    public final Runnable W;
    public boolean X;
    public Rect Y;
    public Rect Z;

    /* renamed from: a0  reason: collision with root package name */
    public r0 f1687a0;

    /* renamed from: e  reason: collision with root package name */
    public final Object f1688e;

    /* renamed from: f  reason: collision with root package name */
    public final Context f1689f;

    /* renamed from: g  reason: collision with root package name */
    public Window f1690g;

    /* renamed from: h  reason: collision with root package name */
    public e0 f1691h;

    /* renamed from: i  reason: collision with root package name */
    public final p f1692i;

    /* renamed from: j  reason: collision with root package name */
    public c f1693j;

    /* renamed from: k  reason: collision with root package name */
    public MenuInflater f1694k;

    /* renamed from: l  reason: collision with root package name */
    public CharSequence f1695l;

    /* renamed from: m  reason: collision with root package name */
    public q1 f1696m;

    /* renamed from: n  reason: collision with root package name */
    public x f1697n;

    /* renamed from: o  reason: collision with root package name */
    public m0 f1698o;

    /* renamed from: p  reason: collision with root package name */
    public c f1699p;

    /* renamed from: q  reason: collision with root package name */
    public ActionBarContextView f1700q;

    /* renamed from: r  reason: collision with root package name */
    public PopupWindow f1701r;

    /* renamed from: s  reason: collision with root package name */
    public Runnable f1702s;

    /* renamed from: t  reason: collision with root package name */
    public h1 f1703t;

    /* renamed from: u  reason: collision with root package name */
    public boolean f1704u;

    /* renamed from: v  reason: collision with root package name */
    public boolean f1705v;

    /* renamed from: w  reason: collision with root package name */
    public ViewGroup f1706w;

    /* renamed from: x  reason: collision with root package name */
    public TextView f1707x;

    /* renamed from: y  reason: collision with root package name */
    public View f1708y;

    /* renamed from: z  reason: collision with root package name */
    public boolean f1709z;

    public n0(Activity activity, p callback) {
        this(activity, null, callback, activity);
    }

    public n0(Dialog dialog, p callback) {
        this(dialog.getContext(), dialog.getWindow(), callback, dialog);
    }

    public n0(Context context, Window window, p callback, Object host) {
        o activity;
        this.f1703t = null;
        this.f1704u = true;
        this.O = -100;
        this.W = new r(this);
        this.f1689f = context;
        this.f1692i = callback;
        this.f1688e = host;
        if (this.O == -100 && (host instanceof Dialog) && (activity = H0()) != null) {
            this.O = activity.x().k();
        }
        if (this.O == -100) {
            n nVar = f1682b0;
            Integer value = (Integer) nVar.get(host.getClass().getName());
            if (value != null) {
                this.O = value.intValue();
                nVar.remove(host.getClass().getName());
            }
        }
        if (window != null) {
            I(window);
        }
        d0.h();
    }

    @Override // d.q
    public Context f(Context baseContext) {
        boolean needsThemeRebase = true;
        this.K = true;
        int modeToApply = n0(baseContext, J());
        if (f1686f0 && (baseContext instanceof ContextThemeWrapper)) {
            Configuration config = P(baseContext, modeToApply, null);
            try {
                j0.a((ContextThemeWrapper) baseContext, config);
                return baseContext;
            } catch (IllegalStateException e2) {
            }
        }
        if (baseContext instanceof e) {
            Configuration config2 = P(baseContext, modeToApply, null);
            try {
                ((e) baseContext).a(config2);
                return baseContext;
            } catch (IllegalStateException e3) {
            }
        }
        if (!f1685e0) {
            super.f(baseContext);
            return baseContext;
        }
        Configuration configOverlay = null;
        Configuration overrideConfig = new Configuration();
        overrideConfig.uiMode = -1;
        overrideConfig.fontScale = 0.0f;
        Configuration referenceConfig = a0.a(baseContext, overrideConfig).getResources().getConfiguration();
        Configuration baseConfig = baseContext.getResources().getConfiguration();
        referenceConfig.uiMode = baseConfig.uiMode;
        if (!referenceConfig.equals(baseConfig)) {
            configOverlay = Z(referenceConfig, baseConfig);
        }
        Configuration config3 = P(baseContext, modeToApply, configOverlay);
        e wrappedContext = new e(baseContext, 2131755410);
        wrappedContext.a(config3);
        try {
            if (baseContext.getTheme() == null) {
                needsThemeRebase = false;
            }
        } catch (NullPointerException e4) {
            needsThemeRebase = false;
        }
        if (needsThemeRebase) {
            k.a(wrappedContext.getTheme());
        }
        super.f(wrappedContext);
        return wrappedContext;
    }

    @Override // d.q
    public void q(Bundle savedInstanceState) {
        this.K = true;
        G(false);
        X();
        Object obj = this.f1688e;
        if (obj instanceof Activity) {
            String parentActivityName = null;
            try {
                parentActivityName = j.c((Activity) obj);
            } catch (IllegalArgumentException e2) {
            }
            if (parentActivityName != null) {
                c ab = y0();
                if (ab == null) {
                    this.X = true;
                } else {
                    ab.l(true);
                }
            }
            q.c(this);
        }
        this.L = true;
    }

    @Override // d.q
    public void s(Bundle savedInstanceState) {
        W();
    }

    @Override // d.q
    public c m() {
        g0();
        return this.f1693j;
    }

    public final c y0() {
        return this.f1693j;
    }

    public final Window.Callback f0() {
        return this.f1690g.getCallback();
    }

    public final void g0() {
        W();
        if (this.B && this.f1693j == null) {
            Object obj = this.f1688e;
            if (obj instanceof Activity) {
                this.f1693j = new a1((Activity) this.f1688e, this.C);
            } else if (obj instanceof Dialog) {
                this.f1693j = new a1((Dialog) this.f1688e);
            }
            c cVar = this.f1693j;
            if (cVar != null) {
                cVar.l(this.X);
            }
        }
    }

    public final Context a0() {
        Context context = null;
        c ab = m();
        if (ab != null) {
            context = ab.e();
        }
        if (context != null) {
            return context;
        }
        Context context2 = this.f1689f;
        return context2;
    }

    @Override // d.q
    public MenuInflater l() {
        if (this.f1694k == null) {
            g0();
            c cVar = this.f1693j;
            this.f1694k = new g.k(cVar != null ? cVar.e() : this.f1689f);
        }
        return this.f1694k;
    }

    @Override // d.q
    public View i(int id) {
        W();
        return this.f1690g.findViewById(id);
    }

    @Override // d.q
    public void p(Configuration newConfig) {
        c ab;
        if (this.B && this.f1705v && (ab = m()) != null) {
            ab.g(newConfig);
        }
        d0.b().g(this.f1689f);
        G(false);
    }

    @Override // d.q
    public void v() {
        this.M = true;
        F();
    }

    @Override // d.q
    public void w() {
        this.M = false;
        c ab = m();
        if (ab != null) {
            ab.m(false);
        }
    }

    @Override // d.q
    public void t() {
        c ab = m();
        if (ab != null) {
            ab.m(true);
        }
    }

    @Override // d.q
    public void B(View v2) {
        W();
        ViewGroup contentParent = (ViewGroup) this.f1706w.findViewById(16908290);
        contentParent.removeAllViews();
        contentParent.addView(v2);
        this.f1691h.a().onContentChanged();
    }

    @Override // d.q
    public void A(int resId) {
        W();
        ViewGroup contentParent = (ViewGroup) this.f1706w.findViewById(16908290);
        contentParent.removeAllViews();
        LayoutInflater.from(this.f1689f).inflate(resId, contentParent);
        this.f1691h.a().onContentChanged();
    }

    @Override // d.q
    public void C(View v2, ViewGroup.LayoutParams lp) {
        W();
        ViewGroup contentParent = (ViewGroup) this.f1706w.findViewById(16908290);
        contentParent.removeAllViews();
        contentParent.addView(v2, lp);
        this.f1691h.a().onContentChanged();
    }

    @Override // d.q
    public void d(View v2, ViewGroup.LayoutParams lp) {
        W();
        ViewGroup contentParent = (ViewGroup) this.f1706w.findViewById(16908290);
        contentParent.addView(v2, lp);
        this.f1691h.a().onContentChanged();
    }

    @Override // d.q
    public void u(Bundle outState) {
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x005b  */
    @Override // d.q
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void r() {
        /*
            r3 = this;
            java.lang.Object r0 = r3.f1688e
            boolean r0 = r0 instanceof android.app.Activity
            if (r0 == 0) goto L_0x0009
            d.q.x(r3)
        L_0x0009:
            boolean r0 = r3.U
            if (r0 == 0) goto L_0x0018
            android.view.Window r0 = r3.f1690g
            android.view.View r0 = r0.getDecorView()
            java.lang.Runnable r1 = r3.W
            r0.removeCallbacks(r1)
        L_0x0018:
            r0 = 0
            r3.M = r0
            r0 = 1
            r3.N = r0
            int r0 = r3.O
            r1 = -100
            if (r0 == r1) goto L_0x0048
            java.lang.Object r0 = r3.f1688e
            boolean r1 = r0 instanceof android.app.Activity
            if (r1 == 0) goto L_0x0048
            android.app.Activity r0 = (android.app.Activity) r0
            boolean r0 = r0.isChangingConfigurations()
            if (r0 == 0) goto L_0x0048
            k.n r0 = d.n0.f1682b0
            java.lang.Object r1 = r3.f1688e
            java.lang.Class r1 = r1.getClass()
            java.lang.String r1 = r1.getName()
            int r2 = r3.O
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r0.put(r1, r2)
            goto L_0x0057
        L_0x0048:
            k.n r0 = d.n0.f1682b0
            java.lang.Object r1 = r3.f1688e
            java.lang.Class r1 = r1.getClass()
            java.lang.String r1 = r1.getName()
            r0.remove(r1)
        L_0x0057:
            d.c r0 = r3.f1693j
            if (r0 == 0) goto L_0x005e
            r0.h()
        L_0x005e:
            r3.M()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: d.n0.r():void");
    }

    public final void M() {
        h0 h0Var = this.S;
        if (h0Var != null) {
            h0Var.a();
        }
        h0 h0Var2 = this.T;
        if (h0Var2 != null) {
            h0Var2.a();
        }
    }

    @Override // d.q
    public void D(int themeResId) {
        this.P = themeResId;
    }

    public final void X() {
        if (this.f1690g == null) {
            Object obj = this.f1688e;
            if (obj instanceof Activity) {
                I(((Activity) obj).getWindow());
            }
        }
        if (this.f1690g == null) {
            throw new IllegalStateException("We have not been given a Window");
        }
    }

    public final void I(Window window) {
        if (this.f1690g == null) {
            Window.Callback callback = window.getCallback();
            if (!(callback instanceof e0)) {
                e0 e0Var = new e0(this, callback);
                this.f1691h = e0Var;
                window.setCallback(e0Var);
                s3 a2 = s3.u(this.f1689f, null, f1684d0);
                Drawable winBg = a2.h(0);
                if (winBg != null) {
                    window.setBackgroundDrawable(winBg);
                }
                a2.w();
                this.f1690g = window;
                return;
            }
            throw new IllegalStateException("AppCompat has already installed itself into the Window");
        }
        throw new IllegalStateException("AppCompat has already installed itself into the Window");
    }

    public final void W() {
        if (!this.f1705v) {
            this.f1706w = Q();
            CharSequence title = e0();
            if (!TextUtils.isEmpty(title)) {
                q1 q1Var = this.f1696m;
                if (q1Var != null) {
                    q1Var.setWindowTitle(title);
                } else if (y0() != null) {
                    y0().n(title);
                } else {
                    TextView textView = this.f1707x;
                    if (textView != null) {
                        textView.setText(title);
                    }
                }
            }
            H();
            w0();
            this.f1705v = true;
            l0 st = d0(0);
            if (!this.N && st.f1669h == null) {
                k0(108);
            }
        }
    }

    public final ViewGroup Q() {
        Context themedContext;
        TypedArray a2 = this.f1689f.obtainStyledAttributes(a.f1176j);
        int[] iArr = a.f1167a;
        if (a2.hasValue(117)) {
            if (a2.getBoolean(126, false)) {
                z(1);
            } else if (a2.getBoolean(117, false)) {
                z(108);
            }
            if (a2.getBoolean(118, false)) {
                z(109);
            }
            if (a2.getBoolean(119, false)) {
                z(10);
            }
            this.E = a2.getBoolean(0, false);
            a2.recycle();
            X();
            this.f1690g.getDecorView();
            LayoutInflater inflater = LayoutInflater.from(this.f1689f);
            ViewGroup subDecor = null;
            if (this.F) {
                subDecor = this.D ? (ViewGroup) inflater.inflate(R.layout.abc_screen_simple_overlay_action_mode, (ViewGroup) null) : (ViewGroup) inflater.inflate(R.layout.abc_screen_simple, (ViewGroup) null);
            } else if (this.E) {
                subDecor = (ViewGroup) inflater.inflate(R.layout.abc_dialog_title_material, (ViewGroup) null);
                this.C = false;
                this.B = false;
            } else if (this.B) {
                TypedValue outValue = new TypedValue();
                this.f1689f.getTheme().resolveAttribute(R.attr.actionBarTheme, outValue, true);
                if (outValue.resourceId != 0) {
                    themedContext = new e(this.f1689f, outValue.resourceId);
                } else {
                    themedContext = this.f1689f;
                }
                subDecor = (ViewGroup) LayoutInflater.from(themedContext).inflate(R.layout.abc_screen_toolbar, (ViewGroup) null);
                q1 q1Var = (q1) subDecor.findViewById(R.id.decor_content_parent);
                this.f1696m = q1Var;
                q1Var.setWindowCallback(f0());
                if (this.C) {
                    ((ActionBarOverlayLayout) this.f1696m).q(109);
                }
                if (this.f1709z) {
                    ((ActionBarOverlayLayout) this.f1696m).q(2);
                }
                if (this.A) {
                    ((ActionBarOverlayLayout) this.f1696m).q(5);
                }
            }
            if (subDecor != null) {
                c1.u0(subDecor, new s(this));
                if (this.f1696m == null) {
                    this.f1707x = (TextView) subDecor.findViewById(R.id.title);
                }
                l4.c(subDecor);
                ContentFrameLayout contentView = (ContentFrameLayout) subDecor.findViewById(R.id.action_bar_activity_content);
                ViewGroup windowContentView = (ViewGroup) this.f1690g.findViewById(16908290);
                if (windowContentView != null) {
                    while (windowContentView.getChildCount() > 0) {
                        View child = windowContentView.getChildAt(0);
                        windowContentView.removeViewAt(0);
                        contentView.addView(child);
                    }
                    windowContentView.setId(-1);
                    contentView.setId(16908290);
                    if (windowContentView instanceof FrameLayout) {
                        ((FrameLayout) windowContentView).setForeground(null);
                    }
                }
                this.f1690g.setContentView(subDecor);
                contentView.setAttachListener(new t(this));
                return subDecor;
            }
            throw new IllegalArgumentException("AppCompat does not support the current theme features: { windowActionBar: " + this.B + ", windowActionBarOverlay: " + this.C + ", android:windowIsFloating: " + this.E + ", windowActionModeOverlay: " + this.D + ", windowNoTitle: " + this.F + " }");
        }
        a2.recycle();
        throw new IllegalStateException("You need to use a Theme.AppCompat theme (or descendant) with this activity.");
    }

    public void w0() {
    }

    public final void H() {
        ContentFrameLayout cfl = (ContentFrameLayout) this.f1706w.findViewById(16908290);
        View windowDecor = this.f1690g.getDecorView();
        cfl.a(windowDecor.getPaddingLeft(), windowDecor.getPaddingTop(), windowDecor.getPaddingRight(), windowDecor.getPaddingBottom());
        TypedArray a2 = this.f1689f.obtainStyledAttributes(a.f1176j);
        int[] iArr = a.f1167a;
        a2.getValue(124, cfl.getMinWidthMajor());
        a2.getValue(125, cfl.getMinWidthMinor());
        if (a2.hasValue(122)) {
            a2.getValue(122, cfl.getFixedWidthMajor());
        }
        if (a2.hasValue(123)) {
            a2.getValue(123, cfl.getFixedWidthMinor());
        }
        if (a2.hasValue(120)) {
            a2.getValue(120, cfl.getFixedHeightMajor());
        }
        if (a2.hasValue(121)) {
            a2.getValue(121, cfl.getFixedHeightMinor());
        }
        a2.recycle();
        cfl.requestLayout();
    }

    @Override // d.q
    public boolean z(int featureId) {
        int featureId2 = C0(featureId);
        if (this.F && featureId2 == 108) {
            return false;
        }
        if (this.B && featureId2 == 1) {
            this.B = false;
        }
        switch (featureId2) {
            case 1:
                G0();
                this.F = true;
                return true;
            case 2:
                G0();
                this.f1709z = true;
                return true;
            case 5:
                G0();
                this.A = true;
                return true;
            case 10:
                G0();
                this.D = true;
                return true;
            case 108:
                G0();
                this.B = true;
                return true;
            case 109:
                G0();
                this.C = true;
                return true;
            default:
                return this.f1690g.requestFeature(featureId2);
        }
    }

    @Override // d.q
    public final void E(CharSequence title) {
        this.f1695l = title;
        q1 q1Var = this.f1696m;
        if (q1Var != null) {
            q1Var.setWindowTitle(title);
        } else if (y0() != null) {
            y0().n(title);
        } else {
            TextView textView = this.f1707x;
            if (textView != null) {
                textView.setText(title);
            }
        }
    }

    public final CharSequence e0() {
        Object obj = this.f1688e;
        if (obj instanceof Activity) {
            return ((Activity) obj).getTitle();
        }
        return this.f1695l;
    }

    public void v0(int featureId) {
        if (featureId == 108) {
            c ab = m();
            if (ab != null) {
                ab.c(false);
            }
        } else if (featureId == 0) {
            l0 st = d0(featureId);
            if (st.f1674m) {
                O(st, false);
            }
        }
    }

    public void u0(int featureId) {
        c ab;
        if (featureId == 108 && (ab = m()) != null) {
            ab.c(true);
        }
    }

    @Override // h.o
    public boolean b(q menu, MenuItem item) {
        l0 panel;
        Window.Callback cb = f0();
        if (cb == null || this.N || (panel = Y(menu.D())) == null) {
            return false;
        }
        return cb.onMenuItemSelected(panel.f1662a, item);
    }

    @Override // h.o
    public void a(q menu) {
        B0(true);
    }

    public c E0(b callback) {
        p pVar;
        if (callback != null) {
            c cVar = this.f1699p;
            if (cVar != null) {
                cVar.c();
            }
            b wrappedCallback = new z(this, callback);
            c ab = m();
            if (ab != null) {
                c o2 = ab.o(wrappedCallback);
                this.f1699p = o2;
                if (!(o2 == null || (pVar = this.f1692i) == null)) {
                    pVar.e(o2);
                }
            }
            if (this.f1699p == null) {
                this.f1699p = F0(wrappedCallback);
            }
            return this.f1699p;
        }
        throw new IllegalArgumentException("ActionMode callback can not be null.");
    }

    @Override // d.q
    public void o() {
        c ab = m();
        if (ab != null) {
            ab.f();
        }
        k0(0);
    }

    public c F0(b callback) {
        p pVar;
        Context actionBarContext;
        V();
        c cVar = this.f1699p;
        if (cVar != null) {
            cVar.c();
        }
        if (!(callback instanceof z)) {
            callback = new z(this, callback);
        }
        c mode = null;
        p pVar2 = this.f1692i;
        if (pVar2 != null && !this.N) {
            try {
                mode = pVar2.c(callback);
            } catch (AbstractMethodError e2) {
            }
        }
        if (mode != null) {
            this.f1699p = mode;
        } else {
            boolean z2 = true;
            if (this.f1700q == null) {
                if (this.E) {
                    TypedValue outValue = new TypedValue();
                    Resources.Theme baseTheme = this.f1689f.getTheme();
                    baseTheme.resolveAttribute(R.attr.actionBarTheme, outValue, true);
                    if (outValue.resourceId != 0) {
                        Resources.Theme actionBarTheme = this.f1689f.getResources().newTheme();
                        actionBarTheme.setTo(baseTheme);
                        actionBarTheme.applyStyle(outValue.resourceId, true);
                        actionBarContext = new e(this.f1689f, 0);
                        actionBarContext.getTheme().setTo(actionBarTheme);
                    } else {
                        actionBarContext = this.f1689f;
                    }
                    this.f1700q = new ActionBarContextView(actionBarContext);
                    PopupWindow popupWindow = new PopupWindow(actionBarContext, (AttributeSet) null, (int) R.attr.actionModePopupWindowStyle);
                    this.f1701r = popupWindow;
                    i0.q.b(popupWindow, 2);
                    this.f1701r.setContentView(this.f1700q);
                    this.f1701r.setWidth(-1);
                    actionBarContext.getTheme().resolveAttribute(R.attr.actionBarSize, outValue, true);
                    int height = TypedValue.complexToDimensionPixelSize(outValue.data, actionBarContext.getResources().getDisplayMetrics());
                    this.f1700q.setContentHeight(height);
                    this.f1701r.setHeight(-2);
                    this.f1702s = new v(this);
                } else {
                    ViewStubCompat stub = (ViewStubCompat) this.f1706w.findViewById(R.id.action_mode_bar_stub);
                    if (stub != null) {
                        stub.setLayoutInflater(LayoutInflater.from(a0()));
                        this.f1700q = (ActionBarContextView) stub.a();
                    }
                }
            }
            if (this.f1700q != null) {
                V();
                this.f1700q.k();
                Context context = this.f1700q.getContext();
                ActionBarContextView actionBarContextView = this.f1700q;
                if (this.f1701r != null) {
                    z2 = false;
                }
                c mode2 = new f(context, actionBarContextView, callback, z2);
                if (callback.a(mode2, mode2.e())) {
                    mode2.k();
                    this.f1700q.h(mode2);
                    this.f1699p = mode2;
                    if (D0()) {
                        this.f1700q.setAlpha(0.0f);
                        h1 e3 = c1.e(this.f1700q);
                        e3.a(1.0f);
                        this.f1703t = e3;
                        e3.f(new w(this));
                    } else {
                        this.f1700q.setAlpha(1.0f);
                        this.f1700q.setVisibility(0);
                        this.f1700q.sendAccessibilityEvent(32);
                        if (this.f1700q.getParent() instanceof View) {
                            c1.i0((View) this.f1700q.getParent());
                        }
                    }
                    if (this.f1701r != null) {
                        this.f1690g.getDecorView().post(this.f1702s);
                    }
                } else {
                    this.f1699p = null;
                }
            }
        }
        c cVar2 = this.f1699p;
        if (!(cVar2 == null || (pVar = this.f1692i) == null)) {
            pVar.e(cVar2);
        }
        return this.f1699p;
    }

    public final boolean D0() {
        ViewGroup viewGroup;
        return this.f1705v && (viewGroup = this.f1706w) != null && c1.P(viewGroup);
    }

    public boolean m0() {
        return this.f1704u;
    }

    public void V() {
        h1 h1Var = this.f1703t;
        if (h1Var != null) {
            h1Var.b();
        }
    }

    public boolean o0() {
        c cVar = this.f1699p;
        if (cVar != null) {
            cVar.c();
            return true;
        }
        c ab = m();
        return ab != null && ab.b();
    }

    public boolean r0(int keyCode, KeyEvent ev) {
        c ab = m();
        if (ab != null && ab.i(keyCode, ev)) {
            return true;
        }
        l0 l0Var = this.I;
        if (l0Var != null) {
            boolean handled = z0(l0Var, ev.getKeyCode(), ev, 1);
            if (handled) {
                l0 l0Var2 = this.I;
                if (l0Var2 != null) {
                    l0Var2.f1673l = true;
                }
                return true;
            }
        }
        if (this.I == null) {
            l0 st = d0(0);
            A0(st, ev);
            boolean handled2 = z0(st, ev.getKeyCode(), ev, 1);
            st.f1672k = false;
            if (handled2) {
                return true;
            }
        }
        return false;
    }

    public boolean T(KeyEvent event) {
        View root;
        Object obj = this.f1688e;
        boolean isDown = true;
        if (((obj instanceof p) || (obj instanceof p0)) && (root = this.f1690g.getDecorView()) != null && f0.q.d(root, event)) {
            return true;
        }
        if (event.getKeyCode() == 82 && this.f1691h.a().dispatchKeyEvent(event)) {
            return true;
        }
        int keyCode = event.getKeyCode();
        int action = event.getAction();
        if (action != 0) {
            isDown = false;
        }
        return isDown ? p0(keyCode, event) : s0(keyCode, event);
    }

    public boolean s0(int keyCode, KeyEvent event) {
        switch (keyCode) {
            case 82:
                t0(0, event);
                return true;
            case 4:
                boolean wasLongPressBackDown = this.J;
                this.J = false;
                l0 st = d0(0);
                if (st.f1674m) {
                    if (!wasLongPressBackDown) {
                        O(st, true);
                    }
                    return true;
                } else if (o0()) {
                    return true;
                }
                break;
        }
        return false;
    }

    public boolean p0(int keyCode, KeyEvent event) {
        boolean z2 = true;
        switch (keyCode) {
            case 82:
                q0(0, event);
                return true;
            case 4:
                if ((event.getFlags() & 128) == 0) {
                    z2 = false;
                }
                this.J = z2;
                break;
        }
        return false;
    }

    public View R(View parent, String name, Context context, AttributeSet attrs) {
        if (this.f1687a0 == null) {
            TypedArray a2 = this.f1689f.obtainStyledAttributes(a.f1176j);
            int[] iArr = a.f1167a;
            String viewInflaterClassName = a2.getString(116);
            if (viewInflaterClassName == null) {
                this.f1687a0 = new r0();
            } else {
                try {
                    Class<?> viewInflaterClass = Class.forName(viewInflaterClassName);
                    this.f1687a0 = (r0) viewInflaterClass.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
                } catch (Throwable t2) {
                    Log.i("AppCompatDelegate", "Failed to instantiate custom view inflater " + viewInflaterClassName + ". Falling back to default.", t2);
                    this.f1687a0 = new r0();
                }
            }
        }
        r0 r0Var = this.f1687a0;
        j4.b();
        return r0Var.q(parent, name, context, attrs, false, false, true, false);
    }

    @Override // d.q
    public void n() {
        LayoutInflater layoutInflater = LayoutInflater.from(this.f1689f);
        if (layoutInflater.getFactory() == null) {
            r.a(layoutInflater, this);
        } else if (!(layoutInflater.getFactory2() instanceof n0)) {
            Log.i("AppCompatDelegate", "The Activity's LayoutInflater already has a Factory installed so we can not install AppCompat's");
        }
    }

    @Override // android.view.LayoutInflater.Factory2
    public final View onCreateView(View parent, String name, Context context, AttributeSet attrs) {
        return R(parent, name, context, attrs);
    }

    @Override // android.view.LayoutInflater.Factory
    public View onCreateView(String name, Context context, AttributeSet attrs) {
        return onCreateView(null, name, context, attrs);
    }

    public final o H0() {
        for (Context context = this.f1689f; context != null; context = ((ContextWrapper) context).getBaseContext()) {
            if (context instanceof o) {
                return (o) context;
            }
            if (!(context instanceof ContextWrapper)) {
                return null;
            }
        }
        return null;
    }

    public final void x0(l0 st, KeyEvent event) {
        ViewGroup.LayoutParams lp;
        if (!st.f1674m && !this.N) {
            if (st.f1662a == 0) {
                Configuration config = this.f1689f.getResources().getConfiguration();
                boolean isXLarge = (config.screenLayout & 15) == 4;
                if (isXLarge) {
                    return;
                }
            }
            Window.Callback cb = f0();
            if (cb == null || cb.onMenuOpened(st.f1662a, st.f1669h)) {
                WindowManager wm = (WindowManager) this.f1689f.getSystemService("window");
                if (wm != null && A0(st, event)) {
                    int width = -2;
                    ViewGroup viewGroup = st.f1666e;
                    if (viewGroup == null || st.f1676o) {
                        if (viewGroup == null) {
                            i0(st);
                            if (st.f1666e == null) {
                                return;
                            }
                        } else if (st.f1676o && viewGroup.getChildCount() > 0) {
                            st.f1666e.removeAllViews();
                        }
                        if (!h0(st) || !st.b()) {
                            st.f1676o = true;
                            return;
                        }
                        ViewGroup.LayoutParams lp2 = st.f1667f.getLayoutParams();
                        if (lp2 == null) {
                            lp2 = new ViewGroup.LayoutParams(-2, -2);
                        }
                        int backgroundResId = st.f1663b;
                        st.f1666e.setBackgroundResource(backgroundResId);
                        ViewParent shownPanelParent = st.f1667f.getParent();
                        if (shownPanelParent instanceof ViewGroup) {
                            ((ViewGroup) shownPanelParent).removeView(st.f1667f);
                        }
                        st.f1666e.addView(st.f1667f, lp2);
                        if (!st.f1667f.hasFocus()) {
                            st.f1667f.requestFocus();
                        }
                    } else {
                        View view = st.f1668g;
                        if (!(view == null || (lp = view.getLayoutParams()) == null || lp.width != -1)) {
                            width = -1;
                        }
                    }
                    st.f1673l = false;
                    Objects.requireNonNull(st);
                    Objects.requireNonNull(st);
                    WindowManager.LayoutParams lp3 = new WindowManager.LayoutParams(width, -2, 0, 0, 1002, 8519680, -3);
                    lp3.gravity = st.f1664c;
                    lp3.windowAnimations = st.f1665d;
                    wm.addView(st.f1666e, lp3);
                    st.f1674m = true;
                    return;
                }
                return;
            }
            O(st, true);
        }
    }

    public final boolean i0(l0 st) {
        st.d(a0());
        st.f1666e = new k0(this, st.f1671j);
        st.f1664c = 81;
        return true;
    }

    public final void B0(boolean toggleMenuMode) {
        q1 q1Var = this.f1696m;
        if (q1Var == null || !((ActionBarOverlayLayout) q1Var).i() || (ViewConfiguration.get(this.f1689f).hasPermanentMenuKey() && !((ActionBarOverlayLayout) this.f1696m).s())) {
            l0 st = d0(0);
            st.f1676o = true;
            O(st, false);
            x0(st, null);
            return;
        }
        Window.Callback cb = f0();
        if (((ActionBarOverlayLayout) this.f1696m).t() && toggleMenuMode) {
            ((ActionBarOverlayLayout) this.f1696m).o();
            if (!this.N) {
                cb.onPanelClosed(108, d0(0).f1669h);
            }
        } else if (cb != null && !this.N) {
            if (this.U && (1 & this.V) != 0) {
                this.f1690g.getDecorView().removeCallbacks(this.W);
                this.W.run();
            }
            l0 st2 = d0(0);
            q qVar = st2.f1669h;
            if (qVar != null && !st2.f1677p && cb.onPreparePanel(0, st2.f1668g, qVar)) {
                cb.onMenuOpened(108, st2.f1669h);
                ((ActionBarOverlayLayout) this.f1696m).B();
            }
        }
    }

    public final boolean j0(l0 st) {
        Context context = this.f1689f;
        int i2 = st.f1662a;
        if ((i2 == 0 || i2 == 108) && this.f1696m != null) {
            TypedValue outValue = new TypedValue();
            Resources.Theme baseTheme = context.getTheme();
            baseTheme.resolveAttribute(R.attr.actionBarTheme, outValue, true);
            Resources.Theme widgetTheme = null;
            if (outValue.resourceId != 0) {
                widgetTheme = context.getResources().newTheme();
                widgetTheme.setTo(baseTheme);
                widgetTheme.applyStyle(outValue.resourceId, true);
                widgetTheme.resolveAttribute(R.attr.actionBarWidgetTheme, outValue, true);
            } else {
                baseTheme.resolveAttribute(R.attr.actionBarWidgetTheme, outValue, true);
            }
            if (outValue.resourceId != 0) {
                if (widgetTheme == null) {
                    widgetTheme = context.getResources().newTheme();
                    widgetTheme.setTo(baseTheme);
                }
                widgetTheme.applyStyle(outValue.resourceId, true);
            }
            if (widgetTheme != null) {
                context = new e(context, 0);
                context.getTheme().setTo(widgetTheme);
            }
        }
        q menu = new q(context);
        menu.R(this);
        st.c(menu);
        return true;
    }

    public final boolean h0(l0 st) {
        View view = st.f1668g;
        if (view != null) {
            st.f1667f = view;
            return true;
        } else if (st.f1669h == null) {
            return false;
        } else {
            if (this.f1698o == null) {
                this.f1698o = new m0(this);
            }
            g0 menuView = st.a(this.f1698o);
            View view2 = (View) menuView;
            st.f1667f = view2;
            return view2 != null;
        }
    }

    public final boolean A0(l0 st, KeyEvent event) {
        q1 q1Var;
        q1 q1Var2;
        q1 q1Var3;
        if (this.N) {
            return false;
        }
        if (st.f1672k) {
            return true;
        }
        l0 l0Var = this.I;
        if (!(l0Var == null || l0Var == st)) {
            O(l0Var, false);
        }
        Window.Callback cb = f0();
        if (cb != null) {
            st.f1668g = cb.onCreatePanelView(st.f1662a);
        }
        int i2 = st.f1662a;
        boolean isActionBarMenu = i2 == 0 || i2 == 108;
        if (isActionBarMenu && (q1Var3 = this.f1696m) != null) {
            ((ActionBarOverlayLayout) q1Var3).z();
        }
        if (st.f1668g == null) {
            if (isActionBarMenu) {
                y0();
            }
            q qVar = st.f1669h;
            if (qVar == null || st.f1677p) {
                if (qVar == null) {
                    j0(st);
                    if (st.f1669h == null) {
                        return false;
                    }
                }
                if (isActionBarMenu && this.f1696m != null) {
                    if (this.f1697n == null) {
                        this.f1697n = new x(this);
                    }
                    ((ActionBarOverlayLayout) this.f1696m).y(st.f1669h, this.f1697n);
                }
                st.f1669h.d0();
                if (!cb.onCreatePanelMenu(st.f1662a, st.f1669h)) {
                    st.c(null);
                    if (isActionBarMenu && (q1Var2 = this.f1696m) != null) {
                        ((ActionBarOverlayLayout) q1Var2).y(null, this.f1697n);
                    }
                    return false;
                }
                st.f1677p = false;
            }
            st.f1669h.d0();
            Bundle bundle = st.f1678q;
            if (bundle != null) {
                st.f1669h.P(bundle);
                st.f1678q = null;
            }
            if (!cb.onPreparePanel(0, st.f1668g, st.f1669h)) {
                if (isActionBarMenu && (q1Var = this.f1696m) != null) {
                    ((ActionBarOverlayLayout) q1Var).y(null, this.f1697n);
                }
                st.f1669h.c0();
                return false;
            }
            KeyCharacterMap kmap = KeyCharacterMap.load(event != null ? event.getDeviceId() : -1);
            boolean z2 = kmap.getKeyboardType() != 1;
            st.f1675n = z2;
            st.f1669h.setQwertyMode(z2);
            st.f1669h.c0();
        }
        st.f1672k = true;
        st.f1673l = false;
        this.I = st;
        return true;
    }

    public void L(q menu) {
        if (!this.G) {
            this.G = true;
            ((ActionBarOverlayLayout) this.f1696m).j();
            Window.Callback cb = f0();
            if (cb != null && !this.N) {
                cb.onPanelClosed(108, menu);
            }
            this.G = false;
        }
    }

    public void N(int featureId) {
        O(d0(featureId), true);
    }

    public void O(l0 st, boolean doCallback) {
        ViewGroup viewGroup;
        q1 q1Var;
        if (!doCallback || st.f1662a != 0 || (q1Var = this.f1696m) == null || !((ActionBarOverlayLayout) q1Var).t()) {
            WindowManager wm = (WindowManager) this.f1689f.getSystemService("window");
            if (!(wm == null || !st.f1674m || (viewGroup = st.f1666e) == null)) {
                wm.removeView(viewGroup);
                if (doCallback) {
                    K(st.f1662a, st, null);
                }
            }
            st.f1672k = false;
            st.f1673l = false;
            st.f1674m = false;
            st.f1667f = null;
            st.f1676o = true;
            if (this.I == st) {
                this.I = null;
                return;
            }
            return;
        }
        L(st.f1669h);
    }

    public final boolean q0(int featureId, KeyEvent event) {
        if (event.getRepeatCount() != 0) {
            return false;
        }
        l0 st = d0(featureId);
        if (!st.f1674m) {
            return A0(st, event);
        }
        return false;
    }

    public final boolean t0(int featureId, KeyEvent event) {
        q1 q1Var;
        if (this.f1699p != null) {
            return false;
        }
        boolean handled = false;
        l0 st = d0(featureId);
        if (featureId != 0 || (q1Var = this.f1696m) == null || !((ActionBarOverlayLayout) q1Var).i() || ViewConfiguration.get(this.f1689f).hasPermanentMenuKey()) {
            if (st.f1674m || st.f1673l) {
                handled = st.f1674m;
                O(st, true);
            } else if (st.f1672k) {
                boolean show = true;
                if (st.f1677p) {
                    st.f1672k = false;
                    show = A0(st, event);
                }
                if (show) {
                    x0(st, event);
                    handled = true;
                }
            }
        } else if (((ActionBarOverlayLayout) this.f1696m).t()) {
            handled = ((ActionBarOverlayLayout) this.f1696m).o();
        } else if (!this.N && A0(st, event)) {
            handled = ((ActionBarOverlayLayout) this.f1696m).B();
        }
        if (handled) {
            AudioManager audioManager = (AudioManager) this.f1689f.getApplicationContext().getSystemService("audio");
            if (audioManager != null) {
                audioManager.playSoundEffect(0);
            } else {
                Log.w("AppCompatDelegate", "Couldn't get audio manager");
            }
        }
        return handled;
    }

    public void K(int featureId, l0 panel, Menu menu) {
        if (menu == null) {
            if (panel == null && featureId >= 0) {
                l0[] l0VarArr = this.H;
                if (featureId < l0VarArr.length) {
                    panel = l0VarArr[featureId];
                }
            }
            if (panel != null) {
                menu = panel.f1669h;
            }
        }
        if ((panel == null || panel.f1674m) && !this.N) {
            this.f1691h.a().onPanelClosed(featureId, menu);
        }
    }

    public l0 Y(Menu menu) {
        l0[] panels = this.H;
        int N = panels != null ? panels.length : 0;
        for (int i2 = 0; i2 < N; i2++) {
            l0 panel = panels[i2];
            if (panel != null && panel.f1669h == menu) {
                return panel;
            }
        }
        return null;
    }

    public l0 d0(int featureId) {
        l0[] l0VarArr = this.H;
        l0[] ar = l0VarArr;
        if (l0VarArr == null || ar.length <= featureId) {
            l0[] nar = new l0[featureId + 1];
            if (ar != null) {
                System.arraycopy(ar, 0, nar, 0, ar.length);
            }
            ar = nar;
            this.H = nar;
        }
        l0 st = ar[featureId];
        if (st != null) {
            return st;
        }
        l0 st2 = new l0(featureId);
        ar[featureId] = st2;
        return st2;
    }

    public final boolean z0(l0 st, int keyCode, KeyEvent event, int flags) {
        q qVar;
        if (event.isSystem()) {
            return false;
        }
        boolean handled = false;
        if ((st.f1672k || A0(st, event)) && (qVar = st.f1669h) != null) {
            handled = qVar.performShortcut(keyCode, event, flags);
        }
        if (handled && (flags & 1) == 0 && this.f1696m == null) {
            O(st, true);
        }
        return handled;
    }

    public final void k0(int featureId) {
        this.V |= 1 << featureId;
        if (!this.U) {
            c1.d0(this.f1690g.getDecorView(), this.W);
            this.U = true;
        }
    }

    public void U(int featureId) {
        l0 st = d0(featureId);
        if (st.f1669h != null) {
            Bundle savedActionViewStates = new Bundle();
            st.f1669h.Q(savedActionViewStates);
            if (savedActionViewStates.size() > 0) {
                st.f1678q = savedActionViewStates;
            }
            st.f1669h.d0();
            st.f1669h.clear();
        }
        st.f1677p = true;
        st.f1676o = true;
        if ((featureId == 108 || featureId == 0) && this.f1696m != null) {
            l0 st2 = d0(0);
            st2.f1672k = false;
            A0(st2, null);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:72:0x012f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int K0(f0.x1 r18, android.graphics.Rect r19) {
        /*
            Method dump skipped, instructions count: 313
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: d.n0.K0(f0.x1, android.graphics.Rect):int");
    }

    public final void L0(View v2) {
        int i2;
        boolean lightStatusBar = (c1.J(v2) & 8192) != 0;
        if (lightStatusBar) {
            i2 = d.a(this.f1689f, R.color.abc_decor_view_status_guard_light);
        } else {
            i2 = d.a(this.f1689f, R.color.abc_decor_view_status_guard);
        }
        v2.setBackgroundColor(i2);
    }

    public final void G0() {
        if (this.f1705v) {
            throw new AndroidRuntimeException("Window feature must be requested before adding content");
        }
    }

    public final int C0(int featureId) {
        if (featureId == 8) {
            Log.i("AppCompatDelegate", "You should now use the AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR id when requesting this feature.");
            return 108;
        } else if (featureId != 9) {
            return featureId;
        } else {
            Log.i("AppCompatDelegate", "You should now use the AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR_OVERLAY id when requesting this feature.");
            return 109;
        }
    }

    public void S() {
        q1 q1Var = this.f1696m;
        if (q1Var != null) {
            ((ActionBarOverlayLayout) q1Var).j();
        }
        if (this.f1701r != null) {
            this.f1690g.getDecorView().removeCallbacks(this.f1702s);
            if (this.f1701r.isShowing()) {
                try {
                    this.f1701r.dismiss();
                } catch (IllegalArgumentException e2) {
                }
            }
            this.f1701r = null;
        }
        V();
        l0 st = d0(0);
        q qVar = st.f1669h;
        if (qVar != null) {
            qVar.close();
        }
    }

    public boolean F() {
        return G(true);
    }

    public final boolean G(boolean allowRecreation) {
        if (this.N) {
            return false;
        }
        int nightMode = J();
        int modeToApply = n0(this.f1689f, nightMode);
        boolean applied = I0(modeToApply, allowRecreation);
        if (nightMode == 0) {
            c0(this.f1689f).e();
        } else {
            h0 h0Var = this.S;
            if (h0Var != null) {
                h0Var.a();
            }
        }
        if (nightMode == 3) {
            b0(this.f1689f).e();
        } else {
            h0 h0Var2 = this.T;
            if (h0Var2 != null) {
                h0Var2.a();
            }
        }
        return applied;
    }

    @Override // d.q
    public int k() {
        return this.O;
    }

    public int n0(Context context, int mode) {
        switch (mode) {
            case -100:
                return -1;
            case -1:
            case 1:
            case 2:
                return mode;
            case 0:
                UiModeManager uiModeManager = (UiModeManager) context.getApplicationContext().getSystemService("uimode");
                if (uiModeManager.getNightMode() == 0) {
                    return -1;
                }
                return c0(context).c();
            case 3:
                return b0(context).c();
            default:
                throw new IllegalStateException("Unknown value set for night mode. Please use one of the MODE_NIGHT values from AppCompatDelegate.");
        }
    }

    public final int J() {
        int i2 = this.O;
        if (i2 != -100) {
            return i2;
        }
        q.j();
        return -100;
    }

    public final Configuration P(Context context, int mode, Configuration configOverlay) {
        int newNightMode;
        switch (mode) {
            case 1:
                newNightMode = 16;
                break;
            case 2:
                newNightMode = 32;
                break;
            default:
                Configuration appConfig = context.getApplicationContext().getResources().getConfiguration();
                newNightMode = appConfig.uiMode & 48;
                break;
        }
        Configuration overrideConf = new Configuration();
        overrideConf.fontScale = 0.0f;
        if (configOverlay != null) {
            overrideConf.setTo(configOverlay);
        }
        overrideConf.uiMode = (overrideConf.uiMode & (-49)) | newNightMode;
        return overrideConf;
    }

    public final boolean I0(int mode, boolean allowRecreation) {
        boolean handled = false;
        Configuration overrideConfig = P(this.f1689f, mode, null);
        boolean activityHandlingUiMode = l0();
        int currentNightMode = this.f1689f.getResources().getConfiguration().uiMode & 48;
        int newNightMode = overrideConfig.uiMode & 48;
        if (currentNightMode != newNightMode && allowRecreation && !activityHandlingUiMode && this.K && (f1685e0 || this.L)) {
            Object obj = this.f1688e;
            if ((obj instanceof Activity) && !((Activity) obj).isChild()) {
                u.a.e((Activity) this.f1688e);
                handled = true;
            }
        }
        if (!handled && currentNightMode != newNightMode) {
            J0(newNightMode, activityHandlingUiMode, null);
            handled = true;
        }
        if (handled) {
            Object obj2 = this.f1688e;
            if (obj2 instanceof o) {
                ((o) obj2).C();
            }
        }
        return handled;
    }

    public final void J0(int uiModeNightModeValue, boolean callOnConfigChange, Configuration configOverlay) {
        Resources res = this.f1689f.getResources();
        Configuration conf = new Configuration(res.getConfiguration());
        if (configOverlay != null) {
            conf.updateFrom(configOverlay);
        }
        conf.uiMode = (res.getConfiguration().uiMode & (-49)) | uiModeNightModeValue;
        res.updateConfiguration(conf, null);
        if (Build.VERSION.SDK_INT < 26) {
            s0.a(res);
        }
        int i2 = this.P;
        if (i2 != 0) {
            this.f1689f.setTheme(i2);
            this.f1689f.getTheme().applyStyle(this.P, true);
        }
        if (callOnConfigChange) {
            Object obj = this.f1688e;
            if (obj instanceof Activity) {
                Activity activity = (Activity) obj;
                if (activity instanceof m) {
                    androidx.lifecycle.j lifecycle = ((m) activity).g();
                    if (lifecycle.b().a(i.STARTED)) {
                        activity.onConfigurationChanged(conf);
                    }
                } else if (this.M) {
                    activity.onConfigurationChanged(conf);
                }
            }
        }
    }

    public final h0 c0(Context context) {
        if (this.S == null) {
            this.S = new i0(this, v0.a(context));
        }
        return this.S;
    }

    public final h0 b0(Context context) {
        if (this.T == null) {
            this.T = new f0(this, context);
        }
        return this.T;
    }

    public final boolean l0() {
        int flags;
        if (!this.R && (this.f1688e instanceof Activity)) {
            PackageManager pm = this.f1689f.getPackageManager();
            if (pm == null) {
                return false;
            }
            try {
                if (Build.VERSION.SDK_INT >= 29) {
                    flags = 269221888;
                } else {
                    flags = 786432;
                }
                ActivityInfo info = pm.getActivityInfo(new ComponentName(this.f1689f, this.f1688e.getClass()), flags);
                this.Q = (info == null || (info.configChanges & 512) == 0) ? false : true;
            } catch (PackageManager.NameNotFoundException e2) {
                Log.d("AppCompatDelegate", "Exception while getting ActivityInfo", e2);
                this.Q = false;
            }
        }
        this.R = true;
        return this.Q;
    }

    public static Configuration Z(Configuration base, Configuration change) {
        Configuration delta = new Configuration();
        delta.fontScale = 0.0f;
        if (change == null || base.diff(change) == 0) {
            return delta;
        }
        float f2 = base.fontScale;
        float f3 = change.fontScale;
        if (f2 != f3) {
            delta.fontScale = f3;
        }
        int i2 = base.mcc;
        int i3 = change.mcc;
        if (i2 != i3) {
            delta.mcc = i3;
        }
        int i4 = base.mnc;
        int i5 = change.mnc;
        if (i4 != i5) {
            delta.mnc = i5;
        }
        int i6 = Build.VERSION.SDK_INT;
        c0.a(base, change, delta);
        int i7 = base.touchscreen;
        int i8 = change.touchscreen;
        if (i7 != i8) {
            delta.touchscreen = i8;
        }
        int i9 = base.keyboard;
        int i10 = change.keyboard;
        if (i9 != i10) {
            delta.keyboard = i10;
        }
        int i11 = base.keyboardHidden;
        int i12 = change.keyboardHidden;
        if (i11 != i12) {
            delta.keyboardHidden = i12;
        }
        int i13 = base.navigation;
        int i14 = change.navigation;
        if (i13 != i14) {
            delta.navigation = i14;
        }
        int i15 = base.navigationHidden;
        int i16 = change.navigationHidden;
        if (i15 != i16) {
            delta.navigationHidden = i16;
        }
        int i17 = base.orientation;
        int i18 = change.orientation;
        if (i17 != i18) {
            delta.orientation = i18;
        }
        int i19 = base.screenLayout & 15;
        int i20 = change.screenLayout;
        if (i19 != (i20 & 15)) {
            delta.screenLayout |= i20 & 15;
        }
        int i21 = base.screenLayout & 192;
        int i22 = change.screenLayout;
        if (i21 != (i22 & 192)) {
            delta.screenLayout |= i22 & 192;
        }
        int i23 = base.screenLayout & 48;
        int i24 = change.screenLayout;
        if (i23 != (i24 & 48)) {
            delta.screenLayout |= i24 & 48;
        }
        int i25 = base.screenLayout & 768;
        int i26 = change.screenLayout;
        if (i25 != (i26 & 768)) {
            delta.screenLayout |= i26 & 768;
        }
        if (i6 >= 26) {
            d0.a(base, change, delta);
        }
        int i27 = base.uiMode & 15;
        int i28 = change.uiMode;
        if (i27 != (i28 & 15)) {
            delta.uiMode |= i28 & 15;
        }
        int i29 = base.uiMode & 48;
        int i30 = change.uiMode;
        if (i29 != (i30 & 48)) {
            delta.uiMode |= i30 & 48;
        }
        int i31 = base.screenWidthDp;
        int i32 = change.screenWidthDp;
        if (i31 != i32) {
            delta.screenWidthDp = i32;
        }
        int i33 = base.screenHeightDp;
        int i34 = change.screenHeightDp;
        if (i33 != i34) {
            delta.screenHeightDp = i34;
        }
        int i35 = base.smallestScreenWidthDp;
        int i36 = change.smallestScreenWidthDp;
        if (i35 != i36) {
            delta.smallestScreenWidthDp = i36;
        }
        a0.b(base, change, delta);
        return delta;
    }
}
