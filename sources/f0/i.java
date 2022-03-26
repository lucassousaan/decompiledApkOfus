package f0;

import android.content.ClipData;
import android.net.Uri;
import android.os.Bundle;

/* JADX WARN: Classes with same name are omitted:
  
 */
/* loaded from: classes.dex */
public final class i implements h {

    /* renamed from: a  reason: collision with root package name */
    public ClipData f1873a;

    /* renamed from: b  reason: collision with root package name */
    public int f1874b;

    /* renamed from: c  reason: collision with root package name */
    public int f1875c;

    /* renamed from: d  reason: collision with root package name */
    public Uri f1876d;

    /* renamed from: e  reason: collision with root package name */
    public Bundle f1877e;

    public i(ClipData clip, int source) {
        this.f1873a = clip;
        this.f1874b = source;
    }

    @Override // f0.h
    public void d(int flags) {
        this.f1875c = flags;
    }

    @Override // f0.h
    public void b(Uri linkUri) {
        this.f1876d = linkUri;
    }

    @Override // f0.h
    public void a(Bundle extras) {
        this.f1877e = extras;
    }

    @Override // f0.h
    public m c() {
        return new m(new l(this));
    }
}
