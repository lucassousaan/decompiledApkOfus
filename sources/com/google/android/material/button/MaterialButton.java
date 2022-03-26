package com.google.android.material.button;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import android.widget.Checkable;
import android.widget.CompoundButton;
import androidx.appcompat.widget.y;
import b1.b;
import b1.e;
import b1.h;
import com.example.helloworld.R;
import f0.c1;
import i0.s;
import java.util.Iterator;
import java.util.LinkedHashSet;
import l1.q;
import l1.w;
import n1.d;
import q1.d0;
import q1.k;
import t1.a;

/* JADX WARN: Classes with same name are omitted:
  
 */
/* loaded from: classes.dex */
public class MaterialButton extends y implements Checkable, d0 {

    /* renamed from: q  reason: collision with root package name */
    public static final int[] f1286q = {16842911};

    /* renamed from: r  reason: collision with root package name */
    public static final int[] f1287r = {16842912};

    /* renamed from: s  reason: collision with root package name */
    public static final int f1288s = 2131755630;

    /* renamed from: d  reason: collision with root package name */
    public final e f1289d;

    /* renamed from: e  reason: collision with root package name */
    public final LinkedHashSet f1290e;

    /* renamed from: f  reason: collision with root package name */
    public b f1291f;

    /* renamed from: g  reason: collision with root package name */
    public PorterDuff.Mode f1292g;

    /* renamed from: h  reason: collision with root package name */
    public ColorStateList f1293h;

    /* renamed from: i  reason: collision with root package name */
    public Drawable f1294i;

    /* renamed from: j  reason: collision with root package name */
    public int f1295j;

    /* renamed from: k  reason: collision with root package name */
    public int f1296k;

    /* renamed from: l  reason: collision with root package name */
    public int f1297l;

    /* renamed from: m  reason: collision with root package name */
    public int f1298m;

    /* renamed from: n  reason: collision with root package name */
    public boolean f1299n;

    /* renamed from: o  reason: collision with root package name */
    public boolean f1300o;

    /* renamed from: p  reason: collision with root package name */
    public int f1301p;

    public MaterialButton(Context context, AttributeSet attrs) {
        this(context, attrs, R.attr.materialButtonStyle);
    }

    public MaterialButton(Context context, AttributeSet attrs, int defStyleAttr) {
        super(a.c(context, attrs, defStyleAttr, 2131755630), attrs, defStyleAttr);
        this.f1290e = new LinkedHashSet();
        boolean z2 = false;
        this.f1299n = false;
        this.f1300o = false;
        Context context2 = getContext();
        TypedArray attributes = q.h(context2, attrs, v0.a.f3614k, defStyleAttr, 2131755630, new int[0]);
        int[] iArr = v0.a.f3604a;
        this.f1298m = attributes.getDimensionPixelSize(12, 0);
        this.f1292g = w.e(attributes.getInt(15, -1), PorterDuff.Mode.SRC_IN);
        this.f1293h = d.a(getContext(), attributes, 14);
        this.f1294i = d.d(getContext(), attributes, 10);
        this.f1301p = attributes.getInteger(11, 1);
        this.f1295j = attributes.getDimensionPixelSize(13, 0);
        q1.q shapeAppearanceModel = q1.q.e(context2, attrs, defStyleAttr, 2131755630).m();
        e eVar = new e(this, shapeAppearanceModel);
        this.f1289d = eVar;
        eVar.q(attributes);
        attributes.recycle();
        setCompoundDrawablePadding(this.f1298m);
        j(this.f1294i != null ? true : z2);
    }

    private String getA11yClassName() {
        return (b() ? CompoundButton.class : Button.class).getName();
    }

    @Override // androidx.appcompat.widget.y, android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo info) {
        super.onInitializeAccessibilityNodeInfo(info);
        info.setClassName(getA11yClassName());
        info.setCheckable(b());
        info.setChecked(isChecked());
        info.setClickable(isClickable());
    }

    @Override // androidx.appcompat.widget.y, android.view.View
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(getA11yClassName());
        accessibilityEvent.setChecked(isChecked());
    }

    @Override // android.widget.TextView, android.view.View
    public Parcelable onSaveInstanceState() {
        Parcelable superState = super.onSaveInstanceState();
        b1.d savedState = new b1.d(superState);
        savedState.f1137d = this.f1299n;
        return savedState;
    }

    @Override // android.widget.TextView, android.view.View
    public void onRestoreInstanceState(Parcelable state) {
        if (!(state instanceof b1.d)) {
            super.onRestoreInstanceState(state);
            return;
        }
        b1.d savedState = (b1.d) state;
        super.onRestoreInstanceState(savedState.i());
        setChecked(savedState.f1137d);
    }

    @Override // androidx.appcompat.widget.y
    public void setSupportBackgroundTintList(ColorStateList tint) {
        if (g()) {
            this.f1289d.C(tint);
        } else {
            super.setSupportBackgroundTintList(tint);
        }
    }

    @Override // androidx.appcompat.widget.y
    public ColorStateList getSupportBackgroundTintList() {
        if (g()) {
            return this.f1289d.l();
        }
        return super.getSupportBackgroundTintList();
    }

    @Override // androidx.appcompat.widget.y
    public void setSupportBackgroundTintMode(PorterDuff.Mode tintMode) {
        if (g()) {
            this.f1289d.D(tintMode);
        } else {
            super.setSupportBackgroundTintMode(tintMode);
        }
    }

    @Override // androidx.appcompat.widget.y
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        if (g()) {
            return this.f1289d.m();
        }
        return super.getSupportBackgroundTintMode();
    }

    @Override // android.view.View
    public void setBackgroundTintList(ColorStateList tintList) {
        setSupportBackgroundTintList(tintList);
    }

    @Override // android.view.View
    public ColorStateList getBackgroundTintList() {
        return getSupportBackgroundTintList();
    }

    @Override // android.view.View
    public void setBackgroundTintMode(PorterDuff.Mode tintMode) {
        setSupportBackgroundTintMode(tintMode);
    }

    @Override // android.view.View
    public PorterDuff.Mode getBackgroundTintMode() {
        return getSupportBackgroundTintMode();
    }

    @Override // android.view.View
    public void setBackgroundColor(int color) {
        if (g()) {
            this.f1289d.r(color);
        } else {
            super.setBackgroundColor(color);
        }
    }

    @Override // android.view.View
    public void setBackground(Drawable background) {
        setBackgroundDrawable(background);
    }

    @Override // androidx.appcompat.widget.y, android.view.View
    public void setBackgroundResource(int backgroundResourceId) {
        Drawable background = null;
        if (backgroundResourceId != 0) {
            background = e.a.b(getContext(), backgroundResourceId);
        }
        setBackgroundDrawable(background);
    }

    @Override // androidx.appcompat.widget.y, android.view.View
    public void setBackgroundDrawable(Drawable background) {
        if (!g()) {
            super.setBackgroundDrawable(background);
        } else if (background != getBackground()) {
            Log.w("MaterialButton", "MaterialButton manages its own background to control elevation, shape, color and states. Consider using backgroundTint, shapeAppearance and other attributes where available. A custom background will ignore these attributes and you should consider handling interaction states such as pressed, focused and disabled");
            this.f1289d.s();
            super.setBackgroundDrawable(background);
        } else {
            getBackground().setState(background.getState());
        }
    }

    @Override // androidx.appcompat.widget.y, android.widget.TextView, android.view.View
    public void onLayout(boolean changed, int left, int top, int right, int bottom) {
        super.onLayout(changed, left, top, right, bottom);
    }

    @Override // android.view.View
    public void onSizeChanged(int w2, int h2, int oldw, int oldh) {
        super.onSizeChanged(w2, h2, oldw, oldh);
        k(w2, h2);
    }

    @Override // androidx.appcompat.widget.y, android.widget.TextView
    public void onTextChanged(CharSequence charSequence, int i2, int i12, int i22) {
        super.onTextChanged(charSequence, i2, i12, i22);
        k(getMeasuredWidth(), getMeasuredHeight());
    }

    @Override // android.widget.TextView, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (g()) {
            k.f(this, this.f1289d.f());
        }
    }

    @Override // android.view.View
    public void setElevation(float elevation) {
        super.setElevation(elevation);
        if (g()) {
            this.f1289d.f().S(elevation);
        }
    }

    public final void k(int buttonWidth, int buttonHeight) {
        if (this.f1294i != null && getLayout() != null) {
            if (d() || c()) {
                this.f1297l = 0;
                int i2 = this.f1301p;
                boolean z2 = true;
                if (i2 == 1 || i2 == 3) {
                    this.f1296k = 0;
                    j(false);
                    return;
                }
                int localIconSize = this.f1295j;
                if (localIconSize == 0) {
                    localIconSize = this.f1294i.getIntrinsicWidth();
                }
                int newIconLeft = (((((buttonWidth - getTextWidth()) - c1.E(this)) - localIconSize) - this.f1298m) - c1.F(this)) / 2;
                boolean f2 = f();
                if (this.f1301p != 4) {
                    z2 = false;
                }
                if (f2 != z2) {
                    newIconLeft = -newIconLeft;
                }
                if (this.f1296k != newIconLeft) {
                    this.f1296k = newIconLeft;
                    j(false);
                }
            } else if (e()) {
                this.f1296k = 0;
                if (this.f1301p == 16) {
                    this.f1297l = 0;
                    j(false);
                    return;
                }
                int localIconSize2 = this.f1295j;
                if (localIconSize2 == 0) {
                    localIconSize2 = this.f1294i.getIntrinsicHeight();
                }
                int newIconTop = (((((buttonHeight - getTextHeight()) - getPaddingTop()) - localIconSize2) - this.f1298m) - getPaddingBottom()) / 2;
                if (this.f1297l != newIconTop) {
                    this.f1297l = newIconTop;
                    j(false);
                }
            }
        }
    }

    private int getTextWidth() {
        Paint textPaint = getPaint();
        String buttonText = getText().toString();
        if (getTransformationMethod() != null) {
            buttonText = getTransformationMethod().getTransformation(buttonText, this).toString();
        }
        return Math.min((int) textPaint.measureText(buttonText), getLayout().getEllipsizedWidth());
    }

    private int getTextHeight() {
        Paint textPaint = getPaint();
        String buttonText = getText().toString();
        if (getTransformationMethod() != null) {
            buttonText = getTransformationMethod().getTransformation(buttonText, this).toString();
        }
        Rect bounds = new Rect();
        textPaint.getTextBounds(buttonText, 0, buttonText.length(), bounds);
        return Math.min(bounds.height(), getLayout().getHeight());
    }

    public final boolean f() {
        return c1.A(this) == 1;
    }

    public void setInternalBackground(Drawable background) {
        super.setBackgroundDrawable(background);
    }

    public void setIconPadding(int iconPadding) {
        if (this.f1298m != iconPadding) {
            this.f1298m = iconPadding;
            setCompoundDrawablePadding(iconPadding);
        }
    }

    public int getIconPadding() {
        return this.f1298m;
    }

    public void setIconSize(int iconSize) {
        if (iconSize < 0) {
            throw new IllegalArgumentException("iconSize cannot be less than 0");
        } else if (this.f1295j != iconSize) {
            this.f1295j = iconSize;
            j(true);
        }
    }

    public int getIconSize() {
        return this.f1295j;
    }

    public void setIcon(Drawable icon) {
        if (this.f1294i != icon) {
            this.f1294i = icon;
            j(true);
            k(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public void setIconResource(int iconResourceId) {
        Drawable icon = null;
        if (iconResourceId != 0) {
            icon = e.a.b(getContext(), iconResourceId);
        }
        setIcon(icon);
    }

    public Drawable getIcon() {
        return this.f1294i;
    }

    public void setIconTint(ColorStateList iconTint) {
        if (this.f1293h != iconTint) {
            this.f1293h = iconTint;
            j(false);
        }
    }

    public void setIconTintResource(int iconTintResourceId) {
        setIconTint(e.a.a(getContext(), iconTintResourceId));
    }

    public ColorStateList getIconTint() {
        return this.f1293h;
    }

    public void setIconTintMode(PorterDuff.Mode iconTintMode) {
        if (this.f1292g != iconTintMode) {
            this.f1292g = iconTintMode;
            j(false);
        }
    }

    public PorterDuff.Mode getIconTintMode() {
        return this.f1292g;
    }

    public final void j(boolean needsIconReset) {
        Drawable drawable = this.f1294i;
        if (drawable != null) {
            y.a.l(drawable);
            Drawable mutate = drawable.mutate();
            this.f1294i = mutate;
            y.a.i(mutate, this.f1293h);
            PorterDuff.Mode mode = this.f1292g;
            if (mode != null) {
                y.a.j(this.f1294i, mode);
            }
            int width = this.f1295j;
            if (width == 0) {
                width = this.f1294i.getIntrinsicWidth();
            }
            int height = this.f1295j;
            if (height == 0) {
                height = this.f1294i.getIntrinsicHeight();
            }
            Drawable drawable2 = this.f1294i;
            int i2 = this.f1296k;
            int i3 = this.f1297l;
            drawable2.setBounds(i2, i3, i2 + width, i3 + height);
        }
        if (needsIconReset) {
            i();
            return;
        }
        Drawable[] existingDrawables = s.a(this);
        boolean hasIconChanged = false;
        Drawable drawableStart = existingDrawables[0];
        Drawable drawableTop = existingDrawables[1];
        Drawable drawableEnd = existingDrawables[2];
        if ((d() && drawableStart != this.f1294i) || ((c() && drawableEnd != this.f1294i) || (e() && drawableTop != this.f1294i))) {
            hasIconChanged = true;
        }
        if (hasIconChanged) {
            i();
        }
    }

    public final void i() {
        if (d()) {
            s.i(this, this.f1294i, null, null, null);
        } else if (c()) {
            s.i(this, null, null, this.f1294i, null);
        } else if (e()) {
            s.i(this, null, this.f1294i, null, null);
        }
    }

    public final boolean d() {
        int i2 = this.f1301p;
        return i2 == 1 || i2 == 2;
    }

    public final boolean c() {
        int i2 = this.f1301p;
        return i2 == 3 || i2 == 4;
    }

    public final boolean e() {
        int i2 = this.f1301p;
        return i2 == 16 || i2 == 32;
    }

    public void setRippleColor(ColorStateList rippleColor) {
        if (g()) {
            this.f1289d.x(rippleColor);
        }
    }

    public void setRippleColorResource(int rippleColorResourceId) {
        if (g()) {
            setRippleColor(e.a.a(getContext(), rippleColorResourceId));
        }
    }

    public ColorStateList getRippleColor() {
        if (g()) {
            return this.f1289d.h();
        }
        return null;
    }

    public void setStrokeColor(ColorStateList strokeColor) {
        if (g()) {
            this.f1289d.A(strokeColor);
        }
    }

    public void setStrokeColorResource(int strokeColorResourceId) {
        if (g()) {
            setStrokeColor(e.a.a(getContext(), strokeColorResourceId));
        }
    }

    public ColorStateList getStrokeColor() {
        if (g()) {
            return this.f1289d.j();
        }
        return null;
    }

    public void setStrokeWidth(int strokeWidth) {
        if (g()) {
            this.f1289d.B(strokeWidth);
        }
    }

    public void setStrokeWidthResource(int strokeWidthResourceId) {
        if (g()) {
            setStrokeWidth(getResources().getDimensionPixelSize(strokeWidthResourceId));
        }
    }

    public int getStrokeWidth() {
        if (g()) {
            return this.f1289d.k();
        }
        return 0;
    }

    public void setCornerRadius(int cornerRadius) {
        if (g()) {
            this.f1289d.u(cornerRadius);
        }
    }

    public void setCornerRadiusResource(int cornerRadiusResourceId) {
        if (g()) {
            setCornerRadius(getResources().getDimensionPixelSize(cornerRadiusResourceId));
        }
    }

    public int getCornerRadius() {
        if (g()) {
            return this.f1289d.b();
        }
        return 0;
    }

    public int getIconGravity() {
        return this.f1301p;
    }

    public void setIconGravity(int iconGravity) {
        if (this.f1301p != iconGravity) {
            this.f1301p = iconGravity;
            k(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public void setInsetBottom(int insetBottom) {
        this.f1289d.v(insetBottom);
    }

    public int getInsetBottom() {
        return this.f1289d.c();
    }

    public void setInsetTop(int insetTop) {
        this.f1289d.w(insetTop);
    }

    public int getInsetTop() {
        return this.f1289d.d();
    }

    @Override // android.widget.TextView, android.view.View
    public int[] onCreateDrawableState(int extraSpace) {
        int[] drawableState = super.onCreateDrawableState(extraSpace + 2);
        if (b()) {
            Button.mergeDrawableStates(drawableState, f1286q);
        }
        if (isChecked()) {
            Button.mergeDrawableStates(drawableState, f1287r);
        }
        return drawableState;
    }

    public void a(b1.a listener) {
        this.f1290e.add(listener);
    }

    public void h(b1.a listener) {
        this.f1290e.remove(listener);
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean checked) {
        if (b() && isEnabled() && this.f1299n != checked) {
            this.f1299n = checked;
            refreshDrawableState();
            if (!this.f1300o) {
                this.f1300o = true;
                Iterator it = this.f1290e.iterator();
                while (it.hasNext()) {
                    b1.a listener = (b1.a) it.next();
                    ((h) listener).a(this, this.f1299n);
                }
                this.f1300o = false;
            }
        }
    }

    @Override // android.widget.Checkable
    public boolean isChecked() {
        return this.f1299n;
    }

    @Override // android.widget.Checkable
    public void toggle() {
        setChecked(!this.f1299n);
    }

    @Override // android.view.View
    public boolean performClick() {
        toggle();
        return super.performClick();
    }

    public boolean b() {
        e eVar = this.f1289d;
        return eVar != null && eVar.p();
    }

    public void setCheckable(boolean checkable) {
        if (g()) {
            this.f1289d.t(checkable);
        }
    }

    @Override // q1.d0
    public void setShapeAppearanceModel(q1.q shapeAppearanceModel) {
        if (g()) {
            this.f1289d.y(shapeAppearanceModel);
            return;
        }
        throw new IllegalStateException("Attempted to set ShapeAppearanceModel on a MaterialButton which has an overwritten background.");
    }

    public q1.q getShapeAppearanceModel() {
        if (g()) {
            return this.f1289d.i();
        }
        throw new IllegalStateException("Attempted to get ShapeAppearanceModel from a MaterialButton which has an overwritten background.");
    }

    public void setOnPressedChangeListenerInternal(b listener) {
        this.f1291f = listener;
    }

    @Override // android.view.View
    public void setPressed(boolean pressed) {
        b bVar = this.f1291f;
        if (bVar != null) {
            ((b1.k) bVar).a(this, pressed);
        }
        super.setPressed(pressed);
    }

    public final boolean g() {
        e eVar = this.f1289d;
        return eVar != null && !eVar.o();
    }

    public void setShouldDrawSurfaceColorStroke(boolean shouldDrawSurfaceColorStroke) {
        if (g()) {
            this.f1289d.z(shouldDrawSurfaceColorStroke);
        }
    }
}
