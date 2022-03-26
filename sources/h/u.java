package h;

import android.content.Context;
import android.view.ActionProvider;
import android.view.SubMenu;
import f0.e;

/* JADX WARN: Classes with same name are omitted:
  
 */
/* loaded from: classes.dex */
public abstract class u extends e {

    /* renamed from: b  reason: collision with root package name */
    public final ActionProvider f2205b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ z f2206c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(z zVar, Context context, ActionProvider inner) {
        super(context);
        this.f2206c = zVar;
        this.f2205b = inner;
    }

    @Override // f0.e
    public boolean d() {
        return this.f2205b.onPerformDefaultAction();
    }

    @Override // f0.e
    public boolean a() {
        return this.f2205b.hasSubMenu();
    }

    @Override // f0.e
    public void e(SubMenu subMenu) {
        ActionProvider actionProvider = this.f2205b;
        this.f2206c.d(subMenu);
        actionProvider.onPrepareSubMenu(subMenu);
    }
}
