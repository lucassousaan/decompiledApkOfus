package x0;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.OverScroller;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

/* JADX WARN: Classes with same name are omitted:
  
 */
/* loaded from: classes.dex */
public abstract class f extends h {

    /* renamed from: d  reason: collision with root package name */
    public OverScroller f3697d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f3698e;

    /* renamed from: g  reason: collision with root package name */
    public int f3700g;

    /* renamed from: i  reason: collision with root package name */
    public VelocityTracker f3702i;

    /* renamed from: f  reason: collision with root package name */
    public int f3699f = -1;

    /* renamed from: h  reason: collision with root package name */
    public int f3701h = -1;

    public abstract boolean H(View view);

    public abstract int J(View view);

    public abstract int K(View view);

    public abstract int L();

    public abstract int O(CoordinatorLayout coordinatorLayout, View view, int i2, int i3, int i4);

    /* JADX WARN: Generic types in debug info not equals: x0.f != com.google.android.material.appbar.HeaderBehavior<V> */
    public f() {
    }

    /* JADX WARN: Generic types in debug info not equals: x0.f != com.google.android.material.appbar.HeaderBehavior<V> */
    public f(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    /* JADX WARN: Generic types in debug info not equals: x0.f != com.google.android.material.appbar.HeaderBehavior<V> */
    @Override // s.b
    public boolean k(CoordinatorLayout parent, View view, MotionEvent ev) {
        int pointerIndex;
        if (this.f3701h < 0) {
            this.f3701h = ViewConfiguration.get(parent.getContext()).getScaledTouchSlop();
        }
        if (ev.getActionMasked() == 2 && this.f3698e) {
            int i2 = this.f3699f;
            if (i2 == -1 || (pointerIndex = ev.findPointerIndex(i2)) == -1) {
                return false;
            }
            int y2 = (int) ev.getY(pointerIndex);
            int yDiff = Math.abs(y2 - this.f3700g);
            if (yDiff > this.f3701h) {
                this.f3700g = y2;
                return true;
            }
        }
        if (ev.getActionMasked() == 0) {
            this.f3699f = -1;
            int x2 = (int) ev.getX();
            int y3 = (int) ev.getY();
            boolean z2 = H(view) && parent.B(view, x2, y3);
            this.f3698e = z2;
            if (z2) {
                this.f3700g = y3;
                this.f3699f = ev.getPointerId(0);
                I();
                OverScroller overScroller = this.f3697d;
                if (overScroller != null && !overScroller.isFinished()) {
                    this.f3697d.abortAnimation();
                    return true;
                }
            }
        }
        VelocityTracker velocityTracker = this.f3702i;
        if (velocityTracker != null) {
            velocityTracker.addMovement(ev);
        }
        return false;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Generic types in debug info not equals: x0.f != com.google.android.material.appbar.HeaderBehavior<V> */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0048  */
    @Override // s.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean D(androidx.coordinatorlayout.widget.CoordinatorLayout r7, android.view.View r8, android.view.MotionEvent r9) {
        /*
            r6 = this;
            r0 = 0
            int r1 = r9.getActionMasked()
            r2 = 1
            r3 = -1
            r4 = 0
            r5 = 0
            switch(r1) {
                case 1: goto L_0x003c;
                case 2: goto L_0x0027;
                case 3: goto L_0x0040;
                case 4: goto L_0x000c;
                case 5: goto L_0x000c;
                case 6: goto L_0x000d;
                default: goto L_0x000c;
            }
        L_0x000c:
            goto L_0x0064
        L_0x000d:
            int r1 = r9.getActionIndex()
            if (r1 != 0) goto L_0x0015
            r1 = r2
            goto L_0x0016
        L_0x0015:
            r1 = r5
        L_0x0016:
            int r3 = r9.getPointerId(r1)
            r6.f3699f = r3
            float r3 = r9.getY(r1)
            r4 = 1056964608(0x3f000000, float:0.5)
            float r3 = r3 + r4
            int r3 = (int) r3
            r6.f3700g = r3
            goto L_0x0064
        L_0x0027:
            int r1 = r6.f3699f
            int r1 = r9.findPointerIndex(r1)
            if (r1 != r3) goto L_0x0030
            return r5
        L_0x0030:
            float r7 = r9.getY(r1)
            int r7 = (int) r7
            r6.f3700g = r7
            r6.J(r8)
            throw r4
        L_0x003c:
            android.view.VelocityTracker r1 = r6.f3702i
            if (r1 != 0) goto L_0x004e
        L_0x0040:
            r6.f3698e = r5
            r6.f3699f = r3
            android.view.VelocityTracker r1 = r6.f3702i
            if (r1 == 0) goto L_0x0064
            r1.recycle()
            r6.f3702i = r4
            goto L_0x0064
        L_0x004e:
            r1.addMovement(r9)
            android.view.VelocityTracker r7 = r6.f3702i
            r9 = 1000(0x3e8, float:1.401E-42)
            r7.computeCurrentVelocity(r9)
            android.view.VelocityTracker r7 = r6.f3702i
            int r9 = r6.f3699f
            r7.getYVelocity(r9)
            r6.K(r8)
            throw r4
        L_0x0064:
            android.view.VelocityTracker r1 = r6.f3702i
            if (r1 == 0) goto L_0x006b
            r1.addMovement(r9)
        L_0x006b:
            boolean r1 = r6.f3698e
            if (r1 != 0) goto L_0x0073
            if (r0 == 0) goto L_0x0072
            goto L_0x0073
        L_0x0072:
            r2 = r5
        L_0x0073:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: x0.f.D(androidx.coordinatorlayout.widget.CoordinatorLayout, android.view.View, android.view.MotionEvent):boolean");
    }

    /* JADX WARN: Generic types in debug info not equals: x0.f != com.google.android.material.appbar.HeaderBehavior<V> */
    public int N(CoordinatorLayout parent, View view, int newOffset) {
        return O(parent, view, newOffset, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }

    /* JADX WARN: Generic types in debug info not equals: x0.f != com.google.android.material.appbar.HeaderBehavior<V> */
    public final int M(CoordinatorLayout coordinatorLayout, View view, int dy, int minOffset, int maxOffset) {
        return O(coordinatorLayout, view, L() - dy, minOffset, maxOffset);
    }

    /* JADX WARN: Generic types in debug info not equals: x0.f != com.google.android.material.appbar.HeaderBehavior<V> */
    public final void I() {
        if (this.f3702i == null) {
            this.f3702i = VelocityTracker.obtain();
        }
    }
}
