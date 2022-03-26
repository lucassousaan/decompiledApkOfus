package d0;

/* JADX WARN: Classes with same name are omitted:
  
 */
/* loaded from: classes.dex */
public abstract class n {

    /* renamed from: a  reason: collision with root package name */
    public static final g f1794a = new l(null, false);

    /* renamed from: b  reason: collision with root package name */
    public static final g f1795b = new l(null, true);

    /* renamed from: c  reason: collision with root package name */
    public static final g f1796c;

    /* renamed from: d  reason: collision with root package name */
    public static final g f1797d;

    static {
        i iVar = i.f1790a;
        f1796c = new l(iVar, false);
        f1797d = new l(iVar, true);
        new l(h.f1788b, false);
        m mVar = m.f1793b;
    }

    public static int a(int directionality) {
        switch (directionality) {
            case 0:
                return 1;
            case 1:
            case 2:
                return 0;
            default:
                return 2;
        }
    }

    public static int b(int directionality) {
        switch (directionality) {
            case 0:
            case 14:
            case 15:
                return 1;
            case 1:
            case 2:
            case 16:
            case 17:
                return 0;
            default:
                return 2;
        }
    }
}
