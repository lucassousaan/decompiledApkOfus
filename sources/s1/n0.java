package s1;

import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.textfield.TextInputLayout;

/* JADX WARN: Classes with same name are omitted:
  
 */
/* loaded from: classes.dex */
public class n0 implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ TextInputLayout f3515b;

    public n0(TextInputLayout this$0) {
        this.f3515b = this$0;
    }

    @Override // java.lang.Runnable
    public void run() {
        CheckableImageButton checkableImageButton;
        CheckableImageButton checkableImageButton2;
        checkableImageButton = this.f3515b.f1490i0;
        checkableImageButton.performClick();
        checkableImageButton2 = this.f3515b.f1490i0;
        checkableImageButton2.jumpDrawablesToCurrentState();
    }
}
