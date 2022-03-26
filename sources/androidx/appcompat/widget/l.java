package androidx.appcompat.widget;

import android.view.View;
import h.g0;
import h.q;

/* JADX WARN: Classes with same name are omitted:
  
 */
/* loaded from: classes.dex */
public class l implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    public o f414b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ q f415c;

    public l(q qVar, o popup) {
        this.f415c = qVar;
        this.f414b = popup;
    }

    @Override // java.lang.Runnable
    public void run() {
        q qVar;
        g0 g0Var;
        q qVar2;
        qVar = this.f415c.f2067d;
        if (qVar != null) {
            qVar2 = this.f415c.f2067d;
            qVar2.d();
        }
        g0Var = this.f415c.f2072i;
        View menuView = (View) g0Var;
        if (!(menuView == null || menuView.getWindowToken() == null || !this.f414b.m())) {
            this.f415c.f493u = this.f414b;
        }
        this.f415c.f495w = null;
    }
}
