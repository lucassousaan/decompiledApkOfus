package androidx.lifecycle;

/* JADX WARN: Classes with same name are omitted:
  
 */
/* loaded from: classes.dex */
public enum h {
    ON_CREATE,
    ON_START,
    ON_RESUME,
    ON_PAUSE,
    ON_STOP,
    ON_DESTROY,
    ON_ANY;

    public static h a(i state) {
        switch (state.ordinal()) {
            case 2:
                return ON_DESTROY;
            case 3:
                return ON_STOP;
            case 4:
                return ON_PAUSE;
            default:
                return null;
        }
    }

    public static h c(i state) {
        switch (state.ordinal()) {
            case 1:
                return ON_CREATE;
            case 2:
                return ON_START;
            case 3:
                return ON_RESUME;
            default:
                return null;
        }
    }

    public i b() {
        switch (g.f1019b[ordinal()]) {
            case 1:
            case 2:
                return i.CREATED;
            case 3:
            case 4:
                return i.STARTED;
            case 5:
                return i.RESUMED;
            case 6:
                return i.DESTROYED;
            default:
                throw new IllegalArgumentException(this + " has no target state");
        }
    }
}
