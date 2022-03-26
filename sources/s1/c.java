package s1;

import android.text.TextWatcher;
import android.view.View;
import android.widget.EditText;
import com.google.android.material.textfield.TextInputLayout;

/* JADX WARN: Classes with same name are omitted:
  
 */
/* loaded from: classes.dex */
public class c implements r0 {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ k f3462a;

    public c(k this$0) {
        this.f3462a = this$0;
    }

    @Override // s1.r0
    public void a(TextInputLayout textInputLayout) {
        boolean z2;
        View.OnFocusChangeListener onFocusChangeListener;
        TextWatcher textWatcher;
        TextWatcher textWatcher2;
        boolean l2;
        EditText editText = textInputLayout.getEditText();
        if (editText.hasFocus()) {
            l2 = k.l(editText.getText());
            if (l2) {
                z2 = true;
                textInputLayout.setEndIconVisible(z2);
                textInputLayout.setEndIconCheckable(false);
                onFocusChangeListener = this.f3462a.f3502e;
                editText.setOnFocusChangeListener(onFocusChangeListener);
                textWatcher = this.f3462a.f3501d;
                editText.removeTextChangedListener(textWatcher);
                textWatcher2 = this.f3462a.f3501d;
                editText.addTextChangedListener(textWatcher2);
            }
        }
        z2 = false;
        textInputLayout.setEndIconVisible(z2);
        textInputLayout.setEndIconCheckable(false);
        onFocusChangeListener = this.f3462a.f3502e;
        editText.setOnFocusChangeListener(onFocusChangeListener);
        textWatcher = this.f3462a.f3501d;
        editText.removeTextChangedListener(textWatcher);
        textWatcher2 = this.f3462a.f3501d;
        editText.addTextChangedListener(textWatcher2);
    }
}
