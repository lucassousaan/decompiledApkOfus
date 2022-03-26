package androidx.appcompat.widget;

import android.view.View;
import h.i0;

/* JADX WARN: Classes with same name are omitted:
  
 */
/* loaded from: classes.dex */
public class t0 extends z1 {

    /* renamed from: k  reason: collision with root package name */
    public final /* synthetic */ a1 f538k;

    /* renamed from: l  reason: collision with root package name */
    public final /* synthetic */ e1 f539l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t0(e1 this$0, View src, a1 a1Var) {
        super(src);
        this.f539l = this$0;
        this.f538k = a1Var;
    }

    @Override // androidx.appcompat.widget.z1
    public i0 b() {
        return this.f538k;
    }

    @Override // androidx.appcompat.widget.z1
    public boolean c() {
        if (this.f539l.getInternalPopup().a()) {
            return true;
        }
        this.f539l.b();
        return true;
    }
}
