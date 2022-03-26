package d0;

/* JADX WARN: Classes with same name are omitted:
  
 */
/* loaded from: classes.dex */
public abstract class k implements g {

    /* renamed from: a  reason: collision with root package name */
    public final j f1791a;

    public abstract boolean a();

    public k(j algorithm) {
        this.f1791a = algorithm;
    }

    public boolean c(CharSequence cs, int start, int count) {
        if (cs == null || start < 0 || count < 0 || cs.length() - count < start) {
            throw new IllegalArgumentException();
        } else if (this.f1791a == null) {
            return a();
        } else {
            return b(cs, start, count);
        }
    }

    public final boolean b(CharSequence cs, int start, int count) {
        switch (this.f1791a.a(cs, start, count)) {
            case 0:
                return true;
            case 1:
                return false;
            default:
                return a();
        }
    }
}
