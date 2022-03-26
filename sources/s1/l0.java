package s1;

import android.text.TextWatcher;
import android.text.method.PasswordTransformationMethod;
import android.widget.EditText;
import com.example.helloworld.R;
import com.google.android.material.textfield.TextInputLayout;
import e.a;

/* loaded from: classes.dex */
public class l0 extends a0 {

    /* renamed from: d */
    public final TextWatcher f3508d = new g0(this);

    /* renamed from: e */
    public final r0 f3509e = new h0(this);

    /* renamed from: f */
    public final s0 f3510f = new j0(this);

    public static /* synthetic */ TextWatcher f(l0 x02) {
        return x02.f3508d;
    }

    public l0(TextInputLayout textInputLayout) {
        super(textInputLayout);
    }

    @Override // s1.a0
    public void a() {
        this.f3453a.setEndIconDrawable(a.b(this.f3454b, R.drawable.design_password_eye));
        TextInputLayout textInputLayout = this.f3453a;
        textInputLayout.setEndIconContentDescription(textInputLayout.getResources().getText(R.string.password_toggle_content_description));
        this.f3453a.setEndIconOnClickListener(new k0(this));
        this.f3453a.e(this.f3509e);
        this.f3453a.f(this.f3510f);
        EditText editText = this.f3453a.getEditText();
        if (h(editText)) {
            editText.setTransformationMethod(PasswordTransformationMethod.getInstance());
        }
    }

    public final boolean g() {
        EditText editText = this.f3453a.getEditText();
        return editText != null && (editText.getTransformationMethod() instanceof PasswordTransformationMethod);
    }

    public static boolean h(EditText editText) {
        return editText != null && (editText.getInputType() == 16 || editText.getInputType() == 128 || editText.getInputType() == 144 || editText.getInputType() == 224);
    }
}
