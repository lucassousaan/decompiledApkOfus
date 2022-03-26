package s1;

import android.graphics.drawable.Drawable;
import android.text.TextWatcher;
import android.widget.AutoCompleteTextView;
import com.google.android.material.textfield.TextInputLayout;
import f0.c1;

/* JADX WARN: Classes with same name are omitted:
  
 */
/* loaded from: classes.dex */
public class s implements r0 {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ z f3523a;

    public s(z this$0) {
        this.f3523a = this$0;
    }

    @Override // s1.r0
    public void a(TextInputLayout textInputLayout) {
        AutoCompleteTextView autoCompleteTextView;
        TextWatcher textWatcher;
        TextWatcher textWatcher2;
        boolean D;
        q0 q0Var;
        autoCompleteTextView = z.y(textInputLayout.getEditText());
        this.f3523a.F(autoCompleteTextView);
        this.f3523a.v(autoCompleteTextView);
        this.f3523a.G(autoCompleteTextView);
        autoCompleteTextView.setThreshold(0);
        textWatcher = this.f3523a.f3538d;
        autoCompleteTextView.removeTextChangedListener(textWatcher);
        textWatcher2 = this.f3523a.f3538d;
        autoCompleteTextView.addTextChangedListener(textWatcher2);
        textInputLayout.setEndIconCheckable(true);
        textInputLayout.setErrorIconDrawable((Drawable) null);
        D = z.D(autoCompleteTextView);
        if (!D) {
            c1.s0(this.f3523a.f3455c, 2);
        }
        q0Var = this.f3523a.f3540f;
        textInputLayout.setTextInputAccessibilityDelegate(q0Var);
        textInputLayout.setEndIconVisible(true);
    }
}
