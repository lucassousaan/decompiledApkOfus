package androidx.fragment.app;

import android.view.View;

/* JADX WARN: Classes with same name are omitted:
  
 */
/* loaded from: classes.dex */
public class v extends n0 {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ n0 f942a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ w f943b;

    public v(w this$0, n0 n0Var) {
        this.f943b = this$0;
        this.f942a = n0Var;
    }

    @Override // androidx.fragment.app.n0
    public View h(int id) {
        if (this.f942a.i()) {
            return this.f942a.h(id);
        }
        return this.f943b.w1(id);
    }

    @Override // androidx.fragment.app.n0
    public boolean i() {
        return this.f942a.i() || this.f943b.x1();
    }
}
