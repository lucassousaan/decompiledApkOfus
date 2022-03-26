package g0;

import a1.a;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;

/* JADX WARN: Classes with same name are omitted:
  
 */
/* loaded from: classes.dex */
public class c {

    /* renamed from: e  reason: collision with root package name */
    public static final c f2007e = new c(16, null);

    /* renamed from: f  reason: collision with root package name */
    public static final c f2008f = new c(4096, null);

    /* renamed from: g  reason: collision with root package name */
    public static final c f2009g = new c(8192, null);

    /* renamed from: h  reason: collision with root package name */
    public static final c f2010h = new c(262144, null);

    /* renamed from: i  reason: collision with root package name */
    public static final c f2011i = new c(524288, null);

    /* renamed from: j  reason: collision with root package name */
    public static final c f2012j = new c(1048576, null);

    /* renamed from: k  reason: collision with root package name */
    public static final c f2013k = new c(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_UP, 16908344, null, null, null);

    /* renamed from: l  reason: collision with root package name */
    public static final c f2014l = new c(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_DOWN, 16908346, null, null, null);

    /* renamed from: a  reason: collision with root package name */
    public final Object f2015a;

    /* renamed from: b  reason: collision with root package name */
    public final int f2016b;

    /* renamed from: c  reason: collision with root package name */
    public final Class f2017c;

    /* renamed from: d  reason: collision with root package name */
    public final t f2018d;

    static {
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction = null;
        new c(1, null);
        new c(2, null);
        new c(4, null);
        new c(8, null);
        new c(32, null);
        new c(64, null);
        new c(128, null);
        new c(256, (CharSequence) null, m.class);
        new c(512, (CharSequence) null, m.class);
        new c(1024, (CharSequence) null, n.class);
        new c(2048, (CharSequence) null, n.class);
        new c(16384, null);
        new c(32768, null);
        new c(65536, null);
        new c(131072, (CharSequence) null, r.class);
        new c(2097152, (CharSequence) null, s.class);
        int i2 = Build.VERSION.SDK_INT;
        new c(AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_ON_SCREEN, 16908342, null, null, null);
        new c(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_TO_POSITION, 16908343, null, null, p.class);
        new c(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_LEFT, 16908345, null, null, null);
        new c(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_RIGHT, 16908347, null, null, null);
        new c(i2 >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_UP : null, 16908358, null, null, null);
        new c(i2 >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_DOWN : null, 16908359, null, null, null);
        new c(i2 >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_LEFT : null, 16908360, null, null, null);
        new c(i2 >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_RIGHT : null, 16908361, null, null, null);
        new c(AccessibilityNodeInfo.AccessibilityAction.ACTION_CONTEXT_CLICK, 16908348, null, null, null);
        new c(AccessibilityNodeInfo.AccessibilityAction.ACTION_SET_PROGRESS, 16908349, null, null, q.class);
        new c(i2 >= 26 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_MOVE_WINDOW : null, 16908354, null, null, o.class);
        new c(i2 >= 28 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_TOOLTIP : null, 16908356, null, null, null);
        new c(i2 >= 28 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_HIDE_TOOLTIP : null, 16908357, null, null, null);
        new c(i2 >= 30 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PRESS_AND_HOLD : null, 16908362, null, null, null);
        if (i2 >= 30) {
            accessibilityAction = AccessibilityNodeInfo.AccessibilityAction.ACTION_IME_ENTER;
        }
        new c(accessibilityAction, 16908372, null, null, null);
    }

    public c(int actionId, CharSequence label) {
        this(null, actionId, label, null, null);
    }

    public c(int actionId, CharSequence label, t command) {
        this(null, actionId, label, command, null);
    }

    public c(Object action) {
        this(action, 0, null, null, null);
    }

    public c(int actionId, CharSequence label, Class cls) {
        this(null, actionId, label, null, cls);
    }

    public c(Object action, int id, CharSequence label, t command, Class cls) {
        this.f2016b = id;
        this.f2018d = command;
        if (action == null) {
            this.f2015a = new AccessibilityNodeInfo.AccessibilityAction(id, label);
        } else {
            this.f2015a = action;
        }
        this.f2017c = cls;
    }

    public int b() {
        return ((AccessibilityNodeInfo.AccessibilityAction) this.f2015a).getId();
    }

    public CharSequence c() {
        return ((AccessibilityNodeInfo.AccessibilityAction) this.f2015a).getLabel();
    }

    public boolean d(View view, Bundle arguments) {
        if (this.f2018d == null) {
            return false;
        }
        l viewCommandArgument = null;
        Class cls = this.f2017c;
        if (cls != null) {
            try {
                viewCommandArgument = null;
                a.a(cls.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]));
                viewCommandArgument.a(arguments);
            } catch (Exception e2) {
                Class cls2 = this.f2017c;
                String className = cls2 == null ? "null" : cls2.getName();
                Log.e("A11yActionCompat", "Failed to execute command with argument class ViewCommandArgument: " + className, e2);
            }
        }
        return this.f2018d.a(view, viewCommandArgument);
    }

    public c a(CharSequence label, t command) {
        return new c(null, this.f2016b, label, command, this.f2017c);
    }

    public int hashCode() {
        Object obj = this.f2015a;
        if (obj != null) {
            return obj.hashCode();
        }
        return 0;
    }

    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof c)) {
            return false;
        }
        c other = (c) obj;
        Object obj2 = this.f2015a;
        if (obj2 == null) {
            if (other.f2015a != null) {
                return false;
            }
            return true;
        } else if (!obj2.equals(other.f2015a)) {
            return false;
        } else {
            return true;
        }
    }
}
