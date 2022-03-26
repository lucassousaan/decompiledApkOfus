package f0;

import android.content.ClipData;
import android.net.Uri;
import android.os.Bundle;
import android.view.ContentInfo;

/* JADX WARN: Classes with same name are omitted:
  
 */
/* loaded from: classes.dex */
public final class g implements h {

    /* renamed from: a  reason: collision with root package name */
    public final ContentInfo.Builder f1866a;

    public g(ClipData clip, int source) {
        this.f1866a = new ContentInfo.Builder(clip, source);
    }

    @Override // f0.h
    public void d(int flags) {
        this.f1866a.setFlags(flags);
    }

    @Override // f0.h
    public void b(Uri linkUri) {
        this.f1866a.setLinkUri(linkUri);
    }

    @Override // f0.h
    public void a(Bundle extras) {
        this.f1866a.setExtras(extras);
    }

    @Override // f0.h
    public m c() {
        return new m(new j(this.f1866a.build()));
    }
}
