package a1;

import android.view.View;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import f0.c1;
import l0.l;

/* loaded from: classes.dex */
public class k implements Runnable {

    /* renamed from: b */
    public final View f18b;

    /* renamed from: c */
    public boolean f19c;

    /* renamed from: d */
    public int f20d;

    /* renamed from: e */
    public final /* synthetic */ BottomSheetBehavior f21e;

    /* JADX WARN: Generic types in debug info not equals: a1.k != com.google.android.material.bottomsheet.BottomSheetBehavior<V>$SettleRunnable */
    public k(BottomSheetBehavior bottomSheetBehavior, View view, int targetState) {
        this.f21e = bottomSheetBehavior;
        this.f18b = view;
        this.f20d = targetState;
    }

    /* JADX WARN: Generic types in debug info not equals: a1.k != com.google.android.material.bottomsheet.BottomSheetBehavior<V>$SettleRunnable */
    @Override // java.lang.Runnable
    public void run() {
        l lVar = this.f21e.H;
        if (lVar == null || !lVar.k(true)) {
            this.f21e.t0(this.f20d);
        } else {
            c1.d0(this.f18b, this);
        }
        this.f19c = false;
    }
}
