package androidx.fragment.app;

import android.content.Context;
import android.content.res.Configuration;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.lifecycle.h0;
import e0.h;

/* JADX WARN: Classes with same name are omitted:
  
 */
/* loaded from: classes.dex */
public class p0 {

    /* renamed from: a  reason: collision with root package name */
    public final r0 f878a;

    /* JADX WARN: Generic types in debug info not equals: androidx.fragment.app.r0 != androidx.fragment.app.FragmentHostCallback<?> */
    public static p0 b(r0 r0Var) {
        h.f(r0Var, "callbacks == null");
        return new p0(r0Var);
    }

    /* JADX WARN: Generic types in debug info not equals: androidx.fragment.app.r0 != androidx.fragment.app.FragmentHostCallback<?> */
    public p0(r0 r0Var) {
        this.f878a = r0Var;
    }

    public m1 t() {
        return this.f878a.f897e;
    }

    public void a(f0 parent) {
        r0 r0Var = this.f878a;
        r0Var.f897e.g(r0Var, r0Var, parent);
    }

    public View v(View parent, String name, Context context, AttributeSet attrs) {
        return ((t0) this.f878a.f897e.k0()).onCreateView(parent, name, context, attrs);
    }

    public void u() {
        this.f878a.f897e.C0();
    }

    public Parcelable x() {
        return this.f878a.f897e.O0();
    }

    public void w(Parcelable state) {
        r0 r0Var = this.f878a;
        if (r0Var instanceof h0) {
            r0Var.f897e.M0(state);
            return;
        }
        throw new IllegalStateException("Your FragmentHostCallback must implement ViewModelStoreOwner to call restoreSaveState(). Call restoreAllState()  if you're still using retainNestedNonConfig().");
    }

    public void f() {
        this.f878a.f897e.u();
    }

    public void c() {
        this.f878a.f897e.q();
    }

    public void q() {
        this.f878a.f897e.J();
    }

    public void p() {
        this.f878a.f897e.I();
    }

    public void m() {
        this.f878a.f897e.E();
    }

    public void r() {
        this.f878a.f897e.L();
    }

    public void h() {
        this.f878a.f897e.w();
    }

    public void j(boolean isInMultiWindowMode) {
        this.f878a.f897e.z(isInMultiWindowMode);
    }

    public void n(boolean isInPictureInPictureMode) {
        this.f878a.f897e.F(isInPictureInPictureMode);
    }

    public void d(Configuration newConfig) {
        this.f878a.f897e.s(newConfig);
    }

    public void i() {
        this.f878a.f897e.y();
    }

    public boolean g(Menu menu, MenuInflater inflater) {
        return this.f878a.f897e.v(menu, inflater);
    }

    public boolean o(Menu menu) {
        return this.f878a.f897e.G(menu);
    }

    public boolean k(MenuItem item) {
        return this.f878a.f897e.B(item);
    }

    public boolean e(MenuItem item) {
        return this.f878a.f897e.t(item);
    }

    public void l(Menu menu) {
        this.f878a.f897e.C(menu);
    }

    public boolean s() {
        return this.f878a.f897e.S(true);
    }
}
