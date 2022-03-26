package s;

import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

/* JADX WARN: Classes with same name are omitted:
  
 */
/* loaded from: classes.dex */
public class d implements ViewGroup.OnHierarchyChangeListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ CoordinatorLayout f3426a;

    public d(CoordinatorLayout coordinatorLayout) {
        this.f3426a = coordinatorLayout;
    }

    @Override // android.view.ViewGroup.OnHierarchyChangeListener
    public void onChildViewAdded(View parent, View child) {
        ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener = this.f3426a.f650s;
        if (onHierarchyChangeListener != null) {
            onHierarchyChangeListener.onChildViewAdded(parent, child);
        }
    }

    @Override // android.view.ViewGroup.OnHierarchyChangeListener
    public void onChildViewRemoved(View parent, View child) {
        this.f3426a.H(2);
        ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener = this.f3426a.f650s;
        if (onHierarchyChangeListener != null) {
            onHierarchyChangeListener.onChildViewRemoved(parent, child);
        }
    }
}
