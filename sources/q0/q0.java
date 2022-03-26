package q0;

import android.graphics.PointF;
import android.view.View;

/* JADX WARN: Classes with same name are omitted:
  
 */
/* loaded from: classes.dex */
public class q0 extends k2 {

    /* renamed from: c  reason: collision with root package name */
    public o0 f3178c;

    /* renamed from: d  reason: collision with root package name */
    public o0 f3179d;

    @Override // q0.k2
    public int[] c(m1 layoutManager, View targetView) {
        int[] out = new int[2];
        if (layoutManager.k()) {
            out[0] = l(targetView, n(layoutManager));
        } else {
            out[0] = 0;
        }
        if (layoutManager.l()) {
            out[1] = l(targetView, p(layoutManager));
        } else {
            out[1] = 0;
        }
        return out;
    }

    @Override // q0.k2
    public View g(m1 layoutManager) {
        if (layoutManager.l()) {
            return m(layoutManager, p(layoutManager));
        }
        if (layoutManager.k()) {
            return m(layoutManager, n(layoutManager));
        }
        return null;
    }

    @Override // q0.k2
    public int h(m1 layoutManager, int velocityX, int velocityY) {
        o0 orientationHelper;
        int itemCount = layoutManager.Y();
        if (itemCount == 0 || (orientationHelper = o(layoutManager)) == null) {
            return -1;
        }
        View closestChildBeforeCenter = null;
        int distanceBefore = Integer.MIN_VALUE;
        View closestChildAfterCenter = null;
        int distanceAfter = Integer.MAX_VALUE;
        int childCount = layoutManager.J();
        for (int i2 = 0; i2 < childCount; i2++) {
            View child = layoutManager.I(i2);
            if (child != null) {
                int distance = l(child, orientationHelper);
                if (distance <= 0 && distance > distanceBefore) {
                    distanceBefore = distance;
                    closestChildBeforeCenter = child;
                }
                if (distance >= 0 && distance < distanceAfter) {
                    distanceAfter = distance;
                    closestChildAfterCenter = child;
                }
            }
        }
        boolean forwardDirection = q(layoutManager, velocityX, velocityY);
        if (forwardDirection && closestChildAfterCenter != null) {
            return layoutManager.h0(closestChildAfterCenter);
        }
        if (!(forwardDirection || closestChildBeforeCenter == null)) {
            return layoutManager.h0(closestChildBeforeCenter);
        }
        View visibleView = forwardDirection ? closestChildBeforeCenter : closestChildAfterCenter;
        if (visibleView == null) {
            return -1;
        }
        int visiblePosition = layoutManager.h0(visibleView);
        int snapToPosition = (r(layoutManager) == forwardDirection ? -1 : 1) + visiblePosition;
        if (snapToPosition < 0 || snapToPosition >= itemCount) {
            return -1;
        }
        return snapToPosition;
    }

    public final boolean q(m1 layoutManager, int velocityX, int velocityY) {
        return layoutManager.k() ? velocityX > 0 : velocityY > 0;
    }

    public final boolean r(m1 layoutManager) {
        int itemCount = layoutManager.Y();
        if (layoutManager instanceof z1) {
            z1 vectorProvider = (z1) layoutManager;
            PointF vectorForEnd = vectorProvider.a(itemCount - 1);
            if (vectorForEnd != null) {
                return vectorForEnd.x < 0.0f || vectorForEnd.y < 0.0f;
            }
        }
        return false;
    }

    @Override // q0.k2
    public j0 e(m1 layoutManager) {
        if (!(layoutManager instanceof z1)) {
            return null;
        }
        return new p0(this, this.f3096a.getContext());
    }

    public final int l(View targetView, o0 helper) {
        int childCenter = helper.g(targetView) + (helper.e(targetView) / 2);
        int containerCenter = helper.m() + (helper.n() / 2);
        return childCenter - containerCenter;
    }

    public final View m(m1 layoutManager, o0 helper) {
        int childCount = layoutManager.J();
        if (childCount == 0) {
            return null;
        }
        View closestChild = null;
        int center = helper.m() + (helper.n() / 2);
        int absClosest = Integer.MAX_VALUE;
        for (int i2 = 0; i2 < childCount; i2++) {
            View child = layoutManager.I(i2);
            int childCenter = helper.g(child) + (helper.e(child) / 2);
            int absDistance = Math.abs(childCenter - center);
            if (absDistance < absClosest) {
                absClosest = absDistance;
                closestChild = child;
            }
        }
        return closestChild;
    }

    public final o0 o(m1 layoutManager) {
        if (layoutManager.l()) {
            return p(layoutManager);
        }
        if (layoutManager.k()) {
            return n(layoutManager);
        }
        return null;
    }

    public final o0 p(m1 layoutManager) {
        o0 o0Var = this.f3178c;
        if (o0Var == null || o0Var.f3153a != layoutManager) {
            this.f3178c = o0.c(layoutManager);
        }
        return this.f3178c;
    }

    public final o0 n(m1 layoutManager) {
        o0 o0Var = this.f3179d;
        if (o0Var == null || o0Var.f3153a != layoutManager) {
            this.f3179d = o0.a(layoutManager);
        }
        return this.f3179d;
    }
}
