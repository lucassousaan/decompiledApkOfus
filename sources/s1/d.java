package s1;

import android.text.TextWatcher;
import android.widget.EditText;

/* JADX WARN: Classes with same name are omitted:
  
 */
/* loaded from: classes.dex */
public class d implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ EditText f3484b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ e f3485c;

    public d(e this$1, EditText editText) {
        this.f3485c = this$1;
        this.f3484b = editText;
    }

    @Override // java.lang.Runnable
    public void run() {
        TextWatcher textWatcher;
        EditText editText = this.f3484b;
        textWatcher = this.f3485c.f3487a.f3501d;
        editText.removeTextChangedListener(textWatcher);
    }
}
