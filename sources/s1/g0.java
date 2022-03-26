package s1;

import com.google.android.material.internal.CheckableImageButton;
import l1.p;

/* JADX WARN: Classes with same name are omitted:
  
 */
/* loaded from: classes.dex */
public class g0 extends p {

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ l0 f3493b;

    public g0(l0 this$0) {
        this.f3493b = this$0;
    }

    @Override // l1.p, android.text.TextWatcher
    public void beforeTextChanged(CharSequence s2, int start, int count, int after) {
        boolean g2;
        l0 l0Var = this.f3493b;
        CheckableImageButton checkableImageButton = l0Var.f3455c;
        g2 = l0Var.g();
        checkableImageButton.setChecked(!g2);
    }
}
