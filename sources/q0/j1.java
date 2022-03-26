package q0;

import android.view.View;
import android.view.ViewGroup;

/* JADX WARN: Classes with same name are omitted:
  
 */
/* loaded from: classes.dex */
public class j1 implements v2 {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ m1 f3089a;

    public j1(m1 this$0) {
        this.f3089a = this$0;
    }

    @Override // q0.v2
    public View e(int index) {
        return this.f3089a.I(index);
    }

    @Override // q0.v2
    public int b() {
        return this.f3089a.g0();
    }

    @Override // q0.v2
    public int a() {
        return this.f3089a.W() - this.f3089a.d0();
    }

    @Override // q0.v2
    public int d(View view) {
        n1 params = (n1) view.getLayoutParams();
        return this.f3089a.U(view) - ((ViewGroup.MarginLayoutParams) params).topMargin;
    }

    @Override // q0.v2
    public int c(View view) {
        n1 params = (n1) view.getLayoutParams();
        return this.f3089a.O(view) + ((ViewGroup.MarginLayoutParams) params).bottomMargin;
    }
}
