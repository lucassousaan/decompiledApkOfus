package s1;

import android.text.method.PasswordTransformationMethod;
import android.widget.EditText;
import com.google.android.material.textfield.TextInputLayout;

/* JADX WARN: Classes with same name are omitted:
  
 */
/* loaded from: classes.dex */
public class j0 implements s0 {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ l0 f3500a;

    public j0(l0 this$0) {
        this.f3500a = this$0;
    }

    @Override // s1.s0
    public void a(TextInputLayout textInputLayout, int previousIcon) {
        EditText editText = textInputLayout.getEditText();
        if (editText != null && previousIcon == 1) {
            editText.setTransformationMethod(PasswordTransformationMethod.getInstance());
            editText.post(new i0(this, editText));
        }
    }
}
