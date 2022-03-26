package i;

/* JADX WARN: Classes with same name are omitted:
  
 */
/* loaded from: classes.dex */
public class c extends f {

    /* renamed from: c  reason: collision with root package name */
    public static volatile c f2219c;

    /* renamed from: a  reason: collision with root package name */
    public f f2220a;

    /* renamed from: b  reason: collision with root package name */
    public f f2221b;

    static {
        new a();
        new b();
    }

    public c() {
        e eVar = new e();
        this.f2221b = eVar;
        this.f2220a = eVar;
    }

    public static c d() {
        if (f2219c != null) {
            return f2219c;
        }
        synchronized (c.class) {
            if (f2219c == null) {
                f2219c = new c();
            }
        }
        return f2219c;
    }

    @Override // i.f
    public void a(Runnable runnable) {
        this.f2220a.a(runnable);
    }

    @Override // i.f
    public void c(Runnable runnable) {
        this.f2220a.c(runnable);
    }

    @Override // i.f
    public boolean b() {
        return this.f2220a.b();
    }
}
