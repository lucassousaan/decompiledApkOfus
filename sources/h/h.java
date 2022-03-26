package h;

import android.view.MenuItem;

/* JADX WARN: Classes with same name are omitted:
  
 */
/* loaded from: classes.dex */
public class h implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ j f2077b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ MenuItem f2078c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ q f2079d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ i f2080e;

    public h(i this$1, j jVar, MenuItem menuItem, q qVar) {
        this.f2080e = this$1;
        this.f2077b = jVar;
        this.f2078c = menuItem;
        this.f2079d = qVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        j jVar = this.f2077b;
        if (jVar != null) {
            this.f2080e.f2082b.B = true;
            jVar.f2084b.e(false);
            this.f2080e.f2082b.B = false;
        }
        if (this.f2078c.isEnabled() && this.f2078c.hasSubMenu()) {
            this.f2079d.L(this.f2078c, 4);
        }
    }
}
