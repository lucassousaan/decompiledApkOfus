package b1;

import com.google.android.material.button.MaterialButton;
import com.google.android.material.button.MaterialButtonToggleGroup;
import java.util.Comparator;

/* JADX WARN: Classes with same name are omitted:
  
 */
/* loaded from: classes.dex */
public class f implements Comparator {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ MaterialButtonToggleGroup f1158a;

    public f(MaterialButtonToggleGroup this$0) {
        this.f1158a = this$0;
    }

    /* renamed from: a */
    public int compare(MaterialButton v1, MaterialButton v2) {
        int checked = Boolean.valueOf(v1.isChecked()).compareTo(Boolean.valueOf(v2.isChecked()));
        if (checked != 0) {
            return checked;
        }
        int stateful = Boolean.valueOf(v1.isPressed()).compareTo(Boolean.valueOf(v2.isPressed()));
        if (stateful != 0) {
            return stateful;
        }
        return Integer.valueOf(this.f1158a.indexOfChild(v1)).compareTo(Integer.valueOf(this.f1158a.indexOfChild(v2)));
    }
}
