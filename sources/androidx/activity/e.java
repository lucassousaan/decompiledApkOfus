package androidx.activity;

import a.a;
import a.b;
import android.annotation.SuppressLint;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import androidx.activity.result.h;
import androidx.lifecycle.a0;
import androidx.lifecycle.g0;
import androidx.lifecycle.h0;
import androidx.lifecycle.i0;
import androidx.lifecycle.j;
import androidx.lifecycle.j0;
import androidx.lifecycle.k;
import androidx.lifecycle.m;
import androidx.lifecycle.o;
import androidx.savedstate.d;
import androidx.savedstate.f;
import androidx.savedstate.g;
import java.util.concurrent.atomic.AtomicInteger;
import u.i;

/* JADX WARN: Classes with same name are omitted:
  
 */
/* loaded from: classes.dex */
public abstract class e extends i implements h0, f, i, androidx.activity.result.i {

    /* renamed from: f  reason: collision with root package name */
    public g0 f39f;

    /* renamed from: c  reason: collision with root package name */
    public final a f36c = new a();

    /* renamed from: d  reason: collision with root package name */
    public final o f37d = new o(this);

    /* renamed from: e  reason: collision with root package name */
    public final androidx.savedstate.e f38e = androidx.savedstate.e.a(this);

    /* renamed from: g  reason: collision with root package name */
    public final h f40g = new h(new b(this));

    /* renamed from: h  reason: collision with root package name */
    public final h f41h = new c(this);

    public e() {
        new AtomicInteger();
        j lifecycle = g();
        if (lifecycle != null) {
            g().a(new k() { // from class: androidx.activity.ComponentActivity$3
                @Override // androidx.lifecycle.k
                public void g(m source, androidx.lifecycle.h event) {
                    if (event == androidx.lifecycle.h.ON_STOP) {
                        Window window = e.this.getWindow();
                        View decor = window != null ? window.peekDecorView() : null;
                        if (decor != null) {
                            decor.cancelPendingInputEvents();
                        }
                    }
                }
            });
            g().a(new k() { // from class: androidx.activity.ComponentActivity$4
                @Override // androidx.lifecycle.k
                public void g(m source, androidx.lifecycle.h event) {
                    if (event == androidx.lifecycle.h.ON_DESTROY) {
                        e.this.f36c.b();
                        if (!e.this.isChangingConfigurations()) {
                            e.this.d().a();
                        }
                    }
                }
            });
            g().a(new k() { // from class: androidx.activity.ComponentActivity$5
                @Override // androidx.lifecycle.k
                public void g(m source, androidx.lifecycle.h event) {
                    e.this.l();
                    e.this.g().c(this);
                }
            });
            return;
        }
        throw new IllegalStateException("getLifecycle() returned null in ComponentActivity's constructor. Please make sure you are lazily constructing your Lifecycle in the first call to getLifecycle() rather than relying on field initialization.");
    }

    @Override // u.i, android.app.Activity
    public void onCreate(Bundle savedInstanceState) {
        this.f38e.c(savedInstanceState);
        this.f36c.c(this);
        super.onCreate(savedInstanceState);
        this.f41h.e(savedInstanceState);
        a0.f(this);
    }

    @Override // u.i, android.app.Activity
    public void onSaveInstanceState(Bundle outState) {
        j lifecycle = g();
        if (lifecycle instanceof o) {
            ((o) lifecycle).o(androidx.lifecycle.i.CREATED);
        }
        super.onSaveInstanceState(outState);
        this.f38e.d(outState);
        this.f41h.f(outState);
    }

    @Override // android.app.Activity
    public final Object onRetainNonConfigurationInstance() {
        d nc;
        n();
        g0 viewModelStore = this.f39f;
        if (viewModelStore == null && (nc = (d) getLastNonConfigurationInstance()) != null) {
            viewModelStore = nc.f35a;
        }
        if (viewModelStore == null && 0 == 0) {
            return null;
        }
        d nci = new d();
        nci.f35a = viewModelStore;
        return nci;
    }

    public Object n() {
        return null;
    }

    @Override // android.app.Activity
    public void setContentView(@SuppressLint({"UnknownNullness", "MissingNullability"}) View view) {
        m();
        super.setContentView(view);
    }

    public final void m() {
        i0.a(getWindow().getDecorView(), this);
        j0.a(getWindow().getDecorView(), this);
        g.a(getWindow().getDecorView(), this);
    }

    public final void k(b listener) {
        this.f36c.a(listener);
    }

    @Override // androidx.lifecycle.m
    public j g() {
        return this.f37d;
    }

    @Override // androidx.lifecycle.h0
    public g0 d() {
        if (getApplication() != null) {
            l();
            return this.f39f;
        }
        throw new IllegalStateException("Your activity is not yet attached to the Application instance. You can't request ViewModel before onCreate call.");
    }

    public void l() {
        if (this.f39f == null) {
            d nc = (d) getLastNonConfigurationInstance();
            if (nc != null) {
                this.f39f = nc.f35a;
            }
            if (this.f39f == null) {
                this.f39f = new g0();
            }
        }
    }

    @Override // android.app.Activity
    public void onBackPressed() {
        this.f40g.c();
    }

    @Override // androidx.activity.i
    public final h a() {
        return this.f40g;
    }

    @Override // androidx.savedstate.f
    public final d b() {
        return this.f38e.b();
    }

    @Override // android.app.Activity
    public void startActivityForResult(Intent intent, int requestCode) {
        super.startActivityForResult(intent, requestCode);
    }

    @Override // android.app.Activity
    public void startActivityForResult(Intent intent, int requestCode, Bundle options) {
        super.startActivityForResult(intent, requestCode, options);
    }

    @Override // android.app.Activity
    public void startIntentSenderForResult(IntentSender intent, int requestCode, Intent fillInIntent, int flagsMask, int flagsValues, int extraFlags) {
        super.startIntentSenderForResult(intent, requestCode, fillInIntent, flagsMask, flagsValues, extraFlags);
    }

    @Override // android.app.Activity
    public void startIntentSenderForResult(IntentSender intent, int requestCode, Intent fillInIntent, int flagsMask, int flagsValues, int extraFlags, Bundle options) {
        super.startIntentSenderForResult(intent, requestCode, fillInIntent, flagsMask, flagsValues, extraFlags, options);
    }

    @Override // android.app.Activity
    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        if (!this.f41h.b(requestCode, resultCode, data)) {
            super.onActivityResult(requestCode, resultCode, data);
        }
    }

    @Override // android.app.Activity
    public void onRequestPermissionsResult(int requestCode, String[] permissions, int[] grantResults) {
        if (!this.f41h.b(requestCode, -1, new Intent().putExtra("androidx.activity.result.contract.extra.PERMISSIONS", permissions).putExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS", grantResults))) {
            super.onRequestPermissionsResult(requestCode, permissions, grantResults);
        }
    }

    @Override // androidx.activity.result.i
    public final h f() {
        return this.f41h;
    }

    @Override // android.app.Activity
    public void reportFullyDrawn() {
        try {
            if (r0.a.d()) {
                r0.a.a("reportFullyDrawn() for " + getComponentName());
            }
            super.reportFullyDrawn();
        } finally {
            r0.a.b();
        }
    }
}
