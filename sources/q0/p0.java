package q0;

import android.content.Context;
import android.util.DisplayMetrics;
import android.view.View;

/* JADX WARN: Classes with same name are omitted:
  
 */
/* loaded from: classes.dex */
public class p0 extends j0 {

    /* renamed from: q  reason: collision with root package name */
    public final /* synthetic */ q0 f3161q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p0(q0 this$0, Context context) {
        super(context);
        this.f3161q = this$0;
    }

    @Override // q0.j0, q0.a2
    public void o(View targetView, b2 state, y1 action) {
        q0 q0Var = this.f3161q;
        int[] snapDistances = q0Var.c(q0Var.f3096a.getLayoutManager(), targetView);
        int dx = snapDistances[0];
        int dy = snapDistances[1];
        int time = w(Math.max(Math.abs(dx), Math.abs(dy)));
        if (time > 0) {
            action.d(dx, dy, time, this.f3082j);
        }
    }

    @Override // q0.j0
    public float v(DisplayMetrics displayMetrics) {
        return 100.0f / displayMetrics.densityDpi;
    }

    @Override // q0.j0
    public int x(int dx) {
        return Math.min(100, super.x(dx));
    }
}
