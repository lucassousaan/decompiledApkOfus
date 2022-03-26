package androidx.fragment.app;

import android.view.View;

/* JADX WARN: Classes with same name are omitted:
  
 */
/* loaded from: classes.dex */
public class a0 extends n0 {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ f0 f699a;

    public a0(f0 this$0) {
        this.f699a = this$0;
    }

    @Override // androidx.fragment.app.n0
    public View h(int id) {
        View view = this.f699a.H;
        if (view != null) {
            return view.findViewById(id);
        }
        throw new IllegalStateException("Fragment " + this.f699a + " does not have a view");
    }

    @Override // androidx.fragment.app.n0
    public boolean i() {
        return this.f699a.H != null;
    }
}
