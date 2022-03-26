package s1;

import android.text.method.PasswordTransformationMethod;
import android.view.View;
import android.widget.EditText;

/* JADX WARN: Classes with same name are omitted:
  
 */
/* loaded from: classes.dex */
public class k0 implements View.OnClickListener {

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ l0 f3507b;

    public k0(l0 this$0) {
        this.f3507b = this$0;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View v2) {
        boolean g2;
        EditText editText = this.f3507b.f3453a.getEditText();
        if (editText != null) {
            int selection = editText.getSelectionEnd();
            g2 = this.f3507b.g();
            if (g2) {
                editText.setTransformationMethod(null);
            } else {
                editText.setTransformationMethod(PasswordTransformationMethod.getInstance());
            }
            if (selection >= 0) {
                editText.setSelection(selection);
            }
            this.f3507b.f3453a.V();
        }
    }
}
