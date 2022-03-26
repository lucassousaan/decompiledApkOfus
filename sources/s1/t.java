package s1;

import android.text.TextWatcher;
import android.widget.AutoCompleteTextView;

/* JADX WARN: Classes with same name are omitted:
  
 */
/* loaded from: classes.dex */
public class t implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ AutoCompleteTextView f3524b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ u f3525c;

    public t(u this$1, AutoCompleteTextView autoCompleteTextView) {
        this.f3525c = this$1;
        this.f3524b = autoCompleteTextView;
    }

    @Override // java.lang.Runnable
    public void run() {
        TextWatcher textWatcher;
        AutoCompleteTextView autoCompleteTextView = this.f3524b;
        textWatcher = this.f3525c.f3526a.f3538d;
        autoCompleteTextView.removeTextChangedListener(textWatcher);
    }
}
