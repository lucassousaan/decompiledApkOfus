package h;

import android.view.MenuItem;

/* JADX WARN: Classes with same name are omitted:
  
 */
/* loaded from: classes.dex */
public class y implements MenuItem.OnMenuItemClickListener {

    /* renamed from: a  reason: collision with root package name */
    public final MenuItem.OnMenuItemClickListener f2211a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ z f2212b;

    public y(z zVar, MenuItem.OnMenuItemClickListener object) {
        this.f2212b = zVar;
        this.f2211a = object;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public boolean onMenuItemClick(MenuItem item) {
        return this.f2211a.onMenuItemClick(this.f2212b.c(item));
    }
}
