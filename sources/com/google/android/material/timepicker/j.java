package com.google.android.material.timepicker;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.example.helloworld.R;
import f0.c1;
import q.o;
import q1.l;
import v0.a;

/* JADX WARN: Classes with same name are omitted:
  
 */
/* loaded from: classes.dex */
public abstract class j extends ConstraintLayout {

    /* renamed from: u  reason: collision with root package name */
    public final Runnable f1557u = new i(this);

    /* renamed from: v  reason: collision with root package name */
    public int f1558v;

    /* renamed from: w  reason: collision with root package name */
    public q1.j f1559w;

    public j(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        LayoutInflater.from(context).inflate(R.layout.material_radial_view_group, this);
        c1.o0(this, t());
        TypedArray a2 = context.obtainStyledAttributes(attrs, a.f3624u, defStyleAttr, 0);
        int[] iArr = a.f3604a;
        this.f1558v = a2.getDimensionPixelSize(0, 0);
        a2.recycle();
    }

    public final Drawable t() {
        q1.j jVar = new q1.j();
        this.f1559w = jVar;
        jVar.R(new l(0.5f));
        this.f1559w.T(ColorStateList.valueOf(-1));
        return this.f1559w;
    }

    @Override // android.view.View
    public void setBackgroundColor(int color) {
        this.f1559w.T(ColorStateList.valueOf(color));
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup
    public void addView(View child, int index, ViewGroup.LayoutParams params) {
        super.addView(child, index, params);
        if (child.getId() == -1) {
            child.setId(c1.k());
        }
        y();
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup
    public void onViewRemoved(View view) {
        super.onViewRemoved(view);
        y();
    }

    public final void y() {
        Handler handler = getHandler();
        if (handler != null) {
            handler.removeCallbacks(this.f1557u);
            handler.post(this.f1557u);
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        x();
    }

    public void x() {
        int skippedChildren = 1;
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            if (w(getChildAt(i2))) {
                skippedChildren++;
            }
        }
        o constraintSet = new o();
        constraintSet.g(this);
        float currentAngle = 0.0f;
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = getChildAt(i3);
            if (childAt.getId() != R.id.circle_center && !w(childAt)) {
                constraintSet.h(childAt.getId(), R.id.circle_center, this.f1558v, currentAngle);
                currentAngle += 360.0f / (childCount - skippedChildren);
            }
        }
        constraintSet.c(this);
    }

    public void v(int radius) {
        this.f1558v = radius;
        x();
    }

    public int u() {
        return this.f1558v;
    }

    public static boolean w(View child) {
        return "skip".equals(child.getTag());
    }
}
