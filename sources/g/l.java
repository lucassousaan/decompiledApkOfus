package g;

import android.view.View;
import f0.i1;
import f0.j1;

/* JADX WARN: Classes with same name are omitted:
  
 */
/* loaded from: classes.dex */
public class l extends j1 {

    /* renamed from: a  reason: collision with root package name */
    public boolean f1994a = false;

    /* renamed from: b  reason: collision with root package name */
    public int f1995b = 0;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ m f1996c;

    public l(m this$0) {
        this.f1996c = this$0;
    }

    @Override // f0.j1, f0.i1
    public void b(View view) {
        if (!this.f1994a) {
            this.f1994a = true;
            i1 i1Var = this.f1996c.f2000d;
            if (i1Var != null) {
                i1Var.b(null);
            }
        }
    }

    public void d() {
        this.f1995b = 0;
        this.f1994a = false;
        this.f1996c.b();
    }

    @Override // f0.i1
    public void a(View view) {
        int i2 = this.f1995b + 1;
        this.f1995b = i2;
        if (i2 == this.f1996c.f1997a.size()) {
            i1 i1Var = this.f1996c.f2000d;
            if (i1Var != null) {
                i1Var.a(null);
            }
            d();
        }
    }
}
