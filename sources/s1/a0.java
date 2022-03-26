package s1;

import android.content.Context;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.textfield.TextInputLayout;

/* JADX WARN: Classes with same name are omitted:
  
 */
/* loaded from: classes.dex */
public abstract class a0 {

    /* renamed from: a  reason: collision with root package name */
    public TextInputLayout f3453a;

    /* renamed from: b  reason: collision with root package name */
    public Context f3454b;

    /* renamed from: c  reason: collision with root package name */
    public CheckableImageButton f3455c;

    public abstract void a();

    public a0(TextInputLayout textInputLayout) {
        this.f3453a = textInputLayout;
        this.f3454b = textInputLayout.getContext();
        this.f3455c = textInputLayout.getEndIconView();
    }

    public boolean d() {
        return false;
    }

    public boolean b(int boxBackgroundMode) {
        return true;
    }

    public void c(boolean visible) {
    }
}
