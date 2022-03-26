package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.SpinnerAdapter;
import f0.c1;

/* JADX WARN: Classes with same name are omitted:
  
 */
/* loaded from: classes.dex */
public class a1 extends j2 implements d1 {
    public CharSequence F;
    public ListAdapter G;
    public final Rect H = new Rect();
    public int I;
    public final /* synthetic */ e1 J;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a1(e1 this$0, Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        this.J = this$0;
        D(this$0);
        J(true);
        O(0);
        L(new x0(this, this$0));
    }

    @Override // androidx.appcompat.widget.j2, androidx.appcompat.widget.d1
    public void o(ListAdapter adapter) {
        super.o(adapter);
        this.G = adapter;
    }

    @Override // androidx.appcompat.widget.d1
    public CharSequence b() {
        return this.F;
    }

    @Override // androidx.appcompat.widget.d1
    public void h(CharSequence hintText) {
        this.F = hintText;
    }

    public void S() {
        int hOffset;
        Drawable background = n();
        int hOffset2 = 0;
        if (background != null) {
            background.getPadding(this.J.f316i);
            hOffset2 = l4.b(this.J) ? this.J.f316i.right : -this.J.f316i.left;
        } else {
            Rect rect = this.J.f316i;
            rect.right = 0;
            rect.left = 0;
        }
        int spinnerPaddingLeft = this.J.getPaddingLeft();
        int spinnerPaddingRight = this.J.getPaddingRight();
        int spinnerWidth = this.J.getWidth();
        e1 e1Var = this.J;
        int i2 = e1Var.f315h;
        if (i2 == -2) {
            int contentWidth = e1Var.a((SpinnerAdapter) this.G, n());
            int i3 = this.J.getContext().getResources().getDisplayMetrics().widthPixels;
            Rect rect2 = this.J.f316i;
            int contentWidthLimit = (i3 - rect2.left) - rect2.right;
            if (contentWidth > contentWidthLimit) {
                contentWidth = contentWidthLimit;
            }
            F(Math.max(contentWidth, (spinnerWidth - spinnerPaddingLeft) - spinnerPaddingRight));
        } else if (i2 == -1) {
            F((spinnerWidth - spinnerPaddingLeft) - spinnerPaddingRight);
        } else {
            F(i2);
        }
        if (l4.b(this.J)) {
            hOffset = hOffset2 + (((spinnerWidth - spinnerPaddingRight) - z()) - T());
        } else {
            hOffset = hOffset2 + T() + spinnerPaddingLeft;
        }
        c(hOffset);
    }

    @Override // androidx.appcompat.widget.d1
    public void f(int textDirection, int textAlignment) {
        ViewTreeObserver vto;
        boolean wasShowing = a();
        S();
        I(2);
        i();
        ListView listView = e();
        listView.setChoiceMode(1);
        listView.setTextDirection(textDirection);
        listView.setTextAlignment(textAlignment);
        P(this.J.getSelectedItemPosition());
        if (!wasShowing && (vto = this.J.getViewTreeObserver()) != null) {
            ViewTreeObserver.OnGlobalLayoutListener layoutListener = new y0(this);
            vto.addOnGlobalLayoutListener(layoutListener);
            K(new z0(this, layoutListener));
        }
    }

    public boolean U(View view) {
        return c1.O(view) && view.getGlobalVisibleRect(this.H);
    }

    @Override // androidx.appcompat.widget.d1
    public void p(int px) {
        this.I = px;
    }

    public int T() {
        return this.I;
    }
}
