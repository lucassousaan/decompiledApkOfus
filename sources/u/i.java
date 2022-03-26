package u;

import android.app.Activity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import androidx.lifecycle.a0;
import androidx.lifecycle.m;
import androidx.lifecycle.o;
import f0.p;
import f0.q;
import k.n;

/* JADX WARN: Classes with same name are omitted:
  
 */
/* loaded from: classes.dex */
public abstract class i extends Activity implements m, p {

    /* renamed from: b  reason: collision with root package name */
    public o f3577b = new o(this);

    public i() {
        new n();
    }

    @Override // android.app.Activity
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        a0.f(this);
    }

    @Override // android.app.Activity
    public void onSaveInstanceState(Bundle outState) {
        this.f3577b.j(androidx.lifecycle.i.CREATED);
        super.onSaveInstanceState(outState);
    }

    @Override // f0.p
    public boolean i(KeyEvent event) {
        return super.dispatchKeyEvent(event);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean dispatchKeyShortcutEvent(KeyEvent event) {
        View decor = getWindow().getDecorView();
        if (decor == null || !q.d(decor, event)) {
            return super.dispatchKeyShortcutEvent(event);
        }
        return true;
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean dispatchKeyEvent(KeyEvent event) {
        View decor = getWindow().getDecorView();
        if (decor == null || !q.d(decor, event)) {
            return q.e(this, decor, this, event);
        }
        return true;
    }
}
