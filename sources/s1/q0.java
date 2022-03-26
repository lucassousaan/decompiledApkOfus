package s1;

import android.os.Build;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import com.example.helloworld.R;
import com.google.android.material.textfield.TextInputLayout;
import f0.b;
import g0.f;

/* JADX WARN: Classes with same name are omitted:
  
 */
/* loaded from: classes.dex */
public class q0 extends b {

    /* renamed from: d  reason: collision with root package name */
    public final TextInputLayout f3521d;

    public q0(TextInputLayout layout) {
        this.f3521d = layout;
    }

    @Override // f0.b
    public void g(View host, f info) {
        String hint;
        String text;
        super.g(host, info);
        EditText editText = this.f3521d.getEditText();
        CharSequence inputText = editText != null ? editText.getText() : null;
        CharSequence hintText = this.f3521d.getHint();
        CharSequence errorText = this.f3521d.getError();
        CharSequence placeholderText = this.f3521d.getPlaceholderText();
        int maxCharLimit = this.f3521d.getCounterMaxLength();
        CharSequence counterOverflowDesc = this.f3521d.getCounterOverflowDescription();
        boolean showingText = !TextUtils.isEmpty(inputText);
        boolean hasHint = !TextUtils.isEmpty(hintText);
        boolean isHintCollapsed = !this.f3521d.N();
        boolean showingError = !TextUtils.isEmpty(errorText);
        boolean contentInvalid = showingError || !TextUtils.isEmpty(counterOverflowDesc);
        String hint2 = hasHint ? hintText.toString() : "";
        if (showingText) {
            info.r0(inputText);
            hint = hint2;
        } else if (!TextUtils.isEmpty(hint2)) {
            hint = hint2;
            info.r0(hint);
            if (isHintCollapsed && placeholderText != null) {
                info.r0(hint + ", " + ((Object) placeholderText));
            }
        } else {
            hint = hint2;
            if (placeholderText != null) {
                info.r0(placeholderText);
            }
        }
        if (!TextUtils.isEmpty(hint)) {
            if (Build.VERSION.SDK_INT >= 26) {
                info.g0(hint);
            } else {
                if (showingText) {
                    text = ((Object) inputText) + ", " + hint;
                } else {
                    text = hint;
                }
                info.r0(text);
            }
            info.o0(!showingText);
        }
        info.h0((inputText == null || inputText.length() != maxCharLimit) ? -1 : maxCharLimit);
        if (contentInvalid) {
            info.c0(showingError ? errorText : counterOverflowDesc);
        }
        if (editText != null) {
            editText.setLabelFor(R.id.textinput_helper_text);
        }
    }
}
