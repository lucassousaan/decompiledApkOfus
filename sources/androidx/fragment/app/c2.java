package androidx.fragment.app;

import android.graphics.Rect;
import android.transition.Transition;

/* JADX WARN: Classes with same name are omitted:
  
 */
/* loaded from: classes.dex */
public class c2 extends Transition.EpicenterCallback {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Rect f738a;

    public c2(h2 this$0, Rect rect) {
        this.f738a = rect;
    }

    @Override // android.transition.Transition.EpicenterCallback
    public Rect onGetEpicenter(Transition transition) {
        return this.f738a;
    }
}
