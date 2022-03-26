package androidx.appcompat.widget;

import android.view.View;
import g.c;

/* JADX WARN: Classes with same name are omitted:
  
 */
/* loaded from: classes.dex */
public class d implements View.OnClickListener {

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ c f280b;

    public d(ActionBarContextView this$0, c cVar) {
        this.f280b = cVar;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View v2) {
        this.f280b.c();
    }
}
