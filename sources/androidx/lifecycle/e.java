package androidx.lifecycle;

/* JADX WARN: Classes with same name are omitted:
  
 */
/* loaded from: classes.dex */
public abstract /* synthetic */ class e {

    /* renamed from: a  reason: collision with root package name */
    public static final /* synthetic */ int[] f1015a;

    static {
        int[] iArr = new int[h.values().length];
        f1015a = iArr;
        try {
            iArr[h.ON_CREATE.ordinal()] = 1;
        } catch (NoSuchFieldError e2) {
        }
        try {
            f1015a[h.ON_START.ordinal()] = 2;
        } catch (NoSuchFieldError e3) {
        }
        try {
            f1015a[h.ON_RESUME.ordinal()] = 3;
        } catch (NoSuchFieldError e4) {
        }
        try {
            f1015a[h.ON_PAUSE.ordinal()] = 4;
        } catch (NoSuchFieldError e5) {
        }
        try {
            f1015a[h.ON_STOP.ordinal()] = 5;
        } catch (NoSuchFieldError e6) {
        }
        try {
            f1015a[h.ON_DESTROY.ordinal()] = 6;
        } catch (NoSuchFieldError e7) {
        }
        try {
            f1015a[h.ON_ANY.ordinal()] = 7;
        } catch (NoSuchFieldError e8) {
        }
    }
}
