package x;

import android.graphics.Insets;
import android.graphics.Rect;

/* JADX WARN: Classes with same name are omitted:
  
 */
/* loaded from: classes.dex */
public final class b {

    /* renamed from: e  reason: collision with root package name */
    public static final b f3667e = new b(0, 0, 0, 0);

    /* renamed from: a  reason: collision with root package name */
    public final int f3668a;

    /* renamed from: b  reason: collision with root package name */
    public final int f3669b;

    /* renamed from: c  reason: collision with root package name */
    public final int f3670c;

    /* renamed from: d  reason: collision with root package name */
    public final int f3671d;

    public b(int left, int top, int right, int bottom) {
        this.f3668a = left;
        this.f3669b = top;
        this.f3670c = right;
        this.f3671d = bottom;
    }

    public static b a(int left, int top, int right, int bottom) {
        if (left == 0 && top == 0 && right == 0 && bottom == 0) {
            return f3667e;
        }
        return new b(left, top, right, bottom);
    }

    public static b b(Rect r2) {
        return a(r2.left, r2.top, r2.right, r2.bottom);
    }

    public boolean equals(Object o2) {
        if (this == o2) {
            return true;
        }
        if (o2 == null || getClass() != o2.getClass()) {
            return false;
        }
        b insets = (b) o2;
        if (this.f3671d == insets.f3671d && this.f3668a == insets.f3668a && this.f3670c == insets.f3670c && this.f3669b == insets.f3669b) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int result = this.f3668a;
        return (((((result * 31) + this.f3669b) * 31) + this.f3670c) * 31) + this.f3671d;
    }

    public String toString() {
        return "Insets{left=" + this.f3668a + ", top=" + this.f3669b + ", right=" + this.f3670c + ", bottom=" + this.f3671d + '}';
    }

    public static b c(Insets insets) {
        return a(insets.left, insets.top, insets.right, insets.bottom);
    }

    public Insets d() {
        return Insets.of(this.f3668a, this.f3669b, this.f3670c, this.f3671d);
    }
}
