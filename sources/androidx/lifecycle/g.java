package androidx.lifecycle;

/* JADX WARN: Classes with same name are omitted:
  
 */
/* loaded from: classes.dex */
public abstract /* synthetic */ class g {

    /* renamed from: a  reason: collision with root package name */
    public static final /* synthetic */ int[] f1018a;

    /* renamed from: b  reason: collision with root package name */
    public static final /* synthetic */ int[] f1019b;

    static {
        int[] iArr = new int[h.values().length];
        f1019b = iArr;
        try {
            iArr[h.ON_CREATE.ordinal()] = 1;
        } catch (NoSuchFieldError e2) {
        }
        try {
            f1019b[h.ON_STOP.ordinal()] = 2;
        } catch (NoSuchFieldError e3) {
        }
        try {
            f1019b[h.ON_START.ordinal()] = 3;
        } catch (NoSuchFieldError e4) {
        }
        try {
            f1019b[h.ON_PAUSE.ordinal()] = 4;
        } catch (NoSuchFieldError e5) {
        }
        try {
            f1019b[h.ON_RESUME.ordinal()] = 5;
        } catch (NoSuchFieldError e6) {
        }
        try {
            f1019b[h.ON_DESTROY.ordinal()] = 6;
        } catch (NoSuchFieldError e7) {
        }
        try {
            f1019b[h.ON_ANY.ordinal()] = 7;
        } catch (NoSuchFieldError e8) {
        }
        int[] iArr2 = new int[i.values().length];
        f1018a = iArr2;
        try {
            iArr2[i.CREATED.ordinal()] = 1;
        } catch (NoSuchFieldError e9) {
        }
        try {
            f1018a[i.STARTED.ordinal()] = 2;
        } catch (NoSuchFieldError e10) {
        }
        try {
            f1018a[i.RESUMED.ordinal()] = 3;
        } catch (NoSuchFieldError e11) {
        }
        try {
            f1018a[i.DESTROYED.ordinal()] = 4;
        } catch (NoSuchFieldError e12) {
        }
        try {
            f1018a[i.INITIALIZED.ordinal()] = 5;
        } catch (NoSuchFieldError e13) {
        }
    }
}
