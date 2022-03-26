package c0;

import android.graphics.Typeface;
import android.os.Handler;

/* JADX WARN: Classes with same name are omitted:
  
 */
/* loaded from: classes.dex */
public class c {

    /* renamed from: a  reason: collision with root package name */
    public final p f1197a;

    /* renamed from: b  reason: collision with root package name */
    public final Handler f1198b;

    public c(p callback, Handler callbackHandler) {
        this.f1197a = callback;
        this.f1198b = callbackHandler;
    }

    public final void c(Typeface typeface) {
        p callback = this.f1197a;
        this.f1198b.post(new a(this, callback, typeface));
    }

    public final void a(int reason) {
        p callback = this.f1197a;
        this.f1198b.post(new b(this, callback, reason));
    }

    public void b(l typefaceResult) {
        if (typefaceResult.a()) {
            c(typefaceResult.f1216a);
        } else {
            a(typefaceResult.f1217b);
        }
    }
}
