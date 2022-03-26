package androidx.fragment.app;

import android.os.Bundle;
import androidx.lifecycle.g0;
import androidx.lifecycle.h;
import androidx.lifecycle.h0;
import androidx.lifecycle.i;
import androidx.lifecycle.j;
import androidx.lifecycle.o;
import androidx.savedstate.d;
import androidx.savedstate.e;
import androidx.savedstate.f;

/* JADX WARN: Classes with same name are omitted:
  
 */
/* loaded from: classes.dex */
public class k2 implements f, h0 {

    /* renamed from: b  reason: collision with root package name */
    public final g0 f821b;

    /* renamed from: c  reason: collision with root package name */
    public o f822c = null;

    /* renamed from: d  reason: collision with root package name */
    public e f823d = null;

    public k2(f0 fragment, g0 viewModelStore) {
        this.f821b = viewModelStore;
    }

    @Override // androidx.lifecycle.h0
    public g0 d() {
        e();
        return this.f821b;
    }

    public void e() {
        if (this.f822c == null) {
            this.f822c = new o(this);
            this.f823d = e.a(this);
        }
    }

    public boolean f() {
        return this.f822c != null;
    }

    @Override // androidx.lifecycle.m
    public j g() {
        e();
        return this.f822c;
    }

    public void j(i state) {
        this.f822c.o(state);
    }

    public void c(h event) {
        this.f822c.h(event);
    }

    @Override // androidx.savedstate.f
    public d b() {
        e();
        return this.f823d.b();
    }

    public void h(Bundle savedState) {
        this.f823d.c(savedState);
    }

    public void i(Bundle outBundle) {
        this.f823d.d(outBundle);
    }
}
