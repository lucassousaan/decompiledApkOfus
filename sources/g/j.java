package g;

import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.util.AttributeSet;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import androidx.appcompat.widget.s1;
import androidx.appcompat.widget.s3;
import c.a;
import f0.e;
import h.t;
import h.z;
import java.lang.reflect.Constructor;

/* JADX WARN: Classes with same name are omitted:
  
 */
/* loaded from: classes.dex */
public class j {
    public e A;
    public CharSequence B;
    public CharSequence C;
    public ColorStateList D = null;
    public PorterDuff.Mode E = null;
    public final /* synthetic */ k F;

    /* renamed from: a  reason: collision with root package name */
    public Menu f1962a;

    /* renamed from: b  reason: collision with root package name */
    public int f1963b;

    /* renamed from: c  reason: collision with root package name */
    public int f1964c;

    /* renamed from: d  reason: collision with root package name */
    public int f1965d;

    /* renamed from: e  reason: collision with root package name */
    public int f1966e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f1967f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f1968g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f1969h;

    /* renamed from: i  reason: collision with root package name */
    public int f1970i;

    /* renamed from: j  reason: collision with root package name */
    public int f1971j;

    /* renamed from: k  reason: collision with root package name */
    public CharSequence f1972k;

    /* renamed from: l  reason: collision with root package name */
    public CharSequence f1973l;

    /* renamed from: m  reason: collision with root package name */
    public int f1974m;

    /* renamed from: n  reason: collision with root package name */
    public char f1975n;

    /* renamed from: o  reason: collision with root package name */
    public int f1976o;

    /* renamed from: p  reason: collision with root package name */
    public char f1977p;

    /* renamed from: q  reason: collision with root package name */
    public int f1978q;

    /* renamed from: r  reason: collision with root package name */
    public int f1979r;

    /* renamed from: s  reason: collision with root package name */
    public boolean f1980s;

    /* renamed from: t  reason: collision with root package name */
    public boolean f1981t;

    /* renamed from: u  reason: collision with root package name */
    public boolean f1982u;

    /* renamed from: v  reason: collision with root package name */
    public int f1983v;

    /* renamed from: w  reason: collision with root package name */
    public int f1984w;

    /* renamed from: x  reason: collision with root package name */
    public String f1985x;

    /* renamed from: y  reason: collision with root package name */
    public String f1986y;

    /* renamed from: z  reason: collision with root package name */
    public String f1987z;

    public j(k kVar, Menu menu) {
        this.F = kVar;
        this.f1962a = menu;
        h();
    }

    public void h() {
        this.f1963b = 0;
        this.f1964c = 0;
        this.f1965d = 0;
        this.f1966e = 0;
        this.f1967f = true;
        this.f1968g = true;
    }

    public void f(AttributeSet attrs) {
        TypedArray a2 = this.F.f1992c.obtainStyledAttributes(attrs, a.f1181o);
        int[] iArr = a.f1167a;
        this.f1963b = a2.getResourceId(1, 0);
        this.f1964c = a2.getInt(3, 0);
        this.f1965d = a2.getInt(4, 0);
        this.f1966e = a2.getInt(5, 0);
        this.f1967f = a2.getBoolean(2, true);
        this.f1968g = a2.getBoolean(0, true);
        a2.recycle();
    }

    public void g(AttributeSet attrs) {
        s3 a2 = s3.u(this.F.f1992c, attrs, a.f1182p);
        int[] iArr = a.f1167a;
        this.f1970i = a2.n(2, 0);
        int category = a2.k(5, this.f1964c);
        int order = a2.k(6, this.f1965d);
        this.f1971j = ((-65536) & category) | (65535 & order);
        this.f1972k = a2.p(7);
        this.f1973l = a2.p(8);
        this.f1974m = a2.n(0, 0);
        this.f1975n = c(a2.o(9));
        this.f1976o = a2.k(16, 4096);
        this.f1977p = c(a2.o(10));
        this.f1978q = a2.k(20, 4096);
        if (a2.s(11)) {
            this.f1979r = a2.a(11, false) ? 1 : 0;
        } else {
            this.f1979r = this.f1966e;
        }
        this.f1980s = a2.a(3, false);
        this.f1981t = a2.a(4, this.f1967f);
        boolean hasActionProvider = true;
        this.f1982u = a2.a(1, this.f1968g);
        this.f1983v = a2.k(21, -1);
        this.f1987z = a2.o(12);
        this.f1984w = a2.n(13, 0);
        this.f1985x = a2.o(15);
        String o2 = a2.o(14);
        this.f1986y = o2;
        if (o2 == null) {
            hasActionProvider = false;
        }
        if (hasActionProvider && this.f1984w == 0 && this.f1985x == null) {
            this.A = (e) e(o2, k.f1989f, this.F.f1991b);
        } else {
            if (hasActionProvider) {
                Log.w("SupportMenuInflater", "Ignoring attribute 'actionProviderClass'. Action view already specified.");
            }
            this.A = null;
        }
        this.B = a2.p(17);
        this.C = a2.p(22);
        if (a2.s(19)) {
            this.E = s1.c(a2.k(19, -1), this.E);
        } else {
            this.E = null;
        }
        if (a2.s(18)) {
            this.D = a2.c(18);
        } else {
            this.D = null;
        }
        a2.w();
        this.f1969h = false;
    }

    public final char c(String shortcutString) {
        if (shortcutString == null) {
            return (char) 0;
        }
        return shortcutString.charAt(0);
    }

    public final void i(MenuItem item) {
        item.setChecked(this.f1980s).setVisible(this.f1981t).setEnabled(this.f1982u).setCheckable(this.f1979r >= 1).setTitleCondensed(this.f1973l).setIcon(this.f1974m);
        int i2 = this.f1983v;
        if (i2 >= 0) {
            item.setShowAsAction(i2);
        }
        if (this.f1987z != null) {
            if (!this.F.f1992c.isRestricted()) {
                item.setOnMenuItemClickListener(new i(this.F.b(), this.f1987z));
            } else {
                throw new IllegalStateException("The android:onClick attribute cannot be used within a restricted context");
            }
        }
        if (this.f1979r >= 2) {
            if (item instanceof t) {
                ((t) item).t(true);
            } else if (item instanceof z) {
                ((z) item).h(true);
            }
        }
        boolean actionViewSpecified = false;
        String str = this.f1985x;
        if (str != null) {
            View actionView = (View) e(str, k.f1988e, this.F.f1990a);
            item.setActionView(actionView);
            actionViewSpecified = true;
        }
        int i3 = this.f1984w;
        if (i3 > 0) {
            if (!actionViewSpecified) {
                item.setActionView(i3);
            } else {
                Log.w("SupportMenuInflater", "Ignoring attribute 'itemActionViewLayout'. Action view already specified.");
            }
        }
        e eVar = this.A;
        if (eVar != null) {
            f0.t.a(item, eVar);
        }
        f0.t.c(item, this.B);
        f0.t.g(item, this.C);
        f0.t.b(item, this.f1975n, this.f1976o);
        f0.t.f(item, this.f1977p, this.f1978q);
        PorterDuff.Mode mode = this.E;
        if (mode != null) {
            f0.t.e(item, mode);
        }
        ColorStateList colorStateList = this.D;
        if (colorStateList != null) {
            f0.t.d(item, colorStateList);
        }
    }

    public void a() {
        this.f1969h = true;
        i(this.f1962a.add(this.f1963b, this.f1970i, this.f1971j, this.f1972k));
    }

    public SubMenu b() {
        this.f1969h = true;
        SubMenu subMenu = this.f1962a.addSubMenu(this.f1963b, this.f1970i, this.f1971j, this.f1972k);
        i(subMenu.getItem());
        return subMenu;
    }

    public boolean d() {
        return this.f1969h;
    }

    public final Object e(String className, Class[] clsArr, Object[] arguments) {
        try {
            Class<?> clazz = Class.forName(className, false, this.F.f1992c.getClassLoader());
            Constructor<?> constructor = clazz.getConstructor(clsArr);
            constructor.setAccessible(true);
            return constructor.newInstance(arguments);
        } catch (Exception e2) {
            Log.w("SupportMenuInflater", "Cannot instantiate class: " + className, e2);
            return null;
        }
    }
}
