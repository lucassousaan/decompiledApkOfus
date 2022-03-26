package androidx.appcompat.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.PopupWindow;
import c.a;
import i0.q;

/* JADX WARN: Classes with same name are omitted:
  
 */
/* loaded from: classes.dex */
public class k0 extends PopupWindow {

    /* renamed from: a  reason: collision with root package name */
    public static final boolean f412a = false;

    public k0(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
        a(context, attrs, defStyleAttr, defStyleRes);
    }

    public final void a(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        s3 a2 = s3.v(context, attrs, a.f1184r, defStyleAttr, defStyleRes);
        int[] iArr = a.f1167a;
        if (a2.s(2)) {
            b(a2.a(2, false));
        }
        setBackgroundDrawable(a2.g(0));
        a2.w();
    }

    @Override // android.widget.PopupWindow
    public void showAsDropDown(View anchor, int xoff, int yoff) {
        super.showAsDropDown(anchor, xoff, yoff);
    }

    @Override // android.widget.PopupWindow
    public void showAsDropDown(View anchor, int xoff, int yoff, int gravity) {
        super.showAsDropDown(anchor, xoff, yoff, gravity);
    }

    @Override // android.widget.PopupWindow
    public void update(View anchor, int xoff, int yoff, int width, int height) {
        super.update(anchor, xoff, yoff, width, height);
    }

    public final void b(boolean overlapAnchor) {
        q.a(this, overlapAnchor);
    }
}
