package q0;

import android.view.View;

/* JADX WARN: Classes with same name are omitted:
  
 */
/* loaded from: classes.dex */
public abstract class i2 extends f1 {

    /* renamed from: g  reason: collision with root package name */
    public boolean f3076g = true;

    public abstract boolean w(e2 e2Var);

    public abstract boolean x(e2 e2Var, e2 e2Var2, int i2, int i3, int i4, int i5);

    public abstract boolean y(e2 e2Var, int i2, int i3, int i4, int i5);

    public abstract boolean z(e2 e2Var);

    @Override // q0.f1
    public boolean f(e2 viewHolder) {
        return !this.f3076g || viewHolder.t();
    }

    @Override // q0.f1
    public boolean c(e2 viewHolder, e1 preLayoutInfo, e1 postLayoutInfo) {
        int oldLeft = preLayoutInfo.f3015a;
        int oldTop = preLayoutInfo.f3016b;
        View disappearingItemView = viewHolder.f3018a;
        int newLeft = postLayoutInfo == null ? disappearingItemView.getLeft() : postLayoutInfo.f3015a;
        int newTop = postLayoutInfo == null ? disappearingItemView.getTop() : postLayoutInfo.f3016b;
        if (viewHolder.v() || (oldLeft == newLeft && oldTop == newTop)) {
            z(viewHolder);
            return true;
        }
        disappearingItemView.layout(newLeft, newTop, disappearingItemView.getWidth() + newLeft, disappearingItemView.getHeight() + newTop);
        return y(viewHolder, oldLeft, oldTop, newLeft, newTop);
    }

    @Override // q0.f1
    public boolean a(e2 viewHolder, e1 preLayoutInfo, e1 postLayoutInfo) {
        int i2;
        int i3;
        if (preLayoutInfo != null && ((i2 = preLayoutInfo.f3015a) != (i3 = postLayoutInfo.f3015a) || preLayoutInfo.f3016b != postLayoutInfo.f3016b)) {
            return y(viewHolder, i2, preLayoutInfo.f3016b, i3, postLayoutInfo.f3016b);
        }
        w(viewHolder);
        return true;
    }

    @Override // q0.f1
    public boolean d(e2 viewHolder, e1 preInfo, e1 postInfo) {
        int i2 = preInfo.f3015a;
        int i3 = postInfo.f3015a;
        if (i2 != i3 || preInfo.f3016b != postInfo.f3016b) {
            return y(viewHolder, i2, preInfo.f3016b, i3, postInfo.f3016b);
        }
        E(viewHolder);
        return false;
    }

    @Override // q0.f1
    public boolean b(e2 oldHolder, e2 newHolder, e1 preInfo, e1 postInfo) {
        int toTop;
        int toLeft;
        int fromLeft = preInfo.f3015a;
        int fromTop = preInfo.f3016b;
        if (newHolder.J()) {
            int toLeft2 = preInfo.f3015a;
            toLeft = toLeft2;
            toTop = preInfo.f3016b;
        } else {
            int toLeft3 = postInfo.f3015a;
            toLeft = toLeft3;
            toTop = postInfo.f3016b;
        }
        return x(oldHolder, newHolder, fromLeft, fromTop, toLeft, toTop);
    }

    public final void G(e2 item) {
        O();
        h(item);
    }

    public final void E(e2 item) {
        M();
        h(item);
    }

    public final void A(e2 item) {
        I();
        h(item);
    }

    public final void C(e2 item, boolean oldItem) {
        K();
        h(item);
    }

    public final void H(e2 item) {
        P();
    }

    public final void F(e2 item) {
        N();
    }

    public final void B(e2 item) {
        J();
    }

    public final void D(e2 item, boolean oldItem) {
        L();
    }

    public void P() {
    }

    public void O() {
    }

    public void J() {
    }

    public void I() {
    }

    public void N() {
    }

    public void M() {
    }

    public void L() {
    }

    public void K() {
    }
}
