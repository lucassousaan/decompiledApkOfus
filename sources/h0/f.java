package h0;

import android.content.ClipDescription;
import android.net.Uri;
import android.view.inputmethod.InputContentInfo;

/* JADX WARN: Classes with same name are omitted:
  
 */
/* loaded from: classes.dex */
public final class f implements g {

    /* renamed from: a  reason: collision with root package name */
    public final InputContentInfo f2217a;

    public f(Object inputContentInfo) {
        this.f2217a = (InputContentInfo) inputContentInfo;
    }

    public Uri c() {
        return this.f2217a.getContentUri();
    }

    public ClipDescription d() {
        return this.f2217a.getDescription();
    }

    public Uri e() {
        return this.f2217a.getLinkUri();
    }

    @Override // h0.g
    public Object b() {
        return this.f2217a;
    }

    @Override // h0.g
    public void a() {
        this.f2217a.requestPermission();
    }
}
