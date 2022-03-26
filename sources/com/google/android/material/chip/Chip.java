package com.google.android.material.chip;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.RippleDrawable;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.PointerIcon;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.TextView;
import androidx.appcompat.widget.z;
import com.example.helloworld.R;
import e1.b;
import e1.c;
import e1.d;
import e1.e;
import f0.c1;
import g0.f;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import l1.q;
import l1.w;
import n1.g;
import n1.i;
import q1.d0;
import q1.k;
import t1.a;

/* JADX WARN: Classes with same name are omitted:
  
 */
/* loaded from: classes.dex */
public class Chip extends z implements d, d0 {

    /* renamed from: u  reason: collision with root package name */
    public static final int f1314u = 2131755644;

    /* renamed from: v  reason: collision with root package name */
    public static final Rect f1315v = new Rect();

    /* renamed from: w  reason: collision with root package name */
    public static final int[] f1316w = {16842913};

    /* renamed from: x  reason: collision with root package name */
    public static final int[] f1317x = {16842911};

    /* renamed from: e  reason: collision with root package name */
    public e f1318e;

    /* renamed from: f  reason: collision with root package name */
    public InsetDrawable f1319f;

    /* renamed from: g  reason: collision with root package name */
    public RippleDrawable f1320g;

    /* renamed from: h  reason: collision with root package name */
    public View.OnClickListener f1321h;

    /* renamed from: i  reason: collision with root package name */
    public CompoundButton.OnCheckedChangeListener f1322i;

    /* renamed from: j  reason: collision with root package name */
    public boolean f1323j;

    /* renamed from: k  reason: collision with root package name */
    public boolean f1324k;

    /* renamed from: l  reason: collision with root package name */
    public boolean f1325l;

    /* renamed from: m  reason: collision with root package name */
    public boolean f1326m;

    /* renamed from: n  reason: collision with root package name */
    public boolean f1327n;

    /* renamed from: o  reason: collision with root package name */
    public int f1328o;

    /* renamed from: p  reason: collision with root package name */
    public int f1329p;

    /* renamed from: q  reason: collision with root package name */
    public final c f1330q;

    /* renamed from: r  reason: collision with root package name */
    public final Rect f1331r;

    /* renamed from: s  reason: collision with root package name */
    public final RectF f1332s;

    /* renamed from: t  reason: collision with root package name */
    public final i f1333t;

    public Chip(Context context, AttributeSet attrs) {
        this(context, attrs, R.attr.chipStyle);
    }

    public Chip(Context context, AttributeSet attrs, int defStyleAttr) {
        super(a.c(context, attrs, defStyleAttr, 2131755644), attrs, defStyleAttr);
        this.f1331r = new Rect();
        this.f1332s = new RectF();
        this.f1333t = new e1.a(this);
        Context context2 = getContext();
        B(attrs);
        e drawable = e.o0(context2, attrs, defStyleAttr, 2131755644);
        m(context2, attrs, defStyleAttr);
        setChipDrawable(drawable);
        drawable.S(c1.v(this));
        TypedArray a2 = q.h(context2, attrs, v0.a.f3605b, defStyleAttr, 2131755644, new int[0]);
        int[] iArr = v0.a.f3604a;
        boolean hasShapeAppearanceAttribute = a2.hasValue(37);
        a2.recycle();
        this.f1330q = new c(this, this);
        w();
        if (!hasShapeAppearanceAttribute) {
            n();
        }
        setChecked(this.f1323j);
        setText(drawable.a1());
        setEllipsize(drawable.U0());
        A();
        if (!this.f1318e.F2()) {
            setLines(1);
            setHorizontallyScrolling(true);
        }
        setGravity(8388627);
        z();
        if (u()) {
            setMinHeight(this.f1329p);
        }
        this.f1328o = c1.A(this);
    }

    @Override // android.widget.TextView, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        k.f(this, this.f1318e);
    }

    @Override // android.view.View
    public void setElevation(float elevation) {
        super.setElevation(elevation);
        e eVar = this.f1318e;
        if (eVar != null) {
            eVar.S(elevation);
        }
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo info) {
        super.onInitializeAccessibilityNodeInfo(info);
        if (p() || isClickable()) {
            info.setClassName(p() ? "android.widget.CompoundButton" : "android.widget.Button");
        } else {
            info.setClassName("android.view.View");
        }
        info.setCheckable(p());
        info.setClickable(isClickable());
        if (getParent() instanceof ChipGroup) {
            ChipGroup chipGroup = (ChipGroup) getParent();
            f infoCompat = f.v0(info);
            int columnIndex = chipGroup.c() ? chipGroup.o(this) : -1;
            infoCompat.Z(g0.e.a(chipGroup.b(this), 1, columnIndex, 1, false, isChecked()));
        }
    }

    public final void w() {
        if (!l() || !q() || this.f1321h == null) {
            c1.l0(this, null);
        } else {
            c1.l0(this, this.f1330q);
        }
    }

    public final void m(Context context, AttributeSet attrs, int defStyleAttr) {
        TypedArray a2 = q.h(context, attrs, v0.a.f3605b, defStyleAttr, 2131755644, new int[0]);
        int[] iArr = v0.a.f3604a;
        this.f1327n = a2.getBoolean(32, false);
        float defaultMinTouchTargetSize = (float) Math.ceil(w.b(getContext(), 48));
        this.f1329p = (int) Math.ceil(a2.getDimension(20, defaultMinTouchTargetSize));
        a2.recycle();
    }

    public final void z() {
        e eVar;
        if (!TextUtils.isEmpty(getText()) && (eVar = this.f1318e) != null) {
            int paddingEnd = (int) (eVar.C0() + this.f1318e.c1() + this.f1318e.j0());
            int paddingStart = (int) (this.f1318e.H0() + this.f1318e.d1() + this.f1318e.g0());
            if (this.f1319f != null) {
                Rect padding = new Rect();
                this.f1319f.getPadding(padding);
                paddingStart += padding.left;
                paddingEnd += padding.right;
            }
            c1.v0(this, paddingStart, getPaddingTop(), paddingEnd, getPaddingBottom());
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void onRtlPropertiesChanged(int layoutDirection) {
        super.onRtlPropertiesChanged(layoutDirection);
        if (this.f1328o != layoutDirection) {
            this.f1328o = layoutDirection;
            z();
        }
    }

    public final void B(AttributeSet attributeSet) {
        if (attributeSet != null) {
            if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "background") != null) {
                Log.w("Chip", "Do not set the background; Chip manages its own background drawable.");
            }
            if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableLeft") != null) {
                throw new UnsupportedOperationException("Please set left drawable using R.attr#chipIcon.");
            } else if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableStart") != null) {
                throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
            } else if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableEnd") != null) {
                throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
            } else if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableRight") != null) {
                throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
            } else if (!attributeSet.getAttributeBooleanValue("http://schemas.android.com/apk/res/android", "singleLine", true) || attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "lines", 1) != 1 || attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "minLines", 1) != 1 || attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "maxLines", 1) != 1) {
                throw new UnsupportedOperationException("Chip does not support multi-line text");
            } else if (attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "gravity", 8388627) != 8388627) {
                Log.w("Chip", "Chip text must be vertically center and start aligned");
            }
        }
    }

    public final void n() {
        setOutlineProvider(new b(this));
    }

    public Drawable getChipDrawable() {
        return this.f1318e;
    }

    public void setChipDrawable(e drawable) {
        e eVar = this.f1318e;
        if (eVar != drawable) {
            v(eVar);
            this.f1318e = drawable;
            drawable.u2(false);
            h(this.f1318e);
            j(this.f1329p);
        }
    }

    public final void x() {
        boolean z2 = o1.a.f2694a;
        y();
    }

    public Drawable getBackgroundDrawable() {
        InsetDrawable insetDrawable = this.f1319f;
        if (insetDrawable == null) {
            return this.f1318e;
        }
        return insetDrawable;
    }

    public final void y() {
        this.f1320g = new RippleDrawable(o1.a.a(this.f1318e.Y0()), getBackgroundDrawable(), null);
        this.f1318e.E2(false);
        c1.o0(this, this.f1320g);
        z();
    }

    public final void v(e chipDrawable) {
        if (chipDrawable != null) {
            chipDrawable.j2(null);
        }
    }

    public final void h(e chipDrawable) {
        chipDrawable.j2(this);
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public int[] onCreateDrawableState(int extraSpace) {
        int[] state = super.onCreateDrawableState(extraSpace + 2);
        if (isChecked()) {
            CheckBox.mergeDrawableStates(state, f1316w);
        }
        if (p()) {
            CheckBox.mergeDrawableStates(state, f1317x);
        }
        return state;
    }

    @Override // android.widget.TextView
    public void setGravity(int gravity) {
        if (gravity != 8388627) {
            Log.w("Chip", "Chip text must be vertically center and start aligned");
        } else {
            super.setGravity(gravity);
        }
    }

    @Override // android.view.View
    public void setBackgroundTintList(ColorStateList tint) {
        Log.w("Chip", "Do not set the background tint list; Chip manages its own background drawable.");
    }

    @Override // android.view.View
    public void setBackgroundTintMode(PorterDuff.Mode tintMode) {
        Log.w("Chip", "Do not set the background tint mode; Chip manages its own background drawable.");
    }

    @Override // android.view.View
    public void setBackgroundColor(int color) {
        Log.w("Chip", "Do not set the background color; Chip manages its own background drawable.");
    }

    @Override // androidx.appcompat.widget.z, android.view.View
    public void setBackgroundResource(int resid) {
        Log.w("Chip", "Do not set the background resource; Chip manages its own background drawable.");
    }

    @Override // android.view.View
    public void setBackground(Drawable background) {
        if (background == getBackgroundDrawable() || background == this.f1320g) {
            super.setBackground(background);
        } else {
            Log.w("Chip", "Do not set the background; Chip manages its own background drawable.");
        }
    }

    @Override // androidx.appcompat.widget.z, android.view.View
    public void setBackgroundDrawable(Drawable background) {
        if (background == getBackgroundDrawable() || background == this.f1320g) {
            super.setBackgroundDrawable(background);
        } else {
            Log.w("Chip", "Do not set the background drawable; Chip manages its own background drawable.");
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawables(Drawable left, Drawable top, Drawable right, Drawable bottom) {
        if (left != null) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        } else if (right == null) {
            super.setCompoundDrawables(left, top, right, bottom);
        } else {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesWithIntrinsicBounds(int left, int top, int right, int bottom) {
        if (left != 0) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        } else if (right == 0) {
            super.setCompoundDrawablesWithIntrinsicBounds(left, top, right, bottom);
        } else {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesWithIntrinsicBounds(Drawable left, Drawable top, Drawable right, Drawable bottom) {
        if (left != null) {
            throw new UnsupportedOperationException("Please set left drawable using R.attr#chipIcon.");
        } else if (right == null) {
            super.setCompoundDrawablesWithIntrinsicBounds(left, top, right, bottom);
        } else {
            throw new UnsupportedOperationException("Please set right drawable using R.attr#closeIcon.");
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelative(Drawable start, Drawable top, Drawable end, Drawable bottom) {
        if (start != null) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        } else if (end == null) {
            super.setCompoundDrawablesRelative(start, top, end, bottom);
        } else {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelativeWithIntrinsicBounds(int start, int top, int end, int bottom) {
        if (start != 0) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        } else if (end == 0) {
            super.setCompoundDrawablesRelativeWithIntrinsicBounds(start, top, end, bottom);
        } else {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelativeWithIntrinsicBounds(Drawable start, Drawable top, Drawable end, Drawable bottom) {
        if (start != null) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        } else if (end == null) {
            super.setCompoundDrawablesRelativeWithIntrinsicBounds(start, top, end, bottom);
        } else {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
    }

    @Override // android.widget.TextView
    public TextUtils.TruncateAt getEllipsize() {
        e eVar = this.f1318e;
        if (eVar != null) {
            return eVar.U0();
        }
        return null;
    }

    @Override // android.widget.TextView
    public void setEllipsize(TextUtils.TruncateAt where) {
        if (this.f1318e != null) {
            if (where != TextUtils.TruncateAt.MARQUEE) {
                super.setEllipsize(where);
                e eVar = this.f1318e;
                if (eVar != null) {
                    eVar.k2(where);
                    return;
                }
                return;
            }
            throw new UnsupportedOperationException("Text within a chip are not allowed to scroll.");
        }
    }

    @Override // android.widget.TextView
    public void setSingleLine(boolean singleLine) {
        if (singleLine) {
            super.setSingleLine(singleLine);
            return;
        }
        throw new UnsupportedOperationException("Chip does not support multi-line text");
    }

    @Override // android.widget.TextView
    public void setLines(int lines) {
        if (lines <= 1) {
            super.setLines(lines);
            return;
        }
        throw new UnsupportedOperationException("Chip does not support multi-line text");
    }

    @Override // android.widget.TextView
    public void setMinLines(int minLines) {
        if (minLines <= 1) {
            super.setMinLines(minLines);
            return;
        }
        throw new UnsupportedOperationException("Chip does not support multi-line text");
    }

    @Override // android.widget.TextView
    public void setMaxLines(int maxLines) {
        if (maxLines <= 1) {
            super.setMaxLines(maxLines);
            return;
        }
        throw new UnsupportedOperationException("Chip does not support multi-line text");
    }

    @Override // android.widget.TextView
    public void setMaxWidth(int maxWidth) {
        super.setMaxWidth(maxWidth);
        e eVar = this.f1318e;
        if (eVar != null) {
            eVar.r2(maxWidth);
        }
    }

    public void r() {
        j(this.f1329p);
        requestLayout();
        invalidateOutline();
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public void setChecked(boolean checked) {
        CompoundButton.OnCheckedChangeListener onCheckedChangeListener;
        e eVar = this.f1318e;
        if (eVar == null) {
            this.f1323j = checked;
        } else if (eVar.h1()) {
            boolean wasChecked = isChecked();
            super.setChecked(checked);
            if (wasChecked != checked && (onCheckedChangeListener = this.f1322i) != null) {
                onCheckedChangeListener.onCheckedChanged(this, checked);
            }
        }
    }

    public void setOnCheckedChangeListenerInternal(CompoundButton.OnCheckedChangeListener listener) {
        this.f1322i = listener;
    }

    public void setOnCloseIconClickListener(View.OnClickListener listener) {
        this.f1321h = listener;
        w();
    }

    public boolean s() {
        boolean result;
        playSoundEffect(0);
        View.OnClickListener onClickListener = this.f1321h;
        if (onClickListener != null) {
            onClickListener.onClick(this);
            result = true;
        } else {
            result = false;
        }
        this.f1330q.U(1, 1);
        return result;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // android.widget.TextView, android.view.View
    public boolean onTouchEvent(MotionEvent event) {
        boolean handled = false;
        int action = event.getActionMasked();
        boolean eventInCloseIcon = getCloseIconTouchBounds().contains(event.getX(), event.getY());
        switch (action) {
            case 0:
                if (eventInCloseIcon) {
                    setCloseIconPressed(true);
                    handled = true;
                    break;
                }
                break;
            case 1:
                if (this.f1324k) {
                    s();
                    handled = true;
                }
                setCloseIconPressed(false);
                break;
            case 2:
                if (this.f1324k) {
                    if (!eventInCloseIcon) {
                        setCloseIconPressed(false);
                    }
                    handled = true;
                    break;
                }
                break;
            case 3:
                setCloseIconPressed(false);
                break;
        }
        return handled || super.onTouchEvent(event);
    }

    @Override // android.view.View
    public boolean onHoverEvent(MotionEvent event) {
        int action = event.getActionMasked();
        switch (action) {
            case 7:
                setCloseIconHovered(getCloseIconTouchBounds().contains(event.getX(), event.getY()));
                break;
            case 10:
                setCloseIconHovered(false);
                break;
        }
        return super.onHoverEvent(event);
    }

    public final boolean k(MotionEvent event) {
        if (event.getAction() == 10) {
            try {
                Field f2 = l0.d.class.getDeclaredField("m");
                f2.setAccessible(true);
                int mHoveredVirtualViewId = ((Integer) f2.get(this.f1330q)).intValue();
                if (mHoveredVirtualViewId != Integer.MIN_VALUE) {
                    Method m2 = l0.d.class.getDeclaredMethod("V", Integer.TYPE);
                    m2.setAccessible(true);
                    m2.invoke(this.f1330q, Integer.MIN_VALUE);
                    return true;
                }
            } catch (IllegalAccessException e2) {
                Log.e("Chip", "Unable to send Accessibility Exit event", e2);
            } catch (NoSuchFieldException e3) {
                Log.e("Chip", "Unable to send Accessibility Exit event", e3);
            } catch (NoSuchMethodException e4) {
                Log.e("Chip", "Unable to send Accessibility Exit event", e4);
            } catch (InvocationTargetException e5) {
                Log.e("Chip", "Unable to send Accessibility Exit event", e5);
            }
        }
        return false;
    }

    @Override // android.view.View
    public boolean dispatchHoverEvent(MotionEvent event) {
        return k(event) || this.f1330q.v(event) || super.dispatchHoverEvent(event);
    }

    @Override // android.view.View
    public boolean dispatchKeyEvent(KeyEvent event) {
        boolean handled = this.f1330q.w(event);
        if (!handled || this.f1330q.A() == Integer.MIN_VALUE) {
            return super.dispatchKeyEvent(event);
        }
        return true;
    }

    @Override // android.widget.TextView, android.view.View
    public void onFocusChanged(boolean focused, int direction, Rect previouslyFocusedRect) {
        super.onFocusChanged(focused, direction, previouslyFocusedRect);
        this.f1330q.I(focused, direction, previouslyFocusedRect);
    }

    @Override // android.widget.TextView, android.view.View
    public void getFocusedRect(Rect r2) {
        if (this.f1330q.A() == 1 || this.f1330q.x() == 1) {
            r2.set(getCloseIconTouchBoundsInt());
        } else {
            super.getFocusedRect(r2);
        }
    }

    private void setCloseIconPressed(boolean pressed) {
        if (this.f1324k != pressed) {
            this.f1324k = pressed;
            refreshDrawableState();
        }
    }

    private void setCloseIconHovered(boolean hovered) {
        if (this.f1325l != hovered) {
            this.f1325l = hovered;
            refreshDrawableState();
        }
    }

    @Override // androidx.appcompat.widget.z, android.widget.CompoundButton, android.widget.TextView, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        boolean changed = false;
        e eVar = this.f1318e;
        if (eVar != null && eVar.i1()) {
            changed = this.f1318e.f2(i());
        }
        if (changed) {
            invalidate();
        }
    }

    public final int[] i() {
        int count = 0;
        if (isEnabled()) {
            count = 0 + 1;
        }
        if (this.f1326m) {
            count++;
        }
        if (this.f1325l) {
            count++;
        }
        if (this.f1324k) {
            count++;
        }
        if (isChecked()) {
            count++;
        }
        int[] stateSet = new int[count];
        int i2 = 0;
        if (isEnabled()) {
            stateSet[0] = 16842910;
            i2 = 0 + 1;
        }
        if (this.f1326m) {
            stateSet[i2] = 16842908;
            i2++;
        }
        if (this.f1325l) {
            stateSet[i2] = 16843623;
            i2++;
        }
        if (this.f1324k) {
            stateSet[i2] = 16842919;
            i2++;
        }
        if (isChecked()) {
            stateSet[i2] = 16842913;
            int i3 = i2 + 1;
        }
        return stateSet;
    }

    public final boolean l() {
        e eVar = this.f1318e;
        return (eVar == null || eVar.K0() == null) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public RectF getCloseIconTouchBounds() {
        this.f1332s.setEmpty();
        if (l() && this.f1321h != null) {
            this.f1318e.R0(this.f1332s);
        }
        return this.f1332s;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Rect getCloseIconTouchBoundsInt() {
        RectF bounds = getCloseIconTouchBounds();
        this.f1331r.set((int) bounds.left, (int) bounds.top, (int) bounds.right, (int) bounds.bottom);
        return this.f1331r;
    }

    @Override // android.widget.Button, android.widget.TextView, android.view.View
    public PointerIcon onResolvePointerIcon(MotionEvent event, int pointerIndex) {
        if (!getCloseIconTouchBounds().contains(event.getX(), event.getY()) || !isEnabled()) {
            return null;
        }
        return PointerIcon.getSystemIcon(getContext(), 1002);
    }

    public ColorStateList getChipBackgroundColor() {
        e eVar = this.f1318e;
        if (eVar != null) {
            return eVar.A0();
        }
        return null;
    }

    public void setChipBackgroundColorResource(int id) {
        e eVar = this.f1318e;
        if (eVar != null) {
            eVar.A1(id);
        }
    }

    public void setChipBackgroundColor(ColorStateList chipBackgroundColor) {
        e eVar = this.f1318e;
        if (eVar != null) {
            eVar.z1(chipBackgroundColor);
        }
    }

    public float getChipMinHeight() {
        e eVar = this.f1318e;
        if (eVar != null) {
            return eVar.G0();
        }
        return 0.0f;
    }

    public void setChipMinHeightResource(int id) {
        e eVar = this.f1318e;
        if (eVar != null) {
            eVar.O1(id);
        }
    }

    public void setChipMinHeight(float minHeight) {
        e eVar = this.f1318e;
        if (eVar != null) {
            eVar.N1(minHeight);
        }
    }

    public float getChipCornerRadius() {
        e eVar = this.f1318e;
        if (eVar != null) {
            return Math.max(0.0f, eVar.B0());
        }
        return 0.0f;
    }

    @Deprecated
    public void setChipCornerRadiusResource(int id) {
        e eVar = this.f1318e;
        if (eVar != null) {
            eVar.C1(id);
        }
    }

    @Override // q1.d0
    public void setShapeAppearanceModel(q1.q shapeAppearanceModel) {
        this.f1318e.setShapeAppearanceModel(shapeAppearanceModel);
    }

    public q1.q getShapeAppearanceModel() {
        return this.f1318e.A();
    }

    @Deprecated
    public void setChipCornerRadius(float chipCornerRadius) {
        e eVar = this.f1318e;
        if (eVar != null) {
            eVar.B1(chipCornerRadius);
        }
    }

    public ColorStateList getChipStrokeColor() {
        e eVar = this.f1318e;
        if (eVar != null) {
            return eVar.I0();
        }
        return null;
    }

    public void setChipStrokeColorResource(int id) {
        e eVar = this.f1318e;
        if (eVar != null) {
            eVar.S1(id);
        }
    }

    public void setChipStrokeColor(ColorStateList chipStrokeColor) {
        e eVar = this.f1318e;
        if (eVar != null) {
            eVar.R1(chipStrokeColor);
        }
    }

    public float getChipStrokeWidth() {
        e eVar = this.f1318e;
        if (eVar != null) {
            return eVar.J0();
        }
        return 0.0f;
    }

    public void setChipStrokeWidthResource(int id) {
        e eVar = this.f1318e;
        if (eVar != null) {
            eVar.U1(id);
        }
    }

    public void setChipStrokeWidth(float chipStrokeWidth) {
        e eVar = this.f1318e;
        if (eVar != null) {
            eVar.T1(chipStrokeWidth);
        }
    }

    public ColorStateList getRippleColor() {
        e eVar = this.f1318e;
        if (eVar != null) {
            return eVar.Y0();
        }
        return null;
    }

    public void setRippleColorResource(int id) {
        e eVar = this.f1318e;
        if (eVar != null) {
            eVar.t2(id);
            if (!this.f1318e.f1()) {
                y();
            }
        }
    }

    public void setRippleColor(ColorStateList rippleColor) {
        e eVar = this.f1318e;
        if (eVar != null) {
            eVar.s2(rippleColor);
        }
        if (!this.f1318e.f1()) {
            y();
        }
    }

    @Deprecated
    public CharSequence getChipText() {
        return getText();
    }

    @Override // android.view.View
    public void setLayoutDirection(int layoutDirection) {
        if (this.f1318e != null) {
            super.setLayoutDirection(layoutDirection);
        }
    }

    @Override // android.widget.TextView
    public void setText(CharSequence text, TextView.BufferType type) {
        e eVar = this.f1318e;
        if (eVar != null) {
            if (text == null) {
                text = "";
            }
            super.setText(eVar.F2() ? null : text, type);
            e eVar2 = this.f1318e;
            if (eVar2 != null) {
                eVar2.x2(text);
            }
        }
    }

    @Deprecated
    public void setChipTextResource(int id) {
        setText(getResources().getString(id));
    }

    @Deprecated
    public void setChipText(CharSequence chipText) {
        setText(chipText);
    }

    public void setTextAppearanceResource(int id) {
        setTextAppearance(getContext(), id);
    }

    public void setTextAppearance(g textAppearance) {
        e eVar = this.f1318e;
        if (eVar != null) {
            eVar.y2(textAppearance);
        }
        A();
    }

    @Override // android.widget.TextView
    public void setTextAppearance(Context context, int resId) {
        super.setTextAppearance(context, resId);
        e eVar = this.f1318e;
        if (eVar != null) {
            eVar.z2(resId);
        }
        A();
    }

    @Override // android.widget.TextView
    public void setTextAppearance(int resId) {
        super.setTextAppearance(resId);
        e eVar = this.f1318e;
        if (eVar != null) {
            eVar.z2(resId);
        }
        A();
    }

    public final void A() {
        TextPaint textPaint = getPaint();
        e eVar = this.f1318e;
        if (eVar != null) {
            textPaint.drawableState = eVar.getState();
        }
        g textAppearance = getTextAppearance();
        if (textAppearance != null) {
            textAppearance.j(getContext(), textPaint, this.f1333t);
        }
    }

    private g getTextAppearance() {
        e eVar = this.f1318e;
        if (eVar != null) {
            return eVar.b1();
        }
        return null;
    }

    public void setChipIconVisible(int id) {
        e eVar = this.f1318e;
        if (eVar != null) {
            eVar.L1(id);
        }
    }

    public void setChipIconVisible(boolean chipIconVisible) {
        e eVar = this.f1318e;
        if (eVar != null) {
            eVar.M1(chipIconVisible);
        }
    }

    @Deprecated
    public void setChipIconEnabledResource(int id) {
        setChipIconVisible(id);
    }

    @Deprecated
    public void setChipIconEnabled(boolean chipIconEnabled) {
        setChipIconVisible(chipIconEnabled);
    }

    public Drawable getChipIcon() {
        e eVar = this.f1318e;
        if (eVar != null) {
            return eVar.D0();
        }
        return null;
    }

    public void setChipIconResource(int id) {
        e eVar = this.f1318e;
        if (eVar != null) {
            eVar.G1(id);
        }
    }

    public void setChipIcon(Drawable chipIcon) {
        e eVar = this.f1318e;
        if (eVar != null) {
            eVar.F1(chipIcon);
        }
    }

    public ColorStateList getChipIconTint() {
        e eVar = this.f1318e;
        if (eVar != null) {
            return eVar.F0();
        }
        return null;
    }

    public void setChipIconTintResource(int id) {
        e eVar = this.f1318e;
        if (eVar != null) {
            eVar.K1(id);
        }
    }

    public void setChipIconTint(ColorStateList chipIconTint) {
        e eVar = this.f1318e;
        if (eVar != null) {
            eVar.J1(chipIconTint);
        }
    }

    public float getChipIconSize() {
        e eVar = this.f1318e;
        if (eVar != null) {
            return eVar.E0();
        }
        return 0.0f;
    }

    public void setChipIconSizeResource(int id) {
        e eVar = this.f1318e;
        if (eVar != null) {
            eVar.I1(id);
        }
    }

    public void setChipIconSize(float chipIconSize) {
        e eVar = this.f1318e;
        if (eVar != null) {
            eVar.H1(chipIconSize);
        }
    }

    public boolean q() {
        e eVar = this.f1318e;
        return eVar != null && eVar.j1();
    }

    public void setCloseIconVisible(int id) {
        setCloseIconVisible(getResources().getBoolean(id));
    }

    public void setCloseIconVisible(boolean closeIconVisible) {
        e eVar = this.f1318e;
        if (eVar != null) {
            eVar.i2(closeIconVisible);
        }
        w();
    }

    @Deprecated
    public void setCloseIconEnabledResource(int id) {
        setCloseIconVisible(id);
    }

    @Deprecated
    public void setCloseIconEnabled(boolean closeIconEnabled) {
        setCloseIconVisible(closeIconEnabled);
    }

    public Drawable getCloseIcon() {
        e eVar = this.f1318e;
        if (eVar != null) {
            return eVar.K0();
        }
        return null;
    }

    public void setCloseIconResource(int id) {
        e eVar = this.f1318e;
        if (eVar != null) {
            eVar.a2(id);
        }
        w();
    }

    public void setCloseIcon(Drawable closeIcon) {
        e eVar = this.f1318e;
        if (eVar != null) {
            eVar.W1(closeIcon);
        }
        w();
    }

    public ColorStateList getCloseIconTint() {
        e eVar = this.f1318e;
        if (eVar != null) {
            return eVar.Q0();
        }
        return null;
    }

    public void setCloseIconTintResource(int id) {
        e eVar = this.f1318e;
        if (eVar != null) {
            eVar.h2(id);
        }
    }

    public void setCloseIconTint(ColorStateList closeIconTint) {
        e eVar = this.f1318e;
        if (eVar != null) {
            eVar.g2(closeIconTint);
        }
    }

    public float getCloseIconSize() {
        e eVar = this.f1318e;
        if (eVar != null) {
            return eVar.N0();
        }
        return 0.0f;
    }

    public void setCloseIconSizeResource(int id) {
        e eVar = this.f1318e;
        if (eVar != null) {
            eVar.c2(id);
        }
    }

    public void setCloseIconSize(float closeIconSize) {
        e eVar = this.f1318e;
        if (eVar != null) {
            eVar.b2(closeIconSize);
        }
    }

    public void setCloseIconContentDescription(CharSequence closeIconContentDescription) {
        e eVar = this.f1318e;
        if (eVar != null) {
            eVar.X1(closeIconContentDescription);
        }
    }

    public CharSequence getCloseIconContentDescription() {
        e eVar = this.f1318e;
        if (eVar != null) {
            return eVar.L0();
        }
        return null;
    }

    public boolean p() {
        e eVar = this.f1318e;
        return eVar != null && eVar.h1();
    }

    public void setCheckableResource(int id) {
        e eVar = this.f1318e;
        if (eVar != null) {
            eVar.s1(id);
        }
    }

    public void setCheckable(boolean checkable) {
        e eVar = this.f1318e;
        if (eVar != null) {
            eVar.r1(checkable);
        }
    }

    public void setCheckedIconVisible(int id) {
        e eVar = this.f1318e;
        if (eVar != null) {
            eVar.x1(id);
        }
    }

    public void setCheckedIconVisible(boolean checkedIconVisible) {
        e eVar = this.f1318e;
        if (eVar != null) {
            eVar.y1(checkedIconVisible);
        }
    }

    @Deprecated
    public void setCheckedIconEnabledResource(int id) {
        setCheckedIconVisible(id);
    }

    @Deprecated
    public void setCheckedIconEnabled(boolean checkedIconEnabled) {
        setCheckedIconVisible(checkedIconEnabled);
    }

    public Drawable getCheckedIcon() {
        e eVar = this.f1318e;
        if (eVar != null) {
            return eVar.y0();
        }
        return null;
    }

    public void setCheckedIconResource(int id) {
        e eVar = this.f1318e;
        if (eVar != null) {
            eVar.u1(id);
        }
    }

    public void setCheckedIcon(Drawable checkedIcon) {
        e eVar = this.f1318e;
        if (eVar != null) {
            eVar.t1(checkedIcon);
        }
    }

    public ColorStateList getCheckedIconTint() {
        e eVar = this.f1318e;
        if (eVar != null) {
            return eVar.z0();
        }
        return null;
    }

    public void setCheckedIconTintResource(int id) {
        e eVar = this.f1318e;
        if (eVar != null) {
            eVar.w1(id);
        }
    }

    public void setCheckedIconTint(ColorStateList checkedIconTint) {
        e eVar = this.f1318e;
        if (eVar != null) {
            eVar.v1(checkedIconTint);
        }
    }

    public w0.d getShowMotionSpec() {
        e eVar = this.f1318e;
        if (eVar != null) {
            return eVar.Z0();
        }
        return null;
    }

    public void setShowMotionSpecResource(int id) {
        e eVar = this.f1318e;
        if (eVar != null) {
            eVar.w2(id);
        }
    }

    public void setShowMotionSpec(w0.d showMotionSpec) {
        e eVar = this.f1318e;
        if (eVar != null) {
            eVar.v2(showMotionSpec);
        }
    }

    public w0.d getHideMotionSpec() {
        e eVar = this.f1318e;
        if (eVar != null) {
            return eVar.V0();
        }
        return null;
    }

    public void setHideMotionSpecResource(int id) {
        e eVar = this.f1318e;
        if (eVar != null) {
            eVar.m2(id);
        }
    }

    public void setHideMotionSpec(w0.d hideMotionSpec) {
        e eVar = this.f1318e;
        if (eVar != null) {
            eVar.l2(hideMotionSpec);
        }
    }

    public float getChipStartPadding() {
        e eVar = this.f1318e;
        if (eVar != null) {
            return eVar.H0();
        }
        return 0.0f;
    }

    public void setChipStartPaddingResource(int id) {
        e eVar = this.f1318e;
        if (eVar != null) {
            eVar.Q1(id);
        }
    }

    public void setChipStartPadding(float chipStartPadding) {
        e eVar = this.f1318e;
        if (eVar != null) {
            eVar.P1(chipStartPadding);
        }
    }

    public float getIconStartPadding() {
        e eVar = this.f1318e;
        if (eVar != null) {
            return eVar.X0();
        }
        return 0.0f;
    }

    public void setIconStartPaddingResource(int id) {
        e eVar = this.f1318e;
        if (eVar != null) {
            eVar.q2(id);
        }
    }

    public void setIconStartPadding(float iconStartPadding) {
        e eVar = this.f1318e;
        if (eVar != null) {
            eVar.p2(iconStartPadding);
        }
    }

    public float getIconEndPadding() {
        e eVar = this.f1318e;
        if (eVar != null) {
            return eVar.W0();
        }
        return 0.0f;
    }

    public void setIconEndPaddingResource(int id) {
        e eVar = this.f1318e;
        if (eVar != null) {
            eVar.o2(id);
        }
    }

    public void setIconEndPadding(float iconEndPadding) {
        e eVar = this.f1318e;
        if (eVar != null) {
            eVar.n2(iconEndPadding);
        }
    }

    public float getTextStartPadding() {
        e eVar = this.f1318e;
        if (eVar != null) {
            return eVar.d1();
        }
        return 0.0f;
    }

    public void setTextStartPaddingResource(int id) {
        e eVar = this.f1318e;
        if (eVar != null) {
            eVar.D2(id);
        }
    }

    public void setTextStartPadding(float textStartPadding) {
        e eVar = this.f1318e;
        if (eVar != null) {
            eVar.C2(textStartPadding);
        }
    }

    public float getTextEndPadding() {
        e eVar = this.f1318e;
        if (eVar != null) {
            return eVar.c1();
        }
        return 0.0f;
    }

    public void setTextEndPaddingResource(int id) {
        e eVar = this.f1318e;
        if (eVar != null) {
            eVar.B2(id);
        }
    }

    public void setTextEndPadding(float textEndPadding) {
        e eVar = this.f1318e;
        if (eVar != null) {
            eVar.A2(textEndPadding);
        }
    }

    public float getCloseIconStartPadding() {
        e eVar = this.f1318e;
        if (eVar != null) {
            return eVar.O0();
        }
        return 0.0f;
    }

    public void setCloseIconStartPaddingResource(int id) {
        e eVar = this.f1318e;
        if (eVar != null) {
            eVar.e2(id);
        }
    }

    public void setCloseIconStartPadding(float closeIconStartPadding) {
        e eVar = this.f1318e;
        if (eVar != null) {
            eVar.d2(closeIconStartPadding);
        }
    }

    public float getCloseIconEndPadding() {
        e eVar = this.f1318e;
        if (eVar != null) {
            return eVar.M0();
        }
        return 0.0f;
    }

    public void setCloseIconEndPaddingResource(int id) {
        e eVar = this.f1318e;
        if (eVar != null) {
            eVar.Z1(id);
        }
    }

    public void setCloseIconEndPadding(float closeIconEndPadding) {
        e eVar = this.f1318e;
        if (eVar != null) {
            eVar.Y1(closeIconEndPadding);
        }
    }

    public float getChipEndPadding() {
        e eVar = this.f1318e;
        if (eVar != null) {
            return eVar.C0();
        }
        return 0.0f;
    }

    public void setChipEndPaddingResource(int id) {
        e eVar = this.f1318e;
        if (eVar != null) {
            eVar.E1(id);
        }
    }

    public void setChipEndPadding(float chipEndPadding) {
        e eVar = this.f1318e;
        if (eVar != null) {
            eVar.D1(chipEndPadding);
        }
    }

    public boolean u() {
        return this.f1327n;
    }

    public void setEnsureMinTouchTargetSize(boolean flag) {
        this.f1327n = flag;
        j(this.f1329p);
    }

    public boolean j(int minTargetPx) {
        this.f1329p = minTargetPx;
        int deltaY = 0;
        if (!u()) {
            if (this.f1319f != null) {
                t();
            } else {
                x();
            }
            return false;
        }
        int deltaHeight = Math.max(0, minTargetPx - this.f1318e.getIntrinsicHeight());
        int deltaWidth = Math.max(0, minTargetPx - this.f1318e.getIntrinsicWidth());
        if (deltaWidth > 0 || deltaHeight > 0) {
            int deltaX = deltaWidth > 0 ? deltaWidth / 2 : 0;
            if (deltaHeight > 0) {
                deltaY = deltaHeight / 2;
            }
            if (this.f1319f != null) {
                Rect padding = new Rect();
                this.f1319f.getPadding(padding);
                if (padding.top == deltaY && padding.bottom == deltaY && padding.left == deltaX && padding.right == deltaX) {
                    x();
                    return true;
                }
            }
            if (getMinHeight() != minTargetPx) {
                setMinHeight(minTargetPx);
            }
            if (getMinWidth() != minTargetPx) {
                setMinWidth(minTargetPx);
            }
            o(deltaX, deltaY, deltaX, deltaY);
            x();
            return true;
        }
        if (this.f1319f != null) {
            t();
        } else {
            x();
        }
        return false;
    }

    public final void t() {
        if (this.f1319f != null) {
            this.f1319f = null;
            setMinWidth(0);
            setMinHeight((int) getChipMinHeight());
            x();
        }
    }

    public final void o(int insetLeft, int insetTop, int insetRight, int insetBottom) {
        this.f1319f = new InsetDrawable((Drawable) this.f1318e, insetLeft, insetTop, insetRight, insetBottom);
    }
}
