package androidx.appcompat.widget;

/* JADX WARN: Classes with same name are omitted:
  
 */
/* loaded from: classes.dex */
public class u1 implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ v1 f544b;

    public u1(v1 v1Var) {
        this.f544b = v1Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        v1 v1Var = this.f544b;
        v1Var.f564o = null;
        v1Var.drawableStateChanged();
    }

    public void a() {
        v1 v1Var = this.f544b;
        v1Var.f564o = null;
        v1Var.removeCallbacks(this);
    }

    public void b() {
        this.f544b.post(this);
    }
}
