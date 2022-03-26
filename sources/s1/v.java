package s1;

import android.view.View;
import android.widget.AutoCompleteTextView;

/* JADX WARN: Classes with same name are omitted:
  
 */
/* loaded from: classes.dex */
public class v implements View.OnClickListener {

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ z f3532b;

    public v(z this$0) {
        this.f3532b = this$0;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View v2) {
        AutoCompleteTextView editText = (AutoCompleteTextView) this.f3532b.f3453a.getEditText();
        this.f3532b.H(editText);
    }
}
