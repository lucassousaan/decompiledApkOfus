package androidx.appcompat.widget;

import android.content.Context;
import android.os.Build;
import android.transition.Transition;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MenuItem;
import android.widget.PopupWindow;
import h.q;
import java.lang.reflect.Method;

/* JADX WARN: Classes with same name are omitted:
  
 */
/* loaded from: classes.dex */
public class m2 extends j2 implements k2 {
    public static Method G;
    public k2 F;

    static {
        try {
            if (Build.VERSION.SDK_INT <= 28) {
                G = PopupWindow.class.getDeclaredMethod("setTouchModal", Boolean.TYPE);
            }
        } catch (NoSuchMethodException e2) {
            Log.i("MenuPopupWindow", "Could not find method setTouchModal() on PopupWindow. Oh well.");
        }
    }

    public m2(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
    }

    @Override // androidx.appcompat.widget.j2
    public v1 s(Context context, boolean hijackFocus) {
        l2 view = new l2(context, hijackFocus);
        view.setHoverListener(this);
        return view;
    }

    public void R(Object enterTransition) {
        this.C.setEnterTransition((Transition) enterTransition);
    }

    public void S(Object exitTransition) {
        this.C.setExitTransition((Transition) exitTransition);
    }

    public void T(k2 hoverListener) {
        this.F = hoverListener;
    }

    public void U(boolean touchModal) {
        if (Build.VERSION.SDK_INT <= 28) {
            Method method = G;
            if (method != null) {
                try {
                    method.invoke(this.C, Boolean.valueOf(touchModal));
                } catch (Exception e2) {
                    Log.i("MenuPopupWindow", "Could not invoke setTouchModal() on PopupWindow. Oh well.");
                }
            }
        } else {
            this.C.setTouchModal(touchModal);
        }
    }

    @Override // androidx.appcompat.widget.k2
    public void k(q menu, MenuItem item) {
        k2 k2Var = this.F;
        if (k2Var != null) {
            k2Var.k(menu, item);
        }
    }

    @Override // androidx.appcompat.widget.k2
    public void g(q menu, MenuItem item) {
        k2 k2Var = this.F;
        if (k2Var != null) {
            k2Var.g(menu, item);
        }
    }
}
