package com.google.android.material.transformation;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import f0.c1;
import j1.a;
import java.util.List;
import s.b;

/* JADX WARN: Classes with same name are omitted:
  
 */
@Deprecated
/* loaded from: classes.dex */
public abstract class ExpandableBehavior extends b {

    /* renamed from: a  reason: collision with root package name */
    public int f1568a = 0;

    public abstract boolean H(View view, View view2, boolean z2, boolean z3);

    public ExpandableBehavior() {
    }

    public ExpandableBehavior(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    @Override // s.b
    public boolean l(CoordinatorLayout parent, View child, int layoutDirection) {
        a dep;
        if (c1.P(child) || (dep = G(parent, child)) == null || !F(dep.a())) {
            return false;
        }
        this.f1568a = dep.a() ? 1 : 2;
        int expectedState = this.f1568a;
        child.getViewTreeObserver().addOnPreDrawListener(new u1.a(this, child, expectedState, dep));
        return false;
    }

    @Override // s.b
    public boolean h(CoordinatorLayout parent, View child, View dependency) {
        a dep = (a) dependency;
        boolean expanded = dep.a();
        if (!F(expanded)) {
            return false;
        }
        this.f1568a = dep.a() ? 1 : 2;
        return H((View) dep, child, dep.a(), true);
    }

    public a G(CoordinatorLayout parent, View child) {
        List<View> dependencies = parent.r(child);
        int size = dependencies.size();
        for (int i2 = 0; i2 < size; i2++) {
            View dependency = dependencies.get(i2);
            if (e(parent, child, dependency)) {
                return (a) dependency;
            }
        }
        return null;
    }

    public final boolean F(boolean expanded) {
        if (!expanded) {
            return this.f1568a == 1;
        }
        int i2 = this.f1568a;
        return i2 == 0 || i2 == 2;
    }
}
