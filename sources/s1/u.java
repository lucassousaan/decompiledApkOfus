package s1;

import android.view.View;
import android.widget.AutoCompleteTextView;
import com.google.android.material.textfield.TextInputLayout;

/* JADX WARN: Classes with same name are omitted:
  
 */
/* loaded from: classes.dex */
public class u implements s0 {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ z f3526a;

    public u(z this$0) {
        this.f3526a = this$0;
    }

    @Override // s1.s0
    public void a(TextInputLayout textInputLayout, int previousIcon) {
        View.OnFocusChangeListener onFocusChangeListener;
        AutoCompleteTextView editText = (AutoCompleteTextView) textInputLayout.getEditText();
        if (editText != null && previousIcon == 3) {
            editText.post(new t(this, editText));
            View.OnFocusChangeListener onFocusChangeListener2 = editText.getOnFocusChangeListener();
            onFocusChangeListener = this.f3526a.f3539e;
            if (onFocusChangeListener2 == onFocusChangeListener) {
                editText.setOnFocusChangeListener(null);
            }
            editText.setOnTouchListener(null);
            z.i();
            editText.setOnDismissListener(null);
        }
    }
}
