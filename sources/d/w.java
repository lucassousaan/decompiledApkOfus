package d;

import android.view.View;
import f0.c1;
import f0.j1;

/* JADX WARN: Classes with same name are omitted:
  
 */
/* loaded from: classes.dex */
public class w extends j1 {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ n0 f1750a;

    public w(n0 this$0) {
        this.f1750a = this$0;
    }

    @Override // f0.j1, f0.i1
    public void b(View view) {
        this.f1750a.f1700q.setVisibility(0);
        this.f1750a.f1700q.sendAccessibilityEvent(32);
        if (this.f1750a.f1700q.getParent() instanceof View) {
            c1.i0((View) this.f1750a.f1700q.getParent());
        }
    }

    @Override // f0.i1
    public void a(View view) {
        this.f1750a.f1700q.setAlpha(1.0f);
        this.f1750a.f1703t.f(null);
        this.f1750a.f1703t = null;
    }
}
