package androidx.fragment.app;

import k.b;

/* JADX WARN: Classes with same name are omitted:
  
 */
/* loaded from: classes.dex */
public class j implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ s2 f803b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ s2 f804c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ boolean f805d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ b f806e;

    public j(q this$0, s2 s2Var, s2 s2Var2, boolean z2, b bVar) {
        this.f803b = s2Var;
        this.f804c = s2Var2;
        this.f805d = z2;
        this.f806e = bVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        b2.a(this.f803b.f(), this.f804c.f(), this.f805d, this.f806e, false);
    }
}
