package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.AutoCompleteTextView;
import com.example.helloworld.R;
import e.a;
import i0.s;

/* JADX WARN: Classes with same name are omitted:
  
 */
/* loaded from: classes.dex */
public class w extends AutoCompleteTextView {

    /* renamed from: d  reason: collision with root package name */
    public static final int[] f567d = {16843126};

    /* renamed from: b  reason: collision with root package name */
    public final x f568b;

    /* renamed from: c  reason: collision with root package name */
    public final i1 f569c;

    public w(Context context, AttributeSet attrs) {
        this(context, attrs, R.attr.autoCompleteTextViewStyle);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        p3.b(context);
        o3.a(this, getContext());
        s3 a2 = s3.v(getContext(), attrs, f567d, defStyleAttr, 0);
        if (a2.s(0)) {
            setDropDownBackgroundDrawable(a2.g(0));
        }
        a2.w();
        x xVar = new x(this);
        this.f568b = xVar;
        xVar.e(attrs, defStyleAttr);
        i1 i1Var = new i1(this);
        this.f569c = i1Var;
        i1Var.m(attrs, defStyleAttr);
        i1Var.b();
    }

    @Override // android.widget.AutoCompleteTextView
    public void setDropDownBackgroundResource(int resId) {
        setDropDownBackgroundDrawable(a.b(getContext(), resId));
    }

    @Override // android.view.View
    public void setBackgroundResource(int resId) {
        super.setBackgroundResource(resId);
        x xVar = this.f568b;
        if (xVar != null) {
            xVar.g(resId);
        }
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable background) {
        super.setBackgroundDrawable(background);
        x xVar = this.f568b;
        if (xVar != null) {
            xVar.f();
        }
    }

    public void setSupportBackgroundTintList(ColorStateList tint) {
        x xVar = this.f568b;
        if (xVar != null) {
            xVar.i(tint);
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        x xVar = this.f568b;
        if (xVar != null) {
            return xVar.c();
        }
        return null;
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode tintMode) {
        x xVar = this.f568b;
        if (xVar != null) {
            xVar.j(tintMode);
        }
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        x xVar = this.f568b;
        if (xVar != null) {
            return xVar.d();
        }
        return null;
    }

    @Override // android.widget.TextView, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        x xVar = this.f568b;
        if (xVar != null) {
            xVar.b();
        }
        i1 i1Var = this.f569c;
        if (i1Var != null) {
            i1Var.b();
        }
    }

    @Override // android.widget.TextView
    public void setTextAppearance(Context context, int resId) {
        super.setTextAppearance(context, resId);
        i1 i1Var = this.f569c;
        if (i1Var != null) {
            i1Var.q(context, resId);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public InputConnection onCreateInputConnection(EditorInfo outAttrs) {
        InputConnection onCreateInputConnection = super.onCreateInputConnection(outAttrs);
        f0.a(onCreateInputConnection, outAttrs, this);
        return onCreateInputConnection;
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback actionModeCallback) {
        super.setCustomSelectionActionModeCallback(s.p(this, actionModeCallback));
    }
}
