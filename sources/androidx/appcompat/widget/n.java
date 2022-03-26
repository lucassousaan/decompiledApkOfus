package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.drawable.Drawable;
import com.example.helloworld.R;
import y.a;

/* JADX WARN: Classes with same name are omitted:
  
 */
/* loaded from: classes.dex */
public class n extends i0 implements r {

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ q f439d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(q qVar, Context context) {
        super(context, null, R.attr.actionOverflowButtonStyle);
        this.f439d = qVar;
        setClickable(true);
        setFocusable(true);
        setVisibility(0);
        setEnabled(true);
        e4.a(this, getContentDescription());
        setOnTouchListener(new m(this, this, qVar));
    }

    @Override // android.view.View
    public boolean performClick() {
        if (super.performClick()) {
            return true;
        }
        playSoundEffect(0);
        this.f439d.K();
        return true;
    }

    @Override // androidx.appcompat.widget.r
    public boolean a() {
        return false;
    }

    @Override // androidx.appcompat.widget.r
    public boolean b() {
        return false;
    }

    @Override // android.widget.ImageView
    public boolean setFrame(int l2, int t2, int r2, int b2) {
        boolean changed = super.setFrame(l2, t2, r2, b2);
        Drawable d2 = getDrawable();
        Drawable bg = getBackground();
        if (!(d2 == null || bg == null)) {
            int width = getWidth();
            int height = getHeight();
            int halfEdge = Math.max(width, height) / 2;
            int offsetX = getPaddingLeft() - getPaddingRight();
            int offsetY = getPaddingTop() - getPaddingBottom();
            int centerX = (width + offsetX) / 2;
            int centerY = (height + offsetY) / 2;
            a.f(bg, centerX - halfEdge, centerY - halfEdge, centerX + halfEdge, centerY + halfEdge);
        }
        return changed;
    }
}
