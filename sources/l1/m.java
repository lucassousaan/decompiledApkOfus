package l1;

import android.graphics.Typeface;
import e1.e;
import java.lang.ref.WeakReference;
import n1.i;

/* JADX WARN: Classes with same name are omitted:
  
 */
/* loaded from: classes.dex */
public class m extends i {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ o f2455a;

    public m(o this$0) {
        this.f2455a = this$0;
    }

    @Override // n1.i
    public void b(Typeface typeface, boolean fontResolvedSynchronously) {
        WeakReference weakReference;
        if (!fontResolvedSynchronously) {
            this.f2455a.f2459d = true;
            weakReference = this.f2455a.f2460e;
            n textDrawableDelegate = (n) weakReference.get();
            if (textDrawableDelegate != null) {
                ((e) textDrawableDelegate).q1();
            }
        }
    }

    @Override // n1.i
    public void a(int reason) {
        WeakReference weakReference;
        this.f2455a.f2459d = true;
        weakReference = this.f2455a.f2460e;
        n textDrawableDelegate = (n) weakReference.get();
        if (textDrawableDelegate != null) {
            ((e) textDrawableDelegate).q1();
        }
    }
}
