package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.Editable;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.DragEvent;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.textclassifier.TextClassifier;
import android.widget.EditText;
import com.example.helloworld.R;
import f0.c0;
import f0.c1;
import f0.m;
import h0.b;
import h0.d;
import h0.e;
import i0.s;
import i0.u;

/* JADX WARN: Classes with same name are omitted:
  
 */
/* loaded from: classes.dex */
public class e0 extends EditText implements c0 {

    /* renamed from: b  reason: collision with root package name */
    public final x f304b;

    /* renamed from: c  reason: collision with root package name */
    public final i1 f305c;

    /* renamed from: d  reason: collision with root package name */
    public final f1 f306d;

    /* renamed from: e  reason: collision with root package name */
    public final u f307e;

    public e0(Context context, AttributeSet attrs) {
        this(context, attrs, R.attr.editTextStyle);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e0(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        p3.b(context);
        o3.a(this, getContext());
        x xVar = new x(this);
        this.f304b = xVar;
        xVar.e(attrs, defStyleAttr);
        i1 i1Var = new i1(this);
        this.f305c = i1Var;
        i1Var.m(attrs, defStyleAttr);
        i1Var.b();
        this.f306d = new f1(this);
        this.f307e = new u();
    }

    @Override // android.widget.EditText, android.widget.TextView
    public Editable getText() {
        if (Build.VERSION.SDK_INT >= 28) {
            return super.getText();
        }
        return super.getEditableText();
    }

    @Override // android.view.View
    public void setBackgroundResource(int resId) {
        super.setBackgroundResource(resId);
        x xVar = this.f304b;
        if (xVar != null) {
            xVar.g(resId);
        }
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable background) {
        super.setBackgroundDrawable(background);
        x xVar = this.f304b;
        if (xVar != null) {
            xVar.f();
        }
    }

    public void setSupportBackgroundTintList(ColorStateList tint) {
        x xVar = this.f304b;
        if (xVar != null) {
            xVar.i(tint);
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        x xVar = this.f304b;
        if (xVar != null) {
            return xVar.c();
        }
        return null;
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode tintMode) {
        x xVar = this.f304b;
        if (xVar != null) {
            xVar.j(tintMode);
        }
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        x xVar = this.f304b;
        if (xVar != null) {
            return xVar.d();
        }
        return null;
    }

    @Override // android.widget.TextView, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        x xVar = this.f304b;
        if (xVar != null) {
            xVar.b();
        }
        i1 i1Var = this.f305c;
        if (i1Var != null) {
            i1Var.b();
        }
    }

    @Override // android.widget.TextView
    public void setTextAppearance(Context context, int resId) {
        super.setTextAppearance(context, resId);
        i1 i1Var = this.f305c;
        if (i1Var != null) {
            i1Var.q(context, resId);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public InputConnection onCreateInputConnection(EditorInfo outAttrs) {
        InputConnection ic = super.onCreateInputConnection(outAttrs);
        this.f305c.r(this, ic, outAttrs);
        InputConnection ic2 = f0.a(ic, outAttrs, this);
        String[] mimeTypes = c1.D(this);
        if (ic2 == null || mimeTypes == null) {
            return ic2;
        }
        b.c(outAttrs, mimeTypes);
        d onCommitContentListener = q0.a(this);
        return e.a(ic2, outAttrs, onCommitContentListener);
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback actionModeCallback) {
        super.setCustomSelectionActionModeCallback(s.p(this, actionModeCallback));
    }

    @Override // android.widget.TextView
    public void setTextClassifier(TextClassifier textClassifier) {
        f1 f1Var;
        if (Build.VERSION.SDK_INT >= 28 || (f1Var = this.f306d) == null) {
            super.setTextClassifier(textClassifier);
        } else {
            f1Var.b(textClassifier);
        }
    }

    @Override // android.widget.TextView
    public TextClassifier getTextClassifier() {
        f1 f1Var;
        if (Build.VERSION.SDK_INT >= 28 || (f1Var = this.f306d) == null) {
            return super.getTextClassifier();
        }
        return f1Var.a();
    }

    @Override // android.widget.TextView, android.view.View
    public boolean onDragEvent(DragEvent event) {
        if (q0.b(this, event)) {
            return true;
        }
        return super.onDragEvent(event);
    }

    @Override // android.widget.TextView
    public boolean onTextContextMenuItem(int id) {
        if (q0.c(this, id)) {
            return true;
        }
        return super.onTextContextMenuItem(id);
    }

    @Override // f0.c0
    public m a(m payload) {
        return this.f307e.b(this, payload);
    }
}
