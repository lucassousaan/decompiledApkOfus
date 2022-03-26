package d0;

import android.text.SpannableStringBuilder;
import java.util.Locale;

/* JADX WARN: Classes with same name are omitted:
  
 */
/* loaded from: classes.dex */
public final class c {

    /* renamed from: d  reason: collision with root package name */
    public static final g f1772d;

    /* renamed from: e  reason: collision with root package name */
    public static final String f1773e = Character.toString(8206);

    /* renamed from: f  reason: collision with root package name */
    public static final String f1774f = Character.toString(8207);

    /* renamed from: g  reason: collision with root package name */
    public static final c f1775g;

    /* renamed from: h  reason: collision with root package name */
    public static final c f1776h;

    /* renamed from: a  reason: collision with root package name */
    public final boolean f1777a;

    /* renamed from: b  reason: collision with root package name */
    public final int f1778b;

    /* renamed from: c  reason: collision with root package name */
    public final g f1779c;

    static {
        g gVar = n.f1796c;
        f1772d = gVar;
        f1775g = new c(false, 2, gVar);
        f1776h = new c(true, 2, gVar);
    }

    public static c c() {
        return new a().a();
    }

    public c(boolean isRtlContext, int flags, g heuristic) {
        this.f1777a = isRtlContext;
        this.f1778b = flags;
        this.f1779c = heuristic;
    }

    public boolean d() {
        return (this.f1778b & 2) != 0;
    }

    public final String f(CharSequence str, g heuristic) {
        boolean isRtl = ((k) heuristic).c(str, 0, str.length());
        if (!this.f1777a && (isRtl || b(str) == 1)) {
            return f1773e;
        }
        if (!this.f1777a) {
            return "";
        }
        if (!isRtl || b(str) == -1) {
            return f1774f;
        }
        return "";
    }

    public final String g(CharSequence str, g heuristic) {
        boolean isRtl = ((k) heuristic).c(str, 0, str.length());
        if (!this.f1777a && (isRtl || a(str) == 1)) {
            return f1773e;
        }
        if (!this.f1777a) {
            return "";
        }
        if (!isRtl || a(str) == -1) {
            return f1774f;
        }
        return "";
    }

    public String k(String str, g heuristic, boolean isolate) {
        if (str == null) {
            return null;
        }
        return i(str, heuristic, isolate).toString();
    }

    public CharSequence i(CharSequence str, g heuristic, boolean isolate) {
        if (str == null) {
            return null;
        }
        boolean isRtl = ((k) heuristic).c(str, 0, str.length());
        SpannableStringBuilder result = new SpannableStringBuilder();
        if (d() && isolate) {
            result.append((CharSequence) g(str, isRtl ? n.f1795b : n.f1794a));
        }
        if (isRtl != this.f1777a) {
            result.append(isRtl ? (char) 8235 : (char) 8234);
            result.append(str);
            result.append((char) 8236);
        } else {
            result.append(str);
        }
        if (isolate) {
            result.append((CharSequence) f(str, isRtl ? n.f1795b : n.f1794a));
        }
        return result;
    }

    public String j(String str) {
        return k(str, this.f1779c, true);
    }

    public CharSequence h(CharSequence str) {
        return i(str, this.f1779c, true);
    }

    public static boolean e(Locale locale) {
        return o.a(locale) == 1;
    }

    public static int b(CharSequence str) {
        return new b(str, false).e();
    }

    public static int a(CharSequence str) {
        return new b(str, false).d();
    }
}
