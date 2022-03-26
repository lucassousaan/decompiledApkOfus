package f0;

import android.content.ClipData;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;

/* JADX WARN: Classes with same name are omitted:
  
 */
/* loaded from: classes.dex */
public final class f {

    /* renamed from: a  reason: collision with root package name */
    public final h f1863a;

    public f(ClipData clip, int source) {
        if (Build.VERSION.SDK_INT >= 31) {
            this.f1863a = new g(clip, source);
        } else {
            this.f1863a = new i(clip, source);
        }
    }

    public f c(int flags) {
        this.f1863a.d(flags);
        return this;
    }

    public f d(Uri linkUri) {
        this.f1863a.b(linkUri);
        return this;
    }

    public f b(Bundle extras) {
        this.f1863a.a(extras);
        return this;
    }

    public m a() {
        return this.f1863a.c();
    }
}
