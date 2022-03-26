package a1;

import a0.a;
import android.view.View;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import java.lang.ref.WeakReference;
import l0.k;

/* JADX WARN: Classes with same name are omitted:
  
 */
/* loaded from: classes.dex */
public class f extends k {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ BottomSheetBehavior f10a;

    public f(BottomSheetBehavior this$0) {
        this.f10a = this$0;
    }

    @Override // l0.k
    public boolean m(View child, int pointerId) {
        BottomSheetBehavior bottomSheetBehavior = this.f10a;
        int i2 = bottomSheetBehavior.G;
        if (i2 == 1 || bottomSheetBehavior.U) {
            return false;
        }
        if (i2 == 3 && bottomSheetBehavior.S == pointerId) {
            WeakReference weakReference = bottomSheetBehavior.P;
            View scroll = weakReference != null ? (View) weakReference.get() : null;
            if (scroll != null && scroll.canScrollVertically(-1)) {
                return false;
            }
        }
        WeakReference weakReference2 = this.f10a.O;
        return weakReference2 != null && weakReference2.get() == child;
    }

    @Override // l0.k
    public void k(View changedView, int left, int top, int dx, int dy) {
        this.f10a.Z(top);
    }

    @Override // l0.k
    public void j(int state) {
        boolean z2;
        if (state == 1) {
            z2 = this.f10a.F;
            if (z2) {
                this.f10a.t0(1);
            }
        }
    }

    public final boolean n(View child) {
        int top = child.getTop();
        BottomSheetBehavior bottomSheetBehavior = this.f10a;
        return top > (bottomSheetBehavior.N + bottomSheetBehavior.b0()) / 2;
    }

    @Override // l0.k
    public void l(View releasedChild, float xvel, float yvel) {
        int targetState;
        int top;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        if (yvel < 0.0f) {
            z5 = this.f10a.f1261b;
            if (z5) {
                top = this.f10a.f1284y;
                targetState = 3;
            } else {
                int currentTop = releasedChild.getTop();
                BottomSheetBehavior bottomSheetBehavior = this.f10a;
                if (currentTop > bottomSheetBehavior.f1285z) {
                    int top2 = bottomSheetBehavior.f1285z;
                    top = top2;
                    targetState = 6;
                } else {
                    int top3 = bottomSheetBehavior.b0();
                    top = top3;
                    targetState = 3;
                }
            }
        } else {
            BottomSheetBehavior bottomSheetBehavior2 = this.f10a;
            if (!bottomSheetBehavior2.D || !bottomSheetBehavior2.x0(releasedChild, yvel)) {
                int top4 = (yvel > 0.0f ? 1 : (yvel == 0.0f ? 0 : -1));
                if (top4 == 0 || Math.abs(xvel) > Math.abs(yvel)) {
                    int currentTop2 = releasedChild.getTop();
                    z2 = this.f10a.f1261b;
                    if (!z2) {
                        BottomSheetBehavior bottomSheetBehavior3 = this.f10a;
                        int targetState2 = bottomSheetBehavior3.f1285z;
                        if (currentTop2 >= targetState2) {
                            int top5 = currentTop2 - targetState2;
                            if (Math.abs(top5) < Math.abs(currentTop2 - this.f10a.B)) {
                                int top6 = this.f10a.f1285z;
                                top = top6;
                                targetState = 6;
                            } else {
                                int top7 = this.f10a.B;
                                top = top7;
                                targetState = 4;
                            }
                        } else if (currentTop2 < Math.abs(currentTop2 - bottomSheetBehavior3.B)) {
                            int top8 = this.f10a.b0();
                            top = top8;
                            targetState = 3;
                        } else {
                            int top9 = this.f10a.f1285z;
                            top = top9;
                            targetState = 6;
                        }
                    } else if (Math.abs(currentTop2 - this.f10a.f1284y) < Math.abs(currentTop2 - this.f10a.B)) {
                        int top10 = this.f10a.f1284y;
                        top = top10;
                        targetState = 3;
                    } else {
                        int top11 = this.f10a.B;
                        top = top11;
                        targetState = 4;
                    }
                } else {
                    z3 = this.f10a.f1261b;
                    if (z3) {
                        top = this.f10a.B;
                        targetState = 4;
                    } else {
                        int currentTop3 = releasedChild.getTop();
                        if (Math.abs(currentTop3 - this.f10a.f1285z) < Math.abs(currentTop3 - this.f10a.B)) {
                            int top12 = this.f10a.f1285z;
                            top = top12;
                            targetState = 6;
                        } else {
                            int top13 = this.f10a.B;
                            top = top13;
                            targetState = 4;
                        }
                    }
                }
            } else if ((Math.abs(xvel) >= Math.abs(yvel) || yvel <= 500.0f) && !n(releasedChild)) {
                z4 = this.f10a.f1261b;
                if (z4) {
                    top = this.f10a.f1284y;
                    targetState = 3;
                } else {
                    int top14 = releasedChild.getTop();
                    if (Math.abs(top14 - this.f10a.b0()) < Math.abs(releasedChild.getTop() - this.f10a.f1285z)) {
                        top = this.f10a.b0();
                        targetState = 3;
                    } else {
                        top = this.f10a.f1285z;
                        targetState = 6;
                    }
                }
            } else {
                top = this.f10a.N;
                targetState = 5;
            }
        }
        this.f10a.y0(releasedChild, targetState, top, true);
    }

    @Override // l0.k
    public int b(View child, int top, int dy) {
        int b02 = this.f10a.b0();
        BottomSheetBehavior bottomSheetBehavior = this.f10a;
        return a.b(top, b02, bottomSheetBehavior.D ? bottomSheetBehavior.N : bottomSheetBehavior.B);
    }

    @Override // l0.k
    public int a(View child, int left, int dx) {
        return child.getLeft();
    }

    @Override // l0.k
    public int e(View child) {
        BottomSheetBehavior bottomSheetBehavior = this.f10a;
        if (bottomSheetBehavior.D) {
            return bottomSheetBehavior.N;
        }
        return bottomSheetBehavior.B;
    }
}
