package g1;

import android.app.Dialog;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Build;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;

/* JADX WARN: Classes with same name are omitted:
  
 */
/* loaded from: classes.dex */
public class a implements View.OnTouchListener {

    /* renamed from: b  reason: collision with root package name */
    public final Dialog f2027b;

    /* renamed from: c  reason: collision with root package name */
    public final int f2028c;

    /* renamed from: d  reason: collision with root package name */
    public final int f2029d;

    /* renamed from: e  reason: collision with root package name */
    public final int f2030e;

    public a(Dialog dialog, Rect insets) {
        this.f2027b = dialog;
        this.f2028c = insets.left;
        this.f2029d = insets.top;
        this.f2030e = ViewConfiguration.get(dialog.getContext()).getScaledWindowTouchSlop();
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent event) {
        View insetView = view.findViewById(16908290);
        int insetLeft = this.f2028c + insetView.getLeft();
        int insetRight = insetView.getWidth() + insetLeft;
        int insetTop = this.f2029d + insetView.getTop();
        int insetBottom = insetView.getHeight() + insetTop;
        RectF dialogWindow = new RectF(insetLeft, insetTop, insetRight, insetBottom);
        if (dialogWindow.contains(event.getX(), event.getY())) {
            return false;
        }
        MotionEvent outsideEvent = MotionEvent.obtain(event);
        if (event.getAction() == 1) {
            outsideEvent.setAction(4);
        }
        if (Build.VERSION.SDK_INT < 28) {
            outsideEvent.setAction(0);
            int i2 = this.f2030e;
            outsideEvent.setLocation((-i2) - 1, (-i2) - 1);
        }
        view.performClick();
        return this.f2027b.onTouchEvent(outsideEvent);
    }
}
