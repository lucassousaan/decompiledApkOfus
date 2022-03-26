package d;

import android.view.ActionMode;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.View;
import android.view.Window;
import g.c;
import g.g;
import g.n;
import h.q;
import java.util.List;

/* JADX WARN: Classes with same name are omitted:
  
 */
/* loaded from: classes.dex */
public class e0 extends n {

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ n0 f1607c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e0(n0 this$0, Window.Callback callback) {
        super(callback);
        this.f1607c = this$0;
    }

    @Override // g.n, android.view.Window.Callback
    public boolean dispatchKeyEvent(KeyEvent event) {
        return this.f1607c.T(event) || super.dispatchKeyEvent(event);
    }

    @Override // g.n, android.view.Window.Callback
    public boolean dispatchKeyShortcutEvent(KeyEvent event) {
        return super.dispatchKeyShortcutEvent(event) || this.f1607c.r0(event.getKeyCode(), event);
    }

    @Override // g.n, android.view.Window.Callback
    public boolean onCreatePanelMenu(int featureId, Menu menu) {
        if (featureId != 0 || (menu instanceof q)) {
            return super.onCreatePanelMenu(featureId, menu);
        }
        return false;
    }

    @Override // android.view.Window.Callback
    public void onContentChanged() {
    }

    @Override // g.n, android.view.Window.Callback
    public boolean onPreparePanel(int featureId, View view, Menu menu) {
        q mb = menu instanceof q ? (q) menu : null;
        if (featureId == 0 && mb == null) {
            return false;
        }
        if (mb != null) {
            mb.a0(true);
        }
        boolean handled = super.onPreparePanel(featureId, view, menu);
        if (mb != null) {
            mb.a0(false);
        }
        return handled;
    }

    @Override // g.n, android.view.Window.Callback
    public boolean onMenuOpened(int featureId, Menu menu) {
        super.onMenuOpened(featureId, menu);
        this.f1607c.u0(featureId);
        return true;
    }

    @Override // g.n, android.view.Window.Callback
    public void onPanelClosed(int featureId, Menu menu) {
        super.onPanelClosed(featureId, menu);
        this.f1607c.v0(featureId);
    }

    @Override // android.view.Window.Callback
    public ActionMode onWindowStartingActionMode(ActionMode.Callback callback) {
        return null;
    }

    public final ActionMode b(ActionMode.Callback callback) {
        g callbackWrapper = new g(this.f1607c.f1689f, callback);
        c supportActionMode = this.f1607c.E0(callbackWrapper);
        if (supportActionMode != null) {
            return callbackWrapper.e(supportActionMode);
        }
        return null;
    }

    @Override // g.n, android.view.Window.Callback
    public ActionMode onWindowStartingActionMode(ActionMode.Callback callback, int type) {
        if (this.f1607c.m0()) {
            switch (type) {
                case 0:
                    return b(callback);
            }
        }
        return super.onWindowStartingActionMode(callback, type);
    }

    @Override // g.n, android.view.Window.Callback
    public void onProvideKeyboardShortcuts(List list, Menu menu, int deviceId) {
        l0 panel = this.f1607c.d0(0);
        q qVar = panel.f1669h;
        if (qVar != null) {
            super.onProvideKeyboardShortcuts(list, qVar, deviceId);
        } else {
            super.onProvideKeyboardShortcuts(list, menu, deviceId);
        }
    }
}
