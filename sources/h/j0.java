package h;

import android.view.View;
import android.view.ViewTreeObserver;

/* JADX WARN: Classes with same name are omitted:
  
 */
/* loaded from: classes.dex */
public class j0 implements ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ l0 f2086b;

    public j0(l0 this$0) {
        this.f2086b = this$0;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public void onGlobalLayout() {
        if (this.f2086b.a() && !this.f2086b.f2122j.B()) {
            View anchor = this.f2086b.f2127o;
            if (anchor == null || !anchor.isShown()) {
                this.f2086b.dismiss();
            } else {
                this.f2086b.f2122j.i();
            }
        }
    }
}
