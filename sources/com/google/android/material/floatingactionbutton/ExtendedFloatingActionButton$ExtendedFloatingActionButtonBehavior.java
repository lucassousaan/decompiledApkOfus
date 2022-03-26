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
import java.util.List;
import java.util.Objects;
import k1.f;
import s.b;
import s.e;

/* JADX WARN: Classes with same name are omitted:
  
 */
/* loaded from: classes.dex */
public class ExtendedFloatingActionButton$ExtendedFloatingActionButtonBehavior<T extends f> extends b {

    /* renamed from: a  reason: collision with root package name */
    public boolean f1455a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f1456b;

    @Override // s.b
    public /* bridge */ /* synthetic */ boolean b(CoordinatorLayout coordinatorLayout, View view, Rect rect) {
        a.a(view);
        F(coordinatorLayout, null, rect);
        return false;
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

    public ExtendedFloatingActionButton$ExtendedFloatingActionButtonBehavior() {
        this.f1455a = false;
        this.f1456b = true;
    }

    public ExtendedFloatingActionButton$ExtendedFloatingActionButtonBehavior(Context context, AttributeSet attrs) {
        super(context, attrs);
        TypedArray a2 = context.obtainStyledAttributes(attrs, v0.a.f3609f);
        int[] iArr = v0.a.f3604a;
        this.f1455a = a2.getBoolean(0, false);
        this.f1456b = a2.getBoolean(1, true);
        a2.recycle();
    }

    public boolean F(CoordinatorLayout parent, f child, Rect rect) {
        super.b(parent, child, rect);
        return false;
    }

    @Override // s.b
    public void g(e lp) {
        if (lp.f3434h == 0) {
            lp.f3434h = 80;
        }
    }

    public boolean H(CoordinatorLayout parent, f child, View dependency) {
        if (!G(dependency)) {
            return false;
        }
        L(dependency, child);
        return false;
    }

    public static boolean G(View view) {
        ViewGroup.LayoutParams lp = view.getLayoutParams();
        if (lp instanceof e) {
            return ((e) lp).f() instanceof BottomSheetBehavior;
        }
        return false;
    }

    public final boolean J(View dependency, f child) {
        e lp = (e) child.getLayoutParams();
        return (this.f1455a || this.f1456b) && lp.e() == dependency.getId();
    }

    public final boolean L(View bottomSheet, f child) {
        if (!J(bottomSheet, child)) {
            return false;
        }
        e lp = (e) child.getLayoutParams();
        if (bottomSheet.getTop() < (child.getHeight() / 2) + ((ViewGroup.MarginLayoutParams) lp).topMargin) {
            K(child);
            return true;
        }
        E(child);
        return true;
    }

    public void K(f fab) {
        if (this.f1456b) {
            Objects.requireNonNull(null);
        } else {
            Objects.requireNonNull(null);
        }
        f.n(null);
    }

    public void E(f fab) {
        if (this.f1456b) {
            Objects.requireNonNull(null);
        } else {
            Objects.requireNonNull(null);
        }
        f.n(null);
    }

    public boolean I(CoordinatorLayout parent, f child, int layoutDirection) {
        List<View> dependencies = parent.r(child);
        int count = dependencies.size();
        for (int i2 = 0; i2 < count; i2++) {
            View dependency = dependencies.get(i2);
            if (G(dependency) && L(dependency, child)) {
                break;
            }
        }
        parent.I(child, layoutDirection);
        return true;
    }
}
