package androidx.fragment.app;

import android.util.Log;
import android.view.View;
import b0.c;

/* JADX WARN: Classes with same name are omitted:
  
 */
/* loaded from: classes.dex */
public class o2 extends s2 {

    /* renamed from: h  reason: collision with root package name */
    public final w1 f874h;

    public o2(r2 finalState, q2 lifecycleImpact, w1 fragmentStateManager, c cancellationSignal) {
        super(finalState, lifecycleImpact, fragmentStateManager.k(), cancellationSignal);
        this.f874h = fragmentStateManager;
    }

    @Override // androidx.fragment.app.s2
    public void l() {
        if (g() == q2.ADDING) {
            f0 fragment = this.f874h.k();
            View focusedView = fragment.H.findFocus();
            if (focusedView != null) {
                fragment.i1(focusedView);
                if (m1.v0(2)) {
                    Log.v("FragmentManager", "requestFocus: Saved focused view " + focusedView + " for Fragment " + fragment);
                }
            }
            View view = f().c1();
            if (view.getParent() == null) {
                this.f874h.b();
                view.setAlpha(0.0f);
            }
            if (view.getAlpha() == 0.0f && view.getVisibility() == 0) {
                view.setVisibility(4);
            }
            view.setAlpha(fragment.F());
        }
    }

    @Override // androidx.fragment.app.s2
    public void c() {
        super.c();
        this.f874h.m();
    }
}
