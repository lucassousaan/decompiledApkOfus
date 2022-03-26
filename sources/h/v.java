package h;

import android.content.Context;
import android.view.ActionProvider;
import android.view.MenuItem;
import android.view.View;
import f0.d;

/* JADX WARN: Classes with same name are omitted:
  
 */
/* loaded from: classes.dex */
public class v extends u implements ActionProvider.VisibilityListener {

    /* renamed from: d  reason: collision with root package name */
    public d f2207d;

    public v(z zVar, Context context, ActionProvider inner) {
        super(zVar, context, inner);
    }

    @Override // f0.e
    public View c(MenuItem forItem) {
        return this.f2205b.onCreateActionView(forItem);
    }

    @Override // f0.e
    public boolean f() {
        return this.f2205b.overridesItemVisibility();
    }

    @Override // f0.e
    public boolean b() {
        return this.f2205b.isVisible();
    }

    @Override // f0.e
    public void i(d listener) {
        this.f2207d = listener;
        this.f2205b.setVisibilityListener(listener != null ? this : null);
    }

    @Override // android.view.ActionProvider.VisibilityListener
    public void onActionProviderVisibilityChanged(boolean isVisible) {
        d dVar = this.f2207d;
        if (dVar != null) {
            ((s) dVar).a(isVisible);
        }
    }
}
