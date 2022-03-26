package androidx.appcompat.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.CheckedTextView;
import e.a;
import i0.s;

/* JADX WARN: Classes with same name are omitted:
  
 */
/* loaded from: classes.dex */
public class a0 extends CheckedTextView {

    /* renamed from: c  reason: collision with root package name */
    public static final int[] f230c = {16843016};

    /* renamed from: b  reason: collision with root package name */
    public final i1 f231b;

    public a0(Context context, AttributeSet attrs) {
        this(context, attrs, 16843720);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        p3.b(context);
        o3.a(this, getContext());
        i1 i1Var = new i1(this);
        this.f231b = i1Var;
        i1Var.m(attrs, defStyleAttr);
        i1Var.b();
        s3 a2 = s3.v(getContext(), attrs, f230c, defStyleAttr, 0);
        setCheckMarkDrawable(a2.g(0));
        a2.w();
    }

    @Override // android.widget.CheckedTextView
    public void setCheckMarkDrawable(int resId) {
        setCheckMarkDrawable(a.b(getContext(), resId));
    }

    @Override // android.widget.TextView
    public void setTextAppearance(Context context, int resId) {
        super.setTextAppearance(context, resId);
        i1 i1Var = this.f231b;
        if (i1Var != null) {
            i1Var.q(context, resId);
        }
    }

    @Override // android.widget.CheckedTextView, android.widget.TextView, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        i1 i1Var = this.f231b;
        if (i1Var != null) {
            i1Var.b();
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
