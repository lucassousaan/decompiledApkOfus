package h;

import android.content.DialogInterface;
import android.os.IBinder;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import com.example.helloworld.R;
import d.k;
import d.l;

/* JADX WARN: Classes with same name are omitted:
  
 */
/* loaded from: classes.dex */
public class r implements DialogInterface.OnKeyListener, DialogInterface.OnClickListener, DialogInterface.OnDismissListener, d0 {

    /* renamed from: b  reason: collision with root package name */
    public q f2175b;

    /* renamed from: c  reason: collision with root package name */
    public l f2176c;

    /* renamed from: d  reason: collision with root package name */
    public m f2177d;

    public r(q menu) {
        this.f2175b = menu;
    }

    public void d(IBinder windowToken) {
        q menu = this.f2175b;
        k builder = new k(menu.u());
        m mVar = new m(builder.b(), (int) R.layout.abc_list_menu_item_layout);
        this.f2177d = mVar;
        mVar.d(this);
        this.f2175b.b(this.f2177d);
        builder.c(this.f2177d.a(), this);
        View headerView = menu.y();
        if (headerView != null) {
            builder.d(headerView);
        } else {
            builder.e(menu.w());
            builder.h(menu.x());
        }
        builder.f(this);
        l a2 = builder.a();
        this.f2176c = a2;
        a2.setOnDismissListener(this);
        WindowManager.LayoutParams lp = this.f2176c.getWindow().getAttributes();
        lp.type = 1003;
        if (windowToken != null) {
            lp.token = windowToken;
        }
        lp.flags |= 131072;
        this.f2176c.show();
    }

    @Override // android.content.DialogInterface.OnKeyListener
    public boolean onKey(DialogInterface dialog, int keyCode, KeyEvent event) {
        Window win;
        View decor;
        KeyEvent.DispatcherState ds;
        View decor2;
        KeyEvent.DispatcherState ds2;
        if (keyCode == 82 || keyCode == 4) {
            if (event.getAction() == 0 && event.getRepeatCount() == 0) {
                Window win2 = this.f2176c.getWindow();
                if (!(win2 == null || (decor2 = win2.getDecorView()) == null || (ds2 = decor2.getKeyDispatcherState()) == null)) {
                    ds2.startTracking(event, this);
                    return true;
                }
            } else if (event.getAction() == 1 && !event.isCanceled() && (win = this.f2176c.getWindow()) != null && (decor = win.getDecorView()) != null && (ds = decor.getKeyDispatcherState()) != null && ds.isTracking(event)) {
                this.f2175b.e(true);
                dialog.dismiss();
                return true;
            }
        }
        return this.f2175b.performShortcut(keyCode, event, 0);
    }

    public void a() {
        l lVar = this.f2176c;
        if (lVar != null) {
            lVar.dismiss();
        }
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public void onDismiss(DialogInterface dialog) {
        this.f2177d.b(this.f2175b, true);
    }

    @Override // h.d0
    public void b(q menu, boolean allMenusAreClosing) {
        if (allMenusAreClosing || menu == this.f2175b) {
            a();
        }
    }

    @Override // h.d0
    public boolean c(q subMenu) {
        return false;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(DialogInterface dialog, int which) {
        this.f2175b.L((t) ((l) this.f2177d.a()).getItem(which), 0);
    }
}
