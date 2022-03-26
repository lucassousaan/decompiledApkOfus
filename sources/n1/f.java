package n1;

import android.graphics.Typeface;
import android.text.TextPaint;

/* JADX WARN: Classes with same name are omitted:
  
 */
/* loaded from: classes.dex */
public class f extends i {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ TextPaint f2564a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ i f2565b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ g f2566c;

    public f(g this$0, TextPaint textPaint, i iVar) {
        this.f2566c = this$0;
        this.f2564a = textPaint;
        this.f2565b = iVar;
    }

    @Override // n1.i
    public void b(Typeface typeface, boolean fontResolvedSynchronously) {
        this.f2566c.l(this.f2564a, typeface);
        this.f2565b.b(typeface, fontResolvedSynchronously);
    }

    @Override // n1.i
    public void a(int i2) {
        this.f2565b.a(i2);
    }
}
