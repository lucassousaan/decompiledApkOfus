package c0;

import android.graphics.Typeface;

/* JADX WARN: Classes with same name are omitted:
  
 */
/* loaded from: classes.dex */
public class a implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ p f1193b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ Typeface f1194c;

    public a(c this$0, p pVar, Typeface typeface) {
        this.f1193b = pVar;
        this.f1194c = typeface;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f1193b.b(this.f1194c);
    }
}
