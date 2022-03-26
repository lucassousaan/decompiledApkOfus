package androidx.appcompat.widget;

import a1.a;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.textclassifier.TextClassifier;
import android.widget.TextView;
import androidx.core.text.PrecomputedTextCompat;
import d0.e;
import d0.f;
import i0.d;
import i0.s;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

/* JADX WARN: Classes with same name are omitted:
  
 */
/* loaded from: classes.dex */
public class j1 extends TextView implements d {

    /* renamed from: b  reason: collision with root package name */
    public final x f379b;

    /* renamed from: c  reason: collision with root package name */
    public final i1 f380c;

    /* renamed from: d  reason: collision with root package name */
    public final f1 f381d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f382e;

    /* renamed from: f  reason: collision with root package name */
    public Future f383f;

    public j1(Context context) {
        this(context, null);
    }

    public j1(Context context, AttributeSet attrs) {
        this(context, attrs, 16842884);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j1(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        p3.b(context);
        this.f382e = false;
        o3.a(this, getContext());
        x xVar = new x(this);
        this.f379b = xVar;
        xVar.e(attrs, defStyleAttr);
        i1 i1Var = new i1(this);
        this.f380c = i1Var;
        i1Var.m(attrs, defStyleAttr);
        i1Var.b();
        this.f381d = new f1(this);
    }

    @Override // android.view.View
    public void setBackgroundResource(int resId) {
        super.setBackgroundResource(resId);
        x xVar = this.f379b;
        if (xVar != null) {
            xVar.g(resId);
        }
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable background) {
        super.setBackgroundDrawable(background);
        x xVar = this.f379b;
        if (xVar != null) {
            xVar.f();
        }
    }

    public void setSupportBackgroundTintList(ColorStateList tint) {
        x xVar = this.f379b;
        if (xVar != null) {
            xVar.i(tint);
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        x xVar = this.f379b;
        if (xVar != null) {
            return xVar.c();
        }
        return null;
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode tintMode) {
        x xVar = this.f379b;
        if (xVar != null) {
            xVar.j(tintMode);
        }
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        x xVar = this.f379b;
        if (xVar != null) {
            return xVar.d();
        }
        return null;
    }

    @Override // android.widget.TextView
    public void setTextAppearance(Context context, int resId) {
        super.setTextAppearance(context, resId);
        i1 i1Var = this.f380c;
        if (i1Var != null) {
            i1Var.q(context, resId);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        x xVar = this.f379b;
        if (xVar != null) {
            xVar.b();
        }
        i1 i1Var = this.f380c;
        if (i1Var != null) {
            i1Var.b();
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void onLayout(boolean changed, int left, int top, int right, int bottom) {
        super.onLayout(changed, left, top, right, bottom);
        i1 i1Var = this.f380c;
        if (i1Var != null) {
            i1Var.o();
        }
    }

    @Override // android.widget.TextView
    public void setTextSize(int unit, float size) {
        if (d.f2255a) {
            super.setTextSize(unit, size);
            return;
        }
        i1 i1Var = this.f380c;
        if (i1Var != null) {
            i1Var.A(unit, size);
        }
    }

    @Override // android.widget.TextView
    public void onTextChanged(CharSequence text, int start, int lengthBefore, int lengthAfter) {
        super.onTextChanged(text, start, lengthBefore, lengthAfter);
        i1 i1Var = this.f380c;
        if (i1Var != null && !d.f2255a && i1Var.l()) {
            this.f380c.c();
        }
    }

    @Override // android.widget.TextView
    public void setAutoSizeTextTypeWithDefaults(int autoSizeTextType) {
        if (d.f2255a) {
            super.setAutoSizeTextTypeWithDefaults(autoSizeTextType);
            return;
        }
        i1 i1Var = this.f380c;
        if (i1Var != null) {
            i1Var.v(autoSizeTextType);
        }
    }

    @Override // android.widget.TextView
    public void setAutoSizeTextTypeUniformWithConfiguration(int autoSizeMinTextSize, int autoSizeMaxTextSize, int autoSizeStepGranularity, int unit) {
        if (d.f2255a) {
            super.setAutoSizeTextTypeUniformWithConfiguration(autoSizeMinTextSize, autoSizeMaxTextSize, autoSizeStepGranularity, unit);
            return;
        }
        i1 i1Var = this.f380c;
        if (i1Var != null) {
            i1Var.t(autoSizeMinTextSize, autoSizeMaxTextSize, autoSizeStepGranularity, unit);
        }
    }

    @Override // android.widget.TextView
    public void setAutoSizeTextTypeUniformWithPresetSizes(int[] presetSizes, int unit) {
        if (d.f2255a) {
            super.setAutoSizeTextTypeUniformWithPresetSizes(presetSizes, unit);
            return;
        }
        i1 i1Var = this.f380c;
        if (i1Var != null) {
            i1Var.u(presetSizes, unit);
        }
    }

    @Override // android.widget.TextView
    @SuppressLint({"WrongConstant"})
    public int getAutoSizeTextType() {
        if (d.f2255a) {
            return super.getAutoSizeTextType() == 1 ? 1 : 0;
        }
        i1 i1Var = this.f380c;
        if (i1Var != null) {
            return i1Var.i();
        }
        return 0;
    }

    @Override // android.widget.TextView
    public int getAutoSizeStepGranularity() {
        if (d.f2255a) {
            return super.getAutoSizeStepGranularity();
        }
        i1 i1Var = this.f380c;
        if (i1Var != null) {
            return i1Var.g();
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int getAutoSizeMinTextSize() {
        if (d.f2255a) {
            return super.getAutoSizeMinTextSize();
        }
        i1 i1Var = this.f380c;
        if (i1Var != null) {
            return i1Var.f();
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int getAutoSizeMaxTextSize() {
        if (d.f2255a) {
            return super.getAutoSizeMaxTextSize();
        }
        i1 i1Var = this.f380c;
        if (i1Var != null) {
            return i1Var.e();
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int[] getAutoSizeTextAvailableSizes() {
        if (d.f2255a) {
            return super.getAutoSizeTextAvailableSizes();
        }
        i1 i1Var = this.f380c;
        if (i1Var != null) {
            return i1Var.h();
        }
        return new int[0];
    }

    @Override // android.widget.TextView, android.view.View
    public InputConnection onCreateInputConnection(EditorInfo outAttrs) {
        InputConnection ic = super.onCreateInputConnection(outAttrs);
        this.f380c.r(this, ic, outAttrs);
        f0.a(ic, outAttrs, this);
        return ic;
    }

    @Override // android.widget.TextView
    public void setFirstBaselineToTopHeight(int firstBaselineToTopHeight) {
        if (Build.VERSION.SDK_INT >= 28) {
            super.setFirstBaselineToTopHeight(firstBaselineToTopHeight);
        } else {
            s.j(this, firstBaselineToTopHeight);
        }
    }

    @Override // android.widget.TextView
    public void setLastBaselineToBottomHeight(int lastBaselineToBottomHeight) {
        if (Build.VERSION.SDK_INT >= 28) {
            super.setLastBaselineToBottomHeight(lastBaselineToBottomHeight);
        } else {
            s.k(this, lastBaselineToBottomHeight);
        }
    }

    @Override // android.widget.TextView
    public int getFirstBaselineToTopHeight() {
        return s.b(this);
    }

    @Override // android.widget.TextView
    public int getLastBaselineToBottomHeight() {
        return s.c(this);
    }

    @Override // android.widget.TextView
    public void setLineHeight(int lineHeight) {
        s.l(this, lineHeight);
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback actionModeCallback) {
        super.setCustomSelectionActionModeCallback(s.p(this, actionModeCallback));
    }

    public e getTextMetricsParamsCompat() {
        return s.f(this);
    }

    public void setTextMetricsParamsCompat(e params) {
        s.o(this, params);
    }

    public void setPrecomputedText(f precomputed) {
        s.m(this);
    }

    public final void e() {
        Future<PrecomputedTextCompat> future = this.f383f;
        if (future != null) {
            try {
                this.f383f = null;
                a.a(future.get());
                s.m(this);
            } catch (InterruptedException e2) {
            } catch (ExecutionException e3) {
            }
        }
    }

    @Override // android.widget.TextView
    public CharSequence getText() {
        e();
        return super.getText();
    }

    @Override // android.widget.TextView
    public void setTextClassifier(TextClassifier textClassifier) {
        f1 f1Var;
        if (Build.VERSION.SDK_INT >= 28 || (f1Var = this.f381d) == null) {
            super.setTextClassifier(textClassifier);
        } else {
            f1Var.b(textClassifier);
        }
    }

    @Override // android.widget.TextView
    public TextClassifier getTextClassifier() {
        f1 f1Var;
        if (Build.VERSION.SDK_INT >= 28 || (f1Var = this.f381d) == null) {
            return super.getTextClassifier();
        }
        return f1Var.a();
    }

    public void setTextFuture(Future<f> future) {
        this.f383f = future;
        if (future != null) {
            requestLayout();
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        e();
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
    }

    @Override // android.widget.TextView
    public void setCompoundDrawables(Drawable left, Drawable top, Drawable right, Drawable bottom) {
        super.setCompoundDrawables(left, top, right, bottom);
        i1 i1Var = this.f380c;
        if (i1Var != null) {
            i1Var.p();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelative(Drawable start, Drawable top, Drawable end, Drawable bottom) {
        super.setCompoundDrawablesRelative(start, top, end, bottom);
        i1 i1Var = this.f380c;
        if (i1Var != null) {
            i1Var.p();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesWithIntrinsicBounds(Drawable left, Drawable top, Drawable right, Drawable bottom) {
        super.setCompoundDrawablesWithIntrinsicBounds(left, top, right, bottom);
        i1 i1Var = this.f380c;
        if (i1Var != null) {
            i1Var.p();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesWithIntrinsicBounds(int left, int top, int right, int bottom) {
        Context context = getContext();
        Drawable drawable = null;
        Drawable b2 = left != 0 ? e.a.b(context, left) : null;
        Drawable b3 = top != 0 ? e.a.b(context, top) : null;
        Drawable b4 = right != 0 ? e.a.b(context, right) : null;
        if (bottom != 0) {
            drawable = e.a.b(context, bottom);
        }
        setCompoundDrawablesWithIntrinsicBounds(b2, b3, b4, drawable);
        i1 i1Var = this.f380c;
        if (i1Var != null) {
            i1Var.p();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelativeWithIntrinsicBounds(Drawable start, Drawable top, Drawable end, Drawable bottom) {
        super.setCompoundDrawablesRelativeWithIntrinsicBounds(start, top, end, bottom);
        i1 i1Var = this.f380c;
        if (i1Var != null) {
            i1Var.p();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelativeWithIntrinsicBounds(int start, int top, int end, int bottom) {
        Context context = getContext();
        Drawable drawable = null;
        Drawable b2 = start != 0 ? e.a.b(context, start) : null;
        Drawable b3 = top != 0 ? e.a.b(context, top) : null;
        Drawable b4 = end != 0 ? e.a.b(context, end) : null;
        if (bottom != 0) {
            drawable = e.a.b(context, bottom);
        }
        setCompoundDrawablesRelativeWithIntrinsicBounds(b2, b3, b4, drawable);
        i1 i1Var = this.f380c;
        if (i1Var != null) {
            i1Var.p();
        }
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f380c.j();
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList tintList) {
        this.f380c.w(tintList);
        this.f380c.b();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f380c.k();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode tintMode) {
        this.f380c.x(tintMode);
        this.f380c.b();
    }

    @Override // android.widget.TextView
    public void setTypeface(Typeface tf, int style) {
        if (!this.f382e) {
            Typeface finalTypeface = null;
            if (tf != null && style > 0) {
                finalTypeface = x.d.a(getContext(), tf, style);
            }
            this.f382e = true;
            try {
                super.setTypeface(finalTypeface != null ? finalTypeface : tf, style);
            } finally {
                this.f382e = false;
            }
        }
    }
}
