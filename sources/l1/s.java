package l1;

import a1.e;
import android.view.View;
import f0.a0;
import f0.x1;

/* JADX WARN: Classes with same name are omitted:
  
 */
/* loaded from: classes.dex */
public final class s implements a0 {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ u f2464a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ v f2465b;

    public s(u uVar, v vVar) {
        this.f2464a = uVar;
        this.f2465b = vVar;
    }

    @Override // f0.a0
    public x1 a(View view, x1 insets) {
        ((e) this.f2464a).a(view, insets, new v(this.f2465b));
        return insets;
    }
}
