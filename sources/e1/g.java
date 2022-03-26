package e1;

import android.widget.CompoundButton;
import com.google.android.material.chip.ChipGroup;
import java.util.List;

/* JADX WARN: Classes with same name are omitted:
  
 */
/* loaded from: classes.dex */
public class g implements CompoundButton.OnCheckedChangeListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ ChipGroup f1839a;

    public g(ChipGroup chipGroup) {
        this.f1839a = chipGroup;
    }

    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
        boolean z2;
        int i2;
        int i3;
        int i4;
        boolean z3;
        int i5;
        boolean z4;
        z2 = this.f1839a.f1343n;
        if (!z2) {
            List<Integer> checkedChipIds = this.f1839a.getCheckedChipIds();
            if (checkedChipIds.isEmpty()) {
                z4 = this.f1839a.f1338i;
                if (z4) {
                    this.f1839a.r(buttonView.getId(), true);
                    this.f1839a.q(buttonView.getId(), false);
                    return;
                }
            }
            int id = buttonView.getId();
            if (isChecked) {
                i3 = this.f1839a.f1342m;
                if (i3 != -1) {
                    i4 = this.f1839a.f1342m;
                    if (i4 != id) {
                        z3 = this.f1839a.f1337h;
                        if (z3) {
                            ChipGroup chipGroup = this.f1839a;
                            i5 = chipGroup.f1342m;
                            chipGroup.r(i5, false);
                        }
                    }
                }
                this.f1839a.setCheckedId(id);
                return;
            }
            i2 = this.f1839a.f1342m;
            if (i2 == id) {
                this.f1839a.setCheckedId(-1);
            }
        }
    }
}
