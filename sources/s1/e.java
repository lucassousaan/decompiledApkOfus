package s1;

import android.view.View;
import android.widget.EditText;
import com.google.android.material.textfield.TextInputLayout;

/* JADX WARN: Classes with same name are omitted:
  
 */
/* loaded from: classes.dex */
public class e implements s0 {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ k f3487a;

    public e(k this$0) {
        this.f3487a = this$0;
    }

    @Override // s1.s0
    public void a(TextInputLayout textInputLayout, int previousIcon) {
        View.OnFocusChangeListener onFocusChangeListener;
        EditText editText = textInputLayout.getEditText();
        if (editText != null && previousIcon == 2) {
            editText.post(new d(this, editText));
            View.OnFocusChangeListener onFocusChangeListener2 = editText.getOnFocusChangeListener();
            onFocusChangeListener = this.f3487a.f3502e;
            if (onFocusChangeListener2 == onFocusChangeListener) {
                editText.setOnFocusChangeListener(null);
            }
        }
    }
}
