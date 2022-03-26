package n1;

import android.graphics.Typeface;
import w.h;

/* JADX WARN: Classes with same name are omitted:
  
 */
/* loaded from: classes.dex */
public class e extends h {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ i f2562a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ g f2563b;

    public e(g this$0, i iVar) {
        this.f2563b = this$0;
        this.f2562a = iVar;
    }

    @Override // w.h
    public void e(Typeface typeface) {
        Typeface typeface2;
        g gVar = this.f2563b;
        gVar.f2580n = Typeface.create(typeface, gVar.f2570d);
        this.f2563b.f2579m = true;
        i iVar = this.f2562a;
        typeface2 = this.f2563b.f2580n;
        iVar.b(typeface2, false);
    }

    @Override // w.h
    public void d(int reason) {
        this.f2563b.f2579m = true;
        this.f2562a.a(reason);
    }
}
