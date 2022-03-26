package androidx.appcompat.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import com.example.helloworld.R;
import i0.d;
import i0.s;

/* JADX WARN: Classes with same name are omitted:
  
 */
/* loaded from: classes.dex */
public class y extends Button implements d {

    /* renamed from: b  reason: collision with root package name */
    public final x f586b;

    /* renamed from: c  reason: collision with root package name */
    public final i1 f587c;

    public y(Context context, AttributeSet attrs) {
        this(context, attrs, R.attr.buttonStyle);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        p3.b(context);
        o3.a(this, getContext());
        x xVar = new x(this);
        this.f586b = xVar;
        xVar.e(attrs, defStyleAttr);
        i1 i1Var = new i1(this);
        this.f587c = i1Var;
        i1Var.m(attrs, defStyleAttr);
        i1Var.b();
    }

    @Override // android.view.View
    public void setBackgroundResource(int resId) {
        super.setBackgroundResource(resId);
        x xVar = this.f586b;
        if (xVar != null) {
            xVar.g(resId);
        }
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable background) {
        super.setBackgroundDrawable(background);
        x xVar = this.f586b;
        if (xVar != null) {
            xVar.f();
        }
    }

    public void setSupportBackgroundTintList(ColorStateList tint) {
        x xVar = this.f586b;
        if (xVar != null) {
            xVar.i(tint);
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        x xVar = this.f586b;
        if (xVar != null) {
            return xVar.c();
        }
        return null;
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode tintMode) {
        x xVar = this.f586b;
        if (xVar != null) {
            xVar.j(tintMode);
        }
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        x xVar = this.f586b;
        if (xVar != null) {
            return xVar.d();
        }
        return null;
    }

    @Override // android.widget.TextView, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        x xVar = this.f586b;
        if (xVar != null) {
            xVar.b();
        }
        i1 i1Var = this.f587c;
        if (i1Var != null) {
            i1Var.b();
        }
    }

    @Override // android.widget.TextView
    public void setTextAppearance(Context context, int resId) {
        super.setTextAppearance(context, resId);
        i1 i1Var = this.f587c;
        if (i1Var != null) {
            i1Var.q(context, resId);
        }
    }

    @Override // android.view.View
    public void onInitializeAccessibilityEvent(AccessibilityEvent event) {
        super.onInitializeAccessibilityEvent(event);
        event.setClassName(Button.class.getName());
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo info) {
        super.onInitializeAccessibilityNodeInfo(info);
        info.setClassName(Button.class.getName());
    }

    @Override // android.widget.TextView, android.view.View
    public void onLayout(boolean changed, int left, int top, int right, int bottom) {
        super.onLayout(changed, left, top, right, bottom);
        i1 i1Var = this.f587c;
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
        i1 i1Var = this.f587c;
        if (i1Var != null) {
            i1Var.A(unit, size);
        }
    }

    @Override // android.widget.TextView
    public void onTextChanged(CharSequence text, int start, int lengthBefore, int lengthAfter) {
        super.onTextChanged(text, start, lengthBefore, lengthAfter);
        i1 i1Var = this.f587c;
        if (i1Var != null && !d.f2255a && i1Var.l()) {
            this.f587c.c();
        }
    }

    @Override // android.widget.TextView
    public void setAutoSizeTextTypeWithDefaults(int autoSizeTextType) {
        if (d.f2255a) {
            super.setAutoSizeTextTypeWithDefaults(autoSizeTextType);
            return;
        }
        i1 i1Var = this.f587c;
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
        i1 i1Var = this.f587c;
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
        i1 i1Var = this.f587c;
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
        i1 i1Var = this.f587c;
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
        i1 i1Var = this.f587c;
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
        i1 i1Var = this.f587c;
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
        i1 i1Var = this.f587c;
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
        i1 i1Var = this.f587c;
        if (i1Var != null) {
            return i1Var.h();
        }
        return new int[0];
    }

    public void setSupportAllCaps(boolean allCaps) {
        i1 i1Var = this.f587c;
        if (i1Var != null) {
            i1Var.s(allCaps);
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback actionModeCallback) {
        super.setCustomSelectionActionModeCallback(s.p(this, actionModeCallback));
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList tint) {
        this.f587c.w(tint);
        this.f587c.b();
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f587c.j();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode tintMode) {
        this.f587c.x(tintMode);
        this.f587c.b();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f587c.k();
    }
}
