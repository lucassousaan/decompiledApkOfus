package com.google.android.material.textfield;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Point;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import androidx.appcompat.widget.e0;
import com.example.helloworld.R;
import l1.i;
import l1.q;
import t1.a;

/* JADX WARN: Classes with same name are omitted:
  
 */
/* loaded from: classes.dex */
public class TextInputEditText extends e0 {

    /* renamed from: f  reason: collision with root package name */
    public final Rect f1472f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f1473g;

    public TextInputEditText(Context context, AttributeSet attrs) {
        this(context, attrs, R.attr.editTextStyle);
    }

    public TextInputEditText(Context context, AttributeSet attrs, int defStyleAttr) {
        super(a.c(context, attrs, defStyleAttr, 0), attrs, defStyleAttr);
        this.f1472f = new Rect();
        TypedArray attributes = q.h(context, attrs, v0.a.f3629z, defStyleAttr, 2131755608, new int[0]);
        int[] iArr = v0.a.f3604a;
        setTextInputLayoutFocusedRectEnabled(attributes.getBoolean(0, false));
        attributes.recycle();
    }

    @Override // android.widget.TextView, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        TextInputLayout layout = getTextInputLayout();
        if (layout != null && layout.O() && super.getHint() == null && i.a()) {
            setHint("");
        }
    }

    @Override // android.widget.TextView
    public CharSequence getHint() {
        TextInputLayout layout = getTextInputLayout();
        if (layout == null || !layout.O()) {
            return super.getHint();
        }
        return layout.getHint();
    }

    @Override // androidx.appcompat.widget.e0, android.widget.TextView, android.view.View
    public InputConnection onCreateInputConnection(EditorInfo outAttrs) {
        InputConnection ic = super.onCreateInputConnection(outAttrs);
        if (ic != null && outAttrs.hintText == null) {
            outAttrs.hintText = getHintFromLayout();
        }
        return ic;
    }

    private TextInputLayout getTextInputLayout() {
        for (ViewParent parent = getParent(); parent instanceof View; parent = parent.getParent()) {
            if (parent instanceof TextInputLayout) {
                return (TextInputLayout) parent;
            }
        }
        return null;
    }

    private CharSequence getHintFromLayout() {
        TextInputLayout layout = getTextInputLayout();
        if (layout != null) {
            return layout.getHint();
        }
        return null;
    }

    public void setTextInputLayoutFocusedRectEnabled(boolean textInputLayoutFocusedRectEnabled) {
        this.f1473g = textInputLayoutFocusedRectEnabled;
    }

    @Override // android.widget.TextView, android.view.View
    public void getFocusedRect(Rect r2) {
        super.getFocusedRect(r2);
        TextInputLayout textInputLayout = getTextInputLayout();
        if (textInputLayout != null && this.f1473g && r2 != null) {
            textInputLayout.getFocusedRect(this.f1472f);
            r2.bottom = this.f1472f.bottom;
        }
    }

    @Override // android.view.View
    public boolean getGlobalVisibleRect(Rect r2, Point globalOffset) {
        boolean result = super.getGlobalVisibleRect(r2, globalOffset);
        TextInputLayout textInputLayout = getTextInputLayout();
        if (!(textInputLayout == null || !this.f1473g || r2 == null)) {
            textInputLayout.getGlobalVisibleRect(this.f1472f, globalOffset);
            r2.bottom = this.f1472f.bottom;
        }
        return result;
    }

    @Override // android.view.View
    public boolean requestRectangleOnScreen(Rect rectangle) {
        boolean result = super.requestRectangleOnScreen(rectangle);
        TextInputLayout textInputLayout = getTextInputLayout();
        if (textInputLayout != null && this.f1473g) {
            this.f1472f.set(0, textInputLayout.getHeight() - getResources().getDimensionPixelOffset(R.dimen.mtrl_edittext_rectangle_top_offset), textInputLayout.getWidth(), textInputLayout.getHeight());
            textInputLayout.requestRectangleOnScreen(this.f1472f, true);
        }
        return result;
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo info) {
        super.onInitializeAccessibilityNodeInfo(info);
        getTextInputLayout();
    }
}
