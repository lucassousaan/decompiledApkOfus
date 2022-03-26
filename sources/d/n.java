package d;

import a.b;
import android.content.Context;

/* JADX WARN: Classes with same name are omitted:
  
 */
/* loaded from: classes.dex */
public class n implements b {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ o f1681a;

    public n(o this$0) {
        this.f1681a = this$0;
    }

    @Override // a.b
    public void a(Context context) {
        q delegate = this.f1681a.x();
        delegate.n();
        delegate.q(this.f1681a.b().a("androidx:appcompat"));
    }
}
