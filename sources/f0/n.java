package f0;

import e0.c;

/* JADX WARN: Classes with same name are omitted:
  
 */
/* loaded from: classes.dex */
public final class n {

    /* renamed from: a  reason: collision with root package name */
    public final Object f1895a;

    public n(Object displayCutout) {
        this.f1895a = displayCutout;
    }

    public boolean equals(Object o2) {
        if (this == o2) {
            return true;
        }
        if (o2 == null || getClass() != o2.getClass()) {
            return false;
        }
        n other = (n) o2;
        return c.a(this.f1895a, other.f1895a);
    }

    public int hashCode() {
        Object obj = this.f1895a;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public String toString() {
        return "DisplayCutoutCompat{" + this.f1895a + "}";
    }

    public static n a(Object displayCutout) {
        if (displayCutout == null) {
            return null;
        }
        return new n(displayCutout);
    }
}
