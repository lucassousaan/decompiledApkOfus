package d;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import c.a;
import com.example.helloworld.R;
import g.e;
import h.d0;
import h.g0;
import h.l;
import h.m;
import h.q;

/* JADX WARN: Classes with same name are omitted:
  
 */
/* loaded from: classes.dex */
public final class l0 {

    /* renamed from: a  reason: collision with root package name */
    public int f1662a;

    /* renamed from: b  reason: collision with root package name */
    public int f1663b;

    /* renamed from: c  reason: collision with root package name */
    public int f1664c;

    /* renamed from: d  reason: collision with root package name */
    public int f1665d;

    /* renamed from: e  reason: collision with root package name */
    public ViewGroup f1666e;

    /* renamed from: f  reason: collision with root package name */
    public View f1667f;

    /* renamed from: g  reason: collision with root package name */
    public View f1668g;

    /* renamed from: h  reason: collision with root package name */
    public q f1669h;

    /* renamed from: i  reason: collision with root package name */
    public m f1670i;

    /* renamed from: j  reason: collision with root package name */
    public Context f1671j;

    /* renamed from: k  reason: collision with root package name */
    public boolean f1672k;

    /* renamed from: l  reason: collision with root package name */
    public boolean f1673l;

    /* renamed from: m  reason: collision with root package name */
    public boolean f1674m;

    /* renamed from: n  reason: collision with root package name */
    public boolean f1675n;

    /* renamed from: o  reason: collision with root package name */
    public boolean f1676o = false;

    /* renamed from: p  reason: collision with root package name */
    public boolean f1677p;

    /* renamed from: q  reason: collision with root package name */
    public Bundle f1678q;

    public l0(int featureId) {
        this.f1662a = featureId;
    }

    public boolean b() {
        if (this.f1667f == null) {
            return false;
        }
        return this.f1668g != null || ((l) this.f1670i.a()).getCount() > 0;
    }

    public void d(Context context) {
        TypedValue outValue = new TypedValue();
        Resources.Theme widgetTheme = context.getResources().newTheme();
        widgetTheme.setTo(context.getTheme());
        widgetTheme.resolveAttribute(R.attr.actionBarPopupTheme, outValue, true);
        int i2 = outValue.resourceId;
        if (i2 != 0) {
            widgetTheme.applyStyle(i2, true);
        }
        widgetTheme.resolveAttribute(R.attr.panelMenuListTheme, outValue, true);
        int i3 = outValue.resourceId;
        if (i3 != 0) {
            widgetTheme.applyStyle(i3, true);
        } else {
            widgetTheme.applyStyle(2131755398, true);
        }
        Context context2 = new e(context, 0);
        context2.getTheme().setTo(widgetTheme);
        this.f1671j = context2;
        TypedArray a2 = context2.obtainStyledAttributes(a.f1176j);
        int[] iArr = a.f1167a;
        this.f1663b = a2.getResourceId(86, 0);
        this.f1665d = a2.getResourceId(1, 0);
        a2.recycle();
    }

    public void c(q menu) {
        m mVar;
        q qVar = this.f1669h;
        if (menu != qVar) {
            if (qVar != null) {
                qVar.O(this.f1670i);
            }
            this.f1669h = menu;
            if (menu != null && (mVar = this.f1670i) != null) {
                menu.b(mVar);
            }
        }
    }

    public g0 a(d0 cb) {
        if (this.f1669h == null) {
            return null;
        }
        if (this.f1670i == null) {
            m mVar = new m(this.f1671j, (int) R.layout.abc_list_menu_item_layout);
            this.f1670i = mVar;
            mVar.d(cb);
            this.f1669h.b(this.f1670i);
        }
        g0 result = this.f1670i.e(this.f1666e);
        return result;
    }
}
