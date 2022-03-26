package h;

import android.view.MenuItem;

/* JADX WARN: Classes with same name are omitted:
  
 */
/* loaded from: classes.dex */
public class x implements MenuItem.OnActionExpandListener {

    /* renamed from: a  reason: collision with root package name */
    public final MenuItem.OnActionExpandListener f2209a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ z f2210b;

    public x(z zVar, MenuItem.OnActionExpandListener object) {
        this.f2210b = zVar;
        this.f2209a = object;
    }

    @Override // android.view.MenuItem.OnActionExpandListener
    public boolean onMenuItemActionExpand(MenuItem item) {
        return this.f2209a.onMenuItemActionExpand(this.f2210b.c(item));
    }

    @Override // android.view.MenuItem.OnActionExpandListener
    public boolean onMenuItemActionCollapse(MenuItem item) {
        return this.f2209a.onMenuItemActionCollapse(this.f2210b.c(item));
    }
}
