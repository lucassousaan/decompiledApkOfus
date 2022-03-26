package d;

import android.view.View;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import f0.c1;
import f0.j1;

/* JADX WARN: Classes with same name are omitted:
  
 */
/* loaded from: classes.dex */
public class w0 extends j1 {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ a1 f1751a;

    public w0(a1 this$0) {
        this.f1751a = this$0;
    }

    @Override // f0.i1
    public void a(View view) {
        View view2;
        a1 a1Var = this.f1751a;
        if (a1Var.f1596p && (view2 = a1Var.f1587g) != null) {
            view2.setTranslationY(0.0f);
            this.f1751a.f1584d.setTranslationY(0.0f);
        }
        this.f1751a.f1584d.setVisibility(8);
        this.f1751a.f1584d.setTransitioning(false);
        a1 a1Var2 = this.f1751a;
        a1Var2.f1600t = null;
        a1Var2.r();
        ActionBarOverlayLayout actionBarOverlayLayout = this.f1751a.f1583c;
        if (actionBarOverlayLayout != null) {
            c1.i0(actionBarOverlayLayout);
        }
    }
}
