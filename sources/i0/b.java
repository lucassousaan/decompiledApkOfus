package i0;

import f0.c1;

/* JADX WARN: Classes with same name are omitted:
  
 */
/* loaded from: classes.dex */
public class b implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ c f2237b;

    public b(c cVar) {
        this.f2237b = cVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        c cVar = this.f2237b;
        if (cVar.f2253p) {
            if (cVar.f2251n) {
                cVar.f2251n = false;
                cVar.f2239b.m();
            }
            a scroller = this.f2237b.f2239b;
            if (scroller.h() || !this.f2237b.u()) {
                this.f2237b.f2253p = false;
                return;
            }
            c cVar2 = this.f2237b;
            if (cVar2.f2252o) {
                cVar2.f2252o = false;
                cVar2.c();
            }
            scroller.a();
            int deltaX = scroller.b();
            int deltaY = scroller.c();
            this.f2237b.j(deltaX, deltaY);
            c1.d0(this.f2237b.f2241d, this);
        }
    }
}
