package androidx.fragment.app;

/* JADX WARN: Classes with same name are omitted:
  
 */
/* loaded from: classes.dex */
public class m2 implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ o2 f861b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ t2 f862c;

    public m2(t2 this$0, o2 o2Var) {
        this.f862c = this$0;
        this.f861b = o2Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        if (this.f862c.f924b.contains(this.f861b)) {
            this.f861b.e().a(this.f861b.f().H);
        }
    }
}
