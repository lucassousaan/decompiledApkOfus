package androidx.appcompat.widget;

import android.view.View;
import h.i0;

/* JADX WARN: Classes with same name are omitted:
  
 */
/* loaded from: classes.dex */
public class m extends z1 {

    /* renamed from: k  reason: collision with root package name */
    public final /* synthetic */ n f430k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(n this$1, View src, q qVar) {
        super(src);
        this.f430k = this$1;
    }

    @Override // androidx.appcompat.widget.z1
    public i0 b() {
        o oVar = this.f430k.f439d.f493u;
        if (oVar == null) {
            return null;
        }
        return oVar.c();
    }

    @Override // androidx.appcompat.widget.z1
    public boolean c() {
        this.f430k.f439d.K();
        return true;
    }

    @Override // androidx.appcompat.widget.z1
    public boolean d() {
        q qVar = this.f430k.f439d;
        if (qVar.f495w != null) {
            return false;
        }
        qVar.B();
        return true;
    }
}
