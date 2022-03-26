package d;

import android.content.Context;
import android.view.KeyEvent;
import android.view.MotionEvent;
import androidx.appcompat.widget.ContentFrameLayout;
import e.a;

/* JADX WARN: Classes with same name are omitted:
  
 */
/* loaded from: classes.dex */
public class k0 extends ContentFrameLayout {

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ n0 f1660j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k0(n0 n0Var, Context context) {
        super(context);
        this.f1660j = n0Var;
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchKeyEvent(KeyEvent event) {
        return this.f1660j.T(event) || super.dispatchKeyEvent(event);
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent event) {
        int action = event.getAction();
        if (action == 0) {
            int x2 = (int) event.getX();
            int y2 = (int) event.getY();
            if (b(x2, y2)) {
                this.f1660j.N(0);
                return true;
            }
        }
        return super.onInterceptTouchEvent(event);
    }

    @Override // android.view.View
    public void setBackgroundResource(int resid) {
        setBackgroundDrawable(a.b(getContext(), resid));
    }

    public final boolean b(int x2, int y2) {
        return x2 < -5 || y2 < -5 || x2 > getWidth() + 5 || y2 > getHeight() + 5;
    }
}
