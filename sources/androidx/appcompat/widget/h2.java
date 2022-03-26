package androidx.appcompat.widget;

import android.view.MotionEvent;
import android.view.View;
import android.widget.PopupWindow;

/* JADX WARN: Classes with same name are omitted:
  
 */
/* loaded from: classes.dex */
public class h2 implements View.OnTouchListener {

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ j2 f337b;

    public h2(j2 j2Var) {
        this.f337b = j2Var;
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View v2, MotionEvent event) {
        PopupWindow popupWindow;
        int action = event.getAction();
        int x2 = (int) event.getX();
        int y2 = (int) event.getY();
        if (action == 0 && (popupWindow = this.f337b.C) != null && popupWindow.isShowing() && x2 >= 0 && x2 < this.f337b.C.getWidth() && y2 >= 0 && y2 < this.f337b.C.getHeight()) {
            j2 j2Var = this.f337b;
            j2Var.f407y.postDelayed(j2Var.f403u, 250L);
            return false;
        } else if (action != 1) {
            return false;
        } else {
            j2 j2Var2 = this.f337b;
            j2Var2.f407y.removeCallbacks(j2Var2.f403u);
            return false;
        }
    }
}
