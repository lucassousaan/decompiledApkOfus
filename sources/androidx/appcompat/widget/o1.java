package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.ToggleButton;

/* JADX WARN: Classes with same name are omitted:
  
 */
/* loaded from: classes.dex */
public class o1 extends ToggleButton {

    /* renamed from: b  reason: collision with root package name */
    public final x f471b;

    /* renamed from: c  reason: collision with root package name */
    public final i1 f472c;

    public o1(Context context, AttributeSet attrs) {
        this(context, attrs, 16842827);
    }

    public o1(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        o3.a(this, getContext());
        x xVar = new x(this);
        this.f471b = xVar;
        xVar.e(attrs, defStyleAttr);
        i1 i1Var = new i1(this);
        this.f472c = i1Var;
        i1Var.m(attrs, defStyleAttr);
    }

    @Override // android.view.View
    public void setBackgroundResource(int resId) {
        super.setBackgroundResource(resId);
        x xVar = this.f471b;
        if (xVar != null) {
            xVar.g(resId);
        }
    }

    @Override // android.widget.ToggleButton, android.view.View
    public void setBackgroundDrawable(Drawable background) {
        super.setBackgroundDrawable(background);
        x xVar = this.f471b;
        if (xVar != null) {
            xVar.f();
        }
    }

    public void setSupportBackgroundTintList(ColorStateList tint) {
        x xVar = this.f471b;
        if (xVar != null) {
            xVar.i(tint);
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        x xVar = this.f471b;
        if (xVar != null) {
            return xVar.c();
        }
        return null;
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode tintMode) {
        x xVar = this.f471b;
        if (xVar != null) {
            xVar.j(tintMode);
        }
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        x xVar = this.f471b;
        if (xVar != null) {
            return xVar.d();
        }
        return null;
    }

    @Override // android.widget.ToggleButton, android.widget.CompoundButton, android.widget.TextView, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        x xVar = this.f471b;
        if (xVar != null) {
            xVar.b();
        }
        i1 i1Var = this.f472c;
        if (i1Var != null) {
            i1Var.b();
        }
    }
}
