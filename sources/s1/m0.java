package s1;

import android.text.Editable;
import android.text.TextWatcher;
import com.google.android.material.textfield.TextInputLayout;

/* JADX WARN: Classes with same name are omitted:
  
 */
/* loaded from: classes.dex */
public class m0 implements TextWatcher {

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ TextInputLayout f3512b;

    public m0(TextInputLayout this$0) {
        this.f3512b = this$0;
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(Editable s2) {
        boolean z2;
        boolean z3;
        TextInputLayout textInputLayout = this.f3512b;
        z2 = textInputLayout.M0;
        textInputLayout.v0(!z2);
        TextInputLayout textInputLayout2 = this.f3512b;
        if (textInputLayout2.f1493k) {
            textInputLayout2.n0(s2.length());
        }
        z3 = this.f3512b.f1507r;
        if (z3) {
            this.f3512b.z0(s2.length());
        }
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(CharSequence s2, int start, int count, int after) {
    }

    @Override // android.text.TextWatcher
    public void onTextChanged(CharSequence s2, int start, int before, int count) {
    }
}
