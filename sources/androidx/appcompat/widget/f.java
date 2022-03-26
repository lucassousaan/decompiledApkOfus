package androidx.appcompat.widget;

/* JADX WARN: Classes with same name are omitted:
  
 */
/* loaded from: classes.dex */
public class f implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ ActionBarOverlayLayout f318b;

    public f(ActionBarOverlayLayout this$0) {
        this.f318b = this$0;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f318b.n();
        ActionBarOverlayLayout actionBarOverlayLayout = this.f318b;
        actionBarOverlayLayout.B = actionBarOverlayLayout.f119e.animate().translationY(0.0f).setListener(this.f318b.C);
    }
}
