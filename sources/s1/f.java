package s1;

import android.text.Editable;
import android.view.View;

/* JADX WARN: Classes with same name are omitted:
  
 */
/* loaded from: classes.dex */
public class f implements View.OnClickListener {

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ k f3491b;

    public f(k this$0) {
        this.f3491b = this$0;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View v2) {
        Editable text = this.f3491b.f3453a.getEditText().getText();
        if (text != null) {
            text.clear();
        }
        this.f3491b.f3453a.V();
    }
}
