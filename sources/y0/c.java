package y0;

import android.view.View;
import com.google.android.material.behavior.SwipeDismissBehavior;
import f0.c1;
import g0.l;
import g0.t;
import java.util.Objects;

/* JADX WARN: Classes with same name are omitted:
  
 */
/* loaded from: classes.dex */
public class c implements t {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ SwipeDismissBehavior f3721a;

    public c(SwipeDismissBehavior this$0) {
        this.f3721a = this$0;
    }

    @Override // g0.t
    public boolean a(View view, l arguments) {
        boolean dismissToLeft = false;
        if (!this.f3721a.E(view)) {
            return false;
        }
        boolean isRtl = c1.A(view) == 1;
        int i2 = this.f3721a.f1251d;
        if ((i2 == 0 && isRtl) || (i2 == 1 && !isRtl)) {
            dismissToLeft = true;
        }
        int offset = view.getWidth();
        if (dismissToLeft) {
            offset = -offset;
        }
        c1.V(view, offset);
        view.setAlpha(0.0f);
        Objects.requireNonNull(this.f3721a);
        return true;
    }
}
