package q0;

import android.os.Bundle;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import androidx.recyclerview.widget.RecyclerView;
import f0.b;
import g0.f;

/* JADX WARN: Classes with same name are omitted:
  
 */
/* loaded from: classes.dex */
public class g2 extends b {

    /* renamed from: d  reason: collision with root package name */
    public final RecyclerView f3066d;

    /* renamed from: e  reason: collision with root package name */
    public final f2 f3067e;

    public g2(RecyclerView recyclerView) {
        this.f3066d = recyclerView;
        b itemDelegate = n();
        if (itemDelegate == null || !(itemDelegate instanceof f2)) {
            this.f3067e = new f2(this);
        } else {
            this.f3067e = (f2) itemDelegate;
        }
    }

    public boolean o() {
        return this.f3066d.l0();
    }

    @Override // f0.b
    public boolean j(View host, int action, Bundle args) {
        if (super.j(host, action, args)) {
            return true;
        }
        if (o() || this.f3066d.getLayoutManager() == null) {
            return false;
        }
        return this.f3066d.getLayoutManager().h1(action, args);
    }

    @Override // f0.b
    public void g(View host, f info) {
        super.g(host, info);
        if (!o() && this.f3066d.getLayoutManager() != null) {
            this.f3066d.getLayoutManager().M0(info);
        }
    }

    @Override // f0.b
    public void f(View host, AccessibilityEvent event) {
        super.f(host, event);
        if ((host instanceof RecyclerView) && !o()) {
            RecyclerView rv = (RecyclerView) host;
            if (rv.getLayoutManager() != null) {
                rv.getLayoutManager().K0(event);
            }
        }
    }

    public b n() {
        return this.f3067e;
    }
}
