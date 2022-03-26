package x;

import android.graphics.Typeface;
import c0.p;
import w.h;

/* JADX WARN: Classes with same name are omitted:
  
 */
/* loaded from: classes.dex */
public class c extends p {

    /* renamed from: a  reason: collision with root package name */
    public h f3672a;

    public c(h fontCallback) {
        this.f3672a = fontCallback;
    }

    @Override // c0.p
    public void b(Typeface typeface) {
        h hVar = this.f3672a;
        if (hVar != null) {
            hVar.e(typeface);
        }
    }

    @Override // c0.p
    public void a(int reason) {
        h hVar = this.f3672a;
        if (hVar != null) {
            hVar.d(reason);
        }
    }
}
