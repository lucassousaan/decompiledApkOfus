package a1;

import android.view.View;
import com.google.android.material.bottomsheet.BottomSheetBehavior;

/* JADX WARN: Classes with same name are omitted:
  
 */
/* loaded from: classes.dex */
public class c implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ View f4b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ int f5c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ BottomSheetBehavior f6d;

    public c(BottomSheetBehavior this$0, View view, int i2) {
        this.f6d = this$0;
        this.f4b = view;
        this.f5c = i2;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f6d.v0(this.f4b, this.f5c);
    }
}
