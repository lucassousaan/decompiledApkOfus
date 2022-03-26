package s1;

import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.widget.AutoCompleteTextView;
import android.widget.Spinner;
import com.google.android.material.textfield.TextInputLayout;
import g0.f;

/* JADX WARN: Classes with same name are omitted:
  
 */
/* loaded from: classes.dex */
public class r extends q0 {

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ z f3522e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(z this$0, TextInputLayout layout) {
        super(layout);
        this.f3522e = this$0;
    }

    @Override // s1.q0, f0.b
    public void g(View host, f info) {
        boolean D;
        super.g(host, info);
        D = z.D(this.f3522e.f3453a.getEditText());
        if (!D) {
            info.W(Spinner.class.getName());
        }
        if (info.J()) {
            info.g0(null);
        }
    }

    @Override // f0.b
    public void h(View host, AccessibilityEvent event) {
        AutoCompleteTextView editText;
        AccessibilityManager accessibilityManager;
        boolean D;
        super.h(host, event);
        editText = z.y(this.f3522e.f3453a.getEditText());
        if (event.getEventType() == 1) {
            accessibilityManager = this.f3522e.f3548n;
            if (accessibilityManager.isTouchExplorationEnabled()) {
                D = z.D(this.f3522e.f3453a.getEditText());
                if (!D) {
                    this.f3522e.H(editText);
                }
            }
        }
    }
}
