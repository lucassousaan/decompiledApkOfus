package androidx.fragment.app;

/* JADX WARN: Classes with same name are omitted:
  
 */
/* loaded from: classes.dex */
public class n2 implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ o2 f866b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ t2 f867c;

    public n2(t2 this$0, o2 o2Var) {
        this.f867c = this$0;
        this.f866b = o2Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f867c.f924b.remove(this.f866b);
        this.f867c.f925c.remove(this.f866b);
    }
}
