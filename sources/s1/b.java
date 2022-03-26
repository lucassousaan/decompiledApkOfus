package s1;

import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;

/* JADX WARN: Classes with same name are omitted:
  
 */
/* loaded from: classes.dex */
public class b implements View.OnFocusChangeListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ k f3456a;

    public b(k this$0) {
        this.f3456a = this$0;
    }

    @Override // android.view.View.OnFocusChangeListener
    public void onFocusChange(View v2, boolean hasFocus) {
        boolean z2 = true;
        boolean hasText = !TextUtils.isEmpty(((EditText) v2).getText());
        k kVar = this.f3456a;
        if (!hasText || !hasFocus) {
            z2 = false;
        }
        kVar.i(z2);
    }
}
