package s;

import android.content.Context;
import android.graphics.Rect;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import f0.x1;

/* JADX WARN: Classes with same name are omitted:
  
 */
/* loaded from: classes.dex */
public abstract class b {
    /* JADX WARN: Generic types in debug info not equals: s.b != androidx.coordinatorlayout.widget.CoordinatorLayout$Behavior<V> */
    public b() {
    }

    /* JADX WARN: Generic types in debug info not equals: s.b != androidx.coordinatorlayout.widget.CoordinatorLayout$Behavior<V> */
    public b(Context context, AttributeSet attrs) {
    }

    /* JADX WARN: Generic types in debug info not equals: s.b != androidx.coordinatorlayout.widget.CoordinatorLayout$Behavior<V> */
    public void g(e params) {
    }

    /* JADX WARN: Generic types in debug info not equals: s.b != androidx.coordinatorlayout.widget.CoordinatorLayout$Behavior<V> */
    public void j() {
    }

    /* JADX WARN: Generic types in debug info not equals: s.b != androidx.coordinatorlayout.widget.CoordinatorLayout$Behavior<V> */
    public boolean k(CoordinatorLayout parent, View view, MotionEvent ev) {
        return false;
    }

    /* JADX WARN: Generic types in debug info not equals: s.b != androidx.coordinatorlayout.widget.CoordinatorLayout$Behavior<V> */
    public boolean D(CoordinatorLayout parent, View view, MotionEvent ev) {
        return false;
    }

    /* JADX WARN: Generic types in debug info not equals: s.b != androidx.coordinatorlayout.widget.CoordinatorLayout$Behavior<V> */
    public int c() {
        return -16777216;
    }

    /* JADX WARN: Generic types in debug info not equals: s.b != androidx.coordinatorlayout.widget.CoordinatorLayout$Behavior<V> */
    public float d() {
        return 0.0f;
    }

    /* JADX WARN: Generic types in debug info not equals: s.b != androidx.coordinatorlayout.widget.CoordinatorLayout$Behavior<V> */
    public boolean a(CoordinatorLayout parent, View view) {
        d();
        return false;
    }

    /* JADX WARN: Generic types in debug info not equals: s.b != androidx.coordinatorlayout.widget.CoordinatorLayout$Behavior<V> */
    public boolean e(CoordinatorLayout parent, View view, View dependency) {
        return false;
    }

    /* JADX WARN: Generic types in debug info not equals: s.b != androidx.coordinatorlayout.widget.CoordinatorLayout$Behavior<V> */
    public boolean h(CoordinatorLayout parent, View view, View dependency) {
        return false;
    }

    /* JADX WARN: Generic types in debug info not equals: s.b != androidx.coordinatorlayout.widget.CoordinatorLayout$Behavior<V> */
    public void i(CoordinatorLayout parent, View view, View dependency) {
    }

    /* JADX WARN: Generic types in debug info not equals: s.b != androidx.coordinatorlayout.widget.CoordinatorLayout$Behavior<V> */
    public boolean m(CoordinatorLayout parent, View view, int parentWidthMeasureSpec, int widthUsed, int parentHeightMeasureSpec, int heightUsed) {
        return false;
    }

    /* JADX WARN: Generic types in debug info not equals: s.b != androidx.coordinatorlayout.widget.CoordinatorLayout$Behavior<V> */
    public boolean l(CoordinatorLayout parent, View view, int layoutDirection) {
        return false;
    }

    /* JADX WARN: Generic types in debug info not equals: s.b != androidx.coordinatorlayout.widget.CoordinatorLayout$Behavior<V> */
    public boolean z() {
        return false;
    }

    /* JADX WARN: Generic types in debug info not equals: s.b != androidx.coordinatorlayout.widget.CoordinatorLayout$Behavior<V> */
    public boolean A(CoordinatorLayout coordinatorLayout, View view, View directTargetChild, View target, int axes, int type) {
        if (type != 0) {
            return false;
        }
        z();
        return false;
    }

    /* JADX WARN: Generic types in debug info not equals: s.b != androidx.coordinatorlayout.widget.CoordinatorLayout$Behavior<V> */
    public void u() {
    }

    /* JADX WARN: Generic types in debug info not equals: s.b != androidx.coordinatorlayout.widget.CoordinatorLayout$Behavior<V> */
    public void v(CoordinatorLayout coordinatorLayout, View view, View directTargetChild, View target, int axes, int type) {
        if (type == 0) {
            u();
        }
    }

    /* JADX WARN: Generic types in debug info not equals: s.b != androidx.coordinatorlayout.widget.CoordinatorLayout$Behavior<V> */
    public void B() {
    }

    /* JADX WARN: Generic types in debug info not equals: s.b != androidx.coordinatorlayout.widget.CoordinatorLayout$Behavior<V> */
    public void C(CoordinatorLayout coordinatorLayout, View view, View target, int type) {
        if (type == 0) {
            B();
        }
    }

    /* JADX WARN: Generic types in debug info not equals: s.b != androidx.coordinatorlayout.widget.CoordinatorLayout$Behavior<V> */
    public void r() {
    }

    /* JADX WARN: Generic types in debug info not equals: s.b != androidx.coordinatorlayout.widget.CoordinatorLayout$Behavior<V> */
    public void s(CoordinatorLayout coordinatorLayout, View view, View target, int dxConsumed, int dyConsumed, int dxUnconsumed, int dyUnconsumed, int type) {
        if (type == 0) {
            r();
        }
    }

    /* JADX WARN: Generic types in debug info not equals: s.b != androidx.coordinatorlayout.widget.CoordinatorLayout$Behavior<V> */
    public void t(CoordinatorLayout coordinatorLayout, View view, View target, int dxConsumed, int dyConsumed, int dxUnconsumed, int dyUnconsumed, int type, int[] consumed) {
        consumed[0] = consumed[0] + dxUnconsumed;
        consumed[1] = consumed[1] + dyUnconsumed;
        s(coordinatorLayout, view, target, dxConsumed, dyConsumed, dxUnconsumed, dyUnconsumed, type);
    }

    /* JADX WARN: Generic types in debug info not equals: s.b != androidx.coordinatorlayout.widget.CoordinatorLayout$Behavior<V> */
    public void p() {
    }

    /* JADX WARN: Generic types in debug info not equals: s.b != androidx.coordinatorlayout.widget.CoordinatorLayout$Behavior<V> */
    public void q(CoordinatorLayout coordinatorLayout, View view, View target, int dx, int dy, int[] consumed, int type) {
        if (type == 0) {
            p();
        }
    }

    /* JADX WARN: Generic types in debug info not equals: s.b != androidx.coordinatorlayout.widget.CoordinatorLayout$Behavior<V> */
    public boolean n() {
        return false;
    }

    /* JADX WARN: Generic types in debug info not equals: s.b != androidx.coordinatorlayout.widget.CoordinatorLayout$Behavior<V> */
    public boolean o(CoordinatorLayout coordinatorLayout, View view, View target, float velocityX, float velocityY) {
        return false;
    }

    /* JADX WARN: Generic types in debug info not equals: s.b != androidx.coordinatorlayout.widget.CoordinatorLayout$Behavior<V> */
    public x1 f(x1 insets) {
        return insets;
    }

    /* JADX WARN: Generic types in debug info not equals: s.b != androidx.coordinatorlayout.widget.CoordinatorLayout$Behavior<V> */
    public boolean w(CoordinatorLayout coordinatorLayout, View view, Rect rectangle, boolean immediate) {
        return false;
    }

    /* JADX WARN: Generic types in debug info not equals: s.b != androidx.coordinatorlayout.widget.CoordinatorLayout$Behavior<V> */
    public void x(CoordinatorLayout parent, View view, Parcelable state) {
    }

    /* JADX WARN: Generic types in debug info not equals: s.b != androidx.coordinatorlayout.widget.CoordinatorLayout$Behavior<V> */
    public Parcelable y(CoordinatorLayout parent, View view) {
        return View.BaseSavedState.EMPTY_STATE;
    }

    /* JADX WARN: Generic types in debug info not equals: s.b != androidx.coordinatorlayout.widget.CoordinatorLayout$Behavior<V> */
    public boolean b(CoordinatorLayout parent, View view, Rect rect) {
        return false;
    }
}
