package s1;

import android.text.TextWatcher;
import android.widget.EditText;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.textfield.TextInputLayout;

/* JADX WARN: Classes with same name are omitted:
  
 */
/* loaded from: classes.dex */
public class h0 implements r0 {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ l0 f3495a;

    public h0(l0 this$0) {
        this.f3495a = this$0;
    }

    @Override // s1.r0
    public void a(TextInputLayout textInputLayout) {
        boolean g2;
        TextWatcher textWatcher;
        TextWatcher textWatcher2;
        EditText editText = textInputLayout.getEditText();
        textInputLayout.setEndIconVisible(true);
        textInputLayout.setEndIconCheckable(true);
        l0 l0Var = this.f3495a;
        CheckableImageButton checkableImageButton = l0Var.f3455c;
        g2 = l0Var.g();
        checkableImageButton.setChecked(true ^ g2);
        textWatcher = this.f3495a.f3508d;
        editText.removeTextChangedListener(textWatcher);
        textWatcher2 = this.f3495a.f3508d;
        editText.addTextChangedListener(textWatcher2);
    }
}
