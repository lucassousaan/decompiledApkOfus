package r1;

import android.view.MotionEvent;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.behavior.SwipeDismissBehavior;

/* JADX WARN: Classes with same name are omitted:
  
 */
/* loaded from: classes.dex */
public class a {
    public a(SwipeDismissBehavior swipeDismissBehavior) {
        swipeDismissBehavior.K(0.1f);
        swipeDismissBehavior.J(0.6f);
        swipeDismissBehavior.L(0);
    }

    public boolean a(View child) {
        return child instanceof e;
    }

    public void b(CoordinatorLayout parent, View child, MotionEvent event) {
        switch (event.getActionMasked()) {
            case 0:
                if (parent.B(child, (int) event.getX(), (int) event.getY())) {
                    i.b().e(null);
                    return;
                }
                return;
            case 1:
            case 3:
                i.b().f(null);
                return;
            case 2:
            default:
                return;
        }
    }
}
