package s1;

import android.text.Editable;
import android.view.accessibility.AccessibilityManager;
import android.widget.AutoCompleteTextView;

/* JADX WARN: Classes with same name are omitted:
  
 */
/* loaded from: classes.dex */
public class p extends l1.p {

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ z f3518b;

    public p(z this$0) {
        this.f3518b = this$0;
    }

    @Override // l1.p, android.text.TextWatcher
    public void afterTextChanged(Editable s2) {
        AutoCompleteTextView editText;
        AccessibilityManager accessibilityManager;
        boolean D;
        editText = z.y(this.f3518b.f3453a.getEditText());
        accessibilityManager = this.f3518b.f3548n;
        if (accessibilityManager.isTouchExplorationEnabled()) {
            D = z.D(editText);
            if (D && !this.f3518b.f3455c.hasFocus()) {
                editText.dismissDropDown();
            }
        }
        editText.post(new n(this, editText));
    }
}
