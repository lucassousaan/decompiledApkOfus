package androidx.appcompat.widget;

import h.d0;
import h.m0;
import h.q;
import h.t;
import java.util.Objects;

/* JADX WARN: Classes with same name are omitted:
  
 */
/* loaded from: classes.dex */
public class p implements d0 {

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ q f480b;

    public p(q qVar) {
        this.f480b = qVar;
    }

    @Override // h.d0
    public boolean c(q subMenu) {
        q qVar;
        qVar = this.f480b.f2067d;
        if (subMenu == qVar) {
            return false;
        }
        q qVar2 = this.f480b;
        ((t) ((m0) subMenu).getItem()).getItemId();
        Objects.requireNonNull(qVar2);
        d0 cb = this.f480b.m();
        if (cb != null) {
            return cb.c(subMenu);
        }
        return false;
    }

    @Override // h.d0
    public void b(q menu, boolean allMenusAreClosing) {
        if (menu instanceof m0) {
            menu.D().e(false);
        }
        d0 cb = this.f480b.m();
        if (cb != null) {
            cb.b(menu, allMenusAreClosing);
        }
    }
}
