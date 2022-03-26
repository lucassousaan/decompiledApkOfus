package androidx.fragment.app;

import android.graphics.Rect;
import android.transition.Transition;

/* JADX WARN: Classes with same name are omitted:
  
 */
/* loaded from: classes.dex */
public class g2 extends Transition.EpicenterCallback {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Rect f787a;

    public g2(h2 this$0, Rect rect) {
        this.f787a = rect;
    }

    @Override // android.transition.Transition.EpicenterCallback
    public Rect onGetEpicenter(Transition transition) {
        Rect rect = this.f787a;
        if (rect == null || rect.isEmpty()) {
            return null;
        }
        return this.f787a;
    }
}
