package com.google.android.material.floatingactionbutton;

import a1.a;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import f0.c1;
import java.util.List;
import java.util.Objects;
import k1.g;
import s.b;
import s.e;

/* JADX WARN: Classes with same name are omitted:
  
 */
/* loaded from: classes.dex */
public class FloatingActionButton$BaseBehavior<T extends g> extends b {

    /* renamed from: a  reason: collision with root package name */
    public boolean f1457a;

    @Override // s.b
    public /* bridge */ /* synthetic */ boolean b(CoordinatorLayout coordinatorLayout, View view, Rect rect) {
        a.a(view);
        E(null, rect);
        throw null;
    }

    @Override // s.b
    public /* bridge */ /* synthetic */ boolean h(CoordinatorLayout coordinatorLayout, View view, View view2) {
        a.a(view);
        H(coordinatorLayout, null, view2);
        return false;
    }

    @Override // s.b
    public /* bridge */ /* synthetic */ boolean l(CoordinatorLayout coordinatorLayout, View view, int i2) {
        a.a(view);
        I(coordinatorLayout, null, i2);
        return true;
    }

    public FloatingActionButton$BaseBehavior() {
        this.f1457a = true;
    }

    public FloatingActionButton$BaseBehavior(Context context, AttributeSet attrs) {
        super(context, attrs);
        TypedArray a2 = context.obtainStyledAttributes(attrs, v0.a.f3610g);
        int[] iArr = v0.a.f3604a;
        this.f1457a = a2.getBoolean(0, true);
        a2.recycle();
    }

    @Override // s.b
    public void g(e lp) {
        if (lp.f3434h == 0) {
            lp.f3434h = 80;
        }
    }

    public boolean H(CoordinatorLayout parent, g child, View dependency) {
        if (!F(dependency)) {
            return false;
        }
        K(dependency, child);
        return false;
    }

    public static boolean F(View view) {
        ViewGroup.LayoutParams lp = view.getLayoutParams();
        if (lp instanceof e) {
            return ((e) lp).f() instanceof BottomSheetBehavior;
        }
        return false;
    }

    public final boolean J(View dependency, g child) {
        e lp = (e) child.getLayoutParams();
        if (!this.f1457a || lp.e() != dependency.getId()) {
            return false;
        }
        child.b();
        throw null;
    }

    public final boolean K(View bottomSheet, g child) {
        J(bottomSheet, child);
        return false;
    }

    public boolean I(CoordinatorLayout parent, g child, int layoutDirection) {
        List<View> dependencies = parent.r(child);
        int count = dependencies.size();
        for (int i2 = 0; i2 < count; i2++) {
            View dependency = dependencies.get(i2);
            if (F(dependency)) {
                K(dependency, child);
            }
        }
        parent.I(child, layoutDirection);
        G(parent, child);
        return true;
    }

    public boolean E(g child, Rect rect) {
        Objects.requireNonNull(child);
        Rect shadowPadding = null;
        rect.set(child.getLeft() + shadowPadding.left, child.getTop() + shadowPadding.top, child.getRight() - shadowPadding.right, child.getBottom() - shadowPadding.bottom);
        return true;
    }

    public final void G(CoordinatorLayout parent, g fab) {
        Objects.requireNonNull(fab);
        Rect padding = null;
        if (0 != 0 && padding.centerX() > 0 && padding.centerY() > 0) {
            e lp = (e) fab.getLayoutParams();
            int offsetTB = 0;
            int offsetLR = 0;
            if (fab.getRight() >= parent.getWidth() - ((ViewGroup.MarginLayoutParams) lp).rightMargin) {
                offsetLR = padding.right;
            } else if (fab.getLeft() <= ((ViewGroup.MarginLayoutParams) lp).leftMargin) {
                offsetLR = -padding.left;
            }
            if (fab.getBottom() >= parent.getHeight() - ((ViewGroup.MarginLayoutParams) lp).bottomMargin) {
                offsetTB = padding.bottom;
            } else if (fab.getTop() <= ((ViewGroup.MarginLayoutParams) lp).topMargin) {
                offsetTB = -padding.top;
            }
            if (offsetTB != 0) {
                c1.W(fab, offsetTB);
            }
            if (offsetLR != 0) {
                c1.V(fab, offsetLR);
            }
        }
    }
}
