package androidx.appcompat.widget;

import android.view.MenuItem;
import h.o;
import h.q;

/* JADX WARN: Classes with same name are omitted:
  
 */
/* loaded from: classes.dex */
public class u implements o {

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ ActionMenuView f542b;

    public u(ActionMenuView actionMenuView) {
        this.f542b = actionMenuView;
    }

    @Override // h.o
    public boolean b(q menu, MenuItem item) {
        v vVar = this.f542b.B;
        return vVar != null && ((t3) vVar).a(item);
    }

    @Override // h.o
    public void a(q menu) {
        o oVar = this.f542b.f147w;
        if (oVar != null) {
            oVar.a(menu);
        }
    }
}
