package d;

import android.view.View;
import android.widget.PopupWindow;
import f0.c1;
import f0.j1;

/* JADX WARN: Classes with same name are omitted:
  
 */
/* loaded from: classes.dex */
public class y extends j1 {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ z f1754a;

    public y(z this$1) {
        this.f1754a = this$1;
    }

    @Override // f0.i1
    public void a(View view) {
        this.f1754a.f1757b.f1700q.setVisibility(8);
        n0 n0Var = this.f1754a.f1757b;
        PopupWindow popupWindow = n0Var.f1701r;
        if (popupWindow != null) {
            popupWindow.dismiss();
        } else if (n0Var.f1700q.getParent() instanceof View) {
            c1.i0((View) this.f1754a.f1757b.f1700q.getParent());
        }
        this.f1754a.f1757b.f1700q.k();
        this.f1754a.f1757b.f1703t.f(null);
        n0 n0Var2 = this.f1754a.f1757b;
        n0Var2.f1703t = null;
        c1.i0(n0Var2.f1706w);
    }
}
