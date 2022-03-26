package a1;

import android.view.View;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import f0.x1;
import l1.u;
import l1.v;
import l1.w;

/* JADX WARN: Classes with same name are omitted:
  
 */
/* loaded from: classes.dex */
public class e implements u {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ boolean f8a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ BottomSheetBehavior f9b;

    public e(BottomSheetBehavior this$0, boolean z2) {
        this.f9b = this$0;
        this.f8a = z2;
    }

    public x1 a(View view, x1 insets, v initialPadding) {
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        int i2;
        this.f9b.f1278s = insets.i();
        boolean isRtl = w.d(view);
        int bottomPadding = view.getPaddingBottom();
        int leftPadding = view.getPaddingLeft();
        int rightPadding = view.getPaddingRight();
        z2 = this.f9b.f1273n;
        if (z2) {
            this.f9b.f1277r = insets.f();
            int i3 = initialPadding.f2469d;
            i2 = this.f9b.f1277r;
            bottomPadding = i3 + i2;
        }
        z3 = this.f9b.f1274o;
        if (z3) {
            int leftPadding2 = isRtl ? initialPadding.f2468c : initialPadding.f2466a;
            leftPadding = leftPadding2 + insets.g();
        }
        z4 = this.f9b.f1275p;
        if (z4) {
            int rightPadding2 = isRtl ? initialPadding.f2466a : initialPadding.f2468c;
            rightPadding = rightPadding2 + insets.h();
        }
        view.setPadding(leftPadding, view.getPaddingTop(), rightPadding, bottomPadding);
        if (this.f8a) {
            this.f9b.f1271l = insets.e().f3671d;
        }
        z5 = this.f9b.f1273n;
        if (z5 || this.f8a) {
            this.f9b.C0(false);
        }
        return insets;
    }
}
