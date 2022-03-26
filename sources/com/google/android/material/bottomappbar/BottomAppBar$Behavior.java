package com.google.android.material.bottomappbar;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.behavior.HideBottomViewOnScrollBehavior;
import f0.c1;
import java.lang.ref.WeakReference;
import s.e;
import z0.a;
import z0.b;

/* JADX WARN: Classes with same name are omitted:
  
 */
/* loaded from: classes.dex */
public class BottomAppBar$Behavior extends HideBottomViewOnScrollBehavior<b> {

    /* renamed from: f  reason: collision with root package name */
    public WeakReference f1257f;

    /* renamed from: g  reason: collision with root package name */
    public int f1258g;

    /* renamed from: h  reason: collision with root package name */
    public final View.OnLayoutChangeListener f1259h = new a(this);

    /* renamed from: e  reason: collision with root package name */
    public final Rect f1256e = new Rect();

    @Override // com.google.android.material.behavior.HideBottomViewOnScrollBehavior, s.b
    public /* bridge */ /* synthetic */ boolean A(CoordinatorLayout coordinatorLayout, View view, View view2, View view3, int i2, int i3) {
        a1.a.a(view);
        K(coordinatorLayout, null, view2, view3, i2, i3);
        throw null;
    }

    @Override // com.google.android.material.behavior.HideBottomViewOnScrollBehavior, s.b
    public /* bridge */ /* synthetic */ boolean l(CoordinatorLayout coordinatorLayout, View view, int i2) {
        a1.a.a(view);
        J(coordinatorLayout, null, i2);
        return false;
    }

    public BottomAppBar$Behavior() {
    }

    public BottomAppBar$Behavior(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public boolean J(CoordinatorLayout parent, b child, int layoutDirection) {
        this.f1257f = new WeakReference(child);
        View dependentView = b.P();
        if (dependentView != null && !c1.P(dependentView)) {
            e fabLayoutParams = (e) dependentView.getLayoutParams();
            fabLayoutParams.f3430d = 49;
            this.f1258g = ((ViewGroup.MarginLayoutParams) fabLayoutParams).bottomMargin;
            b.O();
        }
        parent.I(child, layoutDirection);
        super.l(parent, child, layoutDirection);
        return false;
    }

    public boolean K(CoordinatorLayout coordinatorLayout, b child, View directTargetChild, View target, int axes, int type) {
        return child.R() && super.A(coordinatorLayout, child, directTargetChild, target, axes, type);
    }
}
