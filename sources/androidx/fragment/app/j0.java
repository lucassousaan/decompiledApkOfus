package androidx.fragment.app;

import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import androidx.activity.e;
import androidx.lifecycle.h;
import androidx.lifecycle.i;
import androidx.lifecycle.o;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.Collection;
import java.util.Iterator;
import o0.a;

/* JADX WARN: Classes with same name are omitted:
  
 */
/* loaded from: classes.dex */
public abstract class j0 extends e {

    /* renamed from: k  reason: collision with root package name */
    public boolean f809k;

    /* renamed from: l  reason: collision with root package name */
    public boolean f810l;

    /* renamed from: i  reason: collision with root package name */
    public final p0 f807i = p0.b(new i0(this));

    /* renamed from: j  reason: collision with root package name */
    public final o f808j = new o(this);

    /* renamed from: m  reason: collision with root package name */
    public boolean f811m = true;

    public abstract void w();

    public j0() {
        q();
    }

    public final void q() {
        b().d("android:support:fragments", new g0(this));
        k(new h0(this));
    }

    @Override // androidx.activity.e, android.app.Activity
    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        this.f807i.u();
        super.onActivityResult(requestCode, resultCode, data);
    }

    @Override // android.app.Activity
    public void onMultiWindowModeChanged(boolean isInMultiWindowMode) {
        this.f807i.j(isInMultiWindowMode);
    }

    @Override // android.app.Activity
    public void onPictureInPictureModeChanged(boolean isInPictureInPictureMode) {
        this.f807i.n(isInPictureInPictureMode);
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration newConfig) {
        super.onConfigurationChanged(newConfig);
        this.f807i.u();
        this.f807i.d(newConfig);
    }

    @Override // androidx.activity.e, u.i, android.app.Activity
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.f808j.h(h.ON_CREATE);
        this.f807i.f();
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onCreatePanelMenu(int featureId, Menu menu) {
        if (featureId == 0) {
            boolean show = super.onCreatePanelMenu(featureId, menu);
            return show | this.f807i.g(menu, getMenuInflater());
        }
        boolean show2 = super.onCreatePanelMenu(featureId, menu);
        return show2;
    }

    @Override // android.app.Activity, android.view.LayoutInflater.Factory2
    public View onCreateView(View parent, String name, Context context, AttributeSet attrs) {
        View v2 = o(parent, name, context, attrs);
        if (v2 == null) {
            return super.onCreateView(parent, name, context, attrs);
        }
        return v2;
    }

    @Override // android.app.Activity, android.view.LayoutInflater.Factory
    public View onCreateView(String name, Context context, AttributeSet attrs) {
        View v2 = o(null, name, context, attrs);
        if (v2 == null) {
            return super.onCreateView(name, context, attrs);
        }
        return v2;
    }

    public final View o(View parent, String name, Context context, AttributeSet attrs) {
        return this.f807i.v(parent, name, context, attrs);
    }

    @Override // android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        this.f807i.h();
        this.f808j.h(h.ON_DESTROY);
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public void onLowMemory() {
        super.onLowMemory();
        this.f807i.i();
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onMenuItemSelected(int featureId, MenuItem item) {
        if (super.onMenuItemSelected(featureId, item)) {
            return true;
        }
        switch (featureId) {
            case 0:
                return this.f807i.k(item);
            case 6:
                return this.f807i.e(item);
            default:
                return false;
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onPanelClosed(int featureId, Menu menu) {
        if (featureId == 0) {
            this.f807i.l(menu);
        }
        super.onPanelClosed(featureId, menu);
    }

    @Override // android.app.Activity
    public void onPause() {
        super.onPause();
        this.f810l = false;
        this.f807i.m();
        this.f808j.h(h.ON_PAUSE);
    }

    @Override // android.app.Activity
    public void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        this.f807i.u();
    }

    @Override // android.app.Activity
    public void onStateNotSaved() {
        this.f807i.u();
    }

    @Override // android.app.Activity
    public void onResume() {
        super.onResume();
        this.f810l = true;
        this.f807i.u();
        this.f807i.s();
    }

    @Override // android.app.Activity
    public void onPostResume() {
        super.onPostResume();
        v();
    }

    public void v() {
        this.f808j.h(h.ON_RESUME);
        this.f807i.p();
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onPreparePanel(int featureId, View view, Menu menu) {
        if (featureId == 0) {
            boolean goforit = u(view, menu);
            return goforit | this.f807i.o(menu);
        }
        boolean goforit2 = super.onPreparePanel(featureId, view, menu);
        return goforit2;
    }

    public boolean u(View view, Menu menu) {
        return super.onPreparePanel(0, view, menu);
    }

    @Override // android.app.Activity
    public void onStart() {
        super.onStart();
        this.f811m = false;
        if (!this.f809k) {
            this.f809k = true;
            this.f807i.c();
        }
        this.f807i.u();
        this.f807i.s();
        this.f808j.h(h.ON_START);
        this.f807i.q();
    }

    @Override // android.app.Activity
    public void onStop() {
        super.onStop();
        this.f811m = true;
        r();
        this.f807i.r();
        this.f808j.h(h.ON_STOP);
    }

    @Override // android.app.Activity
    public void dump(String prefix, FileDescriptor fd, PrintWriter writer, String[] args) {
        super.dump(prefix, fd, writer, args);
        writer.print(prefix);
        writer.print("Local FragmentActivity ");
        writer.print(Integer.toHexString(System.identityHashCode(this)));
        writer.println(" State:");
        String innerPrefix = prefix + "  ";
        writer.print(innerPrefix);
        writer.print("mCreated=");
        writer.print(this.f809k);
        writer.print(" mResumed=");
        writer.print(this.f810l);
        writer.print(" mStopped=");
        writer.print(this.f811m);
        if (getApplication() != null) {
            a.b(this).a(innerPrefix, fd, writer, args);
        }
        this.f807i.t().O(prefix, fd, writer, args);
    }

    public void t() {
    }

    public m1 p() {
        return this.f807i.t();
    }

    @Override // androidx.activity.e, android.app.Activity
    public void onRequestPermissionsResult(int requestCode, String[] permissions, int[] grantResults) {
        this.f807i.u();
        super.onRequestPermissionsResult(requestCode, permissions, grantResults);
    }

    public void r() {
        boolean reiterate;
        do {
            reiterate = s(p(), i.CREATED);
        } while (reiterate);
    }

    public static boolean s(m1 manager, i state) {
        boolean hadNotMarked = false;
        Collection<Fragment> fragments = manager.i0();
        Iterator<Fragment> it = fragments.iterator();
        while (it.hasNext()) {
            f0 fragment = (f0) it.next();
            if (fragment != null) {
                if (fragment.x() != null) {
                    m1 childFragmentManager = fragment.o();
                    hadNotMarked |= s(childFragmentManager, state);
                }
                k2 k2Var = fragment.Q;
                if (k2Var != null && k2Var.g().b().a(i.STARTED)) {
                    fragment.Q.j(state);
                    hadNotMarked = true;
                }
                if (fragment.P.b().a(i.STARTED)) {
                    fragment.P.o(state);
                    hadNotMarked = true;
                }
            }
        }
        return hadNotMarked;
    }
}
