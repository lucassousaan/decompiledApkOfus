package a1;

import android.view.View;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import g0.l;
import g0.t;

/* JADX WARN: Classes with same name are omitted:
  
 */
/* loaded from: classes.dex */
public class g implements t {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f11a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ BottomSheetBehavior f12b;

    public g(BottomSheetBehavior this$0, int i2) {
        this.f12b = this$0;
        this.f11a = i2;
    }

    @Override // g0.t
    public boolean a(View view, l arguments) {
        this.f12b.s0(this.f11a);
        return true;
    }
}
