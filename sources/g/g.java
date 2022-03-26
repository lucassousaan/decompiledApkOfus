package g;

import android.content.Context;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import h.h0;
import h.z;
import java.util.ArrayList;
import k.n;
import z.a;
import z.b;

/* JADX WARN: Classes with same name are omitted:
  
 */
/* loaded from: classes.dex */
public class g implements b {

    /* renamed from: a  reason: collision with root package name */
    public final ActionMode.Callback f1953a;

    /* renamed from: b  reason: collision with root package name */
    public final Context f1954b;

    /* renamed from: c  reason: collision with root package name */
    public final ArrayList f1955c = new ArrayList();

    /* renamed from: d  reason: collision with root package name */
    public final n f1956d = new n();

    public g(Context context, ActionMode.Callback supportCallback) {
        this.f1954b = context;
        this.f1953a = supportCallback;
    }

    @Override // g.b
    public boolean a(c mode, Menu menu) {
        return this.f1953a.onCreateActionMode(e(mode), f(menu));
    }

    @Override // g.b
    public boolean d(c mode, Menu menu) {
        return this.f1953a.onPrepareActionMode(e(mode), f(menu));
    }

    @Override // g.b
    public boolean c(c mode, MenuItem item) {
        return this.f1953a.onActionItemClicked(e(mode), new z(this.f1954b, (b) item));
    }

    @Override // g.b
    public void b(c mode) {
        this.f1953a.onDestroyActionMode(e(mode));
    }

    public final Menu f(Menu menu) {
        Menu wrapper = (Menu) this.f1956d.get(menu);
        if (wrapper != null) {
            return wrapper;
        }
        Menu wrapper2 = new h0(this.f1954b, (a) menu);
        this.f1956d.put(menu, wrapper2);
        return wrapper2;
    }

    public ActionMode e(c mode) {
        int count = this.f1955c.size();
        for (int i2 = 0; i2 < count; i2++) {
            h wrapper = (h) this.f1955c.get(i2);
            if (wrapper != null && wrapper.f1958b == mode) {
                return wrapper;
            }
        }
        h wrapper2 = new h(this.f1954b, mode);
        this.f1955c.add(wrapper2);
        return wrapper2;
    }
}
