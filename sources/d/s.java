package d;

import android.view.View;
import f0.a0;
import f0.c1;
import f0.x1;

/* JADX WARN: Classes with same name are omitted:
  
 */
/* loaded from: classes.dex */
public class s implements a0 {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ n0 f1728a;

    public s(n0 this$0) {
        this.f1728a = this$0;
    }

    @Override // f0.a0
    public x1 a(View v2, x1 insets) {
        int top = insets.i();
        int newTop = this.f1728a.K0(insets, null);
        if (top != newTop) {
            insets = insets.m(insets.g(), newTop, insets.h(), insets.f());
        }
        return c1.X(v2, insets);
    }
}
