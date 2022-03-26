package y0;

import android.view.View;
import android.view.ViewParent;
import com.google.android.material.behavior.SwipeDismissBehavior;
import f0.c1;
import java.util.Objects;
import l0.k;

/* JADX WARN: Classes with same name are omitted:
  
 */
/* loaded from: classes.dex */
public class b extends k {

    /* renamed from: a  reason: collision with root package name */
    public int f3718a;

    /* renamed from: b  reason: collision with root package name */
    public int f3719b = -1;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ SwipeDismissBehavior f3720c;

    public b(SwipeDismissBehavior this$0) {
        this.f3720c = this$0;
    }

    @Override // l0.k
    public boolean m(View child, int pointerId) {
        int i2 = this.f3719b;
        return (i2 == -1 || i2 == pointerId) && this.f3720c.E(child);
    }

    @Override // l0.k
    public void i(View capturedChild, int activePointerId) {
        this.f3719b = activePointerId;
        this.f3718a = capturedChild.getLeft();
        ViewParent parent = capturedChild.getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(true);
        }
    }

    @Override // l0.k
    public void j(int state) {
        Objects.requireNonNull(this.f3720c);
    }

    @Override // l0.k
    public void l(View child, float xvel, float yvel) {
        int targetLeft;
        this.f3719b = -1;
        int childWidth = child.getWidth();
        boolean dismiss = false;
        if (n(child, xvel)) {
            int left = child.getLeft();
            int i2 = this.f3718a;
            targetLeft = left < i2 ? i2 - childWidth : i2 + childWidth;
            dismiss = true;
        } else {
            targetLeft = this.f3718a;
        }
        if (this.f3720c.f1248a.E(targetLeft, child.getTop())) {
            c1.d0(child, new d(this.f3720c, child, dismiss));
        } else if (dismiss) {
            Objects.requireNonNull(this.f3720c);
        }
    }

    public final boolean n(View child, float xvel) {
        if (xvel != 0.0f) {
            boolean isRtl = c1.A(child) == 1;
            int i2 = this.f3720c.f1251d;
            if (i2 == 2) {
                return true;
            }
            if (i2 == 0) {
                if (isRtl) {
                    if (xvel >= 0.0f) {
                        return false;
                    }
                } else if (xvel <= 0.0f) {
                    return false;
                }
                return true;
            } else if (i2 != 1) {
                return false;
            } else {
                if (isRtl) {
                    if (xvel <= 0.0f) {
                        return false;
                    }
                } else if (xvel >= 0.0f) {
                    return false;
                }
                return true;
            }
        } else {
            int distance = child.getLeft() - this.f3718a;
            int thresholdDistance = Math.round(child.getWidth() * this.f3720c.f1252e);
            return Math.abs(distance) >= thresholdDistance;
        }
    }

    @Override // l0.k
    public int d(View child) {
        return child.getWidth();
    }

    @Override // l0.k
    public int a(View child, int left, int dx) {
        int max;
        int min;
        boolean isRtl = c1.A(child) == 1;
        int max2 = this.f3720c.f1251d;
        if (max2 == 0) {
            if (isRtl) {
                min = this.f3718a - child.getWidth();
                max = this.f3718a;
            } else {
                min = this.f3718a;
                max = this.f3718a + child.getWidth();
            }
        } else if (max2 != 1) {
            int min2 = this.f3718a;
            min = min2 - child.getWidth();
            max = this.f3718a + child.getWidth();
        } else if (isRtl) {
            min = this.f3718a;
            max = this.f3718a + child.getWidth();
        } else {
            int min3 = this.f3718a;
            min = min3 - child.getWidth();
            max = this.f3718a;
        }
        return SwipeDismissBehavior.G(min, left, max);
    }

    @Override // l0.k
    public int b(View child, int top, int dy) {
        return child.getTop();
    }

    @Override // l0.k
    public void k(View child, int left, int top, int dx, int dy) {
        float startAlphaDistance = this.f3718a + (child.getWidth() * this.f3720c.f1253f);
        float endAlphaDistance = this.f3718a + (child.getWidth() * this.f3720c.f1254g);
        if (left <= startAlphaDistance) {
            child.setAlpha(1.0f);
        } else if (left >= endAlphaDistance) {
            child.setAlpha(0.0f);
        } else {
            float distance = SwipeDismissBehavior.I(startAlphaDistance, endAlphaDistance, left);
            child.setAlpha(SwipeDismissBehavior.F(0.0f, 1.0f - distance, 1.0f));
        }
    }
}
