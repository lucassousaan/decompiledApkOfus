package b1;

import android.view.View;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.button.MaterialButtonToggleGroup;
import f0.b;
import g0.e;
import g0.f;

/* JADX WARN: Classes with same name are omitted:
  
 */
/* loaded from: classes.dex */
public class g extends b {

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ MaterialButtonToggleGroup f1159d;

    public g(MaterialButtonToggleGroup this$0) {
        this.f1159d = this$0;
    }

    @Override // f0.b
    public void g(View host, f info) {
        int n2;
        super.g(host, info);
        n2 = this.f1159d.n(host);
        info.Z(e.a(0, 1, n2, 1, false, ((MaterialButton) host).isChecked()));
    }
}
