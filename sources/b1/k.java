package b1;

import com.google.android.material.button.MaterialButton;
import com.google.android.material.button.MaterialButtonToggleGroup;

/* JADX WARN: Classes with same name are omitted:
  
 */
/* loaded from: classes.dex */
public class k implements b {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ MaterialButtonToggleGroup f1166a;

    public k(MaterialButtonToggleGroup materialButtonToggleGroup) {
        this.f1166a = materialButtonToggleGroup;
    }

    public /* synthetic */ k(MaterialButtonToggleGroup x02, f x1) {
        this(x02);
    }

    public void a(MaterialButton button, boolean isPressed) {
        this.f1166a.invalidate();
    }
}
