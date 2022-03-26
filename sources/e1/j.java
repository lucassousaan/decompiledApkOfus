package e1;

import android.view.View;
import android.view.ViewGroup;
import com.google.android.material.chip.Chip;
import com.google.android.material.chip.ChipGroup;
import f0.c1;

/* JADX WARN: Classes with same name are omitted:
  
 */
/* loaded from: classes.dex */
public class j implements ViewGroup.OnHierarchyChangeListener {

    /* renamed from: a  reason: collision with root package name */
    public ViewGroup.OnHierarchyChangeListener f1840a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ ChipGroup f1841b;

    public j(ChipGroup chipGroup) {
        this.f1841b = chipGroup;
    }

    public static /* synthetic */ ViewGroup.OnHierarchyChangeListener a(j x02, ViewGroup.OnHierarchyChangeListener x1) {
        x02.f1840a = x1;
        return x1;
    }

    @Override // android.view.ViewGroup.OnHierarchyChangeListener
    public void onChildViewAdded(View parent, View child) {
        g gVar;
        if (parent == this.f1841b && (child instanceof Chip)) {
            int id = child.getId();
            if (id == -1) {
                int id2 = c1.k();
                child.setId(id2);
            }
            Chip chip = (Chip) child;
            if (chip.isChecked()) {
                ((ChipGroup) parent).m(chip.getId());
            }
            gVar = this.f1841b.f1340k;
            chip.setOnCheckedChangeListenerInternal(gVar);
        }
        ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener = this.f1840a;
        if (onHierarchyChangeListener != null) {
            onHierarchyChangeListener.onChildViewAdded(parent, child);
        }
    }

    @Override // android.view.ViewGroup.OnHierarchyChangeListener
    public void onChildViewRemoved(View parent, View child) {
        if (parent == this.f1841b && (child instanceof Chip)) {
            ((Chip) child).setOnCheckedChangeListenerInternal(null);
        }
        ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener = this.f1840a;
        if (onHierarchyChangeListener != null) {
            onHierarchyChangeListener.onChildViewRemoved(parent, child);
        }
    }
}
