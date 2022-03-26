package d;

import android.view.View;
import android.view.ViewParent;
import f0.k1;

/* JADX WARN: Classes with same name are omitted:
  
 */
/* loaded from: classes.dex */
public class y0 implements k1 {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ a1 f1755a;

    public y0(a1 this$0) {
        this.f1755a = this$0;
    }

    public void a(View view) {
        ViewParent parent = this.f1755a.f1584d.getParent();
        ((View) parent).invalidate();
    }
}
