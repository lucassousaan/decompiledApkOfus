package d0;

import java.util.Locale;

/* JADX WARN: Classes with same name are omitted:
  
 */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public boolean f1763a;

    /* renamed from: b  reason: collision with root package name */
    public int f1764b;

    /* renamed from: c  reason: collision with root package name */
    public g f1765c;

    public a() {
        c(c.e(Locale.getDefault()));
    }

    public final void c(boolean isRtlContext) {
        this.f1763a = isRtlContext;
        this.f1765c = c.f1772d;
        this.f1764b = 2;
    }

    public static c b(boolean isRtlContext) {
        return isRtlContext ? c.f1776h : c.f1775g;
    }

    public c a() {
        if (this.f1764b == 2 && this.f1765c == c.f1772d) {
            return b(this.f1763a);
        }
        return new c(this.f1763a, this.f1764b, this.f1765c);
    }
}
