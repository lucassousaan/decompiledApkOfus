package q0;

import android.view.View;
import android.view.ViewGroup;

/* JADX WARN: Classes with same name are omitted:
  
 */
/* loaded from: classes.dex */
public class i1 implements v2 {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ m1 f3075a;

    public i1(m1 this$0) {
        this.f3075a = this$0;
    }

    @Override // q0.v2
    public View e(int index) {
        return this.f3075a.I(index);
    }

    @Override // q0.v2
    public int b() {
        return this.f3075a.e0();
    }

    @Override // q0.v2
    public int a() {
        return this.f3075a.o0() - this.f3075a.f0();
    }

    @Override // q0.v2
    public int d(View view) {
        n1 params = (n1) view.getLayoutParams();
        return this.f3075a.Q(view) - ((ViewGroup.MarginLayoutParams) params).leftMargin;
    }

    @Override // q0.v2
    public int c(View view) {
        n1 params = (n1) view.getLayoutParams();
        return this.f3075a.T(view) + ((ViewGroup.MarginLayoutParams) params).rightMargin;
    }
}
