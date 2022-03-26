package s1;

import android.text.Editable;
import android.text.TextWatcher;

/* JADX WARN: Classes with same name are omitted:
  
 */
/* loaded from: classes.dex */
public class a implements TextWatcher {

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ k f3452b;

    public a(k this$0) {
        this.f3452b = this$0;
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(CharSequence s2, int start, int count, int after) {
    }

    @Override // android.text.TextWatcher
    public void onTextChanged(CharSequence s2, int start, int before, int count) {
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(Editable s2) {
        boolean z2;
        boolean l2;
        if (this.f3452b.f3453a.getSuffixText() == null) {
            k kVar = this.f3452b;
            if (kVar.f3453a.hasFocus()) {
                l2 = k.l(s2);
                if (l2) {
                    z2 = true;
                    kVar.i(z2);
                }
            }
            z2 = false;
            kVar.i(z2);
        }
    }
}
