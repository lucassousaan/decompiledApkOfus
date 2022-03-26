package n1;

import android.graphics.Typeface;
import l1.d;

/* JADX WARN: Classes with same name are omitted:
  
 */
/* loaded from: classes.dex */
public final class b extends i {

    /* renamed from: a  reason: collision with root package name */
    public final Typeface f2559a;

    /* renamed from: b  reason: collision with root package name */
    public final a f2560b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f2561c;

    public b(a applyFont, Typeface fallbackFont) {
        this.f2559a = fallbackFont;
        this.f2560b = applyFont;
    }

    @Override // n1.i
    public void b(Typeface font, boolean fontResolvedSynchronously) {
        d(font);
    }

    @Override // n1.i
    public void a(int reason) {
        d(this.f2559a);
    }

    public void c() {
        this.f2561c = true;
    }

    public final void d(Typeface updatedFont) {
        if (!this.f2561c) {
            ((d) this.f2560b).a(updatedFont);
        }
    }
}
