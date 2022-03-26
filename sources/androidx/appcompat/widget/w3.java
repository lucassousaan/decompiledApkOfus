package androidx.appcompat.widget;

import android.content.Context;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import g.d;
import h.e0;
import h.m0;
import h.q;
import h.t;

/* JADX WARN: Classes with same name are omitted:
  
 */
/* loaded from: classes.dex */
public class w3 implements e0 {

    /* renamed from: b  reason: collision with root package name */
    public q f573b;

    /* renamed from: c  reason: collision with root package name */
    public t f574c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ Toolbar f575d;

    public w3(Toolbar toolbar) {
        this.f575d = toolbar;
    }

    @Override // h.e0
    public void f(Context context, q menu) {
        t tVar;
        q qVar = this.f573b;
        if (!(qVar == null || (tVar = this.f574c) == null)) {
            qVar.f(tVar);
        }
        this.f573b = menu;
    }

    @Override // h.e0
    public void k(boolean cleared) {
        if (this.f574c != null) {
            boolean found = false;
            q qVar = this.f573b;
            if (qVar != null) {
                int count = qVar.size();
                int i2 = 0;
                while (true) {
                    if (i2 >= count) {
                        break;
                    }
                    MenuItem item = this.f573b.getItem(i2);
                    if (item == this.f574c) {
                        found = true;
                        break;
                    }
                    i2++;
                }
            }
            if (!found) {
                j(this.f573b, this.f574c);
            }
        }
    }

    @Override // h.e0
    public boolean h(m0 subMenu) {
        return false;
    }

    @Override // h.e0
    public void b(q menu, boolean allMenusAreClosing) {
    }

    @Override // h.e0
    public boolean g() {
        return false;
    }

    @Override // h.e0
    public boolean c(q menu, t item) {
        this.f575d.g();
        ViewParent collapseButtonParent = this.f575d.f204i.getParent();
        Toolbar toolbar = this.f575d;
        if (collapseButtonParent != toolbar) {
            if (collapseButtonParent instanceof ViewGroup) {
                ((ViewGroup) collapseButtonParent).removeView(toolbar.f204i);
            }
            Toolbar toolbar2 = this.f575d;
            toolbar2.addView(toolbar2.f204i);
        }
        this.f575d.f205j = item.getActionView();
        this.f574c = item;
        ViewParent expandedActionParent = this.f575d.f205j.getParent();
        Toolbar toolbar3 = this.f575d;
        if (expandedActionParent != toolbar3) {
            if (expandedActionParent instanceof ViewGroup) {
                ((ViewGroup) expandedActionParent).removeView(toolbar3.f205j);
            }
            x3 lp = this.f575d.generateDefaultLayoutParams();
            Toolbar toolbar4 = this.f575d;
            lp.f1579a = 8388611 | (toolbar4.f210o & 112);
            lp.f585b = 2;
            toolbar4.f205j.setLayoutParams(lp);
            Toolbar toolbar5 = this.f575d;
            toolbar5.addView(toolbar5.f205j);
        }
        this.f575d.G();
        this.f575d.requestLayout();
        item.r(true);
        View view = this.f575d.f205j;
        if (view instanceof d) {
            ((d) view).a();
        }
        return true;
    }

    @Override // h.e0
    public boolean j(q menu, t item) {
        View view = this.f575d.f205j;
        if (view instanceof d) {
            ((d) view).e();
        }
        Toolbar toolbar = this.f575d;
        toolbar.removeView(toolbar.f205j);
        Toolbar toolbar2 = this.f575d;
        toolbar2.removeView(toolbar2.f204i);
        Toolbar toolbar3 = this.f575d;
        toolbar3.f205j = null;
        toolbar3.a();
        this.f574c = null;
        this.f575d.requestLayout();
        item.r(false);
        return true;
    }
}
