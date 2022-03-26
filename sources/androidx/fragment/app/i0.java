package androidx.fragment.app;

import android.view.LayoutInflater;
import android.view.View;
import android.view.Window;
import androidx.activity.h;
import androidx.activity.i;
import androidx.lifecycle.g0;
import androidx.lifecycle.h0;
import androidx.lifecycle.j;

/* JADX WARN: Classes with same name are omitted:
  
 */
/* loaded from: classes.dex */
public class i0 extends r0 implements h0, i, androidx.activity.result.i, s1 {

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ j0 f795f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i0(j0 this$0) {
        super(this$0);
        this.f795f = this$0;
    }

    @Override // androidx.lifecycle.m
    public j g() {
        return this.f795f.f808j;
    }

    @Override // androidx.lifecycle.h0
    public g0 d() {
        return this.f795f.d();
    }

    @Override // androidx.activity.i
    public h a() {
        return this.f795f.a();
    }

    @Override // androidx.fragment.app.r0
    public LayoutInflater n() {
        return this.f795f.getLayoutInflater().cloneInContext(this.f795f);
    }

    /* renamed from: p */
    public j0 m() {
        return this.f795f;
    }

    @Override // androidx.fragment.app.r0
    public void o() {
        this.f795f.w();
    }

    @Override // androidx.fragment.app.s1
    public void c(m1 fragmentManager, f0 fragment) {
        this.f795f.t();
    }

    @Override // androidx.fragment.app.n0
    public View h(int id) {
        return this.f795f.findViewById(id);
    }

    @Override // androidx.fragment.app.n0
    public boolean i() {
        Window w2 = this.f795f.getWindow();
        return (w2 == null || w2.peekDecorView() == null) ? false : true;
    }

    @Override // androidx.activity.result.i
    public androidx.activity.result.h f() {
        return this.f795f.f();
    }
}
