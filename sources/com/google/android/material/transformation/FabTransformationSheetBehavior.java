package com.google.android.material.transformation;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewParent;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.example.helloworld.R;
import f0.c1;
import java.util.HashMap;
import java.util.Map;
import s.e;
import u1.d;
import w0.f;

/* JADX WARN: Classes with same name are omitted:
  
 */
@Deprecated
/* loaded from: classes.dex */
public class FabTransformationSheetBehavior extends FabTransformationBehavior {

    /* renamed from: i  reason: collision with root package name */
    public Map f1578i;

    public FabTransformationSheetBehavior() {
    }

    public FabTransformationSheetBehavior(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    @Override // com.google.android.material.transformation.FabTransformationBehavior
    public d Z(Context context, boolean expanded) {
        int specRes;
        if (expanded) {
            specRes = R.animator.mtrl_fab_transformation_sheet_expand_spec;
        } else {
            specRes = R.animator.mtrl_fab_transformation_sheet_collapse_spec;
        }
        d spec = new d();
        spec.f3599a = w0.d.c(context, specRes);
        spec.f3600b = new f(17, 0.0f, 0.0f);
        return spec;
    }

    @Override // com.google.android.material.transformation.ExpandableTransformationBehavior, com.google.android.material.transformation.ExpandableBehavior
    public boolean H(View dependency, View child, boolean expanded, boolean animated) {
        b0(child, expanded);
        super.H(dependency, child, expanded, animated);
        return true;
    }

    public final void b0(View sheet, boolean expanded) {
        ViewParent viewParent = sheet.getParent();
        if (viewParent instanceof CoordinatorLayout) {
            CoordinatorLayout parent = (CoordinatorLayout) viewParent;
            int childCount = parent.getChildCount();
            if (expanded) {
                this.f1578i = new HashMap(childCount);
            }
            for (int i2 = 0; i2 < childCount; i2++) {
                View child = parent.getChildAt(i2);
                boolean hasScrimBehavior = (child.getLayoutParams() instanceof e) && (((e) child.getLayoutParams()).f() instanceof FabTransformationScrimBehavior);
                if (child != sheet && !hasScrimBehavior) {
                    if (!expanded) {
                        Map map = this.f1578i;
                        if (map != null && map.containsKey(child)) {
                            c1.s0(child, ((Integer) this.f1578i.get(child)).intValue());
                        }
                    } else {
                        this.f1578i.put(child, Integer.valueOf(child.getImportantForAccessibility()));
                        c1.s0(child, 4);
                    }
                }
            }
            if (!expanded) {
                this.f1578i = null;
            }
        }
    }
}
