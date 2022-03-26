package f0;

import android.content.ClipData;
import android.view.ContentInfo;
import e0.h;

/* JADX WARN: Classes with same name are omitted:
  
 */
/* loaded from: classes.dex */
public final class j implements k {

    /* renamed from: a  reason: collision with root package name */
    public final ContentInfo f1878a;

    public j(ContentInfo wrapped) {
        h.e(wrapped);
        this.f1878a = wrapped;
    }

    @Override // f0.k
    public ContentInfo d() {
        return this.f1878a;
    }

    @Override // f0.k
    public ClipData b() {
        return this.f1878a.getClip();
    }

    @Override // f0.k
    public int a() {
        return this.f1878a.getSource();
    }

    @Override // f0.k
    public int c() {
        return this.f1878a.getFlags();
    }

    public String toString() {
        return "ContentInfoCompat{" + this.f1878a + "}";
    }
}
