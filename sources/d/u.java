package d;

import android.view.View;
import f0.j1;

/* JADX WARN: Classes with same name are omitted:
  
 */
/* loaded from: classes.dex */
public class u extends j1 {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ v f1742a;

    public u(v this$1) {
        this.f1742a = this$1;
    }

    @Override // f0.j1, f0.i1
    public void b(View view) {
        this.f1742a.f1745b.f1700q.setVisibility(0);
    }

    @Override // f0.i1
    public void a(View view) {
        this.f1742a.f1745b.f1700q.setAlpha(1.0f);
        this.f1742a.f1745b.f1703t.f(null);
        this.f1742a.f1745b.f1703t = null;
    }
}
