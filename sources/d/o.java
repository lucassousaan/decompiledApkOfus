package d;

import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.appcompat.widget.j4;
import androidx.fragment.app.j0;
import androidx.lifecycle.i0;
import androidx.savedstate.g;
import g.b;
import g.c;
import u.a;
import u.j;
import u.l;
import u.m;

/* JADX WARN: Classes with same name are omitted:
  
 */
/* loaded from: classes.dex */
public abstract class o extends j0 implements p, l {

    /* renamed from: n  reason: collision with root package name */
    public q f1710n;

    /* renamed from: o  reason: collision with root package name */
    public Resources f1711o;

    public o() {
        A();
    }

    public final void A() {
        b().d("androidx:appcompat", new m(this));
        k(new n(this));
    }

    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(Context newBase) {
        super.attachBaseContext(x().f(newBase));
    }

    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public void setTheme(int resId) {
        super.setTheme(resId);
        x().D(resId);
    }

    @Override // android.app.Activity
    public void onPostCreate(Bundle savedInstanceState) {
        super.onPostCreate(savedInstanceState);
        x().s(savedInstanceState);
    }

    public c y() {
        return x().m();
    }

    @Override // android.app.Activity
    public MenuInflater getMenuInflater() {
        return x().l();
    }

    @Override // android.app.Activity
    public void setContentView(int layoutResID) {
        m();
        x().A(layoutResID);
    }

    @Override // androidx.activity.e, android.app.Activity
    public void setContentView(View view) {
        m();
        x().B(view);
    }

    @Override // android.app.Activity
    public void setContentView(View view, ViewGroup.LayoutParams params) {
        m();
        x().C(view, params);
    }

    @Override // android.app.Activity
    public void addContentView(View view, ViewGroup.LayoutParams params) {
        m();
        x().d(view, params);
    }

    private void m() {
        i0.a(getWindow().getDecorView(), this);
        androidx.lifecycle.j0.a(getWindow().getDecorView(), this);
        g.a(getWindow().getDecorView(), this);
    }

    @Override // androidx.fragment.app.j0, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration newConfig) {
        super.onConfigurationChanged(newConfig);
        x().p(newConfig);
    }

    @Override // androidx.fragment.app.j0, android.app.Activity
    public void onPostResume() {
        super.onPostResume();
        x().t();
    }

    @Override // androidx.fragment.app.j0, android.app.Activity
    public void onStart() {
        super.onStart();
        x().v();
    }

    @Override // androidx.fragment.app.j0, android.app.Activity
    public void onStop() {
        super.onStop();
        x().w();
    }

    @Override // android.app.Activity
    public View findViewById(int id) {
        return x().i(id);
    }

    @Override // androidx.fragment.app.j0, android.app.Activity, android.view.Window.Callback
    public final boolean onMenuItemSelected(int featureId, MenuItem item) {
        if (super.onMenuItemSelected(featureId, item)) {
            return true;
        }
        c ab = y();
        if (item.getItemId() != 16908332 || ab == null || (ab.d() & 4) == 0) {
            return false;
        }
        return F();
    }

    @Override // androidx.fragment.app.j0, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        x().r();
    }

    @Override // android.app.Activity
    public void onTitleChanged(CharSequence title, int color) {
        super.onTitleChanged(title, color);
        x().E(title);
    }

    @Override // androidx.fragment.app.j0
    public void w() {
        x().o();
    }

    @Override // android.app.Activity
    public void invalidateOptionsMenu() {
        x().o();
    }

    @Override // d.p
    public void e(c mode) {
    }

    @Override // d.p
    public void h(c mode) {
    }

    @Override // d.p
    public c c(b callback) {
        return null;
    }

    public void B(m builder) {
        builder.b(this);
    }

    public void D() {
    }

    public boolean F() {
        Intent upIntent = z();
        if (upIntent == null) {
            return false;
        }
        if (I(upIntent)) {
            m b2 = m.d(this);
            B(b2);
            D();
            b2.e();
            try {
                a.d(this);
                return true;
            } catch (IllegalStateException e2) {
                finish();
                return true;
            }
        } else {
            H(upIntent);
            return true;
        }
    }

    public Intent z() {
        return j.a(this);
    }

    public boolean I(Intent targetIntent) {
        return j.f(this, targetIntent);
    }

    public void H(Intent upIntent) {
        j.e(this, upIntent);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onContentChanged() {
        E();
    }

    public void E() {
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onMenuOpened(int featureId, Menu menu) {
        return super.onMenuOpened(featureId, menu);
    }

    @Override // androidx.fragment.app.j0, android.app.Activity, android.view.Window.Callback
    public void onPanelClosed(int featureId, Menu menu) {
        super.onPanelClosed(featureId, menu);
    }

    public q x() {
        if (this.f1710n == null) {
            this.f1710n = q.g(this, this);
        }
        return this.f1710n;
    }

    @Override // u.i, android.app.Activity, android.view.Window.Callback
    public boolean dispatchKeyEvent(KeyEvent event) {
        int keyCode = event.getKeyCode();
        c actionBar = y();
        if (keyCode == 82 && actionBar != null) {
            actionBar.j();
        }
        return super.dispatchKeyEvent(event);
    }

    @Override // android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public Resources getResources() {
        if (this.f1711o == null) {
            j4.b();
        }
        Resources resources = this.f1711o;
        return resources == null ? super.getResources() : resources;
    }

    public final boolean G(KeyEvent event) {
        Window currentWindow;
        if (Build.VERSION.SDK_INT >= 26 || event.isCtrlPressed() || KeyEvent.metaStateHasNoModifiers(event.getMetaState()) || event.getRepeatCount() != 0 || KeyEvent.isModifierKey(event.getKeyCode()) || (currentWindow = getWindow()) == null || currentWindow.getDecorView() == null) {
            return false;
        }
        View decorView = currentWindow.getDecorView();
        if (decorView.dispatchKeyShortcutEvent(event)) {
            return true;
        }
        return false;
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        if (G(event)) {
            return true;
        }
        return super.onKeyDown(keyCode, event);
    }

    @Override // android.app.Activity
    public void openOptionsMenu() {
        c actionBar = y();
        if (getWindow().hasFeature(0)) {
            if (actionBar != null) {
                actionBar.k();
            }
            super.openOptionsMenu();
        }
    }

    @Override // android.app.Activity
    public void closeOptionsMenu() {
        c actionBar = y();
        if (getWindow().hasFeature(0)) {
            if (actionBar != null) {
                actionBar.a();
            }
            super.closeOptionsMenu();
        }
    }

    public void C() {
    }
}
