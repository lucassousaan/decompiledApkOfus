package com.google.android.material.snackbar;

import android.view.MotionEvent;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.behavior.SwipeDismissBehavior;
import r1.a;

/* JADX WARN: Classes with same name are omitted:
  
 */
/* loaded from: classes.dex */
public class BaseTransientBottomBar$Behavior extends SwipeDismissBehavior<View> {

    /* renamed from: i  reason: collision with root package name */
    public final a f1467i = new a(this);

    @Override // com.google.android.material.behavior.SwipeDismissBehavior
    public boolean E(View child) {
        return this.f1467i.a(child);
    }

    @Override // com.google.android.material.behavior.SwipeDismissBehavior, s.b
    public boolean k(CoordinatorLayout parent, View child, MotionEvent event) {
        this.f1467i.b(parent, child, event);
        return super.k(parent, child, event);
    }
}
