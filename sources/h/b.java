package h;

import androidx.appcompat.view.menu.ActionMenuItemView;
import androidx.appcompat.widget.z1;

/* JADX WARN: Classes with same name are omitted:
  
 */
/* loaded from: classes.dex */
public class b extends z1 {

    /* renamed from: k  reason: collision with root package name */
    public final /* synthetic */ ActionMenuItemView f2051k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(ActionMenuItemView actionMenuItemView) {
        super(actionMenuItemView);
        this.f2051k = actionMenuItemView;
    }

    @Override // androidx.appcompat.widget.z1
    public i0 b() {
        c cVar = this.f2051k.f69l;
        if (cVar != null) {
            return cVar.a();
        }
        return null;
    }

    @Override // androidx.appcompat.widget.z1
    public boolean c() {
        i0 popup;
        ActionMenuItemView actionMenuItemView = this.f2051k;
        p pVar = actionMenuItemView.f67j;
        return pVar != null && pVar.f(actionMenuItemView.f64g) && (popup = b()) != null && popup.a();
    }
}
