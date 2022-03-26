package i0;

import android.view.View;
import android.widget.ListView;

/* JADX WARN: Classes with same name are omitted:
  
 */
/* loaded from: classes.dex */
public class i extends c {

    /* renamed from: s  reason: collision with root package name */
    public final ListView f2256s;

    public i(ListView target) {
        super(target);
        this.f2256s = target;
    }

    @Override // i0.c
    public void j(int deltaX, int deltaY) {
        j.a(this.f2256s, deltaY);
    }

    @Override // i0.c
    public boolean a(int direction) {
        return false;
    }

    @Override // i0.c
    public boolean b(int direction) {
        ListView target = this.f2256s;
        int itemCount = target.getCount();
        if (itemCount == 0) {
            return false;
        }
        int childCount = target.getChildCount();
        int firstPosition = target.getFirstVisiblePosition();
        int lastPosition = firstPosition + childCount;
        if (direction > 0) {
            if (lastPosition < itemCount) {
                return true;
            }
            View lastView = target.getChildAt(childCount - 1);
            if (lastView.getBottom() <= target.getHeight()) {
                return false;
            }
            return true;
        } else if (direction >= 0) {
            return false;
        } else {
            if (firstPosition > 0) {
                return true;
            }
            View firstView = target.getChildAt(0);
            if (firstView.getTop() >= 0) {
                return false;
            }
            return true;
        }
    }
}
