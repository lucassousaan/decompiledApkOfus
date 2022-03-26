package w;

import android.graphics.Typeface;

/* JADX WARN: Classes with same name are omitted:
  
 */
/* loaded from: classes.dex */
public class f implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Typeface f3641b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ h f3642c;

    public f(h this$0, Typeface typeface) {
        this.f3642c = this$0;
        this.f3641b = typeface;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f3642c.e(this.f3641b);
    }
}
