package a1;

import android.view.View;
import android.view.ViewGroup;
import com.google.android.material.bottomsheet.BottomSheetBehavior;

/* JADX WARN: Classes with same name are omitted:
  
 */
/* loaded from: classes.dex */
public class b implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ View f2b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ ViewGroup.LayoutParams f3c;

    public b(BottomSheetBehavior this$0, View view, ViewGroup.LayoutParams layoutParams) {
        this.f2b = view;
        this.f3c = layoutParams;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f2b.setLayoutParams(this.f3c);
    }
}
