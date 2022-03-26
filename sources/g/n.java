package g;

import android.view.ActionMode;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.SearchEvent;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.view.accessibility.AccessibilityEvent;
import java.util.List;

/* JADX WARN: Classes with same name are omitted:
  
 */
/* loaded from: classes.dex */
public abstract class n implements Window.Callback {

    /* renamed from: b  reason: collision with root package name */
    public final Window.Callback f2003b;

    public n(Window.Callback wrapped) {
        if (wrapped != null) {
            this.f2003b = wrapped;
            return;
        }
        throw new IllegalArgumentException("Window callback may not be null");
    }

    @Override // android.view.Window.Callback
    public boolean dispatchKeyEvent(KeyEvent event) {
        return this.f2003b.dispatchKeyEvent(event);
    }

    @Override // android.view.Window.Callback
    public boolean dispatchKeyShortcutEvent(KeyEvent event) {
        return this.f2003b.dispatchKeyShortcutEvent(event);
    }

    @Override // android.view.Window.Callback
    public boolean dispatchTouchEvent(MotionEvent event) {
        return this.f2003b.dispatchTouchEvent(event);
    }

    @Override // android.view.Window.Callback
    public boolean dispatchTrackballEvent(MotionEvent event) {
        return this.f2003b.dispatchTrackballEvent(event);
    }

    @Override // android.view.Window.Callback
    public boolean dispatchGenericMotionEvent(MotionEvent event) {
        return this.f2003b.dispatchGenericMotionEvent(event);
    }

    @Override // android.view.Window.Callback
    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent event) {
        return this.f2003b.dispatchPopulateAccessibilityEvent(event);
    }

    @Override // android.view.Window.Callback
    public View onCreatePanelView(int featureId) {
        return this.f2003b.onCreatePanelView(featureId);
    }

    @Override // android.view.Window.Callback
    public boolean onCreatePanelMenu(int featureId, Menu menu) {
        return this.f2003b.onCreatePanelMenu(featureId, menu);
    }

    @Override // android.view.Window.Callback
    public boolean onPreparePanel(int featureId, View view, Menu menu) {
        return this.f2003b.onPreparePanel(featureId, view, menu);
    }

    @Override // android.view.Window.Callback
    public boolean onMenuOpened(int featureId, Menu menu) {
        return this.f2003b.onMenuOpened(featureId, menu);
    }

    @Override // android.view.Window.Callback
    public boolean onMenuItemSelected(int featureId, MenuItem item) {
        return this.f2003b.onMenuItemSelected(featureId, item);
    }

    @Override // android.view.Window.Callback
    public void onWindowAttributesChanged(WindowManager.LayoutParams attrs) {
        this.f2003b.onWindowAttributesChanged(attrs);
    }

    @Override // android.view.Window.Callback
    public void onWindowFocusChanged(boolean hasFocus) {
        this.f2003b.onWindowFocusChanged(hasFocus);
    }

    @Override // android.view.Window.Callback
    public void onAttachedToWindow() {
        this.f2003b.onAttachedToWindow();
    }

    @Override // android.view.Window.Callback
    public void onDetachedFromWindow() {
        this.f2003b.onDetachedFromWindow();
    }

    @Override // android.view.Window.Callback
    public void onPanelClosed(int featureId, Menu menu) {
        this.f2003b.onPanelClosed(featureId, menu);
    }

    @Override // android.view.Window.Callback
    public boolean onSearchRequested(SearchEvent searchEvent) {
        return this.f2003b.onSearchRequested(searchEvent);
    }

    @Override // android.view.Window.Callback
    public boolean onSearchRequested() {
        return this.f2003b.onSearchRequested();
    }

    @Override // android.view.Window.Callback
    public ActionMode onWindowStartingActionMode(ActionMode.Callback callback, int type) {
        return this.f2003b.onWindowStartingActionMode(callback, type);
    }

    @Override // android.view.Window.Callback
    public void onActionModeStarted(ActionMode mode) {
        this.f2003b.onActionModeStarted(mode);
    }

    @Override // android.view.Window.Callback
    public void onActionModeFinished(ActionMode mode) {
        this.f2003b.onActionModeFinished(mode);
    }

    @Override // android.view.Window.Callback
    public void onProvideKeyboardShortcuts(List list, Menu menu, int deviceId) {
        this.f2003b.onProvideKeyboardShortcuts(list, menu, deviceId);
    }

    @Override // android.view.Window.Callback
    public void onPointerCaptureChanged(boolean hasCapture) {
        this.f2003b.onPointerCaptureChanged(hasCapture);
    }

    public final Window.Callback a() {
        return this.f2003b;
    }
}
