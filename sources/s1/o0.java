package s1;

import com.google.android.material.textfield.TextInputLayout;

/* JADX WARN: Classes with same name are omitted:
  
 */
/* loaded from: classes.dex */
public class o0 implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ TextInputLayout f3517b;

    public o0(TextInputLayout this$0) {
        this.f3517b = this$0;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f3517b.f1483f.requestLayout();
    }
}
