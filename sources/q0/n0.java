package q0;

import android.view.View;
import android.view.ViewGroup;

/* JADX WARN: Classes with same name are omitted:
  
 */
/* loaded from: classes.dex */
public final class n0 extends o0 {
    public n0(m1 layoutManager) {
        super(layoutManager, null);
    }

    @Override // q0.o0
    public int i() {
        return this.f3153a.W() - this.f3153a.d0();
    }

    @Override // q0.o0
    public int h() {
        return this.f3153a.W();
    }

    @Override // q0.o0
    public void r(int amount) {
        this.f3153a.D0(amount);
    }

    @Override // q0.o0
    public int m() {
        return this.f3153a.g0();
    }

    @Override // q0.o0
    public int e(View view) {
        n1 params = (n1) view.getLayoutParams();
        return this.f3153a.R(view) + ((ViewGroup.MarginLayoutParams) params).topMargin + ((ViewGroup.MarginLayoutParams) params).bottomMargin;
    }

    @Override // q0.o0
    public int f(View view) {
        n1 params = (n1) view.getLayoutParams();
        return this.f3153a.S(view) + ((ViewGroup.MarginLayoutParams) params).leftMargin + ((ViewGroup.MarginLayoutParams) params).rightMargin;
    }

    @Override // q0.o0
    public int d(View view) {
        n1 params = (n1) view.getLayoutParams();
        return this.f3153a.O(view) + ((ViewGroup.MarginLayoutParams) params).bottomMargin;
    }

    @Override // q0.o0
    public int g(View view) {
        n1 params = (n1) view.getLayoutParams();
        return this.f3153a.U(view) - ((ViewGroup.MarginLayoutParams) params).topMargin;
    }

    @Override // q0.o0
    public int p(View view) {
        this.f3153a.n0(view, true, this.f3155c);
        return this.f3155c.bottom;
    }

    @Override // q0.o0
    public int q(View view) {
        this.f3153a.n0(view, true, this.f3155c);
        return this.f3155c.top;
    }

    @Override // q0.o0
    public int n() {
        return (this.f3153a.W() - this.f3153a.g0()) - this.f3153a.d0();
    }

    @Override // q0.o0
    public int j() {
        return this.f3153a.d0();
    }

    @Override // q0.o0
    public int k() {
        return this.f3153a.X();
    }

    @Override // q0.o0
    public int l() {
        return this.f3153a.p0();
    }
}
