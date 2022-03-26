package l0;

import android.os.Bundle;
import g0.f;
import g0.j;

/* JADX WARN: Classes with same name are omitted:
  
 */
/* loaded from: classes.dex */
public class c extends j {

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ d f2356b;

    public c(d dVar) {
        this.f2356b = dVar;
    }

    @Override // g0.j
    public f b(int virtualViewId) {
        f node = this.f2356b.H(virtualViewId);
        return f.M(node);
    }

    @Override // g0.j
    public boolean f(int virtualViewId, int action, Bundle arguments) {
        return this.f2356b.P(virtualViewId, action, arguments);
    }

    @Override // g0.j
    public f d(int focusType) {
        int focusedId = focusType == 2 ? this.f2356b.f2367k : this.f2356b.f2368l;
        if (focusedId == Integer.MIN_VALUE) {
            return null;
        }
        return b(focusedId);
    }
}
