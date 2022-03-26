package androidx.appcompat.widget;

import android.content.Context;
import android.view.View;
import com.example.helloworld.R;
import h.c0;
import h.q;

/* JADX WARN: Classes with same name are omitted:
  
 */
/* loaded from: classes.dex */
public class o extends c0 {

    /* renamed from: m  reason: collision with root package name */
    public final /* synthetic */ q f469m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(q qVar, Context context, q menu, View anchorView, boolean overflowOnly) {
        super(context, menu, anchorView, overflowOnly, R.attr.actionOverflowMenuStyle);
        this.f469m = qVar;
        h(8388613);
        j(qVar.f497y);
    }

    @Override // h.c0
    public void e() {
        q qVar;
        q qVar2;
        qVar = this.f469m.f2067d;
        if (qVar != null) {
            qVar2 = this.f469m.f2067d;
            qVar2.close();
        }
        this.f469m.f493u = null;
        super.e();
    }
}
