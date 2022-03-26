package s1;

import android.widget.AutoCompleteTextView;

/* JADX WARN: Classes with same name are omitted:
  
 */
/* loaded from: classes.dex */
public class x implements AutoCompleteTextView.OnDismissListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ z f3535a;

    public x(z this$0) {
        this.f3535a = this$0;
    }

    @Override // android.widget.AutoCompleteTextView.OnDismissListener
    public void onDismiss() {
        this.f3535a.f3543i = true;
        this.f3535a.f3545k = System.currentTimeMillis();
        this.f3535a.E(false);
    }
}
