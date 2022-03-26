package d;

import android.content.Context;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.widget.d4;
import g.b;
import g.c;
import g.k;
import h.o;
import h.q;
import java.lang.ref.WeakReference;
import java.util.Objects;

/* JADX WARN: Classes with same name are omitted:
  
 */
/* loaded from: classes.dex */
public class z0 extends c implements o {

    /* renamed from: d  reason: collision with root package name */
    public final Context f1758d;

    /* renamed from: e  reason: collision with root package name */
    public final q f1759e;

    /* renamed from: f  reason: collision with root package name */
    public b f1760f;

    /* renamed from: g  reason: collision with root package name */
    public WeakReference f1761g;

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ a1 f1762h;

    public z0(a1 this$0, Context context, b callback) {
        this.f1762h = this$0;
        this.f1758d = context;
        this.f1760f = callback;
        q qVar = new q(context);
        qVar.S(1);
        this.f1759e = qVar;
        qVar.R(this);
    }

    @Override // g.c
    public MenuInflater f() {
        return new k(this.f1758d);
    }

    @Override // g.c
    public Menu e() {
        return this.f1759e;
    }

    @Override // g.c
    public void c() {
        a1 a1Var = this.f1762h;
        if (a1Var.f1589i == this) {
            Objects.requireNonNull(a1Var);
            if (!a1.q(false, this.f1762h.f1597q, false)) {
                a1 a1Var2 = this.f1762h;
                a1Var2.f1590j = this;
                a1Var2.f1591k = this.f1760f;
            } else {
                this.f1760f.b(this);
            }
            this.f1760f = null;
            this.f1762h.p(false);
            this.f1762h.f1586f.g();
            ((d4) this.f1762h.f1585e).i().sendAccessibilityEvent(32);
            a1 a1Var3 = this.f1762h;
            a1Var3.f1583c.setHideOnContentScrollEnabled(a1Var3.f1602v);
            this.f1762h.f1589i = null;
        }
    }

    @Override // g.c
    public void k() {
        if (this.f1762h.f1589i == this) {
            this.f1759e.d0();
            try {
                this.f1760f.d(this, this.f1759e);
            } finally {
                this.f1759e.c0();
            }
        }
    }

    public boolean t() {
        this.f1759e.d0();
        try {
            return this.f1760f.a(this, this.f1759e);
        } finally {
            this.f1759e.c0();
        }
    }

    @Override // g.c
    public void m(View view) {
        this.f1762h.f1586f.setCustomView(view);
        this.f1761g = new WeakReference(view);
    }

    @Override // g.c
    public void o(CharSequence subtitle) {
        this.f1762h.f1586f.setSubtitle(subtitle);
    }

    @Override // g.c
    public void r(CharSequence title) {
        this.f1762h.f1586f.setTitle(title);
    }

    @Override // g.c
    public void q(int resId) {
        r(this.f1762h.f1581a.getResources().getString(resId));
    }

    @Override // g.c
    public void n(int resId) {
        o(this.f1762h.f1581a.getResources().getString(resId));
    }

    @Override // g.c
    public CharSequence i() {
        return this.f1762h.f1586f.getTitle();
    }

    @Override // g.c
    public CharSequence g() {
        return this.f1762h.f1586f.getSubtitle();
    }

    @Override // g.c
    public void s(boolean titleOptional) {
        super.s(titleOptional);
        this.f1762h.f1586f.setTitleOptional(titleOptional);
    }

    @Override // g.c
    public boolean l() {
        return this.f1762h.f1586f.j();
    }

    @Override // g.c
    public View d() {
        WeakReference weakReference = this.f1761g;
        if (weakReference != null) {
            return (View) weakReference.get();
        }
        return null;
    }

    @Override // h.o
    public boolean b(q menu, MenuItem item) {
        b bVar = this.f1760f;
        if (bVar != null) {
            return bVar.c(this, item);
        }
        return false;
    }

    @Override // h.o
    public void a(q menu) {
        if (this.f1760f != null) {
            k();
            this.f1762h.f1586f.l();
        }
    }
}
