package androidx.fragment.app;

import android.util.Log;
import android.view.View;
import androidx.lifecycle.m;
import androidx.lifecycle.w;

/* JADX WARN: Classes with same name are omitted:
  
 */
/* loaded from: classes.dex */
public class u implements w {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ w f928a;

    public u(w this$0) {
        this.f928a = this$0;
    }

    /* renamed from: a */
    public void b(m lifecycleOwner) {
        if (lifecycleOwner != null && w.q1(this.f928a)) {
            View view = this.f928a.c1();
            if (view.getParent() != null) {
                throw new IllegalStateException("DialogFragment can not be attached to a container view");
            } else if (w.o1(this.f928a) != null) {
                if (m1.v0(3)) {
                    Log.d("FragmentManager", "DialogFragment " + this + " setting the content view on " + w.o1(this.f928a));
                }
                w.o1(this.f928a).setContentView(view);
            }
        }
    }
}
