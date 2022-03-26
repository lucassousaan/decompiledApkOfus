package androidx.fragment.app;

import android.util.Log;
import androidx.activity.result.c;
import java.util.ArrayList;
import java.util.Map;

/* JADX WARN: Classes with same name are omitted:
  
 */
/* loaded from: classes.dex */
public class x0 implements c {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ m1 f965a;

    public x0(m1 this$0) {
        this.f965a = this$0;
    }

    /* renamed from: b */
    public void a(Map map) {
        x1 x1Var;
        int i2;
        String[] permissions = (String[]) map.keySet().toArray(new String[0]);
        ArrayList<Boolean> resultValues = new ArrayList<>(map.values());
        int[] grantResults = new int[resultValues.size()];
        for (int i3 = 0; i3 < resultValues.size(); i3++) {
            if (resultValues.get(i3).booleanValue()) {
                i2 = 0;
            } else {
                i2 = -1;
            }
            grantResults[i3] = i2;
        }
        i1 requestInfo = (i1) this.f965a.B.pollFirst();
        if (requestInfo == null) {
            Log.w("FragmentManager", "No permissions were requested for " + this);
            return;
        }
        String fragmentWho = requestInfo.f796b;
        int requestCode = requestInfo.f797c;
        x1Var = this.f965a.f837c;
        f0 fragment = x1Var.i(fragmentWho);
        if (fragment == null) {
            Log.w("FragmentManager", "Permission request result delivered for unknown Fragment " + fragmentWho);
            return;
        }
        fragment.v0(requestCode, permissions, grantResults);
    }
}
