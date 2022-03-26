package androidx.fragment.app;

import android.util.Log;
import androidx.activity.result.b;
import androidx.activity.result.c;

/* JADX WARN: Classes with same name are omitted:
  
 */
/* loaded from: classes.dex */
public class w0 implements c {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ m1 f958a;

    public w0(m1 this$0) {
        this.f958a = this$0;
    }

    /* renamed from: b */
    public void a(b result) {
        x1 x1Var;
        i1 requestInfo = (i1) this.f958a.B.pollFirst();
        if (requestInfo == null) {
            Log.w("FragmentManager", "No IntentSenders were started for " + this);
            return;
        }
        String fragmentWho = requestInfo.f796b;
        int requestCode = requestInfo.f797c;
        x1Var = this.f958a.f837c;
        f0 fragment = x1Var.i(fragmentWho);
        if (fragment == null) {
            Log.w("FragmentManager", "Intent Sender result delivered for unknown Fragment " + fragmentWho);
            return;
        }
        fragment.a0(requestCode, result.j(), result.i());
    }
}
