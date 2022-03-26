package androidx.fragment.app;

import android.util.Log;
import android.view.View;
import android.view.ViewGroup;

/* JADX WARN: Classes with same name are omitted:
  
 */
/* loaded from: classes.dex */
public enum r2 {
    REMOVED,
    VISIBLE,
    GONE,
    INVISIBLE;

    public static r2 c(View view) {
        if (view.getAlpha() == 0.0f && view.getVisibility() == 0) {
            return INVISIBLE;
        }
        return b(view.getVisibility());
    }

    public static r2 b(int visibility) {
        switch (visibility) {
            case 0:
                return VISIBLE;
            case 4:
                return INVISIBLE;
            case 8:
                return GONE;
            default:
                throw new IllegalArgumentException("Unknown visibility " + visibility);
        }
    }

    public void a(View view) {
        switch (ordinal()) {
            case 0:
                ViewGroup parent = (ViewGroup) view.getParent();
                if (parent != null) {
                    if (m1.v0(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: Removing view " + view + " from container " + parent);
                    }
                    parent.removeView(view);
                    return;
                }
                return;
            case 1:
                if (m1.v0(2)) {
                    Log.v("FragmentManager", "SpecialEffectsController: Setting view " + view + " to VISIBLE");
                }
                view.setVisibility(0);
                return;
            case 2:
                if (m1.v0(2)) {
                    Log.v("FragmentManager", "SpecialEffectsController: Setting view " + view + " to GONE");
                }
                view.setVisibility(8);
                return;
            case 3:
                if (m1.v0(2)) {
                    Log.v("FragmentManager", "SpecialEffectsController: Setting view " + view + " to INVISIBLE");
                }
                view.setVisibility(4);
                return;
            default:
                return;
        }
    }
}
