package s1;

import android.widget.EditText;

/* JADX WARN: Classes with same name are omitted:
  
 */
/* loaded from: classes.dex */
public class i0 implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ EditText f3497b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ j0 f3498c;

    public i0(j0 this$1, EditText editText) {
        this.f3498c = this$1;
        this.f3497b = editText;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f3497b.removeTextChangedListener(l0.f(this.f3498c.f3500a));
    }
}
