package d;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import com.example.helloworld.R;
import f0.p;
import f0.q;
import g.b;
import g.c;

/* JADX WARN: Classes with same name are omitted:
  
 */
/* loaded from: classes.dex */
public abstract class p0 extends Dialog implements p {

    /* renamed from: b  reason: collision with root package name */
    public q f1713b;

    /* renamed from: c  reason: collision with root package name */
    public final p f1714c = new o0(this);

    public p0(Context context, int theme) {
        super(context, b(context, theme));
        q delegate = a();
        delegate.D(b(context, theme));
        delegate.q(null);
    }

    @Override // android.app.Dialog
    public void onCreate(Bundle savedInstanceState) {
        a().n();
        super.onCreate(savedInstanceState);
        a().q(savedInstanceState);
    }

    @Override // android.app.Dialog
    public void setContentView(int layoutResID) {
        a().A(layoutResID);
    }

    @Override // android.app.Dialog
    public void setContentView(View view) {
        a().B(view);
    }

    @Override // android.app.Dialog
    public void setContentView(View view, ViewGroup.LayoutParams params) {
        a().C(view, params);
    }

    @Override // android.app.Dialog
    public View findViewById(int id) {
        return a().i(id);
    }

    @Override // android.app.Dialog
    public void setTitle(CharSequence title) {
        super.setTitle(title);
        a().E(title);
    }

    @Override // android.app.Dialog
    public void setTitle(int titleId) {
        super.setTitle(titleId);
        a().E(getContext().getString(titleId));
    }

    @Override // android.app.Dialog
    public void addContentView(View view, ViewGroup.LayoutParams params) {
        a().d(view, params);
    }

    @Override // android.app.Dialog
    public void onStop() {
        super.onStop();
        a().w();
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public void dismiss() {
        super.dismiss();
        a().r();
    }

    public boolean f(int featureId) {
        return a().z(featureId);
    }

    @Override // android.app.Dialog
    public void invalidateOptionsMenu() {
        a().o();
    }

    public q a() {
        if (this.f1713b == null) {
            this.f1713b = q.h(this, this);
        }
        return this.f1713b;
    }

    public static int b(Context context, int themeId) {
        if (themeId != 0) {
            return themeId;
        }
        TypedValue outValue = new TypedValue();
        context.getTheme().resolveAttribute(R.attr.dialogTheme, outValue, true);
        return outValue.resourceId;
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

    public boolean d(KeyEvent event) {
        return super.dispatchKeyEvent(event);
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public boolean dispatchKeyEvent(KeyEvent event) {
        View decor = getWindow().getDecorView();
        return q.e(this.f1714c, decor, this, event);
    }
}
