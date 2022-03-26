package e1;

import android.graphics.Typeface;
import com.google.android.material.chip.Chip;
import n1.i;

/* JADX WARN: Classes with same name are omitted:
  
 */
/* loaded from: classes.dex */
public class a extends i {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Chip f1809a;

    public a(Chip this$0) {
        this.f1809a = this$0;
    }

    @Override // n1.i
    public void b(Typeface typeface, boolean fontResolvedSynchronously) {
        e eVar;
        CharSequence charSequence;
        e eVar2;
        Chip chip = this.f1809a;
        eVar = chip.f1318e;
        if (eVar.F2()) {
            eVar2 = this.f1809a.f1318e;
            charSequence = eVar2.a1();
        } else {
            charSequence = this.f1809a.getText();
        }
        chip.setText(charSequence);
        this.f1809a.requestLayout();
        this.f1809a.invalidate();
    }

    @Override // n1.i
    public void a(int reason) {
    }
}
