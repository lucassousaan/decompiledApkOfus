package f0;

import android.view.ContentInfo;
import android.view.View;

/* JADX WARN: Classes with same name are omitted:
  
 */
/* loaded from: classes.dex */
public abstract class y0 {
    public static void c(View view, String[] mimeTypes, b0 listener) {
        if (listener == null) {
            view.setOnReceiveContentListener(mimeTypes, null);
        } else {
            view.setOnReceiveContentListener(mimeTypes, new z0(listener));
        }
    }

    public static String[] a(View view) {
        return view.getReceiveContentMimeTypes();
    }

    public static m b(View view, m payload) {
        ContentInfo platPayload = payload.f();
        ContentInfo platResult = view.performReceiveContent(platPayload);
        if (platResult == null) {
            return null;
        }
        if (platResult == platPayload) {
            return payload;
        }
        return m.g(platResult);
    }
}
