package b1;

import com.google.android.material.button.MaterialButton;
import com.google.android.material.button.MaterialButtonToggleGroup;

/* JADX WARN: Classes with same name are omitted:
  
 */
/* loaded from: classes.dex */
public class h implements a {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ MaterialButtonToggleGroup f1160a;

    public h(MaterialButtonToggleGroup materialButtonToggleGroup) {
        this.f1160a = materialButtonToggleGroup;
    }

    public /* synthetic */ h(MaterialButtonToggleGroup x02, f x1) {
        this(x02);
    }

    public void a(MaterialButton button, boolean isChecked) {
        boolean z2;
        boolean z3;
        boolean buttonCheckedStateChanged;
        z2 = this.f1160a.f1310h;
        if (!z2) {
            z3 = this.f1160a.f1311i;
            if (z3) {
                this.f1160a.f1313k = isChecked ? button.getId() : -1;
            }
            buttonCheckedStateChanged = this.f1160a.u(button.getId(), isChecked);
            if (buttonCheckedStateChanged) {
                this.f1160a.l(button.getId(), button.isChecked());
            }
            this.f1160a.invalidate();
        }
    }
}
