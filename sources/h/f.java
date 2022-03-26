package h;

import android.view.View;
import android.view.ViewTreeObserver;

/* JADX WARN: Classes with same name are omitted:
  
 */
/* loaded from: classes.dex */
public class f implements ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ k f2075b;

    public f(k this$0) {
        this.f2075b = this$0;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public void onGlobalLayout() {
        if (this.f2075b.a() && this.f2075b.f2094j.size() > 0 && !((j) this.f2075b.f2094j.get(0)).f2083a.B()) {
            View anchor = this.f2075b.f2101q;
            if (anchor == null || !anchor.isShown()) {
                this.f2075b.dismiss();
                return;
            }
            for (j info : this.f2075b.f2094j) {
                info.f2083a.i();
            }
        }
    }
}
