package q0;

/* JADX WARN: Classes with same name are omitted:
  
 */
/* loaded from: classes.dex */
public class o {

    /* renamed from: a  reason: collision with root package name */
    public e2 f3147a;

    /* renamed from: b  reason: collision with root package name */
    public e2 f3148b;

    /* renamed from: c  reason: collision with root package name */
    public int f3149c;

    /* renamed from: d  reason: collision with root package name */
    public int f3150d;

    /* renamed from: e  reason: collision with root package name */
    public int f3151e;

    /* renamed from: f  reason: collision with root package name */
    public int f3152f;

    public o(e2 oldHolder, e2 newHolder) {
        this.f3147a = oldHolder;
        this.f3148b = newHolder;
    }

    public o(e2 oldHolder, e2 newHolder, int fromX, int fromY, int toX, int toY) {
        this(oldHolder, newHolder);
        this.f3149c = fromX;
        this.f3150d = fromY;
        this.f3151e = toX;
        this.f3152f = toY;
    }

    public String toString() {
        return "ChangeInfo{oldHolder=" + this.f3147a + ", newHolder=" + this.f3148b + ", fromX=" + this.f3149c + ", fromY=" + this.f3150d + ", toX=" + this.f3151e + ", toY=" + this.f3152f + '}';
    }
}
