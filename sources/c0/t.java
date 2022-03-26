package c0;

import e0.a;

/* JADX WARN: Classes with same name are omitted:
  
 */
/* loaded from: classes.dex */
public class t implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ a f1232b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ Object f1233c;

    public t(u this$0, a aVar, Object obj) {
        this.f1232b = aVar;
        this.f1233c = obj;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f1232b.a(this.f1233c);
    }
}
