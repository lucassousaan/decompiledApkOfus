package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import c.a;
import com.example.helloworld.R;
import f0.c1;
import f0.o;
import f0.s;
import g.k;
import h.q;
import h.t;
import java.util.ArrayList;
import java.util.List;

/* JADX WARN: Classes with same name are omitted:
  
 */
/* loaded from: classes.dex */
public class Toolbar extends ViewGroup {
    public ColorStateList A;
    public ColorStateList B;
    public boolean C;
    public boolean D;
    public final ArrayList E;
    public final ArrayList F;
    public final int[] G;
    public y3 H;
    public final v I;
    public d4 J;
    public q K;
    public w3 L;
    public boolean M;
    public final Runnable N;

    /* renamed from: b  reason: collision with root package name */
    public ActionMenuView f197b;

    /* renamed from: c  reason: collision with root package name */
    public TextView f198c;

    /* renamed from: d  reason: collision with root package name */
    public TextView f199d;

    /* renamed from: e  reason: collision with root package name */
    public ImageButton f200e;

    /* renamed from: f  reason: collision with root package name */
    public ImageView f201f;

    /* renamed from: g  reason: collision with root package name */
    public Drawable f202g;

    /* renamed from: h  reason: collision with root package name */
    public CharSequence f203h;

    /* renamed from: i  reason: collision with root package name */
    public ImageButton f204i;

    /* renamed from: j  reason: collision with root package name */
    public View f205j;

    /* renamed from: k  reason: collision with root package name */
    public Context f206k;

    /* renamed from: l  reason: collision with root package name */
    public int f207l;

    /* renamed from: m  reason: collision with root package name */
    public int f208m;

    /* renamed from: n  reason: collision with root package name */
    public int f209n;

    /* renamed from: o  reason: collision with root package name */
    public int f210o;

    /* renamed from: p  reason: collision with root package name */
    public int f211p;

    /* renamed from: q  reason: collision with root package name */
    public int f212q;

    /* renamed from: r  reason: collision with root package name */
    public int f213r;

    /* renamed from: s  reason: collision with root package name */
    public int f214s;

    /* renamed from: t  reason: collision with root package name */
    public int f215t;

    /* renamed from: u  reason: collision with root package name */
    public s2 f216u;

    /* renamed from: v  reason: collision with root package name */
    public int f217v;

    /* renamed from: w  reason: collision with root package name */
    public int f218w;

    /* renamed from: x  reason: collision with root package name */
    public int f219x;

    /* renamed from: y  reason: collision with root package name */
    public CharSequence f220y;

    /* renamed from: z  reason: collision with root package name */
    public CharSequence f221z;

    public Toolbar(Context context, AttributeSet attrs) {
        this(context, attrs, R.attr.toolbarStyle);
    }

    public Toolbar(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        this.f219x = 8388627;
        this.E = new ArrayList();
        this.F = new ArrayList();
        this.G = new int[2];
        this.I = new t3(this);
        this.N = new u3(this);
        Context context2 = getContext();
        int[] iArr = a.f1189w;
        s3 a2 = s3.v(context2, attrs, iArr, defStyleAttr, 0);
        c1.j0(this, context, iArr, attrs, a2.r(), defStyleAttr, 0);
        int[] iArr2 = a.f1167a;
        this.f208m = a2.n(28, 0);
        this.f209n = a2.n(19, 0);
        this.f219x = a2.l(0, this.f219x);
        this.f210o = a2.l(2, 48);
        int titleMargin = a2.e(22, 0);
        titleMargin = a2.s(27) ? a2.e(27, titleMargin) : titleMargin;
        this.f215t = titleMargin;
        this.f214s = titleMargin;
        this.f213r = titleMargin;
        this.f212q = titleMargin;
        int marginStart = a2.e(25, -1);
        if (marginStart >= 0) {
            this.f212q = marginStart;
        }
        int marginEnd = a2.e(24, -1);
        if (marginEnd >= 0) {
            this.f213r = marginEnd;
        }
        int marginTop = a2.e(26, -1);
        if (marginTop >= 0) {
            this.f214s = marginTop;
        }
        int marginBottom = a2.e(23, -1);
        if (marginBottom >= 0) {
            this.f215t = marginBottom;
        }
        this.f211p = a2.f(13, -1);
        int contentInsetStart = a2.e(9, Integer.MIN_VALUE);
        int contentInsetEnd = a2.e(5, Integer.MIN_VALUE);
        int contentInsetLeft = a2.f(7, 0);
        int contentInsetRight = a2.f(8, 0);
        h();
        this.f216u.e(contentInsetLeft, contentInsetRight);
        if (!(contentInsetStart == Integer.MIN_VALUE && contentInsetEnd == Integer.MIN_VALUE)) {
            this.f216u.g(contentInsetStart, contentInsetEnd);
        }
        this.f217v = a2.e(10, Integer.MIN_VALUE);
        this.f218w = a2.e(6, Integer.MIN_VALUE);
        this.f202g = a2.g(4);
        this.f203h = a2.p(3);
        CharSequence title = a2.p(21);
        if (!TextUtils.isEmpty(title)) {
            setTitle(title);
        }
        CharSequence subtitle = a2.p(18);
        if (!TextUtils.isEmpty(subtitle)) {
            setSubtitle(subtitle);
        }
        this.f206k = getContext();
        setPopupTheme(a2.n(17, 0));
        Drawable navIcon = a2.g(16);
        if (navIcon != null) {
            setNavigationIcon(navIcon);
        }
        CharSequence navDesc = a2.p(15);
        if (!TextUtils.isEmpty(navDesc)) {
            setNavigationContentDescription(navDesc);
        }
        Drawable logo = a2.g(11);
        if (logo != null) {
            setLogo(logo);
        }
        CharSequence logoDesc = a2.p(12);
        if (!TextUtils.isEmpty(logoDesc)) {
            setLogoDescription(logoDesc);
        }
        if (a2.s(29)) {
            setTitleTextColor(a2.c(29));
        }
        if (a2.s(20)) {
            setSubtitleTextColor(a2.c(20));
        }
        if (a2.s(14)) {
            x(a2.n(14, 0));
        }
        a2.w();
    }

    public void setPopupTheme(int resId) {
        if (this.f207l != resId) {
            this.f207l = resId;
            if (resId == 0) {
                this.f206k = getContext();
            } else {
                this.f206k = new ContextThemeWrapper(getContext(), resId);
            }
        }
    }

    public int getPopupTheme() {
        return this.f207l;
    }

    public int getTitleMarginStart() {
        return this.f212q;
    }

    public void setTitleMarginStart(int margin) {
        this.f212q = margin;
        requestLayout();
    }

    public int getTitleMarginTop() {
        return this.f214s;
    }

    public void setTitleMarginTop(int margin) {
        this.f214s = margin;
        requestLayout();
    }

    public int getTitleMarginEnd() {
        return this.f213r;
    }

    public void setTitleMarginEnd(int margin) {
        this.f213r = margin;
        requestLayout();
    }

    public int getTitleMarginBottom() {
        return this.f215t;
    }

    public void setTitleMarginBottom(int margin) {
        this.f215t = margin;
        requestLayout();
    }

    @Override // android.view.View
    public void onRtlPropertiesChanged(int layoutDirection) {
        super.onRtlPropertiesChanged(layoutDirection);
        h();
        s2 s2Var = this.f216u;
        boolean z2 = true;
        if (layoutDirection != 1) {
            z2 = false;
        }
        s2Var.f(z2);
    }

    public void setLogo(int resId) {
        setLogo(e.a.b(getContext(), resId));
    }

    public boolean d() {
        ActionMenuView actionMenuView;
        return getVisibility() == 0 && (actionMenuView = this.f197b) != null && actionMenuView.K();
    }

    public boolean A() {
        ActionMenuView actionMenuView = this.f197b;
        return actionMenuView != null && actionMenuView.J();
    }

    public boolean z() {
        ActionMenuView actionMenuView = this.f197b;
        return actionMenuView != null && actionMenuView.I();
    }

    public boolean N() {
        ActionMenuView actionMenuView = this.f197b;
        return actionMenuView != null && actionMenuView.P();
    }

    public boolean w() {
        ActionMenuView actionMenuView = this.f197b;
        return actionMenuView != null && actionMenuView.H();
    }

    public void I(q menu, q outerPresenter) {
        if (menu != null || this.f197b != null) {
            k();
            q oldMenu = this.f197b.N();
            if (oldMenu != menu) {
                if (oldMenu != null) {
                    oldMenu.O(this.K);
                    oldMenu.O(this.L);
                }
                if (this.L == null) {
                    this.L = new w3(this);
                }
                outerPresenter.G(true);
                if (menu != null) {
                    menu.c(outerPresenter, this.f206k);
                    menu.c(this.L, this.f206k);
                } else {
                    outerPresenter.f(this.f206k, null);
                    this.L.f(this.f206k, null);
                    outerPresenter.k(true);
                    this.L.k(true);
                }
                this.f197b.setPopupTheme(this.f207l);
                this.f197b.setPresenter(outerPresenter);
                this.K = outerPresenter;
            }
        }
    }

    public void f() {
        ActionMenuView actionMenuView = this.f197b;
        if (actionMenuView != null) {
            actionMenuView.B();
        }
    }

    public void setLogo(Drawable drawable) {
        if (drawable != null) {
            i();
            if (!y(this.f201f)) {
                c(this.f201f, true);
            }
        } else {
            ImageView imageView = this.f201f;
            if (imageView != null && y(imageView)) {
                removeView(this.f201f);
                this.F.remove(this.f201f);
            }
        }
        ImageView imageView2 = this.f201f;
        if (imageView2 != null) {
            imageView2.setImageDrawable(drawable);
        }
    }

    public Drawable getLogo() {
        ImageView imageView = this.f201f;
        if (imageView != null) {
            return imageView.getDrawable();
        }
        return null;
    }

    public void setLogoDescription(int resId) {
        setLogoDescription(getContext().getText(resId));
    }

    public void setLogoDescription(CharSequence description) {
        if (!TextUtils.isEmpty(description)) {
            i();
        }
        ImageView imageView = this.f201f;
        if (imageView != null) {
            imageView.setContentDescription(description);
        }
    }

    public CharSequence getLogoDescription() {
        ImageView imageView = this.f201f;
        if (imageView != null) {
            return imageView.getContentDescription();
        }
        return null;
    }

    public final void i() {
        if (this.f201f == null) {
            this.f201f = new i0(getContext());
        }
    }

    public boolean v() {
        w3 w3Var = this.L;
        return (w3Var == null || w3Var.f574c == null) ? false : true;
    }

    public void e() {
        w3 w3Var = this.L;
        t item = w3Var == null ? null : w3Var.f574c;
        if (item != null) {
            item.collapseActionView();
        }
    }

    public CharSequence getTitle() {
        return this.f220y;
    }

    public void setTitle(int resId) {
        setTitle(getContext().getText(resId));
    }

    public void setTitle(CharSequence title) {
        if (!TextUtils.isEmpty(title)) {
            if (this.f198c == null) {
                Context context = getContext();
                j1 j1Var = new j1(context);
                this.f198c = j1Var;
                j1Var.setSingleLine();
                this.f198c.setEllipsize(TextUtils.TruncateAt.END);
                int i2 = this.f208m;
                if (i2 != 0) {
                    this.f198c.setTextAppearance(context, i2);
                }
                ColorStateList colorStateList = this.A;
                if (colorStateList != null) {
                    this.f198c.setTextColor(colorStateList);
                }
            }
            if (!y(this.f198c)) {
                c(this.f198c, true);
            }
        } else {
            TextView textView = this.f198c;
            if (textView != null && y(textView)) {
                removeView(this.f198c);
                this.F.remove(this.f198c);
            }
        }
        TextView textView2 = this.f198c;
        if (textView2 != null) {
            textView2.setText(title);
        }
        this.f220y = title;
    }

    public CharSequence getSubtitle() {
        return this.f221z;
    }

    public void setSubtitle(int resId) {
        setSubtitle(getContext().getText(resId));
    }

    public void setSubtitle(CharSequence subtitle) {
        if (!TextUtils.isEmpty(subtitle)) {
            if (this.f199d == null) {
                Context context = getContext();
                j1 j1Var = new j1(context);
                this.f199d = j1Var;
                j1Var.setSingleLine();
                this.f199d.setEllipsize(TextUtils.TruncateAt.END);
                int i2 = this.f209n;
                if (i2 != 0) {
                    this.f199d.setTextAppearance(context, i2);
                }
                ColorStateList colorStateList = this.B;
                if (colorStateList != null) {
                    this.f199d.setTextColor(colorStateList);
                }
            }
            if (!y(this.f199d)) {
                c(this.f199d, true);
            }
        } else {
            TextView textView = this.f199d;
            if (textView != null && y(textView)) {
                removeView(this.f199d);
                this.F.remove(this.f199d);
            }
        }
        TextView textView2 = this.f199d;
        if (textView2 != null) {
            textView2.setText(subtitle);
        }
        this.f221z = subtitle;
    }

    public void K(Context context, int resId) {
        this.f208m = resId;
        TextView textView = this.f198c;
        if (textView != null) {
            textView.setTextAppearance(context, resId);
        }
    }

    public void J(Context context, int resId) {
        this.f209n = resId;
        TextView textView = this.f199d;
        if (textView != null) {
            textView.setTextAppearance(context, resId);
        }
    }

    public void setTitleTextColor(int color) {
        setTitleTextColor(ColorStateList.valueOf(color));
    }

    public void setTitleTextColor(ColorStateList color) {
        this.A = color;
        TextView textView = this.f198c;
        if (textView != null) {
            textView.setTextColor(color);
        }
    }

    public void setSubtitleTextColor(int color) {
        setSubtitleTextColor(ColorStateList.valueOf(color));
    }

    public void setSubtitleTextColor(ColorStateList color) {
        this.B = color;
        TextView textView = this.f199d;
        if (textView != null) {
            textView.setTextColor(color);
        }
    }

    public CharSequence getNavigationContentDescription() {
        ImageButton imageButton = this.f200e;
        if (imageButton != null) {
            return imageButton.getContentDescription();
        }
        return null;
    }

    public void setNavigationContentDescription(int resId) {
        setNavigationContentDescription(resId != 0 ? getContext().getText(resId) : null);
    }

    public void setNavigationContentDescription(CharSequence description) {
        if (!TextUtils.isEmpty(description)) {
            l();
        }
        ImageButton imageButton = this.f200e;
        if (imageButton != null) {
            imageButton.setContentDescription(description);
        }
    }

    public void setNavigationIcon(int resId) {
        setNavigationIcon(e.a.b(getContext(), resId));
    }

    public void setNavigationIcon(Drawable icon) {
        if (icon != null) {
            l();
            if (!y(this.f200e)) {
                c(this.f200e, true);
            }
        } else {
            ImageButton imageButton = this.f200e;
            if (imageButton != null && y(imageButton)) {
                removeView(this.f200e);
                this.F.remove(this.f200e);
            }
        }
        ImageButton imageButton2 = this.f200e;
        if (imageButton2 != null) {
            imageButton2.setImageDrawable(icon);
        }
    }

    public Drawable getNavigationIcon() {
        ImageButton imageButton = this.f200e;
        if (imageButton != null) {
            return imageButton.getDrawable();
        }
        return null;
    }

    public void setNavigationOnClickListener(View.OnClickListener listener) {
        l();
        this.f200e.setOnClickListener(listener);
    }

    public CharSequence getCollapseContentDescription() {
        ImageButton imageButton = this.f204i;
        if (imageButton != null) {
            return imageButton.getContentDescription();
        }
        return null;
    }

    public void setCollapseContentDescription(int resId) {
        setCollapseContentDescription(resId != 0 ? getContext().getText(resId) : null);
    }

    public void setCollapseContentDescription(CharSequence description) {
        if (!TextUtils.isEmpty(description)) {
            g();
        }
        ImageButton imageButton = this.f204i;
        if (imageButton != null) {
            imageButton.setContentDescription(description);
        }
    }

    public Drawable getCollapseIcon() {
        ImageButton imageButton = this.f204i;
        if (imageButton != null) {
            return imageButton.getDrawable();
        }
        return null;
    }

    public void setCollapseIcon(int resId) {
        setCollapseIcon(e.a.b(getContext(), resId));
    }

    public void setCollapseIcon(Drawable icon) {
        if (icon != null) {
            g();
            this.f204i.setImageDrawable(icon);
            return;
        }
        ImageButton imageButton = this.f204i;
        if (imageButton != null) {
            imageButton.setImageDrawable(this.f202g);
        }
    }

    public Menu getMenu() {
        j();
        return this.f197b.getMenu();
    }

    public void setOverflowIcon(Drawable icon) {
        j();
        this.f197b.setOverflowIcon(icon);
    }

    public Drawable getOverflowIcon() {
        j();
        return this.f197b.getOverflowIcon();
    }

    public final void j() {
        k();
        if (this.f197b.N() == null) {
            q menu = (q) this.f197b.getMenu();
            if (this.L == null) {
                this.L = new w3(this);
            }
            this.f197b.setExpandedActionViewsExclusive(true);
            menu.c(this.L, this.f206k);
        }
    }

    public final void k() {
        if (this.f197b == null) {
            ActionMenuView actionMenuView = new ActionMenuView(getContext());
            this.f197b = actionMenuView;
            actionMenuView.setPopupTheme(this.f207l);
            this.f197b.setOnMenuItemClickListener(this.I);
            this.f197b.O(null, null);
            x3 lp = generateDefaultLayoutParams();
            lp.f1579a = 8388613 | (this.f210o & 112);
            this.f197b.setLayoutParams(lp);
            c(this.f197b, false);
        }
    }

    private MenuInflater getMenuInflater() {
        return new k(getContext());
    }

    public void x(int resId) {
        getMenuInflater().inflate(resId, getMenu());
    }

    public void setOnMenuItemClickListener(y3 listener) {
        this.H = listener;
    }

    public void H(int contentInsetStart, int contentInsetEnd) {
        h();
        this.f216u.g(contentInsetStart, contentInsetEnd);
    }

    public int getContentInsetStart() {
        s2 s2Var = this.f216u;
        if (s2Var != null) {
            return s2Var.d();
        }
        return 0;
    }

    public int getContentInsetEnd() {
        s2 s2Var = this.f216u;
        if (s2Var != null) {
            return s2Var.a();
        }
        return 0;
    }

    public int getContentInsetLeft() {
        s2 s2Var = this.f216u;
        if (s2Var != null) {
            return s2Var.b();
        }
        return 0;
    }

    public int getContentInsetRight() {
        s2 s2Var = this.f216u;
        if (s2Var != null) {
            return s2Var.c();
        }
        return 0;
    }

    public int getContentInsetStartWithNavigation() {
        int i2 = this.f217v;
        if (i2 != Integer.MIN_VALUE) {
            return i2;
        }
        return getContentInsetStart();
    }

    public void setContentInsetStartWithNavigation(int insetStartWithNavigation) {
        if (insetStartWithNavigation < 0) {
            insetStartWithNavigation = Integer.MIN_VALUE;
        }
        if (insetStartWithNavigation != this.f217v) {
            this.f217v = insetStartWithNavigation;
            if (getNavigationIcon() != null) {
                requestLayout();
            }
        }
    }

    public int getContentInsetEndWithActions() {
        int i2 = this.f218w;
        if (i2 != Integer.MIN_VALUE) {
            return i2;
        }
        return getContentInsetEnd();
    }

    public void setContentInsetEndWithActions(int insetEndWithActions) {
        if (insetEndWithActions < 0) {
            insetEndWithActions = Integer.MIN_VALUE;
        }
        if (insetEndWithActions != this.f218w) {
            this.f218w = insetEndWithActions;
            if (getNavigationIcon() != null) {
                requestLayout();
            }
        }
    }

    public int getCurrentContentInsetStart() {
        if (getNavigationIcon() != null) {
            return Math.max(getContentInsetStart(), Math.max(this.f217v, 0));
        }
        return getContentInsetStart();
    }

    public int getCurrentContentInsetEnd() {
        boolean hasActions = false;
        ActionMenuView actionMenuView = this.f197b;
        if (actionMenuView != null) {
            q mb = actionMenuView.N();
            hasActions = mb != null && mb.hasVisibleItems();
        }
        if (hasActions) {
            return Math.max(getContentInsetEnd(), Math.max(this.f218w, 0));
        }
        return getContentInsetEnd();
    }

    public int getCurrentContentInsetLeft() {
        if (c1.A(this) == 1) {
            return getCurrentContentInsetEnd();
        }
        return getCurrentContentInsetStart();
    }

    public int getCurrentContentInsetRight() {
        if (c1.A(this) == 1) {
            return getCurrentContentInsetStart();
        }
        return getCurrentContentInsetEnd();
    }

    public final void l() {
        if (this.f200e == null) {
            this.f200e = new g0(getContext(), null, R.attr.toolbarNavigationButtonStyle);
            x3 lp = generateDefaultLayoutParams();
            lp.f1579a = 8388611 | (this.f210o & 112);
            this.f200e.setLayoutParams(lp);
        }
    }

    public void g() {
        if (this.f204i == null) {
            g0 g0Var = new g0(getContext(), null, R.attr.toolbarNavigationButtonStyle);
            this.f204i = g0Var;
            g0Var.setImageDrawable(this.f202g);
            this.f204i.setContentDescription(this.f203h);
            x3 lp = generateDefaultLayoutParams();
            lp.f1579a = 8388611 | (this.f210o & 112);
            lp.f585b = 2;
            this.f204i.setLayoutParams(lp);
            this.f204i.setOnClickListener(new v3(this));
        }
    }

    public final void c(View v2, boolean allowHide) {
        x3 lp;
        ViewGroup.LayoutParams vlp = v2.getLayoutParams();
        if (vlp == null) {
            lp = generateDefaultLayoutParams();
        } else if (!checkLayoutParams(vlp)) {
            lp = generateLayoutParams(vlp);
        } else {
            lp = (x3) vlp;
        }
        lp.f585b = 1;
        if (!allowHide || this.f205j == null) {
            addView(v2, lp);
            return;
        }
        v2.setLayoutParams(lp);
        this.F.add(v2);
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        t tVar;
        a4 state = new a4(super.onSaveInstanceState());
        w3 w3Var = this.L;
        if (!(w3Var == null || (tVar = w3Var.f574c) == null)) {
            state.f233d = tVar.getItemId();
        }
        state.f234e = A();
        return state;
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable state) {
        MenuItem item;
        if (!(state instanceof a4)) {
            super.onRestoreInstanceState(state);
            return;
        }
        a4 ss = (a4) state;
        super.onRestoreInstanceState(ss.i());
        ActionMenuView actionMenuView = this.f197b;
        Menu menu = actionMenuView != null ? actionMenuView.N() : null;
        int i2 = ss.f233d;
        if (!(i2 == 0 || this.L == null || menu == null || (item = menu.findItem(i2)) == null)) {
            item.expandActionView();
        }
        if (ss.f234e) {
            F();
        }
    }

    public final void F() {
        removeCallbacks(this.N);
        post(this.N);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeCallbacks(this.N);
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent ev) {
        int action = ev.getActionMasked();
        if (action == 0) {
            this.C = false;
        }
        if (!this.C) {
            boolean handled = super.onTouchEvent(ev);
            if (action == 0 && !handled) {
                this.C = true;
            }
        }
        if (action == 1 || action == 3) {
            this.C = false;
        }
        return true;
    }

    @Override // android.view.View
    public boolean onHoverEvent(MotionEvent ev) {
        int action = ev.getActionMasked();
        if (action == 9) {
            this.D = false;
        }
        if (!this.D) {
            boolean handled = super.onHoverEvent(ev);
            if (action == 9 && !handled) {
                this.D = true;
            }
        }
        if (action == 10 || action == 3) {
            this.D = false;
        }
        return true;
    }

    public final void E(View child, int parentWidthSpec, int widthUsed, int parentHeightSpec, int heightUsed, int heightConstraint) {
        int size;
        ViewGroup.MarginLayoutParams lp = (ViewGroup.MarginLayoutParams) child.getLayoutParams();
        int childWidthSpec = ViewGroup.getChildMeasureSpec(parentWidthSpec, getPaddingLeft() + getPaddingRight() + lp.leftMargin + lp.rightMargin + widthUsed, lp.width);
        int childHeightSpec = ViewGroup.getChildMeasureSpec(parentHeightSpec, getPaddingTop() + getPaddingBottom() + lp.topMargin + lp.bottomMargin + heightUsed, lp.height);
        int childHeightMode = View.MeasureSpec.getMode(childHeightSpec);
        if (childHeightMode != 1073741824 && heightConstraint >= 0) {
            if (childHeightMode != 0) {
                size = Math.min(View.MeasureSpec.getSize(childHeightSpec), heightConstraint);
            } else {
                size = heightConstraint;
            }
            childHeightSpec = View.MeasureSpec.makeMeasureSpec(size, 1073741824);
        }
        child.measure(childWidthSpec, childHeightSpec);
    }

    public final int D(View child, int parentWidthMeasureSpec, int widthUsed, int parentHeightMeasureSpec, int heightUsed, int[] collapsingMargins) {
        ViewGroup.MarginLayoutParams lp = (ViewGroup.MarginLayoutParams) child.getLayoutParams();
        int leftDiff = lp.leftMargin - collapsingMargins[0];
        int rightDiff = lp.rightMargin - collapsingMargins[1];
        int leftMargin = Math.max(0, leftDiff);
        int rightMargin = Math.max(0, rightDiff);
        int hMargins = leftMargin + rightMargin;
        collapsingMargins[0] = Math.max(0, -leftDiff);
        collapsingMargins[1] = Math.max(0, -rightDiff);
        int childWidthMeasureSpec = ViewGroup.getChildMeasureSpec(parentWidthMeasureSpec, getPaddingLeft() + getPaddingRight() + hMargins + widthUsed, lp.width);
        int childHeightMeasureSpec = ViewGroup.getChildMeasureSpec(parentHeightMeasureSpec, getPaddingTop() + getPaddingBottom() + lp.topMargin + lp.bottomMargin + heightUsed, lp.height);
        child.measure(childWidthMeasureSpec, childHeightMeasureSpec);
        return child.getMeasuredWidth() + hMargins;
    }

    public final boolean L() {
        if (!this.M) {
            return false;
        }
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View child = getChildAt(i2);
            if (M(child) && child.getMeasuredWidth() > 0 && child.getMeasuredHeight() > 0) {
                return false;
            }
        }
        return true;
    }

    @Override // android.view.View
    public void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        int marginEndIndex;
        int marginStartIndex;
        int marginStartIndex2;
        int menuWidth;
        int titleHeight;
        int childCount;
        int childState;
        int height = 0;
        int childState2 = 0;
        int[] collapsingMargins = this.G;
        if (l4.b(this)) {
            marginStartIndex = 1;
            marginEndIndex = 0;
        } else {
            marginStartIndex = 0;
            marginEndIndex = 1;
        }
        int navWidth = 0;
        if (M(this.f200e)) {
            E(this.f200e, widthMeasureSpec, 0, heightMeasureSpec, 0, this.f211p);
            navWidth = this.f200e.getMeasuredWidth() + s(this.f200e);
            height = Math.max(0, this.f200e.getMeasuredHeight() + t(this.f200e));
            childState2 = View.combineMeasuredStates(0, this.f200e.getMeasuredState());
        }
        if (M(this.f204i)) {
            E(this.f204i, widthMeasureSpec, 0, heightMeasureSpec, 0, this.f211p);
            navWidth = this.f204i.getMeasuredWidth() + s(this.f204i);
            height = Math.max(height, this.f204i.getMeasuredHeight() + t(this.f204i));
            childState2 = View.combineMeasuredStates(childState2, this.f204i.getMeasuredState());
        }
        int contentInsetStart = getCurrentContentInsetStart();
        int width = 0 + Math.max(contentInsetStart, navWidth);
        collapsingMargins[marginStartIndex] = Math.max(0, contentInsetStart - navWidth);
        if (M(this.f197b)) {
            marginStartIndex2 = 0;
            E(this.f197b, widthMeasureSpec, width, heightMeasureSpec, 0, this.f211p);
            int menuWidth2 = this.f197b.getMeasuredWidth() + s(this.f197b);
            height = Math.max(height, this.f197b.getMeasuredHeight() + t(this.f197b));
            childState2 = View.combineMeasuredStates(childState2, this.f197b.getMeasuredState());
            menuWidth = menuWidth2;
        } else {
            marginStartIndex2 = 0;
            menuWidth = 0;
        }
        int contentInsetEnd = getCurrentContentInsetEnd();
        int width2 = width + Math.max(contentInsetEnd, menuWidth);
        collapsingMargins[marginEndIndex] = Math.max(marginStartIndex2, contentInsetEnd - menuWidth);
        if (M(this.f205j)) {
            width2 += D(this.f205j, widthMeasureSpec, width2, heightMeasureSpec, 0, collapsingMargins);
            height = Math.max(height, this.f205j.getMeasuredHeight() + t(this.f205j));
            childState2 = View.combineMeasuredStates(childState2, this.f205j.getMeasuredState());
        }
        if (M(this.f201f)) {
            width2 += D(this.f201f, widthMeasureSpec, width2, heightMeasureSpec, 0, collapsingMargins);
            height = Math.max(height, this.f201f.getMeasuredHeight() + t(this.f201f));
            childState2 = View.combineMeasuredStates(childState2, this.f201f.getMeasuredState());
        }
        int childCount2 = getChildCount();
        int childState3 = childState2;
        int height2 = height;
        int width3 = width2;
        int width4 = 0;
        while (width4 < childCount2) {
            View child = getChildAt(width4);
            x3 lp = (x3) child.getLayoutParams();
            if (lp.f585b != 0) {
                childState = childState3;
                childCount = childCount2;
            } else if (!M(child)) {
                childState = childState3;
                childCount = childCount2;
            } else {
                childCount = childCount2;
                width3 += D(child, widthMeasureSpec, width3, heightMeasureSpec, 0, collapsingMargins);
                int height3 = Math.max(height2, child.getMeasuredHeight() + t(child));
                childState3 = View.combineMeasuredStates(childState3, child.getMeasuredState());
                height2 = height3;
                width4++;
                childCount2 = childCount;
            }
            childState3 = childState;
            width4++;
            childCount2 = childCount;
        }
        int childState4 = childState3;
        int titleWidth = 0;
        int titleHeight2 = 0;
        int titleVertMargins = this.f214s + this.f215t;
        int titleHorizMargins = this.f212q + this.f213r;
        if (M(this.f198c)) {
            D(this.f198c, widthMeasureSpec, width3 + titleHorizMargins, heightMeasureSpec, titleVertMargins, collapsingMargins);
            titleWidth = this.f198c.getMeasuredWidth() + s(this.f198c);
            titleHeight2 = this.f198c.getMeasuredHeight() + t(this.f198c);
            childState4 = View.combineMeasuredStates(childState4, this.f198c.getMeasuredState());
        }
        if (M(this.f199d)) {
            titleWidth = Math.max(titleWidth, D(this.f199d, widthMeasureSpec, width3 + titleHorizMargins, heightMeasureSpec, titleHeight2 + titleVertMargins, collapsingMargins));
            int titleHeight3 = titleHeight2 + this.f199d.getMeasuredHeight() + t(this.f199d);
            childState4 = View.combineMeasuredStates(childState4, this.f199d.getMeasuredState());
            titleHeight = titleHeight3;
        } else {
            titleHeight = titleHeight2;
        }
        int height4 = Math.max(height2, titleHeight);
        int width5 = width3 + titleWidth + getPaddingLeft() + getPaddingRight();
        int height5 = height4 + getPaddingTop() + getPaddingBottom();
        int measuredWidth = View.resolveSizeAndState(Math.max(width5, getSuggestedMinimumWidth()), widthMeasureSpec, (-16777216) & childState4);
        int measuredHeight = View.resolveSizeAndState(Math.max(height5, getSuggestedMinimumHeight()), heightMeasureSpec, childState4 << 16);
        setMeasuredDimension(measuredWidth, L() ? 0 : measuredHeight);
    }

    /* JADX WARN: Code restructure failed: missing block: B:53:0x015e, code lost:
        if (r33.f198c.getMeasuredWidth() > 0) goto L_0x016d;
     */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0179  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0193  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x01a4  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x01d2  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0256  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onLayout(boolean r34, int r35, int r36, int r37, int r38) {
        /*
            Method dump skipped, instructions count: 874
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.Toolbar.onLayout(boolean, int, int, int, int):void");
    }

    public final int u(List list, int[] collapsingMargins) {
        int collapseLeft = collapsingMargins[0];
        int collapseRight = collapsingMargins[1];
        int width = 0;
        int count = list.size();
        for (int i2 = 0; i2 < count; i2++) {
            View v2 = (View) list.get(i2);
            x3 lp = (x3) v2.getLayoutParams();
            int l2 = ((ViewGroup.MarginLayoutParams) lp).leftMargin - collapseLeft;
            int r2 = ((ViewGroup.MarginLayoutParams) lp).rightMargin - collapseRight;
            int leftMargin = Math.max(0, l2);
            int rightMargin = Math.max(0, r2);
            collapseLeft = Math.max(0, -l2);
            collapseRight = Math.max(0, -r2);
            width += v2.getMeasuredWidth() + leftMargin + rightMargin;
        }
        return width;
    }

    public final int B(View child, int left, int[] collapsingMargins, int alignmentHeight) {
        x3 lp = (x3) child.getLayoutParams();
        int l2 = ((ViewGroup.MarginLayoutParams) lp).leftMargin - collapsingMargins[0];
        int left2 = left + Math.max(0, l2);
        collapsingMargins[0] = Math.max(0, -l2);
        int top = q(child, alignmentHeight);
        int childWidth = child.getMeasuredWidth();
        child.layout(left2, top, left2 + childWidth, child.getMeasuredHeight() + top);
        return left2 + ((ViewGroup.MarginLayoutParams) lp).rightMargin + childWidth;
    }

    public final int C(View child, int right, int[] collapsingMargins, int alignmentHeight) {
        x3 lp = (x3) child.getLayoutParams();
        int r2 = ((ViewGroup.MarginLayoutParams) lp).rightMargin - collapsingMargins[1];
        int right2 = right - Math.max(0, r2);
        collapsingMargins[1] = Math.max(0, -r2);
        int top = q(child, alignmentHeight);
        int childWidth = child.getMeasuredWidth();
        child.layout(right2 - childWidth, top, right2, child.getMeasuredHeight() + top);
        return right2 - (((ViewGroup.MarginLayoutParams) lp).leftMargin + childWidth);
    }

    public final int q(View child, int alignmentHeight) {
        x3 lp = (x3) child.getLayoutParams();
        int childHeight = child.getMeasuredHeight();
        int alignmentOffset = alignmentHeight > 0 ? (childHeight - alignmentHeight) / 2 : 0;
        switch (r(lp.f1579a)) {
            case 48:
                return getPaddingTop() - alignmentOffset;
            case 80:
                return (((getHeight() - getPaddingBottom()) - childHeight) - ((ViewGroup.MarginLayoutParams) lp).bottomMargin) - alignmentOffset;
            default:
                int paddingTop = getPaddingTop();
                int paddingBottom = getPaddingBottom();
                int height = getHeight();
                int space = (height - paddingTop) - paddingBottom;
                int spaceAbove = (space - childHeight) / 2;
                if (spaceAbove < ((ViewGroup.MarginLayoutParams) lp).topMargin) {
                    spaceAbove = ((ViewGroup.MarginLayoutParams) lp).topMargin;
                } else {
                    int spaceBelow = (((height - paddingBottom) - childHeight) - spaceAbove) - paddingTop;
                    int i2 = ((ViewGroup.MarginLayoutParams) lp).bottomMargin;
                    if (spaceBelow < i2) {
                        spaceAbove = Math.max(0, spaceAbove - (i2 - spaceBelow));
                    }
                }
                return paddingTop + spaceAbove;
        }
    }

    public final int r(int gravity) {
        int vgrav = gravity & 112;
        switch (vgrav) {
            case 16:
            case 48:
            case 80:
                return vgrav;
            default:
                return this.f219x & 112;
        }
    }

    public final void b(List list, int gravity) {
        boolean isRtl = true;
        if (c1.A(this) != 1) {
            isRtl = false;
        }
        int childCount = getChildCount();
        int absGrav = o.b(gravity, c1.A(this));
        list.clear();
        if (isRtl) {
            for (int i2 = childCount - 1; i2 >= 0; i2--) {
                View child = getChildAt(i2);
                x3 lp = (x3) child.getLayoutParams();
                if (lp.f585b == 0 && M(child) && p(lp.f1579a) == absGrav) {
                    list.add(child);
                }
            }
            return;
        }
        for (int i3 = 0; i3 < childCount; i3++) {
            View child2 = getChildAt(i3);
            x3 lp2 = (x3) child2.getLayoutParams();
            if (lp2.f585b == 0 && M(child2) && p(lp2.f1579a) == absGrav) {
                list.add(child2);
            }
        }
    }

    public final int p(int gravity) {
        int ld = c1.A(this);
        int absGrav = o.b(gravity, ld);
        int hGrav = absGrav & 7;
        switch (hGrav) {
            case 1:
            case 3:
            case 5:
                return hGrav;
            case 2:
            case 4:
            default:
                return ld == 1 ? 5 : 3;
        }
    }

    public final boolean M(View view) {
        return (view == null || view.getParent() != this || view.getVisibility() == 8) ? false : true;
    }

    public final int s(View v2) {
        ViewGroup.MarginLayoutParams mlp = (ViewGroup.MarginLayoutParams) v2.getLayoutParams();
        return s.b(mlp) + s.a(mlp);
    }

    public final int t(View v2) {
        ViewGroup.MarginLayoutParams mlp = (ViewGroup.MarginLayoutParams) v2.getLayoutParams();
        return mlp.topMargin + mlp.bottomMargin;
    }

    /* renamed from: n */
    public x3 generateLayoutParams(AttributeSet attrs) {
        return new x3(getContext(), attrs);
    }

    /* renamed from: o */
    public x3 generateLayoutParams(ViewGroup.LayoutParams p2) {
        if (p2 instanceof x3) {
            return new x3((x3) p2);
        }
        if (p2 instanceof d.a) {
            return new x3((d.a) p2);
        }
        if (p2 instanceof ViewGroup.MarginLayoutParams) {
            return new x3((ViewGroup.MarginLayoutParams) p2);
        }
        return new x3(p2);
    }

    /* renamed from: m */
    public x3 generateDefaultLayoutParams() {
        return new x3(-2, -2);
    }

    @Override // android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams p2) {
        return super.checkLayoutParams(p2) && (p2 instanceof x3);
    }

    public r1 getWrapper() {
        if (this.J == null) {
            this.J = new d4(this, true);
        }
        return this.J;
    }

    public void G() {
        int childCount = getChildCount();
        for (int i2 = childCount - 1; i2 >= 0; i2--) {
            View child = getChildAt(i2);
            x3 lp = (x3) child.getLayoutParams();
            if (!(lp.f585b == 2 || child == this.f197b)) {
                removeViewAt(i2);
                this.F.add(child);
            }
        }
    }

    public void a() {
        int count = this.F.size();
        for (int i2 = count - 1; i2 >= 0; i2--) {
            addView((View) this.F.get(i2));
        }
        this.F.clear();
    }

    public final boolean y(View child) {
        return child.getParent() == this || this.F.contains(child);
    }

    public void setCollapsible(boolean collapsible) {
        this.M = collapsible;
        requestLayout();
    }

    public final void h() {
        if (this.f216u == null) {
            this.f216u = new s2();
        }
    }

    public final TextView getTitleTextView() {
        return this.f198c;
    }

    public final TextView getSubtitleTextView() {
        return this.f199d;
    }

    public q getOuterActionMenuPresenter() {
        return this.K;
    }

    Context getPopupContext() {
        return this.f206k;
    }
}
