package com.google.android.material.internal;

import android.content.Context;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.widget.Checkable;
import android.widget.ImageButton;
import androidx.appcompat.widget.g0;
import com.example.helloworld.R;
import f0.c1;
import l1.a;
import l1.c;

/* JADX WARN: Classes with same name are omitted:
  
 */
/* loaded from: classes.dex */
public class CheckableImageButton extends g0 implements Checkable {

    /* renamed from: g  reason: collision with root package name */
    public static final int[] f1459g = {16842912};

    /* renamed from: d  reason: collision with root package name */
    public boolean f1460d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f1461e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f1462f;

    public CheckableImageButton(Context context, AttributeSet attrs) {
        this(context, attrs, R.attr.imageButtonStyle);
    }

    public CheckableImageButton(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        this.f1461e = true;
        this.f1462f = true;
        c1.l0(this, new a(this));
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean checked) {
        if (this.f1461e && this.f1460d != checked) {
            this.f1460d = checked;
            refreshDrawableState();
            sendAccessibilityEvent(2048);
        }
    }

    @Override // android.widget.Checkable
    public boolean isChecked() {
        return this.f1460d;
    }

    @Override // android.widget.Checkable
    public void toggle() {
        setChecked(!this.f1460d);
    }

    @Override // android.view.View
    public void setPressed(boolean pressed) {
        if (this.f1462f) {
            super.setPressed(pressed);
        }
    }

    @Override // android.widget.ImageView, android.view.View
    public int[] onCreateDrawableState(int extraSpace) {
        if (!this.f1460d) {
            return super.onCreateDrawableState(extraSpace);
        }
        int[] iArr = f1459g;
        return ImageButton.mergeDrawableStates(super.onCreateDrawableState(iArr.length + extraSpace), iArr);
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        Parcelable superState = super.onSaveInstanceState();
        c savedState = new c(superState);
        savedState.f2398d = this.f1460d;
        return savedState;
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable state) {
        if (!(state instanceof c)) {
            super.onRestoreInstanceState(state);
            return;
        }
        c savedState = (c) state;
        super.onRestoreInstanceState(savedState.i());
        setChecked(savedState.f2398d);
    }

    public void setCheckable(boolean checkable) {
        if (this.f1461e != checkable) {
            this.f1461e = checkable;
            sendAccessibilityEvent(0);
        }
    }

    public boolean a() {
        return this.f1461e;
    }

    public void setPressable(boolean pressable) {
        this.f1462f = pressable;
    }
}
