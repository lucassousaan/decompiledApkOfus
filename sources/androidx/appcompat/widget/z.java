package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.CheckBox;
import com.example.helloworld.R;
import e.a;

/* JADX WARN: Classes with same name are omitted:
  
 */
/* loaded from: classes.dex */
public class z extends CheckBox {

    /* renamed from: b  reason: collision with root package name */
    public final b0 f591b;

    /* renamed from: c  reason: collision with root package name */
    public final x f592c;

    /* renamed from: d  reason: collision with root package name */
    public final i1 f593d;

    public z(Context context, AttributeSet attrs) {
        this(context, attrs, R.attr.checkboxStyle);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        p3.b(context);
        o3.a(this, getContext());
        b0 b0Var = new b0(this);
        this.f591b = b0Var;
        b0Var.e(attrs, defStyleAttr);
        x xVar = new x(this);
        this.f592c = xVar;
        xVar.e(attrs, defStyleAttr);
        i1 i1Var = new i1(this);
        this.f593d = i1Var;
        i1Var.m(attrs, defStyleAttr);
    }

    @Override // android.widget.CompoundButton
    public void setButtonDrawable(Drawable buttonDrawable) {
        super.setButtonDrawable(buttonDrawable);
        b0 b0Var = this.f591b;
        if (b0Var != null) {
            b0Var.f();
        }
    }

    @Override // android.widget.CompoundButton
    public void setButtonDrawable(int resId) {
        setButtonDrawable(a.b(getContext(), resId));
    }

    @Override // android.widget.CompoundButton, android.widget.TextView
    public int getCompoundPaddingLeft() {
        int value = super.getCompoundPaddingLeft();
        b0 b0Var = this.f591b;
        if (b0Var != null) {
            b0Var.b(value);
        }
        return value;
    }

    public void setSupportButtonTintList(ColorStateList tint) {
        b0 b0Var = this.f591b;
        if (b0Var != null) {
            b0Var.g(tint);
        }
    }

    public ColorStateList getSupportButtonTintList() {
        b0 b0Var = this.f591b;
        if (b0Var != null) {
            return b0Var.c();
        }
        return null;
    }

    public void setSupportButtonTintMode(PorterDuff.Mode tintMode) {
        b0 b0Var = this.f591b;
        if (b0Var != null) {
            b0Var.h(tintMode);
        }
    }

    public PorterDuff.Mode getSupportButtonTintMode() {
        b0 b0Var = this.f591b;
        if (b0Var != null) {
            return b0Var.d();
        }
        return null;
    }

    public void setSupportBackgroundTintList(ColorStateList tint) {
        x xVar = this.f592c;
        if (xVar != null) {
            xVar.i(tint);
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        x xVar = this.f592c;
        if (xVar != null) {
            return xVar.c();
        }
        return null;
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode tintMode) {
        x xVar = this.f592c;
        if (xVar != null) {
            xVar.j(tintMode);
        }
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        x xVar = this.f592c;
        if (xVar != null) {
            return xVar.d();
        }
        return null;
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable background) {
        super.setBackgroundDrawable(background);
        x xVar = this.f592c;
        if (xVar != null) {
            xVar.f();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int resId) {
        super.setBackgroundResource(resId);
        x xVar = this.f592c;
        if (xVar != null) {
            xVar.g(resId);
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        x xVar = this.f592c;
        if (xVar != null) {
            xVar.b();
        }
        i1 i1Var = this.f593d;
        if (i1Var != null) {
            i1Var.b();
        }
    }
}
