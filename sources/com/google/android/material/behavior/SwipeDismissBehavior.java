package com.google.android.material.behavior;

import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import f0.c1;
import g0.c;
import l0.k;
import l0.l;
import s.b;

/* JADX WARN: Classes with same name are omitted:
  
 */
/* loaded from: classes.dex */
public class SwipeDismissBehavior<V extends View> extends b {

    /* renamed from: a  reason: collision with root package name */
    public l f1248a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f1249b;

    /* renamed from: c  reason: collision with root package name */
    public float f1250c = 0.0f;

    /* renamed from: d  reason: collision with root package name */
    public int f1251d = 2;

    /* renamed from: e  reason: collision with root package name */
    public float f1252e = 0.5f;

    /* renamed from: f  reason: collision with root package name */
    public float f1253f = 0.0f;

    /* renamed from: g  reason: collision with root package name */
    public float f1254g = 0.5f;

    /* renamed from: h  reason: collision with root package name */
    public final k f1255h = new y0.b(this);

    public void L(int direction) {
        this.f1251d = direction;
    }

    public void K(float fraction) {
        this.f1253f = F(0.0f, fraction, 1.0f);
    }

    public void J(float fraction) {
        this.f1254g = F(0.0f, fraction, 1.0f);
    }

    @Override // s.b
    public boolean l(CoordinatorLayout parent, View view, int layoutDirection) {
        super.l(parent, view, layoutDirection);
        if (c1.y(view) == 0) {
            c1.s0(view, 1);
            M(view);
        }
        return false;
    }

    @Override // s.b
    public boolean k(CoordinatorLayout parent, View view, MotionEvent event) {
        boolean dispatchEventToHelper = this.f1249b;
        switch (event.getActionMasked()) {
            case 0:
                this.f1249b = parent.B(view, (int) event.getX(), (int) event.getY());
                dispatchEventToHelper = this.f1249b;
                break;
            case 1:
            case 3:
                this.f1249b = false;
                break;
        }
        if (!dispatchEventToHelper) {
            return false;
        }
        H(parent);
        return this.f1248a.F(event);
    }

    @Override // s.b
    public boolean D(CoordinatorLayout parent, View view, MotionEvent event) {
        l lVar = this.f1248a;
        if (lVar == null) {
            return false;
        }
        lVar.y(event);
        return true;
    }

    public boolean E(View view) {
        return true;
    }

    public final void H(ViewGroup parent) {
        if (this.f1248a == null) {
            this.f1248a = l.l(parent, this.f1255h);
        }
    }

    public final void M(View child) {
        c1.f0(child, 1048576);
        if (E(child)) {
            c1.h0(child, c.f2012j, null, new y0.c(this));
        }
    }

    public static float F(float min, float value, float max) {
        return Math.min(Math.max(min, value), max);
    }

    public static int G(int min, int value, int max) {
        return Math.min(Math.max(min, value), max);
    }

    public static float I(float startValue, float endValue, float value) {
        return (value - startValue) / (endValue - startValue);
    }
}
