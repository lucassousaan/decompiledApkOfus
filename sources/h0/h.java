package h0;

import android.content.ClipDescription;
import android.net.Uri;

/* JADX WARN: Classes with same name are omitted:
  
 */
/* loaded from: classes.dex */
public final class h {

    /* renamed from: a  reason: collision with root package name */
    public final g f2218a;

    public h(g impl) {
        this.f2218a = impl;
    }

    public Uri a() {
        return ((f) this.f2218a).c();
    }

    public ClipDescription b() {
        return ((f) this.f2218a).d();
    }

    public Uri c() {
        return ((f) this.f2218a).e();
    }

    public static h f(Object inputContentInfo) {
        if (inputContentInfo == null) {
            return null;
        }
        return new h(new f(inputContentInfo));
    }

    public Object e() {
        return this.f2218a.b();
    }

    public void d() {
        this.f2218a.a();
    }
}
