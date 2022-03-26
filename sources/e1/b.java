package e1;

import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;
import com.google.android.material.chip.Chip;

/* JADX WARN: Classes with same name are omitted:
  
 */
/* loaded from: classes.dex */
public class b extends ViewOutlineProvider {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Chip f1810a;

    public b(Chip this$0) {
        this.f1810a = this$0;
    }

    @Override // android.view.ViewOutlineProvider
    public void getOutline(View view, Outline outline) {
        e eVar;
        e eVar2;
        eVar = this.f1810a.f1318e;
        if (eVar != null) {
            eVar2 = this.f1810a.f1318e;
            eVar2.getOutline(outline);
            return;
        }
        outline.setAlpha(0.0f);
    }
}
