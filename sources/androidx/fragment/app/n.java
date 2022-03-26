package androidx.fragment.app;

import android.content.Context;
import b0.c;

/* JADX WARN: Classes with same name are omitted:
  
 */
/* loaded from: classes.dex */
public class n extends o {

    /* renamed from: c  reason: collision with root package name */
    public boolean f863c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f864d = false;

    /* renamed from: e  reason: collision with root package name */
    public k0 f865e;

    public n(s2 operation, c signal, boolean isPop) {
        super(operation, signal);
        this.f863c = isPop;
    }

    public k0 e(Context context) {
        if (this.f864d) {
            return this.f865e;
        }
        k0 b2 = m0.b(context, b().f(), b().e() == r2.VISIBLE, this.f863c);
        this.f865e = b2;
        this.f864d = true;
        return b2;
    }
}
