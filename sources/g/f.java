package g;

import android.content.Context;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.widget.ActionBarContextView;
import h.o;
import h.q;
import java.lang.ref.WeakReference;

/* JADX WARN: Classes with same name are omitted:
  
 */
/* loaded from: classes.dex */
public class f extends c implements o {

    /* renamed from: d  reason: collision with root package name */
    public Context f1947d;

    /* renamed from: e  reason: collision with root package name */
    public ActionBarContextView f1948e;

    /* renamed from: f  reason: collision with root package name */
    public b f1949f;

    /* renamed from: g  reason: collision with root package name */
    public WeakReference f1950g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f1951h;

    /* renamed from: i  reason: collision with root package name */
    public q f1952i;

    public f(Context context, ActionBarContextView view, b callback, boolean isFocusable) {
        this.f1947d = context;
        this.f1948e = view;
        this.f1949f = callback;
        q qVar = new q(view.getContext());
        qVar.S(1);
        this.f1952i = qVar;
        qVar.R(this);
    }

    @Override // g.c
    public void r(CharSequence title) {
        this.f1948e.setTitle(title);
    }

    @Override // g.c
    public void o(CharSequence subtitle) {
        this.f1948e.setSubtitle(subtitle);
    }

    @Override // g.c
    public void q(int resId) {
        r(this.f1947d.getString(resId));
    }

    @Override // g.c
    public void n(int resId) {
        o(this.f1947d.getString(resId));
    }

    @Override // g.c
    public void s(boolean titleOptional) {
        super.s(titleOptional);
        this.f1948e.setTitleOptional(titleOptional);
    }

    @Override // g.c
    public boolean l() {
        return this.f1948e.j();
    }

    @Override // g.c
    public void m(View view) {
        this.f1948e.setCustomView(view);
        this.f1950g = view != null ? new WeakReference(view) : null;
    }

    @Override // g.c
    public void k() {
        this.f1949f.d(this, this.f1952i);
    }

    @Override // g.c
    public void c() {
        if (!this.f1951h) {
            this.f1951h = true;
            this.f1948e.sendAccessibilityEvent(32);
            this.f1949f.b(this);
        }
    }

    @Override // g.c
    public Menu e() {
        return this.f1952i;
    }

    @Override // g.c
    public CharSequence i() {
        return this.f1948e.getTitle();
    }

    @Override // g.c
    public CharSequence g() {
        return this.f1948e.getSubtitle();
    }

    @Override // g.c
    public View d() {
        WeakReference weakReference = this.f1950g;
        if (weakReference != null) {
            return (View) weakReference.get();
        }
        return null;
    }

    @Override // g.c
    public MenuInflater f() {
        return new k(this.f1948e.getContext());
    }

    @Override // h.o
    public boolean b(q menu, MenuItem item) {
        return this.f1949f.c(this, item);
    }

    @Override // h.o
    public void a(q menu) {
        k();
        this.f1948e.l();
    }
}
