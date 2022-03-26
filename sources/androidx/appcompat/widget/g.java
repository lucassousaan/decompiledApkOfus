package androidx.appcompat.widget;

/* JADX WARN: Classes with same name are omitted:
  
 */
/* loaded from: classes.dex */
public class g implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ ActionBarOverlayLayout f323b;

    public g(ActionBarOverlayLayout this$0) {
        this.f323b = this$0;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f323b.n();
        ActionBarOverlayLayout actionBarOverlayLayout = this.f323b;
        actionBarOverlayLayout.B = actionBarOverlayLayout.f119e.animate().translationY(-this.f323b.f119e.getHeight()).setListener(this.f323b.C);
    }
}
