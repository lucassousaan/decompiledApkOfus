package f0;

import android.view.ContentInfo;
import android.view.OnReceiveContentListener;
import android.view.View;
import i0.u;

/* JADX WARN: Classes with same name are omitted:
  
 */
/* loaded from: classes.dex */
public final class z0 implements OnReceiveContentListener {

    /* renamed from: a  reason: collision with root package name */
    public final b0 f1938a;

    public z0(b0 jetpackListener) {
        this.f1938a = jetpackListener;
    }

    public ContentInfo onReceiveContent(View view, ContentInfo platPayload) {
        m payload = m.g(platPayload);
        m result = ((u) this.f1938a).b(view, payload);
        if (result == null) {
            return null;
        }
        if (result == payload) {
            return platPayload;
        }
        return result.f();
    }
}
